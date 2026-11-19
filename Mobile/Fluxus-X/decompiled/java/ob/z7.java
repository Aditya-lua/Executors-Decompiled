package ob;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class z7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f28033a;
    public final /* synthetic */ n8 b;

    public z7(n8 n8Var, hf hfVar) {
        this.f28033a = hfVar;
        Objects.requireNonNull(n8Var);
        this.b = n8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n8 n8Var = this.b;
        n8Var.z2().E();
        return new p(n8Var.z2().S0(this.f28033a.f27424f));
    }
}
