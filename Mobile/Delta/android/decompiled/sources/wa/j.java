package wa;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f34145a;

    public /* synthetic */ j(l lVar, i iVar) {
        this.f34145a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f34145a.a();
        if (jA == -1 || u9.h.c().a() <= jA) {
            return;
        }
        l.e(this.f34145a.f34147a);
    }
}
