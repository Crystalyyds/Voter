package demo.entity;

import java.util.Objects;

/**
 * @ClassName: Manage
 * @Description: TODO
 * @author: 名字
 * @date: 2022/9/1  21:33
 */
public class Manage {
    private String manuser;
    private String password;

    public Manage(String manuser, String password) {
        this.manuser = manuser;
        this.password = password;
    }

    public Manage() {
    }

    public String getManuser() {
        return manuser;
    }

    public void setManuser(String manuser) {
        this.manuser = manuser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manage manage = (Manage) o;
        return Objects.equals(manuser, manage.manuser) && Objects.equals(password, manage.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manuser, password);
    }

    @Override
    public String toString() {
        return "Manage{" +
                "manuser='" + manuser + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
