package sb;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f31144a;
    public final /* synthetic */ Callable b;

    public o0(n0 n0Var, Callable callable) {
        this.f31144a = n0Var;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f31144a.q(this.b.call());
        } catch (Exception e10) {
            this.f31144a.p(e10);
        } catch (Throwable th2) {
            this.f31144a.p(new RuntimeException(th2));
        }
    }
}
