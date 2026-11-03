package dn;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements dt.d<r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<eo.e> f15192a;

    public s0(dt.i<eo.e> iVar) {
        this.f15192a = iVar;
    }

    public static s0 a(dt.i<eo.e> iVar) {
        return new s0(iVar);
    }

    public static r0 c(eo.e eVar) {
        return new r0(eVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 get() {
        return c(this.f15192a.get());
    }
}
