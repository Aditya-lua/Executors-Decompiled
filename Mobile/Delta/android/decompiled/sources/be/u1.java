package be;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends r1 {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f4037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f4038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g gVar, sb.k kVar, sb.k kVar2, r1 r1Var) {
        super(kVar);
        this.f4038d = gVar;
        this.b = kVar2;
        this.f4037c = r1Var;
    }

    @Override // be.r1
    public final void c() {
        synchronized (this.f4038d.f4000f) {
            try {
                g.n(this.f4038d, this.b);
                if (this.f4038d.f4005k.getAndIncrement() > 0) {
                    this.f4038d.b.d("Already connected to the service.", new Object[0]);
                }
                g.p(this.f4038d, this.f4037c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
