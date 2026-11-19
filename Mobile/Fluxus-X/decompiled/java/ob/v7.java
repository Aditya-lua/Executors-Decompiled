package ob;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class v7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27865a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n8 f27867d;

    public v7(n8 n8Var, String str, String str2, String str3) {
        this.f27865a = str;
        this.b = str2;
        this.f27866c = str3;
        Objects.requireNonNull(n8Var);
        this.f27867d = n8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n8 n8Var = this.f27867d;
        n8Var.z2().E();
        return n8Var.z2().F0().H0(this.f27865a, this.b, this.f27866c);
    }
}
