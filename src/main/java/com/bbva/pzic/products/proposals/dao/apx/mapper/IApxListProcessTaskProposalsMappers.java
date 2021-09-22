package com.bbva.pzic.products.proposals.dao.apx.mapper;

import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.PeticionTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.RespuestaTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;

public interface IApxListProcessTaskProposalsMappers {
    PeticionTransaccionPpcutge1_1 mapIn(InputListProcessTasksProposals input);
    ProcessTasks mapOut(RespuestaTransaccionPpcutge1_1 respuesta);
}
