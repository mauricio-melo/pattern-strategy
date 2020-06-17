package com.mmelo.strategy.processor.impl;

import com.mmelo.strategy.processor.TypeUpdate;
import org.springframework.stereotype.Component;

import static com.mmelo.strategy.constants.Type.MIGRATION;

@Component(MIGRATION)
public class MigrationProcessor implements TypeUpdate {

    @Override
    public String execute(final String text) {
        return text + " = se for migration funcionou";
    }
}
