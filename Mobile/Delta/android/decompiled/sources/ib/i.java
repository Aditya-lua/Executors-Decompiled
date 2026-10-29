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
        synchronized (oVar.f20462f) {
            try {
                if (oVar.f20467k.get() > 0 && oVar.f20467k.decrementAndGet() > 0) {
                    oVar.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (oVar.f20469m != null) {
                    oVar.b.c("Unbind from service.", new Object[0]);
                    oVar.f20458a.unbindService(oVar.f20468l);
                    oVar.f20463g = false;
                    oVar.f20469m = null;
                    oVar.f20468l = null;
                }
                oVar.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
