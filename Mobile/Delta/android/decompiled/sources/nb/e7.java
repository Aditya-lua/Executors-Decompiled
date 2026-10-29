package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x8 f25483a;
    public final /* synthetic */ g7 b;

    public e7(g7 g7Var, x8 x8Var) {
        this.f25483a = x8Var;
        Objects.requireNonNull(g7Var);
        this.b = g7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g7 g7Var = this.b;
        x8 x8Var = this.f25483a;
        g7Var.p(x8Var);
        g7Var.v(x8Var.f26106d);
    }
}
