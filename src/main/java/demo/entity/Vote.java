package demo.entity;


import java.util.Objects;

public class Vote {
    private String name;
    private String introduce;
    private int num;
    private String time;

    public Vote(String name, String introduce, int num, String time) {
        this.name = name;
        this.introduce = introduce;
        this.num = num;
        this.time = time;
    }
    public Vote(String name){
        this.name = name;
    }


    public Vote() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                ", num=" + num +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return num == vote.num && Objects.equals(name, vote.name) && Objects.equals(introduce, vote.introduce) && Objects.equals(time, vote.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, introduce, num, time);
    }
}
