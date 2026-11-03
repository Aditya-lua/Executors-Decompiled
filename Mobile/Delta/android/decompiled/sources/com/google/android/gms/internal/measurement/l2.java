package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f6671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v3 f6672h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(v3 v3Var, String str, String str2, Bundle bundle) {
        super(v3Var, true);
        this.f6669e = str;
        this.f6670f = str2;
        this.f6671g = bundle;
        Objects.requireNonNull(v3Var);
        this.f6672h = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6672h.m())).clearConditionalUserProperty(this.f6669e, this.f6670f, this.f6671g);
    }
}
