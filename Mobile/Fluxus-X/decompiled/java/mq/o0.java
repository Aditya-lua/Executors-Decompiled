package mq;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements wt.d<Set<nn.b0<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<p> f23747a;
    public final wt.i<nq.p0> b;

    public o0(wt.i<p> iVar, wt.i<nq.p0> iVar2) {
        this.f23747a = iVar;
        this.b = iVar2;
    }

    public static o0 a(wt.i<p> iVar, wt.i<nq.p0> iVar2) {
        return new o0(iVar, iVar2);
    }

    public static Set<nn.b0<?>> c(p pVar, nq.p0 p0Var) {
        return (Set) wt.h.e(n0.a(pVar, p0Var));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<nn.b0<?>> get() {
        return c(this.f23747a.get(), this.b.get());
    }
}
