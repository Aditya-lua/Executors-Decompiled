package ho;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements dt.d<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<sq.a> f19565a;

    public p(dt.i<sq.a> iVar) {
        this.f19565a = iVar;
    }

    public static p a(dt.i<sq.a> iVar) {
        return new p(iVar);
    }

    public static n c(sq.a aVar) {
        return new n(aVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f19565a.get());
    }
}
