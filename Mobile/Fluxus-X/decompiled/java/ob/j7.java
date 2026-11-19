package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9 f27486a;
    public final /* synthetic */ l7 b;

    public j7(l7 l7Var, c9 c9Var) {
        this.f27486a = c9Var;
        Objects.requireNonNull(l7Var);
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l7 l7Var = this.b;
        c9 c9Var = this.f27486a;
        l7Var.p(c9Var);
        l7Var.v(c9Var.f27163d);
    }
}
