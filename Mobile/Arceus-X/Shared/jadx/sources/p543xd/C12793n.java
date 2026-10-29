package p543xd;

/* JADX INFO: renamed from: xd.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C12793n extends AbstractRunnableC12789j {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C12799t f45527b;

    public C12793n(C12799t c12799t) {
        this.f45527b = c12799t;
    }

    @Override // p543xd.AbstractRunnableC12789j
    /* JADX INFO: renamed from: a */
    public final void mo46218a() {
        synchronized (this.f45527b.f45538f) {
            try {
                if (this.f45527b.f45543k.get() > 0 && this.f45527b.f45543k.decrementAndGet() > 0) {
                    this.f45527b.f45534b.m47652c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C12799t c12799t = this.f45527b;
                if (c12799t.f45545m != null) {
                    c12799t.f45534b.m47652c("Unbind from service.", new Object[0]);
                    C12799t c12799t2 = this.f45527b;
                    c12799t2.f45533a.unbindService(c12799t2.f45544l);
                    this.f45527b.f45539g = false;
                    this.f45527b.f45545m = null;
                    this.f45527b.f45544l = null;
                }
                this.f45527b.m47678w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
