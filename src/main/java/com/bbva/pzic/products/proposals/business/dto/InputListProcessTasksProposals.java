package com.bbva.pzic.products.proposals.business.dto;

public class InputListProcessTasksProposals {
    private String businessProcessId;
    private String taskId;

    public String getBusinessProcessId() {

        return businessProcessId;
    }

    public void setBusinessProcessId(String businessProcessId) {

        this.businessProcessId = businessProcessId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {

        this.taskId = taskId;
    }
}
