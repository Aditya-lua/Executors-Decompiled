package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f6557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f6560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v3 f6563k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(v3 v3Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(v3Var, true);
        this.f6557e = l10;
        this.f6558f = str;
        this.f6559g = str2;
        this.f6560h = bundle;
        this.f6561i = z10;
        this.f6562j = z11;
        Objects.requireNonNull(v3Var);
        this.f6563k = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        Long l10 = this.f6557e;
        ((u1) n9.m.l(this.f6563k.m())).logEvent(this.f6558f, this.f6559g, this.f6560h, this.f6561i, this.f6562j, l10 == null ? this.f6625a : l10.longValue());
    }
}
