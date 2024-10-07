package edu.yu.pl.DataModel;

import java.util.ArrayList;
import java.util.List;

/**
 * This Netowrk class represents a Virtual Private Cloud (VPC) resource that can be deployed
 * in a cloud environment. A VPC contains subnets that divide the VPC's IP range into smaller
 * ranges.
 */
public class Network {

    /** The CIDR block that defines the IP address range of the VPC. */
    private String cidrBlock;

    /** The list of subnets within the VPC. */
    private List<Subnet> subnets;

    /**
     * Constructs a new VPC with the specified CIDR block.
     * 
     * @param cidrBlock the CIDR block that defines the IP address range of the VPC
     */
    public Network(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        this.subnets = new ArrayList<>();
    }

    /**
     * Adds a subnet to the VPC.
     * 
     * @param subnet the subnet to be added to the VPC
     */
    public void addSubnet(Subnet subnet) {
        this.subnets.add(subnet);
    }

    /**
     * Returns the CIDR block of the VPC.
     * 
     * @return the CIDR block of the VPC
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * Returns the list of subnets in the VPC.
     * 
     * @return the list of subnets in the VPC
     */
    public List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * Returns a string representation of the VPC, including its CIDR block
     * and the list of subnets.
     * 
     * @return the string representation of the VPC
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VPC CIDR Block: ").append(cidrBlock).append("\n");
        sb.append("Subnets: \n");
        for (Subnet subnet : subnets) {
            sb.append(subnet.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * The Subnet class represents a subnet within a VPC, with its own CIDR block.
     */
    public static class Subnet {

        /** The name of the subnet. */
        private String name;

        /** The CIDR block that defines the IP address range of the subnet. */
        private String cidrBlock;

        /**
         * Constructs a new Subnet with the specified name and CIDR block.
         * 
         * @param name the name of the subnet
         * @param cidrBlock the CIDR block that defines the IP address range of the subnet
         */
        public Subnet(String name, String cidrBlock) {
            this.name = name;
            this.cidrBlock = cidrBlock;
        }

        /**
         * Returns the name of the subnet.
         * 
         * @return the name of the subnet
         */
        public String getName() {
            return name;
        }

        /**
         * Returns the CIDR block of the subnet.
         * 
         * @return the CIDR block of the subnet
         */
        public String getCidrBlock() {
            return cidrBlock;
        }

        /**
         * Returns a string representation of the subnet, including its name and CIDR block.
         * 
         * @return the string representation of the subnet
         */
        @Override
        public String toString() {
            return "Subnet [Name: " + name + ", CIDR Block: " + cidrBlock + "]";
        }
    }
}
