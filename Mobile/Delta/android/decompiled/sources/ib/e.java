package ib;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f20450a;

    public e() {
        this.f20450a = null;
    }

    public void a(Exception exc) {
        sb.k kVar = this.f20450a;
        if (kVar != null) {
            kVar.d(exc);
        }
    }

    public abstract void b();

    public final sb.k c() {
        return this.f20450a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public e(sb.k kVar) {
        this.f20450a = kVar;
    }
}
