package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.sd */
/* JADX INFO: loaded from: classes.dex */
public final class C2305sd {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f8642a;

    /* JADX INFO: renamed from: b */
    public static final Class f8643b;

    /* JADX INFO: renamed from: c */
    public static final boolean f8644c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC2287rd f8645d;

    /* JADX INFO: renamed from: e */
    public static final boolean f8646e;

    /* JADX INFO: renamed from: f */
    public static final boolean f8647f;

    /* JADX INFO: renamed from: g */
    public static final long f8648g;

    /* JADX INFO: renamed from: h */
    public static final boolean f8649h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z10;
        boolean z11;
        AbstractC2287rd abstractC2287rd;
        Unsafe unsafeM10747v = m10747v();
        f8642a = unsafeM10747v;
        int i10 = C2337u9.f8687a;
        f8643b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM10748w = m10748w(cls);
        f8644c = zM10748w;
        Class cls2 = Integer.TYPE;
        boolean zM10748w2 = m10748w(cls2);
        AbstractC2287rd c2251pd = null;
        if (unsafeM10747v != null) {
            if (zM10748w) {
                c2251pd = new C2269qd(unsafeM10747v);
            } else if (zM10748w2) {
                c2251pd = new C2251pd(unsafeM10747v);
            }
        }
        f8645d = c2251pd;
        if (c2251pd == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = c2251pd.f8626a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m10727b() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                m10724D(th2);
            }
        }
        f8646e = z10;
        AbstractC2287rd abstractC2287rd2 = f8645d;
        if (abstractC2287rd2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = abstractC2287rd2.f8626a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th3) {
                m10724D(th3);
                z11 = false;
            }
        }
        f8647f = z11;
        f8648g = m10725E(byte[].class);
        m10725E(boolean[].class);
        m10726a(boolean[].class);
        m10725E(int[].class);
        m10726a(int[].class);
        m10725E(long[].class);
        m10726a(long[].class);
        m10725E(float[].class);
        m10726a(float[].class);
        m10725E(double[].class);
        m10726a(double[].class);
        m10725E(Object[].class);
        m10726a(Object[].class);
        Field fieldM10727b = m10727b();
        if (fieldM10727b != null && (abstractC2287rd = f8645d) != null) {
            abstractC2287rd.f8626a.objectFieldOffset(fieldM10727b);
        }
        f8649h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap byte:0x0014: CAST (byte) (wrap int:0x0012: ARITH (wrap int:0x0011: ARITH (wrap int:0x0007: INVOKE 
      (wrap sun.misc.Unsafe:0x0002: IGET 
      (wrap com.google.android.gms.internal.measurement.rd:0x0000: SGET  A[WRAPPED] com.google.android.gms.internal.measurement.sd.d com.google.android.gms.internal.measurement.rd)
     A[WRAPPED] com.google.android.gms.internal.measurement.rd.a sun.misc.Unsafe)
      (r3v0 java.lang.Object)
      (wrap long:0x0006: ARITH (-4 long) & (r4v0 long) A[WRAPPED])
     VIRTUAL call: sun.misc.Unsafe.getInt(java.lang.Object, long):int A[WRAPPED]) >>> (wrap int:0x0010: CAST (int) (wrap long:0x000f: ARITH (wrap long:0x000d: ARITH (r4v0 long) & (3 long) A[WRAPPED]) << (3 long) A[WRAPPED])) A[WRAPPED]) & (255 int) A[WRAPPED])) != (0 byte)) ? true : false */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m10721A(Object obj, long j10) {
        return ((byte) ((f8645d.f8626a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m10724D(Throwable th2) {
        Logger.getLogger(C2305sd.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* JADX INFO: renamed from: E */
    public static int m10725E(Class cls) {
        if (f8647f) {
            return f8645d.f8626a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m10726a(Class cls) {
        if (f8647f) {
            return f8645d.f8626a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static Field m10727b() {
        int i10 = C2337u9.f8687a;
        Field fieldM10728c = m10728c(Buffer.class, "effectiveDirectAddress");
        if (fieldM10728c != null) {
            return fieldM10728c;
        }
        Field fieldM10728c2 = m10728c(Buffer.class, "address");
        if (fieldM10728c2 == null || fieldM10728c2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM10728c2;
    }

    /* JADX INFO: renamed from: c */
    public static Field m10728c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10729d(Object obj, long j10, byte b) {
        Unsafe unsafe = f8645d.f8626a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: renamed from: e */
    public static void m10730e(Object obj, long j10, byte b) {
        Unsafe unsafe = f8645d.f8626a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m10731f() {
        return f8647f;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10732g() {
        return f8646e;
    }

    /* JADX INFO: renamed from: h */
    public static Object m10733h(Class cls) {
        try {
            return f8642a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m10734i(Object obj, long j10) {
        return f8645d.f8626a.getInt(obj, j10);
    }

    /* JADX INFO: renamed from: j */
    public static void m10735j(Object obj, long j10, int i10) {
        f8645d.f8626a.putInt(obj, j10, i10);
    }

    /* JADX INFO: renamed from: k */
    public static long m10736k(Object obj, long j10) {
        return f8645d.f8626a.getLong(obj, j10);
    }

    /* JADX INFO: renamed from: l */
    public static void m10737l(Object obj, long j10, long j11) {
        f8645d.f8626a.putLong(obj, j10, j11);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10738m(Object obj, long j10) {
        return f8645d.mo10536b(obj, j10);
    }

    /* JADX INFO: renamed from: n */
    public static void m10739n(Object obj, long j10, boolean z10) {
        f8645d.mo10537c(obj, j10, z10);
    }

    /* JADX INFO: renamed from: o */
    public static float m10740o(Object obj, long j10) {
        return f8645d.mo10538d(obj, j10);
    }

    /* JADX INFO: renamed from: p */
    public static void m10741p(Object obj, long j10, float f10) {
        f8645d.mo10539e(obj, j10, f10);
    }

    /* JADX INFO: renamed from: q */
    public static double m10742q(Object obj, long j10) {
        return f8645d.mo10540f(obj, j10);
    }

    /* JADX INFO: renamed from: r */
    public static void m10743r(Object obj, long j10, double d10) {
        f8645d.mo10541g(obj, j10, d10);
    }

    /* JADX INFO: renamed from: s */
    public static Object m10744s(Object obj, long j10) {
        return f8645d.f8626a.getObject(obj, j10);
    }

    /* JADX INFO: renamed from: t */
    public static void m10745t(Object obj, long j10, Object obj2) {
        f8645d.f8626a.putObject(obj, j10, obj2);
    }

    /* JADX INFO: renamed from: u */
    public static void m10746u(byte[] bArr, long j10, byte b) {
        f8645d.mo10535a(bArr, f8648g + j10, b);
    }

    /* JADX INFO: renamed from: v */
    public static Unsafe m10747v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2233od());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m10748w(Class cls) {
        int i10 = C2337u9.f8687a;
        try {
            Class cls2 = f8643b;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap byte:0x0015: CAST (byte) (wrap int:0x0013: ARITH (wrap int:0x0012: ARITH (wrap int:0x0007: INVOKE 
      (wrap sun.misc.Unsafe:0x0002: IGET 
      (wrap com.google.android.gms.internal.measurement.rd:0x0000: SGET  A[WRAPPED] com.google.android.gms.internal.measurement.sd.d com.google.android.gms.internal.measurement.rd)
     A[WRAPPED] com.google.android.gms.internal.measurement.rd.a sun.misc.Unsafe)
      (r3v0 java.lang.Object)
      (wrap long:0x0006: ARITH (-4 long) & (r4v0 long) A[WRAPPED])
     VIRTUAL call: sun.misc.Unsafe.getInt(java.lang.Object, long):int A[WRAPPED]) >>> (wrap int:0x0011: CAST (int) (wrap long:0x0010: ARITH (wrap long:0x000e: ARITH (wrap long:0x000b: NOT (r4v0 long) A[WRAPPED]) & (3 long) A[WRAPPED]) << (3 long) A[WRAPPED])) A[WRAPPED]) & (255 int) A[WRAPPED])) != (0 byte)) ? true : false */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m10751z(Object obj, long j10) {
        return ((byte) ((f8645d.f8626a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }
}
