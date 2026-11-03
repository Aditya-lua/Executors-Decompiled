package go;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements dt.d<Set<ym.a0<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<io.z> f18742a;

    public m(dt.i<io.z> iVar) {
        this.f18742a = iVar;
    }

    public static m a(dt.i<io.z> iVar) {
        return new m(iVar);
    }

    public static Set<ym.a0<?>> c(io.z zVar) {
        return (Set) dt.h.e(com.withpersona.sdk2.inquiry.governmentid.k.b(zVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<ym.a0<?>> get() {
        return c(this.f18742a.get());
    }
}
