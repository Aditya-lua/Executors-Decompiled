package p138fv;

/* JADX INFO: renamed from: fv.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C5846i {

    /* JADX INFO: renamed from: a */
    public C5845h f22294a;

    /* JADX INFO: renamed from: b */
    public C5845h f22295b;

    /* JADX INFO: renamed from: a */
    public synchronized void m26224a(C5845h c5845h) {
        try {
            if (c5845h == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            C5845h c5845h2 = this.f22295b;
            if (c5845h2 != null) {
                c5845h2.f22293c = c5845h;
                this.f22295b = c5845h;
            } else {
                if (this.f22294a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f22295b = c5845h;
                this.f22294a = c5845h;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized C5845h m26225b() {
        C5845h c5845h;
        c5845h = this.f22294a;
        if (c5845h != null) {
            C5845h c5845h2 = c5845h.f22293c;
            this.f22294a = c5845h2;
            if (c5845h2 == null) {
                this.f22295b = null;
            }
        }
        return c5845h;
    }

    /* JADX INFO: renamed from: c */
    public synchronized C5845h m26226c(int i10) {
        try {
            if (this.f22294a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m26225b();
    }
}
