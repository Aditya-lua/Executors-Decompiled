package r0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ne.x;

/* JADX INFO: loaded from: classes.dex */
public class b<I, O> extends d<O> implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0.a<? super I, ? extends O> f30095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue<Boolean> f30096d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f30097e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x<? extends I> f30098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile x<? extends O> f30099g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f30100a;

        public a(x xVar) {
            this.f30100a = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.d(n.m(this.f30100a));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                } catch (ExecutionException e10) {
                    b.this.e(e10.getCause());
                }
            } finally {
                b.this.f30099g = null;
            }
        }
    }

    public b(r0.a<? super I, ? extends O> aVar, x<? extends I> xVar) {
        this.f30095c = (r0.a) x2.g.g(aVar);
        this.f30098f = (x) x2.g.g(xVar);
    }

    @Override // r0.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        i(this.f30096d, Boolean.valueOf(z10));
        h(this.f30098f, z10);
        h(this.f30099g, z10);
        return true;
    }

    @Override // r0.d, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            x<? extends I> xVar = this.f30098f;
            if (xVar != null) {
                xVar.get();
            }
            this.f30097e.await();
            x<? extends O> xVar2 = this.f30099g;
            if (xVar2 != null) {
                xVar2.get();
            }
        }
        return (O) super.get();
    }

    public final void h(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    public final <E> void i(BlockingQueue<E> blockingQueue, E e10) {
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

    public final <E> E j(BlockingQueue<E> blockingQueue) {
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
        ?? r10 = (r0.a<? super I, ? extends O>) null;
        try {
            try {
                x<? extends O> xVarApply = this.f30095c.apply(n.m(this.f30098f));
                this.f30099g = xVarApply;
                if (isCancelled()) {
                    xVarApply.cancel(((Boolean) j(this.f30096d)).booleanValue());
                    this.f30099g = null;
                } else {
                    xVarApply.a(new a(xVarApply), q0.c.b());
                }
            } catch (UndeclaredThrowableException e10) {
                e(e10.getCause());
                r8 = r10;
            } catch (Exception e11) {
                e(e11);
                r8 = r10;
            } catch (Error e12) {
                e(e12);
                r8 = r10;
            } finally {
                this.f30095c = (r0.a<? super I, ? extends O>) r10;
                this.f30098f = (x<? extends I>) r10;
                this.f30097e.countDown();
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e13) {
            e(e13.getCause());
        }
    }

    @Override // r0.d, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            x<? extends I> xVar = this.f30098f;
            if (xVar != null) {
                long jNanoTime = System.nanoTime();
                xVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f30097e.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                x<? extends O> xVar2 = this.f30099g;
                if (xVar2 != null) {
                    xVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j10, timeUnit);
    }
}
