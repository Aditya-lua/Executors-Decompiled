package p146g6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p161h6.InterfaceExecutorC6291a;

/* JADX INFO: renamed from: g6.y */
/* JADX INFO: loaded from: classes.dex */
public class C6045y implements InterfaceExecutorC6291a {

    /* JADX INFO: renamed from: b */
    public final Executor f23326b;

    /* JADX INFO: renamed from: c */
    public Runnable f23327c;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<a> f23325a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final Object f23328d = new Object();

    /* JADX INFO: renamed from: g6.y$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C6045y f23329a;

        /* JADX INFO: renamed from: b */
        public final Runnable f23330b;

        public a(C6045y c6045y, Runnable runnable) {
            this.f23329a = c6045y;
            this.f23330b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f23330b.run();
                synchronized (this.f23329a.f23328d) {
                    this.f23329a.m26867b();
                }
            } catch (Throwable th2) {
                synchronized (this.f23329a.f23328d) {
                    this.f23329a.m26867b();
                    throw th2;
                }
            }
        }
    }

    public C6045y(Executor executor) {
        this.f23326b = executor;
    }

    /* JADX INFO: renamed from: b */
    public void m26867b() {
        a aVarPoll = this.f23325a.poll();
        this.f23327c = aVarPoll;
        if (aVarPoll != null) {
            this.f23326b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f23328d) {
            try {
                this.f23325a.add(new a(this, runnable));
                if (this.f23327c == null) {
                    m26867b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
