package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r1 f6966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v3 f6967i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(v3 v3Var, String str, String str2, boolean z10, r1 r1Var) {
        super(v3Var, true);
        this.f6963e = str;
        this.f6964f = str2;
        this.f6965g = z10;
        this.f6966h = r1Var;
        Objects.requireNonNull(v3Var);
        this.f6967i = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6967i.m())).getUserProperties(this.f6963e, this.f6964f, this.f6965g, this.f6966h);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f6966h.l(null);
    }
}
