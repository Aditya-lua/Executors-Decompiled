package androidx.p616lifecycle;

import p396r.C10757c;
import p423s.C11139b;

/* JADX INFO: renamed from: androidx.lifecycle.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0940a0<T> {

    /* JADX INFO: renamed from: k */
    public static final Object f3587k = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f3588a;

    /* JADX INFO: renamed from: b */
    public C11139b<InterfaceC0952e0<? super T>, AbstractC0940a0<T>.d> f3589b;

    /* JADX INFO: renamed from: c */
    public int f3590c;

    /* JADX INFO: renamed from: d */
    public boolean f3591d;

    /* JADX INFO: renamed from: e */
    public volatile Object f3592e;

    /* JADX INFO: renamed from: f */
    public volatile Object f3593f;

    /* JADX INFO: renamed from: g */
    public int f3594g;

    /* JADX INFO: renamed from: h */
    public boolean f3595h;

    /* JADX INFO: renamed from: i */
    public boolean f3596i;

    /* JADX INFO: renamed from: j */
    public final Runnable f3597j;

    /* JADX INFO: renamed from: androidx.lifecycle.a0$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.a0 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC0940a0.this.f3588a) {
                obj = AbstractC0940a0.this.f3593f;
                AbstractC0940a0.this.f3593f = AbstractC0940a0.f3587k;
            }
            AbstractC0940a0.this.mo4863o(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a0$b */
    public class b extends AbstractC0940a0<T>.d {
        public b(InterfaceC0952e0<? super T> interfaceC0952e0) {
            super(interfaceC0952e0);
        }

        @Override // androidx.p616lifecycle.AbstractC0940a0.d
        /* JADX INFO: renamed from: d */
        public boolean mo4864d() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a0$c */
    public class c extends AbstractC0940a0<T>.d implements InterfaceC0974p {

        /* JADX INFO: renamed from: e */
        public final InterfaceC0980s f3600e;

        public c(InterfaceC0980s interfaceC0980s, InterfaceC0952e0<? super T> interfaceC0952e0) {
            super(interfaceC0952e0);
            this.f3600e = interfaceC0980s;
        }

        @Override // androidx.p616lifecycle.AbstractC0940a0.d
        /* JADX INFO: renamed from: b */
        public void mo4865b() {
            this.f3600e.mo4656a().mo4938d(this);
        }

        @Override // androidx.p616lifecycle.AbstractC0940a0.d
        /* JADX INFO: renamed from: c */
        public boolean mo4866c(InterfaceC0980s interfaceC0980s) {
            return this.f3600e == interfaceC0980s;
        }

        @Override // androidx.p616lifecycle.AbstractC0940a0.d
        /* JADX INFO: renamed from: d */
        public boolean mo4864d() {
            return this.f3600e.mo4656a().mo4936b().m4945b(AbstractC0966l.b.STARTED);
        }

        @Override // androidx.p616lifecycle.InterfaceC0974p
        /* JADX INFO: renamed from: g */
        public void mo1334g(InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar) {
            AbstractC0966l.b bVarMo4936b = this.f3600e.mo4656a().mo4936b();
            if (bVarMo4936b == AbstractC0966l.b.DESTROYED) {
                AbstractC0940a0.this.mo4862n(this.f3602a);
                return;
            }
            AbstractC0966l.b bVar = null;
            while (bVar != bVarMo4936b) {
                m4867a(mo4864d());
                bVar = bVarMo4936b;
                bVarMo4936b = this.f3600e.mo4656a().mo4936b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a0$d */
    public abstract class d {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0952e0<? super T> f3602a;

        /* JADX INFO: renamed from: b */
        public boolean f3603b;

        /* JADX INFO: renamed from: c */
        public int f3604c = -1;

        public d(InterfaceC0952e0<? super T> interfaceC0952e0) {
            this.f3602a = interfaceC0952e0;
        }

        /* JADX INFO: renamed from: a */
        public void m4867a(boolean z10) {
            if (z10 == this.f3603b) {
                return;
            }
            this.f3603b = z10;
            AbstractC0940a0.this.m4851c(z10 ? 1 : -1);
            if (this.f3603b) {
                AbstractC0940a0.this.m4853e(this);
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo4865b() {
        }

        /* JADX INFO: renamed from: c */
        public boolean mo4866c(InterfaceC0980s interfaceC0980s) {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public abstract boolean mo4864d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0940a0(T t8) {
        this.f3588a = new Object();
        this.f3589b = new C11139b<>();
        this.f3590c = 0;
        this.f3593f = f3587k;
        this.f3597j = new a();
        this.f3592e = t8;
        this.f3594g = 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m4850b(String str) {
        if (C10757c.m40964g().mo40966b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX INFO: renamed from: c */
    public void m4851c(int i10) {
        int i11 = this.f3590c;
        this.f3590c = i10 + i11;
        if (this.f3591d) {
            return;
        }
        this.f3591d = true;
        while (true) {
            try {
                int i12 = this.f3590c;
                if (i11 == i12) {
                    this.f3591d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    mo4859k();
                } else if (z11) {
                    mo4860l();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f3591d = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4852d(AbstractC0940a0<T>.d dVar) {
        if (dVar.f3603b) {
            if (!dVar.mo4864d()) {
                dVar.m4867a(false);
                return;
            }
            int i10 = dVar.f3604c;
            int i11 = this.f3594g;
            if (i10 >= i11) {
                return;
            }
            dVar.f3604c = i11;
            dVar.f3602a.mo4884a((Object) this.f3592e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m4853e(AbstractC0940a0<T>.d dVar) {
        if (this.f3595h) {
            this.f3596i = true;
            return;
        }
        this.f3595h = true;
        do {
            this.f3596i = false;
            if (dVar != null) {
                m4852d(dVar);
                dVar = null;
            } else {
                C11139b<InterfaceC0952e0<? super T>, AbstractC0940a0<T>.d>.d dVarM41922c = this.f3589b.m41922c();
                while (dVarM41922c.hasNext()) {
                    m4852d((d) dVarM41922c.next().getValue());
                    if (this.f3596i) {
                        break;
                    }
                }
            }
        } while (this.f3596i);
        this.f3595h = false;
    }

    /* JADX INFO: renamed from: f */
    public T mo4854f() {
        T t8 = (T) this.f3592e;
        if (t8 != f3587k) {
            return t8;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int m4855g() {
        return this.f3594g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4856h() {
        return this.f3590c > 0;
    }

    /* JADX INFO: renamed from: i */
    public void m4857i(InterfaceC0980s interfaceC0980s, InterfaceC0952e0<? super T> interfaceC0952e0) {
        m4850b("observe");
        if (interfaceC0980s.mo4656a().mo4936b() == AbstractC0966l.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC0980s, interfaceC0952e0);
        AbstractC0940a0<T>.d dVarMo41918f = this.f3589b.mo41918f(interfaceC0952e0, cVar);
        if (dVarMo41918f != null && !dVarMo41918f.mo4866c(interfaceC0980s)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarMo41918f != null) {
            return;
        }
        interfaceC0980s.mo4656a().mo4935a(cVar);
    }

    /* JADX INFO: renamed from: j */
    public void m4858j(InterfaceC0952e0<? super T> interfaceC0952e0) {
        m4850b("observeForever");
        b bVar = new b(interfaceC0952e0);
        AbstractC0940a0<T>.d dVarMo41918f = this.f3589b.mo41918f(interfaceC0952e0, bVar);
        if (dVarMo41918f instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarMo41918f != null) {
            return;
        }
        bVar.m4867a(true);
    }

    /* JADX INFO: renamed from: k */
    public void mo4859k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo4860l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo4861m(T t8) {
        boolean z10;
        synchronized (this.f3588a) {
            z10 = this.f3593f == f3587k;
            this.f3593f = t8;
        }
        if (z10) {
            C10757c.m40964g().mo40967c(this.f3597j);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo4862n(InterfaceC0952e0<? super T> interfaceC0952e0) {
        m4850b("removeObserver");
        AbstractC0940a0<T>.d dVarMo41919g = this.f3589b.mo41919g(interfaceC0952e0);
        if (dVarMo41919g == null) {
            return;
        }
        dVarMo41919g.mo4865b();
        dVarMo41919g.m4867a(false);
    }

    /* JADX INFO: renamed from: o */
    public void mo4863o(T t8) {
        m4850b("setValue");
        this.f3594g++;
        this.f3592e = t8;
        m4853e(null);
    }

    public AbstractC0940a0() {
        this.f3588a = new Object();
        this.f3589b = new C11139b<>();
        this.f3590c = 0;
        Object obj = f3587k;
        this.f3593f = obj;
        this.f3597j = new a();
        this.f3592e = obj;
        this.f3594g = -1;
    }
}
