package com.xiao.work.saivian.picturemodule.web.service;


import com.xiao.mb.commonmodule.core.generic.GenericService;
import com.xiao.mb.picturemodule.web.domain.pojo.Picture;
import com.xiao.mb.picturemodule.web.domain.pojo.PictureExample;

public interface PictureService extends GenericService<Picture,Long,PictureExample> {

    public Long[] insertPictures(String pictures, byte pictureType);

}
