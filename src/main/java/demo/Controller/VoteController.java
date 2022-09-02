package demo.Controller;

import demo.Service.VoteService;
import demo.entity.Vote;
import demo.util.ScannerSingleton;

import java.util.ArrayList;
import java.util.Scanner;

public class VoteController {
    Scanner scanner = ScannerSingleton.getInstance();
    public void menu(Vote vote, ArrayList<Vote> voteArray){
        int b;
        do {
            VoteService voteService = new VoteService();
            System.out.println("------------------分界---------------------");
            System.out.println("------------------分界---------------------");
            System.out.println("*********1,竞选登录*******");
            System.out.println("*********2,竞选注册*******");
            System.out.println("*********0,退出功能*******");
            System.out.println("确定功能");
            b = scanner.nextInt();
            switch (b){
                case 1:
                    voteService.create(voteArray);
                    break;
                case 2 :
                    System.out.println("输入你的注册用户名");
                    String name = scanner.next();
                    Vote vote1 = voteService.zhuche(name);
                    voteArray.add(vote1);
                    voteService.create(voteArray);
                    break;
                case 0 :
                    break;
            }

        }while (b!=0);
    }
}
