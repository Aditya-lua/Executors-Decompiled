package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.FirebaseMessagingServiceListener;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1vSDK {
    public final AFc1kSDK registerClient = AFa1tSDK.d().AFKeystoreWrapper.AFKeystoreWrapper();
    private final AppsFlyerProperties AFKeystoreWrapper = AFa1tSDK.d().AFKeystoreWrapper.registerClient();

    public static boolean registerClient(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return context.getPackageManager().queryIntentServices(new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class), 0).size() > 0;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th2);
        }
    }

    public final AFg1sSDK d() {
        String string;
        String string2;
        String strD = this.registerClient.d("afUninstallToken");
        long jUnregisterClient = this.registerClient.unregisterClient("afUninstallToken_received_time", 0L);
        boolean zAFKeystoreWrapper = this.registerClient.AFKeystoreWrapper("afUninstallToken_queued");
        this.registerClient.registerClient("afUninstallToken_queued", false);
        if (strD == null && (string2 = this.AFKeystoreWrapper.getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            strD = strArrSplit[strArrSplit.length - 1];
        }
        if (jUnregisterClient == 0 && (string = this.AFKeystoreWrapper.getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    jUnregisterClient = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (strD != null) {
            return new AFg1sSDK(strD, jUnregisterClient, zAFKeystoreWrapper);
        }
        return null;
    }
}
