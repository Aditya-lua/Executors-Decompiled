package q0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static Executor a() {
        return b.b();
    }

    public static Executor b() {
        return d.b();
    }

    public static Executor c() {
        return f.b();
    }

    public static Executor d() {
        return g.b();
    }

    public static ScheduledExecutorService e() {
        return h.a();
    }

    public static ScheduledExecutorService f(Handler handler) {
        return new e(handler);
    }

    public static Executor g(Executor executor) {
        return new i(executor);
    }
}
