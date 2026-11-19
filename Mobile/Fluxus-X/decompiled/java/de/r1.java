package de;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k f12232a;

    public r1() {
        this.f12232a = null;
    }

    public final tb.k a() {
        return this.f12232a;
    }

    public final void b(Exception exc) {
        tb.k kVar = this.f12232a;
        if (kVar != null) {
            kVar.d(exc);
        }
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c();
        } catch (Exception e10) {
            b(e10);
        }
    }

    public r1(tb.k kVar) {
        this.f12232a = kVar;
    }
}
