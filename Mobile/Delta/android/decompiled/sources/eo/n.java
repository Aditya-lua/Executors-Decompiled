package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16204a;

    public n(g gVar) {
        this.f16204a = gVar;
    }

    public static n a(g gVar) {
        return new n(gVar);
    }

    public static d c(g gVar) {
        return (d) dt.h.e(gVar.g());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f16204a);
    }
}
