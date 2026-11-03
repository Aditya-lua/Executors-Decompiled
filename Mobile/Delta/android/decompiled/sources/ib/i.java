package ib;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {
    public final /* synthetic */ o b;

    public i(o oVar) {
        Objects.requireNonNull(oVar);
        this.b = oVar;
    }

    @Override // ib.e
    public final void b() {
        o oVar = this.b;
        synchronized (oVar.f20578f) {
            try {
                if (oVar.f20583k.get() > 0 && oVar.f20583k.decrementAndGet() > 0) {
                    oVar.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (oVar.f20585m != null) {
                    oVar.b.c("Unbind from service.", new Object[0]);
                    oVar.f20574a.unbindService(oVar.f20584l);
                    oVar.f20579g = false;
                    oVar.f20585m = null;
                    oVar.f20584l = null;
                }
                oVar.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
