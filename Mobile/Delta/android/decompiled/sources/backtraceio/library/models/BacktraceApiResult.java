package backtraceio.library.models;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceApiResult {

    @SerializedName(Payload.RESPONSE)
    public String response;

    @SerializedName("_rxid")
    public String rxId;

    public BacktraceApiResult(String str, String str2) {
        this.rxId = str;
        this.response = str2;
    }

    public String getResponse() {
        return this.response;
    }

    public String getRxId() {
        return this.rxId;
    }
}
