package avnet.toolla.net.avnet.communication.backend.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Extended user's profile
 */
public class UserProfile extends BasicUserProfile {


    @SerializedName("accountManagerId")
    public int accountManagerId;
    @SerializedName("avnetCoverage")
    public Coverage avnetCoverage;
    @SerializedName("certificates")
    public Certificates certificates = new Certificates();
    @SerializedName("other")
    public UserProfileOther other = new UserProfileOther();
    @SerializedName("interests")
    public Interests interests = new Interests();

    public enum Coverage {
        C_1_4("0% - 24%"),
        C_2_4("25% - 49%"),
        C_3_4("50% - 75%"),
        C_4_4("76% - 99%"),
        TOTAL("100%");

        private String displayName;

        Coverage(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
