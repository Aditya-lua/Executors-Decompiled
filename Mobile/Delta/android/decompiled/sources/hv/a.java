package hv;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f19836a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f19836a.post(runnable);
    }
}
