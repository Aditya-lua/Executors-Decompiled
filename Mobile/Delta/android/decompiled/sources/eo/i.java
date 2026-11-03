package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16199a;

    public i(g gVar) {
        this.f16199a = gVar;
    }

    public static i a(g gVar) {
        return new i(gVar);
    }

    public static d b(g gVar) {
        return (d) dt.h.e(gVar.b());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f16199a);
    }
}
