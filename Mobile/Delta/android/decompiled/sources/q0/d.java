package q0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d f29160a;

    public static Executor b() {
        if (f29160a != null) {
            return f29160a;
        }
        synchronized (d.class) {
            try {
                if (f29160a == null) {
                    f29160a = new d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f29160a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
