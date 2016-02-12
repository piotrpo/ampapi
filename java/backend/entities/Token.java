package net.toolla.backend.entities;

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

    /**
     * Does user has access to internal messages center
     */
    @SerializedName("messageCenterAccess")
    public boolean messageCenterAccess = false;
}
