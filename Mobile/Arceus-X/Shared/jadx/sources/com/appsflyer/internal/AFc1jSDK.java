package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1jSDK {

    @NotNull
    private static final InterfaceC7341h unregisterClient = C7342i.m30456b(new Function0() { // from class: com.appsflyer.internal.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AFc1jSDK.registerClient();
        }
    });

    @NotNull
    public static final ScheduledExecutorService AFKeystoreWrapper() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "");
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    @NotNull
    public static final ScheduledExecutorService AFLogger() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final ExecutorService m8771d() {
        Object value = unregisterClient.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService registerClient() {
        return Executors.newSingleThreadExecutor();
    }

    @NotNull
    public static final ExecutorService unregisterClient() {
        AFc1oSDK aFc1oSDK = new AFc1oSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1oSDK.allowCoreThreadTimeOut(true);
        return aFc1oSDK;
    }
}
