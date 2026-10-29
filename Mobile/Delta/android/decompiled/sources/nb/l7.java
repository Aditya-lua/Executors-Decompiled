package nb;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzah f25726a;
    public final /* synthetic */ zzr b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f25727c;

    public l7(i8 i8Var, zzah zzahVar, zzr zzrVar) {
        this.f25726a = zzahVar;
        this.b = zzrVar;
        Objects.requireNonNull(i8Var);
        this.f25727c = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.f25727c;
        i8Var.z2().E();
        zzah zzahVar = this.f25726a;
        if (zzahVar.f7411h.zza() == null) {
            i8Var.z2().m0(zzahVar, this.b);
        } else {
            i8Var.z2().k0(zzahVar, this.b);
        }
    }
}
