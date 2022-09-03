package demo.Controller;

import demo.Service.ManageService;
import demo.Service.UserService;
import demo.Service.VoteService;
import demo.entity.Manage;
import demo.entity.User;
import demo.entity.Vote;
import demo.util.ScannerSingleton;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageController {
    Scanner scanner = ScannerSingleton.getInstance();
    public void nune(ArrayList<Vote> voteArray, ArrayList<User> userArray, Manage manager, UserService userService, VoteService voteService, ManageService manageService) {
        int l;
        do {
            System.out.println("------------------分界---------------------");
            System.out.println("------------------分界---------------------");
            System.out.println("*********1.查询用户名信息      *******");
            System.out.println("*********2.查询竞选者信息      *******");
            System.out.println("*********3,修改权限           *******");
            System.out.println("*********4,票的信息           *******");
            System.out.println("*********0,退出功能           *******");
            System.out.println("确定功能");
            l= scanner.nextInt();
            switch (l){
                case 1:
                    userService.findUser(userArray);
                    break;
                case 2 :
                    manageService.showAll(voteArray);
                    break;
                case 3 :
                    manageService.changeTime(voteArray);
                    break;
                case 4 :
                    TicketController ticketController = new TicketController();
                    ticketController.ticker(manageService,  voteArray, userArray);
                    break;
                case 0 :
                    System.out.println("管理退出");
                    break;
            }
        }while (l != 0);
    }
}
