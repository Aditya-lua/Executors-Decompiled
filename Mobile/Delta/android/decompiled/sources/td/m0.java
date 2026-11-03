package td;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 extends ee.u0 {
    public final /* synthetic */ n0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, sb.k kVar) {
        super(kVar);
        this.b = n0Var;
    }

    @Override // ee.u0
    public final void a(Exception exc) {
        if (!(exc instanceof ee.g)) {
            super.a(exc);
        } else if (n0.j(this.b)) {
            super.a(new b(-2, exc));
        } else {
            super.a(new b(-9, exc));
        }
    }
}
