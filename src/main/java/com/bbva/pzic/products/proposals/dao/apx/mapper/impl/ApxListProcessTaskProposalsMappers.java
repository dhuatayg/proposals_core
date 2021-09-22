package com.bbva.pzic.products.proposals.dao.apx.mapper.impl;

import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.dao.apx.mapper.IApxListProcessTaskProposalsMappers;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.PeticionTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.RespuestaTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import com.bbva.pzic.products.proposals.facade.mapper.impl.ListProcessTaskProposalsMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class ApxListProcessTaskProposalsMappers implements IApxListProcessTaskProposalsMappers {
    private static final Log LOG = LogFactory.getLog(ListProcessTaskProposalsMapper.class);
    @Override
    public PeticionTransaccionPpcutge1_1 mapIn(final InputListProcessTasksProposals inputListProcessTasksProposals) {
        LOG.info("... called method ApxListProcessTaskProposalsMappers-mapIn");
        PeticionTransaccionPpcutge1_1 dtoIn = new PeticionTransaccionPpcutge1_1();
        dtoIn.setBusinessprocessid(inputListProcessTasksProposals.getBusinessProcessId());
        dtoIn.setTaskid(inputListProcessTasksProposals.getTaskId());
        return dtoIn;
    }

    @Override
    public ProcessTasks mapOut(final RespuestaTransaccionPpcutge1_1 respuesta) {
        LOG.info("... called method ApxListProcessTaskProposalsMappers-mapOut");
        if(respuesta==null){
            return null;
        }
        ProcessTasks dtoOut = new ProcessTasks();
        dtoOut.setBusinessProcessId(respuesta.getCampo_1_businessprocessid());
        dtoOut.setTaskId(respuesta.getCampo_2_taskid());

        return dtoOut;
    }
}
