package p306nb;

import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: renamed from: nb.y7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9382y7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzpl f33677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f33678b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC9127i8 f33679c;

    public RunnableC9382y7(BinderC9127i8 binderC9127i8, zzpl zzplVar, zzr zzrVar) {
        this.f33677a = zzplVar;
        this.f33678b = zzrVar;
        Objects.requireNonNull(binderC9127i8);
        this.f33679c = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC9127i8 binderC9127i8 = this.f33679c;
        binderC9127i8.m36366z2().m36505E();
        zzpl zzplVar = this.f33677a;
        if (zzplVar.zza() != null) {
            binderC9127i8.m36366z2().m36537c0(zzplVar, this.f33678b);
        } else {
            zzr zzrVar = this.f33678b;
            binderC9127i8.m36366z2().m36538d0(zzplVar.f9519g, zzrVar);
        }
    }
}
