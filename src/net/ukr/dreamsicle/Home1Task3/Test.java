package net.ukr.dreamsicle.Home1Task3;

import java.io.Serializable;

/**
 * Created by Yura on 24.04.2017.
 */
//@interface Save {}

public class Test implements Serializable{
     public String name;
     public String username;
     private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
