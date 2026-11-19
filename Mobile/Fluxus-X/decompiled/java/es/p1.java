package es;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<gs.c> f14407a;
    public final wt.i<mo.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<g.d<aq.b>> f14408c;

    public p1(wt.i<gs.c> iVar, wt.i<mo.a> iVar2, wt.i<g.d<aq.b>> iVar3) {
        this.f14407a = iVar;
        this.b = iVar2;
        this.f14408c = iVar3;
    }

    public static p1 a(wt.i<gs.c> iVar, wt.i<mo.a> iVar2, wt.i<g.d<aq.b>> iVar3) {
        return new p1(iVar, iVar2, iVar3);
    }

    public static o1 c(gs.c cVar, mo.a aVar, g.d<aq.b> dVar, String str, String str2, String str3, String str4) {
        return new o1(cVar, aVar, dVar, str, str2, str3, str4);
    }

    public o1 b(String str, String str2, String str3, String str4) {
        return c(this.f14407a.get(), this.b.get(), this.f14408c.get(), str, str2, str3, str4);
    }
}
