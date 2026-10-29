package yp;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements ft.d<Set<an.a0<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.selfie.d> f36047a;
    public final ft.i<zp.p0> b;

    public b0(ft.i<com.withpersona.sdk2.inquiry.selfie.d> iVar, ft.i<zp.p0> iVar2) {
        this.f36047a = iVar;
        this.b = iVar2;
    }

    public static b0 a(ft.i<com.withpersona.sdk2.inquiry.selfie.d> iVar, ft.i<zp.p0> iVar2) {
        return new b0(iVar, iVar2);
    }

    public static Set<an.a0<?>> c(com.withpersona.sdk2.inquiry.selfie.d dVar, zp.p0 p0Var) {
        return (Set) ft.h.e(com.withpersona.sdk2.inquiry.selfie.j.a(dVar, p0Var));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<an.a0<?>> get() {
        return c(this.f36047a.get(), this.b.get());
    }
}
