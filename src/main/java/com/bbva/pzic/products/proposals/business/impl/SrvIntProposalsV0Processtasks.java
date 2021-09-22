package com.bbva.pzic.products.proposals.business.impl;

import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.dao.IProposalsaDAOV0ProcessTasks;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import com.bbva.pzic.products.proposals.business.ISrvIntProposalsV0Processtasks;
import com.bbva.pzic.products.proposals.util.ValidationGroup;
import com.bbva.pzic.routine.validator.Validator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class SrvIntProposalsV0Processtasks implements ISrvIntProposalsV0Processtasks {
    private static final Log LOG = LogFactory.getLog(SrvIntProposalsV0Processtasks.class);

    @Autowired
    private Validator validator;

    @Autowired
    private IProposalsaDAOV0ProcessTasks proposalsaDAOV0ProcessTasks;

    @Override
    public ProcessTasks listProcessTaskProposalsMapper(final InputListProcessTasksProposals input) {
        LOG.info("");
        LOG.info("");
        validator.validate(input, ValidationGroup.ListProcessTasksProposals.class);
        return proposalsaDAOV0ProcessTasks.lisProcessTasksProposals(input);
    }
}
