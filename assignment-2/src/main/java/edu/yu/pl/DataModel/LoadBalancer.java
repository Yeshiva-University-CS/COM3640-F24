package edu.yu.pl.DataModel;

/**
 * The LoadBalancer class represents a load balancer resource that can be deployed
 * in a cloud environment. This class extends the abstract Resource class.
 */
public class LoadBalancer extends Resource {

    /** The type of the load balancer (e.g., application, network). */
    private String type;

    /** The listeners (protocols) supported by the load balancer (e.g., HTTP, HTTPS). */
    private String[] listeners;

    /**
     * Constructs a new LoadBalancer with the specified name, region, load balancer type,
     * listeners, and image.
     * 
     * @param name the name of the load balancer resource
     * @param region the region where the load balancer is deployed
     * @param type the type of the load balancer (e.g., application, network)
     * @param listeners the listeners supported by the load balancer (e.g., HTTP, HTTPS)
     * @param image the container image used by the load balancer; 
     *              if null, a default image will be used
     */
    public LoadBalancer(String name, String region, String type, String[] listeners, String image) {
        super(name, region, ResourceType.LOAD_BALANCER, image);  // Pass the image to the Resource constructor
        this.type = type;
        this.listeners = listeners;
    }

    /**
     * Returns the type of the load balancer.
     * 
     * @return the load balancer type
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the listeners supported by the load balancer.
     * 
     * @return the listeners supported by the load balancer
     */
    public String[] getListeners() {
        return listeners;
    }

    /**
     * Displays specific information about the load balancer resource.
     */
    @Override
    public void displayResourceInfo() {
        System.out.println(this);
        System.out.println("Load Balancer Type: " + type);
        System.out.println("Listeners: " + java.util.Arrays.toString(listeners));
    }

    /**
     * Returns a string representation of the load balancer, including
     * the load balancer type, listeners, and other resource details.
     * 
     * @return the string representation of the load balancer
     */
    @Override
    public String toString() {
        return super.toString() + 
               "\nLoad Balancer Type: " + type + 
               "\nListeners: " + java.util.Arrays.toString(listeners);
    }
}
