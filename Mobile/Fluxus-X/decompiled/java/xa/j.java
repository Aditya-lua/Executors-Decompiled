package xa;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f36635a;

    public /* synthetic */ j(l lVar, i iVar) {
        this.f36635a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f36635a.a();
        if (jA == -1 || v9.h.d().a() <= jA) {
            return;
        }
        l.e(this.f36635a.f36637a);
    }
}
