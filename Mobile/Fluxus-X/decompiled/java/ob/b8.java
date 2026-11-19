package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f27118a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f27119c;

    public b8(n8 n8Var, i0 i0Var, String str) {
        this.f27118a = i0Var;
        this.b = str;
        Objects.requireNonNull(n8Var);
        this.f27119c = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n8 n8Var = this.f27119c;
        n8Var.z2().E();
        n8Var.z2().i(this.f27118a, this.b);
    }
}
