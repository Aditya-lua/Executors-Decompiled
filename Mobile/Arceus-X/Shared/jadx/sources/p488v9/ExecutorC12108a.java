package p488v9;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p074db.HandlerC4534p;

/* JADX INFO: renamed from: v9.a */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC12108a implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f42725a;

    public ExecutorC12108a(@NonNull Looper looper) {
        this.f42725a = new HandlerC4534p(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f42725a.post(runnable);
    }
}
