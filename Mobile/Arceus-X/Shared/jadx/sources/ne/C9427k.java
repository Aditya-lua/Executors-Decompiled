package ne;

import ie.AbstractC6792r;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p169he.C6384n;

/* JADX INFO: renamed from: ne.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C9427k<V> extends AbstractC9421g<Object, V> {

    /* JADX INFO: renamed from: p */
    public C9427k<V>.b<?> f33950p;

    /* JADX INFO: renamed from: ne.k$a */
    public final class a extends C9427k<V>.b<V> {

        /* JADX INFO: renamed from: e */
        public final Callable<V> f33951e;

        public a(Callable<V> callable, Executor executor) {
            super(executor);
            this.f33951e = (Callable) C6384n.m27928l(callable);
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: e */
        public V mo37232e() {
            return this.f33951e.call();
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: f */
        public String mo37233f() {
            return this.f33951e.toString();
        }

        @Override // ne.C9427k.b
        /* JADX INFO: renamed from: i */
        public void mo37246i(V v5) {
            C9427k.this.mo37169D(v5);
        }
    }

    /* JADX INFO: renamed from: ne.k$b */
    public abstract class b<T> extends AbstractRunnableC9439w<T> {

        /* JADX INFO: renamed from: c */
        public final Executor f33953c;

        public b(Executor executor) {
            this.f33953c = (Executor) C6384n.m27928l(executor);
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: a */
        public final void mo37229a(Throwable th2) {
            C9427k.this.f33950p = null;
            if (th2 instanceof ExecutionException) {
                C9427k.this.mo37170E(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                C9427k.this.cancel(false);
            } else {
                C9427k.this.mo37170E(th2);
            }
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: b */
        public final void mo37230b(T t8) {
            C9427k.this.f33950p = null;
            mo37246i(t8);
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: d */
        public final boolean mo37231d() {
            return C9427k.this.isDone();
        }

        /* JADX INFO: renamed from: h */
        public final void m37247h() {
            try {
                this.f33953c.execute(this);
            } catch (RejectedExecutionException e10) {
                C9427k.this.mo37170E(e10);
            }
        }

        /* JADX INFO: renamed from: i */
        public abstract void mo37246i(T t8);
    }

    public C9427k(AbstractC6792r<? extends InterfaceFutureC9440x<?>> abstractC6792r, boolean z10, Executor executor, Callable<V> callable) {
        super(abstractC6792r, z10, false);
        this.f33950p = new a(callable, executor);
        m37223W();
    }

    @Override // ne.AbstractC9421g
    /* JADX INFO: renamed from: R */
    public void mo37218R(int i10, Object obj) {
    }

    @Override // ne.AbstractC9421g
    /* JADX INFO: renamed from: U */
    public void mo37221U() {
        C9427k<V>.b<?> bVar = this.f33950p;
        if (bVar != null) {
            bVar.m37247h();
        }
    }

    @Override // ne.AbstractC9421g
    /* JADX INFO: renamed from: Z */
    public void mo37225Z(AbstractC9421g.a aVar) {
        super.mo37225Z(aVar);
        if (aVar == AbstractC9421g.a.OUTPUT_FUTURE_DONE) {
            this.f33950p = null;
        }
    }

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: y */
    public void mo37181y() {
        C9427k<V>.b<?> bVar = this.f33950p;
        if (bVar != null) {
            bVar.m37272c();
        }
    }
}
