package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16205a;

    public o(g gVar) {
        this.f16205a = gVar;
    }

    public static o a(g gVar) {
        return new o(gVar);
    }

    public static d c(g gVar) {
        return (d) dt.h.e(gVar.h());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f16205a);
    }
}
