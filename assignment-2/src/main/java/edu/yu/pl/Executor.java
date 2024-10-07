package edu.yu.pl;

import antlr4.CloudDeployBaseVisitor;
import antlr4.CloudDeployParser;
import edu.yu.pl.DataModel.Network;


public class Executor extends CloudDeployBaseVisitor<Object> {

    @Override
    public Network visitNetwork(CloudDeployParser.NetworkContext ctx) {
        var network = new Network(visitCidrBlock(ctx.cidrBlock()));
        if(ctx.subnet() != null) {
            for (var subnetCtx : ctx.subnet()) {
                network.addSubnet(visitSubnet(subnetCtx));
            }
        }
        return network;
    }

    @Override
    public String visitCidrBlock(CloudDeployParser.CidrBlockContext ctx) {
        return ParseUtils.extractString(ctx.addr.getText());
    }

    @Override
    public Network.Subnet visitSubnet(CloudDeployParser.SubnetContext ctx) {
        var name = ParseUtils.extractString(ctx.name.getText());
        return new Network.Subnet(name, visitCidrBlock(ctx.cidrBlock()));
    }


}

