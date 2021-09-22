package com.bbva.pzic.products.proposals.dao.impl;

import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.dao.IProposalsaDAOV0ProcessTasks;
import com.bbva.pzic.products.proposals.dao.apx.ApxListProcessTasksProposals;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import com.bbva.pzic.products.proposals.facade.mapper.impl.ListProcessTaskProposalsMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProposalsaDAOV0ProcessTasks implements IProposalsaDAOV0ProcessTasks {
    private static final Log LOG = LogFactory.getLog(ProposalsaDAOV0ProcessTasks.class);

    @Autowired
    private ApxListProcessTasksProposals apxListProcessTasksProposals;

    @Override
    public ProcessTasks lisProcessTasksProposals(final InputListProcessTasksProposals input) {
        LOG.info("Invoking method APX");
        return apxListProcessTasksProposals.perform(input);
    }
}
