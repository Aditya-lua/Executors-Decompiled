package vd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements ge.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge.e0 f34314a;
    public final ge.e0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge.e0 f34315c;

    public p0(ge.e0 e0Var, ge.e0 e0Var2, ge.e0 e0Var3, ge.e0 e0Var4) {
        this.f34314a = e0Var;
        this.b = e0Var2;
        this.f34315c = e0Var3;
    }

    @Override // ge.e0
    public final /* bridge */ /* synthetic */ Object a() {
        return new n0((Context) this.f34314a.a(), (ge.t0) this.b.a(), ((u) this.f34315c).a(), new c1());
    }
}
