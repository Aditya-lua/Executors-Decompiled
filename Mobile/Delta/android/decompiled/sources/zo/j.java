package zo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ft.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<gp.w> f37909a;
    public final ft.i<um.w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<np.b> f37910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<ku.p0> f37911d;

    public j(ft.i<gp.w> iVar, ft.i<um.w> iVar2, ft.i<np.b> iVar3, ft.i<ku.p0> iVar4) {
        this.f37909a = iVar;
        this.b = iVar2;
        this.f37910c = iVar3;
        this.f37911d = iVar4;
    }

    public static j a(ft.i<gp.w> iVar, ft.i<um.w> iVar2, ft.i<np.b> iVar3, ft.i<ku.p0> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i c(gp.w wVar, um.w wVar2, np.b bVar, ku.p0 p0Var) {
        return new i(wVar, wVar2, bVar, p0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f37909a.get(), this.b.get(), this.f37910c.get(), this.f37911d.get());
    }
}
