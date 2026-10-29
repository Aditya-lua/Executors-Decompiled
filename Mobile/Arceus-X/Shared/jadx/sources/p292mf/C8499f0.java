package p292mf;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p490vf.InterfaceC12166c;
import p575yf.InterfaceC13188b;

/* JADX INFO: renamed from: mf.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8499f0 implements InterfaceC8494d {

    /* JADX INFO: renamed from: a */
    public final Set<C8497e0<?>> f31223a;

    /* JADX INFO: renamed from: b */
    public final Set<C8497e0<?>> f31224b;

    /* JADX INFO: renamed from: c */
    public final Set<C8497e0<?>> f31225c;

    /* JADX INFO: renamed from: d */
    public final Set<C8497e0<?>> f31226d;

    /* JADX INFO: renamed from: e */
    public final Set<C8497e0<?>> f31227e;

    /* JADX INFO: renamed from: f */
    public final Set<Class<?>> f31228f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8494d f31229g;

    /* JADX INFO: renamed from: mf.f0$a */
    public static class a implements InterfaceC12166c {

        /* JADX INFO: renamed from: a */
        public final Set<Class<?>> f31230a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC12166c f31231b;

        public a(Set<Class<?>> set, InterfaceC12166c interfaceC12166c) {
            this.f31230a = set;
            this.f31231b = interfaceC12166c;
        }
    }

    public C8499f0(C8492c<?> c8492c, InterfaceC8494d interfaceC8494d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C8511r c8511r : c8492c.m34281g()) {
            if (c8511r.m34365d()) {
                if (c8511r.m34367f()) {
                    hashSet4.add(c8511r.m34363b());
                } else {
                    hashSet.add(c8511r.m34363b());
                }
            } else if (c8511r.m34364c()) {
                hashSet3.add(c8511r.m34363b());
            } else if (c8511r.m34367f()) {
                hashSet5.add(c8511r.m34363b());
            } else {
                hashSet2.add(c8511r.m34363b());
            }
        }
        if (!c8492c.m34285k().isEmpty()) {
            hashSet.add(C8497e0.m34316b(InterfaceC12166c.class));
        }
        this.f31223a = Collections.unmodifiableSet(hashSet);
        this.f31224b = Collections.unmodifiableSet(hashSet2);
        this.f31225c = Collections.unmodifiableSet(hashSet3);
        this.f31226d = Collections.unmodifiableSet(hashSet4);
        this.f31227e = Collections.unmodifiableSet(hashSet5);
        this.f31228f = c8492c.m34285k();
        this.f31229g = interfaceC8494d;
    }

    @Override // p292mf.InterfaceC8494d
    /* JADX INFO: renamed from: a */
    public <T> T mo34304a(Class<T> cls) {
        if (!this.f31223a.contains(C8497e0.m34316b(cls))) {
            throw new C8513t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t8 = (T) this.f31229g.mo34304a(cls);
        return !cls.equals(InterfaceC12166c.class) ? t8 : (T) new a(this.f31228f, (InterfaceC12166c) t8);
    }

    @Override // p292mf.InterfaceC8494d
    /* JADX INFO: renamed from: b */
    public <T> Set<T> mo34305b(C8497e0<T> c8497e0) {
        if (this.f31226d.contains(c8497e0)) {
            return this.f31229g.mo34305b(c8497e0);
        }
        throw new C8513t(String.format("Attempting to request an undeclared dependency Set<%s>.", c8497e0));
    }

    @Override // p292mf.InterfaceC8494d
    /* JADX INFO: renamed from: c */
    public <T> InterfaceC13188b<T> mo34306c(C8497e0<T> c8497e0) {
        if (this.f31224b.contains(c8497e0)) {
            return this.f31229g.mo34306c(c8497e0);
        }
        throw new C8513t(String.format("Attempting to request an undeclared dependency Provider<%s>.", c8497e0));
    }

    @Override // p292mf.InterfaceC8494d
    /* JADX INFO: renamed from: e */
    public <T> InterfaceC13188b<Set<T>> mo34308e(C8497e0<T> c8497e0) {
        if (this.f31227e.contains(c8497e0)) {
            return this.f31229g.mo34308e(c8497e0);
        }
        throw new C8513t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c8497e0));
    }

    @Override // p292mf.InterfaceC8494d
    /* JADX INFO: renamed from: f */
    public <T> T mo34309f(C8497e0<T> c8497e0) {
        if (this.f31223a.contains(c8497e0)) {
            return (T) this.f31229g.mo34309f(c8497e0);
        }
        throw new C8513t(String.format("Attempting to request an undeclared dependency %s.", c8497e0));
    }

    @Override // p292mf.InterfaceC8494d
    /* JADX INFO: renamed from: g */
    public <T> InterfaceC13188b<T> mo34310g(Class<T> cls) {
        return mo34306c(C8497e0.m34316b(cls));
    }
}
