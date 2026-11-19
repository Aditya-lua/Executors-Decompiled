package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f6608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f6611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z3 f6614k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(z3 z3Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(z3Var, true);
        this.f6608e = l10;
        this.f6609f = str;
        this.f6610g = str2;
        this.f6611h = bundle;
        this.f6612i = z10;
        this.f6613j = z11;
        Objects.requireNonNull(z3Var);
        this.f6614k = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        Long l10 = this.f6608e;
        ((u1) o9.s.l(this.f6614k.m())).logEvent(this.f6609f, this.f6610g, this.f6611h, this.f6612i, this.f6613j, l10 == null ? this.f6717a : l10.longValue());
    }
}
