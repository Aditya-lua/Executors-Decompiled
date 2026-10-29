package p366q0;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: q0.d */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC10418d implements Executor {

    /* JADX INFO: renamed from: a */
    public static volatile ExecutorC10418d f37532a;

    /* JADX INFO: renamed from: b */
    public static Executor m40087b() {
        if (f37532a != null) {
            return f37532a;
        }
        synchronized (ExecutorC10418d.class) {
            try {
                if (f37532a == null) {
                    f37532a = new ExecutorC10418d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f37532a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
