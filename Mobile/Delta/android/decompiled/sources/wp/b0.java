package wp;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements dt.d<Set<ym.a0<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.selfie.d> f34676a;
    public final dt.i<xp.p0> b;

    public b0(dt.i<com.withpersona.sdk2.inquiry.selfie.d> iVar, dt.i<xp.p0> iVar2) {
        this.f34676a = iVar;
        this.b = iVar2;
    }

    public static b0 a(dt.i<com.withpersona.sdk2.inquiry.selfie.d> iVar, dt.i<xp.p0> iVar2) {
        return new b0(iVar, iVar2);
    }

    public static Set<ym.a0<?>> c(com.withpersona.sdk2.inquiry.selfie.d dVar, xp.p0 p0Var) {
        return (Set) dt.h.e(com.withpersona.sdk2.inquiry.selfie.j.a(dVar, p0Var));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<ym.a0<?>> get() {
        return c(this.f34676a.get(), this.b.get());
    }
}
