package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y3 f6804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(y3 y3Var, Activity activity) {
        super(y3Var.f6943a, true);
        this.f6803e = activity;
        Objects.requireNonNull(y3Var);
        this.f6804f = y3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6804f.f6943a.m())).onActivityStartedByScionActivityInfo(j2.a(this.f6803e), this.b);
    }
}
