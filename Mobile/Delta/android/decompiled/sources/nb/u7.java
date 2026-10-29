package nb;

import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class u7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26008a;
    public final /* synthetic */ i8 b;

    public u7(i8 i8Var, zzr zzrVar) {
        this.f26008a = zzrVar;
        Objects.requireNonNull(i8Var);
        this.b = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i8 i8Var = this.b;
        i8Var.z2().E();
        return new zzao(i8Var.z2().S0(this.f26008a.f7445f));
    }
}
