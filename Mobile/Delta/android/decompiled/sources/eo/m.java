package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16203a;

    public m(g gVar) {
        this.f16203a = gVar;
    }

    public static m a(g gVar) {
        return new m(gVar);
    }

    public static d c(g gVar) {
        return (d) dt.h.e(gVar.f());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f16203a);
    }
}
