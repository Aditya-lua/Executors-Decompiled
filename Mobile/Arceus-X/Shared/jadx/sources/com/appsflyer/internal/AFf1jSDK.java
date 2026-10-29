package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1jSDK {
    public final AFc1kSDK AFKeystoreWrapper;
    public long registerClient;
    public long unregisterClient;

    /* JADX INFO: renamed from: d */
    public AFh1aSDK f6978d = null;
    public AFh1aSDK AFLogger = unregisterClient();

    public AFf1jSDK(AFc1kSDK aFc1kSDK) {
        this.AFKeystoreWrapper = aFc1kSDK;
        this.registerClient = aFc1kSDK.unregisterClient("af_rc_timestamp", 0L);
        this.unregisterClient = aFc1kSDK.unregisterClient("af_rc_max_age", 0L);
    }

    private AFh1aSDK unregisterClient() {
        String strMo8762d = this.AFKeystoreWrapper.mo8762d("af_remote_config");
        if (strMo8762d == null) {
            AFLogger.INSTANCE.m8960d(LogTag.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFh1aSDK(new String(Base64.decode(strMo8762d, 2), Charset.defaultCharset()));
        } catch (Exception e10) {
            AFLogger.INSTANCE.m8962e(LogTag.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e10, true);
            return null;
        }
    }
}
