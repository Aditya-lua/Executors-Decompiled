package p064d1;

import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0955f0;
import androidx.p616lifecycle.InterfaceC0978r;
import androidx.p616lifecycle.InterfaceC0980s;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p140g0.C5888g2;
import p140g0.C5931r1;
import p140g0.C5933s;
import p155h0.InterfaceC6259a;
import p424s0.C11145f;
import p533x2.C12637g;

/* JADX INFO: renamed from: d1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4403h {

    /* JADX INFO: renamed from: f */
    public static final Object f18286f = new Object();

    /* JADX INFO: renamed from: g */
    public static C4403h f18287g;

    /* JADX INFO: renamed from: a */
    public final Object f18288a = new Object();

    /* JADX INFO: renamed from: b */
    public final Map<a, C4398c> f18289b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<b, Set<a>> f18290c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<InterfaceC0980s> f18291d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e */
    public InterfaceC6259a f18292e;

    /* JADX INFO: renamed from: d1.h$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public static a m22133a(InterfaceC0980s interfaceC0980s, C5933s c5933s) {
            return new C4396a(System.identityHashCode(interfaceC0980s), c5933s);
        }

        /* JADX INFO: renamed from: b */
        public abstract C5933s mo22069b();

        /* JADX INFO: renamed from: c */
        public abstract int mo22070c();
    }

    /* JADX INFO: renamed from: d1.h$b */
    public static class b implements InterfaceC0978r {

        /* JADX INFO: renamed from: a */
        public final C4403h f18293a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0980s f18294b;

        public b(InterfaceC0980s interfaceC0980s, C4403h c4403h) {
            this.f18294b = interfaceC0980s;
            this.f18293a = c4403h;
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC0980s m22134a() {
            return this.f18294b;
        }

        @InterfaceC0955f0(AbstractC0966l.a.ON_DESTROY)
        public void onDestroy(InterfaceC0980s interfaceC0980s) {
            this.f18293a.m22131p(interfaceC0980s);
        }

        @InterfaceC0955f0(AbstractC0966l.a.ON_START)
        public void onStart(InterfaceC0980s interfaceC0980s) {
            this.f18293a.m22125j(interfaceC0980s);
        }

        @InterfaceC0955f0(AbstractC0966l.a.ON_STOP)
        public void onStop(InterfaceC0980s interfaceC0980s) {
            this.f18293a.m22126k(interfaceC0980s);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C4403h m22116c() {
        C4403h c4403h;
        synchronized (f18286f) {
            try {
                if (f18287g == null) {
                    f18287g = new C4403h();
                }
                c4403h = f18287g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4403h;
    }

    /* JADX INFO: renamed from: a */
    public void m22117a(C4398c c4398c, C5888g2 c5888g2, InterfaceC6259a interfaceC6259a) {
        synchronized (this.f18288a) {
            try {
                C12637g.m47069a(!c5888g2.m26474k().isEmpty());
                this.f18292e = interfaceC6259a;
                InterfaceC0980s interfaceC0980sM22077t = c4398c.m22077t();
                b bVarM22120e = m22120e(interfaceC0980sM22077t);
                if (bVarM22120e == null) {
                    return;
                }
                Set<a> set = this.f18290c.get(bVarM22120e);
                InterfaceC6259a interfaceC6259a2 = this.f18292e;
                if (interfaceC6259a2 == null || interfaceC6259a2.mo23116e() != 2) {
                    Iterator<a> it = set.iterator();
                    while (it.hasNext()) {
                        C4398c c4398c2 = (C4398c) C12637g.m47075g(this.f18289b.get(it.next()));
                        if (!c4398c2.equals(c4398c) && !c4398c2.m22078u().isEmpty()) {
                            if (c4398c2.m22080w() || c5888g2.mo26476m()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            c4398c2.m22083z();
                        }
                    }
                }
                try {
                    c4398c.m22075n(c5888g2);
                    if (interfaceC0980sM22077t.mo4656a().getState().m4945b(AbstractC0966l.b.STARTED)) {
                        m22125j(interfaceC0980sM22077t);
                    }
                } catch (C11145f.a e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public C4398c m22118b(InterfaceC0980s interfaceC0980s, C11145f c11145f) {
        synchronized (this.f18288a) {
            try {
                C12637g.m47070b(this.f18289b.get(a.m22133a(interfaceC0980s, c11145f.m41974J())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                C4398c c4398c = new C4398c(interfaceC0980s, c11145f);
                if (c11145f.m41977O().isEmpty()) {
                    c4398c.m22081x();
                }
                if (interfaceC0980s.mo4656a().getState() == AbstractC0966l.b.DESTROYED) {
                    return c4398c;
                }
                m22123h(c4398c);
                return c4398c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public C4398c m22119d(InterfaceC0980s interfaceC0980s, C5933s c5933s) {
        C4398c c4398c;
        synchronized (this.f18288a) {
            c4398c = this.f18289b.get(a.m22133a(interfaceC0980s, c5933s));
        }
        return c4398c;
    }

    /* JADX INFO: renamed from: e */
    public final b m22120e(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18288a) {
            try {
                for (b bVar : this.f18290c.keySet()) {
                    if (interfaceC0980s.equals(bVar.m22134a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public Collection<C4398c> m22121f() {
        Collection<C4398c> collectionUnmodifiableCollection;
        synchronized (this.f18288a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f18289b.values());
        }
        return collectionUnmodifiableCollection;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m22122g(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18288a) {
            try {
                b bVarM22120e = m22120e(interfaceC0980s);
                if (bVarM22120e == null) {
                    return false;
                }
                Iterator<a> it = this.f18290c.get(bVarM22120e).iterator();
                while (it.hasNext()) {
                    if (!((C4398c) C12637g.m47075g(this.f18289b.get(it.next()))).m22078u().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m22123h(C4398c c4398c) {
        synchronized (this.f18288a) {
            try {
                InterfaceC0980s interfaceC0980sM22077t = c4398c.m22077t();
                a aVarM22133a = a.m22133a(interfaceC0980sM22077t, c4398c.m22076s().m41974J());
                b bVarM22120e = m22120e(interfaceC0980sM22077t);
                Set<a> hashSet = bVarM22120e != null ? this.f18290c.get(bVarM22120e) : new HashSet<>();
                hashSet.add(aVarM22133a);
                this.f18289b.put(aVarM22133a, c4398c);
                if (bVarM22120e == null) {
                    b bVar = new b(interfaceC0980sM22077t, this);
                    this.f18290c.put(bVar, hashSet);
                    interfaceC0980sM22077t.mo4656a().mo4935a(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m22124i(Set<a> set) {
        synchronized (this.f18288a) {
            if (set == null) {
                try {
                    set = this.f18289b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (a aVar : set) {
                if (this.f18289b.containsKey(aVar)) {
                    m22130o(this.f18289b.get(aVar));
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m22125j(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18288a) {
            try {
                if (m22122g(interfaceC0980s)) {
                    if (this.f18291d.isEmpty()) {
                        this.f18291d.push(interfaceC0980s);
                    } else {
                        InterfaceC6259a interfaceC6259a = this.f18292e;
                        if (interfaceC6259a == null || interfaceC6259a.mo23116e() != 2) {
                            InterfaceC0980s interfaceC0980sPeek = this.f18291d.peek();
                            if (!interfaceC0980s.equals(interfaceC0980sPeek)) {
                                m22127l(interfaceC0980sPeek);
                                this.f18291d.remove(interfaceC0980s);
                                this.f18291d.push(interfaceC0980s);
                            }
                        }
                    }
                    m22132q(interfaceC0980s);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m22126k(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18288a) {
            try {
                this.f18291d.remove(interfaceC0980s);
                m22127l(interfaceC0980s);
                if (!this.f18291d.isEmpty()) {
                    m22132q(this.f18291d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m22127l(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18288a) {
            try {
                b bVarM22120e = m22120e(interfaceC0980s);
                if (bVarM22120e == null) {
                    return;
                }
                Iterator<a> it = this.f18290c.get(bVarM22120e).iterator();
                while (it.hasNext()) {
                    ((C4398c) C12637g.m47075g(this.f18289b.get(it.next()))).m22081x();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m22128m(C5888g2 c5888g2, Set<a> set) {
        synchronized (this.f18288a) {
            if (set == null) {
                try {
                    set = this.f18289b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (a aVar : set) {
                if (this.f18289b.containsKey(aVar)) {
                    C4398c c4398c = this.f18289b.get(aVar);
                    boolean zIsEmpty = c4398c.m22078u().isEmpty();
                    c4398c.m22082y(c5888g2);
                    if (!zIsEmpty && c4398c.m22078u().isEmpty()) {
                        m22126k(c4398c.m22077t());
                    }
                } else {
                    C5931r1.m26572l("LifecycleCameraRepository", "Attempt to unbind use cases from an invalid camera.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m22129n(Set<a> set) {
        synchronized (this.f18288a) {
            if (set == null) {
                try {
                    set = this.f18289b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator<a> it = set.iterator();
            while (it.hasNext()) {
                C4398c c4398c = this.f18289b.get(it.next());
                if (c4398c != null) {
                    c4398c.m22083z();
                    m22126k(c4398c.m22077t());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m22130o(C4398c c4398c) {
        synchronized (this.f18288a) {
            try {
                InterfaceC0980s interfaceC0980sM22077t = c4398c.m22077t();
                a aVarM22133a = a.m22133a(interfaceC0980sM22077t, c4398c.m22076s().m41974J());
                this.f18289b.remove(aVarM22133a);
                HashSet hashSet = new HashSet();
                for (b bVar : this.f18290c.keySet()) {
                    if (interfaceC0980sM22077t.equals(bVar.m22134a())) {
                        Set<a> set = this.f18290c.get(bVar);
                        set.remove(aVarM22133a);
                        if (set.isEmpty()) {
                            hashSet.add(bVar.m22134a());
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m22131p((InterfaceC0980s) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m22131p(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18288a) {
            try {
                b bVarM22120e = m22120e(interfaceC0980s);
                if (bVarM22120e == null) {
                    return;
                }
                m22126k(interfaceC0980s);
                Iterator<a> it = this.f18290c.get(bVarM22120e).iterator();
                while (it.hasNext()) {
                    this.f18289b.remove(it.next());
                }
                this.f18290c.remove(bVarM22120e);
                bVarM22120e.m22134a().mo4656a().mo4938d(bVarM22120e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m22132q(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18288a) {
            try {
                Iterator<a> it = this.f18290c.get(m22120e(interfaceC0980s)).iterator();
                while (it.hasNext()) {
                    C4398c c4398c = this.f18289b.get(it.next());
                    if (!((C4398c) C12637g.m47075g(c4398c)).m22078u().isEmpty()) {
                        c4398c.m22072A();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
