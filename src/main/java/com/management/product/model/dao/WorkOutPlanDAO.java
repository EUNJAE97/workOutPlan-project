package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.UserDTO;
import com.management.product.model.dto.WorkOutLogDTO;

import java.util.List;
import java.util.Map;

public interface WorkOutPlanDAO {
    List<WorkOutLogDTO> selectAllWorkOutList();

    int insertWorkOutLog(WorkOutLogDTO workOutLog);

    List<WorkOutLogDTO> selectConditionWorkOutList(SearchCondition searchCondition);

    List<UserDTO> selectUserInfo();

    int updateWorkOutLog(WorkOutLogDTO workOutLogDTO);

    int deleteWorkOutLog(Map<String, Integer> parameter);

}
