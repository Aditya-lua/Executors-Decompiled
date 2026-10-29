package p231jv;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: jv.a */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC7370a implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f28278a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f28278a.post(runnable);
    }
}
