package ro;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ft.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<uq.a> f29989a;

    public k(ft.i<uq.a> iVar) {
        this.f29989a = iVar;
    }

    public static k a(ft.i<uq.a> iVar) {
        return new k(iVar);
    }

    public static i c(uq.a aVar) {
        return new i(aVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f29989a.get());
    }
}
