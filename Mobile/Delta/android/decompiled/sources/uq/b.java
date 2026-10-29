package uq;

import ft.d;
import ft.i;
import ku.p0;
import pq.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<e> f32584a;
    public final i<go.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f32585c;

    public b(i<e> iVar, i<go.e> iVar2, i<p0> iVar3) {
        this.f32584a = iVar;
        this.b = iVar2;
        this.f32585c = iVar3;
    }

    public static b a(i<e> iVar, i<go.e> iVar2, i<p0> iVar3) {
        return new b(iVar, iVar2, iVar3);
    }

    public static a c(e eVar, go.e eVar2, p0 p0Var) {
        return new a(eVar, eVar2, p0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f32584a.get(), this.b.get(), this.f32585c.get());
    }
}
