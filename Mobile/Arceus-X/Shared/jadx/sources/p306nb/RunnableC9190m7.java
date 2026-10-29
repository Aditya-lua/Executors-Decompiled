package p306nb;

import com.google.android.gms.measurement.internal.zzah;
import java.util.Objects;

/* JADX INFO: renamed from: nb.m7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9190m7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzah f33205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC9127i8 f33206b;

    public RunnableC9190m7(BinderC9127i8 binderC9127i8, zzah zzahVar) {
        this.f33205a = zzahVar;
        Objects.requireNonNull(binderC9127i8);
        this.f33206b = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC9127i8 binderC9127i8 = this.f33206b;
        binderC9127i8.m36366z2().m36505E();
        zzah zzahVar = this.f33205a;
        if (zzahVar.f9491h.zza() == null) {
            binderC9127i8.m36366z2().m36553l0(zzahVar);
        } else {
            binderC9127i8.m36366z2().m36549j0(zzahVar);
        }
    }
}
