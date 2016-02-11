package net.toolla.backend.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by piotr on 07.01.2016.
 *
 * test's header data
 */
public class QuizHeader
{
    /**
     * Persistent id
     */
    @SerializedName("id")
    public int id;

    /**
     *  Title of quiz
     */
    @SerializedName("title")
    public String title;
}
