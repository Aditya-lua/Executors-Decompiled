package ae;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends r1 {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g gVar, sb.k kVar, sb.k kVar2, r1 r1Var) {
        super(kVar);
        this.f366d = gVar;
        this.b = kVar2;
        this.f365c = r1Var;
    }

    @Override // ae.r1
    public final void c() {
        synchronized (this.f366d.f328f) {
            try {
                g.n(this.f366d, this.b);
                if (this.f366d.f333k.getAndIncrement() > 0) {
                    this.f366d.b.d("Already connected to the service.", new Object[0]);
                }
                g.p(this.f366d, this.f365c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
