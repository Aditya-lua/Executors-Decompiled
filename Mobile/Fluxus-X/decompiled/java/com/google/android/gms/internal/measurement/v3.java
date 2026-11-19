package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y3 f6875g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(y3 y3Var, Activity activity, r1 r1Var) {
        super(y3Var.f6943a, true);
        this.f6873e = activity;
        this.f6874f = r1Var;
        Objects.requireNonNull(y3Var);
        this.f6875g = y3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6875g.f6943a.m())).onActivitySaveInstanceStateByScionActivityInfo(j2.a(this.f6873e), this.f6874f, this.b);
    }
}
