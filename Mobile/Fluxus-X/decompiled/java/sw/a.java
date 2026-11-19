package sw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f31933a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31933a.post(runnable);
    }
}
