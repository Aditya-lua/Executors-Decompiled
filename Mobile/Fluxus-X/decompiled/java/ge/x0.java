package ge;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends u0 {
    public final /* synthetic */ tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f17732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f17733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(f fVar, tb.k kVar, tb.k kVar2, u0 u0Var) {
        super(kVar);
        this.b = kVar2;
        this.f17732c = u0Var;
        this.f17733d = fVar;
    }

    @Override // ge.u0
    public final void b() {
        synchronized (this.f17733d.f17705f) {
            try {
                f.o(this.f17733d, this.b);
                if (this.f17733d.f17711l.getAndIncrement() > 0) {
                    this.f17733d.b.c("Already connected to the service.", new Object[0]);
                }
                f.q(this.f17733d, this.f17732c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
