package p296n0;

import android.os.SystemClock;
import androidx.p616lifecycle.C0949d0;
import androidx.p616lifecycle.InterfaceC0952e0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p366q0.C10417c;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: n0.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8831u2<T> implements InterfaceC8722a3<T> {

    /* JADX INFO: renamed from: a */
    public final C0949d0<a<T>> f32122a = new C0949d0<>();

    /* JADX INFO: renamed from: b */
    public final Map<InterfaceC8722a3.a<? super T>, Executor> f32123b = new HashMap();

    /* JADX INFO: renamed from: c */
    public InterfaceC0952e0<a<T>> f32124c;

    /* JADX INFO: renamed from: n0.u2$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final T f32125a;

        /* JADX INFO: renamed from: b */
        public final Throwable f32126b;

        public a(T t8, Throwable th2) {
            this.f32125a = t8;
            this.f32126b = th2;
        }

        /* JADX INFO: renamed from: b */
        public static <T> a<T> m35453b(T t8) {
            return new a<>(t8, null);
        }

        /* JADX INFO: renamed from: a */
        public boolean m35454a() {
            return this.f32126b == null;
        }

        /* JADX INFO: renamed from: c */
        public Throwable m35455c() {
            return this.f32126b;
        }

        /* JADX INFO: renamed from: d */
        public T m35456d() {
            if (m35454a()) {
                return this.f32125a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (m35454a()) {
                str = "Value: " + this.f32125a;
            } else {
                str = "Error: " + this.f32126b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m35443a(C8831u2 c8831u2, final a aVar) {
        HashMap map;
        synchronized (c8831u2.f32123b) {
            map = new HashMap(c8831u2.f32123b);
        }
        for (final Map.Entry entry : map.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: n0.q2
                @Override // java.lang.Runnable
                public final void run() {
                    C8831u2.m35444f(entry, aVar);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: n0.a3$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m35444f(Map.Entry entry, a aVar) {
        InterfaceC8722a3.a aVar2 = (InterfaceC8722a3.a) entry.getKey();
        if (aVar.m35454a()) {
            aVar2.mo2367a(aVar.m35456d());
        } else {
            C12637g.m47075g(aVar.m35455c());
            aVar2.onError(aVar.m35455c());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m35445g(final C8831u2 c8831u2, final C12997c.a aVar) {
        c8831u2.getClass();
        C10417c.m40084e().execute(new Runnable() { // from class: n0.o2
            @Override // java.lang.Runnable
            public final void run() {
                C8831u2.m35449k(this.f31986a, aVar);
            }
        });
        return c8831u2 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m35446h(final C8831u2 c8831u2) {
        if (c8831u2.f32124c == null) {
            c8831u2.f32124c = new InterfaceC0952e0() { // from class: n0.p2
                @Override // androidx.p616lifecycle.InterfaceC0952e0
                /* JADX INFO: renamed from: a */
                public final void mo4884a(Object obj) {
                    C8831u2.m35443a(this.f32033a, (C8831u2.a) obj);
                }
            };
        }
        c8831u2.f32122a.m4858j(c8831u2.f32124c);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m35447i(C8831u2 c8831u2) {
        InterfaceC0952e0<a<T>> interfaceC0952e0 = c8831u2.f32124c;
        if (interfaceC0952e0 != null) {
            c8831u2.f32122a.mo4862n(interfaceC0952e0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m35448j(C8831u2 c8831u2, InterfaceC8722a3.a aVar) {
        a<T> aVarMo4854f = c8831u2.f32122a.mo4854f();
        if (aVarMo4854f == null) {
            return;
        }
        if (aVarMo4854f.m35454a()) {
            aVar.mo2367a(aVarMo4854f.m35456d());
        } else {
            C12637g.m47075g(aVarMo4854f.m35455c());
            aVar.onError(aVarMo4854f.m35455c());
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m35449k(C8831u2 c8831u2, C12997c.a aVar) {
        a<T> aVarMo4854f = c8831u2.f32122a.mo4854f();
        if (aVarMo4854f == null) {
            aVar.m48317f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (aVarMo4854f.m35454a()) {
            aVar.m48314c(aVarMo4854f.m35456d());
        } else {
            C12637g.m47075g(aVarMo4854f.m35455c());
            aVar.m48317f(aVarMo4854f.m35455c());
        }
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: b */
    public InterfaceFutureC9440x<T> mo34017b() {
        return C12997c.m48311a(new C12997c.c() { // from class: n0.s2
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C8831u2.m35445g(this.f32075a, aVar);
            }
        });
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: c */
    public void mo34018c(Executor executor, final InterfaceC8722a3.a<? super T> aVar) {
        synchronized (this.f32123b) {
            try {
                boolean zIsEmpty = this.f32123b.isEmpty();
                this.f32123b.put(aVar, executor);
                if (zIsEmpty) {
                    m35451m();
                } else {
                    executor.execute(new Runnable() { // from class: n0.r2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8831u2.m35448j(this.f32055a, aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: d */
    public void mo34019d(InterfaceC8722a3.a<? super T> aVar) {
        synchronized (this.f32123b) {
            try {
                this.f32123b.remove(aVar);
                if (this.f32123b.isEmpty()) {
                    m35450l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m35450l() {
        C10417c.m40084e().execute(new Runnable() { // from class: n0.t2
            @Override // java.lang.Runnable
            public final void run() {
                C8831u2.m35447i(this.f32103a);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m35451m() {
        C10417c.m40084e().execute(new Runnable() { // from class: n0.n2
            @Override // java.lang.Runnable
            public final void run() {
                C8831u2.m35446h(this.f31980a);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m35452n(T t8) {
        this.f32122a.mo4861m(a.m35453b(t8));
    }
}
