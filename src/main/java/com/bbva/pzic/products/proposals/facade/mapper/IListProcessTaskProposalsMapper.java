package com.bbva.pzic.products.proposals.facade.mapper;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;

public interface IListProcessTaskProposalsMapper {

    InputListProcessTasksProposals mapIn(String businessProcessId, String taskId);
    ServiceResponse<ProcessTasks> mapOut(ProcessTasks processTasks);

}
