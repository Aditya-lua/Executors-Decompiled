package mo;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements wt.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23413a;
    public final wt.i<r> b;

    public h(e eVar, wt.i<r> iVar) {
        this.f23413a = eVar;
        this.b = iVar;
    }

    public static h a(e eVar, wt.i<r> iVar) {
        return new h(eVar, iVar);
    }

    public static b b(e eVar, r rVar) {
        return (b) wt.h.e(eVar.c(rVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b get() {
        return b(this.f23413a, this.b.get());
    }
}
