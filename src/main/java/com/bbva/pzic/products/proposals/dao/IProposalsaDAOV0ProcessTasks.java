package com.bbva.pzic.products.proposals.dao;

import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;

public interface IProposalsaDAOV0ProcessTasks {
    ProcessTasks lisProcessTasksProposals (InputListProcessTasksProposals input);
}
