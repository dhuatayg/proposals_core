package com.bbva.pzic.products.proposals.facade.mapper.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import com.bbva.pzic.products.proposals.facade.mapper.IListProcessTaskProposalsMapper;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.*;

public class ListProcesstasksProposalsMapperTest {
    private IListProcessTaskProposalsMapper mapper;

    @Before
    public void setUp(){
        mapper = new ListProcessTaskProposalsMapper();}

    @Test
    public void mapInFullTest() throws IOException {
        InputListProcessTasksProposals result = mapper.mapIn("982HE","87848384");
        assertNotNull(result);
        assertNotNull(result.getBusinessProcessId());
        assertNotNull(result.getTaskId());

        assertEquals("982HE",result.getBusinessProcessId());
        assertEquals("87848384",result.getTaskId());
    }

    @Test
    public void mapInEmptyTest(){
        InputListProcessTasksProposals result = mapper.mapIn(null,null);
        assertNull(result);
        assertNull(result.getBusinessProcessId());
        assertNull(result.getTaskId());

    }

    @Test
    public void mapOutFullTest() throws IOException{
        ProcessTasks input = new ProcessTasks();
        ServiceResponse<ProcessTasks> result = mapper.mapOut(input);
        assertNotNull(result);
        assertNotNull(result.getData());
    }

    @Test
    public void mapOutEmptyTest() throws IOException{
        ServiceResponse<ProcessTasks> result = mapper.mapOut(null);
        assertNull(result);
    }
}
