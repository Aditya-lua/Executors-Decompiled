package p065d2;

import java.util.Iterator;
import p038c2.C1508a;
import p038c2.C1512e;

/* JADX INFO: renamed from: d2.k */
/* JADX INFO: loaded from: classes.dex */
public class C4417k extends AbstractC4422p {
    public C4417k(C1512e c1512e) {
        super(c1512e);
    }

    /* JADX INFO: renamed from: q */
    private void m22194q(C4412f c4412f) {
        this.f18385h.f18336k.add(c4412f);
        c4412f.f18337l.add(this.f18385h);
    }

    @Override // p065d2.AbstractC4422p, p065d2.InterfaceC4410d
    /* JADX INFO: renamed from: a */
    public void mo22153a(InterfaceC4410d interfaceC4410d) {
        C1508a c1508a = (C1508a) this.f18379b;
        int iM7672w1 = c1508a.m7672w1();
        Iterator<C4412f> it = this.f18385h.f18337l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f18332g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iM7672w1 == 0 || iM7672w1 == 2) {
            this.f18385h.mo22178d(i11 + c1508a.m7673x1());
        } else {
            this.f18385h.mo22178d(i10 + c1508a.m7673x1());
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: d */
    public void mo22154d() {
        C1512e c1512e = this.f18379b;
        if (c1512e instanceof C1508a) {
            this.f18385h.f18327b = true;
            C1508a c1508a = (C1508a) c1512e;
            int iM7672w1 = c1508a.m7672w1();
            boolean zM7671v1 = c1508a.m7671v1();
            int i10 = 0;
            if (iM7672w1 == 0) {
                this.f18385h.f18330e = C4412f.a.LEFT;
                while (i10 < c1508a.f6010M0) {
                    C1512e c1512e2 = c1508a.f6009L0[i10];
                    if (zM7671v1 || c1512e2.m7745V() != 8) {
                        C4412f c4412f = c1512e2.f5877e.f18385h;
                        c4412f.f18336k.add(this.f18385h);
                        this.f18385h.f18337l.add(c4412f);
                    }
                    i10++;
                }
                m22194q(this.f18379b.f5877e.f18385h);
                m22194q(this.f18379b.f5877e.f18386i);
                return;
            }
            if (iM7672w1 == 1) {
                this.f18385h.f18330e = C4412f.a.RIGHT;
                while (i10 < c1508a.f6010M0) {
                    C1512e c1512e3 = c1508a.f6009L0[i10];
                    if (zM7671v1 || c1512e3.m7745V() != 8) {
                        C4412f c4412f2 = c1512e3.f5877e.f18386i;
                        c4412f2.f18336k.add(this.f18385h);
                        this.f18385h.f18337l.add(c4412f2);
                    }
                    i10++;
                }
                m22194q(this.f18379b.f5877e.f18385h);
                m22194q(this.f18379b.f5877e.f18386i);
                return;
            }
            if (iM7672w1 == 2) {
                this.f18385h.f18330e = C4412f.a.TOP;
                while (i10 < c1508a.f6010M0) {
                    C1512e c1512e4 = c1508a.f6009L0[i10];
                    if (zM7671v1 || c1512e4.m7745V() != 8) {
                        C4412f c4412f3 = c1512e4.f5879f.f18385h;
                        c4412f3.f18336k.add(this.f18385h);
                        this.f18385h.f18337l.add(c4412f3);
                    }
                    i10++;
                }
                m22194q(this.f18379b.f5879f.f18385h);
                m22194q(this.f18379b.f5879f.f18386i);
                return;
            }
            if (iM7672w1 != 3) {
                return;
            }
            this.f18385h.f18330e = C4412f.a.BOTTOM;
            while (i10 < c1508a.f6010M0) {
                C1512e c1512e5 = c1508a.f6009L0[i10];
                if (zM7671v1 || c1512e5.m7745V() != 8) {
                    C4412f c4412f4 = c1512e5.f5879f.f18386i;
                    c4412f4.f18336k.add(this.f18385h);
                    this.f18385h.f18337l.add(c4412f4);
                }
                i10++;
            }
            m22194q(this.f18379b.f5879f.f18385h);
            m22194q(this.f18379b.f5879f.f18386i);
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: e */
    public void mo22155e() {
        C1512e c1512e = this.f18379b;
        if (c1512e instanceof C1508a) {
            int iM7672w1 = ((C1508a) c1512e).m7672w1();
            if (iM7672w1 == 0 || iM7672w1 == 1) {
                this.f18379b.m7790n1(this.f18385h.f18332g);
            } else {
                this.f18379b.m7792o1(this.f18385h.f18332g);
            }
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: f */
    public void mo22156f() {
        this.f18380c = null;
        this.f18385h.m22177c();
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: m */
    public boolean mo22158m() {
        return false;
    }
}
