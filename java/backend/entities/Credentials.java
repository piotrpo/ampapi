package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Credentials
 */
public class Credentials
{
    /**
     * User name
     */
    @SerializedName("username")
    public String username;

    /**
     * Password
     */
    @SerializedName("password")
    public String password;
}
