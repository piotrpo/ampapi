package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Data class for article's header
 */
public class ArticleHeader
{
    /**
     * object's id
     */
    @SerializedName("id")
    public int id;

    /**
     * Article's title
     */
    @SerializedName("title")
    public String title;

    /**
     * First words of article (approx. 20 words)
     */
    @SerializedName("header")
    public String header;

    /**
     * Graphical asset associated with this article
     */
    @SerializedName("iconUrl")
    public String iconUrl;

    /**
     * ArticleCategory this article belongs to
     */
    @SerializedName("category")
    public ArticleCategory category;

    /**
     * Enum with article's categories
     */
    public enum ArticleCategory
    {
        EVENTS("Events"),
        FLEXPOD("Flexpod"),
        GOOD_NEWS("Good News"),
        INNOVATION("Innovation"),
        SERVICES("Services"),
        TRAINING("Training"),
        UCS ("UCS");

        private final String displayName;

        ArticleCategory(String displayName)
        {
            this.displayName = displayName;
        }


    }
}
