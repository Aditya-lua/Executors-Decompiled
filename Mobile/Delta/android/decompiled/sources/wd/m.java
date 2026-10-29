package wd;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends j {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f34170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f34171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, sb.k kVar, sb.k kVar2, j jVar) {
        super(kVar);
        this.b = kVar2;
        this.f34170c = jVar;
        this.f34171d = tVar;
    }

    @Override // wd.j
    public final void a() {
        synchronized (this.f34171d.f34179f) {
            try {
                t.n(this.f34171d, this.b);
                if (this.f34171d.f34184k.getAndIncrement() > 0) {
                    this.f34171d.b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f34171d, this.f34170c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
