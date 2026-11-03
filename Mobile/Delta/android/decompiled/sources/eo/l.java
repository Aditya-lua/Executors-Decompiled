package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16202a;

    public l(g gVar) {
        this.f16202a = gVar;
    }

    public static l a(g gVar) {
        return new l(gVar);
    }

    public static d b(g gVar) {
        return (d) dt.h.e(gVar.e());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f16202a);
    }
}
