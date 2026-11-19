package aq;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements wt.d<g.d<g.j>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3313a;

    public o(i iVar) {
        this.f3313a = iVar;
    }

    public static o a(i iVar) {
        return new o(iVar);
    }

    public static g.d<g.j> c(i iVar) {
        return (g.d) wt.h.e(iVar.b());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.d<g.j> get() {
        return c(this.f3313a);
    }
}
