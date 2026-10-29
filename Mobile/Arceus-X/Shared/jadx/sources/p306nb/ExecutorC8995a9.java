package p306nb;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: nb.a9 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC8995a9 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9257qa f32682a;

    public ExecutorC8995a9(C9257qa c9257qa) {
        Objects.requireNonNull(c9257qa);
        this.f32682a = c9257qa;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f32682a.f33067a.mo36322b().m36263t(runnable);
    }
}
