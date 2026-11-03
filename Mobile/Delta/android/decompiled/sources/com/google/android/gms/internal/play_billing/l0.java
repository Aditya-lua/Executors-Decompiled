package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f7218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f7220e;

    public l0(n0 n0Var, int i10, int i11) {
        Objects.requireNonNull(n0Var);
        this.f7220e = n0Var;
        this.f7218c = i10;
        this.f7219d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int b() {
        return this.f7220e.c() + this.f7218c + this.f7219d;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int c() {
        return this.f7220e.c() + this.f7218c;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final Object[] f() {
        return this.f7220e.f();
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    /* JADX INFO: renamed from: g */
    public final n0 subList(int i10, int i11) {
        x.d(i10, i11, this.f7219d);
        int i12 = this.f7218c;
        return this.f7220e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        x.a(i10, this.f7219d, "index");
        return this.f7220e.get(i10 + this.f7218c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7219d;
    }

    @Override // com.google.android.gms.internal.play_billing.n0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
