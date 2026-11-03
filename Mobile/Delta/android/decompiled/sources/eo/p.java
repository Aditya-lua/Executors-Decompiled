package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16206a;

    public p(g gVar) {
        this.f16206a = gVar;
    }

    public static p a(g gVar) {
        return new p(gVar);
    }

    public static d c(g gVar) {
        return (d) dt.h.e(gVar.i());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f16206a);
    }
}
