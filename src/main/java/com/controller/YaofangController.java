

















package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 药方
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yaofang")
public class YaofangController {
    private static final Logger logger = LoggerFactory.getLogger(YaofangController.class);

    @Autowired
    private YaofangService yaofangService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private BingliService bingliService;

    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private YishengService yishengService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("医生".equals(role))
            params.put("yishengId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = yaofangService.queryPage(params);

        //字典表数据转换
        List<YaofangView> list =(List<YaofangView>)page.getList();
        for(YaofangView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YaofangEntity yaofang = yaofangService.selectById(id);
        if(yaofang !=null){
            //entity转view
            YaofangView view = new YaofangView();
            BeanUtils.copyProperties( yaofang , view );//把实体数据重构到view中

                //级联表
                BingliEntity bingli = bingliService.selectById(yaofang.getBingliId());
                if(bingli != null){
                    BeanUtils.copyProperties( bingli , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setBingliId(bingli.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YaofangEntity yaofang, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yaofang:{}",this.getClass().getName(),yaofang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");

        Wrapper<YaofangEntity> queryWrapper = new EntityWrapper<YaofangEntity>()
            .eq("bingli_id", yaofang.getBingliId())
            .eq("yaofang_uuid_number", yaofang.getYaofangUuidNumber())
            .eq("yaofang_name", yaofang.getYaofangName())
            .eq("yaofang_types", yaofang.getYaofangTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YaofangEntity yaofangEntity = yaofangService.selectOne(queryWrapper);
        if(yaofangEntity==null){
            yaofang.setInsertTime(new Date());
            yaofang.setCreateTime(new Date());
            yaofangService.insert(yaofang);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YaofangEntity yaofang, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yaofang:{}",this.getClass().getName(),yaofang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<YaofangEntity> queryWrapper = new EntityWrapper<YaofangEntity>()
            .notIn("id",yaofang.getId())
            .andNew()
            .eq("bingli_id", yaofang.getBingliId())
            .eq("yaofang_uuid_number", yaofang.getYaofangUuidNumber())
            .eq("yaofang_name", yaofang.getYaofangName())
            .eq("yaofang_types", yaofang.getYaofangTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YaofangEntity yaofangEntity = yaofangService.selectOne(queryWrapper);
        if("".equals(yaofang.getBingliFile()) || "null".equals(yaofang.getBingliFile())){
                yaofang.setBingliFile(null);
        }
        if(yaofangEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      yaofang.set
            //  }
            yaofangService.updateById(yaofang);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yaofangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<YaofangEntity> yaofangList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            YaofangEntity yaofangEntity = new YaofangEntity();
//                            yaofangEntity.setBingliId(Integer.valueOf(data.get(0)));   //病例 要改的
//                            yaofangEntity.setYaofangUuidNumber(data.get(0));                    //药方编号 要改的
//                            yaofangEntity.setYaofangName(data.get(0));                    //药方名称 要改的
//                            yaofangEntity.setYaofangTypes(Integer.valueOf(data.get(0)));   //药方类型 要改的
//                            yaofangEntity.setBingliFile(data.get(0));                    //药方详情 要改的
//                            yaofangEntity.setBingliContent("");//照片
//                            yaofangEntity.setInsertTime(date);//时间
//                            yaofangEntity.setCreateTime(date);//时间
                            yaofangList.add(yaofangEntity);


                            //把要查询是否重复的字段放入map中
                                //药方编号
                                if(seachFields.containsKey("yaofangUuidNumber")){
                                    List<String> yaofangUuidNumber = seachFields.get("yaofangUuidNumber");
                                    yaofangUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> yaofangUuidNumber = new ArrayList<>();
                                    yaofangUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("yaofangUuidNumber",yaofangUuidNumber);
                                }
                        }

                        //查询是否重复
                         //药方编号
                        List<YaofangEntity> yaofangEntities_yaofangUuidNumber = yaofangService.selectList(new EntityWrapper<YaofangEntity>().in("yaofang_uuid_number", seachFields.get("yaofangUuidNumber")));
                        if(yaofangEntities_yaofangUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YaofangEntity s:yaofangEntities_yaofangUuidNumber){
                                repeatFields.add(s.getYaofangUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [药方编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        yaofangService.insertBatch(yaofangList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = yaofangService.queryPage(params);

        //字典表数据转换
        List<YaofangView> list =(List<YaofangView>)page.getList();
        for(YaofangView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YaofangEntity yaofang = yaofangService.selectById(id);
            if(yaofang !=null){


                //entity转view
                YaofangView view = new YaofangView();
                BeanUtils.copyProperties( yaofang , view );//把实体数据重构到view中

                //级联表
                    BingliEntity bingli = bingliService.selectById(yaofang.getBingliId());
                if(bingli != null){
                    BeanUtils.copyProperties( bingli , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setBingliId(bingli.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody YaofangEntity yaofang, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,yaofang:{}",this.getClass().getName(),yaofang.toString());
        Wrapper<YaofangEntity> queryWrapper = new EntityWrapper<YaofangEntity>()
            .eq("bingli_id", yaofang.getBingliId())
            .eq("yaofang_uuid_number", yaofang.getYaofangUuidNumber())
            .eq("yaofang_name", yaofang.getYaofangName())
            .eq("yaofang_types", yaofang.getYaofangTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YaofangEntity yaofangEntity = yaofangService.selectOne(queryWrapper);
        if(yaofangEntity==null){
            yaofang.setInsertTime(new Date());
            yaofang.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      yaofang.set
        //  }
        yaofangService.insert(yaofang);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
