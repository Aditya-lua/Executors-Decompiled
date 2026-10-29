package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f6776a;

    public rd(Unsafe unsafe) {
        this.f6776a = unsafe;
    }

    public abstract void a(Object obj, long j10, byte b);

    public abstract boolean b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract float d(Object obj, long j10);

    public abstract void e(Object obj, long j10, float f10);

    public abstract double f(Object obj, long j10);

    public abstract void g(Object obj, long j10, double d10);
}
