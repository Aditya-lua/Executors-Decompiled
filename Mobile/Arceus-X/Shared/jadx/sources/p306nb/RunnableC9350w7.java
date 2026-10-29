package p306nb;

import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* JADX INFO: renamed from: nb.w7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9350w7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbg f33605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33606b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC9127i8 f33607c;

    public RunnableC9350w7(BinderC9127i8 binderC9127i8, zzbg zzbgVar, String str) {
        this.f33605a = zzbgVar;
        this.f33606b = str;
        Objects.requireNonNull(binderC9127i8);
        this.f33607c = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC9127i8 binderC9127i8 = this.f33607c;
        binderC9127i8.m36366z2().m36505E();
        binderC9127i8.m36366z2().m36546i(this.f33605a, this.f33606b);
    }
}
