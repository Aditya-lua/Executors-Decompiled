package de;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends r1 {
    public final /* synthetic */ tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f12235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f12236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g gVar, tb.k kVar, tb.k kVar2, r1 r1Var) {
        super(kVar);
        this.f12236d = gVar;
        this.b = kVar2;
        this.f12235c = r1Var;
    }

    @Override // de.r1
    public final void c() {
        synchronized (this.f12236d.f12198f) {
            try {
                g.n(this.f12236d, this.b);
                if (this.f12236d.f12203k.getAndIncrement() > 0) {
                    this.f12236d.b.d("Already connected to the service.", new Object[0]);
                }
                g.p(this.f12236d, this.f12235c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
