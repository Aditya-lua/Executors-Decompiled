package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z3 f6487g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(z3 z3Var, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(z3Var, false);
        this.f6485e = str;
        this.f6486f = obj;
        Objects.requireNonNull(z3Var);
        this.f6487g = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6487g.m())).logHealthData(5, this.f6485e, z9.b.u2(this.f6486f), z9.b.u2(null), z9.b.u2(null));
    }
}
