package com.xiao.work.saivian.commonmodule.web.overall;


import com.xiao.work.saivian.commonmodule.core.util.utilObject.DataTableIsNull;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.Dictionary;
import com.xiao.work.saivian.commonmodule.web.service.impl.DictionaryServiceImpl;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xiao on 2017/1/12.
 */

public class Situation {

    private static DictionaryServiceImpl dictionaryService;
    public static Map<Long,Dictionary> dictionaryMap;
    public static Map<String,DataTableIsNull> dataTableIsNullMap;



    public static void getDataTableIsNullMap(){
        List<File> fileList = getFileList("classpath:sqlfile" );

    }
    public static void main(String[] args){
        Situation ss = new Situation();

        URL s = ClassLoader.getSystemResource("");
        List<File> fileList = getFileList(s.toString()+"sqlfile" );
    }
    public static List<File> getFileList(String strPath) {

        List<File> fileList = new ArrayList<>();
        File dir = new File(strPath);
        File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) { // 判断是文件还是文件夹
                    getFileList(files[i].getAbsolutePath()); // 获取文件绝对路径
                } else if (fileName.endsWith("sql")) { // 判断文件名是否以.avi结尾
                    String strFileName = files[i].getAbsolutePath();
                    fileList.add(files[i]);
                } else {
                    continue;
                }
            }

        }
        return fileList;
    }


}
