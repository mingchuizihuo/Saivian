package com.xiao.work.saivian.commonmodule.web.domain.pojo;

public class Dictionary {
    private Long id;

    private String dictionaryName;

    private String dictionaryValue;

    private Byte dictionaryLevel;

    private Long tid;

    private String tidpath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName == null ? null : dictionaryName.trim();
    }

    public String getDictionaryValue() {
        return dictionaryValue;
    }

    public void setDictionaryValue(String dictionaryValue) {
        this.dictionaryValue = dictionaryValue == null ? null : dictionaryValue.trim();
    }

    public Byte getDictionaryLevel() {
        return dictionaryLevel;
    }

    public void setDictionaryLevel(Byte dictionaryLevel) {
        this.dictionaryLevel = dictionaryLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTidpath() {
        return tidpath;
    }

    public void setTidpath(String tidpath) {
        this.tidpath = tidpath == null ? null : tidpath.trim();
    }
}