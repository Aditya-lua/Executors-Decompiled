package p563y1;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: y1.d */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC12998d implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
