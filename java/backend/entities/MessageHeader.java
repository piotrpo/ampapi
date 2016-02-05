package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Header of single message
 */
public class MessageHeader
{
    /**
     * Persistent id
      */
    @SerializedName("id")
    public int id;

    /**
     * Title of message
     */
    @SerializedName("title")
    public String title;

    /**
     * Date of release
     */
    @SerializedName("published")
    public Date published;

    /**
     * First 20 words of message
     */
    @SerializedName("lead")
    public String lead;
}
