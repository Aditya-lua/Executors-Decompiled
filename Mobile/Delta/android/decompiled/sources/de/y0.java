package de;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends u0 {
    public final /* synthetic */ f b;

    public y0(f fVar) {
        this.b = fVar;
    }

    @Override // de.u0
    public final void b() {
        synchronized (this.b.f14582f) {
            try {
                if (this.b.f14588l.get() > 0 && this.b.f14588l.decrementAndGet() > 0) {
                    this.b.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                f fVar = this.b;
                if (fVar.f14590n != null) {
                    fVar.b.c("Unbind from service.", new Object[0]);
                    f fVar2 = this.b;
                    fVar2.f14578a.unbindService(fVar2.f14589m);
                    this.b.f14583g = false;
                    this.b.f14590n = null;
                    this.b.f14589m = null;
                }
                this.b.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
