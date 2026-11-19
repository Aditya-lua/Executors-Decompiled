package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(z3 z3Var, Bundle bundle) {
        super(z3Var, true);
        this.f6801e = bundle;
        Objects.requireNonNull(z3Var);
        this.f6802f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6802f.m())).setConsentThirdParty(this.f6801e, this.f6717a);
    }
}
