package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1zSDK implements AFg1xSDK {

    @NotNull
    private final AFc1eSDK AFKeystoreWrapper;

    @NotNull
    private final Context unregisterClient;

    public AFg1zSDK(@NotNull Context context, @NotNull AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.unregisterClient = context;
        this.AFKeystoreWrapper = aFc1eSDK;
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    @Nullable
    public final AFg1ySDK registerClient() {
        String string;
        if (!Intrinsics.m31980c(this.AFKeystoreWrapper.afDebugLog, Boolean.TRUE)) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.unregisterClient);
            int i10 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i11 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i13 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i10 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                str = string;
            }
            return new AFg1ySDK(i12, i10, i11, i13, str);
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DMA, "TCF data collection exception", e10, false, false, false, false, 120, null);
            return null;
        }
    }
}
