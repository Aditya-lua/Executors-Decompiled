package me;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m<V> extends t<V> {

    public static abstract class a<V> extends m<V> implements b.i<V> {
        @Override // me.b, me.x
        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // me.b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // me.b, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // me.b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // me.b, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // me.b, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }
    }

    public static <V> m<V> J(x<V> xVar) {
        return xVar instanceof m ? (m) xVar : new n(xVar);
    }

    public final <X extends Throwable> m<V> H(Class<X> cls, ge.f<? super X, ? extends V> fVar, Executor executor) {
        return (m) s.d(this, cls, fVar, executor);
    }

    public final <X extends Throwable> m<V> I(Class<X> cls, i<? super X, ? extends V> iVar, Executor executor) {
        return (m) s.e(this, cls, iVar, executor);
    }

    public final <T> m<T> K(ge.f<? super V, T> fVar, Executor executor) {
        return (m) s.l(this, fVar, executor);
    }

    public final <T> m<T> L(i<? super V, T> iVar, Executor executor) {
        return (m) s.m(this, iVar, executor);
    }
}
