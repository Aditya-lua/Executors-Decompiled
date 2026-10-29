package p306nb;

import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nb.u7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9318u7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC9127i8 f33533b;

    public CallableC9318u7(BinderC9127i8 binderC9127i8, zzr zzrVar) {
        this.f33532a = zzrVar;
        Objects.requireNonNull(binderC9127i8);
        this.f33533b = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC9127i8 binderC9127i8 = this.f33533b;
        binderC9127i8.m36366z2().m36505E();
        return new zzao(binderC9127i8.m36366z2().m36530S0(this.f33532a.f9535f));
    }
}
