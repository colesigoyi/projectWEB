package user;

import java.io.Serializable;
import java.util.Objects;

/**
 * @program: projectWEB
 * @author: TaoXueFeng
 * @create: 2019-08-16 20:22
 * @desc:
 **/

public class User implements Serializable {
    private String name;
    private String pass;

    public User() {
    }

    public User( String name, String pass) {

        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pass);
    }
}

