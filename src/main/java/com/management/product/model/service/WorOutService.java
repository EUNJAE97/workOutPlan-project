package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.WorkOutPlanDAO;
import com.management.product.model.dto.UserDTO;
import com.management.product.model.dto.WorkOutLogDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class WorOutService {
    private WorkOutPlanDAO workOutPlanDAO;

    public List<WorkOutLogDTO> selectAllWorkOutList() {
        SqlSession sqlSession = getSqlSession();
        workOutPlanDAO = sqlSession.getMapper(WorkOutPlanDAO.class);
        List<WorkOutLogDTO> allWorkOutList = workOutPlanDAO.selectAllWorkOutList();
        sqlSession.close();
        return allWorkOutList;
    }

    public List<UserDTO> selectUserInfo() {
        SqlSession sqlSession = getSqlSession();
        workOutPlanDAO = sqlSession.getMapper(WorkOutPlanDAO.class);
        List<UserDTO> userInfoList = workOutPlanDAO.selectUserInfo();
        sqlSession.close();
        return userInfoList;


    }

    public List<WorkOutLogDTO> selectConditionWorkOutList(SearchCondition searchCondition) {
        SqlSession sqlSession = getSqlSession();
        workOutPlanDAO = sqlSession.getMapper(WorkOutPlanDAO.class);
        List<WorkOutLogDTO> allWorkOutList = workOutPlanDAO.selectConditionWorkOutList(searchCondition);
        sqlSession.close();
        return allWorkOutList;
    }

    public boolean insertWorkOutLog(WorkOutLogDTO workOutLog) {
        SqlSession sqlSession = getSqlSession();
        workOutPlanDAO = sqlSession.getMapper(WorkOutPlanDAO.class);
        int result = workOutPlanDAO.insertWorkOutLog(workOutLog);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean updateWorkOutLog(WorkOutLogDTO workOutLogDTO) {
        SqlSession sqlSession = getSqlSession();
        workOutPlanDAO = sqlSession.getMapper(WorkOutPlanDAO.class);
        int result = workOutPlanDAO.updateWorkOutLog(workOutLogDTO);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean deleteWorkOutLog(Map<String, Integer> parameter) {
        SqlSession sqlSession = getSqlSession();
        workOutPlanDAO = sqlSession.getMapper(WorkOutPlanDAO.class);
        int result = workOutPlanDAO.deleteWorkOutLog(parameter);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }
}
