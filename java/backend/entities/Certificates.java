package net.toolla.backend.entities;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import net.toolla.datamapper.UiHint;

/**
 * Extended user's profile - certificates possessed by user
 */
public class Certificates
{

    {
        Log.d("certificates", "class created");
    }


    @UiHint(section = "Cisco", label = "DCUFT", order = "dcuft") @SerializedName("dcuft") public boolean dcuft;
    @UiHint(section = "Cisco", label = "DCUCT", order = "dcuct") @SerializedName("dcuct") public boolean dcuct;
    @UiHint(section = "Cisco", label = "DCUCI", order = "dcuci") @SerializedName("dcuci") public boolean dcuci;
    @UiHint(section = "Cisco", label = "DCUCD", order = "dcucd") @SerializedName("dcucd") public boolean dcucd;
    @UiHint(section = "Cisco", label = "DCUCAM", order = "dcucam") @SerializedName("dcucam") public boolean dcucam;
    @UiHint(section = "Cisco", label = "CSE", order = "cse") @SerializedName("cse") public boolean cse;
    @UiHint(section = "Cisco", label = "DCA", order = "dca") @SerializedName("dca") public boolean dca;
    @UiHint(section = "Cisco", label = "Not Sure", order = "zzznotsure") @SerializedName("ciscoNotsure") public boolean ciscoNotsure;
    @UiHint(section = "NetApp", label = "NASP", order = "nasp") @SerializedName("nasp") public boolean nasp;
    @UiHint(section = "NetApp", label = "NASA", order = "nasa") @SerializedName("nasa") public boolean nasa;
    @UiHint(section = "NetApp", label = "NASEP", order = "nasep") @SerializedName("nasep") public boolean nasep;
    @UiHint(section = "NetApp", label = "NATSP", order = "natsp") @SerializedName("natsp") public boolean natsp;
    @UiHint(section = "NetApp", label = "NASAP", order = "nasap") @SerializedName("nasap") public boolean nasap;
    @UiHint(section = "NetApp", label = "NASVP", order = "nasvp") @SerializedName("nasvp") public boolean nasvp;
    @UiHint(section = "NetApp", label = "NAVDIP", order = "navdip") @SerializedName("navdip") public boolean navdip;
    @UiHint(section = "NetApp", label = "NAIP", order = "naip") @SerializedName("naip") public boolean naip;
    @UiHint(section = "NetApp", label = "NetApp ASE", order = "netappase") @SerializedName("netappase") public boolean netappase;
    @UiHint(section = "NetApp", label = "NCIE", order = "ncie") @SerializedName("ncie") public boolean ncie;
    @UiHint(section = "NetApp", label = "NCDA", order = "ncda") @SerializedName("ncda") public boolean ncda;
    @UiHint(section = "NetApp", label = "Not Sure", order = "zzznotsure") @SerializedName("netAppNotsure") public boolean netAppNotsure;
    @UiHint(section = "EMC", label = "EMCDS", order = "emcds") @SerializedName("emcds") public boolean emcds;
    @UiHint(section = "EMC", label = "EMCDCA", order = "emcdca") @SerializedName("emcdca") public boolean emcdca;
    @UiHint(section = "EMC", label = "EMCCA", order = "emcca") @SerializedName("emcca") public boolean emcca;
    @UiHint(section = "EMC", label = "EMCSA", order = "emcsa") @SerializedName("emcsa") public boolean emcsa;
    @UiHint(section = "EMC", label = "EMCTA", order = "emcta") @SerializedName("emcta") public boolean emcta;
    @UiHint(section = "EMC", label = "EMCPE", order = "emcpe") @SerializedName("emcpe") public boolean emcpe;
    @UiHint(section = "EMC", label = "EMCIE", order = "emcie") @SerializedName("emcie") public boolean emcie;
    @UiHint(section = "EMC", label = "EMCApD", order = "emcapd") @SerializedName("emcapd") public boolean emcapd;
    @UiHint(section = "EMC", label = "EMCSyA", order = "emcsya") @SerializedName("emcsya") public boolean emcsya;
    @UiHint(section = "EMC", label = "Not Sure", order = "zzznotsure") @SerializedName("emcNotsure") public boolean emcNotsure;
    @UiHint(section = "Hitachi", label = "HDSCP", order = "hdscp") @SerializedName("hdscp") public boolean hdscp;
    @UiHint(section = "Hitachi", label = "HDSCI", order = "hdsci") @SerializedName("hdsci") public boolean hdsci;
    @UiHint(section = "Hitachi", label = "HDSCSS", order = "hdscss") @SerializedName("hdscss") public boolean hdscss;
    @UiHint(section = "Hitachi", label = "HDSCA", order = "hdsca") @SerializedName("hdsca") public boolean hdsca;
    @UiHint(section = "Hitachi", label = "HDSCSM", order = "hdscsm") @SerializedName("hdscsm") public boolean hdscsm;
    @UiHint(section = "Hitachi", label = "HDSSTC", order = "hdsstc") @SerializedName("hdsstc") public boolean hdsstc;
    @UiHint(section = "Hitachi", label = "HDSSQ", order = "hdssq") @SerializedName("hdssq") public boolean hdssq;
    @UiHint(section = "Hitachi", label = "Not Sure", order = "zzznotsure") @SerializedName("hitachiNotsure") public boolean hitachiNotsure;
}
