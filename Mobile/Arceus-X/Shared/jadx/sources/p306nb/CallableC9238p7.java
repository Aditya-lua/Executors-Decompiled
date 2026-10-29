package p306nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nb.p7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9238p7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33339b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33340c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC9127i8 f33341d;

    public CallableC9238p7(BinderC9127i8 binderC9127i8, String str, String str2, String str3) {
        this.f33338a = str;
        this.f33339b = str2;
        this.f33340c = str3;
        Objects.requireNonNull(binderC9127i8);
        this.f33341d = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC9127i8 binderC9127i8 = this.f33341d;
        binderC9127i8.m36366z2().m36505E();
        return binderC9127i8.m36366z2().m36507F0().m36805H0(this.f33338a, this.f33339b, this.f33340c);
    }
}
