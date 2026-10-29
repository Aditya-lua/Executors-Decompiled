package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v3 f6400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(v3 v3Var, Bundle bundle, r1 r1Var) {
        super(v3Var, true);
        this.f6398e = bundle;
        this.f6399f = r1Var;
        Objects.requireNonNull(v3Var);
        this.f6400g = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6400g.m())).performAction(this.f6398e, this.f6399f, this.f6552a);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f6399f.l(null);
    }
}
