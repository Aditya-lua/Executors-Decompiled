package sb;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f30590a = new kb.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f30590a.post(runnable);
    }
}
