package net.toolla.backend.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.toolla.datamapper.SectionHeaderData;
import net.toolla.datamapper.UiHint;

/**
 * Part of extended user profile
 */
public class Interests
{
    @Expose(serialize = false, deserialize = false)
    @UiHint(label = "", order = "order00", section = "interests")
    public transient SectionHeaderData sectionHeaderData = new SectionHeaderData("What is your primary practice focus?\n" +
            "(Select all that apply)");

    @UiHint(label = "Data Center", order = "order01", section = "interests")
    @SerializedName("dataCenter")
    public boolean dataCenter;

    @UiHint(label = "Networking", order = "order02", section = "interests")
    @SerializedName("networking")
    public boolean networking;

    @UiHint(label = "Virtualization", order = "order03", section = "interests")
    @SerializedName("virtualization")
    public boolean virtualization;
    @UiHint(label = "Servers/Computing", order = "order04", section = "interests")
    @SerializedName("serversComputing")

    public boolean serversComputing;
    @UiHint(label = "Cloud", order = "order05", section = "interests")
    @SerializedName("cloud")

    public boolean cloud;
    @UiHint(label = "Storage", order = "order06", section = "interests")
    @SerializedName("storage")

    public boolean storage;
    @UiHint(label = "Converged Infrastructure", order = "order07", section = "interests")
    @SerializedName("convergedInfrastructure")

    public boolean convergedInfrastructure;
    @UiHint(label = "Business Applications", order = "order08", section = "interests")
    @SerializedName("bussinessApplications")

    public boolean bussinessApplications;

    @UiHint(label = "Managed Services", order = "order09", section = "interests")
    @SerializedName("managedServices")

    public boolean managedServices;

    @UiHint(label = "Security", order = "order10", section = "interests")
    @SerializedName("security")

    public boolean security;

    @UiHint(label = "Backup and Recovery", order = "order11", section = "interests")
    @SerializedName("backupAndRecovery")

    public boolean backupAndRecovery;

    @UiHint(label = "Other interests", order = "order12", section = "interests")
    @SerializedName("otherInterests")
    public String otherInterests;


    @Expose(serialize = false, deserialize = false)
    public transient SectionHeaderData sectionHeaderData1 = new SectionHeaderData("n what area(s) are you looking to expand your knowledge or expertise/training?\n" +
            "(Select all that apply)");


    ///////////


    @UiHint(label = "Cisco Data Center portfolio (UCS, Nexus)", section = "training", order = "order10")
    @SerializedName("ciscoPortfolio")
    public boolean ciscoPortfolio;
    @UiHint(label = "Cisco Services", section = "training", order = "order11")
    @SerializedName("ciscoServices")
    public boolean ciscoServices;
    @UiHint(label = "FlexPod Datacenter", section = "training", order = "order12")
    @SerializedName("flexpodDatacenter")
    public boolean flexpodDatacenter;
    @UiHint(label = "FlexPod Express", section = "training", order = "order13")
    @SerializedName("flexpodExpress")
    public boolean flexpodExpress;
    @UiHint(label = "FlexPod Select (Hadoop)", section = "training", order = "order14")
    @SerializedName("flexpodSelect")
    public boolean flexpodSelect;
    @UiHint(label = "SAP-HANA", section = "training", order = "order15")
    @SerializedName("flexpodSap")
    public boolean flexpodSap;
    @UiHint(label = "Asigra", section = "training", order = "order16")
    @SerializedName("asigra")
    public boolean asigra;
    @UiHint(label = "Vblock", section = "training", order = "order17")
    @SerializedName("vBlock")
    public boolean vBlock;
    @UiHint(label = "VSPEX", section = "training", order = "order18")
    @SerializedName("vspex")
    public boolean vspex;
    @UiHint(label = "Hitachi UCP", section = "training", order = "order19")
    @SerializedName("hitachiUcp")
    public boolean hitachiUcp;
    @UiHint(label = "Storage + Server Solutions", section = "training", order = "order20")
    @SerializedName("storaServerSolution")
    public boolean storaServerSolution;
    @UiHint(label = "Other", section = "training", order = "order21")
    @SerializedName("otherTrainigs")
    public String otherTrainigs;

//    @UiHint(label = "What markets do you serve?", section = "training", order = "order00")
//    public boolean ;
//
//    @UiHint(label = "How would you describe your current data center business practice?", section = "training", order = "order00")
//    public boolean ;


    @UiHint(label = "How many locations do you have?", section = "training", order = "order22")
    @SerializedName("numberOfLocations")

    public int numberOfLocations;
}
