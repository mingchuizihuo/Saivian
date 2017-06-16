package generate;


import com.xiao.work.saivian.commonmodule.core.tools.GenerateController;
import com.xiao.work.saivian.commonmodule.core.tools.GenerateService;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * Created by xiao on 2017/1/12.
 */
public class DoMain {

    public static void main(String[] args) throws IOException, TemplateException {

        String[] fileNamesService = new String[]{
                "SaivianRemember"
        };
        for (String fileName : fileNamesService
                ) {
            GenerateService.Generate(
                    "\\CommonModule\\src\\main\\java\\com\\xiao\\work\\saivian\\commonmodule\\core\\tools\\ftl",
                    "service.ftl",
                    fileName,
                    "\\ReceiptModule\\src\\main\\java\\com\\xiao\\work\\saivian\\receipt\\web\\service",

                    "com.xiao.work.saivian.receipt.web.service",
                    "com.xiao.work.saivian.receipt.web.dao",
                    "com.xiao.work.saivian.receipt.web.domain.pojo"
            );
        }

        String[] fileNames = new String[]{


                "SaivianRemember,赛比安会员"


        };
        for (String fileName : fileNames) {


            try {

                GenerateController.Generate(
                        "\\CommonModule\\src\\main\\java\\com\\xiao\\work\\saivian\\commonmodule\\core\\tools\\ftl",
                        "controller.ftl",
                        fileName,
                        "\\ReceiptModule\\src\\main\\java\\com\\xiao\\work\\saivian\\receipt\\web\\controller",

                        "com.xiao.work.saivian.receipt.web.controller",
                        "com.xiao.work.saivian.receipt.web.domain.pojo",
                        "com.xiao.work.saivian.receipt.web.service"
//
                );
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        }


    }


}
