package x0;

import g0.h1;
import g0.l1;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f35160a;
    public final l1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2.a<Throwable> f35161c;

    public y(g0.n nVar) {
        x2.g.a(nVar.g() == 4);
        this.f35160a = nVar.c();
        l1 l1VarD = nVar.d();
        Objects.requireNonNull(l1VarD);
        this.b = l1VarD;
        this.f35161c = nVar.b();
    }

    public static /* synthetic */ Object a(final y yVar, final l1.a aVar, final y1.c.a aVar2) {
        yVar.f35160a.execute(new Runnable() { // from class: x0.x
            @Override // java.lang.Runnable
            public final void run() {
                y yVar2 = this.f35157a;
                aVar2.c(yVar2.b.a(aVar));
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public l1.b c(final l1.a aVar) throws h1 {
        try {
            return (l1.b) y1.c.a(new y1.c.InterfaceC0665c() { // from class: x0.w
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar2) {
                    return y.a(this.f35155a, aVar, aVar2);
                }
            }).get();
        } catch (Exception e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new h1(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
