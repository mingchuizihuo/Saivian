package com.xiao.work.saivian.commonmodule.core.util.utilObject;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert implements Converter<String, Date> {
  
    @Override  
    public Date convert(String stringDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {  
            return simpleDateFormat.parse(stringDate);  
        } catch (Exception e) {
            e.printStackTrace();  
        }  
        return null;  
    }  
  
}  