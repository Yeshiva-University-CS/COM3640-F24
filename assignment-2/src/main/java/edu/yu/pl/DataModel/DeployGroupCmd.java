package edu.yu.pl.DataModel;

/**
 * Represents a deployment command for a group of containers.
 */
public class DeployGroupCmd extends Command {

    private String strategy;
    private ContainerGroup containerGroup;

    /**
     * Constructs a new DeployGroupCmd with the given strategy and container group.
     * 
     * @param strategy the deployment strategy
     * @param containerGroup the container group to be deployed
     */
    public DeployGroupCmd(String strategy, ContainerGroup containerGroup) {
        this.strategy = strategy;
        this.containerGroup = containerGroup;
    }

    /**
     * Executes the deployment of the container group.
     * This method contains the actual logic for deploying the group.
     */
    @Override
    public void execute() {
        System.out.println("Executing deployment for container group: " + containerGroup.getGroupName() +
                " with strategy: " + strategy);
        containerGroup.deploy();
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
     * Returns the container group to be deployed.
     * 
     * @return the container group
     */
    public ContainerGroup getContainerGroup() {
        return containerGroup;
    }

    /**
     * Sets the container group to be deployed.
     * 
     * @param containerGroup the container group to set
     */
    public void setContainerGroup(ContainerGroup containerGroup) {
        this.containerGroup = containerGroup;
    }

    /**
     * Provides a string representation of the deployment command for the container group.
     * 
     * @return a string describing the container group command
     */
    @Override
    public String toString() {
        return "DeployGroupCmd{" +
                "strategy='" + strategy + '\'' +
                ", containerGroup=" + containerGroup.getGroupName() +
                '}';
    }
}
