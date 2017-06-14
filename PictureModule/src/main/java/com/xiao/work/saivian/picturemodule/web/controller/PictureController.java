package com.xiao.work.saivian.picturemodule.web.controller;


import com.xiao.mb.commonmodule.core.common.ResultData;
import com.xiao.mb.commonmodule.core.generic.GenericController;
import com.xiao.mb.picturemodule.web.domain.pojo.Picture;
import com.xiao.mb.picturemodule.web.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/comment_picture")
public class PictureController extends GenericController {
    @Autowired
    private PictureService pictureService;

    /**
        * 添加图片
        *
        * @param picture
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Picture picture){

        try {
            pictureService.insert(picture);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
     * 通过id获取图片地址
     * @param pictureId
     * @return
     */
    @ResponseBody
    @RequestMapping(value="getById" ,method = RequestMethod.GET)
    public String getById(Long pictureId){

       return pictureService.selectById(pictureId).getPictureAddress();
    }
    /**
    * 删除图片
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
            pictureService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改图片
    * @param picture
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(Picture picture){
        try {
            pictureService.update(picture);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有图片
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(pictureService.findAll(currentPage,limit));
    }

}