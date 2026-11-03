package xd;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends j {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f35669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f35670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, sb.k kVar, sb.k kVar2, j jVar) {
        super(kVar);
        this.b = kVar2;
        this.f35669c = jVar;
        this.f35670d = tVar;
    }

    @Override // xd.j
    public final void a() {
        synchronized (this.f35670d.f35678f) {
            try {
                t.n(this.f35670d, this.b);
                if (this.f35670d.f35683k.getAndIncrement() > 0) {
                    this.f35670d.b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f35670d, this.f35669c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
