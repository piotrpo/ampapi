package net.toolla.backend.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * ArticleCategory of enablement tracks
 */

public class EnablementTrackCategory
{
    /**
     * Persistent object id
     */
    @SerializedName("id")
    public int id;

    /**
     * Name of track
     */
    @SerializedName("name")
    public String name;

    /**
     * True if user is permited to take this track
     */
    @SerializedName("permissionGranted")
    public boolean permissionGranted;

    /**
     * Tracks associated with this category
     */
    @SerializedName("tracks")
    public List<EnablementTrack> tracks;

    /**
     * Graphical asset for this category pointed by it's url
     */
    @SerializedName("iconUrl")
    public String iconUrl;
}
