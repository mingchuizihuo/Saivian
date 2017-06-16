package com.xiao.work.saivian.commonmodule.web.service.impl;


import com.xiao.work.saivian.commonmodule.core.generic.GenericDao;
import com.xiao.work.saivian.commonmodule.core.generic.GenericServiceImpl;
import com.xiao.work.saivian.commonmodule.web.dao.OrganizationMapper;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.Organization;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.OrganizationExample;
import com.xiao.work.saivian.commonmodule.web.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrganizationServiceImpl extends GenericServiceImpl<Organization, Long,OrganizationExample> implements OrganizationService {

       @Autowired
       private OrganizationMapper organizationDao;
       @Override
       public GenericDao<Organization, Long,OrganizationExample> getDao() {
       return organizationDao;
       }

       public OrganizationExample getModelExample() {
        return new OrganizationExample();
       }


}
