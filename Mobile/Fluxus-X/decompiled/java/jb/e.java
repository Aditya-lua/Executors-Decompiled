package jb;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k f20254a;

    public e() {
        this.f20254a = null;
    }

    public void a(Exception exc) {
        tb.k kVar = this.f20254a;
        if (kVar != null) {
            kVar.d(exc);
        }
    }

    public abstract void b();

    public final tb.k c() {
        return this.f20254a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public e(tb.k kVar) {
        this.f20254a = kVar;
    }
}
