package d2;

/* JADX INFO: loaded from: classes.dex */
public class j extends p {
    public j(c2.e eVar) {
        super(eVar);
        eVar.f4367e.f();
        eVar.f4369f.f();
        this.f14379f = ((c2.h) eVar).t1();
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        f fVar = this.f14381h;
        if (fVar.f14330c && !fVar.f14337j) {
            this.f14381h.d((int) ((fVar.f14339l.get(0).f14334g * ((c2.h) this.b).w1()) + 0.5f));
        }
    }

    @Override // d2.p
    public void d() {
        c2.h hVar = (c2.h) this.b;
        int iU1 = hVar.u1();
        int iV1 = hVar.v1();
        hVar.w1();
        if (hVar.t1() == 1) {
            if (iU1 != -1) {
                this.f14381h.f14339l.add(this.b.f4361a0.f4367e.f14381h);
                this.b.f4361a0.f4367e.f14381h.f14338k.add(this.f14381h);
                this.f14381h.f14333f = iU1;
            } else if (iV1 != -1) {
                this.f14381h.f14339l.add(this.b.f4361a0.f4367e.f14382i);
                this.b.f4361a0.f4367e.f14382i.f14338k.add(this.f14381h);
                this.f14381h.f14333f = -iV1;
            } else {
                f fVar = this.f14381h;
                fVar.b = true;
                fVar.f14339l.add(this.b.f4361a0.f4367e.f14382i);
                this.b.f4361a0.f4367e.f14382i.f14338k.add(this.f14381h);
            }
            q(this.b.f4367e.f14381h);
            q(this.b.f4367e.f14382i);
            return;
        }
        if (iU1 != -1) {
            this.f14381h.f14339l.add(this.b.f4361a0.f4369f.f14381h);
            this.b.f4361a0.f4369f.f14381h.f14338k.add(this.f14381h);
            this.f14381h.f14333f = iU1;
        } else if (iV1 != -1) {
            this.f14381h.f14339l.add(this.b.f4361a0.f4369f.f14382i);
            this.b.f4361a0.f4369f.f14382i.f14338k.add(this.f14381h);
            this.f14381h.f14333f = -iV1;
        } else {
            f fVar2 = this.f14381h;
            fVar2.b = true;
            fVar2.f14339l.add(this.b.f4361a0.f4369f.f14382i);
            this.b.f4361a0.f4369f.f14382i.f14338k.add(this.f14381h);
        }
        q(this.b.f4369f.f14381h);
        q(this.b.f4369f.f14382i);
    }

    @Override // d2.p
    public void e() {
        if (((c2.h) this.b).t1() == 1) {
            this.b.n1(this.f14381h.f14334g);
        } else {
            this.b.o1(this.f14381h.f14334g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f14381h.c();
    }

    @Override // d2.p
    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f14381h.f14338k.add(fVar);
        fVar.f14339l.add(this.f14381h);
    }
}
