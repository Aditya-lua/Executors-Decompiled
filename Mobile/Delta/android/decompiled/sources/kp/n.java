package kp;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements dt.d<g.c<String[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f23176a;

    public n(i iVar) {
        this.f23176a = iVar;
    }

    public static n a(i iVar) {
        return new n(iVar);
    }

    public static g.c<String[]> c(i iVar) {
        return (g.c) dt.h.e(iVar.a());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<String[]> get() {
        return c(this.f23176a);
    }
}
