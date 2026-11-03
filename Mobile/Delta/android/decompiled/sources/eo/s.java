package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16209a;

    public s(g gVar) {
        this.f16209a = gVar;
    }

    public static s a(g gVar) {
        return new s(gVar);
    }

    public static d c(g gVar) {
        return (d) dt.h.e(gVar.l());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f16209a);
    }
}
