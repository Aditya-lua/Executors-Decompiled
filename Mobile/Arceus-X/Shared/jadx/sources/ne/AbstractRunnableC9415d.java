package ne;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p169he.C6384n;
import p169he.InterfaceC6376f;

/* JADX INFO: renamed from: ne.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC9415d<I, O, F, T> extends AbstractC9429m.a<O> implements Runnable {

    /* JADX INFO: renamed from: h */
    public InterfaceFutureC9440x<? extends I> f33914h;

    /* JADX INFO: renamed from: i */
    public F f33915i;

    /* JADX INFO: renamed from: ne.d$a */
    public static final class a<I, O> extends AbstractRunnableC9415d<I, O, InterfaceC9425i<? super I, ? extends O>, InterfaceFutureC9440x<? extends O>> {
        public a(InterfaceFutureC9440x<? extends I> interfaceFutureC9440x, InterfaceC9425i<? super I, ? extends O> interfaceC9425i) {
            super(interfaceFutureC9440x, interfaceC9425i);
        }

        /* JADX DEBUG: Method merged with bridge method: O(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: I */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.AbstractRunnableC9415d
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public InterfaceFutureC9440x<? extends O> mo37198O(InterfaceC9425i<? super I, ? extends O> interfaceC9425i, I i10) {
            InterfaceFutureC9440x<? extends O> interfaceFutureC9440xApply = interfaceC9425i.apply(i10);
            C6384n.m27930n(interfaceFutureC9440xApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC9425i);
            return interfaceFutureC9440xApply;
        }

        /* JADX DEBUG: Method merged with bridge method: P(Ljava/lang/Object;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ne.x<? extends O> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.AbstractRunnableC9415d
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void mo37199P(InterfaceFutureC9440x<? extends O> interfaceFutureC9440x) {
            m37171F(interfaceFutureC9440x);
        }
    }

    /* JADX INFO: renamed from: ne.d$b */
    public static final class b<I, O> extends AbstractRunnableC9415d<I, O, InterfaceC6376f<? super I, ? extends O>, O> {
        public b(InterfaceFutureC9440x<? extends I> interfaceFutureC9440x, InterfaceC6376f<? super I, ? extends O> interfaceC6376f) {
            super(interfaceFutureC9440x, interfaceC6376f);
        }

        @Override // ne.AbstractRunnableC9415d
        /* JADX INFO: renamed from: P */
        public void mo37199P(O o8) {
            mo37169D(o8);
        }

        /* JADX DEBUG: Method merged with bridge method: O(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: I */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.AbstractRunnableC9415d
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public O mo37198O(InterfaceC6376f<? super I, ? extends O> interfaceC6376f, I i10) {
            return interfaceC6376f.apply(i10);
        }
    }

    public AbstractRunnableC9415d(InterfaceFutureC9440x<? extends I> interfaceFutureC9440x, F f10) {
        this.f33914h = (InterfaceFutureC9440x) C6384n.m27928l(interfaceFutureC9440x);
        this.f33915i = (F) C6384n.m27928l(f10);
    }

    /* JADX INFO: renamed from: M */
    public static <I, O> InterfaceFutureC9440x<O> m37196M(InterfaceFutureC9440x<I> interfaceFutureC9440x, InterfaceC6376f<? super I, ? extends O> interfaceC6376f, Executor executor) {
        C6384n.m27928l(interfaceC6376f);
        b bVar = new b(interfaceFutureC9440x, interfaceC6376f);
        interfaceFutureC9440x.mo37173a(bVar, C9410a0.m37147c(executor, bVar));
        return bVar;
    }

    /* JADX INFO: renamed from: N */
    public static <I, O> InterfaceFutureC9440x<O> m37197N(InterfaceFutureC9440x<I> interfaceFutureC9440x, InterfaceC9425i<? super I, ? extends O> interfaceC9425i, Executor executor) {
        C6384n.m27928l(executor);
        a aVar = new a(interfaceFutureC9440x, interfaceC9425i);
        interfaceFutureC9440x.mo37173a(aVar, C9410a0.m37147c(executor, aVar));
        return aVar;
    }

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: A */
    public String mo37138A() {
        String string;
        InterfaceFutureC9440x<? extends I> interfaceFutureC9440x = this.f33914h;
        F f10 = this.f33915i;
        String strMo37138A = super.mo37138A();
        if (interfaceFutureC9440x != null) {
            String strValueOf = String.valueOf(interfaceFutureC9440x);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(strValueOf);
            sb2.append("], ");
            string = sb2.toString();
        } else {
            string = "";
        }
        if (f10 == null) {
            if (strMo37138A == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strMo37138A.length() != 0 ? strValueOf2.concat(strMo37138A) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(f10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 11 + strValueOf3.length());
        sb3.append(string);
        sb3.append("function=[");
        sb3.append(strValueOf3);
        sb3.append("]");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: O */
    public abstract T mo37198O(F f10, I i10);

    /* JADX INFO: renamed from: P */
    public abstract void mo37199P(T t8);

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: o */
    public final void mo37141o() {
        m37182z(this.f33914h);
        this.f33914h = null;
        this.f33915i = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: ne.d<I, O, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC9440x<? extends I> interfaceFutureC9440x = this.f33914h;
        F f10 = this.f33915i;
        if ((isCancelled() | (interfaceFutureC9440x == null)) || (f10 == null)) {
            return;
        }
        this.f33914h = null;
        if (interfaceFutureC9440x.isCancelled()) {
            m37171F(interfaceFutureC9440x);
            return;
        }
        try {
            try {
                Object objMo37198O = mo37198O(f10, C9435s.m37261f(interfaceFutureC9440x));
                this.f33915i = null;
                mo37199P(objMo37198O);
            } catch (Throwable th2) {
                try {
                    mo37170E(th2);
                } finally {
                    this.f33915i = null;
                }
            }
        } catch (Error e10) {
            mo37170E(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            mo37170E(e11);
        } catch (ExecutionException e12) {
            mo37170E(e12.getCause());
        }
    }
}
