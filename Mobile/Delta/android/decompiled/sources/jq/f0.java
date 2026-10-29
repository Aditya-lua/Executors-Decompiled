package jq;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ft.d<vq.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f21623a;

    public f0(c0 c0Var) {
        this.f21623a = c0Var;
    }

    public static f0 a(c0 c0Var) {
        return new f0(c0Var);
    }

    public static vq.a c(c0 c0Var) {
        return (vq.a) ft.h.e(c0Var.c());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public vq.a get() {
        return c(this.f21623a);
    }
}
