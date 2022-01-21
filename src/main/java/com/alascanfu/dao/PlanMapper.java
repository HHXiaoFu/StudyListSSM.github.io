package com.alascanfu.dao;

import com.alascanfu.pojo.Plan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 功能描述
 * PlanMapper
 * @author Alascanfu
 * @date 2022/1/20
 */
public interface PlanMapper {
    //增加一个计划信息
    public int addPlan(Plan plan);
    //删除指定id的计划信息
    public int deletePlanById(@Param("planId") int id);
    //更新指定id的计划信息
    public int updatePlanById(Plan plan);
    //读取指定id的计划信息
    public Plan queryPlanById(int id);
    //获取全部的计划信息
    public List<Plan> queryAllPlan();
    
    //获取选定日期的所有计划
    public List<Plan> queryDate(Plan plan);
}
