package g6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y implements h6.a {
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f18475c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f18474a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18476d = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f18477a;
        public final Runnable b;

        public a(y yVar, Runnable runnable) {
            this.f18477a = yVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
                synchronized (this.f18477a.f18476d) {
                    this.f18477a.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f18477a.f18476d) {
                    this.f18477a.b();
                    throw th2;
                }
            }
        }
    }

    public y(Executor executor) {
        this.b = executor;
    }

    public void b() {
        a aVarPoll = this.f18474a.poll();
        this.f18475c = aVarPoll;
        if (aVarPoll != null) {
            this.b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f18476d) {
            try {
                this.f18474a.add(new a(this, runnable));
                if (this.f18475c == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
