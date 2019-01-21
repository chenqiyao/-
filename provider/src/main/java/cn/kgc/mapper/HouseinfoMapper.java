package cn.kgc.mapper;

import cn.kgc.vo.Houseinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
public interface HouseinfoMapper {

    @Select("select i.*,t.typeName from houseinfo i,houselype t where i.typeId=t.typeId")
    List<Map<String,Object>> selectAll();

    @Insert("insert into houseinfo(houseDesc,typeId,monthlyRent,publishDate) values(#{houseDesc},#{typeId},#{monthlyRent},#{publishDate},now()")
    Integer addHouseinfo(Houseinfo houseinfo);
}
