package com.shdatalink.contract.sagas.data;

import com.shdatalink.contractandsettlement.common.settlement.messaging.model.ContractState;
import lombok.Data;

@Data
public class CreateContractSagaData {
    private Integer contractId;
    private Integer amount;
    private ContractState state;
}
