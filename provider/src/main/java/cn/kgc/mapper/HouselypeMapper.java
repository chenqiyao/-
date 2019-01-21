package cn.kgc.mapper;

import cn.kgc.vo.Houselype;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
public interface HouselypeMapper {
    @Select("select * from houselype")
    List<Map<String,Object>> selectAll();

    @Insert("insert into houselype(typeName) values(#{typeName})")
    Integer addHouselype(Houselype houselype);
}
