package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u3 f6832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(u3 u3Var, Activity activity, r1 r1Var) {
        super(u3Var.f6895a, true);
        this.f6830e = activity;
        this.f6831f = r1Var;
        Objects.requireNonNull(u3Var);
        this.f6832g = u3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6832g.f6895a.m())).onActivitySaveInstanceStateByScionActivityInfo(zzdf.a(this.f6830e), this.f6831f, this.b);
    }
}
