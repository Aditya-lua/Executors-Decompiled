package nb;

/* JADX INFO: loaded from: classes.dex */
public final class pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9.e f25864a;
    public long b;

    public pd(u9.e eVar) {
        n9.m.l(eVar);
        this.f25864a = eVar;
    }

    public final void a() {
        this.b = this.f25864a.b();
    }

    public final void b() {
        this.b = 0L;
    }

    public final boolean c(long j10) {
        return this.b == 0 || this.f25864a.b() - this.b >= 3600000;
    }
}
