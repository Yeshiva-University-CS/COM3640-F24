package edu.yu.pl.DataModel;

/**
 * The abstract Resource class represents a cloud resource that 
 * can be deployed in a cloud environment. 
 * This class contains common properties such as name, region, 
 * attached subnet, image, and resource type.
 * 
 * Subclasses of Resource represent specific types of resources 
 * such as Server, Database, Cache, and LoadBalancer.
 */
public abstract class Resource {
    /** The name of the resource. */
    protected String name;
    
    /** The region where the resource is deployed. */
    protected String region;
    
    /** The subnet to which the resource is attached. */
    protected String attachedSubnet;
    
    /** The container image used by the resource. */
    protected String image;
    
    /** The type of the resource (e.g., SERVER, DATABASE). */
    protected ResourceType resourceType;

    /**
     * Constructs a new Resource with the specified name, region, 
     * resource type, and image.
     * 
     * @param name the name of the resource
     * @param region the region where the resource is deployed
     * @param resourceType the type of the resource
     * @param image the container image used by the resource; 
     *              if null, a default image will be used
     */
    public Resource(String name, String region, ResourceType resourceType, String image) {
        this.name = name;
        this.region = region;
        this.resourceType = resourceType;
        this.image = (image != null) ? image : "default-image";  // Fallback to default image if not specified
    }

    /**
     * Attaches the resource to a specific subnet.
     * 
     * @param subnet the name of the subnet to attach the resource to
     */
    public void attach(String subnet) {
        this.attachedSubnet = subnet;
    }

    /**
     * Returns the name of the resource.
     * 
     * @return the resource name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the region where the resource is deployed.
     * 
     * @return the region of the resource
     */
    public String getRegion() {
        return region;
    }

    /**
     * Returns the name of the subnet to which the resource is attached.
     * 
     * @return the attached subnet
     */
    public String getAttachedSubnet() {
        return attachedSubnet;
    }

    /**
     * Returns the container image used by the resource.
     * 
     * @return the container image
     */
    public String getImage() {
        return image;
    }

    /**
     * Returns the type of the resource (e.g., SERVER, DATABASE).
     * 
     * @return the resource type
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Abstract method that should be implemented by subclasses 
     * to display specific information about the resource.
     */
    public abstract void displayResourceInfo();

    /**
     * Returns a string representation of the resource, including its name, region,
     * attached subnet, and container image.
     * 
     * @return the string representation of the resource
     */
    @Override
    public String toString() {
        return "Resource Name: " + name + 
               "\nRegion: " + region + 
               "\nAttached Subnet: " + attachedSubnet + 
               "\nImage: " + image;
    }
}
