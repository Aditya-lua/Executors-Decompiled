package nf;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p305n9.C8953m;

/* JADX INFO: renamed from: nf.z */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC9469z implements Executor {

    /* JADX INFO: renamed from: f */
    public static final Logger f34021f = Logger.getLogger(ExecutorC9469z.class.getName());

    /* JADX INFO: renamed from: a */
    public final Executor f34022a;

    /* JADX INFO: renamed from: b */
    public final Deque<Runnable> f34023b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public c f34024c = c.IDLE;

    /* JADX INFO: renamed from: d */
    public long f34025d = 0;

    /* JADX INFO: renamed from: e */
    public final b f34026e = new b(this, null);

    /* JADX INFO: renamed from: nf.z$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f34027a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Runnable runnable) {
            this.f34027a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34027a.run();
        }

        public String toString() {
            return this.f34027a.toString();
        }
    }

    /* JADX INFO: renamed from: nf.z$b */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public Runnable f34029a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f34029a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            nf.ExecutorC9469z.f34021f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f34029a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f34029a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m37302a() {
            Runnable runnable;
            boolean z10 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (ExecutorC9469z.this.f34023b) {
                        if (z10) {
                            runnable = (Runnable) ExecutorC9469z.this.f34023b.poll();
                            this.f34029a = runnable;
                            if (runnable == null) {
                                ExecutorC9469z.this.f34024c = c.IDLE;
                            }
                        } else {
                            c cVar = ExecutorC9469z.this.f34024c;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                ExecutorC9469z.m37300e(ExecutorC9469z.this);
                                ExecutorC9469z.this.f34024c = cVar2;
                                z10 = true;
                                runnable = (Runnable) ExecutorC9469z.this.f34023b.poll();
                                this.f34029a = runnable;
                                if (runnable == null) {
                                    ExecutorC9469z.this.f34024c = c.IDLE;
                                }
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                    this.f34029a = null;
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
                m37302a();
            } catch (Error e10) {
                synchronized (ExecutorC9469z.this.f34023b) {
                    ExecutorC9469z.this.f34024c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f34029a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC9469z.this.f34024c + "}";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 nf.z) A[MD:(nf.z):void (m)] (LINE:2) call: nf.z.b.<init>(nf.z):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ b(ExecutorC9469z executorC9469z, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: nf.z$c */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC9469z(Executor executor) {
        this.f34022a = (Executor) C8953m.m36047l(executor);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m37300e(ExecutorC9469z executorC9469z) {
        long j10 = executorC9469z.f34025d;
        executorC9469z.f34025d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        C8953m.m36047l(runnable);
        synchronized (this.f34023b) {
            c cVar2 = this.f34024c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f34025d;
                a aVar = new a(runnable);
                this.f34023b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f34024c = cVar3;
                try {
                    this.f34022a.execute(this.f34026e);
                    if (this.f34024c != cVar3) {
                        return;
                    }
                    synchronized (this.f34023b) {
                        try {
                            if (this.f34025d == j10 && this.f34024c == cVar3) {
                                this.f34024c = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f34023b) {
                        try {
                            c cVar4 = this.f34024c;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.f34023b.removeLastOccurrence(aVar)) {
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
            this.f34023b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f34022a + "}";
    }
}
