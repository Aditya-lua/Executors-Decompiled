package ib;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f20453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f20454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, sb.k kVar, sb.k kVar2, e eVar) {
        super(kVar);
        this.b = kVar2;
        this.f20453c = eVar;
        Objects.requireNonNull(oVar);
        this.f20454d = oVar;
    }

    @Override // ib.e
    public final void b() {
        o oVar = this.f20454d;
        synchronized (oVar.f20462f) {
            try {
                o.o(oVar, this.b);
                if (oVar.f20467k.getAndIncrement() > 0) {
                    oVar.b.c("Already connected to the service.", new Object[0]);
                }
                o.q(oVar, this.f20453c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
