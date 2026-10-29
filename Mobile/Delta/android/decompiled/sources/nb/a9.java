package nb;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a9 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa f25332a;

    public a9(qa qaVar) {
        Objects.requireNonNull(qaVar);
        this.f25332a = qaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f25332a.f25625a.b().t(runnable);
    }
}
