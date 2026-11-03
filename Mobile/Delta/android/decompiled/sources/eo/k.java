package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16201a;

    public k(g gVar) {
        this.f16201a = gVar;
    }

    public static k a(g gVar) {
        return new k(gVar);
    }

    public static d b(g gVar) {
        return (d) dt.h.e(gVar.d());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f16201a);
    }
}
