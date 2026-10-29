package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1pSDK implements Runnable {

    @NotNull
    private final AFc1bSDK AFLogger;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final Map<String, Object> f6851d;

    @NotNull
    private final AFh1pSDK unregisterClient;

    public AFa1pSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFh1pSDK aFh1pSDK, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        this.AFLogger = aFc1bSDK;
        this.unregisterClient = aFh1pSDK;
        this.f6851d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFe1ySDK<?> aFf1vSDK;
        AFh1pSDK aFh1pSDK = this.unregisterClient;
        if (aFh1pSDK.f7030v == null && aFh1pSDK.f7031w == null) {
            AFf1uSDK aFf1uSDK = new AFf1uSDK(this.unregisterClient, this.AFLogger);
            aFf1uSDK.f6989v = this.f6851d;
            aFf1vSDK = aFf1uSDK;
        } else {
            aFf1vSDK = aFh1pSDK instanceof AFh1lSDK ? new AFf1vSDK((AFh1lSDK) this.unregisterClient, this.AFLogger) : new AFf1tSDK(this.unregisterClient, this.AFLogger, null, 4, null);
        }
        this.AFLogger.afWarnLog().m8820d(aFf1vSDK);
    }
}
