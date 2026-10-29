package p456u2;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p533x2.C12637g;

/* JADX INFO: renamed from: u2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C11779h {

    /* JADX INFO: renamed from: u2.h$a */
    public static class a implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f41501a;

        public a(Handler handler) {
            this.f41501a = (Handler) C12637g.m47075g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f41501a.post((Runnable) C12637g.m47075g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f41501a + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m44063a(Handler handler) {
        return new a(handler);
    }
}
