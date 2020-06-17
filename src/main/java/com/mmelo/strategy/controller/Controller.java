package com.mmelo.strategy.controller;

import com.mmelo.strategy.service.StrategyService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(Controller.ENDPOINT)
public class Controller {

    public static final String ENDPOINT = "/strategy";
    private final StrategyService service;

    @GetMapping(path = "/{text}", produces = APPLICATION_JSON_VALUE)
    public String getText(@PathVariable final String text) {
        return service.getText(text);
    }
}
