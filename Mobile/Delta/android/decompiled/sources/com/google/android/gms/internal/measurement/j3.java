package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class j3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6552a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v3 f6554d;

    public j3(v3 v3Var, boolean z10) {
        Objects.requireNonNull(v3Var);
        this.f6554d = v3Var;
        this.f6552a = v3Var.b.a();
        this.b = v3Var.b.b();
        this.f6553c = z10;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6554d.l()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f6554d.j(e10, false, this.f6553c);
            b();
        }
    }
}
