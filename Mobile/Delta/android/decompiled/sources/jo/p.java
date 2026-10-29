package jo;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ft.d<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<uq.a> f21557a;

    public p(ft.i<uq.a> iVar) {
        this.f21557a = iVar;
    }

    public static p a(ft.i<uq.a> iVar) {
        return new p(iVar);
    }

    public static n c(uq.a aVar) {
        return new n(aVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f21557a.get());
    }
}
