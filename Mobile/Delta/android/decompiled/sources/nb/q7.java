package nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class q7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26703a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8 f26705d;

    public q7(i8 i8Var, String str, String str2, String str3) {
        this.f26703a = str;
        this.b = str2;
        this.f26704c = str3;
        Objects.requireNonNull(i8Var);
        this.f26705d = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i8 i8Var = this.f26705d;
        i8Var.z2().E();
        return i8Var.z2().F0().H0(this.f26703a, this.b, this.f26704c);
    }
}
