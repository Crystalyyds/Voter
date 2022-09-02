package demo.entity;

import java.util.Objects;


public class User {
    private String username;
    private String password;
    private String Vote;
    private int count;

    private String number;

    public User() {
    }


    public User(String username,String password){
        this.username = username;
        this.password = password;
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

    public String getVote() {
        return Vote;
    }

    public void setVote(String vote) {
        Vote = vote;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User(String username, String password, String vote, int count, String number) {
        this.username = username;
        this.password = password;
        Vote = vote;
        this.count = count;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return count == user.count && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(Vote, user.Vote) && Objects.equals(number, user.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, Vote, count, number);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Vote='" + Vote + '\'' +
                ", count=" + count +
                ", number='" + number + '\'' +
                '}';
    }
}
