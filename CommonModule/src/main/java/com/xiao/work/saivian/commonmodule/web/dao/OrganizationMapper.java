package com.xiao.work.saivian.commonmodule.web.dao;

import com.xiao.work.saivian.commonmodule.core.generic.GenericDao;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.Organization;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.OrganizationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrganizationMapper extends GenericDao {
    int countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Organization record);

    int insertSelective(Organization record);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}