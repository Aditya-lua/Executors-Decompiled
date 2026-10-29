package p292mf;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: mf.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8492c<T> {

    /* JADX INFO: renamed from: a */
    public final String f31199a;

    /* JADX INFO: renamed from: b */
    public final Set<C8497e0<? super T>> f31200b;

    /* JADX INFO: renamed from: c */
    public final Set<C8511r> f31201c;

    /* JADX INFO: renamed from: d */
    public final int f31202d;

    /* JADX INFO: renamed from: e */
    public final int f31203e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8500g<T> f31204f;

    /* JADX INFO: renamed from: g */
    public final Set<Class<?>> f31205g;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m34272a(Object obj, InterfaceC8494d interfaceC8494d) {
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m34273b(Object obj, InterfaceC8494d interfaceC8494d) {
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static <T> b<T> m34274c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: d */
    public static <T> b<T> m34275d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    /* JADX INFO: renamed from: e */
    public static <T> b<T> m34276e(C8497e0<T> c8497e0) {
        return new b<>(c8497e0, new C8497e0[0]);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: f */
    public static <T> b<T> m34277f(C8497e0<T> c8497e0, C8497e0<? super T>... c8497e0Arr) {
        return new b<>(c8497e0, c8497e0Arr);
    }

    /* JADX INFO: renamed from: l */
    public static <T> C8492c<T> m34278l(final T t8, Class<T> cls) {
        return m34279m(cls).m34295f(new InterfaceC8500g() { // from class: mf.a
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return C8492c.m34273b(t8, interfaceC8494d);
            }
        }).m34293d();
    }

    /* JADX INFO: renamed from: m */
    public static <T> b<T> m34279m(Class<T> cls) {
        return m34274c(cls).m34296g();
    }

    @SafeVarargs
    /* JADX INFO: renamed from: q */
    public static <T> C8492c<T> m34280q(final T t8, Class<T> cls, Class<? super T>... clsArr) {
        return m34275d(cls, clsArr).m34295f(new InterfaceC8500g() { // from class: mf.b
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return C8492c.m34272a(t8, interfaceC8494d);
            }
        }).m34293d();
    }

    /* JADX INFO: renamed from: g */
    public Set<C8511r> m34281g() {
        return this.f31201c;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC8500g<T> m34282h() {
        return this.f31204f;
    }

    /* JADX INFO: renamed from: i */
    public String m34283i() {
        return this.f31199a;
    }

    /* JADX INFO: renamed from: j */
    public Set<C8497e0<? super T>> m34284j() {
        return this.f31200b;
    }

    /* JADX INFO: renamed from: k */
    public Set<Class<?>> m34285k() {
        return this.f31205g;
    }

    /* JADX INFO: renamed from: n */
    public boolean m34286n() {
        return this.f31202d == 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m34287o() {
        return this.f31202d == 2;
    }

    /* JADX INFO: renamed from: p */
    public boolean m34288p() {
        return this.f31203e == 0;
    }

    /* JADX INFO: renamed from: r */
    public C8492c<T> m34289r(InterfaceC8500g<T> interfaceC8500g) {
        return new C8492c<>(this.f31199a, this.f31200b, this.f31201c, this.f31202d, this.f31203e, interfaceC8500g, this.f31205g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f31200b.toArray()) + ">{" + this.f31202d + ", type=" + this.f31203e + ", deps=" + Arrays.toString(this.f31201c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: mf.c$b */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        public String f31206a;

        /* JADX INFO: renamed from: b */
        public final Set<C8497e0<? super T>> f31207b;

        /* JADX INFO: renamed from: c */
        public final Set<C8511r> f31208c;

        /* JADX INFO: renamed from: d */
        public int f31209d;

        /* JADX INFO: renamed from: e */
        public int f31210e;

        /* JADX INFO: renamed from: f */
        public InterfaceC8500g<T> f31211f;

        /* JADX INFO: renamed from: g */
        public final Set<Class<?>> f31212g;

        /* JADX INFO: renamed from: b */
        public b<T> m34291b(C8511r c8511r) {
            C8495d0.m34313c(c8511r, "Null dependency");
            m34299j(c8511r.m34363b());
            this.f31208c.add(c8511r);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b<T> m34292c() {
            return m34298i(1);
        }

        /* JADX INFO: renamed from: d */
        public C8492c<T> m34293d() {
            C8495d0.m34314d(this.f31211f != null, "Missing required property: factory.");
            return new C8492c<>(this.f31206a, new HashSet(this.f31207b), new HashSet(this.f31208c), this.f31209d, this.f31210e, this.f31211f, this.f31212g);
        }

        /* JADX INFO: renamed from: e */
        public b<T> m34294e() {
            return m34298i(2);
        }

        /* JADX INFO: renamed from: f */
        public b<T> m34295f(InterfaceC8500g<T> interfaceC8500g) {
            this.f31211f = (InterfaceC8500g) C8495d0.m34313c(interfaceC8500g, "Null factory");
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final b<T> m34296g() {
            this.f31210e = 1;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b<T> m34297h(@NonNull String str) {
            this.f31206a = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final b<T> m34298i(int i10) {
            C8495d0.m34314d(this.f31209d == 0, "Instantiation type has already been set.");
            this.f31209d = i10;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final void m34299j(C8497e0<?> c8497e0) {
            C8495d0.m34311a(!this.f31207b.contains(c8497e0), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            this.f31206a = null;
            HashSet hashSet = new HashSet();
            this.f31207b = hashSet;
            this.f31208c = new HashSet();
            this.f31209d = 0;
            this.f31210e = 0;
            this.f31212g = new HashSet();
            C8495d0.m34313c(cls, "Null interface");
            hashSet.add(C8497e0.m34316b(cls));
            for (Class<? super T> cls2 : clsArr) {
                C8495d0.m34313c(cls2, "Null interface");
                this.f31207b.add(C8497e0.m34316b(cls2));
            }
        }

        @SafeVarargs
        public b(C8497e0<T> c8497e0, C8497e0<? super T>... c8497e0Arr) {
            this.f31206a = null;
            HashSet hashSet = new HashSet();
            this.f31207b = hashSet;
            this.f31208c = new HashSet();
            this.f31209d = 0;
            this.f31210e = 0;
            this.f31212g = new HashSet();
            C8495d0.m34313c(c8497e0, "Null interface");
            hashSet.add(c8497e0);
            for (C8497e0<? super T> c8497e1 : c8497e0Arr) {
                C8495d0.m34313c(c8497e1, "Null interface");
            }
            Collections.addAll(this.f31207b, c8497e0Arr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8492c(String str, Set<C8497e0<? super T>> set, Set<C8511r> set2, int i10, int i11, InterfaceC8500g<T> interfaceC8500g, Set<Class<?>> set3) {
        this.f31199a = str;
        this.f31200b = Collections.unmodifiableSet(set);
        this.f31201c = Collections.unmodifiableSet(set2);
        this.f31202d = i10;
        this.f31203e = i11;
        this.f31204f = interfaceC8500g;
        this.f31205g = Collections.unmodifiableSet(set3);
    }
}
