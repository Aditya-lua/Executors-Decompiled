package ne;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ne.l */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC9428l implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
