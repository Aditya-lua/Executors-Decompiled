package po;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements dt.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<sq.a> f28849a;

    public k(dt.i<sq.a> iVar) {
        this.f28849a = iVar;
    }

    public static k a(dt.i<sq.a> iVar) {
        return new k(iVar);
    }

    public static i c(sq.a aVar) {
        return new i(aVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f28849a.get());
    }
}
