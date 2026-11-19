package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27948a;
    public final /* synthetic */ n8 b;

    public w7(n8 n8Var, hf hfVar) {
        this.f27948a = hfVar;
        Objects.requireNonNull(n8Var);
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n8 n8Var = this.b;
        n8Var.z2().E();
        ve veVarZ2 = n8Var.z2();
        veVarZ2.b().h();
        veVarZ2.O0();
        hf hfVar = this.f27948a;
        o9.s.f(hfVar.f27424f);
        veVarZ2.o0(hfVar);
    }
}
