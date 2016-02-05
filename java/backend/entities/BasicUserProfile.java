package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

/**

 * User registration data
 */
public class BasicUserProfile
{
    /**
     * First name
     */
    @SerializedName("firstName")
    public String firstName;
    /**
     * Last name
     */
    @SerializedName("lastName")
    public String lastName;

    /**
     * User's company
     */
    @SerializedName("company")
    public String company;
    /**
     * Phone
     */
    @SerializedName("phone")
    public String phone;

    /**
     * email
     */
    @SerializedName("email")
    public String email;

    /**
     * Working function
     */
    @SerializedName("workingFunction")
    public WorkingFunction workingFunction;

    /**
     * Parnership level
     */
    @SerializedName("partnerLevel")
    public PartnerLevel partnerLevel;

    /**
     * password set by user
     * This field should never be
     */
    @SerializedName("password")
    public String password;

    /**
     * Enumerated values for working function
     */
    public enum WorkingFunction
    {
        FIELD_SALES("Field Sales"),
        INSIDE_SALES("Inside Sales"),
        MARKETING_OPERATIONS("Marketing Operations"),
        OWNER("Owner"),
        PRACTICE_MANAGER("Practice Manager"),
        PURCHASING("Purchasing"),
        SALES_MANAGER("Sales Manager"),
        SENIOR_EXECUTIVE("Senior Executive"),
        TECHNICAL("Technical");

        private String displayName;
        WorkingFunction(String displayName)
        {
            this.displayName = displayName;
        }

        public String getDisplayName()
        {
            return displayName;
        }
    }

    /**
     * Enumerated values for partner level
     */
    public enum PartnerLevel
    {
        REGISTERED("Registered"),
        SELECT("Select"),
        PREMIER("Premier"),
        SILVER("Silver"),
        GOLD("Gold"),
        NOT_SURE("Not Sure");

        private String displayName;
        PartnerLevel(String displayName)
        {
            this.displayName = displayName;
        }

        public String getDisplayName()
        {
            return displayName;
        }
    }
}
