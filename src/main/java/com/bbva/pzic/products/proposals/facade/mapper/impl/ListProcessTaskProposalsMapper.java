package com.bbva.pzic.products.proposals.facade.mapper.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import com.bbva.pzic.products.proposals.facade.mapper.IListProcessTaskProposalsMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.felix.scr.annotations.Component;

@Component
public class ListProcessTaskProposalsMapper implements IListProcessTaskProposalsMapper {

    private static final Log LOG = LogFactory.getLog(ListProcessTaskProposalsMapper.class);

    @Override
    public InputListProcessTasksProposals mapIn(final String businessProcessId, final String taskId) {
        LOG.info("... called method IListProcessTaskProposalsMapper-mapÍn");
        InputListProcessTasksProposals dtoIn = new InputListProcessTasksProposals();
        dtoIn.setBusinessProcessId(businessProcessId);
        dtoIn.setTaskId(taskId);
        return dtoIn;
    }

    @Override
    public ServiceResponse<ProcessTasks> mapOut(final ProcessTasks processTasks) {
        LOG.info("... called method IListProcessTaskProposalsMapper-mapOut");
        if(processTasks == null){
            return null;
        }
        return ServiceResponse.data(processTasks).build();
    }
}
