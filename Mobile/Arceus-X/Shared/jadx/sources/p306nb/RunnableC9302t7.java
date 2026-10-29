package p306nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.t7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9302t7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC9127i8 f33497b;

    public RunnableC9302t7(BinderC9127i8 binderC9127i8, zzr zzrVar) {
        this.f33496a = zzrVar;
        Objects.requireNonNull(binderC9127i8);
        this.f33497b = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC9127i8 binderC9127i8 = this.f33497b;
        binderC9127i8.m36366z2().m36505E();
        C9197me c9197meM36366z2 = binderC9127i8.m36366z2();
        c9197meM36366z2.mo36322b().mo36088h();
        c9197meM36366z2.m36523O0();
        zzr zzrVar = this.f33496a;
        C8953m.m36041f(zzrVar.f9535f);
        c9197meM36366z2.m36525P0(zzrVar);
        c9197meM36366z2.m36526Q0(zzrVar);
    }
}
