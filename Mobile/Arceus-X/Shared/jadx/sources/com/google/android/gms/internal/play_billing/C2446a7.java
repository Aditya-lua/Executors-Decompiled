package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2446a7 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f8915a;

    /* JADX INFO: renamed from: b */
    public static final Class f8916b;

    /* JADX INFO: renamed from: c */
    public static final boolean f8917c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC2720z6 f8918d;

    /* JADX INFO: renamed from: e */
    public static final boolean f8919e;

    /* JADX INFO: renamed from: f */
    public static final long f8920f;

    /* JADX INFO: renamed from: g */
    public static final boolean f8921g;

    static {
        boolean z10;
        AbstractC2720z6 abstractC2720z6;
        Unsafe unsafeM11247k = m11247k();
        f8915a = unsafeM11247k;
        int i10 = C2486e3.f8956a;
        f8916b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM11262z = m11262z(cls);
        f8917c = zM11262z;
        Class cls2 = Integer.TYPE;
        boolean zM11262z2 = m11262z(cls2);
        AbstractC2720z6 c2698x6 = null;
        if (unsafeM11247k != null) {
            if (zM11262z) {
                c2698x6 = new C2709y6(unsafeM11247k);
            } else if (zM11262z2) {
                c2698x6 = new C2698x6(unsafeM11247k);
            }
        }
        f8918d = c2698x6;
        if (c2698x6 != null) {
            try {
                Class<?> cls3 = c2698x6.f9434a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                m11237a();
            } catch (Throwable th2) {
                m11248l(th2);
            }
        }
        AbstractC2720z6 abstractC2720z7 = f8918d;
        if (abstractC2720z7 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = abstractC2720z7.f9434a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z10 = true;
            } catch (Throwable th3) {
                m11248l(th3);
                z10 = false;
            }
        }
        f8919e = z10;
        f8920f = m11235C(byte[].class);
        m11235C(boolean[].class);
        m11236D(boolean[].class);
        m11235C(int[].class);
        m11236D(int[].class);
        m11235C(long[].class);
        m11236D(long[].class);
        m11235C(float[].class);
        m11236D(float[].class);
        m11235C(double[].class);
        m11236D(double[].class);
        m11235C(Object[].class);
        m11236D(Object[].class);
        Field fieldM11237a = m11237a();
        if (fieldM11237a != null && (abstractC2720z6 = f8918d) != null) {
            abstractC2720z6.f9434a.objectFieldOffset(fieldM11237a);
        }
        f8921g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m11233A(Object obj, long j10) {
        return f8918d.mo11832g(obj, j10);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m11234B() {
        return f8919e;
    }

    /* JADX INFO: renamed from: C */
    public static int m11235C(Class cls) {
        if (f8919e) {
            return f8918d.f9434a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public static int m11236D(Class cls) {
        if (f8919e) {
            return f8918d.f9434a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static Field m11237a() {
        int i10 = C2486e3.f8956a;
        Field fieldM11238b = m11238b(Buffer.class, "effectiveDirectAddress");
        if (fieldM11238b != null) {
            return fieldM11238b;
        }
        Field fieldM11238b2 = m11238b(Buffer.class, "address");
        if (fieldM11238b2 == null || fieldM11238b2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM11238b2;
    }

    /* JADX INFO: renamed from: b */
    public static Field m11238b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11239c(Object obj, long j10, byte b) {
        Unsafe unsafe = f8918d.f9434a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: renamed from: d */
    public static void m11240d(Object obj, long j10, byte b) {
        Unsafe unsafe = f8918d.f9434a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: e */
    public static double m11241e(Object obj, long j10) {
        return f8918d.mo11826a(obj, j10);
    }

    /* JADX INFO: renamed from: f */
    public static float m11242f(Object obj, long j10) {
        return f8918d.mo11827b(obj, j10);
    }

    /* JADX INFO: renamed from: g */
    public static int m11243g(Object obj, long j10) {
        return f8918d.f9434a.getInt(obj, j10);
    }

    /* JADX INFO: renamed from: h */
    public static long m11244h(Object obj, long j10) {
        return f8918d.f9434a.getLong(obj, j10);
    }

    /* JADX INFO: renamed from: i */
    public static Object m11245i(Class cls) {
        try {
            return f8915a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static Object m11246j(Object obj, long j10) {
        return f8918d.f9434a.getObject(obj, j10);
    }

    /* JADX INFO: renamed from: k */
    public static Unsafe m11247k() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C2687w6());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(C2446a7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m11248l(Throwable th2) {
        Logger.getLogger(C2446a7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* JADX INFO: renamed from: q */
    public static void m11253q(Object obj, long j10, boolean z10) {
        f8918d.mo11828c(obj, j10, z10);
    }

    /* JADX INFO: renamed from: r */
    public static void m11254r(byte[] bArr, long j10, byte b) {
        f8918d.mo11829d(bArr, f8920f + j10, b);
    }

    /* JADX INFO: renamed from: s */
    public static void m11255s(Object obj, long j10, double d10) {
        f8918d.mo11830e(obj, j10, d10);
    }

    /* JADX INFO: renamed from: t */
    public static void m11256t(Object obj, long j10, float f10) {
        f8918d.mo11831f(obj, j10, f10);
    }

    /* JADX INFO: renamed from: u */
    public static void m11257u(Object obj, long j10, int i10) {
        f8918d.f9434a.putInt(obj, j10, i10);
    }

    /* JADX INFO: renamed from: v */
    public static void m11258v(Object obj, long j10, long j11) {
        f8918d.f9434a.putLong(obj, j10, j11);
    }

    /* JADX INFO: renamed from: w */
    public static void m11259w(Object obj, long j10, Object obj2) {
        f8918d.f9434a.putObject(obj, j10, obj2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap byte:0x0015: CAST (byte) (wrap int:0x0013: ARITH (wrap int:0x0012: ARITH (wrap int:0x0007: INVOKE 
      (wrap sun.misc.Unsafe:0x0002: IGET 
      (wrap com.google.android.gms.internal.play_billing.z6:0x0000: SGET  A[WRAPPED] com.google.android.gms.internal.play_billing.a7.d com.google.android.gms.internal.play_billing.z6)
     A[WRAPPED] com.google.android.gms.internal.play_billing.z6.a sun.misc.Unsafe)
      (r3v0 java.lang.Object)
      (wrap long:0x0006: ARITH (-4 long) & (r4v0 long) A[WRAPPED])
     VIRTUAL call: sun.misc.Unsafe.getInt(java.lang.Object, long):int A[WRAPPED]) >>> (wrap int:0x0011: CAST (int) (wrap long:0x0010: ARITH (wrap long:0x000e: ARITH (wrap long:0x000b: NOT (r4v0 long) A[WRAPPED]) & (3 long) A[WRAPPED]) << (3 long) A[WRAPPED])) A[WRAPPED]) & (255 int) A[WRAPPED])) != (0 byte)) ? true : false */
    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m11260x(Object obj, long j10) {
        return ((byte) ((f8918d.f9434a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap byte:0x0014: CAST (byte) (wrap int:0x0012: ARITH (wrap int:0x0011: ARITH (wrap int:0x0007: INVOKE 
      (wrap sun.misc.Unsafe:0x0002: IGET 
      (wrap com.google.android.gms.internal.play_billing.z6:0x0000: SGET  A[WRAPPED] com.google.android.gms.internal.play_billing.a7.d com.google.android.gms.internal.play_billing.z6)
     A[WRAPPED] com.google.android.gms.internal.play_billing.z6.a sun.misc.Unsafe)
      (r3v0 java.lang.Object)
      (wrap long:0x0006: ARITH (-4 long) & (r4v0 long) A[WRAPPED])
     VIRTUAL call: sun.misc.Unsafe.getInt(java.lang.Object, long):int A[WRAPPED]) >>> (wrap int:0x0010: CAST (int) (wrap long:0x000f: ARITH (wrap long:0x000d: ARITH (r4v0 long) & (3 long) A[WRAPPED]) << (3 long) A[WRAPPED])) A[WRAPPED]) & (255 int) A[WRAPPED])) != (0 byte)) ? true : false */
    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m11261y(Object obj, long j10) {
        return ((byte) ((f8918d.f9434a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m11262z(Class cls) {
        int i10 = C2486e3.f8956a;
        try {
            Class cls2 = f8916b;
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
}
