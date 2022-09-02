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

/**
 * @ClassName: MajorCroller
 * @Description: TODO
 * @author: 名字
 * @date: 2022/9/2  10:25
 */
public class MajorController {
    ArrayList<Manage> manageArray = new ArrayList<>();
    ArrayList<User> userArray = new ArrayList<>();
    ArrayList<Vote> voteArray = new ArrayList<>();

    ManageService manageService = new ManageService();

    UserService userService = new UserService();

    VoteService voteService = new VoteService();

    Scanner scanner = ScannerSingleton.getInstance();
    public void majorCrotroller(){
        int dang;

        do {
            System.out.println("**********************************");
            System.out.println("******        1.用户登录      ******");
            System.out.println("******        2.竞选登录      ******");
            System.out.println("******        3.管理登录      ******");
            System.out.println("******        0.退出         ******");
            System.out.println("***********************************");
            System.out.println("选择用户种类");
            dang = scanner.nextInt();
            switch (dang) {
                case 1:

                    User user= userService.create(userArray);
                    UserController userController = new UserController();
                    userController.nune(user, userArray, voteArray);
                    break;
                case 2:

                    Vote vote = voteService.create(voteArray);
                    VoteController voteController = new VoteController();
                    voteController.menu( vote,voteArray);
                    break;
                case 3:

                    Manage manage = manageService.create(manageArray);
                    ManageController manageController = new ManageController();
                    manageController.nune( voteArray,  userArray,  manage, userService, voteService,  manageService);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n error");
                    System.out.println("功能指令没有正确输入");
                    break;
            }
        }while (dang!=0);
    }
}
