package com.shdatalink.contract.configuration;

import com.shdatalink.contract.command.ContractCommand;
import com.shdatalink.contract.domain.ContractAggregate;
import io.eventuate.sync.AggregateRepository;
import io.eventuate.sync.EventuateAggregateStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContractAggregateRepositoryConfiguration {
    @Bean
    public AggregateRepository<ContractAggregate, ContractCommand> contractAggregateRepository(EventuateAggregateStore eventStore) {
        return new AggregateRepository<>(ContractAggregate.class, eventStore);
    }
}
