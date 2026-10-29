package de;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends u0 {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f14609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f14610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(f fVar, sb.k kVar, sb.k kVar2, u0 u0Var) {
        super(kVar);
        this.b = kVar2;
        this.f14609c = u0Var;
        this.f14610d = fVar;
    }

    @Override // de.u0
    public final void b() {
        synchronized (this.f14610d.f14582f) {
            try {
                f.o(this.f14610d, this.b);
                if (this.f14610d.f14588l.getAndIncrement() > 0) {
                    this.f14610d.b.c("Already connected to the service.", new Object[0]);
                }
                f.q(this.f14610d, this.f14609c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
