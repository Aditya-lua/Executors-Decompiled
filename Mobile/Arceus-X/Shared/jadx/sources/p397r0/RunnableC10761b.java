package p397r0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ne.InterfaceFutureC9440x;
import p366q0.C10417c;
import p533x2.C12637g;

/* JADX INFO: renamed from: r0.b */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC10761b<I, O> extends C10763d<O> implements Runnable {

    /* JADX INFO: renamed from: c */
    public InterfaceC10760a<? super I, ? extends O> f38339c;

    /* JADX INFO: renamed from: d */
    public final BlockingQueue<Boolean> f38340d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e */
    public final CountDownLatch f38341e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f */
    public InterfaceFutureC9440x<? extends I> f38342f;

    /* JADX INFO: renamed from: g */
    public volatile InterfaceFutureC9440x<? extends O> f38343g;

    /* JADX INFO: renamed from: r0.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceFutureC9440x f38344a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(InterfaceFutureC9440x interfaceFutureC9440x) {
            this.f38344a = interfaceFutureC9440x;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        RunnableC10761b.this.m40974d(C10773n.m40990m(this.f38344a));
                    } catch (CancellationException unused) {
                        RunnableC10761b.this.cancel(false);
                    }
                } catch (ExecutionException e10) {
                    RunnableC10761b.this.m40975e(e10.getCause());
                }
            } finally {
                RunnableC10761b.this.f38343g = null;
            }
        }
    }

    public RunnableC10761b(InterfaceC10760a<? super I, ? extends O> interfaceC10760a, InterfaceFutureC9440x<? extends I> interfaceFutureC9440x) {
        this.f38339c = (InterfaceC10760a) C12637g.m47075g(interfaceC10760a);
        this.f38342f = (InterfaceFutureC9440x) C12637g.m47075g(interfaceFutureC9440x);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.concurrent.BlockingQueue<java.lang.Boolean>, java.util.concurrent.BlockingQueue<E> */
    @Override // p397r0.C10763d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        m40971i(this.f38340d, Boolean.valueOf(z10));
        m40970h(this.f38342f, z10);
        m40970h(this.f38343g, z10);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p397r0.C10763d, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            InterfaceFutureC9440x<? extends I> interfaceFutureC9440x = this.f38342f;
            if (interfaceFutureC9440x != null) {
                interfaceFutureC9440x.get();
            }
            this.f38341e.await();
            InterfaceFutureC9440x<? extends O> interfaceFutureC9440x2 = this.f38343g;
            if (interfaceFutureC9440x2 != null) {
                interfaceFutureC9440x2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX INFO: renamed from: h */
    public final void m40970h(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    /* JADX INFO: renamed from: i */
    public final <E> void m40971i(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: j */
    public final <E> E m40972j(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z10 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0001 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x0001 */
    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: java.util.concurrent.BlockingQueue<java.lang.Boolean>, java.util.concurrent.BlockingQueue<E> */
    /* JADX WARN: Type inference failed for: r0v0, types: [ne.x<? extends I>, r0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ne.x<? extends I>, r0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [ne.x<? extends I>, r0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r8;
        ?? r10 = (InterfaceC10760a<? super I, ? extends O>) null;
        try {
            try {
                InterfaceFutureC9440x<? extends O> interfaceFutureC9440xApply = this.f38339c.apply(C10773n.m40990m(this.f38342f));
                this.f38343g = interfaceFutureC9440xApply;
                if (isCancelled()) {
                    interfaceFutureC9440xApply.cancel(((Boolean) m40972j(this.f38340d)).booleanValue());
                    this.f38343g = null;
                } else {
                    interfaceFutureC9440xApply.mo37173a(new a(interfaceFutureC9440xApply), C10417c.m40081b());
                }
            } catch (UndeclaredThrowableException e10) {
                m40975e(e10.getCause());
                r8 = r10;
            } catch (Exception e11) {
                m40975e(e11);
                r8 = r10;
            } catch (Error e12) {
                m40975e(e12);
                r8 = r10;
            } finally {
                this.f38339c = (InterfaceC10760a<? super I, ? extends O>) r10;
                this.f38342f = (InterfaceFutureC9440x<? extends I>) r10;
                this.f38341e.countDown();
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e13) {
            m40975e(e13.getCause());
        }
    }

    @Override // p397r0.C10763d, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC9440x<? extends I> interfaceFutureC9440x = this.f38342f;
            if (interfaceFutureC9440x != null) {
                long jNanoTime = System.nanoTime();
                interfaceFutureC9440x.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f38341e.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                InterfaceFutureC9440x<? extends O> interfaceFutureC9440x2 = this.f38343g;
                if (interfaceFutureC9440x2 != null) {
                    interfaceFutureC9440x2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j10, timeUnit);
    }
}
