package ee;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends u0 {
    public final /* synthetic */ f b;

    public y0(f fVar) {
        this.b = fVar;
    }

    @Override // ee.u0
    public final void b() {
        synchronized (this.b.f16078f) {
            try {
                if (this.b.f16084l.get() > 0 && this.b.f16084l.decrementAndGet() > 0) {
                    this.b.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                f fVar = this.b;
                if (fVar.f16086n != null) {
                    fVar.b.c("Unbind from service.", new Object[0]);
                    f fVar2 = this.b;
                    fVar2.f16074a.unbindService(fVar2.f16085m);
                    this.b.f16079g = false;
                    this.b.f16086n = null;
                    this.b.f16085m = null;
                }
                this.b.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
