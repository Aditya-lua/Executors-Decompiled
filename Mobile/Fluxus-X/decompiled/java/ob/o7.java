package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27640a;
    public final /* synthetic */ n8 b;

    public o7(n8 n8Var, hf hfVar) {
        this.f27640a = hfVar;
        Objects.requireNonNull(n8Var);
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        n8 n8Var = this.b;
        n8Var.z2().E();
        n8Var.z2().i0(this.f27640a);
    }
}
