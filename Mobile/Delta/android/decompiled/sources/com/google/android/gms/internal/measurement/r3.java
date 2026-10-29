package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u3 f6758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(u3 u3Var, Activity activity, r1 r1Var) {
        super(u3Var.f6821a, true);
        this.f6756e = activity;
        this.f6757f = r1Var;
        Objects.requireNonNull(u3Var);
        this.f6758g = u3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6758g.f6821a.m())).onActivitySaveInstanceStateByScionActivityInfo(zzdf.a(this.f6756e), this.f6757f, this.b);
    }
}
