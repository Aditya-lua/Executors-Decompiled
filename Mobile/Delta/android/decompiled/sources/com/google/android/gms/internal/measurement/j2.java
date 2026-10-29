package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v3 f6551i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(v3 v3Var, String str, String str2, Object obj, boolean z10) {
        super(v3Var, true);
        this.f6547e = str;
        this.f6548f = str2;
        this.f6549g = obj;
        this.f6550h = z10;
        Objects.requireNonNull(v3Var);
        this.f6551i = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6551i.m())).setUserProperty(this.f6547e, this.f6548f, y9.b.u2(this.f6549g), this.f6550h, this.f6552a);
    }
}
