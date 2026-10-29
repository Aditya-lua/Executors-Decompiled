package wd;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends j {
    public final /* synthetic */ t b;

    public n(t tVar) {
        this.b = tVar;
    }

    @Override // wd.j
    public final void a() {
        synchronized (this.b.f34179f) {
            try {
                if (this.b.f34184k.get() > 0 && this.b.f34184k.decrementAndGet() > 0) {
                    this.b.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                t tVar = this.b;
                if (tVar.f34186m != null) {
                    tVar.b.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.b;
                    tVar2.f34175a.unbindService(tVar2.f34185l);
                    this.b.f34180g = false;
                    this.b.f34186m = null;
                    this.b.f34185l = null;
                }
                this.b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
