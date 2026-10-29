package nb;

import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzpl f26127a;
    public final /* synthetic */ zzr b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f26128c;

    public y7(i8 i8Var, zzpl zzplVar, zzr zzrVar) {
        this.f26127a = zzplVar;
        this.b = zzrVar;
        Objects.requireNonNull(i8Var);
        this.f26128c = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.f26128c;
        i8Var.z2().E();
        zzpl zzplVar = this.f26127a;
        if (zzplVar.zza() != null) {
            i8Var.z2().c0(zzplVar, this.b);
        } else {
            zzr zzrVar = this.b;
            i8Var.z2().d0(zzplVar.f7439g, zzrVar);
        }
    }
}
