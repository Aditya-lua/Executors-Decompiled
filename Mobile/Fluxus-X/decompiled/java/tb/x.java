package tb;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f32321a;

    public x(y yVar) {
        this.f32321a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f32321a.b) {
            try {
                y yVar = this.f32321a;
                if (yVar.f32323c != null) {
                    yVar.f32323c.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
