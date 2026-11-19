package mo;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23414a;
    public final wt.i<t> b;

    public i(e eVar, wt.i<t> iVar) {
        this.f23414a = eVar;
        this.b = iVar;
    }

    public static i a(e eVar, wt.i<t> iVar) {
        return new i(eVar, iVar);
    }

    public static d b(e eVar, t tVar) {
        return (d) wt.h.e(eVar.d(tVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f23414a, this.b.get());
    }
}
