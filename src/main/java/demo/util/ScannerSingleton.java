package demo.util;

import java.util.Scanner;

/**
 * @ClassName: ScannerSingleton
 * @Description: TODO
 * @author: 名字
 * @date: 2022/9/2  18:16
 */
public class ScannerSingleton {
    private static Scanner scanner;

    private ScannerSingleton() {
    }

    public static Scanner getInstance() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
