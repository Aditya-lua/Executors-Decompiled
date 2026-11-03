package ee;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f16098a;

    public u0() {
        this.f16098a = null;
    }

    public void a(Exception exc) {
        sb.k kVar = this.f16098a;
        if (kVar != null) {
            kVar.d(exc);
        }
    }

    public abstract void b();

    public final sb.k c() {
        return this.f16098a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public u0(sb.k kVar) {
        this.f16098a = kVar;
    }
}
