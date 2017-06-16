package com.xiao.work.saivian.commonmodule.core.common;

import java.util.List;

/**
 * Created by xiao on 2017/1/18.
 */
public class MyPage<T> {
    private Long total;
    private List<T> resultList;

    @Override
    public String toString() {
        return "MyPage{" +
                "total=" + total +
                ", resultList=" + resultList +
                '}';
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }
}
