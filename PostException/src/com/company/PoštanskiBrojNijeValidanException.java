package com.company;

public class PoštanskiBrojNijeValidanException extends PosiljkaException{

    public PoštanskiBrojNijeValidanException() {
    }
    public PoštanskiBrojNijeValidanException(String message) {
        super(message);
    }
    public PoštanskiBrojNijeValidanException(String message, Throwable cause) {
        super(message, cause);
    }
    public PoštanskiBrojNijeValidanException(Throwable cause) {
        super(cause);
    }
}
