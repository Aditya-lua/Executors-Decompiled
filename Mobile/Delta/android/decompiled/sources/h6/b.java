package h6;

import iu.l0;
import iu.v1;
import java.util.concurrent.Executor;

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
