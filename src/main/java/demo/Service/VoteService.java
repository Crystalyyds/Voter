package demo.Service;

import demo.entity.Vote;
import demo.util.ScannerSingleton;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: CreateVote
 * @Description: TODO
 * @author: 名字
 * @date: 2022/9/1  22:22
 */
public class VoteService{
    public Vote create(ArrayList<Vote> voteArray) {
        Scanner scanner = ScannerSingleton.getInstance();
        System.out.println("输入你的用户名");
        String username = scanner.next();
        Vote vote = new Vote(username);

        if (voteArray.size() == 0) {
            System.out.println("系统没有用户");
            System.out.println("开始注册用户");
            voteArray.add(vote);
            System.out.println("注册成功");
        } else {
            for (Vote x : voteArray) {
                if (vote.getName() == username) {
                    System.out.println("系统登录成功");
                }else {
                    System.out.println("没有该用户");
                }
            }
        }

        return vote;
    }

    public void setownTime(Vote vote){
        System.out.println("发布你的竞选时间");
        Scanner scanner = ScannerSingleton.getInstance();
        String time = scanner.next();
        vote.setTime(time);
        System.out.println("发布时间修改完毕");

    }


    public Vote zhuche(String username){
        return new Vote(username);
    }

}
