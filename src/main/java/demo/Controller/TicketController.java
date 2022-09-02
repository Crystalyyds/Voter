package demo.Controller;

import demo.Service.ManageService;
import demo.entity.User;
import demo.entity.Vote;
import demo.util.ScannerSingleton;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: ticketController
 * @Description: TODO
 * @author: 名字
 * @date: 2022/9/2  15:54
 */
public class TicketController {
    Scanner scanner = ScannerSingleton.getInstance();
    public void ticker(ManageService manageService, ArrayList<Vote> voteArray, ArrayList<User> userArray){
        int c;
        do {
            System.out.println("------------------分界---------------------");
            System.out.println("------------------分界---------------------");
            System.out.println("*********1.票数*******");
            System.out.println("*********2,排名*******");
            System.out.println("*********3,百分比*******");
            System.out.println("*********0,退出功能   *******");
            System.out.println("确定功能");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    manageService.votenum(voteArray, userArray);
                    break;
                case 2:
                    manageService.Rank(voteArray);
                    break;
                case 3:
                    manageService.Rank(voteArray);
                    break;
                case 0:
                    System.out.println("退出票的信息");
                    break;
            }
        }while (c!=0);
    }
}
