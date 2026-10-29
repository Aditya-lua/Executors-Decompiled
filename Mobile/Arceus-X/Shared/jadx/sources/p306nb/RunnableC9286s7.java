package p306nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: renamed from: nb.s7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9286s7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33457a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC9127i8 f33458b;

    public RunnableC9286s7(BinderC9127i8 binderC9127i8, zzr zzrVar) {
        this.f33457a = zzrVar;
        Objects.requireNonNull(binderC9127i8);
        this.f33458b = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC9127i8 binderC9127i8 = this.f33458b;
        binderC9127i8.m36366z2().m36505E();
        binderC9127i8.m36366z2().m36536b0(this.f33457a);
    }
}
