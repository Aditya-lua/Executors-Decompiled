package p193ib;

import java.util.Objects;

/* JADX INFO: renamed from: ib.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6727i extends AbstractRunnableC6723e {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6733o f25835b;

    public C6727i(C6733o c6733o) {
        Objects.requireNonNull(c6733o);
        this.f25835b = c6733o;
    }

    @Override // p193ib.AbstractRunnableC6723e
    /* JADX INFO: renamed from: b */
    public final void mo28824b() {
        C6733o c6733o = this.f25835b;
        synchronized (c6733o.f25846f) {
            try {
                if (c6733o.f25851k.get() > 0 && c6733o.f25851k.decrementAndGet() > 0) {
                    c6733o.f25842b.m28821c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (c6733o.f25853m != null) {
                    c6733o.f25842b.m28821c("Unbind from service.", new Object[0]);
                    c6733o.f25841a.unbindService(c6733o.f25852l);
                    c6733o.f25847g = false;
                    c6733o.f25853m = null;
                    c6733o.f25852l = null;
                }
                c6733o.m28848w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
