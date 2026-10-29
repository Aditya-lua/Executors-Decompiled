package p065d2;

import java.util.ArrayList;
import p038c2.C1513f;

/* JADX INFO: renamed from: d2.m */
/* JADX INFO: loaded from: classes.dex */
public class C4419m {

    /* JADX INFO: renamed from: h */
    public static int f18353h;

    /* JADX INFO: renamed from: c */
    public AbstractC4422p f18356c;

    /* JADX INFO: renamed from: d */
    public AbstractC4422p f18357d;

    /* JADX INFO: renamed from: f */
    public int f18359f;

    /* JADX INFO: renamed from: g */
    public int f18360g;

    /* JADX INFO: renamed from: a */
    public int f18354a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f18355b = false;

    /* JADX INFO: renamed from: e */
    public ArrayList<AbstractC4422p> f18358e = new ArrayList<>();

    public C4419m(AbstractC4422p abstractC4422p, int i10) {
        this.f18356c = null;
        this.f18357d = null;
        int i11 = f18353h;
        this.f18359f = i11;
        f18353h = i11 + 1;
        this.f18356c = abstractC4422p;
        this.f18357d = abstractC4422p;
        this.f18360g = i10;
    }

    /* JADX INFO: renamed from: a */
    public void m22197a(AbstractC4422p abstractC4422p) {
        this.f18358e.add(abstractC4422p);
        this.f18357d = abstractC4422p;
    }

    /* JADX INFO: renamed from: b */
    public long m22198b(C1513f c1513f, int i10) {
        long jMo22157j;
        int i11;
        AbstractC4422p abstractC4422p = this.f18356c;
        if (abstractC4422p instanceof C4409c) {
            if (((C4409c) abstractC4422p).f18383f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(abstractC4422p instanceof C4418l)) {
                return 0L;
            }
        } else if (!(abstractC4422p instanceof C4420n)) {
            return 0L;
        }
        C4412f c4412f = (i10 == 0 ? c1513f.f5877e : c1513f.f5879f).f18385h;
        C4412f c4412f2 = (i10 == 0 ? c1513f.f5877e : c1513f.f5879f).f18386i;
        boolean zContains = abstractC4422p.f18385h.f18337l.contains(c4412f);
        boolean zContains2 = this.f18356c.f18386i.f18337l.contains(c4412f2);
        long jMo22157j2 = this.f18356c.mo22157j();
        if (zContains && zContains2) {
            long jM22200d = m22200d(this.f18356c.f18385h, 0L);
            long jM22199c = m22199c(this.f18356c.f18386i, 0L);
            long j10 = jM22200d - jMo22157j2;
            AbstractC4422p abstractC4422p2 = this.f18356c;
            int i12 = abstractC4422p2.f18386i.f18331f;
            if (j10 >= (-i12)) {
                j10 += (long) i12;
            }
            int i13 = abstractC4422p2.f18385h.f18331f;
            long j11 = ((-jM22199c) - jMo22157j2) - ((long) i13);
            if (j11 >= i13) {
                j11 -= (long) i13;
            }
            float fM7796q = abstractC4422p2.f18379b.m7796q(i10);
            float f10 = fM7796q > 0.0f ? (long) ((j11 / fM7796q) + (j10 / (1.0f - fM7796q))) : 0L;
            long j12 = ((long) ((f10 * fM7796q) + 0.5f)) + jMo22157j2 + ((long) ((f10 * (1.0f - fM7796q)) + 0.5f));
            AbstractC4422p abstractC4422p3 = this.f18356c;
            jMo22157j = ((long) abstractC4422p3.f18385h.f18331f) + j12;
            i11 = abstractC4422p3.f18386i.f18331f;
        } else {
            if (zContains) {
                C4412f c4412f3 = this.f18356c.f18385h;
                return Math.max(m22200d(c4412f3, c4412f3.f18331f), ((long) this.f18356c.f18385h.f18331f) + jMo22157j2);
            }
            if (zContains2) {
                C4412f c4412f4 = this.f18356c.f18386i;
                return Math.max(-m22199c(c4412f4, c4412f4.f18331f), ((long) (-this.f18356c.f18386i.f18331f)) + jMo22157j2);
            }
            AbstractC4422p abstractC4422p4 = this.f18356c;
            jMo22157j = ((long) abstractC4422p4.f18385h.f18331f) + abstractC4422p4.mo22157j();
            i11 = this.f18356c.f18386i.f18331f;
        }
        return jMo22157j - ((long) i11);
    }

    /* JADX INFO: renamed from: c */
    public final long m22199c(C4412f c4412f, long j10) {
        AbstractC4422p abstractC4422p = c4412f.f18329d;
        if (abstractC4422p instanceof C4417k) {
            return j10;
        }
        int size = c4412f.f18336k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4410d interfaceC4410d = c4412f.f18336k.get(i10);
            if (interfaceC4410d instanceof C4412f) {
                C4412f c4412f2 = (C4412f) interfaceC4410d;
                if (c4412f2.f18329d != abstractC4422p) {
                    jMin = Math.min(jMin, m22199c(c4412f2, ((long) c4412f2.f18331f) + j10));
                }
            }
        }
        if (c4412f != abstractC4422p.f18386i) {
            return jMin;
        }
        long jMo22157j = j10 - abstractC4422p.mo22157j();
        return Math.min(Math.min(jMin, m22199c(abstractC4422p.f18385h, jMo22157j)), jMo22157j - ((long) abstractC4422p.f18385h.f18331f));
    }

    /* JADX INFO: renamed from: d */
    public final long m22200d(C4412f c4412f, long j10) {
        AbstractC4422p abstractC4422p = c4412f.f18329d;
        if (abstractC4422p instanceof C4417k) {
            return j10;
        }
        int size = c4412f.f18336k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4410d interfaceC4410d = c4412f.f18336k.get(i10);
            if (interfaceC4410d instanceof C4412f) {
                C4412f c4412f2 = (C4412f) interfaceC4410d;
                if (c4412f2.f18329d != abstractC4422p) {
                    jMax = Math.max(jMax, m22200d(c4412f2, ((long) c4412f2.f18331f) + j10));
                }
            }
        }
        if (c4412f != abstractC4422p.f18385h) {
            return jMax;
        }
        long jMo22157j = j10 + abstractC4422p.mo22157j();
        return Math.max(Math.max(jMax, m22200d(abstractC4422p.f18386i, jMo22157j)), jMo22157j - ((long) abstractC4422p.f18386i.f18331f));
    }
}
