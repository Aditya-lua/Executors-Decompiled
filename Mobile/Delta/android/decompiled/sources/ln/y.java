package ln;

/* JADX INFO: loaded from: classes3.dex */
public class y extends rn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on.r f23757a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23758c;

    public y(int i10, int i11) {
        on.r rVar = new on.r();
        this.f23757a = rVar;
        this.b = i11;
        rVar.q(Integer.valueOf(i10));
        rVar.p(Integer.valueOf(i11));
    }

    @Override // rn.a, rn.d
    public boolean b() {
        return true;
    }

    @Override // rn.a, rn.d
    public boolean f(on.a aVar) {
        if (!this.f23758c) {
            return true;
        }
        on.a aVarG = this.f23757a.g();
        if (!(aVarG instanceof on.q)) {
            return true;
        }
        ((on.q) aVarG).q(false);
        return true;
    }

    @Override // rn.d
    public on.a g() {
        return this.f23757a;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        if (!hVar.a()) {
            return hVar.d() >= this.b ? rn.c.a(hVar.c() + this.b) : rn.c.d();
        }
        if (this.f23757a.d() == null) {
            return rn.c.d();
        }
        on.a aVarG = hVar.f().g();
        this.f23758c = (aVarG instanceof on.w) || (aVarG instanceof on.r);
        return rn.c.b(hVar.e());
    }
}
