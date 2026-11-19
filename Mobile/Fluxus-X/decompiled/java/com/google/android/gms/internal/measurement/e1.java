package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f6484a;

    static {
        w0 w0Var = new w0();
        w0Var.e(BuildConfig.FLAVOR);
        w0Var.a(false);
        w0Var.c(1);
        w0Var.d(1);
        w0Var.b();
        w0 w0Var2 = new w0();
        w0Var2.e(BuildConfig.FLAVOR);
        w0Var2.a(false);
        w0Var2.c(4);
        w0Var2.d(1);
        f6484a = w0Var2.b();
        w0 w0Var3 = new w0();
        w0Var3.e(BuildConfig.FLAVOR);
        w0Var3.a(false);
        w0Var3.c(2);
        w0Var3.d(1);
        w0Var3.b();
    }

    public abstract String a();

    public abstract boolean b();

    public abstract u0 c();

    public abstract v0 d();

    public abstract int e();

    public abstract int f();
}
