package com.management.product.view;

import com.management.product.model.dto.UserDTO;
import com.management.product.model.dto.WorkOutLogDTO;

import java.util.List;

public class WorkOutPrint {
    public void printAllWorkOutList(List<WorkOutLogDTO> allWorkOutList) {
        System.out.println("==== 전체 운동 기록 조회 결과 ====");
        for (WorkOutLogDTO workOut : allWorkOutList) {
            System.out.println(workOut);
        }
        System.out.println("+++++++++++++++++++++++++++++++");
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insertWorkOutLog":
                successMessage = "운동 기록을 입력하였습니다.";
                break;
            case "updateWorkOutLog":
                successMessage = "운동 기록을 수정하였습니다.";
                break;
            case "deleteWorkOutLog":
                successMessage = "운동 기록을 삭제하였습니다.";
                break;
        }
        System.out.println(successMessage);
        System.out.println("===============================");
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "insertWorkOutLog":
                errorMessage = "운동 기록을 입력 실패하였습니다.";
                break;
            case "selectAllWorkOutList":
                errorMessage = "운동 기록 조회를 실패하였습니다.";
                break;
            case "selectUserInfo":
                errorMessage = "신체 정보 조회를 실패하였습니다.";
                break;
            case "updateWorkOutLog":
                errorMessage = "운동 기록 수정을 실패하였습니다.";
                break;
            case "deleteWorkOutLog":
                errorMessage = "운동 기록 삭제를 실패하였습니다.";
                break;

        }
        System.out.println(errorMessage);
        System.out.println("===============================");
    }

    public void printUserInfo(List<UserDTO> userinfoList) {
        System.out.println("==== 신체 정보 조회 결과 ====");
        for (UserDTO userInfo : userinfoList) {
            System.out.println(userInfo);
        }
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}



