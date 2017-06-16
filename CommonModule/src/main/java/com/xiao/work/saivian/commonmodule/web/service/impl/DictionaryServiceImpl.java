package com.xiao.work.saivian.commonmodule.web.service.impl;

import com.xiao.work.saivian.commonmodule.core.generic.GenericDao;
import com.xiao.work.saivian.commonmodule.core.generic.GenericServiceLevelImpl;
import com.xiao.work.saivian.commonmodule.web.dao.DictionaryMapper;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.Dictionary;
import com.xiao.work.saivian.commonmodule.web.domain.pojo.DictionaryExample;
import com.xiao.work.saivian.commonmodule.web.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DictionaryServiceImpl extends GenericServiceLevelImpl<Dictionary, Long, DictionaryExample> implements DictionaryService {


    @Autowired
    private DictionaryMapper dictionaryDao;

    private  DictionaryExample dictionaryExample=new DictionaryExample();

    @Override
    public GenericDao<Dictionary, Long, DictionaryExample> getDao() {
        return dictionaryDao;
    }


    public DictionaryExample getModelExample() {
        return dictionaryExample;
    }

    @Override
    public DictionaryExample getModelExamplTidEqualTo(Long tid) {
        DictionaryExample dictionaryExample = new DictionaryExample();
        dictionaryExample.createCriteria().andTidEqualTo(tid);
        return dictionaryExample;
    }

    @Override
    public byte getLevel(Dictionary dictionary) {

        return dictionary.getDictionaryLevel();
    }

    @Override
    public Long getTid(Dictionary dictionary) {
        return dictionary.getTid();
    }

    @Override
    public void setLevel(Dictionary dictionary, Byte level) {
        dictionary.setDictionaryLevel(level);
    }

    @Override
    public void setTid(Dictionary dictionary) {
        dictionary.setTid(0L);
    }



}
