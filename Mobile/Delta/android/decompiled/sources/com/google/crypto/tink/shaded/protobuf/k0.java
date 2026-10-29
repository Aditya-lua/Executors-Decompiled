package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements h1 {
    public static final r0 b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f8500a;

    public class a implements r0 {
        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public q0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8501a;

        static {
            int[] iArr = new int[b1.values().length];
            f8501a = iArr;
            try {
                iArr[b1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0[] f8502a;

        public c(r0... r0VarArr) {
            this.f8502a = r0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public q0 a(Class<?> cls) {
            for (r0 r0Var : this.f8502a) {
                if (r0Var.b(cls)) {
                    return r0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public boolean b(Class<?> cls) {
            for (r0 r0Var : this.f8502a) {
                if (r0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public k0() {
        this(c());
    }

    public static boolean b(q0 q0Var) {
        return b.f8501a[q0Var.c().ordinal()] != 1;
    }

    public static r0 c() {
        return new c(x.c(), d());
    }

    public static r0 d() {
        if (c1.f8413d) {
            return b;
        }
        try {
            return (r0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    public static <T> g1<T> e(Class<T> cls, q0 q0Var) {
        if (f(cls)) {
            return v0.S(cls, q0Var, z0.b(), i0.b(), i1.L(), b(q0Var) ? s.b() : null, p0.b());
        }
        x0 x0VarA = z0.a();
        q<?> qVarA = null;
        g0 g0VarA = i0.a();
        n1<?, ?> n1VarK = i1.K();
        if (b(q0Var)) {
            qVarA = s.a();
        }
        return v0.S(cls, q0Var, x0VarA, g0VarA, n1VarK, qVarA, p0.a());
    }

    public static boolean f(Class<?> cls) {
        return c1.f8413d || y.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public <T> g1<T> a(Class<T> cls) {
        i1.H(cls);
        q0 q0VarA = this.f8500a.a(cls);
        if (q0VarA.a()) {
            return f(cls) ? w0.m(i1.L(), s.b(), q0VarA.b()) : w0.m(i1.K(), s.a(), q0VarA.b());
        }
        return e(cls, q0VarA);
    }

    public k0(r0 r0Var) {
        this.f8500a = (r0) a0.b(r0Var, "messageInfoFactory");
    }
}
