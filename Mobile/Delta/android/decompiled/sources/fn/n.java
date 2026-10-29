package fn;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements ft.d<nu.b0<kn.c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16939a;

    public n(k kVar) {
        this.f16939a = kVar;
    }

    public static n a(k kVar) {
        return new n(kVar);
    }

    public static nu.b0<kn.c> c(k kVar) {
        return (nu.b0) ft.h.e(kVar.c());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nu.b0<kn.c> get() {
        return c(this.f16939a);
    }
}
