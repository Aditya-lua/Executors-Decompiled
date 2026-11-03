package u2;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    public static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f32691a;

        public a(Handler handler) {
            this.f32691a = (Handler) x2.g.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f32691a.post((Runnable) x2.g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f32691a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
