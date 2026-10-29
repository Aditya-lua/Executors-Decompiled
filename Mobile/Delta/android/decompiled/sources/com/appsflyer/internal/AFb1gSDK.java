package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AFb1gSDK implements Application.ActivityLifecycleCallbacks {

    @Nullable
    private ScheduledFuture<?> AFKeystoreWrapper;

    @NotNull
    final AFb1bSDK.AFa1zSDK AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFa1qSDK f5231d;

    @NotNull
    private final ScheduledExecutorService registerClient;
    private volatile boolean unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Runnable f5232v;

    public AFb1gSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK, @NotNull AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        this.registerClient = scheduledExecutorService;
        this.AFLogger = aFa1zSDK;
        this.f5231d = aFa1qSDK;
        this.f5232v = new Runnable() { // from class: com.appsflyer.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                AFb1gSDK.registerClient(this.f5511a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object objB;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            Intrinsics.checkNotNull(intent);
            aFa1zSDK.m_(intent);
            objB = jt.n.b(Unit.f22483a);
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        Throwable thE = jt.n.e(objB);
        if (thE != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "onActivityCreatedWithDeeplink failed with a throwable", thE, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object objB;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            Intrinsics.checkNotNull(intent);
            aFa1zSDK.n_(intent);
            objB = jt.n.b(Unit.f22483a);
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        Throwable thE = jt.n.e(objB);
        if (thE != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Listener threw an exception", thE, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFb1gSDK aFb1gSDK) {
        Object objB;
        aFb1gSDK.unregisterClient = false;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            aFb1gSDK.AFLogger.registerClient();
            objB = jt.n.b(Unit.f22483a);
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        Throwable thE = jt.n.e(objB);
        if (thE != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Background task failed with a throwable", thE, false, false, false, false, 120, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.unregisterClient) {
            return;
        }
        final Intent intent = activity.getIntent();
        if (this.f5231d.e_(intent)) {
            this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.p
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1gSDK.i_(this.f5513a, intent);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.unregisterClient) {
            ScheduledExecutorService scheduledExecutorService = this.registerClient;
            Runnable runnable = this.f5232v;
            AFb1bSDK.Companion companion = AFb1bSDK.INSTANCE;
            this.AFKeystoreWrapper = scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.unregisterClient(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.unregisterClient) {
            this.unregisterClient = true;
            final Intent intent = activity.getIntent();
            this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1gSDK.j_(this.f5515a, intent);
                }
            });
        } else {
            ScheduledFuture<?> scheduledFuture = this.AFKeystoreWrapper;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
