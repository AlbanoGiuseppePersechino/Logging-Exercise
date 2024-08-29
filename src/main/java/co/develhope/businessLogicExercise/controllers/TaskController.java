package co.develhope.businessLogicExercise.controllers;

import co.develhope.businessLogicExercise.exeptions.CustomError;
import co.develhope.businessLogicExercise.services.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @Value("${custom.var1}")
    private int var1;

    @Value("${custom.var2}")
    private int var2;

    @Autowired
    private TaskService helloService;

    @GetMapping("/")
    public String welcome() {
        String message = "Welcomee!";
        logger.info(message);
        return message;
    }

    @GetMapping("/exp")
    public int calculateExponent() {
        logger.info("Calculating exponent: {}^{}", var1, var2);
        int result = helloService.calculatePower(var1, var2);
        logger.info("Result of {}^{} is {}", var1, var2, result);
        return result;
    }

    @GetMapping("/get-errors")
    public void triggerError() {
        logger.error("Triggering custom error!");
        throw new CustomError("This is a custom error for logging purposes!");
    }
}
