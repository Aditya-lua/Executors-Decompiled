package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0872q1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f2971a = m3960A();

    /* JADX INFO: renamed from: b */
    public static final Class<?> f2972b = C0831d.m3369b();

    /* JADX INFO: renamed from: c */
    public static final boolean f2973c = m3989m(Long.TYPE);

    /* JADX INFO: renamed from: d */
    public static final boolean f2974d = m3989m(Integer.TYPE);

    /* JADX INFO: renamed from: e */
    public static final e f2975e = m4001y();

    /* JADX INFO: renamed from: f */
    public static final boolean f2976f = m3976Q();

    /* JADX INFO: renamed from: g */
    public static final boolean f2977g = m3975P();

    /* JADX INFO: renamed from: h */
    public static final long f2978h;

    /* JADX INFO: renamed from: i */
    public static final long f2979i;

    /* JADX INFO: renamed from: j */
    public static final long f2980j;

    /* JADX INFO: renamed from: k */
    public static final long f2981k;

    /* JADX INFO: renamed from: l */
    public static final long f2982l;

    /* JADX INFO: renamed from: m */
    public static final long f2983m;

    /* JADX INFO: renamed from: n */
    public static final long f2984n;

    /* JADX INFO: renamed from: o */
    public static final long f2985o;

    /* JADX INFO: renamed from: p */
    public static final long f2986p;

    /* JADX INFO: renamed from: q */
    public static final long f2987q;

    /* JADX INFO: renamed from: r */
    public static final long f2988r;

    /* JADX INFO: renamed from: s */
    public static final long f2989s;

    /* JADX INFO: renamed from: t */
    public static final long f2990t;

    /* JADX INFO: renamed from: u */
    public static final long f2991u;

    /* JADX INFO: renamed from: v */
    public static final int f2992v;

    /* JADX INFO: renamed from: w */
    public static final boolean f2993w;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q1$a */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q1$b */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: c */
        public boolean mo4004c(Object obj, long j10) {
            return C0872q1.f2993w ? C0872q1.m3993q(obj, j10) : C0872q1.m3994r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: d */
        public double mo4005d(Object obj, long j10) {
            return Double.longBitsToDouble(m4016g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: e */
        public float mo4006e(Object obj, long j10) {
            return Float.intBitsToFloat(m4015f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: j */
        public void mo4007j(Object obj, long j10, boolean z10) {
            if (C0872q1.f2993w) {
                C0872q1.m3965F(obj, j10, z10);
            } else {
                C0872q1.m3966G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: k */
        public void mo4008k(Object obj, long j10, byte b) {
            if (C0872q1.f2993w) {
                C0872q1.m3968I(obj, j10, b);
            } else {
                C0872q1.m3969J(obj, j10, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: l */
        public void mo4009l(Object obj, long j10, double d10) {
            m4020o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: m */
        public void mo4010m(Object obj, long j10, float f10) {
            m4019n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: r */
        public boolean mo4011r() {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q1$c */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: c */
        public boolean mo4004c(Object obj, long j10) {
            return C0872q1.f2993w ? C0872q1.m3993q(obj, j10) : C0872q1.m3994r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: d */
        public double mo4005d(Object obj, long j10) {
            return Double.longBitsToDouble(m4016g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: e */
        public float mo4006e(Object obj, long j10) {
            return Float.intBitsToFloat(m4015f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: j */
        public void mo4007j(Object obj, long j10, boolean z10) {
            if (C0872q1.f2993w) {
                C0872q1.m3965F(obj, j10, z10);
            } else {
                C0872q1.m3966G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: k */
        public void mo4008k(Object obj, long j10, byte b) {
            if (C0872q1.f2993w) {
                C0872q1.m3968I(obj, j10, b);
            } else {
                C0872q1.m3969J(obj, j10, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: l */
        public void mo4009l(Object obj, long j10, double d10) {
            m4020o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: m */
        public void mo4010m(Object obj, long j10, float f10) {
            m4019n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: r */
        public boolean mo4011r() {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q1$d */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: c */
        public boolean mo4004c(Object obj, long j10) {
            return this.f2994a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: d */
        public double mo4005d(Object obj, long j10) {
            return this.f2994a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: e */
        public float mo4006e(Object obj, long j10) {
            return this.f2994a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: j */
        public void mo4007j(Object obj, long j10, boolean z10) {
            this.f2994a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: k */
        public void mo4008k(Object obj, long j10, byte b) {
            this.f2994a.putByte(obj, j10, b);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: l */
        public void mo4009l(Object obj, long j10, double d10) {
            this.f2994a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: m */
        public void mo4010m(Object obj, long j10, float f10) {
            this.f2994a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: q */
        public boolean mo4012q() {
            if (!super.mo4012q()) {
                return false;
            }
            try {
                Class<?> cls = this.f2994a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                C0872q1.m3963D(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0872q1.e
        /* JADX INFO: renamed from: r */
        public boolean mo4011r() {
            if (!super.mo4011r()) {
                return false;
            }
            try {
                Class<?> cls = this.f2994a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                C0872q1.m3963D(th2);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q1$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public Unsafe f2994a;

        public e(Unsafe unsafe) {
            this.f2994a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public final int m4013a(Class<?> cls) {
            return this.f2994a.arrayBaseOffset(cls);
        }

        /* JADX INFO: renamed from: b */
        public final int m4014b(Class<?> cls) {
            return this.f2994a.arrayIndexScale(cls);
        }

        /* JADX INFO: renamed from: c */
        public abstract boolean mo4004c(Object obj, long j10);

        /* JADX INFO: renamed from: d */
        public abstract double mo4005d(Object obj, long j10);

        /* JADX INFO: renamed from: e */
        public abstract float mo4006e(Object obj, long j10);

        /* JADX INFO: renamed from: f */
        public final int m4015f(Object obj, long j10) {
            return this.f2994a.getInt(obj, j10);
        }

        /* JADX INFO: renamed from: g */
        public final long m4016g(Object obj, long j10) {
            return this.f2994a.getLong(obj, j10);
        }

        /* JADX INFO: renamed from: h */
        public final Object m4017h(Object obj, long j10) {
            return this.f2994a.getObject(obj, j10);
        }

        /* JADX INFO: renamed from: i */
        public final long m4018i(Field field) {
            return this.f2994a.objectFieldOffset(field);
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo4007j(Object obj, long j10, boolean z10);

        /* JADX INFO: renamed from: k */
        public abstract void mo4008k(Object obj, long j10, byte b);

        /* JADX INFO: renamed from: l */
        public abstract void mo4009l(Object obj, long j10, double d10);

        /* JADX INFO: renamed from: m */
        public abstract void mo4010m(Object obj, long j10, float f10);

        /* JADX INFO: renamed from: n */
        public final void m4019n(Object obj, long j10, int i10) {
            this.f2994a.putInt(obj, j10, i10);
        }

        /* JADX INFO: renamed from: o */
        public final void m4020o(Object obj, long j10, long j11) {
            this.f2994a.putLong(obj, j10, j11);
        }

        /* JADX INFO: renamed from: p */
        public final void m4021p(Object obj, long j10, Object obj2) {
            this.f2994a.putObject(obj, j10, obj2);
        }

        /* JADX INFO: renamed from: q */
        public boolean mo4012q() {
            Unsafe unsafe = this.f2994a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                C0872q1.m3963D(th2);
                return false;
            }
        }

        /* JADX INFO: renamed from: r */
        public boolean mo4011r() {
            Unsafe unsafe = this.f2994a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return C0872q1.m3988l() != null;
            } catch (Throwable th2) {
                C0872q1.m3963D(th2);
                return false;
            }
        }
    }

    static {
        long jM3986j = m3986j(byte[].class);
        f2978h = jM3986j;
        f2979i = m3986j(boolean[].class);
        f2980j = m3987k(boolean[].class);
        f2981k = m3986j(int[].class);
        f2982l = m3987k(int[].class);
        f2983m = m3986j(long[].class);
        f2984n = m3987k(long[].class);
        f2985o = m3986j(float[].class);
        f2986p = m3987k(float[].class);
        f2987q = m3986j(double[].class);
        f2988r = m3987k(double[].class);
        f2989s = m3986j(Object[].class);
        f2990t = m3987k(Object[].class);
        f2991u = m3991o(m3988l());
        f2992v = (int) (jM3986j & 7);
        f2993w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static Unsafe m3960A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m3961B() {
        return f2977g;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m3962C() {
        return f2976f;
    }

    /* JADX INFO: renamed from: D */
    public static void m3963D(Throwable th2) {
        Logger.getLogger(C0872q1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* JADX INFO: renamed from: E */
    public static void m3964E(Object obj, long j10, boolean z10) {
        f2975e.mo4007j(obj, j10, z10);
    }

    /* JADX INFO: renamed from: F */
    public static void m3965F(Object obj, long j10, boolean z10) {
        m3968I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: G */
    public static void m3966G(Object obj, long j10, boolean z10) {
        m3969J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: H */
    public static void m3967H(byte[] bArr, long j10, byte b10) {
        f2975e.mo4008k(bArr, f2978h + j10, b10);
    }

    /* JADX INFO: renamed from: I */
    public static void m3968I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iM3999w = m3999w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        m3972M(obj, j11, ((255 & b10) << i10) | (iM3999w & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: J */
    public static void m3969J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m3972M(obj, j11, ((255 & b10) << i10) | (m3999w(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: K */
    public static void m3970K(Object obj, long j10, double d10) {
        f2975e.mo4009l(obj, j10, d10);
    }

    /* JADX INFO: renamed from: L */
    public static void m3971L(Object obj, long j10, float f10) {
        f2975e.mo4010m(obj, j10, f10);
    }

    /* JADX INFO: renamed from: M */
    public static void m3972M(Object obj, long j10, int i10) {
        f2975e.m4019n(obj, j10, i10);
    }

    /* JADX INFO: renamed from: N */
    public static void m3973N(Object obj, long j10, long j11) {
        f2975e.m4020o(obj, j10, j11);
    }

    /* JADX INFO: renamed from: O */
    public static void m3974O(Object obj, long j10, Object obj2) {
        f2975e.m4021p(obj, j10, obj2);
    }

    /* JADX INFO: renamed from: P */
    public static boolean m3975P() {
        e eVar = f2975e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo4012q();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m3976Q() {
        e eVar = f2975e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo4011r();
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m3985i(Class<T> cls) {
        try {
            return (T) f2971a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m3986j(Class<?> cls) {
        if (f2977g) {
            return f2975e.m4013a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public static int m3987k(Class<?> cls) {
        if (f2977g) {
            return f2975e.m4014b(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static Field m3988l() {
        Field fieldM3990n;
        if (C0831d.m3370c() && (fieldM3990n = m3990n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM3990n;
        }
        Field fieldM3990n2 = m3990n(Buffer.class, "address");
        if (fieldM3990n2 == null || fieldM3990n2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM3990n2;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3989m(Class<?> cls) {
        if (!C0831d.m3370c()) {
            return false;
        }
        try {
            Class<?> cls2 = f2972b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Field m3990n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static long m3991o(Field field) {
        e eVar;
        if (field == null || (eVar = f2975e) == null) {
            return -1L;
        }
        return eVar.m4018i(field);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m3992p(Object obj, long j10) {
        return f2975e.mo4004c(obj, j10);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3993q(Object obj, long j10) {
        return m3995s(obj, j10) != 0;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m3994r(Object obj, long j10) {
        return m3996t(obj, j10) != 0;
    }

    /* JADX INFO: renamed from: s */
    public static byte m3995s(Object obj, long j10) {
        return (byte) ((m3999w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: t */
    public static byte m3996t(Object obj, long j10) {
        return (byte) ((m3999w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: u */
    public static double m3997u(Object obj, long j10) {
        return f2975e.mo4005d(obj, j10);
    }

    /* JADX INFO: renamed from: v */
    public static float m3998v(Object obj, long j10) {
        return f2975e.mo4006e(obj, j10);
    }

    /* JADX INFO: renamed from: w */
    public static int m3999w(Object obj, long j10) {
        return f2975e.m4015f(obj, j10);
    }

    /* JADX INFO: renamed from: x */
    public static long m4000x(Object obj, long j10) {
        return f2975e.m4016g(obj, j10);
    }

    /* JADX INFO: renamed from: y */
    public static e m4001y() {
        Unsafe unsafe = f2971a;
        if (unsafe == null) {
            return null;
        }
        if (!C0831d.m3370c()) {
            return new d(unsafe);
        }
        if (f2973c) {
            return new c(unsafe);
        }
        if (f2974d) {
            return new b(unsafe);
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static Object m4002z(Object obj, long j10) {
        return f2975e.m4017h(obj, j10);
    }
}
