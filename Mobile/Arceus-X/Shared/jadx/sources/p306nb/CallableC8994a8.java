package p306nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nb.a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC8994a8 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f32679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f32680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC9127i8 f32681c;

    public CallableC8994a8(BinderC9127i8 binderC9127i8, zzr zzrVar, Bundle bundle) {
        this.f32679a = zzrVar;
        this.f32680b = bundle;
        Objects.requireNonNull(binderC9127i8);
        this.f32681c = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC9127i8 binderC9127i8 = this.f32681c;
        binderC9127i8.m36366z2().m36505E();
        return binderC9127i8.m36366z2().m36563q0(this.f32679a, this.f32680b);
    }
}
