package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzdf f6676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v3 f6679h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(v3 v3Var, zzdf zzdfVar, String str, String str2) {
        super(v3Var, true);
        this.f6676e = zzdfVar;
        this.f6677f = str;
        this.f6678g = str2;
        Objects.requireNonNull(v3Var);
        this.f6679h = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6679h.m())).setCurrentScreenByScionActivityInfo(this.f6676e, this.f6677f, this.f6678g, this.f6552a);
    }
}
