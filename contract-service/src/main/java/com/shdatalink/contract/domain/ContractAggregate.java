package com.shdatalink.contract.domain;

import cn.hutool.json.JSONUtil;
import com.shdatalink.contract.command.ContractCommand;
import com.shdatalink.contract.command.CreateContractCommand;
import com.shdatalink.contractandsettlement.common.settlement.messaging.model.ContractState;
import com.shdatalink.contractandsettlement.common.settlement.messaging.event.ContractCreateEvent;
import io.eventuate.Event;
import io.eventuate.EventUtil;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Slf4j
public class ContractAggregate extends ReflectiveMutableCommandProcessingAggregate<ContractAggregate, ContractCommand> {
    private Integer amount;
    private ContractState state;

    public List<Event> process(CreateContractCommand cmd) {
        log.info("ContractAggregate 执行 process(CreateContractCommand cmd),参数:{},当前对象:{}", JSONUtil.toJsonStr(cmd), this);
        return EventUtil.events(new ContractCreateEvent(cmd.getAmount(), cmd.getState()));
    }

    public void apply(ContractCreateEvent event) {
        log.info("ContractAggregate 执行 apply(ContractCreateEvent event),参数:{},当前对象:{}", JSONUtil.toJsonStr(event), this);
        this.amount = event.getAmount();
        this.state = event.getState();
    }
}
