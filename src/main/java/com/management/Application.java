package com.management;

import com.management.product.view.WorkOutMenu;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        do {
            System.out.println("==== WORK OUT PLAN ====");
            System.out.println("운동 기록 관리 프로그램 접속");
            System.out.println("=======================");
            System.out.println("1. 운동 기록 관리");
            System.out.println("0. 프로그램 종료");
            System.out.println("=======================");

            Scanner sc = new Scanner(System.in);
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1:
                    new WorkOutMenu().mainMenu();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해 주세요");
                    break;
            }
        } while (true);

    }
}
