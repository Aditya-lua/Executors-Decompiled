package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r1 f6478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z3 f6479i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(z3 z3Var, String str, String str2, boolean z10, r1 r1Var) {
        super(z3Var, true);
        this.f6475e = str;
        this.f6476f = str2;
        this.f6477g = z10;
        this.f6478h = r1Var;
        Objects.requireNonNull(z3Var);
        this.f6479i = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6479i.m())).getUserProperties(this.f6475e, this.f6476f, this.f6477g, this.f6478h);
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void b() {
        this.f6478h.l(null);
    }
}
