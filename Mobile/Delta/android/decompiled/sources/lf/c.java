package lf;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23130a;
    public final Set<e0<? super T>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<r> f23131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g<T> f23134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f23135g;

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
        return m(cls).f(new g() { // from class: lf.a
            @Override // lf.g
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
        return d(cls, clsArr).f(new g() { // from class: lf.b
            @Override // lf.g
            public final Object create(d dVar) {
                return c.a(t8, dVar);
            }
        }).d();
    }

    public Set<r> g() {
        return this.f23131c;
    }

    public g<T> h() {
        return this.f23134f;
    }

    public String i() {
        return this.f23130a;
    }

    public Set<e0<? super T>> j() {
        return this.b;
    }

    public Set<Class<?>> k() {
        return this.f23135g;
    }

    public boolean n() {
        return this.f23132d == 1;
    }

    public boolean o() {
        return this.f23132d == 2;
    }

    public boolean p() {
        return this.f23133e == 0;
    }

    public c<T> r(g<T> gVar) {
        return new c<>(this.f23130a, this.b, this.f23131c, this.f23132d, this.f23133e, gVar, this.f23135g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.f23132d + ", type=" + this.f23133e + ", deps=" + Arrays.toString(this.f23131c.toArray()) + "}";
    }

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f23136a;
        public final Set<e0<? super T>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<r> f23137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g<T> f23140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set<Class<?>> f23141g;

        public b<T> b(r rVar) {
            d0.c(rVar, "Null dependency");
            j(rVar.b());
            this.f23137c.add(rVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            d0.d(this.f23140f != null, "Missing required property: factory.");
            return new c<>(this.f23136a, new HashSet(this.b), new HashSet(this.f23137c), this.f23138d, this.f23139e, this.f23140f, this.f23141g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(g<T> gVar) {
            this.f23140f = (g) d0.c(gVar, "Null factory");
            return this;
        }

        public final b<T> g() {
            this.f23139e = 1;
            return this;
        }

        public b<T> h(@NonNull String str) {
            this.f23136a = str;
            return this;
        }

        public final b<T> i(int i10) {
            d0.d(this.f23138d == 0, "Instantiation type has already been set.");
            this.f23138d = i10;
            return this;
        }

        public final void j(e0<?> e0Var) {
            d0.a(!this.b.contains(e0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            this.f23136a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.f23137c = new HashSet();
            this.f23138d = 0;
            this.f23139e = 0;
            this.f23141g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(e0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
                this.b.add(e0.b(cls2));
            }
        }

        @SafeVarargs
        public b(e0<T> e0Var, e0<? super T>... e0VarArr) {
            this.f23136a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.f23137c = new HashSet();
            this.f23138d = 0;
            this.f23139e = 0;
            this.f23141g = new HashSet();
            d0.c(e0Var, "Null interface");
            hashSet.add(e0Var);
            for (e0<? super T> e0Var2 : e0VarArr) {
                d0.c(e0Var2, "Null interface");
            }
            Collections.addAll(this.b, e0VarArr);
        }
    }

    public c(String str, Set<e0<? super T>> set, Set<r> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f23130a = str;
        this.b = Collections.unmodifiableSet(set);
        this.f23131c = Collections.unmodifiableSet(set2);
        this.f23132d = i10;
        this.f23133e = i11;
        this.f23134f = gVar;
        this.f23135g = Collections.unmodifiableSet(set3);
    }
}
