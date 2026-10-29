package me;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V, X extends Throwable, F, T> extends m.a<V> implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x<? extends V> f24068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Class<X> f24069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public F f24070j;

    /* JADX INFO: renamed from: me.a$a, reason: collision with other inner class name */
    public static final class C0426a<V, X extends Throwable> extends a<V, X, i<? super X, ? extends V>, x<? extends V>> {
        public C0426a(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar) {
            super(xVar, cls, iVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public x<? extends V> O(i<? super X, ? extends V> iVar, X x10) {
            x<? extends V> xVarApply = iVar.apply(x10);
            ge.n.n(xVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", iVar);
            return xVarApply;
        }

        @Override // me.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void P(x<? extends V> xVar) {
            F(xVar);
        }
    }

    public static final class b<V, X extends Throwable> extends a<V, X, ge.f<? super X, ? extends V>, V> {
        public b(x<? extends V> xVar, Class<X> cls, ge.f<? super X, ? extends V> fVar) {
            super(xVar, cls, fVar);
        }

        @Override // me.a
        public void P(V v5) {
            D(v5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public V O(ge.f<? super X, ? extends V> fVar, X x10) {
            return fVar.apply(x10);
        }
    }

    public a(x<? extends V> xVar, Class<X> cls, F f10) {
        this.f24068h = (x) ge.n.l(xVar);
        this.f24069i = (Class) ge.n.l(cls);
        this.f24070j = (F) ge.n.l(f10);
    }

    public static <V, X extends Throwable> x<V> M(x<? extends V> xVar, Class<X> cls, ge.f<? super X, ? extends V> fVar, Executor executor) {
        b bVar = new b(xVar, cls, fVar);
        xVar.a(bVar, a0.c(executor, bVar));
        return bVar;
    }

    public static <X extends Throwable, V> x<V> N(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar, Executor executor) {
        C0426a c0426a = new C0426a(xVar, cls, iVar);
        xVar.a(c0426a, a0.c(executor, c0426a));
        return c0426a;
    }

    @Override // me.b
    public String A() {
        String string;
        x<? extends V> xVar = this.f24068h;
        Class<X> cls = this.f24069i;
        F f10 = this.f24070j;
        String strA = super.A();
        if (xVar != null) {
            String strValueOf = String.valueOf(xVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(strValueOf);
            sb2.append("], ");
            string = sb2.toString();
        } else {
            string = "";
        }
        if (cls == null || f10 == null) {
            if (strA == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strA.length() != 0 ? strValueOf2.concat(strA) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(cls);
        String strValueOf4 = String.valueOf(f10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 29 + strValueOf3.length() + strValueOf4.length());
        sb3.append(string);
        sb3.append("exceptionType=[");
        sb3.append(strValueOf3);
        sb3.append("], fallback=[");
        sb3.append(strValueOf4);
        sb3.append("]");
        return sb3.toString();
    }

    public abstract T O(F f10, X x10);

    public abstract void P(T t8);

    @Override // me.b
    public final void o() {
        z(this.f24068h);
        this.f24068h = null;
        this.f24069i = null;
        this.f24070j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objF;
        x<? extends V> xVar = this.f24068h;
        Class<X> cls = this.f24069i;
        F f10 = this.f24070j;
        if (((f10 == null) || ((xVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r8 = (Class<X>) null;
        this.f24068h = null;
        try {
            th = xVar instanceof ne.a ? ne.b.a((ne.a) xVar) : null;
            objF = th == null ? s.f(xVar) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(xVar.getClass());
                String strValueOf2 = String.valueOf(e10.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35 + strValueOf2.length());
                sb2.append("Future type ");
                sb2.append(strValueOf);
                sb2.append(" threw ");
                sb2.append(strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        if (th == null) {
            D(b0.a(objF));
            return;
        }
        if (!d0.a(th, cls)) {
            F(xVar);
            return;
        }
        try {
            Object objO = O(f10, th);
            this.f24069i = null;
            this.f24070j = null;
            P(objO);
        } catch (Throwable th3) {
            try {
                E(th3);
            } finally {
                this.f24069i = null;
                this.f24070j = null;
            }
        }
    }
}
