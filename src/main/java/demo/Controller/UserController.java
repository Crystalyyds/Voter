package demo.Controller;

import demo.Service.UserService;
import demo.entity.User;
import demo.entity.Vote;
import demo.util.ScannerSingleton;

import java.util.ArrayList;
import java.util.Scanner;


public class UserController {
    Scanner scanner1 = ScannerSingleton.getInstance();
    public void nune(User user,ArrayList<User> userArray,ArrayList<Vote> voteArray){
        int b;
        do {

            UserService userService = new UserService();
            System.out.println("------------------分界---------------------");
            System.out.println("------------------分界---------------------");
            System.out.println("*********1.查询投票情况*******");
            System.out.println("*********2,搜索参选对象*******");
            System.out.println("*********3,投票      *******");
            System.out.println("*********0,退出功能   *******");
            System.out.println("确定功能");
            b = scanner1.nextInt();
            switch (b){
                case 1:
                    System.out.println(user.toString());
                    break;
                case 2 :
                    userService.findVoter(voteArray);
                    break;
                case 3 :
                    userService.findsomeoneVoter(voteArray,user);
                    break;
                case 0 :
                    break;
            }
        }while (b!=0);
    }
}
