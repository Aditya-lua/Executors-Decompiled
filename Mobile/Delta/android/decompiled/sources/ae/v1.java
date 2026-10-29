package ae;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends r1 {
    public final /* synthetic */ g b;

    public v1(g gVar) {
        this.b = gVar;
    }

    @Override // ae.r1
    public final void c() {
        synchronized (this.b.f328f) {
            try {
                if (this.b.f333k.get() > 0 && this.b.f333k.decrementAndGet() > 0) {
                    this.b.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                g gVar = this.b;
                if (gVar.f335m != null) {
                    gVar.b.d("Unbind from service.", new Object[0]);
                    g gVar2 = this.b;
                    gVar2.f324a.unbindService(gVar2.f334l);
                    this.b.f329g = false;
                    this.b.f335m = null;
                    this.b.f334l = null;
                }
                this.b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
