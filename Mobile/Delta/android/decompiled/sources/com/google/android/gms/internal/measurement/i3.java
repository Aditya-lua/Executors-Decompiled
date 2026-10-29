package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f6484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f6487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v3 f6490k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(v3 v3Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(v3Var, true);
        this.f6484e = l10;
        this.f6485f = str;
        this.f6486g = str2;
        this.f6487h = bundle;
        this.f6488i = z10;
        this.f6489j = z11;
        Objects.requireNonNull(v3Var);
        this.f6490k = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        Long l10 = this.f6484e;
        ((u1) n9.m.l(this.f6490k.m())).logEvent(this.f6485f, this.f6486g, this.f6487h, this.f6488i, this.f6489j, l10 == null ? this.f6552a : l10.longValue());
    }
}
