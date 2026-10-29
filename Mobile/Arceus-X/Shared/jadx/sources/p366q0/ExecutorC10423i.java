package p366q0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p533x2.C12637g;

/* JADX INFO: renamed from: q0.i */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC10423i implements Executor {

    /* JADX INFO: renamed from: b */
    public final Executor f37554b;

    /* JADX INFO: renamed from: a */
    public final Deque<Runnable> f37553a = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final b f37555c = new b();

    /* JADX INFO: renamed from: d */
    public c f37556d = c.IDLE;

    /* JADX INFO: renamed from: e */
    public long f37557e = 0;

    /* JADX INFO: renamed from: q0.i$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f37558a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Runnable runnable) {
            this.f37558a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37558a.run();
        }
    }

    /* JADX INFO: renamed from: q0.i$b */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            p140g0.C5931r1.m26564d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m40095a() {
            Runnable runnablePoll;
            boolean z10 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (ExecutorC10423i.this.f37553a) {
                        if (z10) {
                            runnablePoll = ExecutorC10423i.this.f37553a.poll();
                            if (runnablePoll == null) {
                                ExecutorC10423i.this.f37556d = c.IDLE;
                            }
                        } else {
                            ExecutorC10423i executorC10423i = ExecutorC10423i.this;
                            c cVar = executorC10423i.f37556d;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                executorC10423i.f37557e++;
                                executorC10423i.f37556d = cVar2;
                                z10 = true;
                                runnablePoll = ExecutorC10423i.this.f37553a.poll();
                                if (runnablePoll == null) {
                                    ExecutorC10423i.this.f37556d = c.IDLE;
                                }
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            Thread.currentThread().interrupt();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m40095a();
            } catch (Error e10) {
                synchronized (ExecutorC10423i.this.f37553a) {
                    ExecutorC10423i.this.f37556d = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q0.i$c */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC10423i(Executor executor) {
        this.f37554b = (Executor) C12637g.m47075g(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        C12637g.m47075g(runnable);
        synchronized (this.f37553a) {
            c cVar2 = this.f37556d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f37557e;
                a aVar = new a(runnable);
                this.f37553a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f37556d = cVar3;
                try {
                    this.f37554b.execute(this.f37555c);
                    if (this.f37556d != cVar3) {
                        return;
                    }
                    synchronized (this.f37553a) {
                        try {
                            if (this.f37557e == j10 && this.f37556d == cVar3) {
                                this.f37556d = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f37553a) {
                        try {
                            c cVar4 = this.f37556d;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.f37553a.removeLastOccurrence(aVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.f37553a.add(runnable);
        }
    }
}
