package fp;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements wt.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<ir.b> f16277a;

    public k(wt.i<ir.b> iVar) {
        this.f16277a = iVar;
    }

    public static k a(wt.i<ir.b> iVar) {
        return new k(iVar);
    }

    public static i c(ir.b bVar) {
        return new i(bVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f16277a.get());
    }
}
