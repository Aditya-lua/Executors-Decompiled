package nn;

/* JADX INFO: loaded from: classes3.dex */
public class y extends tn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.r f26468a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26469c;

    public y(int i10, int i11) {
        qn.r rVar = new qn.r();
        this.f26468a = rVar;
        this.b = i11;
        rVar.q(Integer.valueOf(i10));
        rVar.p(Integer.valueOf(i11));
    }

    @Override // tn.a, tn.d
    public boolean a() {
        return true;
    }

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        if (!hVar.a()) {
            return hVar.d() >= this.b ? tn.c.a(hVar.c() + this.b) : tn.c.d();
        }
        if (this.f26468a.d() == null) {
            return tn.c.d();
        }
        qn.a aVarD = hVar.f().d();
        this.f26469c = (aVarD instanceof qn.w) || (aVarD instanceof qn.r);
        return tn.c.b(hVar.e());
    }

    @Override // tn.d
    public qn.a d() {
        return this.f26468a;
    }

    @Override // tn.a, tn.d
    public boolean e(qn.a aVar) {
        if (!this.f26469c) {
            return true;
        }
        qn.a aVarG = this.f26468a.g();
        if (!(aVarG instanceof qn.q)) {
            return true;
        }
        ((qn.q) aVarG).q(false);
        return true;
    }
}
