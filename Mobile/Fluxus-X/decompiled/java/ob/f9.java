package ob;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f9 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va f27323a;

    public f9(va vaVar) {
        Objects.requireNonNull(vaVar);
        this.f27323a = vaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f27323a.f27641a.b().t(runnable);
    }
}
