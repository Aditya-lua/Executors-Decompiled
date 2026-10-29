package ne;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p169he.C6384n;
import p169he.InterfaceC6376f;
import p329oe.AbstractC9725a;
import p329oe.C9726b;

/* JADX INFO: renamed from: ne.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC9409a<V, X extends Throwable, F, T> extends AbstractC9429m.a<V> implements Runnable {

    /* JADX INFO: renamed from: h */
    public InterfaceFutureC9440x<? extends V> f33872h;

    /* JADX INFO: renamed from: i */
    public Class<X> f33873i;

    /* JADX INFO: renamed from: j */
    public F f33874j;

    /* JADX INFO: renamed from: ne.a$a */
    public static final class a<V, X extends Throwable> extends AbstractRunnableC9409a<V, X, InterfaceC9425i<? super X, ? extends V>, InterfaceFutureC9440x<? extends V>> {
        public a(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x, Class<X> cls, InterfaceC9425i<? super X, ? extends V> interfaceC9425i) {
            super(interfaceFutureC9440x, cls, interfaceC9425i);
        }

        /* JADX DEBUG: Method merged with bridge method: O(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: X extends java.lang.Throwable */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.AbstractRunnableC9409a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public InterfaceFutureC9440x<? extends V> mo37139O(InterfaceC9425i<? super X, ? extends V> interfaceC9425i, X x10) {
            InterfaceFutureC9440x<? extends V> interfaceFutureC9440xApply = interfaceC9425i.apply(x10);
            C6384n.m27930n(interfaceFutureC9440xApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC9425i);
            return interfaceFutureC9440xApply;
        }

        /* JADX DEBUG: Method merged with bridge method: P(Ljava/lang/Object;)V */
        @Override // ne.AbstractRunnableC9409a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void mo37140P(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x) {
            m37171F(interfaceFutureC9440x);
        }
    }

    /* JADX INFO: renamed from: ne.a$b */
    public static final class b<V, X extends Throwable> extends AbstractRunnableC9409a<V, X, InterfaceC6376f<? super X, ? extends V>, V> {
        public b(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x, Class<X> cls, InterfaceC6376f<? super X, ? extends V> interfaceC6376f) {
            super(interfaceFutureC9440x, cls, interfaceC6376f);
        }

        @Override // ne.AbstractRunnableC9409a
        /* JADX INFO: renamed from: P */
        public void mo37140P(V v5) {
            mo37169D(v5);
        }

        /* JADX DEBUG: Method merged with bridge method: O(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: X extends java.lang.Throwable */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.AbstractRunnableC9409a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public V mo37139O(InterfaceC6376f<? super X, ? extends V> interfaceC6376f, X x10) {
            return interfaceC6376f.apply(x10);
        }
    }

    public AbstractRunnableC9409a(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x, Class<X> cls, F f10) {
        this.f33872h = (InterfaceFutureC9440x) C6384n.m27928l(interfaceFutureC9440x);
        this.f33873i = (Class) C6384n.m27928l(cls);
        this.f33874j = (F) C6384n.m27928l(f10);
    }

    /* JADX INFO: renamed from: M */
    public static <V, X extends Throwable> InterfaceFutureC9440x<V> m37136M(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x, Class<X> cls, InterfaceC6376f<? super X, ? extends V> interfaceC6376f, Executor executor) {
        b bVar = new b(interfaceFutureC9440x, cls, interfaceC6376f);
        interfaceFutureC9440x.mo37173a(bVar, C9410a0.m37147c(executor, bVar));
        return bVar;
    }

    /* JADX INFO: renamed from: N */
    public static <X extends Throwable, V> InterfaceFutureC9440x<V> m37137N(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x, Class<X> cls, InterfaceC9425i<? super X, ? extends V> interfaceC9425i, Executor executor) {
        a aVar = new a(interfaceFutureC9440x, cls, interfaceC9425i);
        interfaceFutureC9440x.mo37173a(aVar, C9410a0.m37147c(executor, aVar));
        return aVar;
    }

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: A */
    public String mo37138A() {
        String string;
        InterfaceFutureC9440x<? extends V> interfaceFutureC9440x = this.f33872h;
        Class<X> cls = this.f33873i;
        F f10 = this.f33874j;
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
        if (cls == null || f10 == null) {
            if (strMo37138A == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strMo37138A.length() != 0 ? strValueOf2.concat(strMo37138A) : new String(strValueOf2);
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

    /* JADX INFO: renamed from: O */
    public abstract T mo37139O(F f10, X x10);

    /* JADX INFO: renamed from: P */
    public abstract void mo37140P(T t8);

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: o */
    public final void mo37141o() {
        m37182z(this.f33872h);
        this.f33872h = null;
        this.f33873i = null;
        this.f33874j = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.play_billing.a2 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: ne.a<V, X extends java.lang.Throwable, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM37261f;
        InterfaceFutureC9440x<? extends V> interfaceFutureC9440x = this.f33872h;
        Class<X> cls = this.f33873i;
        F f10 = this.f33874j;
        if (((f10 == null) || ((interfaceFutureC9440x == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r8 = (Class<X>) null;
        this.f33872h = null;
        try {
            th = interfaceFutureC9440x instanceof AbstractC9725a ? C9726b.m38487a((AbstractC9725a) interfaceFutureC9440x) : null;
            objM37261f = th == null ? C9435s.m37261f(interfaceFutureC9440x) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(interfaceFutureC9440x.getClass());
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
            mo37169D(C9412b0.m37193a(objM37261f));
            return;
        }
        if (!C9416d0.m37203a(th, cls)) {
            m37171F(interfaceFutureC9440x);
            return;
        }
        try {
            Object objMo37139O = mo37139O(f10, th);
            this.f33873i = null;
            this.f33874j = null;
            mo37140P(objMo37139O);
        } catch (Throwable th3) {
            try {
                mo37170E(th3);
            } finally {
                this.f33873i = null;
                this.f33874j = null;
            }
        }
    }
}
