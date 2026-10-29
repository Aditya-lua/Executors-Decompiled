package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b3 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1983b3 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f8112a;

    public ThreadFactoryC1983b3(C2349v3 c2349v3) {
        Objects.requireNonNull(c2349v3);
        this.f8112a = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f8112a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
