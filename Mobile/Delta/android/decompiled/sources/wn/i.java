package wn;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34630a;
    public final dt.i<t> b;

    public i(e eVar, dt.i<t> iVar) {
        this.f34630a = eVar;
        this.b = iVar;
    }

    public static i a(e eVar, dt.i<t> iVar) {
        return new i(eVar, iVar);
    }

    public static d b(e eVar, t tVar) {
        return (d) dt.h.e(eVar.d(tVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f34630a, this.b.get());
    }
}
