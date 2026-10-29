package ee;

/* JADX INFO: renamed from: ee.y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5106y0 extends AbstractRunnableC5098u0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5067f f19927b;

    public C5106y0(C5067f c5067f) {
        this.f19927b = c5067f;
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: b */
    public final void mo23771b() {
        synchronized (this.f19927b.f19889f) {
            try {
                if (this.f19927b.f19895l.get() > 0 && this.f19927b.f19895l.decrementAndGet() > 0) {
                    this.f19927b.f19885b.m23841c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C5067f c5067f = this.f19927b;
                if (c5067f.f19897n != null) {
                    c5067f.f19885b.m23841c("Unbind from service.", new Object[0]);
                    C5067f c5067f2 = this.f19927b;
                    c5067f2.f19884a.unbindService(c5067f2.f19896m);
                    this.f19927b.f19890g = false;
                    this.f19927b.f19897n = null;
                    this.f19927b.f19896m = null;
                }
                this.f19927b.m23797x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
