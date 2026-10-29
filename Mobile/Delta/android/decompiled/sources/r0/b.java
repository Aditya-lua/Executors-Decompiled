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
import me.x;

/* JADX INFO: loaded from: classes.dex */
public class b<I, O> extends d<O> implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0.a<? super I, ? extends O> f29693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue<Boolean> f29694d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f29695e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x<? extends I> f29696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile x<? extends O> f29697g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f29698a;

        public a(x xVar) {
            this.f29698a = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.d(n.m(this.f29698a));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                } catch (ExecutionException e10) {
                    b.this.e(e10.getCause());
                }
            } finally {
                b.this.f29697g = null;
            }
        }
    }

    public b(r0.a<? super I, ? extends O> aVar, x<? extends I> xVar) {
        this.f29693c = (r0.a) x2.g.g(aVar);
        this.f29696f = (x) x2.g.g(xVar);
    }

    @Override // r0.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        i(this.f29694d, Boolean.valueOf(z10));
        h(this.f29696f, z10);
        h(this.f29697g, z10);
        return true;
    }

    @Override // r0.d, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            x<? extends I> xVar = this.f29696f;
            if (xVar != null) {
                xVar.get();
            }
            this.f29695e.await();
            x<? extends O> xVar2 = this.f29697g;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [me.x<? extends I>, r0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [me.x<? extends I>, r0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [me.x<? extends I>, r0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r8;
        ?? r10 = (r0.a<? super I, ? extends O>) null;
        try {
            try {
                x<? extends O> xVarApply = this.f29693c.apply(n.m(this.f29696f));
                this.f29697g = xVarApply;
                if (isCancelled()) {
                    xVarApply.cancel(((Boolean) j(this.f29694d)).booleanValue());
                    this.f29697g = null;
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
                this.f29693c = (r0.a<? super I, ? extends O>) r10;
                this.f29696f = (x<? extends I>) r10;
                this.f29695e.countDown();
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
            x<? extends I> xVar = this.f29696f;
            if (xVar != null) {
                long jNanoTime = System.nanoTime();
                xVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f29695e.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                x<? extends O> xVar2 = this.f29697g;
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
