package com.management.product.controller;

import com.common.SearchCondition;
import com.management.product.model.dto.UserDTO;
import com.management.product.model.dto.WorkOutLogDTO;
import com.management.product.model.service.WorOutService;
import com.management.product.view.WorkOutPrint;

import java.util.List;
import java.util.Map;

public class Controller {
    private WorOutService workOutService;
    private WorkOutPrint workOutPrint;

    public Controller() {
        workOutService = new WorOutService();
        workOutPrint = new WorkOutPrint();
    }

    public void selectUserInfo() {
        List<UserDTO> userinfoList = workOutService.selectUserInfo();
        if (userinfoList != null && !userinfoList.isEmpty()) {
            workOutPrint.printUserInfo(userinfoList);
        } else {
            workOutPrint.printErrorMessage("selectUserInfo");
        }

    }

    public void selectAllWorkOutList() {
        List<WorkOutLogDTO> allWorkOutList = workOutService.selectAllWorkOutList();
        if (allWorkOutList != null && !allWorkOutList.isEmpty()) {
            workOutPrint.printAllWorkOutList(allWorkOutList);
        } else {
            workOutPrint.printErrorMessage("selectAllWorkOutList");
        }
    }

    public void selectConditionWorkOutList(SearchCondition searchCondition) {
        List<WorkOutLogDTO> allWorkOutList = workOutService.selectConditionWorkOutList(searchCondition);
        if (allWorkOutList != null && !allWorkOutList.isEmpty()) {
            workOutPrint.printAllWorkOutList(allWorkOutList);
        } else {
            workOutPrint.printErrorMessage("selectAllWorkOutList");
        }
    }

    public void insertWorkOutLog(WorkOutLogDTO workOutLog) {
        if (workOutService.insertWorkOutLog(workOutLog)) {
            workOutPrint.printSuccessMessage("insertWorkOutLog");
        } else {
            workOutPrint.printErrorMessage("insertWorkOutLog");
        }


    }


    public void updateWorkOutLog(WorkOutLogDTO workOutLogDTO) {
        workOutLogDTO.setWorkoutDate(workOutLogDTO.getWorkoutDate().replace("-", ""));
        if (workOutService.updateWorkOutLog(workOutLogDTO)) {
            workOutPrint.printSuccessMessage("updateWorkOutLog");
        } else {
            workOutPrint.printErrorMessage("updateWorkOutLog");
        }

    }

    public void deleteWorkOutLog(Map<String, Integer> parameter) {
        if (workOutService.deleteWorkOutLog(parameter)) {
            workOutPrint.printSuccessMessage("deleteWorkOutLog");
        } else {
            workOutPrint.printErrorMessage("deleteWorkOutLog");
        }
    }
}

