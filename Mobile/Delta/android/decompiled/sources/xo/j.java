package xo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements dt.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<ep.w> f36032a;
    public final dt.i<sm.w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<lp.b> f36033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<iu.p0> f36034d;

    public j(dt.i<ep.w> iVar, dt.i<sm.w> iVar2, dt.i<lp.b> iVar3, dt.i<iu.p0> iVar4) {
        this.f36032a = iVar;
        this.b = iVar2;
        this.f36033c = iVar3;
        this.f36034d = iVar4;
    }

    public static j a(dt.i<ep.w> iVar, dt.i<sm.w> iVar2, dt.i<lp.b> iVar3, dt.i<iu.p0> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i c(ep.w wVar, sm.w wVar2, lp.b bVar, iu.p0 p0Var) {
        return new i(wVar, wVar2, bVar, p0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f36032a.get(), this.b.get(), this.f36033c.get(), this.f36034d.get());
    }
}
