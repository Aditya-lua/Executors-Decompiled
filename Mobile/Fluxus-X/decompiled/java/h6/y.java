package h6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y implements i6.a {
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f18112c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f18111a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18113d = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f18114a;
        public final Runnable b;

        public a(y yVar, Runnable runnable) {
            this.f18114a = yVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
                synchronized (this.f18114a.f18113d) {
                    this.f18114a.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f18114a.f18113d) {
                    this.f18114a.b();
                    throw th2;
                }
            }
        }
    }

    public y(Executor executor) {
        this.b = executor;
    }

    public void b() {
        a aVarPoll = this.f18111a.poll();
        this.f18112c = aVarPoll;
        if (aVarPoll != null) {
            this.b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f18113d) {
            try {
                this.f18111a.add(new a(this, runnable));
                if (this.f18112c == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
