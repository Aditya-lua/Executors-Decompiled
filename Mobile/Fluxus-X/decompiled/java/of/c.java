package of;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28067a;
    public final Set<e0<? super T>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<r> f28068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g<T> f28071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f28072g;

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
        return m(cls).f(new g() { // from class: of.a
            @Override // of.g
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
        return d(cls, clsArr).f(new g() { // from class: of.b
            @Override // of.g
            public final Object create(d dVar) {
                return c.a(t8, dVar);
            }
        }).d();
    }

    public Set<r> g() {
        return this.f28068c;
    }

    public g<T> h() {
        return this.f28071f;
    }

    public String i() {
        return this.f28067a;
    }

    public Set<e0<? super T>> j() {
        return this.b;
    }

    public Set<Class<?>> k() {
        return this.f28072g;
    }

    public boolean n() {
        return this.f28069d == 1;
    }

    public boolean o() {
        return this.f28069d == 2;
    }

    public boolean p() {
        return this.f28070e == 0;
    }

    public c<T> r(g<T> gVar) {
        return new c<>(this.f28067a, this.b, this.f28068c, this.f28069d, this.f28070e, gVar, this.f28072g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.f28069d + ", type=" + this.f28070e + ", deps=" + Arrays.toString(this.f28068c.toArray()) + "}";
    }

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28073a;
        public final Set<e0<? super T>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<r> f28074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g<T> f28077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set<Class<?>> f28078g;

        public b<T> b(r rVar) {
            d0.c(rVar, "Null dependency");
            j(rVar.b());
            this.f28074c.add(rVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            d0.d(this.f28077f != null, "Missing required property: factory.");
            return new c<>(this.f28073a, new HashSet(this.b), new HashSet(this.f28074c), this.f28075d, this.f28076e, this.f28077f, this.f28078g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(g<T> gVar) {
            this.f28077f = (g) d0.c(gVar, "Null factory");
            return this;
        }

        public final b<T> g() {
            this.f28076e = 1;
            return this;
        }

        public b<T> h(@NonNull String str) {
            this.f28073a = str;
            return this;
        }

        public final b<T> i(int i10) {
            d0.d(this.f28075d == 0, "Instantiation type has already been set.");
            this.f28075d = i10;
            return this;
        }

        public final void j(e0<?> e0Var) {
            d0.a(!this.b.contains(e0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            this.f28073a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.f28074c = new HashSet();
            this.f28075d = 0;
            this.f28076e = 0;
            this.f28078g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(e0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
                this.b.add(e0.b(cls2));
            }
        }

        @SafeVarargs
        public b(e0<T> e0Var, e0<? super T>... e0VarArr) {
            this.f28073a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.f28074c = new HashSet();
            this.f28075d = 0;
            this.f28076e = 0;
            this.f28078g = new HashSet();
            d0.c(e0Var, "Null interface");
            hashSet.add(e0Var);
            for (e0<? super T> e0Var2 : e0VarArr) {
                d0.c(e0Var2, "Null interface");
            }
            Collections.addAll(this.b, e0VarArr);
        }
    }

    public c(String str, Set<e0<? super T>> set, Set<r> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f28067a = str;
        this.b = Collections.unmodifiableSet(set);
        this.f28068c = Collections.unmodifiableSet(set2);
        this.f28069d = i10;
        this.f28070e = i11;
        this.f28071f = gVar;
        this.f28072g = Collections.unmodifiableSet(set3);
    }
}
