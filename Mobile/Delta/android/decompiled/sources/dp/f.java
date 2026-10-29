package dp;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ft.d<fo.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14767a;
    public final ft.i<i> b;

    public f(c cVar, ft.i<i> iVar) {
        this.f14767a = cVar;
        this.b = iVar;
    }

    public static f a(c cVar, ft.i<i> iVar) {
        return new f(cVar, iVar);
    }

    public static fo.a b(c cVar, i iVar) {
        return (fo.a) ft.h.e(cVar.c(iVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fo.a get() {
        return b(this.f14767a, this.b.get());
    }
}
