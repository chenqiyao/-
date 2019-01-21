package cn.kgc.vo;

import java.io.Serializable;

/**
 * Created by 陈齐尧 on 2019/1/20.
 */
public class Houseinfo implements Serializable{
    private Integer houseId;
    private String houseDesc;
    //引入对象
    private Houselype houselype;
    private Integer monthlyRent;
    private String publishDate;

    public Houseinfo() {
    }

    public Houseinfo(Integer houseId, String houseDesc, Houselype houselype, Integer monthlyRent, String publishDate) {
        this.houseId = houseId;
        this.houseDesc = houseDesc;
        this.houselype = houselype;
        this.monthlyRent = monthlyRent;
        this.publishDate = publishDate;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    public Houselype getHouselype() {
        return houselype;
    }

    public void setHouselype(Houselype houselype) {
        this.houselype = houselype;
    }

    public Integer getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Integer monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Houseinfo{" +
                "houseId=" + houseId +
                ", houseDesc='" + houseDesc + '\'' +
                ", houselype=" + houselype +
                ", monthlyRent=" + monthlyRent +
                ", publishDate='" + publishDate + '\'' +
                '}';
    }
}
