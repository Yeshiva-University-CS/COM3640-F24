package edu.yu.pl.DataModel;

/**
 * Represents a deployment command for an individual container.
 */
public class DeployCmd extends Command {

    private String strategy;
    private Container container;

    /**
     * Constructs a new DeployCmd with the given strategy and container.
     * 
     * @param strategy the deployment strategy
     * @param container the container to be deployed
     */
    public DeployCmd(String strategy, Container container) {
        this.strategy = strategy;
        this.container = container;
    }

    /**
     * Executes the deployment of the individual container.
     * This method contains the actual logic for deploying the container.
     */
    @Override
    public void execute() {
        System.out.println("Executing deployment for container: " + container.getName() +
                " with strategy: " + strategy);
        // Add actual container deployment logic here
    }

    /**
     * Returns the deployment strategy.
     * 
     * @return the strategy
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * Sets the deployment strategy.
     * 
     * @param strategy the strategy to set
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * Returns the container to be deployed.
     * 
     * @return the container
     */
    public Container getContainer() {
        return container;
    }

    /**
     * Sets the container to be deployed.
     * 
     * @param container the container to set
     */
    public void setContainer(Container container) {
        this.container = container;
    }

    /**
     * Provides a string representation of the deployment command for the container.
     * 
     * @return a string describing the container command
     */
    @Override
    public String toString() {
        return "DeployCmd{" +
                "strategy='" + strategy + '\'' +
                ", container=" + container.getName() +
                '}';
    }
}
