package sideproject.weather.error;

public class InvalidDate extends RuntimeException{
    private static final String MESSAGE = "너무 먼 날짜입니다.";

    public InvalidDate() {
        super(MESSAGE);
    }
}
