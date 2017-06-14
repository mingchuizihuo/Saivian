package com.xiao.work.saivian.picturemodule.web.dao;

import com.xiao.work.saivian.commonmodule.core.generic.GenericDao;
import com.xiao.work.saivian.picturemodule.web.domain.pojo.Picture;
import com.xiao.work.saivian.picturemodule.web.domain.pojo.PictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper extends GenericDao {
    int countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}