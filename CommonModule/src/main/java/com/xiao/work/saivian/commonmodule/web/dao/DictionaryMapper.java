package com.xiao.work.saivian.commonmodule.web.dao;


import com.xiao.work.saivian.commonmodule.core.generic.GenericDao;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.Dictionary;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.DictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictionaryMapper extends GenericDao {
    int countByExample(DictionaryExample example);

    int deleteByExample(DictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    List<Dictionary> selectByExample(DictionaryExample example);

    Dictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}