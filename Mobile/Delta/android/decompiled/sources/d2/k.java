package d2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class k extends p {
    public k(c2.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f14361h.f14318k.add(fVar);
        fVar.f14319l.add(this.f14361h);
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        c2.a aVar = (c2.a) this.b;
        int iW1 = aVar.w1();
        Iterator<f> it = this.f14361h.f14319l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f14314g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iW1 == 0 || iW1 == 2) {
            this.f14361h.d(i11 + aVar.x1());
        } else {
            this.f14361h.d(i10 + aVar.x1());
        }
    }

    @Override // d2.p
    public void d() {
        c2.e eVar = this.b;
        if (eVar instanceof c2.a) {
            this.f14361h.b = true;
            c2.a aVar = (c2.a) eVar;
            int iW1 = aVar.w1();
            boolean zV1 = aVar.v1();
            int i10 = 0;
            if (iW1 == 0) {
                this.f14361h.f14312e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    c2.e eVar2 = aVar.L0[i10];
                    if (zV1 || eVar2.V() != 8) {
                        f fVar = eVar2.f4533e.f14361h;
                        fVar.f14318k.add(this.f14361h);
                        this.f14361h.f14319l.add(fVar);
                    }
                    i10++;
                }
                q(this.b.f4533e.f14361h);
                q(this.b.f4533e.f14362i);
                return;
            }
            if (iW1 == 1) {
                this.f14361h.f14312e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    c2.e eVar3 = aVar.L0[i10];
                    if (zV1 || eVar3.V() != 8) {
                        f fVar2 = eVar3.f4533e.f14362i;
                        fVar2.f14318k.add(this.f14361h);
                        this.f14361h.f14319l.add(fVar2);
                    }
                    i10++;
                }
                q(this.b.f4533e.f14361h);
                q(this.b.f4533e.f14362i);
                return;
            }
            if (iW1 == 2) {
                this.f14361h.f14312e = f.a.TOP;
                while (i10 < aVar.M0) {
                    c2.e eVar4 = aVar.L0[i10];
                    if (zV1 || eVar4.V() != 8) {
                        f fVar3 = eVar4.f4535f.f14361h;
                        fVar3.f14318k.add(this.f14361h);
                        this.f14361h.f14319l.add(fVar3);
                    }
                    i10++;
                }
                q(this.b.f4535f.f14361h);
                q(this.b.f4535f.f14362i);
                return;
            }
            if (iW1 != 3) {
                return;
            }
            this.f14361h.f14312e = f.a.BOTTOM;
            while (i10 < aVar.M0) {
                c2.e eVar5 = aVar.L0[i10];
                if (zV1 || eVar5.V() != 8) {
                    f fVar4 = eVar5.f4535f.f14362i;
                    fVar4.f14318k.add(this.f14361h);
                    this.f14361h.f14319l.add(fVar4);
                }
                i10++;
            }
            q(this.b.f4535f.f14361h);
            q(this.b.f4535f.f14362i);
        }
    }

    @Override // d2.p
    public void e() {
        c2.e eVar = this.b;
        if (eVar instanceof c2.a) {
            int iW1 = ((c2.a) eVar).w1();
            if (iW1 == 0 || iW1 == 1) {
                this.b.n1(this.f14361h.f14314g);
            } else {
                this.b.o1(this.f14361h.f14314g);
            }
        }
    }

    @Override // d2.p
    public void f() {
        this.f14356c = null;
        this.f14361h.c();
    }

    @Override // d2.p
    public boolean m() {
        return false;
    }
}
