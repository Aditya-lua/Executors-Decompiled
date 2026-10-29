package nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class n7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25787a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8 f25789d;

    public n7(i8 i8Var, String str, String str2, String str3) {
        this.f25787a = str;
        this.b = str2;
        this.f25788c = str3;
        Objects.requireNonNull(i8Var);
        this.f25789d = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i8 i8Var = this.f25789d;
        i8Var.z2().E();
        return i8Var.z2().F0().D0(this.f25787a, this.b, this.f25788c);
    }
}
