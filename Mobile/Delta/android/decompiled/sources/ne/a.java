package ne;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V, X extends Throwable, F, T> extends m.a<V> implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x<? extends V> f27076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Class<X> f27077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public F f27078j;

    /* JADX INFO: renamed from: ne.a$a, reason: collision with other inner class name */
    public static final class C0462a<V, X extends Throwable> extends a<V, X, i<? super X, ? extends V>, x<? extends V>> {
        public C0462a(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar) {
            super(xVar, cls, iVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public x<? extends V> O(i<? super X, ? extends V> iVar, X x10) {
            x<? extends V> xVarApply = iVar.apply(x10);
            he.n.n(xVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", iVar);
            return xVarApply;
        }

        @Override // ne.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void P(x<? extends V> xVar) {
            F(xVar);
        }
    }

    public static final class b<V, X extends Throwable> extends a<V, X, he.f<? super X, ? extends V>, V> {
        public b(x<? extends V> xVar, Class<X> cls, he.f<? super X, ? extends V> fVar) {
            super(xVar, cls, fVar);
        }

        @Override // ne.a
        public void P(V v5) {
            D(v5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public V O(he.f<? super X, ? extends V> fVar, X x10) {
            return fVar.apply(x10);
        }
    }

    public a(x<? extends V> xVar, Class<X> cls, F f10) {
        this.f27076h = (x) he.n.l(xVar);
        this.f27077i = (Class) he.n.l(cls);
        this.f27078j = (F) he.n.l(f10);
    }

    public static <V, X extends Throwable> x<V> M(x<? extends V> xVar, Class<X> cls, he.f<? super X, ? extends V> fVar, Executor executor) {
        b bVar = new b(xVar, cls, fVar);
        xVar.a(bVar, a0.c(executor, bVar));
        return bVar;
    }

    public static <X extends Throwable, V> x<V> N(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar, Executor executor) {
        C0462a c0462a = new C0462a(xVar, cls, iVar);
        xVar.a(c0462a, a0.c(executor, c0462a));
        return c0462a;
    }

    @Override // ne.b
    public String A() {
        String string;
        x<? extends V> xVar = this.f27076h;
        Class<X> cls = this.f27077i;
        F f10 = this.f27078j;
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

    @Override // ne.b
    public final void o() {
        z(this.f27076h);
        this.f27076h = null;
        this.f27077i = null;
        this.f27078j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objF;
        x<? extends V> xVar = this.f27076h;
        Class<X> cls = this.f27077i;
        F f10 = this.f27078j;
        if (((f10 == null) || ((xVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r8 = (Class<X>) null;
        this.f27076h = null;
        try {
            th = xVar instanceof oe.a ? oe.b.a((oe.a) xVar) : null;
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
            this.f27077i = null;
            this.f27078j = null;
            P(objO);
        } catch (Throwable th3) {
            try {
                E(th3);
            } finally {
                this.f27077i = null;
                this.f27078j = null;
            }
        }
    }
}
