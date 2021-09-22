package com.bbva.pzic.products.proposals.facade.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.pzic.products.proposals.facade.ISrvProposalsV0Processtasks;
import com.bbva.pzic.products.proposals.business.ISrvIntProposalsV0Processtasks;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import com.bbva.pzic.products.proposals.facade.mapper.IListProcessTaskProposalsMapper;
import com.bbva.pzic.routine.processing.data.DataProcessingExecutor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/v0")
@Produces(MediaType.APPLICATION_JSON)
@SN(registryID = "SNPE1700055", logicalID = "proposals")
@VN(vnn = "v0")
@Service
public class SrvProposalsV0Processtasks implements ISrvProposalsV0Processtasks {

    private static final Log LOG = LogFactory.getLog(SrvProposalsV0Processtasks.class);

    @Autowired
    private IListProcessTaskProposalsMapper listProcessTaskProposalsMapper;

    @Autowired
    private ISrvIntProposalsV0Processtasks srvIntProposalsV0Processtasks;

    @Autowired
    private DataProcessingExecutor inputDataProcessingExecutor;

    @Autowired
    private DataProcessingExecutor outputDataProcessingExecutor;

    @Override
    @GET
    @Path("/process-tasks")
    @Produces(MediaType.APPLICATION_JSON)
    @SMC(registryID = "SMGG20203823", logicalID = "listProcessTasksProposals", forcedCatalog = "gabiCatalog")
    public ServiceResponse<ProcessTasks> lisProcessTasksProposals(@QueryParam("businessProcessId") final String businessProcessId,
                                                                  @QueryParam("taskId") final String taskId){
    LOG.info("");
    Map<String, Object> queryParams = new HashMap<>();
    queryParams.put("businessProcessId", businessProcessId);
    queryParams.put("taskId", taskId);

    inputDataProcessingExecutor.perform("SMGG20203823",null,null,queryParams);

    ServiceResponse<ProcessTasks> serviceResponse = listProcessTaskProposalsMapper.mapOut(
            srvIntProposalsV0Processtasks.listProcessTaskProposalsMapper(
                    listProcessTaskProposalsMapper.mapIn(
                (String) queryParams.get("businessProcessId"),
                (String) queryParams.get("taskId")
                    )
            )
    );

    outputDataProcessingExecutor.perform("SMGG20203823",serviceResponse,null,null);

    return serviceResponse;

  }

}
