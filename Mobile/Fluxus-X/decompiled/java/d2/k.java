package d2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class k extends p {
    public k(c2.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f11746h.f11703k.add(fVar);
        fVar.f11704l.add(this.f11746h);
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        c2.a aVar = (c2.a) this.b;
        int iW1 = aVar.w1();
        Iterator<f> it = this.f11746h.f11704l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f11699g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iW1 == 0 || iW1 == 2) {
            this.f11746h.d(i11 + aVar.x1());
        } else {
            this.f11746h.d(i10 + aVar.x1());
        }
    }

    @Override // d2.p
    public void d() {
        c2.e eVar = this.b;
        if (eVar instanceof c2.a) {
            this.f11746h.b = true;
            c2.a aVar = (c2.a) eVar;
            int iW1 = aVar.w1();
            boolean zV1 = aVar.v1();
            int i10 = 0;
            if (iW1 == 0) {
                this.f11746h.f11697e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    c2.e eVar2 = aVar.L0[i10];
                    if (zV1 || eVar2.V() != 8) {
                        f fVar = eVar2.f4660e.f11746h;
                        fVar.f11703k.add(this.f11746h);
                        this.f11746h.f11704l.add(fVar);
                    }
                    i10++;
                }
                q(this.b.f4660e.f11746h);
                q(this.b.f4660e.f11747i);
                return;
            }
            if (iW1 == 1) {
                this.f11746h.f11697e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    c2.e eVar3 = aVar.L0[i10];
                    if (zV1 || eVar3.V() != 8) {
                        f fVar2 = eVar3.f4660e.f11747i;
                        fVar2.f11703k.add(this.f11746h);
                        this.f11746h.f11704l.add(fVar2);
                    }
                    i10++;
                }
                q(this.b.f4660e.f11746h);
                q(this.b.f4660e.f11747i);
                return;
            }
            if (iW1 == 2) {
                this.f11746h.f11697e = f.a.TOP;
                while (i10 < aVar.M0) {
                    c2.e eVar4 = aVar.L0[i10];
                    if (zV1 || eVar4.V() != 8) {
                        f fVar3 = eVar4.f4662f.f11746h;
                        fVar3.f11703k.add(this.f11746h);
                        this.f11746h.f11704l.add(fVar3);
                    }
                    i10++;
                }
                q(this.b.f4662f.f11746h);
                q(this.b.f4662f.f11747i);
                return;
            }
            if (iW1 != 3) {
                return;
            }
            this.f11746h.f11697e = f.a.BOTTOM;
            while (i10 < aVar.M0) {
                c2.e eVar5 = aVar.L0[i10];
                if (zV1 || eVar5.V() != 8) {
                    f fVar4 = eVar5.f4662f.f11747i;
                    fVar4.f11703k.add(this.f11746h);
                    this.f11746h.f11704l.add(fVar4);
                }
                i10++;
            }
            q(this.b.f4662f.f11746h);
            q(this.b.f4662f.f11747i);
        }
    }

    @Override // d2.p
    public void e() {
        c2.e eVar = this.b;
        if (eVar instanceof c2.a) {
            int iW1 = ((c2.a) eVar).w1();
            if (iW1 == 0 || iW1 == 1) {
                this.b.n1(this.f11746h.f11699g);
            } else {
                this.b.o1(this.f11746h.f11699g);
            }
        }
    }

    @Override // d2.p
    public void f() {
        this.f11741c = null;
        this.f11746h.c();
    }

    @Override // d2.p
    public boolean m() {
        return false;
    }
}
