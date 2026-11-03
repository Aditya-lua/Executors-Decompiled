package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r1 f6690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v3 f6691h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(v3 v3Var, String str, String str2, r1 r1Var) {
        super(v3Var, true);
        this.f6688e = str;
        this.f6689f = str2;
        this.f6690g = r1Var;
        Objects.requireNonNull(v3Var);
        this.f6691h = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6691h.m())).getConditionalUserProperties(this.f6688e, this.f6689f, this.f6690g);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f6690g.l(null);
    }
}
