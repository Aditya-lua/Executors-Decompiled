package vo;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements wt.d<Set<nn.b0<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<xo.z> f34493a;

    public c0(wt.i<xo.z> iVar) {
        this.f34493a = iVar;
    }

    public static c0 a(wt.i<xo.z> iVar) {
        return new c0(iVar);
    }

    public static Set<nn.b0<?>> c(xo.z zVar) {
        return (Set) wt.h.e(a0.b(zVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<nn.b0<?>> get() {
        return c(this.f34493a.get());
    }
}
