package p125fb;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: fb.s1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5561s1 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
