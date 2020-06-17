package com.mmelo.strategy.service;

import com.mmelo.strategy.processor.FactoryProcessor;
import com.mmelo.strategy.processor.TypeUpdate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StrategyService {

    private final FactoryProcessor factoryProcessor;

    public String getText(final String text) {
        final TypeUpdate typeUpdate = factoryProcessor.alterText(text);
        return typeUpdate.execute(text);
    }
}
