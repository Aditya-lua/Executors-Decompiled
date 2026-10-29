package p306nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nb.h7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9110h7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33005a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC9127i8 f33006b;

    public CallableC9110h7(BinderC9127i8 binderC9127i8, String str) {
        this.f33005a = str;
        Objects.requireNonNull(binderC9127i8);
        this.f33006b = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC9127i8 binderC9127i8 = this.f33006b;
        binderC9127i8.m36366z2().m36505E();
        return binderC9127i8.m36366z2().m36507F0().m36795C0(this.f33005a);
    }
}
