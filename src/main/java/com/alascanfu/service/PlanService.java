package com.alascanfu.service;

import com.alascanfu.dao.PlanMapper;
import com.alascanfu.pojo.Plan;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("planService")
public class PlanService {
    
    @Autowired
    PlanMapper planMapper;
    //增加一个计划信息
    public int addPlan(Plan plan){
        return planMapper.addPlan(plan);
    }
    //删除指定id的计划信息
    public int deletePlanById(@Param("planId") int id){
        return planMapper.deletePlanById(id);
    }
    //更新指定id的计划信息
    public int updatePlanById(Plan plan){
        return planMapper.updatePlanById(plan);
    }
    //读取指定id的计划信息
    public Plan queryPlanById(int id){
        return planMapper.queryPlanById(id);
    }
    //获取全部的计划信息
    public List<Plan> queryAllPlan(){
        return planMapper.queryAllPlan();
    }
    
    //获取当天日期的所有计划
    public List<Plan> queryDate(Plan plan){
        return planMapper.queryDate(plan);
    }
}
