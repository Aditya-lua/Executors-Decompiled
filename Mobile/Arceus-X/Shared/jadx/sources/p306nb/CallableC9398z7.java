package p306nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nb.z7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9398z7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f33830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC9127i8 f33831c;

    public CallableC9398z7(BinderC9127i8 binderC9127i8, zzr zzrVar, Bundle bundle) {
        this.f33829a = zzrVar;
        this.f33830b = bundle;
        Objects.requireNonNull(binderC9127i8);
        this.f33831c = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC9127i8 binderC9127i8 = this.f33831c;
        binderC9127i8.m36366z2().m36505E();
        return binderC9127i8.m36366z2().m36563q0(this.f33829a, this.f33830b);
    }
}
