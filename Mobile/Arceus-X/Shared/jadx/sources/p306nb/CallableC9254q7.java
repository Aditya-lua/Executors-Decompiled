package p306nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nb.q7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9254q7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33382c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC9127i8 f33383d;

    public CallableC9254q7(BinderC9127i8 binderC9127i8, String str, String str2, String str3) {
        this.f33380a = str;
        this.f33381b = str2;
        this.f33382c = str3;
        Objects.requireNonNull(binderC9127i8);
        this.f33383d = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC9127i8 binderC9127i8 = this.f33383d;
        binderC9127i8.m36366z2().m36505E();
        return binderC9127i8.m36366z2().m36507F0().m36805H0(this.f33380a, this.f33381b, this.f33382c);
    }
}
