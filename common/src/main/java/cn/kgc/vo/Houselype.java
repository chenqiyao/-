package cn.kgc.vo;

import java.io.Serializable;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
public class Houselype implements Serializable{

    private Integer typeId;
    private String typeName;

    public Houselype() {
    }

    public Houselype(Integer typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Houselype{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
