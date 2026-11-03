package ee;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends u0 {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f16105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f16106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(f fVar, sb.k kVar, sb.k kVar2, u0 u0Var) {
        super(kVar);
        this.b = kVar2;
        this.f16105c = u0Var;
        this.f16106d = fVar;
    }

    @Override // ee.u0
    public final void b() {
        synchronized (this.f16106d.f16078f) {
            try {
                f.o(this.f16106d, this.b);
                if (this.f16106d.f16084l.getAndIncrement() > 0) {
                    this.f16106d.b.c("Already connected to the service.", new Object[0]);
                }
                f.q(this.f16106d, this.f16105c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
