package com.bbva.pzic.products.proposals.facade;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;

public interface ISrvProposalsV0Processtasks {

    ServiceResponse<ProcessTasks> lisProcessTasksProposals(String businessProcessId, String taskId);

}
