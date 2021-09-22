package com.bbva.pzic.products.proposals.dao.apx;

import com.bbva.jee.arq.spring.core.host.InvocadorTransaccion;
import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.dao.apx.mapper.IApxListProcessTaskProposalsMappers;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.PeticionTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.RespuestaTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApxListProcessTasksProposals {

@Autowired
    private IApxListProcessTaskProposalsMappers mappers;

@Autowired
    private InvocadorTransaccion<PeticionTransaccionPpcutge1_1, RespuestaTransaccionPpcutge1_1> transaccion;

    public ProcessTasks perform(final InputListProcessTasksProposals input){
        PeticionTransaccionPpcutge1_1 request = mappers.mapIn(input);
        RespuestaTransaccionPpcutge1_1 responde = transaccion.invocar(request);
        return mappers.mapOut(responde);
    }

}
