package wd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f34167a;

    public j() {
        this.f34167a = null;
    }

    public abstract void a();

    public final sb.k b() {
        return this.f34167a;
    }

    public final void c(Exception exc) {
        sb.k kVar = this.f34167a;
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

    public j(sb.k kVar) {
        this.f34167a = kVar;
    }
}
