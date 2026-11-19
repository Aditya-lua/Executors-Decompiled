package gb;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f17647c;

    public m1(o1 o1Var, int i10) {
        super(o1Var.size(), i10);
        this.f17647c = o1Var;
    }

    @Override // gb.e1
    public final Object a(int i10) {
        return this.f17647c.get(i10);
    }
}
