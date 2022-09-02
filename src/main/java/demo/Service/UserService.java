package demo.Service;

import demo.entity.User;
import demo.entity.Vote;
import demo.util.ScannerSingleton;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: 名字
 * @date: 2022/9/1  22:38
 */
public class UserService {

    public User create(ArrayList<User> userArray) {
        Scanner scanner = ScannerSingleton.getInstance();
        System.out.println("输入你的用户名");
        String username = scanner.next();
        System.out.println("输入你的密码");
        String password = scanner.next();
        User user = new User(username, password);


        if (userArray.size() == 0) {
            System.out.println("系统没有用户");
            System.out.println("开始注册用户");
            userArray.add(user);
            System.out.println("注册成功");
        } else {
            for (User x : userArray) {
                if ((x.getUsername() == username) && (x.getPassword() == password)) {
                    System.out.println("系统登录成功");
                }
            }

        }

        return user;
    }

    public void findUser(ArrayList<User> userArray){
        Scanner scanner = ScannerSingleton.getInstance();
        String username = scanner.next();


        for (User x :
                userArray) {
            if (x.getUsername().equals(username)){
                System.out.println(x.toString());
            }
        }

    }




    public void findVoter(ArrayList<Vote> voteArray){
        System.out.println("竞选者有");
        int f = 1;
        for (Vote vote : voteArray) {
            System.out.println(1+"."+vote.getName());
        }
    }

    public void findsomeoneVoter(ArrayList<Vote> voteArray,User user){
        Scanner scanner = ScannerSingleton.getInstance();
        findVoter(voteArray);
        System.out.println("开始你的选择");
        String votename = scanner.next();



        user.setCount(1);
        user.setVote(votename);

    }



}
