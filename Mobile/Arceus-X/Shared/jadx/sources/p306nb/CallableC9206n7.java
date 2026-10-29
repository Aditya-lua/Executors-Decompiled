package p306nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nb.n7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9206n7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33263b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33264c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC9127i8 f33265d;

    public CallableC9206n7(BinderC9127i8 binderC9127i8, String str, String str2, String str3) {
        this.f33262a = str;
        this.f33263b = str2;
        this.f33264c = str3;
        Objects.requireNonNull(binderC9127i8);
        this.f33265d = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC9127i8 binderC9127i8 = this.f33265d;
        binderC9127i8.m36366z2().m36505E();
        return binderC9127i8.m36366z2().m36507F0().m36797D0(this.f33262a, this.f33263b, this.f33264c);
    }
}
