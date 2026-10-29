package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k1 f7114d = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f7115a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k1 f7116c;

    public k1() {
        this.f7115a = null;
        this.b = null;
    }

    public k1(Runnable runnable, Executor executor) {
        this.f7115a = runnable;
        this.b = executor;
    }
}
