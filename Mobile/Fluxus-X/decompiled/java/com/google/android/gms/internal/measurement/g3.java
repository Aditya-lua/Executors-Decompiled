package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z3 f6517g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(z3 z3Var, Bundle bundle, r1 r1Var) {
        super(z3Var, true);
        this.f6515e = bundle;
        this.f6516f = r1Var;
        Objects.requireNonNull(z3Var);
        this.f6517g = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6517g.m())).performAction(this.f6515e, this.f6516f, this.f6717a);
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void b() {
        this.f6516f.l(null);
    }
}
