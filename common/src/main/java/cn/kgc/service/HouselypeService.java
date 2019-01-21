package cn.kgc.service;

import cn.kgc.vo.Houselype;

import java.util.List;
import java.util.Map;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
public interface HouselypeService {
    //查全部
    List<Map<String,Object>> selectHouselype();
    //添加
    Integer insertHouselypr(Houselype houselype);
}
