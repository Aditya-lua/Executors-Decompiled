package cl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f5483a;
    public final Executor b;

    public static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f5484a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f5484a.post(runnable);
        }
    }

    public e(Executor executor, Executor executor2) {
        this.f5483a = executor;
        this.b = executor2;
    }

    @Override // cl.c
    public Executor a() {
        return this.b;
    }

    @Override // cl.c
    public Executor b() {
        return this.f5483a;
    }
}
