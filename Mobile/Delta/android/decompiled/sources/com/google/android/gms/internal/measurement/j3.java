package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class j3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6625a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v3 f6627d;

    public j3(v3 v3Var, boolean z10) {
        Objects.requireNonNull(v3Var);
        this.f6627d = v3Var;
        this.f6625a = v3Var.b.a();
        this.b = v3Var.b.b();
        this.f6626c = z10;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6627d.l()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f6627d.j(e10, false, this.f6626c);
            b();
        }
    }
}
