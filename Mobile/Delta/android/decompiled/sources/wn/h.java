package wn;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements dt.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34629a;
    public final dt.i<r> b;

    public h(e eVar, dt.i<r> iVar) {
        this.f34629a = eVar;
        this.b = iVar;
    }

    public static h a(e eVar, dt.i<r> iVar) {
        return new h(eVar, iVar);
    }

    public static b b(e eVar, r rVar) {
        return (b) dt.h.e(eVar.c(rVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b get() {
        return b(this.f34629a, this.b.get());
    }
}
