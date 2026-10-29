package ae;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f362a;

    public r1() {
        this.f362a = null;
    }

    public final sb.k a() {
        return this.f362a;
    }

    public final void b(Exception exc) {
        sb.k kVar = this.f362a;
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
        this.f362a = kVar;
    }
}
