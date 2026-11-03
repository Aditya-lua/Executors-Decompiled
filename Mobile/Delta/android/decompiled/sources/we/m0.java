package we;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.a f34444a;
    public final af.h0 b;

    public m0(af.h0 h0Var, ef.a aVar) {
        this.b = h0Var;
        this.f34444a = aVar;
    }

    public static m0 b(af.h0 h0Var) {
        return new m0(h0Var, s0.b(h0Var.f0()));
    }

    public static m0 c(af.h0 h0Var) {
        return new m0(h0Var, s0.h(h0Var.f0()));
    }

    @Override // we.p0
    public ef.a a() {
        return this.f34444a;
    }

    public af.h0 d() {
        return this.b;
    }
}
