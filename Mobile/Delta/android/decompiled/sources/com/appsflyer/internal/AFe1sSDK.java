package com.appsflyer.internal;

import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1sSDK extends TimerTask {

    @NotNull
    private final Thread registerClient;

    public AFe1sSDK(@NotNull Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "");
        this.registerClient = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.registerClient.interrupt();
    }
}
