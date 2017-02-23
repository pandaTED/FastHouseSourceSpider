package cn.panda.entity;

import java.util.Date;

/**
 * Created by lingj on 2017/2/23 0023.
 */
public class House {

        Long id;
        String hashstr; //hash值，通过
        String onlyId;
        String newOnlyId;
        String title;
        String villageName;
        String price;
        String mprice;
        String housrType;
        String area;
        String floor;
        String allFloor;
        String propertyType;
        String propertyYear;
        String buildType;
        String buildYear;
        String cityArea;
        String smallArea;
        String address;
        String phone;
        String contact;
        String description;
        String publishTime;
        String updateTime;
        Date addTime;


        //toString
    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", hashstr='" + hashstr + '\'' +
                ", onlyId='" + onlyId + '\'' +
                ", newOnlyId='" + newOnlyId + '\'' +
                ", title='" + title + '\'' +
                ", villageName='" + villageName + '\'' +
                ", price='" + price + '\'' +
                ", mprice='" + mprice + '\'' +
                ", housrType='" + housrType + '\'' +
                ", area='" + area + '\'' +
                ", floor='" + floor + '\'' +
                ", allFloor='" + allFloor + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", propertyYear='" + propertyYear + '\'' +
                ", buildType='" + buildType + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", cityArea='" + cityArea + '\'' +
                ", smallArea='" + smallArea + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", contact='" + contact + '\'' +
                ", description='" + description + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", addTime=" + addTime +
                '}';
    }

    //getter  and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHashstr() {
        return hashstr;
    }

    public void setHashstr(String hashstr) {
        this.hashstr = hashstr;
    }

    public String getOnlyId() {
        return onlyId;
    }

    public void setOnlyId(String onlyId) {
        this.onlyId = onlyId;
    }

    public String getNewOnlyId() {
        return newOnlyId;
    }

    public void setNewOnlyId(String newOnlyId) {
        this.newOnlyId = newOnlyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMprice() {
        return mprice;
    }

    public void setMprice(String mprice) {
        this.mprice = mprice;
    }

    public String getHousrType() {
        return housrType;
    }

    public void setHousrType(String housrType) {
        this.housrType = housrType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAllFloor() {
        return allFloor;
    }

    public void setAllFloor(String allFloor) {
        this.allFloor = allFloor;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyYear() {
        return propertyYear;
    }

    public void setPropertyYear(String propertyYear) {
        this.propertyYear = propertyYear;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getCityArea() {
        return cityArea;
    }

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public String getSmallArea() {
        return smallArea;
    }

    public void setSmallArea(String smallArea) {
        this.smallArea = smallArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
