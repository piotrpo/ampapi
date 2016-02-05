package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by piotrpotulski on 19/01/16.
 */
public class CalendarEvent
{
    /**
     * Persistent id of objects
     */
    @SerializedName("id")
    public String id;

    /**
     * Date of start
     */
    @SerializedName("dateStart")
    public Date dateStart;

    /**
     * Date of end
     */
    @SerializedName("dateEnd")
    public Date dateEnd;

    /**
     * Event's title
     */
    @SerializedName("name")
    public String name;

    /**
     * Event's description
     */
    @SerializedName("description")
    public String description;

    /**
     * Where event takes a place (address)
     */
    @SerializedName("place")
    public String place;

    /**
     * Event's agenda
     */
    @SerializedName("lineUp")
    public String lineUp;

    /**
     * Category this event belongs to
     */
    @SerializedName("category")
    public Category category;

    public enum Category
    {
        CLOUD("Cloud"),
        SALES("Sales"),
        CONVERGED_SOLUTIONS("Converged Solutions"),
        DATA_CENTER("Data Center"),
        FLEXPOD("FlexPod"),
        SECURITY("Security"),
        SERVICES("Services"),
        SMART_SERVICES("Smart Services"),
        UCS("UCS"),
        VERSASTACK("VersaStack"),
        INSTRUCTOR_LED("Instructor Led"),
        LIVE_EVENTS("Live Events"),
        WEBINARS("Webinars");


        String displayName;

        Category(String displayName)
        {
            this.displayName = displayName;
        }

        public String getDisplayName()
        {
            return displayName;
        }
    }
}
