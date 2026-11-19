package ge;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k f17725a;

    public u0() {
        this.f17725a = null;
    }

    public void a(Exception exc) {
        tb.k kVar = this.f17725a;
        if (kVar != null) {
            kVar.d(exc);
        }
    }

    public abstract void b();

    public final tb.k c() {
        return this.f17725a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public u0(tb.k kVar) {
        this.f17725a = kVar;
    }
}
