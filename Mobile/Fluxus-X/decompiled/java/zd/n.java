package zd;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends j {
    public final /* synthetic */ t b;

    public n(t tVar) {
        this.b = tVar;
    }

    @Override // zd.j
    public final void a() {
        synchronized (this.b.f39229f) {
            try {
                if (this.b.f39234k.get() > 0 && this.b.f39234k.decrementAndGet() > 0) {
                    this.b.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                t tVar = this.b;
                if (tVar.f39236m != null) {
                    tVar.b.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.b;
                    tVar2.f39225a.unbindService(tVar2.f39235l);
                    this.b.f39230g = false;
                    this.b.f39236m = null;
                    this.b.f39235l = null;
                }
                this.b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
