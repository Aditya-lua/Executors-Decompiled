package p306nb;

import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: renamed from: nb.v7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9334v7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbg f33557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f33558b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC9127i8 f33559c;

    public RunnableC9334v7(BinderC9127i8 binderC9127i8, zzbg zzbgVar, zzr zzrVar) {
        this.f33557a = zzbgVar;
        this.f33558b = zzrVar;
        Objects.requireNonNull(binderC9127i8);
        this.f33559c = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbg zzbgVar = this.f33557a;
        zzr zzrVar = this.f33558b;
        BinderC9127i8 binderC9127i8 = this.f33559c;
        binderC9127i8.m36356D2(binderC9127i8.m36357E2(zzbgVar, zzrVar), zzrVar);
    }
}
