package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1cSDK implements AFb1bSDK {

    @Nullable
    private AFb1gSDK AFKeystoreWrapper;

    @NotNull
    private final ScheduledExecutorService AFLogger;

    @NotNull
    private final AFa1qSDK registerClient;

    public AFb1cSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        this.AFLogger = scheduledExecutorService;
        this.registerClient = aFa1qSDK;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper() {
        AFb1bSDK.AFa1zSDK aFa1zSDK;
        AFb1gSDK aFb1gSDK = this.AFKeystoreWrapper;
        if (aFb1gSDK == null || (aFa1zSDK = aFb1gSDK.AFLogger) == null) {
            return;
        }
        aFa1zSDK.registerClient();
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void unregisterClient(@NotNull Context context, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFKeystoreWrapper != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.m31981d(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFKeystoreWrapper);
        }
        this.AFKeystoreWrapper = null;
        AFb1gSDK aFb1gSDK = new AFb1gSDK(this.AFLogger, aFa1zSDK, this.registerClient);
        this.AFKeystoreWrapper = aFb1gSDK;
        if (context instanceof Activity) {
            aFb1gSDK.onActivityResumed((Activity) context);
        }
        Application applicationM8936X_ = AFj1qSDK.m8936X_(context);
        if (applicationM8936X_ != null) {
            applicationM8936X_.registerActivityLifecycleCallbacks(this.AFKeystoreWrapper);
        }
    }
}
