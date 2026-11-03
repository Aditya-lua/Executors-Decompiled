package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r1 f7040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v3 f7041i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(v3 v3Var, String str, String str2, boolean z10, r1 r1Var) {
        super(v3Var, true);
        this.f7037e = str;
        this.f7038f = str2;
        this.f7039g = z10;
        this.f7040h = r1Var;
        Objects.requireNonNull(v3Var);
        this.f7041i = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f7041i.m())).getUserProperties(this.f7037e, this.f7038f, this.f7039g, this.f7040h);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f7040h.l(null);
    }
}
