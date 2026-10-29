package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class a8 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25330a;
    public final /* synthetic */ Bundle b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f25331c;

    public a8(i8 i8Var, zzr zzrVar, Bundle bundle) {
        this.f25330a = zzrVar;
        this.b = bundle;
        Objects.requireNonNull(i8Var);
        this.f25331c = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i8 i8Var = this.f25331c;
        i8Var.z2().E();
        return i8Var.z2().q0(this.f25330a, this.b);
    }
}
