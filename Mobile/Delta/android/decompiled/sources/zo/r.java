package zo;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements ft.d<ku.p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f37947a;

    public r(n nVar) {
        this.f37947a = nVar;
    }

    public static r a(n nVar) {
        return new r(nVar);
    }

    public static ku.p0 c(n nVar) {
        return (ku.p0) ft.h.e(nVar.getLifecycleCoroutineScope());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ku.p0 get() {
        return c(this.f37947a);
    }
}
