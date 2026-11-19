package pf;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f29143f = Logger.getLogger(z.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f29144a;
    public final Deque<Runnable> b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f29145c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f29146d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f29147e = new b(this, null);

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f29148a;

        public a(Runnable runnable) {
            this.f29148a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29148a.run();
        }

        public String toString() {
            return this.f29148a.toString();
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Runnable f29149a;

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
        
            r8.f29149a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            pf.z.f29143f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f29149a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f29149a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            Runnable runnable;
            boolean z10 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (z.this.b) {
                        if (z10) {
                            runnable = (Runnable) z.this.b.poll();
                            this.f29149a = runnable;
                            if (runnable == null) {
                                z.this.f29145c = c.IDLE;
                            }
                        } else {
                            c cVar = z.this.f29145c;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                z.e(z.this);
                                z.this.f29145c = cVar2;
                                z10 = true;
                                runnable = (Runnable) z.this.b.poll();
                                this.f29149a = runnable;
                                if (runnable == null) {
                                    z.this.f29145c = c.IDLE;
                                }
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                    this.f29149a = null;
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
                a();
            } catch (Error e10) {
                synchronized (z.this.b) {
                    z.this.f29145c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f29149a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + z.this.f29145c + "}";
        }

        public /* synthetic */ b(z zVar, a aVar) {
            this();
        }
    }

    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public z(Executor executor) {
        this.f29144a = (Executor) o9.s.l(executor);
    }

    public static /* synthetic */ long e(z zVar) {
        long j10 = zVar.f29146d;
        zVar.f29146d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        o9.s.l(runnable);
        synchronized (this.b) {
            c cVar2 = this.f29145c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f29146d;
                a aVar = new a(runnable);
                this.b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f29145c = cVar3;
                try {
                    this.f29144a.execute(this.f29147e);
                    if (this.f29145c != cVar3) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (this.f29146d == j10 && this.f29145c == cVar3) {
                                this.f29145c = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.b) {
                        try {
                            c cVar4 = this.f29145c;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.b.removeLastOccurrence(aVar)) {
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
            this.b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f29144a + "}";
    }
}
