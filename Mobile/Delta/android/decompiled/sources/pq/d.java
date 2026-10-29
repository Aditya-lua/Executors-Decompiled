package pq;

import ku.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ft.d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<e> f28817a;
    public final ft.i<p0> b;

    public d(ft.i<e> iVar, ft.i<p0> iVar2) {
        this.f28817a = iVar;
        this.b = iVar2;
    }

    public static d a(ft.i<e> iVar, ft.i<p0> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c c(e eVar, p0 p0Var) {
        return new c(eVar, p0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f28817a.get(), this.b.get());
    }
}
