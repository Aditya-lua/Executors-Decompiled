package c8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4924a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f4925a;

        public a(Runnable runnable) {
            this.f4925a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4925a.run();
            } catch (Exception e10) {
                g8.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public m(Executor executor) {
        this.f4924a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4924a.execute(new a(runnable));
    }
}
