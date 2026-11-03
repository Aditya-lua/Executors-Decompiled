package mf;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24704a;
    public final Set<e0<? super T>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<r> f24705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g<T> f24708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f24709g;

    public static /* synthetic */ Object a(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, d dVar) {
        return obj;
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> b<T> e(e0<T> e0Var) {
        return new b<>(e0Var, new e0[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(e0<T> e0Var, e0<? super T>... e0VarArr) {
        return new b<>(e0Var, e0VarArr);
    }

    public static <T> c<T> l(final T t8, Class<T> cls) {
        return m(cls).f(new g() { // from class: mf.a
            @Override // mf.g
            public final Object create(d dVar) {
                return c.b(t8, dVar);
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return c(cls).g();
    }

    @SafeVarargs
    public static <T> c<T> q(final T t8, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new g() { // from class: mf.b
            @Override // mf.g
            public final Object create(d dVar) {
                return c.a(t8, dVar);
            }
        }).d();
    }

    public Set<r> g() {
        return this.f24705c;
    }

    public g<T> h() {
        return this.f24708f;
    }

    public String i() {
        return this.f24704a;
    }

    public Set<e0<? super T>> j() {
        return this.b;
    }

    public Set<Class<?>> k() {
        return this.f24709g;
    }

    public boolean n() {
        return this.f24706d == 1;
    }

    public boolean o() {
        return this.f24706d == 2;
    }

    public boolean p() {
        return this.f24707e == 0;
    }

    public c<T> r(g<T> gVar) {
        return new c<>(this.f24704a, this.b, this.f24705c, this.f24706d, this.f24707e, gVar, this.f24709g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.f24706d + ", type=" + this.f24707e + ", deps=" + Arrays.toString(this.f24705c.toArray()) + "}";
    }

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24710a;
        public final Set<e0<? super T>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<r> f24711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g<T> f24714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set<Class<?>> f24715g;

        public b<T> b(r rVar) {
            d0.c(rVar, "Null dependency");
            j(rVar.b());
            this.f24711c.add(rVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            d0.d(this.f24714f != null, "Missing required property: factory.");
            return new c<>(this.f24710a, new HashSet(this.b), new HashSet(this.f24711c), this.f24712d, this.f24713e, this.f24714f, this.f24715g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(g<T> gVar) {
            this.f24714f = (g) d0.c(gVar, "Null factory");
            return this;
        }

        public final b<T> g() {
            this.f24713e = 1;
            return this;
        }

        public b<T> h(@NonNull String str) {
            this.f24710a = str;
            return this;
        }

        public final b<T> i(int i10) {
            d0.d(this.f24712d == 0, "Instantiation type has already been set.");
            this.f24712d = i10;
            return this;
        }

        public final void j(e0<?> e0Var) {
            d0.a(!this.b.contains(e0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            this.f24710a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.f24711c = new HashSet();
            this.f24712d = 0;
            this.f24713e = 0;
            this.f24715g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(e0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
                this.b.add(e0.b(cls2));
            }
        }

        @SafeVarargs
        public b(e0<T> e0Var, e0<? super T>... e0VarArr) {
            this.f24710a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.f24711c = new HashSet();
            this.f24712d = 0;
            this.f24713e = 0;
            this.f24715g = new HashSet();
            d0.c(e0Var, "Null interface");
            hashSet.add(e0Var);
            for (e0<? super T> e0Var2 : e0VarArr) {
                d0.c(e0Var2, "Null interface");
            }
            Collections.addAll(this.b, e0VarArr);
        }
    }

    public c(String str, Set<e0<? super T>> set, Set<r> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f24704a = str;
        this.b = Collections.unmodifiableSet(set);
        this.f24705c = Collections.unmodifiableSet(set2);
        this.f24706d = i10;
        this.f24707e = i11;
        this.f24708f = gVar;
        this.f24709g = Collections.unmodifiableSet(set3);
    }
}
