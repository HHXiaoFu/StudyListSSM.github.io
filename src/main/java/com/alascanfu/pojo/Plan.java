package com.alascanfu.pojo;

/**
 * 功能描述
 * Plan的实体类
 * @author Alascanfu
 * @date 2022/1/20
 */
public class Plan {
    private int planId;
    private String startDate;
    private String endDate;
    private String context;
    
    public Plan() {
    }
    
    public Plan(int planId, String startDate, String endDate, String context) {
        this.planId = planId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.context = context;
    }
    
    public int getPlanId() {
        return planId;
    }
    
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    
    public String getStartDate() {
        return startDate;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public String getEndDate() {
        return endDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public String getContext() {
        return context;
    }
    
    public void setContext(String context) {
        this.context = context;
    }
    
    @Override
    public String toString() {
        return "Plan{" +
            "planId=" + planId +
            ", startDate='" + startDate + '\'' +
            ", endDate='" + endDate + '\'' +
            ", context='" + context + '\'' +
            '}';
    }
}
