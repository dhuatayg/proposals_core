package com.bbva.pzic.products.proposals.business;

import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;

public interface ISrvIntProposalsV0Processtasks {
    ProcessTasks listProcessTaskProposalsMapper (InputListProcessTasksProposals input);
}
