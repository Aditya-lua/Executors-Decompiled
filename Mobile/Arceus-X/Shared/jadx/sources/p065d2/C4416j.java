package p065d2;

import p038c2.C1512e;
import p038c2.C1515h;

/* JADX INFO: renamed from: d2.j */
/* JADX INFO: loaded from: classes.dex */
public class C4416j extends AbstractC4422p {
    public C4416j(C1512e c1512e) {
        super(c1512e);
        c1512e.f5877e.mo22156f();
        c1512e.f5879f.mo22156f();
        this.f18383f = ((C1515h) c1512e).m7913t1();
    }

    @Override // p065d2.AbstractC4422p, p065d2.InterfaceC4410d
    /* JADX INFO: renamed from: a */
    public void mo22153a(InterfaceC4410d interfaceC4410d) {
        C4412f c4412f = this.f18385h;
        if (c4412f.f18328c && !c4412f.f18335j) {
            this.f18385h.mo22178d((int) ((c4412f.f18337l.get(0).f18332g * ((C1515h) this.f18379b).m7916w1()) + 0.5f));
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: d */
    public void mo22154d() {
        C1515h c1515h = (C1515h) this.f18379b;
        int iM7914u1 = c1515h.m7914u1();
        int iM7915v1 = c1515h.m7915v1();
        c1515h.m7916w1();
        if (c1515h.m7913t1() == 1) {
            if (iM7914u1 != -1) {
                this.f18385h.f18337l.add(this.f18379b.f5870a0.f5877e.f18385h);
                this.f18379b.f5870a0.f5877e.f18385h.f18336k.add(this.f18385h);
                this.f18385h.f18331f = iM7914u1;
            } else if (iM7915v1 != -1) {
                this.f18385h.f18337l.add(this.f18379b.f5870a0.f5877e.f18386i);
                this.f18379b.f5870a0.f5877e.f18386i.f18336k.add(this.f18385h);
                this.f18385h.f18331f = -iM7915v1;
            } else {
                C4412f c4412f = this.f18385h;
                c4412f.f18327b = true;
                c4412f.f18337l.add(this.f18379b.f5870a0.f5877e.f18386i);
                this.f18379b.f5870a0.f5877e.f18386i.f18336k.add(this.f18385h);
            }
            m22193q(this.f18379b.f5877e.f18385h);
            m22193q(this.f18379b.f5877e.f18386i);
            return;
        }
        if (iM7914u1 != -1) {
            this.f18385h.f18337l.add(this.f18379b.f5870a0.f5879f.f18385h);
            this.f18379b.f5870a0.f5879f.f18385h.f18336k.add(this.f18385h);
            this.f18385h.f18331f = iM7914u1;
        } else if (iM7915v1 != -1) {
            this.f18385h.f18337l.add(this.f18379b.f5870a0.f5879f.f18386i);
            this.f18379b.f5870a0.f5879f.f18386i.f18336k.add(this.f18385h);
            this.f18385h.f18331f = -iM7915v1;
        } else {
            C4412f c4412f2 = this.f18385h;
            c4412f2.f18327b = true;
            c4412f2.f18337l.add(this.f18379b.f5870a0.f5879f.f18386i);
            this.f18379b.f5870a0.f5879f.f18386i.f18336k.add(this.f18385h);
        }
        m22193q(this.f18379b.f5879f.f18385h);
        m22193q(this.f18379b.f5879f.f18386i);
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: e */
    public void mo22155e() {
        if (((C1515h) this.f18379b).m7913t1() == 1) {
            this.f18379b.m7790n1(this.f18385h.f18332g);
        } else {
            this.f18379b.m7792o1(this.f18385h.f18332g);
        }
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: f */
    public void mo22156f() {
        this.f18385h.m22177c();
    }

    @Override // p065d2.AbstractC4422p
    /* JADX INFO: renamed from: m */
    public boolean mo22158m() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m22193q(C4412f c4412f) {
        this.f18385h.f18336k.add(c4412f);
        c4412f.f18337l.add(this.f18385h);
    }
}
