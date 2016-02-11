package net.toolla.backend.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by piotr on 08.01.2016.
 *
 * Data class single answer to test question
 */
public class QuizQuestionAnswer
{
    /**
     * Persistent id of object
     */
    @SerializedName("id")
    public int id;

    /**
     * Text of answer
     */
    @SerializedName("value")
    public String value;

    /**
     * Should be checked in correct answer?
     */
    @SerializedName("isCorrect")
    public boolean isCorrect;
}
