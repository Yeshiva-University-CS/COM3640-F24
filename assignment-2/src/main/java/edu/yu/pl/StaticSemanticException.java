package edu.yu.pl;

/**
 * Represents an exception that is thrown when a static semantic error occurs during
 * the compilation or interpretation of code.
 * This exception is used to signal errors that are caught during the static analysis phase,
 * such as type mismatches, invalid references, or rule violations.
 */
public class StaticSemanticException extends Exception {

    /**
     * Constructs a new StaticSemanticException with the specified detail message.
     * 
     * @param message the detail message explaining the reason for the exception
     */
    public StaticSemanticException(String message) {
        super(message);
    }

    /**
     * Constructs a new StaticSemanticException with the specified detail message
     * and cause.
     * 
     * @param message the detail message explaining the reason for the exception
     * @param cause the cause of the exception
     */
    public StaticSemanticException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new StaticSemanticException with the specified cause.
     * 
     * @param cause the cause of the exception
     */
    public StaticSemanticException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new StaticSemanticException with no detail message or cause.
     */
    public StaticSemanticException() {
        super();
    }
}
