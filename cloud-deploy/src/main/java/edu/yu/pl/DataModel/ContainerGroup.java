package edu.yu.pl.DataModel;

import java.util.List;

/**
 * The ContainerGroup class represents a group of containers in a cloud
 * environment.
 * This class provides functionality for managing and interacting with a group
 * of containers.
 */
public class ContainerGroup {

    /** The name of the container group. */
    private String groupName;

    /** The list of containers in the group. */
    private List<Container> containers;

    /**
     * Constructs a new ContainerGroup with the specified group name and containers.
     * 
     * @param groupName  the name of the container group
     * @param containers the list of containers in the group
     */
    public ContainerGroup(String groupName, List<Container> containers) {
        this.groupName = groupName;
        this.containers = containers;
    }

    /**
     * Returns the name of the container group.
     * 
     * @return the name of the container group
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Returns the list of containers in the group.
     * 
     * @return the list of containers
     */
    public List<Container> getContainers() {
        return containers;
    }

    /**
     * Returns a string representation of the container group.
     * 
     * @return the string representation of the container group
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Container Group: ").append(groupName).append("\n");
        for (Container container : containers) {
            sb.append(container.toString()).append("\n");
        }
        return sb.toString();
    }
}
