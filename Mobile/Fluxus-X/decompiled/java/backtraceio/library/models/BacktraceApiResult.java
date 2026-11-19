package backtraceio.library.models;

import com.appsflyer.sdk_base.referrer.Payload;
import mg.c;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceApiResult {

    @c(Payload.RESPONSE)
    public String response;

    @c("_rxid")
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
