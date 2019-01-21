package cn.kgc.service;

import cn.kgc.mapper.HouseinfoMapper;
import cn.kgc.vo.Houseinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
@Service
public class HouseinfoServiceImpl implements HouseinfoService{
    @Autowired
    private HouseinfoMapper houseinfoMapper;

    @Override
    public List<Map<String, Object>> selectHouseinfo() {
        return houseinfoMapper.selectAll();
    }

    @Override
    public Integer insertHouseinfo(Houseinfo houseinfo) {
        return houseinfoMapper.addHouseinfo(houseinfo);
    }
}
