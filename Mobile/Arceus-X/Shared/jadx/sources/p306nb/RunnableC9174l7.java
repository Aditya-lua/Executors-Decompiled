package p306nb;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: renamed from: nb.l7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9174l7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzah f33180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f33181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC9127i8 f33182c;

    public RunnableC9174l7(BinderC9127i8 binderC9127i8, zzah zzahVar, zzr zzrVar) {
        this.f33180a = zzahVar;
        this.f33181b = zzrVar;
        Objects.requireNonNull(binderC9127i8);
        this.f33182c = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC9127i8 binderC9127i8 = this.f33182c;
        binderC9127i8.m36366z2().m36505E();
        zzah zzahVar = this.f33180a;
        if (zzahVar.f9491h.zza() == null) {
            binderC9127i8.m36366z2().m36555m0(zzahVar, this.f33181b);
        } else {
            binderC9127i8.m36366z2().m36551k0(zzahVar, this.f33181b);
        }
    }
}
