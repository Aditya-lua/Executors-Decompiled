package ao;

/* JADX INFO: loaded from: classes3.dex */
public class y extends ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.r f3160a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3161c;

    public y(int i10, int i11) {
        eo.r rVar = new eo.r();
        this.f3160a = rVar;
        this.b = i11;
        rVar.q(Integer.valueOf(i10));
        rVar.p(Integer.valueOf(i11));
    }

    @Override // ho.d
    public ho.c a(ho.h hVar) {
        if (!hVar.a()) {
            return hVar.d() >= this.b ? ho.c.a(hVar.c() + this.b) : ho.c.d();
        }
        if (this.f3160a.d() == null) {
            return ho.c.d();
        }
        eo.a aVarF = hVar.f().f();
        this.f3161c = (aVarF instanceof eo.w) || (aVarF instanceof eo.r);
        return ho.c.b(hVar.e());
    }

    @Override // ho.a, ho.d
    public boolean b() {
        return true;
    }

    @Override // ho.d
    public eo.a f() {
        return this.f3160a;
    }

    @Override // ho.a, ho.d
    public boolean g(eo.a aVar) {
        if (!this.f3161c) {
            return true;
        }
        eo.a aVarG = this.f3160a.g();
        if (!(aVarG instanceof eo.q)) {
            return true;
        }
        ((eo.q) aVarG).q(false);
        return true;
    }
}
