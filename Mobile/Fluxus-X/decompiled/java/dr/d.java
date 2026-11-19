package dr;

import av.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements wt.d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<e> f12628a;
    public final wt.i<p0> b;

    public d(wt.i<e> iVar, wt.i<p0> iVar2) {
        this.f12628a = iVar;
        this.b = iVar2;
    }

    public static d a(wt.i<e> iVar, wt.i<p0> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c c(e eVar, p0 p0Var) {
        return new c(eVar, p0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f12628a.get(), this.b.get());
    }
}
