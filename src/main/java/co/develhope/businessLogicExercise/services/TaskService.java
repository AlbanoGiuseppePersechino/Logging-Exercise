package co.develhope.businessLogicExercise.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private static final Logger logger = LoggerFactory.getLogger(TaskService.class);

    public int calculatePower(int base, int exponent) {
        logger.debug("Starting power calculation: {}^{}", base, exponent);
        int result = (int) Math.pow(base, exponent);
        logger.debug("Finished power calculation: result = {}", result);
        return result;
    }
}

