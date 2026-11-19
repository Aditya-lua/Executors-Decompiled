package wo;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements wt.d<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<ir.b> f35943a;

    public q(wt.i<ir.b> iVar) {
        this.f35943a = iVar;
    }

    public static q a(wt.i<ir.b> iVar) {
        return new q(iVar);
    }

    public static o c(ir.b bVar) {
        return new o(bVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c(this.f35943a.get());
    }
}
