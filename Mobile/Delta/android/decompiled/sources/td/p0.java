package td;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements ee.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.e0 f32280a;
    public final ee.e0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee.e0 f32281c;

    public p0(ee.e0 e0Var, ee.e0 e0Var2, ee.e0 e0Var3, ee.e0 e0Var4) {
        this.f32280a = e0Var;
        this.b = e0Var2;
        this.f32281c = e0Var3;
    }

    @Override // ee.e0
    public final /* bridge */ /* synthetic */ Object a() {
        return new n0((Context) this.f32280a.a(), (ee.t0) this.b.a(), ((u) this.f32281c).a(), new c1());
    }
}
