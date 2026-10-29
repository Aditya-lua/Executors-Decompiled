package sb;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p244kb.HandlerC7537a;

/* JADX INFO: renamed from: sb.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC11267l0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f39582a = new HandlerC7537a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f39582a.post(runnable);
    }
}
