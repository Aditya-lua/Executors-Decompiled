package be;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f4034a;

    public r1() {
        this.f4034a = null;
    }

    public final sb.k a() {
        return this.f4034a;
    }

    public final void b(Exception exc) {
        sb.k kVar = this.f4034a;
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

    public r1(sb.k kVar) {
        this.f4034a = kVar;
    }
}
