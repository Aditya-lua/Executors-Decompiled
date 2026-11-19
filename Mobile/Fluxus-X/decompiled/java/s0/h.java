package s0;

import g0.z2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements z2 {
    public static z2 e(float f10, float f11, float f12, float f13) {
        return new a(f10, f11, f12, f13);
    }

    public static z2 f(z2 z2Var) {
        return new a(z2Var.d(), z2Var.a(), z2Var.c(), z2Var.b());
    }

    @Override // g0.z2
    public abstract float a();

    @Override // g0.z2
    public abstract float b();

    @Override // g0.z2
    public abstract float c();

    @Override // g0.z2
    public abstract float d();
}
