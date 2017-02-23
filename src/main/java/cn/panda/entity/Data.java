package cn.panda.entity;

/**
 * Created by lingj on 2017/2/23 0023.
 */
public class Data {

    Data1 data;
    Boolean status;

    //toString
    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                ", status=" + status +
                '}';
    }

    //getter and setter

    public Data1 getData() {
        return data;
    }

    public void setData(Data1 data) {
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
