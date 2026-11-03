package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(v3 v3Var, Bundle bundle) {
        super(v3Var, true);
        this.f6644e = bundle;
        Objects.requireNonNull(v3Var);
        this.f6645f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6645f.m())).setConditionalUserProperty(this.f6644e, this.f6625a);
    }
}
