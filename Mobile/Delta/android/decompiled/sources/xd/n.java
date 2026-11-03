package xd;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends j {
    public final /* synthetic */ t b;

    public n(t tVar) {
        this.b = tVar;
    }

    @Override // xd.j
    public final void a() {
        synchronized (this.b.f35678f) {
            try {
                if (this.b.f35683k.get() > 0 && this.b.f35683k.decrementAndGet() > 0) {
                    this.b.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                t tVar = this.b;
                if (tVar.f35685m != null) {
                    tVar.b.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.b;
                    tVar2.f35674a.unbindService(tVar2.f35684l);
                    this.b.f35679g = false;
                    this.b.f35685m = null;
                    this.b.f35684l = null;
                }
                this.b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
