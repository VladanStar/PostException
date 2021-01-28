package com.company;

public class GradNijeValidanException extends PosiljkaException {

    public GradNijeValidanException() {
    }
    public GradNijeValidanException(String message) {
        super(message);
    }
    public GradNijeValidanException(String message, Throwable cause) {
        super(message, cause);
    }
    public GradNijeValidanException(Throwable cause){
        super(cause);
    }
}
