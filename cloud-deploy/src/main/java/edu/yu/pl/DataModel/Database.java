package edu.yu.pl.DataModel;

/**
 * The Database class represents a database resource that can be deployed
 * in a cloud environment. This class extends the abstract Resource class.
 */
public class Database extends Resource {

    /** The type of the database (e.g., postgres, mysql). */
    private String type;

    /** The version of the database. */
    private String version;

    /** The number of shards for the database. */
    private int shards;

    /**
     * Constructs a new Database with the specified name, region, database type,
     * version, number of shards, and image.
     * 
     * @param name the name of the database resource
     * @param region the region where the database is deployed
     * @param type the type of the database (e.g., postgres, mysql)
     * @param version the version of the database
     * @param shards the number of shards for the database
     * @param image the container image used by the database; 
     *              if null, a default image will be used
     */
    public Database(String name, String region, String type, String version, int shards, String image) {
        super(name, region, ResourceType.DATABASE, image);  // Pass the image to the Resource constructor
        this.type = type;
        this.version = version;
        this.shards = shards;
    }

    /**
     * Returns the type of the database.
     * 
     * @return the database type
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the version of the database.
     * 
     * @return the database version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Returns the number of shards for the database.
     * 
     * @return the number of database shards
     */
    public int getShards() {
        return shards;
    }

    /**
     * Displays specific information about the database resource.
     */
    @Override
    public void displayResourceInfo() {
        System.out.println(this);
        System.out.println("Database Type: " + type);
        System.out.println("Version: " + version);
        System.out.println("Shards: " + shards);
    }

    /**
     * Returns a string representation of the database, including
     * the database type, version, number of shards, and other resource details.
     * 
     * @return the string representation of the database
     */
    @Override
    public String toString() {
        return super.toString() + 
               "\nDatabase Type: " + type + 
               "\nVersion: " + version + 
               "\nShards: " + shards;
    }
}
