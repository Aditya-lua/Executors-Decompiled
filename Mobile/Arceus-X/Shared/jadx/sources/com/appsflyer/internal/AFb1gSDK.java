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
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: loaded from: classes.dex */
final class AFb1gSDK implements Application.ActivityLifecycleCallbacks {

    @Nullable
    private ScheduledFuture<?> AFKeystoreWrapper;

    @NotNull
    final AFb1bSDK.AFa1zSDK AFLogger;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFa1qSDK f6859d;

    @NotNull
    private final ScheduledExecutorService registerClient;
    private volatile boolean unregisterClient;

    /* JADX INFO: renamed from: v */
    @NotNull
    private final Runnable f6860v;

    public AFb1gSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK, @NotNull AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        this.registerClient = scheduledExecutorService;
        this.AFLogger = aFa1zSDK;
        this.f6859d = aFa1qSDK;
        this.f6860v = new Runnable() { // from class: com.appsflyer.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                AFb1gSDK.registerClient(this.f7153a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i_ */
    public static final void m8739i_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            Intrinsics.checkNotNull(intent);
            aFa1zSDK.mo8734m_(intent);
            objM30460b = C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "onActivityCreatedWithDeeplink failed with a throwable", thM30463e, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j_ */
    public static final void m8740j_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            Intrinsics.checkNotNull(intent);
            aFa1zSDK.mo8735n_(intent);
            objM30460b = C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Listener threw an exception", thM30463e, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFb1gSDK aFb1gSDK) {
        Object objM30460b;
        aFb1gSDK.unregisterClient = false;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            aFb1gSDK.AFLogger.registerClient();
            objM30460b = C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Background task failed with a throwable", thM30463e, false, false, false, false, 120, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.unregisterClient) {
            return;
        }
        final Intent intent = activity.getIntent();
        if (this.f6859d.m8718e_(intent)) {
            this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.p
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1gSDK.m8739i_(this.f7155a, intent);
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
            Runnable runnable = this.f6860v;
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
                    AFb1gSDK.m8740j_(this.f7158a, intent);
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
