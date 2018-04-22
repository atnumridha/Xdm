package com.dmcsol.xdm.beans;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class PageSwitcher implements Serializable {
    private String taskFlowId = "/WEB-INF/task-overview-edit-flow.xml#task-overview-edit-flow";

    public PageSwitcher() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
    
    public String getOverview(){
        taskFlowId = "/WEB-INF/task-overview-edit-flow.xml#task-overview-edit-flow";
        
        return null;
    }
    
    public String getTimeline(){
        taskFlowId = "/WEB-INF/person-timeline-flow.xml#person-timeline-flow";
        
        return null;
    }
    
    
}
