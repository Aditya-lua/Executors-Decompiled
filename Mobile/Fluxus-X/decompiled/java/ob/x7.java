package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27966a;
    public final /* synthetic */ n8 b;

    public x7(n8 n8Var, hf hfVar) {
        this.f27966a = hfVar;
        Objects.requireNonNull(n8Var);
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n8 n8Var = this.b;
        n8Var.z2().E();
        n8Var.z2().b0(this.f27966a);
    }
}
