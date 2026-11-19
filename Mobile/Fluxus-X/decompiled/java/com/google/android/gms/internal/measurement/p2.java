package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j2 f6764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z3 f6767h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(z3 z3Var, j2 j2Var, String str, String str2) {
        super(z3Var, true);
        this.f6764e = j2Var;
        this.f6765f = str;
        this.f6766g = str2;
        Objects.requireNonNull(z3Var);
        this.f6767h = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6767h.m())).setCurrentScreenByScionActivityInfo(this.f6764e, this.f6765f, this.f6766g, this.f6717a);
    }
}
