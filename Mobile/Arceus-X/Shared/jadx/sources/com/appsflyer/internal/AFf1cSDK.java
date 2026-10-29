package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.lvl.AppsFlyerLVL;
import com.appsflyer.sdk_base.logger.LogTag;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1cSDK {

    public interface AFa1zSDK {
        void AFKeystoreWrapper(String str, Exception exc);

        void registerClient(@NonNull String str, @NonNull String str2);
    }

    public final boolean AFLogger(long j10, @NonNull Context context, @NonNull final AFa1zSDK aFa1zSDK) {
        try {
            AppsFlyerLVL.checkLicense(j10, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFf1cSDK.5
                public final void onLvlFailure(Exception exc) {
                    aFa1zSDK.AFKeystoreWrapper("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1zSDK.registerClient(str, str2);
                    } else if (str2 == null) {
                        aFa1zSDK.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1zSDK.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "Exception while getting LVL data", th2);
            return false;
        }
    }
}
