package cn.panda.entity;

import java.util.List;

/**
 * Created by lingj on 2017/2/23 0023.
 */
public class Data1 {

    List<ProxyIp> data;
    Integer num;
    String sign;

    //toString
    @Override
    public String toString() {
        return "Data1{" +
                "data=" + data +
                ", num=" + num +
                ", sign='" + sign + '\'' +
                '}';
    }

    //getter and setter
    public List<ProxyIp> getData() {
        return data;
    }

    public void setData(List<ProxyIp> data) {
        this.data = data;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
