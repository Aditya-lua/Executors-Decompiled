package be;

/* JADX INFO: renamed from: be.v1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1370v1 extends AbstractRunnableC1358r1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1323g f5412b;

    public C1370v1(C1323g c1323g) {
        this.f5412b = c1323g;
    }

    @Override // be.AbstractRunnableC1358r1
    /* JADX INFO: renamed from: c */
    public final void mo534c() {
        synchronized (this.f5412b.f5361f) {
            try {
                if (this.f5412b.f5366k.get() > 0 && this.f5412b.f5366k.decrementAndGet() > 0) {
                    this.f5412b.f5357b.m7210d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C1323g c1323g = this.f5412b;
                if (c1323g.f5368m != null) {
                    c1323g.f5357b.m7210d("Unbind from service.", new Object[0]);
                    C1323g c1323g2 = this.f5412b;
                    c1323g2.f5356a.unbindService(c1323g2.f5367l);
                    this.f5412b.f5362g = false;
                    this.f5412b.f5368m = null;
                    this.f5412b.f5367l = null;
                }
                this.f5412b.m7156w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
