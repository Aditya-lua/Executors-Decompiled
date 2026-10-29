package fb;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f16552c;

    public l1(n1 n1Var, int i10) {
        super(n1Var.size(), i10);
        this.f16552c = n1Var;
    }

    @Override // fb.d1
    public final Object a(int i10) {
        return this.f16552c.get(i10);
    }
}
