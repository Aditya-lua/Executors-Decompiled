package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2949q1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f10964a = m14069D();

    /* JADX INFO: renamed from: b */
    public static final Class<?> f10965b = C2908d.m13417b();

    /* JADX INFO: renamed from: c */
    public static final boolean f10966c = m14100o(Long.TYPE);

    /* JADX INFO: renamed from: d */
    public static final boolean f10967d = m14100o(Integer.TYPE);

    /* JADX INFO: renamed from: e */
    public static final e f10968e = m14067B();

    /* JADX INFO: renamed from: f */
    public static final boolean f10969f = m14085T();

    /* JADX INFO: renamed from: g */
    public static final boolean f10970g = m14084S();

    /* JADX INFO: renamed from: h */
    public static final long f10971h;

    /* JADX INFO: renamed from: i */
    public static final long f10972i;

    /* JADX INFO: renamed from: j */
    public static final long f10973j;

    /* JADX INFO: renamed from: k */
    public static final long f10974k;

    /* JADX INFO: renamed from: l */
    public static final long f10975l;

    /* JADX INFO: renamed from: m */
    public static final long f10976m;

    /* JADX INFO: renamed from: n */
    public static final long f10977n;

    /* JADX INFO: renamed from: o */
    public static final long f10978o;

    /* JADX INFO: renamed from: p */
    public static final long f10979p;

    /* JADX INFO: renamed from: q */
    public static final long f10980q;

    /* JADX INFO: renamed from: r */
    public static final long f10981r;

    /* JADX INFO: renamed from: s */
    public static final long f10982s;

    /* JADX INFO: renamed from: t */
    public static final long f10983t;

    /* JADX INFO: renamed from: u */
    public static final long f10984u;

    /* JADX INFO: renamed from: v */
    public static final int f10985v;

    /* JADX INFO: renamed from: w */
    public static final boolean f10986w;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q1$a */
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

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q1$b */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: c */
        public boolean mo14113c(Object obj, long j10) {
            return C2949q1.f10986w ? C2949q1.m14104s(obj, j10) : C2949q1.m14105t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: d */
        public byte mo14114d(Object obj, long j10) {
            return C2949q1.f10986w ? C2949q1.m14107v(obj, j10) : C2949q1.m14108w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: e */
        public double mo14115e(Object obj, long j10) {
            return Double.longBitsToDouble(m14126h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: f */
        public float mo14116f(Object obj, long j10) {
            return Float.intBitsToFloat(m14125g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: k */
        public void mo14117k(Object obj, long j10, boolean z10) {
            if (C2949q1.f10986w) {
                C2949q1.m14074I(obj, j10, z10);
            } else {
                C2949q1.m14075J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: l */
        public void mo14118l(Object obj, long j10, byte b) {
            if (C2949q1.f10986w) {
                C2949q1.m14077L(obj, j10, b);
            } else {
                C2949q1.m14078M(obj, j10, b);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: m */
        public void mo14119m(Object obj, long j10, double d10) {
            m14130p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: n */
        public void mo14120n(Object obj, long j10, float f10) {
            m14129o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: s */
        public boolean mo14121s() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q1$c */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: c */
        public boolean mo14113c(Object obj, long j10) {
            return C2949q1.f10986w ? C2949q1.m14104s(obj, j10) : C2949q1.m14105t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: d */
        public byte mo14114d(Object obj, long j10) {
            return C2949q1.f10986w ? C2949q1.m14107v(obj, j10) : C2949q1.m14108w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: e */
        public double mo14115e(Object obj, long j10) {
            return Double.longBitsToDouble(m14126h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: f */
        public float mo14116f(Object obj, long j10) {
            return Float.intBitsToFloat(m14125g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: k */
        public void mo14117k(Object obj, long j10, boolean z10) {
            if (C2949q1.f10986w) {
                C2949q1.m14074I(obj, j10, z10);
            } else {
                C2949q1.m14075J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: l */
        public void mo14118l(Object obj, long j10, byte b) {
            if (C2949q1.f10986w) {
                C2949q1.m14077L(obj, j10, b);
            } else {
                C2949q1.m14078M(obj, j10, b);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: m */
        public void mo14119m(Object obj, long j10, double d10) {
            m14130p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: n */
        public void mo14120n(Object obj, long j10, float f10) {
            m14129o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: s */
        public boolean mo14121s() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q1$d */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: c */
        public boolean mo14113c(Object obj, long j10) {
            return this.f10987a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: d */
        public byte mo14114d(Object obj, long j10) {
            return this.f10987a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: e */
        public double mo14115e(Object obj, long j10) {
            return this.f10987a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: f */
        public float mo14116f(Object obj, long j10) {
            return this.f10987a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: k */
        public void mo14117k(Object obj, long j10, boolean z10) {
            this.f10987a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: l */
        public void mo14118l(Object obj, long j10, byte b) {
            this.f10987a.putByte(obj, j10, b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: m */
        public void mo14119m(Object obj, long j10, double d10) {
            this.f10987a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: n */
        public void mo14120n(Object obj, long j10, float f10) {
            this.f10987a.putFloat(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: r */
        public boolean mo14122r() {
            if (!super.mo14122r()) {
                return false;
            }
            try {
                Class<?> cls = this.f10987a.getClass();
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
                C2949q1.m14072G(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2949q1.e
        /* JADX INFO: renamed from: s */
        public boolean mo14121s() {
            if (!super.mo14121s()) {
                return false;
            }
            try {
                Class<?> cls = this.f10987a.getClass();
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
                C2949q1.m14072G(th2);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q1$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public Unsafe f10987a;

        public e(Unsafe unsafe) {
            this.f10987a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public final int m14123a(Class<?> cls) {
            return this.f10987a.arrayBaseOffset(cls);
        }

        /* JADX INFO: renamed from: b */
        public final int m14124b(Class<?> cls) {
            return this.f10987a.arrayIndexScale(cls);
        }

        /* JADX INFO: renamed from: c */
        public abstract boolean mo14113c(Object obj, long j10);

        /* JADX INFO: renamed from: d */
        public abstract byte mo14114d(Object obj, long j10);

        /* JADX INFO: renamed from: e */
        public abstract double mo14115e(Object obj, long j10);

        /* JADX INFO: renamed from: f */
        public abstract float mo14116f(Object obj, long j10);

        /* JADX INFO: renamed from: g */
        public final int m14125g(Object obj, long j10) {
            return this.f10987a.getInt(obj, j10);
        }

        /* JADX INFO: renamed from: h */
        public final long m14126h(Object obj, long j10) {
            return this.f10987a.getLong(obj, j10);
        }

        /* JADX INFO: renamed from: i */
        public final Object m14127i(Object obj, long j10) {
            return this.f10987a.getObject(obj, j10);
        }

        /* JADX INFO: renamed from: j */
        public final long m14128j(Field field) {
            return this.f10987a.objectFieldOffset(field);
        }

        /* JADX INFO: renamed from: k */
        public abstract void mo14117k(Object obj, long j10, boolean z10);

        /* JADX INFO: renamed from: l */
        public abstract void mo14118l(Object obj, long j10, byte b);

        /* JADX INFO: renamed from: m */
        public abstract void mo14119m(Object obj, long j10, double d10);

        /* JADX INFO: renamed from: n */
        public abstract void mo14120n(Object obj, long j10, float f10);

        /* JADX INFO: renamed from: o */
        public final void m14129o(Object obj, long j10, int i10) {
            this.f10987a.putInt(obj, j10, i10);
        }

        /* JADX INFO: renamed from: p */
        public final void m14130p(Object obj, long j10, long j11) {
            this.f10987a.putLong(obj, j10, j11);
        }

        /* JADX INFO: renamed from: q */
        public final void m14131q(Object obj, long j10, Object obj2) {
            this.f10987a.putObject(obj, j10, obj2);
        }

        /* JADX INFO: renamed from: r */
        public boolean mo14122r() {
            Unsafe unsafe = this.f10987a;
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
                C2949q1.m14072G(th2);
                return false;
            }
        }

        /* JADX INFO: renamed from: s */
        public boolean mo14121s() {
            Unsafe unsafe = this.f10987a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return C2949q1.m14099n() != null;
            } catch (Throwable th2) {
                C2949q1.m14072G(th2);
                return false;
            }
        }
    }

    static {
        long jM14097l = m14097l(byte[].class);
        f10971h = jM14097l;
        f10972i = m14097l(boolean[].class);
        f10973j = m14098m(boolean[].class);
        f10974k = m14097l(int[].class);
        f10975l = m14098m(int[].class);
        f10976m = m14097l(long[].class);
        f10977n = m14098m(long[].class);
        f10978o = m14097l(float[].class);
        f10979p = m14098m(float[].class);
        f10980q = m14097l(double[].class);
        f10981r = m14098m(double[].class);
        f10982s = m14097l(Object[].class);
        f10983t = m14098m(Object[].class);
        f10984u = m14102q(m14099n());
        f10985v = (int) (jM14097l & 7);
        f10986w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static long m14066A(Object obj, long j10) {
        return f10968e.m14126h(obj, j10);
    }

    /* JADX INFO: renamed from: B */
    public static e m14067B() {
        Unsafe unsafe = f10964a;
        if (unsafe == null) {
            return null;
        }
        if (!C2908d.m13418c()) {
            return new d(unsafe);
        }
        if (f10966c) {
            return new c(unsafe);
        }
        if (f10967d) {
            return new b(unsafe);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static Object m14068C(Object obj, long j10) {
        return f10968e.m14127i(obj, j10);
    }

    /* JADX INFO: renamed from: D */
    public static Unsafe m14069D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m14070E() {
        return f10970g;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m14071F() {
        return f10969f;
    }

    /* JADX INFO: renamed from: G */
    public static void m14072G(Throwable th2) {
        Logger.getLogger(C2949q1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* JADX INFO: renamed from: H */
    public static void m14073H(Object obj, long j10, boolean z10) {
        f10968e.mo14117k(obj, j10, z10);
    }

    /* JADX INFO: renamed from: I */
    public static void m14074I(Object obj, long j10, boolean z10) {
        m14077L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: J */
    public static void m14075J(Object obj, long j10, boolean z10) {
        m14078M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: K */
    public static void m14076K(byte[] bArr, long j10, byte b10) {
        f10968e.mo14118l(bArr, f10971h + j10, b10);
    }

    /* JADX INFO: renamed from: L */
    public static void m14077L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iM14111z = m14111z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        m14081P(obj, j11, ((255 & b10) << i10) | (iM14111z & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: M */
    public static void m14078M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m14081P(obj, j11, ((255 & b10) << i10) | (m14111z(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: N */
    public static void m14079N(Object obj, long j10, double d10) {
        f10968e.mo14119m(obj, j10, d10);
    }

    /* JADX INFO: renamed from: O */
    public static void m14080O(Object obj, long j10, float f10) {
        f10968e.mo14120n(obj, j10, f10);
    }

    /* JADX INFO: renamed from: P */
    public static void m14081P(Object obj, long j10, int i10) {
        f10968e.m14129o(obj, j10, i10);
    }

    /* JADX INFO: renamed from: Q */
    public static void m14082Q(Object obj, long j10, long j11) {
        f10968e.m14130p(obj, j10, j11);
    }

    /* JADX INFO: renamed from: R */
    public static void m14083R(Object obj, long j10, Object obj2) {
        f10968e.m14131q(obj, j10, obj2);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m14084S() {
        e eVar = f10968e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo14122r();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m14085T() {
        e eVar = f10968e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo14121s();
    }

    /* JADX INFO: renamed from: k */
    public static <T> T m14096k(Class<T> cls) {
        try {
            return (T) f10964a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m14097l(Class<?> cls) {
        if (f10970g) {
            return f10968e.m14123a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public static int m14098m(Class<?> cls) {
        if (f10970g) {
            return f10968e.m14124b(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static Field m14099n() {
        Field fieldM14101p;
        if (C2908d.m13418c() && (fieldM14101p = m14101p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM14101p;
        }
        Field fieldM14101p2 = m14101p(Buffer.class, "address");
        if (fieldM14101p2 == null || fieldM14101p2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM14101p2;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m14100o(Class<?> cls) {
        if (!C2908d.m13418c()) {
            return false;
        }
        try {
            Class<?> cls2 = f10965b;
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

    /* JADX INFO: renamed from: p */
    public static Field m14101p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static long m14102q(Field field) {
        e eVar;
        if (field == null || (eVar = f10968e) == null) {
            return -1L;
        }
        return eVar.m14128j(field);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m14103r(Object obj, long j10) {
        return f10968e.mo14113c(obj, j10);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m14104s(Object obj, long j10) {
        return m14107v(obj, j10) != 0;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m14105t(Object obj, long j10) {
        return m14108w(obj, j10) != 0;
    }

    /* JADX INFO: renamed from: u */
    public static byte m14106u(byte[] bArr, long j10) {
        return f10968e.mo14114d(bArr, f10971h + j10);
    }

    /* JADX INFO: renamed from: v */
    public static byte m14107v(Object obj, long j10) {
        return (byte) ((m14111z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: w */
    public static byte m14108w(Object obj, long j10) {
        return (byte) ((m14111z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: x */
    public static double m14109x(Object obj, long j10) {
        return f10968e.mo14115e(obj, j10);
    }

    /* JADX INFO: renamed from: y */
    public static float m14110y(Object obj, long j10) {
        return f10968e.mo14116f(obj, j10);
    }

    /* JADX INFO: renamed from: z */
    public static int m14111z(Object obj, long j10) {
        return f10968e.m14125g(obj, j10);
    }
}
