package com.company;

public class PosiljkaException extends Exception {

    public PosiljkaException() {
    }
    public PosiljkaException(String message){
        super(message);
    }
    public PosiljkaException(String message, Throwable cause){
        super(message,cause);
    }
    public PosiljkaException(Throwable cause){
        super(cause);
    }

}
