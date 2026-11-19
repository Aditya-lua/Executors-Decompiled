package com.appsflyer.share.deeplink;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DeepLinkResult {
    private final DeepLink deepLink;
    private final Error error;

    @NonNull
    private final Status status;

    public enum Error {
        TIMEOUT,
        NETWORK,
        HTTP_STATUS_CODE,
        UNEXPECTED,
        DEVELOPER_ERROR
    }

    public enum Status {
        FOUND,
        NOT_FOUND,
        ERROR
    }

    public DeepLinkResult(DeepLink deepLink, Error error) {
        this.deepLink = deepLink;
        this.error = error;
        if (error != null) {
            this.status = Status.ERROR;
        } else if (deepLink != null) {
            this.status = Status.FOUND;
        } else {
            this.status = Status.NOT_FOUND;
        }
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public Error getError() {
        return this.error;
    }

    @NonNull
    public Status getStatus() {
        return this.status;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", this.deepLink);
            jSONObject.put("error", this.error);
            jSONObject.put("status", this.status);
        } catch (JSONException e10) {
            AFLogger.INSTANCE.e(LogTag.DDL, "Error while creating deeplink JSON", e10, false, false);
        }
        return jSONObject.toString();
    }
}
