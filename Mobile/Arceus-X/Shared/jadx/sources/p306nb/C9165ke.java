package p306nb;

import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ke */
/* JADX INFO: loaded from: classes.dex */
public final class C9165ke {

    /* JADX INFO: renamed from: a */
    public final C9197me f33156a;

    /* JADX INFO: renamed from: b */
    public int f33157b = 1;

    /* JADX INFO: renamed from: c */
    public long f33158c = m36464d();

    public C9165ke(C9197me c9197me) {
        this.f33156a = c9197me;
    }

    /* JADX INFO: renamed from: a */
    public final void m36461a() {
        this.f33157b++;
        this.f33158c = m36464d();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36462b() {
        return this.f33156a.mo36325e().mo44175a() >= this.f33158c;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long m36463c() {
        return this.f33158c;
    }

    /* JADX INFO: renamed from: d */
    public final long m36464d() {
        C9197me c9197me = this.f33156a;
        C8953m.m36047l(c9197me);
        long jLongValue = ((Long) C9395z4.f33811v.m37079b(null)).longValue();
        long jLongValue2 = ((Long) C9395z4.f33813w.m37079b(null)).longValue();
        for (int i10 = 1; i10 < this.f33157b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return c9197me.mo36325e().mo44175a() + Math.min(jLongValue, jLongValue2);
    }
}
