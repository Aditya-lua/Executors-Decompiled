package p366q0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10417c {
    /* JADX INFO: renamed from: a */
    public static Executor m40080a() {
        return ExecutorC10416b.m40078b();
    }

    /* JADX INFO: renamed from: b */
    public static Executor m40081b() {
        return ExecutorC10418d.m40087b();
    }

    /* JADX INFO: renamed from: c */
    public static Executor m40082c() {
        return ExecutorC10420f.m40092b();
    }

    /* JADX INFO: renamed from: d */
    public static Executor m40083d() {
        return ExecutorC10421g.m40093b();
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledExecutorService m40084e() {
        return C10422h.m40094a();
    }

    /* JADX INFO: renamed from: f */
    public static ScheduledExecutorService m40085f(Handler handler) {
        return new ScheduledExecutorServiceC10419e(handler);
    }

    /* JADX INFO: renamed from: g */
    public static Executor m40086g(Executor executor) {
        return new ExecutorC10423i(executor);
    }
}
