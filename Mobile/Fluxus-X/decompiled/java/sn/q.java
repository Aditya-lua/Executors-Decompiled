package sn;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements wt.d<dv.b0<xn.d>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f31665a;

    public q(n nVar) {
        this.f31665a = nVar;
    }

    public static q a(n nVar) {
        return new q(nVar);
    }

    public static dv.b0<xn.d> c(n nVar) {
        return (dv.b0) wt.h.e(nVar.c());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dv.b0<xn.d> get() {
        return c(this.f31665a);
    }
}
