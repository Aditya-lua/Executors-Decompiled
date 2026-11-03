package ne;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d<I, O, F, T> extends m.a<O> implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x<? extends I> f27107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public F f27108i;

    public static final class a<I, O> extends d<I, O, i<? super I, ? extends O>, x<? extends O>> {
        public a(x<? extends I> xVar, i<? super I, ? extends O> iVar) {
            super(xVar, iVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.d
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public x<? extends O> O(i<? super I, ? extends O> iVar, I i10) {
            x<? extends O> xVarApply = iVar.apply(i10);
            he.n.n(xVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", iVar);
            return xVarApply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.d
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void P(x<? extends O> xVar) {
            F(xVar);
        }
    }

    public static final class b<I, O> extends d<I, O, he.f<? super I, ? extends O>, O> {
        public b(x<? extends I> xVar, he.f<? super I, ? extends O> fVar) {
            super(xVar, fVar);
        }

        @Override // ne.d
        public void P(O o8) {
            D(o8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.d
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public O O(he.f<? super I, ? extends O> fVar, I i10) {
            return fVar.apply(i10);
        }
    }

    public d(x<? extends I> xVar, F f10) {
        this.f27107h = (x) he.n.l(xVar);
        this.f27108i = (F) he.n.l(f10);
    }

    public static <I, O> x<O> M(x<I> xVar, he.f<? super I, ? extends O> fVar, Executor executor) {
        he.n.l(fVar);
        b bVar = new b(xVar, fVar);
        xVar.a(bVar, a0.c(executor, bVar));
        return bVar;
    }

    public static <I, O> x<O> N(x<I> xVar, i<? super I, ? extends O> iVar, Executor executor) {
        he.n.l(executor);
        a aVar = new a(xVar, iVar);
        xVar.a(aVar, a0.c(executor, aVar));
        return aVar;
    }

    @Override // ne.b
    public String A() {
        String string;
        x<? extends I> xVar = this.f27107h;
        F f10 = this.f27108i;
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
        if (f10 == null) {
            if (strA == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strA.length() != 0 ? strValueOf2.concat(strA) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(f10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 11 + strValueOf3.length());
        sb3.append(string);
        sb3.append("function=[");
        sb3.append(strValueOf3);
        sb3.append("]");
        return sb3.toString();
    }

    public abstract T O(F f10, I i10);

    public abstract void P(T t8);

    @Override // ne.b
    public final void o() {
        z(this.f27107h);
        this.f27107h = null;
        this.f27108i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        x<? extends I> xVar = this.f27107h;
        F f10 = this.f27108i;
        if ((isCancelled() | (xVar == null)) || (f10 == null)) {
            return;
        }
        this.f27107h = null;
        if (xVar.isCancelled()) {
            F(xVar);
            return;
        }
        try {
            try {
                Object objO = O(f10, s.f(xVar));
                this.f27108i = null;
                P(objO);
            } catch (Throwable th2) {
                try {
                    E(th2);
                } finally {
                    this.f27108i = null;
                }
            }
        } catch (Error e10) {
            E(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            E(e11);
        } catch (ExecutionException e12) {
            E(e12.getCause());
        }
    }
}
