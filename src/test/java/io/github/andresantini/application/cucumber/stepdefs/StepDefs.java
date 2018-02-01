package io.github.andresantini.application.cucumber.stepdefs;

import io.github.andresantini.application.ESportsAplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ESportsAplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
