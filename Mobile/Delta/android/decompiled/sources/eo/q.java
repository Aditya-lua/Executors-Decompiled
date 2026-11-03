package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16207a;

    public q(g gVar) {
        this.f16207a = gVar;
    }

    public static q a(g gVar) {
        return new q(gVar);
    }

    public static d c(g gVar) {
        return (d) dt.h.e(gVar.j());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f16207a);
    }
}
