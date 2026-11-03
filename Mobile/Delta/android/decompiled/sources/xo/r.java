package xo;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements dt.d<iu.p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f36070a;

    public r(n nVar) {
        this.f36070a = nVar;
    }

    public static r a(n nVar) {
        return new r(nVar);
    }

    public static iu.p0 c(n nVar) {
        return (iu.p0) dt.h.e(nVar.getLifecycleCoroutineScope());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public iu.p0 get() {
        return c(this.f36070a);
    }
}
