package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27614a;
    public final /* synthetic */ n8 b;

    public n7(n8 n8Var, hf hfVar) {
        this.f27614a = hfVar;
        Objects.requireNonNull(n8Var);
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n8 n8Var = this.b;
        n8Var.z2().E();
        n8Var.z2().h0(this.f27614a);
    }
}
