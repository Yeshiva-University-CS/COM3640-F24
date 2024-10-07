package edu.yu.pl.DataModel;

/**
 * Represents a generic command that can be extended by specific types of commands.
 */
public abstract class Command {

    /**
     * Abstract method that must be implemented by specific command types to execute the command.
     */
    public abstract void execute();
}

