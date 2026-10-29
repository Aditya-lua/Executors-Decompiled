package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v3 f6371g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(v3 v3Var, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(v3Var, false);
        this.f6369e = str;
        this.f6370f = obj;
        Objects.requireNonNull(v3Var);
        this.f6371g = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6371g.m())).logHealthData(5, this.f6369e, y9.b.u2(this.f6370f), y9.b.u2(null), y9.b.u2(null));
    }
}
