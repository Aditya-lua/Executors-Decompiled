package g6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y implements h6.a {
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f17936c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f17935a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17937d = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f17938a;
        public final Runnable b;

        public a(y yVar, Runnable runnable) {
            this.f17938a = yVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
                synchronized (this.f17938a.f17937d) {
                    this.f17938a.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f17938a.f17937d) {
                    this.f17938a.b();
                    throw th2;
                }
            }
        }
    }

    public y(Executor executor) {
        this.b = executor;
    }

    public void b() {
        a aVarPoll = this.f17935a.poll();
        this.f17936c = aVarPoll;
        if (aVarPoll != null) {
            this.b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f17937d) {
            try {
                this.f17935a.add(new a(this, runnable));
                if (this.f17936c == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
