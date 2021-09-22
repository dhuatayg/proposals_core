package com.bbva.pzic.products.proposals;

import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.RespuestaTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.util.mappers.ObjectMapperHelper;

import java.io.IOException;

public class EntityMock {
    private static final EntityMock INSTANCE = new EntityMock();

    private ObjectMapperHelper objectMapper;

    private EntityMock() { objectMapper = ObjectMapperHelper.getInstance();}

    public static EntityMock getInstance(){ return  INSTANCE;}

    public InputListProcessTasksProposals getInputListProcessTasksProposals() throws IOException {
        return objectMapper.readValue(Thread.currentThread().getContextClassLoader().getResourceAsStream("mock/InputListProcessTasksProposals.json"), InputListProcessTasksProposals.class);
    }

    public RespuestaTransaccionPpcutge1_1 getRespuestaTransaccionPpcutge1_1() throws IOException{
        return objectMapper.readValue(Thread.currentThread().getContextClassLoader().getResourceAsStream("mock/getRespuestaTransaccionPpcutge1_1.json"), RespuestaTransaccionPpcutge1_1.class);
    }
}
