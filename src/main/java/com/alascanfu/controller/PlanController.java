package com.alascanfu.controller;

import com.alascanfu.pojo.Plan;
import com.alascanfu.service.PlanService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;


@Controller
@RequestMapping("/planSystem")
public class PlanController {
    @Autowired
    PlanService planService;
    
    /**
     *功能描述
     * 查询所有的计划清单返回到清单显示页面
     * @date 2022/1/20
     *  @author Alascanfu
     */
    @RequestMapping("/allPlan")
    public String planList(Model model){
        List<Plan> plans = planService.queryAllPlan();
        model.addAttribute("plans",plans);
        return "planList";
    }
    
    /**
     *功能描述
     * 跳转到增加计划的页面
     * @date 2022/1/21
     *  @author Alascanfu
     */
    @RequestMapping("/toAddPlan")
    public String toAddPlan(){
        return "addPlan";
    }
    
    /**
     *功能描述
     * 添加计划
     * @date 2022/1/21
     *  @author Alascanfu
     */
    @RequestMapping("/addPlan")
    public String addPlan(Plan plan){
        planService.addPlan(plan);
        return "redirect:/planSystem/allPlan";
    }
    
    
    /**
     *功能描述
     * 删除指定计划
     * @date 2022/1/21
     *  @author Alascanfu
     */
    @RequestMapping("/deletePlan")
    public String deletePlan(int planId,Model model){
        planService.deletePlanById(planId);
        return "redirect:/planSystem/allPlan";
    }
    
    /**
     *功能描述
     * 跳转到修改计划的页面
     * @date 2022/1/21
     *  @author Alascanfu
     */
    @RequestMapping("/toUpdatePlan")
    public String toUpdatePlan(Plan plan,Model model){
        Plan qPlan = planService.queryPlanById(plan.getPlanId());
        model.addAttribute("QPlan",qPlan);
        return "updatePlan";
    }
    
    /**
     *功能描述
     * 修改指定计划
     * @date 2022/1/21
     *  @author Alascanfu
     */
    @RequestMapping("/updatePlan")
    public String updatePlan(Plan plan, Model model){
        planService.updatePlanById(plan);
        return "redirect:/planSystem/allPlan";
    }
    
    /**
     * 功能描述
     * 拓展功能：显示所有的查询日期需要进行的计划
     * @date 2022/1/21
     * @author Alascanfu
     */
    @RequestMapping("/queryDate")
    public String queryStartDate(Plan plan,Model model){
        List<Plan> plans = planService.queryDate(plan);
        model.addAttribute("plans",plans);
        return "planList";
    }
}
