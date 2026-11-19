package zd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k f39217a;

    public j() {
        this.f39217a = null;
    }

    public abstract void a();

    public final tb.k b() {
        return this.f39217a;
    }

    public final void c(Exception exc) {
        tb.k kVar = this.f39217a;
        if (kVar != null) {
            kVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public j(tb.k kVar) {
        this.f39217a = kVar;
    }
}
