package com.bbva.pzic.products.proposals.dao.apx.mapper.impl;

import com.bbva.pzic.products.proposals.EntityMock;
import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.dao.apx.mapper.IApxListProcessTaskProposalsMappers;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.PeticionTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.RespuestaTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

public class ApxListProcessTasksProposalsMapperTest {
    private IApxListProcessTaskProposalsMappers mappers;
    @Before
    public void setUp(){
        mappers = new ApxListProcessTaskProposalsMappers();
    }
    @Test
    public void mapInFullTest() throws IOException {
        InputListProcessTasksProposals input = EntityMock.getInstance().getInputListProcessTasksProposals();

        PeticionTransaccionPpcutge1_1 result = mappers.mapIn(input);

        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getBusinessprocessid());
        Assert.assertNotNull(result.getTaskid());

        Assert.assertEquals(input.getBusinessProcessId(), result.getBusinessprocessid());
        Assert.assertEquals(input.getTaskId(), result.getTaskid());

    }

    @Test
    public void mapInEmptyTest() throws IOException{
        PeticionTransaccionPpcutge1_1 result = mappers.mapIn(new InputListProcessTasksProposals());

        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getBusinessprocessid());
        Assert.assertNotNull(result.getTaskid());

    }
    @Test
    public void mapOutFullTest() throws  IOException{
        RespuestaTransaccionPpcutge1_1 input = EntityMock.getInstance().getRespuestaTransaccionPpcutge1_1();

        ProcessTasks result = mappers.mapOut(input);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getBusinessProcessId());
        Assert.assertNotNull(result.getTaskId());
        Assert.assertNotNull(result.getStatus());
        Assert.assertNotNull(result.getStatus().getDescription());

        Assert.assertEquals(input.getCampo_1_businessprocessid(), result.getBusinessProcessId());
        Assert.assertEquals(input.getCampo_2_taskid(), result.getTaskId());
        Assert.assertEquals(input.getStatus(), result.getStatus().getId());
        Assert.assertEquals(input.getStatus().getDescription(), result.getStatus().getDescription());

    }

    @Test
    public void mapOutEmptyTest(){
        ProcessTasks result = mappers.mapOut(null);
        Assert.assertNotNull(result);
    }
}