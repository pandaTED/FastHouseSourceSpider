package cn.panda.entity;

/**
 * Created by lingj on 2017/2/23 0023.
 */
public class ProxyIp {
    String ip;
    Integer port;
    String country;
    Integer speed;
    Integer connectionScore;
    Integer availbelScore;


    //toString
    @Override
    public String toString() {
        return "ProxyIp{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", country='" + country + '\'' +
                ", speed=" + speed +
                ", connectionScore=" + connectionScore +
                ", availbelScore=" + availbelScore +
                '}';
    }


    //setter and getter

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getConnectionScore() {
        return connectionScore;
    }

    public void setConnectionScore(Integer connectionScore) {
        this.connectionScore = connectionScore;
    }

    public Integer getAvailbelScore() {
        return availbelScore;
    }

    public void setAvailbelScore(Integer availbelScore) {
        this.availbelScore = availbelScore;
    }
}
