package edu.yu.pl.DataModel;

/**
 * The ResourceType enum represents different types of resources that can be
 * used in a deployment.
 */
public enum ResourceType {
    /**
     * Represents a server resource.
     */
    SERVER,

    /**
     * Represents a database resource.
     */
    DATABASE,

    /**
     * Represents a cache resource.
     */
    CACHE,

    /**
     * Represents a load balancer resource.
     */
    LOAD_BALANCER
}