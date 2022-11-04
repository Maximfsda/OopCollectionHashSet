package ProductOneTask;
public class AddRuntimeException extends RuntimeException{
    public AddRuntimeException() {
    }

    public AddRuntimeException(String message) {
        super(message);
    }

    public AddRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddRuntimeException(Throwable cause) {
        super(cause);
    }

    public AddRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
