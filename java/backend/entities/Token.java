package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by piotrpotulski on 05/01/16.
 *
 * Session token
 */
public class Token
{
    /**
     * Session token string
     */
    @SerializedName("token")
    public String tokenString = "";
}