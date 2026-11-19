package jb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {
    public final /* synthetic */ tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f20257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f20258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, tb.k kVar, tb.k kVar2, e eVar) {
        super(kVar);
        this.b = kVar2;
        this.f20257c = eVar;
        Objects.requireNonNull(oVar);
        this.f20258d = oVar;
    }

    @Override // jb.e
    public final void b() {
        o oVar = this.f20258d;
        synchronized (oVar.f20266f) {
            try {
                o.o(oVar, this.b);
                if (oVar.f20271k.getAndIncrement() > 0) {
                    oVar.b.c("Already connected to the service.", new Object[0]);
                }
                o.q(oVar, this.f20257c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
