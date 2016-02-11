package net.toolla.backend.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.toolla.datamapper.UiHint;
import net.toolla.datamapper.SectionHeaderData;

/**
 * Part of extended user profile
 */
public class UserProfileOther
{
    @Expose(serialize = false, deserialize = false)
    @UiHint(label = "", section = "a_otherSolutions", order = "order00")
    public transient SectionHeaderData header1 = new SectionHeaderData("What other solutions are you currently selling?\n" +
            "(Select all that apply)");

    @UiHint(label = "IBM", section = "a_otherSolutions", order = "order01")@SerializedName("ibm")@Expose
    public boolean ibm;
    @UiHint(label = "HP", section = "a_otherSolutions", order = "order02")@SerializedName("hp")@Expose
    public boolean hp;
    @UiHint(label = "Dell", section = "a_otherSolutions", order = "order03")@SerializedName("dell")@Expose
    public boolean dell;
    @UiHint(label = "Other", section = "a_otherSolutions", order = "order04")@SerializedName("otherVendors")@Expose
    public boolean otherVendors;

    @Expose(serialize = false, deserialize = false)
    @UiHint(label = "", section = "b_socialMedia", order = "order00")
    public transient SectionHeaderData header2 = new SectionHeaderData("Do you or your company have a social media presence?");

    @UiHint(label = "LinkedIn", section = "b_socialMedia", order = "order01")@SerializedName("linkedIn")@Expose
    public boolean linkedIn;
    @UiHint(label = "Twitter", section = "b_socialMedia", order = "order02")@SerializedName("twitter")@Expose
    public boolean twitter;
    @UiHint(label = "Facebook", section = "b_socialMedia", order = "order03")@SerializedName("facebook")@Expose
    public boolean facebook;
    @UiHint(label = "YouTube", section = "b_socialMedia", order = "order04")@SerializedName("youTube")@Expose
    public boolean youTube;
    @UiHint(label = "Google+", section = "b_socialMedia", order = "order05")@SerializedName("googlePlus")@Expose
    public boolean googlePlus;
    @UiHint(label = "Other", section = "b_socialMedia", order = "order05")@SerializedName("otherServices")@Expose
    public String otherSocialServices;
}
