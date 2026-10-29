package fn;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements ft.d<r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<go.e> f16996a;

    public s0(ft.i<go.e> iVar) {
        this.f16996a = iVar;
    }

    public static s0 a(ft.i<go.e> iVar) {
        return new s0(iVar);
    }

    public static r0 c(go.e eVar) {
        return new r0(eVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 get() {
        return c(this.f16996a.get());
    }
}
