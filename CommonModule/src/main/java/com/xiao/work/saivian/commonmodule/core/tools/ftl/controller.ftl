package ${packageName};

import com.xiao.work.saivian.commonmodule.core.common.ResultData;
import  com.xiao.work.saivian.commonmodule.core.generic.GenericBaseController;
import ${modelpackageName}.${className};
import ${modelpackageName}.${className}Example;
import ${ImplpackageName};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("platform/${urlName?lower_case}")
public class ${className}Controller extends GenericBaseController<${className},${className}Example> {
    @Autowired
    private ${className}Service ${className?lower_case}Service;
    @Override
    public GenericService getGenericService() {
        return ${className?lower_case}Service;
    }


}