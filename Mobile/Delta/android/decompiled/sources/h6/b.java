package h6;

import java.util.concurrent.Executor;
import ku.l0;
import ku.v1;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    Executor a();

    default l0 b() {
        return v1.b(c());
    }

    a c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
