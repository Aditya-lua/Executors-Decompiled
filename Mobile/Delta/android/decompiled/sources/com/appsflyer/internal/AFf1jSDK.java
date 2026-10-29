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

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AFh1aSDK f5350d = null;
    public AFh1aSDK AFLogger = unregisterClient();

    public AFf1jSDK(AFc1kSDK aFc1kSDK) {
        this.AFKeystoreWrapper = aFc1kSDK;
        this.registerClient = aFc1kSDK.unregisterClient("af_rc_timestamp", 0L);
        this.unregisterClient = aFc1kSDK.unregisterClient("af_rc_max_age", 0L);
    }

    private AFh1aSDK unregisterClient() {
        String strD = this.AFKeystoreWrapper.d("af_remote_config");
        if (strD == null) {
            AFLogger.INSTANCE.d(LogTag.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFh1aSDK(new String(Base64.decode(strD, 2), Charset.defaultCharset()));
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(LogTag.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e10, true);
            return null;
        }
    }
}
