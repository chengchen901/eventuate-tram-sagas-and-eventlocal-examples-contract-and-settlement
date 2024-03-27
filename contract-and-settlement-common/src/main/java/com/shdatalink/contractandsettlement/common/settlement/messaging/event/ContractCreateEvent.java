package com.shdatalink.contractandsettlement.common.settlement.messaging.event;

import com.shdatalink.contractandsettlement.common.settlement.messaging.model.ContractState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractCreateEvent implements ContractEvent {
    private Integer amount;
    private ContractState state;
}
