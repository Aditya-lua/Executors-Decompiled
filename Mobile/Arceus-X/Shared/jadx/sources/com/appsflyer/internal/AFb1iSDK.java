package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.oaid.OaidClient;
import com.appsflyer.sdk_base.logger.LogTag;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1iSDK {
    public static String AFLogger;
    public static Boolean unregisterClient;

    /* JADX INFO: renamed from: h_ */
    public static AFb1lSDK m8741h_(ContentResolver contentResolver) {
        String string;
        Boolean bool = unregisterClient;
        if ((bool != null && !bool.booleanValue()) || contentResolver == null || AFa1tSDK.m8724d().AFKeystoreWrapper.registerClient().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i10 == 0) {
            return new AFb1lSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i10 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m8961e(LogTag.ADVERTISING_ID, "Failed to fetch Amazon Advertising ID: ad tracking may be limited", th2);
            string = "";
        }
        return new AFb1lSDK(string, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public static AFb1lSDK unregisterClient(Context context) {
        Boolean lat;
        AFc1eSDK androidIdData = AFa1tSDK.m8724d().AFKeystoreWrapper.setAndroidIdData();
        String str = AFLogger;
        boolean z10 = str != null;
        if (z10) {
            lat = null;
        } else {
            Boolean bool = unregisterClient;
            if (bool == null || bool.booleanValue()) {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(androidIdData.enableTCFDataCollection.getLevel() > AFLogger.LogLevel.NONE.getLevel());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id2 = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id2;
                        } catch (Throwable unused) {
                            str = id2;
                            AFLogger.INSTANCE.m8960d(LogTag.ADVERTISING_ID, "OAID library not available in application");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            } else {
                lat = null;
                str = null;
            }
        }
        if (str == null) {
            return null;
        }
        AFb1lSDK aFb1lSDK = new AFb1lSDK(str, lat);
        aFb1lSDK.unregisterClient = Boolean.valueOf(z10);
        return aFb1lSDK;
    }
}
