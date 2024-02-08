package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.controller.Controller;
import com.management.product.model.dto.WorkOutLogDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorkOutMenu {

    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        do {
            System.out.println("===== Work Out Plan ====");
            System.out.println("= 운동 기록 관리 화면 입니다. =");
            System.out.println("========================");
            System.out.println("0. 신체 정보 조회");
            System.out.println("1.전체 운동 기록 조회");
            System.out.println("2.조건부 기록 조회");
            System.out.println("3.오늘 운동 기록");
            System.out.println("4.운동 기록 수정");
            System.out.println("5.운동 기록 삭제");
            System.out.println("9.프로그램 종료");
            System.out.println("========================");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 0:
                    controller.selectUserInfo();
                    break;
                case 1:
                    controller.selectAllWorkOutList();
                    break;
                case 2:
                    controller.selectConditionWorkOutList(inputSearchCondition());
                    break;
                case 3:
                    controller.insertWorkOutLog(inputInsert());
                    break;
                case 4:
                    controller.updateWorkOutLog(inputUpdateInsert());
                case 5:
                    controller.deleteWorkOutLog(inputLogCode());
                case 9:
                    return;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    break;
            }
        } while (true);
    }

    private static Map<String, Integer> inputLogCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제하실 기록의 기록코드를 입력하세요 : ");
        int logCode = sc.nextInt();
        Map<String, Integer> parameter = new HashMap<>();
        parameter.put("logCode", logCode);

        return parameter;
    }

    private static WorkOutLogDTO inputUpdateInsert() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("수정할 기록 정보를 입력하세요");
        System.out.println("수정을 원하지 않는 정보는 SKIP 을 입력해주세요.");
        System.out.println("---------------------");
        System.out.println("수정하실 기록의 기록코드를 입력하세요 : ");
        int logCode = sc.nextInt();
        sc.nextLine();

        WorkOutLogDTO workOutLogDTO = new WorkOutLogDTO();
        workOutLogDTO.setLogCode(logCode);

        getLogInfo(workOutLogDTO);


        System.out.println("===================");
        return workOutLogDTO;
    }

    private static SearchCondition inputSearchCondition() {
        Scanner sc = new Scanner(System.in);
        String searchOption = "";
        String searchValue = "";

        System.out.println("===========================");
        System.out.println("조회 하실 조건을 선택하세요.");
        System.out.println("1.날짜 별 조회 ");
        System.out.println("2.부위 별 조회 ");
        System.out.println("3.운동여부 별 조회 ");
        System.out.println("9.상위 메뉴로 이동");
        int no = sc.nextInt();
        sc.nextLine();
        switch (no) {
            case 1:
                searchOption = "workoutDate";
                System.out.println("조회할 날짜를 입력해주세요 (20240105) :");
                searchValue = sc.nextLine();
                break;
            case 2:
                searchOption = "categoryPart";
                System.out.println("조회할 부위를 입력해주세요 (등 어깨 이두 삼두 가슴 하체) : ");
                searchValue = sc.nextLine();
                break;
            case 3:
                searchOption = "workoutStatus";
                System.out.println("조회할 운동여부 (Y or N) : ");
                searchValue = sc.nextLine();
                break;

            case 9:
                System.out.println("상위 메뉴로 이동합니다.");
                return null;
            default:
                System.out.println("잘못된 입력입니다. 다시입력하세요.");
                break;

        }
        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setOption(searchOption);
        searchCondition.setValue(searchValue);
        return searchCondition;
    }

    private static WorkOutLogDTO inputInsert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 기록할 정보를 입력하세요 ====");
        WorkOutLogDTO workOutLogDTO = new WorkOutLogDTO();
        getLogInfo(workOutLogDTO);
        System.out.println("=================================");
        return workOutLogDTO;
    }

    private static WorkOutLogDTO getLogInfo(WorkOutLogDTO workOutLogDTO) {
        Scanner sc = new Scanner(System.in);

        System.out.println("운동 여부를 입력하세요 (Y or N) :  ");
        String workoutStatus = sc.nextLine();
        System.out.println("운동하신 날짜를 입력해주세요 (2024-02-08)");
        String workoutDate = sc.nextLine();
        System.out.println("세트 수를 입력하세요 : ");
        String workoutSet = sc.nextLine();

        System.out.println("한 세트당 중량을 드는 횟수를 입력하세요 : ");
        String workoutCount = sc.nextLine();

        System.out.println("1회 최대 중량을 입력하세요 : ");
        String maxWeight = sc.nextLine();

        System.out.println("운동 종류 코드를 입력하세요 : ");
        int categoryCode = sc.nextInt();

        System.out.println("유저 코드를 입력하세요 : ");
        int userCode = sc.nextInt();

        workOutLogDTO.setWorkoutStatus(workoutStatus.toUpperCase());
        workOutLogDTO.setWorkoutDate(workoutDate.replace("-", ""));
        workOutLogDTO.setWorkoutSet(workoutSet);
        workOutLogDTO.setWorkoutCount(workoutCount);
        workOutLogDTO.setMaxWeight(maxWeight);
        workOutLogDTO.setCategoryCode(categoryCode);
        workOutLogDTO.setUserCode(userCode);

        return workOutLogDTO;
    }
}
