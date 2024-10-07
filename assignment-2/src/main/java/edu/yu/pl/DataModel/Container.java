package edu.yu.pl.DataModel;

import java.util.Map;

/**
 * The Container class represents an independent container resource that references
 * a resource (e.g., server, database, or load balancer) in a cloud environment.
 * This class does not derive from Resource but references it separately.
 */
public class Container {

    /** The name of the container. */
    private String name;

    /** The resource associated with the container (e.g., server, db, etc.). */
    private Resource resource;

    /** The ports exposed by the container. */
    private int[] ports;

    /** The environment variables used by the container. */
    private Map<String, String> environment;

    /**
     * Constructs a new Container with the specified name, resource, ports, and environment variables.
     * 
     * @param name the name of the container
     * @param resource the resource referenced by the container
     * @param ports the ports exposed by the container
     * @param environment the environment variables used by the container
     */
    public Container(String name, Resource resource, int[] ports, Map<String, String> environment) {
        this.name = name;
        this.resource = resource;
        this.ports = ports;
        this.environment = environment;
    }

    /**
     * Returns the name of the container.
     * 
     * @return the name of the container
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the resource referenced by the container.
     * 
     * @return the resource referenced by the container
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * Returns the ports exposed by the container.
     * 
     * @return the ports exposed by the container
     */
    public int[] getPorts() {
        return ports;
    }

    /**
     * Returns the environment variables used by the container.
     * 
     * @return the environment variables used by the container
     */
    public Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * Deploys the container by printing a full representation of the resource it references.
     * This method provides detailed information about the container and its associated resource.
     */
    public void deploy() {
        System.out.println("Deploying Container: " + name);
        System.out.println("Associated Resource Details: ");
        System.out.println(resource);
        System.out.println("Ports: " + java.util.Arrays.toString(ports));
        System.out.println("Environment Variables: " + environment);
    }

    /**
     * Returns a string representation of the container, including
     * the resource, ports, and environment variables.
     * 
     * @return the string representation of the container
     */
    @Override
    public String toString() {
        return "Container Name: " + name + 
               "\nResource: " + resource.getName() + 
               "\nPorts: " + java.util.Arrays.toString(ports) + 
               "\nEnvironment: " + environment;
    }
}
