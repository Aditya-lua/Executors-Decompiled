package np;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements wt.d<av.p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f26416a;

    public r(n nVar) {
        this.f26416a = nVar;
    }

    public static r a(n nVar) {
        return new r(nVar);
    }

    public static av.p0 c(n nVar) {
        return (av.p0) wt.h.e(nVar.getLifecycleCoroutineScope());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public av.p0 get() {
        return c(this.f26416a);
    }
}
