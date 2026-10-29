package ve;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.a f32990a;
    public final ze.h0 b;

    public m0(ze.h0 h0Var, df.a aVar) {
        this.b = h0Var;
        this.f32990a = aVar;
    }

    public static m0 b(ze.h0 h0Var) {
        return new m0(h0Var, s0.b(h0Var.f0()));
    }

    public static m0 c(ze.h0 h0Var) {
        return new m0(h0Var, s0.h(h0Var.f0()));
    }

    @Override // ve.p0
    public df.a a() {
        return this.f32990a;
    }

    public ze.h0 d() {
        return this.b;
    }
}
