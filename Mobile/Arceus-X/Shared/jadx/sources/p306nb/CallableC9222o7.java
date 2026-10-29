package p306nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nb.o7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9222o7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33298c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC9127i8 f33299d;

    public CallableC9222o7(BinderC9127i8 binderC9127i8, String str, String str2, String str3) {
        this.f33296a = str;
        this.f33297b = str2;
        this.f33298c = str3;
        Objects.requireNonNull(binderC9127i8);
        this.f33299d = binderC9127i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC9127i8 binderC9127i8 = this.f33299d;
        binderC9127i8.m36366z2().m36505E();
        return binderC9127i8.m36366z2().m36507F0().m36797D0(this.f33296a, this.f33297b, this.f33298c);
    }
}
