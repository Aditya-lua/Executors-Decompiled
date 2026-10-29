package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1hSDK implements AFb1bSDK.AFa1zSDK {

    @NotNull
    private final Function0<Unit> AFKeystoreWrapper;

    @NotNull
    private final AFc1bSDK AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFf1mSDK f5233d;

    @Nullable
    private final AFh1sSDK registerClient;

    public AFb1hSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull Function0<Unit> function0, @NotNull AFf1mSDK aFf1mSDK, @Nullable AFh1sSDK aFh1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(aFf1mSDK, "");
        this.AFLogger = aFc1bSDK;
        this.AFKeystoreWrapper = function0;
        this.f5233d = aFf1mSDK;
        this.registerClient = aFh1sSDK;
    }

    @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
    public final void m_(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "onActivityCreated with deeplink", false, 4, null);
        AFa1qSDK aFa1qSDKEnableTCFDataCollection = this.AFLogger.enableTCFDataCollection();
        AFa1kSDK.Companion companion = AFa1kSDK.INSTANCE;
        AFa1lSDK userPhone = this.AFLogger.setUserPhone();
        Intrinsics.checkNotNullExpressionValue(userPhone, "");
        aFa1qSDKEnableTCFDataCollection.b_(AFa1kSDK.Companion.d(userPhone), intent, this.AFLogger.valueOf().f5305d);
    }

    @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
    public final void n_(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "onBecameForeground", false, 4, null);
        this.AFLogger.e().AFLogger();
        this.AFLogger.setAppInviteOneLink().R_(intent);
        AFa1qSDK aFa1qSDKEnableTCFDataCollection = this.AFLogger.enableTCFDataCollection();
        AFa1kSDK.Companion companion = AFa1kSDK.INSTANCE;
        AFa1lSDK userPhone = this.AFLogger.setUserPhone();
        Intrinsics.checkNotNullExpressionValue(userPhone, "");
        aFa1qSDKEnableTCFDataCollection.b_(AFa1kSDK.Companion.d(userPhone), intent, this.AFLogger.valueOf().f5305d);
        this.AFLogger.i().AFKeystoreWrapper(this.f5233d);
        if (!AFe1jSDK.force) {
            this.AFLogger.afWarnLog().d(new AFe1jSDK(this.AFLogger));
        }
        if (this.AFLogger.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) < 2) {
            this.AFLogger.afInfoLog().registerClient();
        }
        AFh1sSDK aFh1sSDK = this.registerClient;
        if (aFh1sSDK != null) {
            AFa1qSDK aFa1qSDKEnableTCFDataCollection2 = this.AFLogger.enableTCFDataCollection();
            Intrinsics.checkNotNullExpressionValue(aFa1qSDKEnableTCFDataCollection2, "");
            aFh1sSDK.D_(intent, aFa1qSDKEnableTCFDataCollection2);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
    public final void registerClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.GENERAL;
        AFLoggerBase.i$default(aFLogger, logTag, "onBecameBackground", false, 4, null);
        AFh1xSDK aFh1xSDKE = this.AFLogger.e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = aFh1xSDKE.f5410e;
        if (j10 != 0) {
            long j11 = jCurrentTimeMillis - j10;
            if (j11 > 0 && j11 < 1000) {
                j11 = 1000;
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j11);
            aFh1xSDKE.afInfoLog = seconds;
            aFh1xSDKE.AFKeystoreWrapper.AFLogger("prev_session_dur", seconds);
        } else {
            aFLogger.i(logTag, "Metrics: fg ts is missing");
        }
        this.AFLogger.setAppInviteOneLink().registerClient();
        this.AFKeystoreWrapper.invoke();
    }
}
