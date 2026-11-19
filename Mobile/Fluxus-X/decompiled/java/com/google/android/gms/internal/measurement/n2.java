package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f6715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z3 f6716h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(z3 z3Var, String str, String str2, Bundle bundle) {
        super(z3Var, true);
        this.f6713e = str;
        this.f6714f = str2;
        this.f6715g = bundle;
        Objects.requireNonNull(z3Var);
        this.f6716h = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6716h.m())).clearConditionalUserProperty(this.f6713e, this.f6714f, this.f6715g);
    }
}
