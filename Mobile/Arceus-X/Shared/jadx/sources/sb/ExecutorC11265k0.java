package sb;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC11265k0 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
