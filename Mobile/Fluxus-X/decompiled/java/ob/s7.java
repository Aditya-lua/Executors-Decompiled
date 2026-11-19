package ob;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class s7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27788a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n8 f27790d;

    public s7(n8 n8Var, String str, String str2, String str3) {
        this.f27788a = str;
        this.b = str2;
        this.f27789c = str3;
        Objects.requireNonNull(n8Var);
        this.f27790d = n8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n8 n8Var = this.f27790d;
        n8Var.z2().E();
        return n8Var.z2().F0().D0(this.f27788a, this.b, this.f27789c);
    }
}
