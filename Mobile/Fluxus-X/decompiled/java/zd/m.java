package zd;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends j {
    public final /* synthetic */ tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f39220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f39221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, tb.k kVar, tb.k kVar2, j jVar) {
        super(kVar);
        this.b = kVar2;
        this.f39220c = jVar;
        this.f39221d = tVar;
    }

    @Override // zd.j
    public final void a() {
        synchronized (this.f39221d.f39229f) {
            try {
                t.n(this.f39221d, this.b);
                if (this.f39221d.f39234k.getAndIncrement() > 0) {
                    this.f39221d.b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f39221d, this.f39220c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
