package com.shdatalink.contract.command;

import com.shdatalink.contractandsettlement.common.settlement.messaging.model.ContractState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateContractCommand implements ContractCommand {
    private Integer amount;
    private ContractState state;
}
