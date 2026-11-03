package kp;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements dt.d<g.c<g.h>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f23177a;

    public o(i iVar) {
        this.f23177a = iVar;
    }

    public static o a(i iVar) {
        return new o(iVar);
    }

    public static g.c<g.h> c(i iVar) {
        return (g.c) dt.h.e(iVar.b());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<g.h> get() {
        return c(this.f23177a);
    }
}
