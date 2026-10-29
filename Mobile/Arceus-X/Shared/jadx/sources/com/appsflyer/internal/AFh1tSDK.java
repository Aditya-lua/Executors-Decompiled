package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1tSDK implements AFh1wSDK {

    @Nullable
    private AFh1ySDK AFKeystoreWrapper;

    @Nullable
    private AFh1vSDK AFLogger;

    /* JADX INFO: renamed from: d */
    @Nullable
    private AFh1zSDK f7036d;

    @NotNull
    private final AFc1bSDK registerClient;

    public AFh1tSDK(@NotNull AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.registerClient = aFc1bSDK;
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void AFKeystoreWrapper() {
        AFh1zSDK aFh1zSDK = this.f7036d;
        if (aFh1zSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1zSDK);
            this.f7036d = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void AFLogger() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFLogger == null) {
            this.AFLogger = new AFh1vSDK(this.registerClient);
        }
        AFh1vSDK aFh1vSDK = this.AFLogger;
        Intrinsics.checkNotNull(aFh1vSDK);
        aFLogger.registerClient(aFh1vSDK);
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    /* JADX INFO: renamed from: d */
    public final void mo8893d() {
        AFh1ySDK aFh1ySDK = this.AFKeystoreWrapper;
        if (aFh1ySDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1ySDK);
            this.AFKeystoreWrapper = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    /* JADX INFO: renamed from: e */
    public final void mo8894e() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.f7036d == null) {
            AFc1iSDK aFc1iSDKAFLogger = this.registerClient.AFLogger();
            Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
            this.f7036d = new AFh1zSDK(aFc1iSDKAFLogger);
        }
        AFh1zSDK aFh1zSDK = this.f7036d;
        Intrinsics.checkNotNull(aFh1zSDK);
        aFLogger.registerClient(aFh1zSDK);
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void registerClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFKeystoreWrapper == null) {
            this.AFKeystoreWrapper = new AFh1ySDK(this.registerClient);
        }
        AFh1ySDK aFh1ySDK = this.AFKeystoreWrapper;
        Intrinsics.checkNotNull(aFh1ySDK);
        aFLogger.registerClient(aFh1ySDK);
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void unregisterClient() {
        AFh1vSDK aFh1vSDK = this.AFLogger;
        if (aFh1vSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1vSDK);
            this.AFLogger = null;
        }
    }
}
