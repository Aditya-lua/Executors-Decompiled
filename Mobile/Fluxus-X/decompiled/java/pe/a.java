package pe;

import com.github.luben.zstd.BuildConfig;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V, X extends Throwable, F, T> extends m.a<V> implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x<? extends V> f29032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Class<X> f29033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public F f29034j;

    /* JADX INFO: renamed from: pe.a$a, reason: collision with other inner class name */
    public static final class C0559a<V, X extends Throwable> extends a<V, X, i<? super X, ? extends V>, x<? extends V>> {
        public C0559a(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar) {
            super(xVar, cls, iVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pe.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public x<? extends V> O(i<? super X, ? extends V> iVar, X x5) {
            x<? extends V> xVarApply = iVar.apply(x5);
            je.n.n(xVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", iVar);
            return xVarApply;
        }

        @Override // pe.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void P(x<? extends V> xVar) {
            F(xVar);
        }
    }

    public static final class b<V, X extends Throwable> extends a<V, X, je.f<? super X, ? extends V>, V> {
        public b(x<? extends V> xVar, Class<X> cls, je.f<? super X, ? extends V> fVar) {
            super(xVar, cls, fVar);
        }

        @Override // pe.a
        public void P(V v8) {
            D(v8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pe.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public V O(je.f<? super X, ? extends V> fVar, X x5) {
            return fVar.apply(x5);
        }
    }

    public a(x<? extends V> xVar, Class<X> cls, F f10) {
        this.f29032h = (x) je.n.l(xVar);
        this.f29033i = (Class) je.n.l(cls);
        this.f29034j = (F) je.n.l(f10);
    }

    public static <V, X extends Throwable> x<V> M(x<? extends V> xVar, Class<X> cls, je.f<? super X, ? extends V> fVar, Executor executor) {
        b bVar = new b(xVar, cls, fVar);
        xVar.a(bVar, a0.c(executor, bVar));
        return bVar;
    }

    public static <X extends Throwable, V> x<V> N(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar, Executor executor) {
        C0559a c0559a = new C0559a(xVar, cls, iVar);
        xVar.a(c0559a, a0.c(executor, c0559a));
        return c0559a;
    }

    @Override // pe.b
    public String A() {
        String string;
        x<? extends V> xVar = this.f29032h;
        Class<X> cls = this.f29033i;
        F f10 = this.f29034j;
        String strA = super.A();
        if (xVar != null) {
            String strValueOf = String.valueOf(xVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(strValueOf);
            sb2.append("], ");
            string = sb2.toString();
        } else {
            string = BuildConfig.FLAVOR;
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

    public abstract T O(F f10, X x5);

    public abstract void P(T t8);

    @Override // pe.b
    public final void o() {
        z(this.f29032h);
        this.f29032h = null;
        this.f29033i = null;
        this.f29034j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objF;
        x<? extends V> xVar = this.f29032h;
        Class<X> cls = this.f29033i;
        F f10 = this.f29034j;
        if (((f10 == null) || ((xVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r10 = (Class<X>) null;
        this.f29032h = null;
        try {
            th = xVar instanceof qe.a ? qe.b.a((qe.a) xVar) : null;
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
            this.f29033i = null;
            this.f29034j = null;
            P(objO);
        } catch (Throwable th3) {
            try {
                E(th3);
            } finally {
                this.f29033i = null;
                this.f29034j = null;
            }
        }
    }
}
