package demo.Service;

import demo.entity.Manage;
import demo.entity.User;
import demo.entity.Vote;
import demo.util.ScannerSingleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName: CreateManage
 * @Description: TODO
 * @author: 名字
 * @date: 2022/9/1  22:20
 */
public class ManageService {

    public Manage create(ArrayList<Manage> manageArray) {
        Scanner scanner = ScannerSingleton.getInstance();
        System.out.println("输入你的用户名");
        String username = scanner.next();
        System.out.println("输入你的密码");
        String password = scanner.next();

        Manage manager = new Manage(username,password);
        if (manageArray.size() == 0) {
            System.out.println("系统没有用户");
            System.out.println("开始注册用户");
            manageArray.add(manager);
            System.out.println("注册成功");
        } else {
            for (Manage manage : manageArray) {
                if ((manage.getManuser().equals(manager.getManuser())) && (manage.getPassword().equals(manager.getPassword()))) {
                    System.out.println("系统登录成功");
                    return manage;
                }
            }
        }

        return manager;
    }

    public void showVote(ArrayList<Vote> voteArray, String name){
        for (Vote vote : voteArray) {
            if (vote.getName()==name){
                System.out.println(vote.toString());
            }
        }
    }

    public void showAll(ArrayList<Vote> voteArray){
        int dang = 1;
        for (Vote vote : voteArray) {
            System.out.println(dang+"."+vote.toString());
        }
    }

    public void changeTime(ArrayList<Vote> voteArray){
        showAll(voteArray);
        System.out.println("输入修改人信息");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Vote vote : voteArray) {
            if (vote.getName()==name){
                System.out.println(vote.getName()+"的初始时间是"+vote.getTime());
                System.out.println("现在开始修改,输入修改时间");
                String time = scanner.next();
                vote.setTime(time);
                System.out.println("修改成功");
            }
        }
    }

    //统计票数
    public void votenum(ArrayList<Vote> voteArray, ArrayList<User> userArray){
        for (User x :
                userArray) {
            for (Vote y :
                    voteArray) {
                if (x.getVote() == y.getName()) {
                    y.setNum(y.getNum()+1);
                }
            }
        }
    }

    //排名
    public void Rank(ArrayList<Vote> voteArray){
        Set<Vote> set = new HashSet<>();
        for (Vote x :
                voteArray) {
            set.add(x);
        }
        int dang = 1;
        for (Vote x :
                voteArray) {
            System.out.println("第"+dang+"名是"+x.getName());
        }
    }
    //百分比
    public void percentage(ArrayList<Vote> voteArray,ArrayList<User> userArray){
        for (Vote x :
                voteArray) {
            double ls = x.getNum();
            int dang = 1;
            System.out.println(dang+"."+(ls/userArray.size()));
        }
    }

    public void showinformation(ArrayList<User> userArray,String username){
        for (User user : userArray) {
            if (user.getUsername().equals(username)){
                System.out.println("已查到该用户，该用户信息是");
                System.out.println(user.getUsername()+"电话是"+user.getNumber());

            }
        }
    }

}
