package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Single test's question
 */
public class QuizQuestion
{
    /**
     * Persistent id of object
     */
    @SerializedName("id")
    public int id;

    /**
     * Body of question
     */
    @SerializedName("question")
    public String question;

    /**
     * List of answers
     */
    @SerializedName("answers")
    public List<QuizQuestionAnswer> answers;
}
