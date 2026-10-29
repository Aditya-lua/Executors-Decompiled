package nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25624a;
    public final /* synthetic */ i8 b;

    public j7(i8 i8Var, zzr zzrVar) {
        this.f25624a = zzrVar;
        Objects.requireNonNull(i8Var);
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        i8 i8Var = this.b;
        i8Var.z2().E();
        i8Var.z2().i0(this.f25624a);
    }
}
