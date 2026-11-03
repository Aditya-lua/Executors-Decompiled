package d2;

/* JADX INFO: loaded from: classes.dex */
public class j extends p {
    public j(c2.e eVar) {
        super(eVar);
        eVar.f4533e.f();
        eVar.f4535f.f();
        this.f14359f = ((c2.h) eVar).t1();
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        f fVar = this.f14361h;
        if (fVar.f14310c && !fVar.f14317j) {
            this.f14361h.d((int) ((fVar.f14319l.get(0).f14314g * ((c2.h) this.b).w1()) + 0.5f));
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
                this.f14361h.f14319l.add(this.b.f4527a0.f4533e.f14361h);
                this.b.f4527a0.f4533e.f14361h.f14318k.add(this.f14361h);
                this.f14361h.f14313f = iU1;
            } else if (iV1 != -1) {
                this.f14361h.f14319l.add(this.b.f4527a0.f4533e.f14362i);
                this.b.f4527a0.f4533e.f14362i.f14318k.add(this.f14361h);
                this.f14361h.f14313f = -iV1;
            } else {
                f fVar = this.f14361h;
                fVar.b = true;
                fVar.f14319l.add(this.b.f4527a0.f4533e.f14362i);
                this.b.f4527a0.f4533e.f14362i.f14318k.add(this.f14361h);
            }
            q(this.b.f4533e.f14361h);
            q(this.b.f4533e.f14362i);
            return;
        }
        if (iU1 != -1) {
            this.f14361h.f14319l.add(this.b.f4527a0.f4535f.f14361h);
            this.b.f4527a0.f4535f.f14361h.f14318k.add(this.f14361h);
            this.f14361h.f14313f = iU1;
        } else if (iV1 != -1) {
            this.f14361h.f14319l.add(this.b.f4527a0.f4535f.f14362i);
            this.b.f4527a0.f4535f.f14362i.f14318k.add(this.f14361h);
            this.f14361h.f14313f = -iV1;
        } else {
            f fVar2 = this.f14361h;
            fVar2.b = true;
            fVar2.f14319l.add(this.b.f4527a0.f4535f.f14362i);
            this.b.f4527a0.f4535f.f14362i.f14318k.add(this.f14361h);
        }
        q(this.b.f4535f.f14361h);
        q(this.b.f4535f.f14362i);
    }

    @Override // d2.p
    public void e() {
        if (((c2.h) this.b).t1() == 1) {
            this.b.n1(this.f14361h.f14314g);
        } else {
            this.b.o1(this.f14361h.f14314g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f14361h.c();
    }

    @Override // d2.p
    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f14361h.f14318k.add(fVar);
        fVar.f14319l.add(this.f14361h);
    }
}
