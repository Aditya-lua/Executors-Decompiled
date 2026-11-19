package de;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends r1 {
    public final /* synthetic */ g b;

    public v1(g gVar) {
        this.b = gVar;
    }

    @Override // de.r1
    public final void c() {
        synchronized (this.b.f12198f) {
            try {
                if (this.b.f12203k.get() > 0 && this.b.f12203k.decrementAndGet() > 0) {
                    this.b.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                g gVar = this.b;
                if (gVar.f12205m != null) {
                    gVar.b.d("Unbind from service.", new Object[0]);
                    g gVar2 = this.b;
                    gVar2.f12194a.unbindService(gVar2.f12204l);
                    this.b.f12199g = false;
                    this.b.f12205m = null;
                    this.b.f12204l = null;
                }
                this.b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
