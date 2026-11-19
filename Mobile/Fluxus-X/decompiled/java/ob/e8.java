package ob;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class e8 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27293a;
    public final /* synthetic */ Bundle b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f27294c;

    public e8(n8 n8Var, hf hfVar, Bundle bundle) {
        this.f27293a = hfVar;
        this.b = bundle;
        Objects.requireNonNull(n8Var);
        this.f27294c = n8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n8 n8Var = this.f27294c;
        n8Var.z2().E();
        return n8Var.z2().q0(this.f27293a, this.b);
    }
}
