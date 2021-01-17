package com.ldp.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;


public class UserBean {

    private Integer id;

    private String userName;

    private Cat cat;

    private String[] favorites;

    private List<Cat> cats;

    private Map<String,Object> map;

    private Properties props;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String[] getFavorites() {
        return favorites;
    }

    public void setFavorites(String[] favorites) {
        this.favorites = favorites;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    public void say(){
        System.out.println("say ..... ");
    }

    public UserBean(){
        System.out.println("UserBean 无参构造器执行了...");
    }

    public UserBean(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
