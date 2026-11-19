package ye;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gf.a f37801a;
    public final cf.h0 b;

    public m0(cf.h0 h0Var, gf.a aVar) {
        this.b = h0Var;
        this.f37801a = aVar;
    }

    public static m0 b(cf.h0 h0Var) {
        return new m0(h0Var, s0.b(h0Var.f0()));
    }

    public static m0 c(cf.h0 h0Var) {
        return new m0(h0Var, s0.h(h0Var.f0()));
    }

    @Override // ye.p0
    public gf.a a() {
        return this.f37801a;
    }

    public cf.h0 d() {
        return this.b;
    }
}
