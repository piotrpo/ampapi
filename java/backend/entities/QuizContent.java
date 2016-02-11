package net.toolla.backend.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piotr on 08.01.2016.
 * Data class for test content
 */
public class QuizContent
{
    /**
     * Persistent id
     */
    @SerializedName("id")
    public int testId;

    /**
     * Quiz title
     */
    @SerializedName("title")
    public String title;

    /**
     * List of questions
     */
    @SerializedName("questions")
    public List<QuizQuestion> questions;
}
