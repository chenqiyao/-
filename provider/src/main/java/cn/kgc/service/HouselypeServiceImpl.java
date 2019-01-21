package cn.kgc.service;

import cn.kgc.mapper.HouselypeMapper;
import cn.kgc.vo.Houselype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
@Service
public class HouselypeServiceImpl implements HouselypeService{
    @Autowired
    private HouselypeMapper houselypeMapper;

    @Override
    public List<Map<String, Object>> selectHouselype() {
        return houselypeMapper.selectAll();
    }

    @Override
    public Integer insertHouselypr(Houselype houselype) {
        return houselypeMapper.addHouselype(houselype);
    }
}
