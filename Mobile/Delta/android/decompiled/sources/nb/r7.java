package nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25926a;
    public final /* synthetic */ i8 b;

    public r7(i8 i8Var, zzr zzrVar) {
        this.f25926a = zzrVar;
        Objects.requireNonNull(i8Var);
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.b;
        i8Var.z2().E();
        me meVarZ2 = i8Var.z2();
        meVarZ2.b().h();
        meVarZ2.O0();
        zzr zzrVar = this.f25926a;
        n9.m.f(zzrVar.f7445f);
        meVarZ2.o0(zzrVar);
    }
}
