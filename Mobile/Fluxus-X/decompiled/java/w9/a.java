package w9;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import eb.p;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f35695a;

    public a(@NonNull Looper looper) {
        this.f35695a = new p(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f35695a.post(runnable);
    }
}
