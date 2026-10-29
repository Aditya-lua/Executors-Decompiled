package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f6997a;
    public static final Class b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z6 f6999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f7000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f7001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f7002g;

    static {
        boolean z10;
        z6 z6Var;
        Unsafe unsafeK = k();
        f6997a = unsafeK;
        int i10 = e3.f7032a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean z11 = z(cls);
        f6998c = z11;
        Class cls2 = Integer.TYPE;
        boolean z12 = z(cls2);
        z6 x6Var = null;
        if (unsafeK != null) {
            if (z11) {
                x6Var = new y6(unsafeK);
            } else if (z12) {
                x6Var = new x6(unsafeK);
            }
        }
        f6999d = x6Var;
        if (x6Var != null) {
            try {
                Class<?> cls3 = x6Var.f7358a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th2) {
                l(th2);
            }
        }
        z6 z6Var2 = f6999d;
        if (z6Var2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = z6Var2.f7358a.getClass();
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
                l(th3);
                z10 = false;
            }
        }
        f7000e = z10;
        f7001f = C(byte[].class);
        C(boolean[].class);
        D(boolean[].class);
        C(int[].class);
        D(int[].class);
        C(long[].class);
        D(long[].class);
        C(float[].class);
        D(float[].class);
        C(double[].class);
        D(double[].class);
        C(Object[].class);
        D(Object[].class);
        Field fieldA = a();
        if (fieldA != null && (z6Var = f6999d) != null) {
            z6Var.f7358a.objectFieldOffset(fieldA);
        }
        f7002g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static boolean A(Object obj, long j10) {
        return f6999d.g(obj, j10);
    }

    public static boolean B() {
        return f7000e;
    }

    public static int C(Class cls) {
        if (f7000e) {
            return f6999d.f7358a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int D(Class cls) {
        if (f7000e) {
            return f6999d.f7358a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field a() {
        int i10 = e3.f7032a;
        Field fieldB = b(Buffer.class, "effectiveDirectAddress");
        if (fieldB != null) {
            return fieldB;
        }
        Field fieldB2 = b(Buffer.class, "address");
        if (fieldB2 == null || fieldB2.getType() != Long.TYPE) {
            return null;
        }
        return fieldB2;
    }

    public static Field b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void c(Object obj, long j10, byte b10) {
        Unsafe unsafe = f6999d.f7358a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f6999d.f7358a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static double e(Object obj, long j10) {
        return f6999d.a(obj, j10);
    }

    public static float f(Object obj, long j10) {
        return f6999d.b(obj, j10);
    }

    public static int g(Object obj, long j10) {
        return f6999d.f7358a.getInt(obj, j10);
    }

    public static long h(Object obj, long j10) {
        return f6999d.f7358a.getLong(obj, j10);
    }

    public static Object i(Class cls) {
        try {
            return f6997a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(Object obj, long j10) {
        return f6999d.f7358a.getObject(obj, j10);
    }

    public static Unsafe k() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new w6());
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
            Logger.getLogger(a7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(Throwable th2) {
        Logger.getLogger(a7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void q(Object obj, long j10, boolean z10) {
        f6999d.c(obj, j10, z10);
    }

    public static void r(byte[] bArr, long j10, byte b10) {
        f6999d.d(bArr, f7001f + j10, b10);
    }

    public static void s(Object obj, long j10, double d10) {
        f6999d.e(obj, j10, d10);
    }

    public static void t(Object obj, long j10, float f10) {
        f6999d.f(obj, j10, f10);
    }

    public static void u(Object obj, long j10, int i10) {
        f6999d.f7358a.putInt(obj, j10, i10);
    }

    public static void v(Object obj, long j10, long j11) {
        f6999d.f7358a.putLong(obj, j10, j11);
    }

    public static void w(Object obj, long j10, Object obj2) {
        f6999d.f7358a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj, long j10) {
        return ((byte) ((f6999d.f7358a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f6999d.f7358a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean z(Class cls) {
        int i10 = e3.f7032a;
        try {
            Class cls2 = b;
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
