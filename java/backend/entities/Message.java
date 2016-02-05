package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Data class for message
 */
public class Message
{
    /**
     * persistent id
     */
    @SerializedName("id")
    public int id;

    /**
     * Release date
     */
    @SerializedName("published")
    public Date published;

    /**
     * Title
     */
    @SerializedName("title")
    public String title;

    /**
     * Body of message
     */
    @SerializedName("body")
    public String body;
}
