package sb;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f31160a;

    public x(y yVar) {
        this.f31160a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f31160a.b) {
            try {
                y yVar = this.f31160a;
                if (yVar.f31162c != null) {
                    yVar.f31162c.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
