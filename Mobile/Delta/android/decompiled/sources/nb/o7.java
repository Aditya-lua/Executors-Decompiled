package nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class o7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25814a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8 f25816d;

    public o7(i8 i8Var, String str, String str2, String str3) {
        this.f25814a = str;
        this.b = str2;
        this.f25815c = str3;
        Objects.requireNonNull(i8Var);
        this.f25816d = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i8 i8Var = this.f25816d;
        i8Var.z2().E();
        return i8Var.z2().F0().D0(this.f25814a, this.b, this.f25815c);
    }
}
