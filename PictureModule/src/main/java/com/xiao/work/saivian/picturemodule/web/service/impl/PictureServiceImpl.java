package com.xiao.work.saivian.picturemodule.web.service.impl;


import com.xiao.work.saivian.picturemodule.web.dao.PictureMapper;
import com.xiao.work.saivian.picturemodule.web.domain.pojo.Picture;
import com.xiao.work.saivian.picturemodule.web.domain.pojo.PictureExample;
import com.xiao.work.saivian.picturemodule.web.service.PictureService;
import com.xiao.work.saivian.commonmodule.core.generic.GenericDao;
import com.xiao.work.saivian.commonmodule.core.generic.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PictureServiceImpl extends GenericServiceImpl<Picture, Long,PictureExample> implements PictureService {
    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public GenericDao<Picture, Long,PictureExample> getDao() {
        return pictureMapper;
    }

    @Override
    public Long[] insertPictures(String pictures,byte pictureType) {
        Long[] pictureIds = new Long[pictures.split(",").length];
       if(pictures.split(",").length>0){
           int i=0;
           for (String pictureName:pictures.split(",")
                ) {
               Picture commentPicture = new Picture();
               commentPicture.setPictureType(pictureType);
               commentPicture.setPictureAddress(pictureName);
               if(pictureMapper.insert(commentPicture)!=0){
                   pictureIds[i]=commentPicture.getId();
                   i++;
               }
           }
       }
        return  pictureIds;
    }
}
