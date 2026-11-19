package jb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {
    public final /* synthetic */ o b;

    public i(o oVar) {
        Objects.requireNonNull(oVar);
        this.b = oVar;
    }

    @Override // jb.e
    public final void b() {
        o oVar = this.b;
        synchronized (oVar.f20266f) {
            try {
                if (oVar.f20271k.get() > 0 && oVar.f20271k.decrementAndGet() > 0) {
                    oVar.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (oVar.f20273m != null) {
                    oVar.b.c("Unbind from service.", new Object[0]);
                    oVar.f20262a.unbindService(oVar.f20272l);
                    oVar.f20267g = false;
                    oVar.f20273m = null;
                    oVar.f20272l = null;
                }
                oVar.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
