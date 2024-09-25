package edu.yu.pl.DataModel;

import java.util.Map;

/**
 * The Container class represents an independent container resource that can be deployed
 * in a cloud environment. This class does not derive from Resource and is managed
 * separately.
 */
public class Container {

    /** The name of the container. */
    private String name;

    /** The container image used by the container. */
    private String image;

    /** The ports exposed by the container. */
    private int[] ports;

    /** The environment variables used by the container. */
    private Map<String, String> environment;

    /**
     * Constructs a new Container with the specified name, image, ports, and environment variables.
     * 
     * @param name the name of the container
     * @param image the container image used by the container
     * @param ports the ports exposed by the container
     * @param environment the environment variables used by the container
     */
    public Container(String name, String image, int[] ports, Map<String, String> environment) {
        this.name = name;
        this.image = image;
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
     * Returns the image used by the container.
     * 
     * @return the container image
     */
    public String getImage() {
        return image;
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
     * Displays specific information about the container.
     */
    public void displayContainerInfo() {
        System.out.println(this);
        System.out.println("Ports: " + java.util.Arrays.toString(ports));
        System.out.println("Environment Variables: " + environment);
    }

    /**
     * Returns a string representation of the container, including
     * the image, ports, and environment variables.
     * 
     * @return the string representation of the container
     */
    @Override
    public String toString() {
        return "Container Name: " + name + 
               "\nImage: " + image + 
               "\nPorts: " + java.util.Arrays.toString(ports) + 
               "\nEnvironment: " + environment;
    }
}
