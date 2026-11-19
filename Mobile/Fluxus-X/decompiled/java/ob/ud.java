package ob;

/* JADX INFO: loaded from: classes.dex */
public final class ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.e f27856a;
    public long b;

    public ud(v9.e eVar) {
        o9.s.l(eVar);
        this.f27856a = eVar;
    }

    public final void a() {
        this.b = this.f27856a.b();
    }

    public final void b() {
        this.b = 0L;
    }

    public final boolean c(long j10) {
        return this.b == 0 || this.f27856a.b() - this.b >= 3600000;
    }
}
