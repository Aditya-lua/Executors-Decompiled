package ob;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class f8 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27321a;
    public final /* synthetic */ Bundle b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f27322c;

    public f8(n8 n8Var, hf hfVar, Bundle bundle) {
        this.f27321a = hfVar;
        this.b = bundle;
        Objects.requireNonNull(n8Var);
        this.f27322c = n8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n8 n8Var = this.f27322c;
        n8Var.z2().E();
        return n8Var.z2().q0(this.f27321a, this.b);
    }
}
