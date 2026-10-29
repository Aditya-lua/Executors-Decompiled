package be;

import sb.C11264k;

/* JADX INFO: renamed from: be.u1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1367u1 extends AbstractRunnableC1358r1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11264k f5406b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractRunnableC1358r1 f5407c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1323g f5408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367u1(C1323g c1323g, C11264k c11264k, C11264k c11264k2, AbstractRunnableC1358r1 abstractRunnableC1358r1) {
        super(c11264k);
        this.f5408d = c1323g;
        this.f5406b = c11264k2;
        this.f5407c = abstractRunnableC1358r1;
    }

    @Override // be.AbstractRunnableC1358r1
    /* JADX INFO: renamed from: c */
    public final void mo534c() {
        synchronized (this.f5408d.f5361f) {
            try {
                C1323g.m7145n(this.f5408d, this.f5406b);
                if (this.f5408d.f5366k.getAndIncrement() > 0) {
                    this.f5408d.f5357b.m7210d("Already connected to the service.", new Object[0]);
                }
                C1323g.m7147p(this.f5408d, this.f5407c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
