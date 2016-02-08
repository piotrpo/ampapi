package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Resource data
 */
public class Resource
{
    /**
     * Persistent object's id
     */
    @SerializedName("id")
    public int id;

    /**
     * Resource type:
     * 0 - pdf
     * 1 - video
     * 2 - url
     */
    @SerializedName("type")
    public int type;

    /**
     * Name of resource
     */
    @SerializedName("name")
    public String name;

    /**
     * url of resource
     */
    @SerializedName("url")
    public String url;

    /**
     * Category associated with this resource
     */
    @SerializedName("category")
    public ResourceCategory category;

    /**
     * Indicates how to depict this item on the screen 0 - standard 1 - featured
     */
    @SerializedName("priority")
    public int priority;

    /**
     * Enumerated resource's categories
     */
    public enum ResourceCategory
    {
        SECURITY("Security"), USC("UCS");

        private final String displayName;

        ResourceCategory(String displayName)
        {
            this.displayName = displayName;
        }

        public String getDisplayName()
        {
            return displayName;
        }
    }
}
