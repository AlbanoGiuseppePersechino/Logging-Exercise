package co.develhope.businessLogicExercise.exeptions;

public class CustomError extends RuntimeException {
    public CustomError(String message) {
        super(message);
    }
}
