package com.xiao.work.saivian.commonmodule.core.generic;

import com.xiao.work.saivian.commonmodule.core.common.ResultData;
import com.xiao.work.saivian.commonmodule.web.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by 10238 on 2016/11/11.
 */
public abstract class GenericBaseController<Model,ModelExample> extends GenericController{
   public abstract GenericService getGenericService();

    @Autowired
    private DictionaryService dictionaryService;

    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Model model) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        try {
            model = (Model) getGenericService().insert(model);

        }catch (Exception e){
            System.out.println(e);
            return ResultData.build().addError();
        }
        return ResultData.build().put("orderId",model.getClass().getMethod("getId").invoke(model));

    }

    @ResponseBody
    @RequestMapping(value = "findOne",method = RequestMethod.GET)
    public ResultData findOne(Long id){

        return ResultData.build().parseBean(getGenericService().selectById(id));
    }




    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
            getGenericService().delete(id);
        } catch (Exception e) {
            return ResultData.build().error();
        }
        return ResultData.build();

    }

    @ResponseBody
    @RequestMapping(value = "dels", method = RequestMethod.POST)
    public ResultData del(String ids) {
        try {
            String[] idsArray = ids.split(",");
            for (String id : idsArray) {
                getGenericService().delete(Long.parseLong(id));
            }

        } catch (Exception e) {
            return ResultData.build().error();
        }
        return ResultData.build();

    }

    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(Model older){
        try {
            getGenericService().update(older);

        } catch (Exception e){
            return ResultData.build().error();
        }
        return ResultData.build();
    }




}
