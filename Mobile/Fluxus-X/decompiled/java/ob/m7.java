package ob;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class m7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27583a;
    public final /* synthetic */ n8 b;

    public m7(n8 n8Var, String str) {
        this.f27583a = str;
        Objects.requireNonNull(n8Var);
        this.b = n8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n8 n8Var = this.b;
        n8Var.z2().E();
        return n8Var.z2().F0().C0(this.f27583a);
    }
}
