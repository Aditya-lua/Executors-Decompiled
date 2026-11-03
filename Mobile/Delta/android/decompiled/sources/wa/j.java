package wa;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f34351a;

    public /* synthetic */ j(l lVar, i iVar) {
        this.f34351a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f34351a.a();
        if (jA == -1 || u9.h.c().a() <= jA) {
            return;
        }
        l.e(this.f34351a.f34353a);
    }
}
