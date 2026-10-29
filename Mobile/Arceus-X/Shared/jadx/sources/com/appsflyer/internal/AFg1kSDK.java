package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.AppsFlyerConversionListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1kSDK {
    /* JADX INFO: renamed from: d */
    public static final void m8863d(@NotNull Map<String, ? extends Object> map, @Nullable AppsFlyerConversionListener appsFlyerConversionListener) {
        Intrinsics.checkNotNullParameter(map, "");
        if (appsFlyerConversionListener != null) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A02] Calling onConversionDataSuccess with:\n" + map, false, 4, null);
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    public static final void registerClient(@NotNull String str, @Nullable AppsFlyerConversionListener appsFlyerConversionListener) {
        Intrinsics.checkNotNullParameter(str, "");
        if (appsFlyerConversionListener != null) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A02] Calling onConversionFailure with:\n" + str, false, 4, null);
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}
