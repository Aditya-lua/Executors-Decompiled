package s0;

import java.util.concurrent.Executor;
import n0.l3;
import n0.n1;

/* JADX INFO: loaded from: classes.dex */
public interface r extends l3 {
    public static final n1.a<Executor> O = n1.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor e0(Executor executor) {
        return (Executor) h(O, executor);
    }
}
