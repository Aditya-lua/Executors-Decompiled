package np;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements wt.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<up.w> f26350a;
    public final wt.i<hn.w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<bq.b> f26351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<av.p0> f26352d;

    public j(wt.i<up.w> iVar, wt.i<hn.w> iVar2, wt.i<bq.b> iVar3, wt.i<av.p0> iVar4) {
        this.f26350a = iVar;
        this.b = iVar2;
        this.f26351c = iVar3;
        this.f26352d = iVar4;
    }

    public static j a(wt.i<up.w> iVar, wt.i<hn.w> iVar2, wt.i<bq.b> iVar3, wt.i<av.p0> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i c(up.w wVar, hn.w wVar2, bq.b bVar, av.p0 p0Var) {
        return new i(wVar, wVar2, bVar, p0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f26350a.get(), this.b.get(), this.f26351c.get(), this.f26352d.get());
    }
}
