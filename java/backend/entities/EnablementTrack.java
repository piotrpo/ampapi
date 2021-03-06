package net.toolla.backend.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Top data class about single enablement track
 */
public class EnablementTrack
{

    /**
     * Persistent id of track
     */
    @SerializedName("trackId")
    public int trackId;

    /**
     * Name of enablement track
     */
    @SerializedName("trackName")
    public String trackName;

    //quiz part

    /**
     * True if user previously passed this test
     */
    @SerializedName("alreadyPassed")
    public boolean alreadyPassed;

    /**
     * Number of previous attempts to pass the exam
     */
    @SerializedName("previousAttempts")
    public int previousAttempts;

    /**
     * Number of attempts left
     */
    @SerializedName("attemptsLeft")
    public int attemptsLeft;

    /**
     * List of associated critical documents
     */
    @SerializedName("criticalDocuments")
    public List<Resource> criticalDocuments;

    /**
     * List of additional documents
     */
    @SerializedName("additionalDocuments")
    public List<Resource> additionalDocuments;

    /**
     * List of videos
     */
    @SerializedName("videos")
    public List<Resource> videos;
}
