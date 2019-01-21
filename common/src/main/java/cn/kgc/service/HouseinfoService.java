package cn.kgc.service;

import cn.kgc.vo.Houseinfo;

import java.util.List;
import java.util.Map;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
public interface HouseinfoService {
    //查全部
    List<Map<String,Object>> selectHouseinfo();
    //添加
    Integer insertHouseinfo(Houseinfo houseinfo);
}
