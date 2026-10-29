package p1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x2.c<y1.c.a<Void>, T> f28179a;

    public static /* synthetic */ Object a(n nVar, Object obj, y1.c.a aVar) {
        x2.c<y1.c.a<Void>, T> cVar = nVar.f28179a;
        if (cVar != null) {
            y1.c.a<Void> aVar2 = cVar.f34681a;
            Objects.requireNonNull(aVar2);
            aVar2.d();
        }
        nVar.f28179a = new x2.c<>(aVar, obj);
        return "PendingValue " + obj;
    }

    public void b(t.a<T, me.x<Void>> aVar) {
        p0.z.b();
        x2.c<y1.c.a<Void>, T> cVar = this.f28179a;
        if (cVar != null) {
            me.x<Void> xVarApply = aVar.apply(cVar.b);
            y1.c.a<Void> aVar2 = this.f28179a.f34681a;
            Objects.requireNonNull(aVar2);
            r0.n.t(xVarApply, aVar2);
            this.f28179a = null;
        }
    }

    public me.x<Void> c(final T t8) {
        p0.z.b();
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: p1.m
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return n.a(this.f28177a, t8, aVar);
            }
        });
    }
}
