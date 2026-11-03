package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16198a;

    public h(g gVar) {
        this.f16198a = gVar;
    }

    public static d a(g gVar) {
        return (d) dt.h.e(gVar.a());
    }

    public static h b(g gVar) {
        return new h(gVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return a(this.f16198a);
    }
}
