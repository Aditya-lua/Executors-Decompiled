package vd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge.d0 f34316a;
    public final ge.d0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge.d0 f34317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ge.d0 f34318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ge.d0 f34319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ge.d0 f34320f;

    public /* synthetic */ p1(Context context, o1 o1Var) {
        ge.z zVarB = ge.a0.b(context);
        this.f34316a = zVarB;
        ge.d0 d0VarB = ge.y.b(c0.f34263a);
        this.b = d0VarB;
        u uVar = new u(zVarB, g1.f34273a);
        this.f34317c = uVar;
        ge.d0 d0VarB2 = ge.y.b(new p0(zVarB, d0VarB, uVar, g1.f34273a));
        this.f34318d = d0VarB2;
        ge.d0 d0VarB3 = ge.y.b(new u0(d0VarB2));
        this.f34319e = d0VarB3;
        this.f34320f = ge.y.b(new b0(d0VarB2, d0VarB3));
    }

    @Override // vd.w
    public final c a() {
        return (c) this.f34320f.a();
    }
}
