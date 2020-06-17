package com.mmelo.strategy.processor.impl;

import com.mmelo.strategy.exceptions.TypeNotFound;
import com.mmelo.strategy.processor.FactoryProcessor;
import com.mmelo.strategy.processor.TypeUpdate;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;


@Component
@AllArgsConstructor
public class FactoryProcessorImpl implements FactoryProcessor {

    private final ApplicationContext context;

    @Override
    public TypeUpdate alterText(final String text) {
        if(context.containsBean(text) && context.isTypeMatch(text, TypeUpdate.class)) {
            return context.getBean(text, TypeUpdate.class);
        }
        throw new TypeNotFound(MessageFormat.format("Type not found : {0}", text));
    }
}
