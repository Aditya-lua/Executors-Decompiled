package be;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends r1 {
    public final /* synthetic */ g b;

    public v1(g gVar) {
        this.b = gVar;
    }

    @Override // be.r1
    public final void c() {
        synchronized (this.b.f4000f) {
            try {
                if (this.b.f4005k.get() > 0 && this.b.f4005k.decrementAndGet() > 0) {
                    this.b.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                g gVar = this.b;
                if (gVar.f4007m != null) {
                    gVar.b.d("Unbind from service.", new Object[0]);
                    g gVar2 = this.b;
                    gVar2.f3996a.unbindService(gVar2.f4006l);
                    this.b.f4001g = false;
                    this.b.f4007m = null;
                    this.b.f4006l = null;
                }
                this.b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
