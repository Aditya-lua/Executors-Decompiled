package sn;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements wt.d<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<to.e> f31607a;

    public g1(wt.i<to.e> iVar) {
        this.f31607a = iVar;
    }

    public static g1 a(wt.i<to.e> iVar) {
        return new g1(iVar);
    }

    public static f1 c(to.e eVar) {
        return new f1(eVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        return c(this.f31607a.get());
    }
}
