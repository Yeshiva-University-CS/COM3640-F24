package edu.yu.pl.DataModel;

/**
 * The Cache class represents a cache resource that can be deployed
 * in a cloud environment. This class extends the abstract Resource class.
 */
public class Cache extends Resource {
    
    /** The type of the cache (e.g., redis, memcached). */
    private String type;
    
    /** The number of nodes in the cache cluster. */
    private int nodes;

    /**
     * Constructs a new Cache with the specified name, region, cache type, 
     * number of nodes, and image.
     * 
     * @param name the name of the cache resource
     * @param region the region where the cache is deployed
     * @param type the type of the cache (e.g., redis, memcached)
     * @param nodes the number of nodes in the cache cluster
     * @param image the container image used by the cache; 
     *              if null, a default image will be used
     */
    public Cache(String name, String region, String type, int nodes, String image) {
        super(name, region, ResourceType.CACHE, image);  // Pass the image to the Resource constructor
        this.type = type;
        this.nodes = nodes;
    }

    /**
     * Returns the type of the cache.
     * 
     * @return the cache type
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the number of nodes in the cache cluster.
     * 
     * @return the number of cache nodes
     */
    public int getNodes() {
        return nodes;
    }

    /**
     * Displays specific information about the cache resource.
     */
    @Override
    public void displayResourceInfo() {
        System.out.println(this);
        System.out.println("Cache Type: " + type);
        System.out.println("Nodes: " + nodes);
    }

    /**
     * Returns a string representation of the cache, including
     * the cache type, number of nodes, and other resource details.
     * 
     * @return the string representation of the cache
     */
    @Override
    public String toString() {
        return super.toString() + "\nCache Type: " + type + "\nNodes: " + nodes;
    }
}
