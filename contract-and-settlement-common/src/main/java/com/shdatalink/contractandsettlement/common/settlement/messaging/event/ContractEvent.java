package com.shdatalink.contractandsettlement.common.settlement.messaging.event;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.shdatalink.contract.domain.ContractAggregate")
public interface ContractEvent extends Event {
}
