package eb;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f15249c;

    public a1(e1 e1Var, int i10) {
        super(e1Var.size(), i10);
        this.f15249c = e1Var;
    }

    @Override // eb.v0
    public final Object a(int i10) {
        return this.f15249c.get(i10);
    }
}
