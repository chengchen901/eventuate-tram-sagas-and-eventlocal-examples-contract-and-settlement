package com.shdatalink.contract.history.view.backend;

import cn.hutool.json.JSONUtil;
import com.shdatalink.contractandsettlement.common.settlement.messaging.event.ContractCreateEvent;
import io.eventuate.DispatchedEvent;
import io.eventuate.Event;
import io.eventuate.EventHandlerMethod;
import io.eventuate.EventSubscriber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Slf4j
@Component
@EventSubscriber(id = "contractQuerySideEventHandlers")
public class ContractEventSubscriber {
    private List<ContractCreateEvent> list = new CopyOnWriteArrayList<>();
    @EventHandlerMethod
    public void create(DispatchedEvent<ContractCreateEvent> de) {
        log.info("ContractEventSubscriber 执行 create,参数:{}", JSONUtil.toJsonStr(de));
        list.add(de.getEvent());
    }

    public List<ContractCreateEvent> listAll() {
        return list;
    }
}
