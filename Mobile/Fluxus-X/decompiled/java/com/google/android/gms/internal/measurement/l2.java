package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z3 f6588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(z3 z3Var, String str, String str2, Object obj, boolean z10) {
        super(z3Var, true);
        this.f6584e = str;
        this.f6585f = str2;
        this.f6586g = obj;
        this.f6587h = z10;
        Objects.requireNonNull(z3Var);
        this.f6588i = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6588i.m())).setUserProperty(this.f6584e, this.f6585f, z9.b.u2(this.f6586g), this.f6587h, this.f6717a);
    }
}
