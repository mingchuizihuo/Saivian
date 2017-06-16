package com.xiao.work.saivian.commonmodule.core.util.utilObject;

import java.util.Map;

/**
 * Created by xiao on 2017/1/12.
 */
public class DataTableIsNull {
    private String objectName;
    private Map<String,Boolean> fileld;

    @Override
    public String toString() {
        return "DataTableIsNull{" +
                "objectName='" + objectName + '\'' +
                ", fileld=" + fileld +
                '}';
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Map<String, Boolean> getFileld() {
        return fileld;
    }

    public void setFileld(Map<String, Boolean> fileld) {
        this.fileld = fileld;
    }
}
