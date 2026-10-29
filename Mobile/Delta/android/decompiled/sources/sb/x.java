package sb;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f30613a;

    public x(y yVar) {
        this.f30613a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30613a.b) {
            try {
                y yVar = this.f30613a;
                if (yVar.f30615c != null) {
                    yVar.f30615c.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
