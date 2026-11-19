package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6717a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3 f6719d;

    public n3(z3 z3Var, boolean z10) {
        Objects.requireNonNull(z3Var);
        this.f6719d = z3Var;
        this.f6717a = z3Var.b.a();
        this.b = z3Var.b.b();
        this.f6718c = z10;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6719d.l()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f6719d.j(e10, false, this.f6718c);
            b();
        }
    }
}
