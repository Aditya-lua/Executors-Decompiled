package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16208a;

    public r(g gVar) {
        this.f16208a = gVar;
    }

    public static r a(g gVar) {
        return new r(gVar);
    }

    public static d c(g gVar) {
        return (d) dt.h.e(gVar.k());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f16208a);
    }
}
