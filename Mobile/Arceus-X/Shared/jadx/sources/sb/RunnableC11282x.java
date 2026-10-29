package sb;

/* JADX INFO: renamed from: sb.x */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11282x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11283y f39613a;

    public RunnableC11282x(C11283y c11283y) {
        this.f39613a = c11283y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39613a.f39615b) {
            try {
                C11283y c11283y = this.f39613a;
                if (c11283y.f39616c != null) {
                    c11283y.f39616c.mo42318a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
