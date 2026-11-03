package eo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16200a;

    public j(g gVar) {
        this.f16200a = gVar;
    }

    public static j a(g gVar) {
        return new j(gVar);
    }

    public static d b(g gVar) {
        return (d) dt.h.e(gVar.c());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f16200a);
    }
}
