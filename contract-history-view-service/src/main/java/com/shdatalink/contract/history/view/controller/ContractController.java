package com.shdatalink.contract.history.view.controller;


import com.shdatalink.contract.history.view.backend.ContractEventSubscriber;
import com.shdatalink.contractandsettlement.common.settlement.messaging.event.ContractCreateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contract")
public class ContractController {
    @Autowired
    private ContractEventSubscriber contractEventSubscriber;
    @GetMapping
    public List<ContractCreateEvent> listAll() {
        return contractEventSubscriber.listAll();
    }
}
