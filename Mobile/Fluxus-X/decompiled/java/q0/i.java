package q0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {
    public final Executor b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque<Runnable> f29732a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f29733c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f29734d = c.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29735e = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f29736a;

        public a(Runnable runnable) {
            this.f29736a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29736a.run();
        }
    }

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
        
            g0.r1.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            Runnable runnablePoll;
            boolean z10 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (i.this.f29732a) {
                        if (z10) {
                            runnablePoll = i.this.f29732a.poll();
                            if (runnablePoll == null) {
                                i.this.f29734d = c.IDLE;
                            }
                        } else {
                            i iVar = i.this;
                            c cVar = iVar.f29734d;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                iVar.f29735e++;
                                iVar.f29734d = cVar2;
                                z10 = true;
                                runnablePoll = i.this.f29732a.poll();
                                if (runnablePoll == null) {
                                    i.this.f29734d = c.IDLE;
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
                a();
            } catch (Error e10) {
                synchronized (i.this.f29732a) {
                    i.this.f29734d = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public i(Executor executor) {
        this.b = (Executor) x2.g.g(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        x2.g.g(runnable);
        synchronized (this.f29732a) {
            c cVar2 = this.f29734d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f29735e;
                a aVar = new a(runnable);
                this.f29732a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f29734d = cVar3;
                try {
                    this.b.execute(this.f29733c);
                    if (this.f29734d != cVar3) {
                        return;
                    }
                    synchronized (this.f29732a) {
                        try {
                            if (this.f29735e == j10 && this.f29734d == cVar3) {
                                this.f29734d = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f29732a) {
                        try {
                            c cVar4 = this.f29734d;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.f29732a.removeLastOccurrence(aVar)) {
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
            this.f29732a.add(runnable);
        }
    }
}
