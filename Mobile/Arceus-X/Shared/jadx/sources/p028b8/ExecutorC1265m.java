package p028b8;

import java.util.concurrent.Executor;
import p122f8.C5488a;

/* JADX INFO: renamed from: b8.m */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC1265m implements Executor {

    /* JADX INFO: renamed from: a */
    public final Executor f5281a;

    /* JADX INFO: renamed from: b8.m$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f5282a;

        public a(Runnable runnable) {
            this.f5282a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5282a.run();
            } catch (Exception e10) {
                C5488a.m25130c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public ExecutorC1265m(Executor executor) {
        this.f5281a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5281a.execute(new a(runnable));
    }
}
