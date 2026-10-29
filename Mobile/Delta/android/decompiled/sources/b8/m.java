package b8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4041a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f4042a;

        public a(Runnable runnable) {
            this.f4042a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4042a.run();
            } catch (Exception e10) {
                f8.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public m(Executor executor) {
        this.f4041a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4041a.execute(new a(runnable));
    }
}
