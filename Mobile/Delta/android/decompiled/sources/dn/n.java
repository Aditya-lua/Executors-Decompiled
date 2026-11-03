package dn;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements dt.d<lu.b0<in.c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15135a;

    public n(k kVar) {
        this.f15135a = kVar;
    }

    public static n a(k kVar) {
        return new n(kVar);
    }

    public static lu.b0<in.c> c(k kVar) {
        return (lu.b0) dt.h.e(kVar.c());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public lu.b0<in.c> get() {
        return c(this.f15135a);
    }
}
