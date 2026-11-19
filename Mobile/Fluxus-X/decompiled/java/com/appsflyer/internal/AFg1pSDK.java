package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1pSDK implements AFg1wSDK {
    private static IntentFilter unregisterClient = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFg1wSDK
    @NonNull
    public final AFg1wSDK.AFa1vSDK registerClient(@NonNull Context context) {
        String str;
        String str2 = null;
        float f10 = 0.0f;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, unregisterClient);
            if (intentRegisterReceiver != null) {
                if (2 == intentRegisterReceiver.getIntExtra("status", -1)) {
                    int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = "ac";
                    } else if (intExtra != 2) {
                        str = intExtra != 4 ? "other" : "wireless";
                    } else {
                        str = "usb";
                    }
                } else {
                    str = "no";
                }
                str2 = str;
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f10 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.DEVICE_DATA, "Failed to register receiver for battery status", th2, false, false);
        }
        return new AFg1wSDK.AFa1vSDK(f10, str2);
    }
}
