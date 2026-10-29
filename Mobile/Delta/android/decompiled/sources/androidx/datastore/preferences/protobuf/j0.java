package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements h1 {
    public static final q0 b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f2216a;

    public class a implements q0 {
        @Override // androidx.datastore.preferences.protobuf.q0
        public p0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2217a;

        static {
            int[] iArr = new int[b1.values().length];
            f2217a = iArr;
            try {
                iArr[b1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q0[] f2218a;

        public c(q0... q0VarArr) {
            this.f2218a = q0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public p0 a(Class<?> cls) {
            for (q0 q0Var : this.f2218a) {
                if (q0Var.b(cls)) {
                    return q0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public boolean b(Class<?> cls) {
            for (q0 q0Var : this.f2218a) {
                if (q0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j0() {
        this(c());
    }

    public static boolean b(p0 p0Var) {
        return b.f2217a[p0Var.c().ordinal()] != 1;
    }

    public static q0 c() {
        return new c(w.c(), d());
    }

    public static q0 d() {
        if (c1.f2152d) {
            return b;
        }
        try {
            return (q0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    public static <T> g1<T> e(Class<T> cls, p0 p0Var) {
        if (f(cls)) {
            return u0.O(cls, p0Var, y0.b(), h0.b(), i1.L(), b(p0Var) ? r.b() : null, o0.b());
        }
        w0 w0VarA = y0.a();
        p<?> pVarA = null;
        f0 f0VarA = h0.a();
        n1<?, ?> n1VarK = i1.K();
        if (b(p0Var)) {
            pVarA = r.a();
        }
        return u0.O(cls, p0Var, w0VarA, f0VarA, n1VarK, pVarA, o0.a());
    }

    public static boolean f(Class<?> cls) {
        return c1.f2152d || x.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.h1
    public <T> g1<T> a(Class<T> cls) {
        i1.H(cls);
        p0 p0VarA = this.f2216a.a(cls);
        if (p0VarA.a()) {
            return f(cls) ? v0.l(i1.L(), r.b(), p0VarA.b()) : v0.l(i1.K(), r.a(), p0VarA.b());
        }
        return e(cls, p0VarA);
    }

    public j0(q0 q0Var) {
        this.f2216a = (q0) z.b(q0Var, "messageInfoFactory");
    }
}
