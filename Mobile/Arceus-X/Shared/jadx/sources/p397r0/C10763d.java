package p397r0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ne.InterfaceFutureC9440x;
import p436t.InterfaceC11464a;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: r0.d */
/* JADX INFO: loaded from: classes.dex */
public class C10763d<V> implements InterfaceFutureC9440x<V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC9440x<V> f38346a;

    /* JADX INFO: renamed from: b */
    public C12997c.a<V> f38347b;

    /* JADX INFO: renamed from: r0.d$a */
    public class a implements C12997c.c<V> {
        public a() {
        }

        @Override // p563y1.C12997c.c
        /* JADX INFO: renamed from: a */
        public Object mo22051a(C12997c.a<V> aVar) {
            C12637g.m47078j(C10763d.this.f38347b == null, "The result can only set once!");
            C10763d.this.f38347b = aVar;
            return "FutureChain[" + C10763d.this + "]";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10763d(InterfaceFutureC9440x<V> interfaceFutureC9440x) {
        this.f38346a = (InterfaceFutureC9440x) C12637g.m47075g(interfaceFutureC9440x);
    }

    /* JADX INFO: renamed from: c */
    public static <V> C10763d<V> m40973c(InterfaceFutureC9440x<V> interfaceFutureC9440x) {
        return interfaceFutureC9440x instanceof C10763d ? (C10763d) interfaceFutureC9440x : new C10763d<>(interfaceFutureC9440x);
    }

    @Override // ne.InterfaceFutureC9440x
    /* JADX INFO: renamed from: a */
    public void mo37173a(Runnable runnable, Executor executor) {
        this.f38346a.mo37173a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f38346a.cancel(z10);
    }

    /* JADX INFO: renamed from: d */
    public boolean m40974d(V v5) {
        C12997c.a<V> aVar = this.f38347b;
        if (aVar != null) {
            return aVar.m48314c(v5);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m40975e(Throwable th2) {
        C12997c.a<V> aVar = this.f38347b;
        if (aVar != null) {
            return aVar.m48317f(th2);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final <T> C10763d<T> m40976f(InterfaceC11464a<? super V, T> interfaceC11464a, Executor executor) {
        return (C10763d) C10773n.m41001x(this, interfaceC11464a, executor);
    }

    /* JADX INFO: renamed from: g */
    public final <T> C10763d<T> m40977g(InterfaceC10760a<? super V, T> interfaceC10760a, Executor executor) {
        return (C10763d) C10773n.m41002y(this, interfaceC10760a, executor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public V get() {
        return this.f38346a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f38346a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f38346a.isDone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f38346a.get(j10, timeUnit);
    }

    public C10763d() {
        this.f38346a = C12997c.m48311a(new a());
    }
}
