package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v3 f6624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(v3 v3Var, String str, String str2, Object obj, boolean z10) {
        super(v3Var, true);
        this.f6620e = str;
        this.f6621f = str2;
        this.f6622g = obj;
        this.f6623h = z10;
        Objects.requireNonNull(v3Var);
        this.f6624i = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6624i.m())).setUserProperty(this.f6620e, this.f6621f, y9.b.u2(this.f6622g), this.f6623h, this.f6625a);
    }
}
