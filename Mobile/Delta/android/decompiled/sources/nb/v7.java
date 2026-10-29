package nb;

import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f26026a;
    public final /* synthetic */ zzr b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f26027c;

    public v7(i8 i8Var, zzbg zzbgVar, zzr zzrVar) {
        this.f26026a = zzbgVar;
        this.b = zzrVar;
        Objects.requireNonNull(i8Var);
        this.f26027c = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbg zzbgVar = this.f26026a;
        zzr zzrVar = this.b;
        i8 i8Var = this.f26027c;
        i8Var.D2(i8Var.E2(zzbgVar, zzrVar), zzrVar);
    }
}
