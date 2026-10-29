package p306nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: renamed from: nb.j7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9142j7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC9127i8 f33066b;

    public RunnableC9142j7(BinderC9127i8 binderC9127i8, zzr zzrVar) {
        this.f33065a = zzrVar;
        Objects.requireNonNull(binderC9127i8);
        this.f33066b = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BinderC9127i8 binderC9127i8 = this.f33066b;
        binderC9127i8.m36366z2().m36505E();
        binderC9127i8.m36366z2().m36547i0(this.f33065a);
    }
}
