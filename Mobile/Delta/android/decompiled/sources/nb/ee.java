package nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ee implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25497a;
    public final /* synthetic */ me b;

    public ee(me meVar, zzr zzrVar) {
        this.f25497a = zzrVar;
        Objects.requireNonNull(meVar);
        this.b = meVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzr zzrVar = this.f25497a;
        String str = (String) n9.m.l(zzrVar.f7445f);
        me meVar = this.b;
        q8 q8VarG = meVar.g(str);
        p8 p8Var = p8.ANALYTICS_STORAGE;
        if (q8VarG.o(p8Var) && q8.f(zzrVar.f7463x, 100).o(p8Var)) {
            return meVar.o0(zzrVar).p0();
        }
        meVar.a().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
