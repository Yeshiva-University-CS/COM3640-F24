package edu.yu.pl.DataModel;

/**
 * The Server class represents a server resource that can be deployed
 * in a cloud environment. This class extends the abstract Resource class.
 */
public class Server extends Resource {
    
    /** The instance type of the server (e.g., t2.micro). */
    private String instanceType;

    /**
     * Constructs a new Server with the specified name, region, instance type, and image.
     * 
     * @param name the name of the server
     * @param region the region where the server is deployed
     * @param instanceType the instance type of the server
     * @param image the container image used by the server; 
     *              if null, a default image will be used
     */
    public Server(String name, String region, String instanceType, String image) {
        super(name, region, ResourceType.SERVER, image);  // Pass the image to the Resource constructor
        this.instanceType = instanceType;
    }

    /**
     * Returns the instance type of the server.
     * 
     * @return the server instance type
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * Displays specific information about the server resource.
     */
    @Override
    public void displayResourceInfo() {
        System.out.println(this);
        System.out.println("Instance Type: " + instanceType);
    }

    /**
     * Returns a string representation of the server, including
     * the instance type and other resource details.
     * 
     * @return the string representation of the server
     */
    @Override
    public String toString() {
        return super.toString() + "\nInstance Type: " + instanceType;
    }
}
