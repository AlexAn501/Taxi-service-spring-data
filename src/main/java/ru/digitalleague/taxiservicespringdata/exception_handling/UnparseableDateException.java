package ru.digitalleague.taxiservicespringdata.exception_handling;

public class UnparseableDateException extends RuntimeException {
    public UnparseableDateException(String message) {
        super(message);
    }
}
