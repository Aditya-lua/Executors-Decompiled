package d2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class k extends p {
    public k(c2.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f14381h.f14338k.add(fVar);
        fVar.f14339l.add(this.f14381h);
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        c2.a aVar = (c2.a) this.b;
        int iW1 = aVar.w1();
        Iterator<f> it = this.f14381h.f14339l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f14334g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iW1 == 0 || iW1 == 2) {
            this.f14381h.d(i11 + aVar.x1());
        } else {
            this.f14381h.d(i10 + aVar.x1());
        }
    }

    @Override // d2.p
    public void d() {
        c2.e eVar = this.b;
        if (eVar instanceof c2.a) {
            this.f14381h.b = true;
            c2.a aVar = (c2.a) eVar;
            int iW1 = aVar.w1();
            boolean zV1 = aVar.v1();
            int i10 = 0;
            if (iW1 == 0) {
                this.f14381h.f14332e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    c2.e eVar2 = aVar.L0[i10];
                    if (zV1 || eVar2.V() != 8) {
                        f fVar = eVar2.f4367e.f14381h;
                        fVar.f14338k.add(this.f14381h);
                        this.f14381h.f14339l.add(fVar);
                    }
                    i10++;
                }
                q(this.b.f4367e.f14381h);
                q(this.b.f4367e.f14382i);
                return;
            }
            if (iW1 == 1) {
                this.f14381h.f14332e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    c2.e eVar3 = aVar.L0[i10];
                    if (zV1 || eVar3.V() != 8) {
                        f fVar2 = eVar3.f4367e.f14382i;
                        fVar2.f14338k.add(this.f14381h);
                        this.f14381h.f14339l.add(fVar2);
                    }
                    i10++;
                }
                q(this.b.f4367e.f14381h);
                q(this.b.f4367e.f14382i);
                return;
            }
            if (iW1 == 2) {
                this.f14381h.f14332e = f.a.TOP;
                while (i10 < aVar.M0) {
                    c2.e eVar4 = aVar.L0[i10];
                    if (zV1 || eVar4.V() != 8) {
                        f fVar3 = eVar4.f4369f.f14381h;
                        fVar3.f14338k.add(this.f14381h);
                        this.f14381h.f14339l.add(fVar3);
                    }
                    i10++;
                }
                q(this.b.f4369f.f14381h);
                q(this.b.f4369f.f14382i);
                return;
            }
            if (iW1 != 3) {
                return;
            }
            this.f14381h.f14332e = f.a.BOTTOM;
            while (i10 < aVar.M0) {
                c2.e eVar5 = aVar.L0[i10];
                if (zV1 || eVar5.V() != 8) {
                    f fVar4 = eVar5.f4369f.f14382i;
                    fVar4.f14338k.add(this.f14381h);
                    this.f14381h.f14339l.add(fVar4);
                }
                i10++;
            }
            q(this.b.f4369f.f14381h);
            q(this.b.f4369f.f14382i);
        }
    }

    @Override // d2.p
    public void e() {
        c2.e eVar = this.b;
        if (eVar instanceof c2.a) {
            int iW1 = ((c2.a) eVar).w1();
            if (iW1 == 0 || iW1 == 1) {
                this.b.n1(this.f14381h.f14334g);
            } else {
                this.b.o1(this.f14381h.f14334g);
            }
        }
    }

    @Override // d2.p
    public void f() {
        this.f14376c = null;
        this.f14381h.c();
    }

    @Override // d2.p
    public boolean m() {
        return false;
    }
}
