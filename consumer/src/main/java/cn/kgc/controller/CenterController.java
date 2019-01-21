package cn.kgc.controller;

import cn.kgc.service.HouseinfoService;
import cn.kgc.service.HouselypeService;
import cn.kgc.vo.Houseinfo;
import cn.kgc.vo.Houselype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
@RestController
public class CenterController {
    @Autowired
    private HouselypeService houselypeService;
    @Autowired
    private HouseinfoService houseinfoService;

    @RequestMapping("/selectAll.do")
    public List<Map<String,Object>> selectAll(){
        return houseinfoService.selectHouseinfo();
    }

    @RequestMapping("/insertAll.do")
    public Integer insertAll(Houseinfo houseinfo){
        System.out.println(houseinfo);
        return houseinfoService.insertHouseinfo(houseinfo);
    }

    @RequestMapping("/show.do")
    public List<Map<String,Object>> show(){
        return houselypeService.selectHouselype();
    }

    @RequestMapping("/add.do")
    public Integer add(Houselype houselype){
        System.out.println(houselype);
        return houselypeService.insertHouselypr(houselype);
    }
}
