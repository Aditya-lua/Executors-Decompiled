package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f6788a;
    public static final Class b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rd f6790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f6792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f6793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f6794h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z10;
        boolean z11;
        rd rdVar;
        Unsafe unsafeV = v();
        f6788a = unsafeV;
        int i10 = u9.f6826a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean zW = w(cls);
        f6789c = zW;
        Class cls2 = Integer.TYPE;
        boolean zW2 = w(cls2);
        rd pdVar = null;
        if (unsafeV != null) {
            if (zW) {
                pdVar = new qd(unsafeV);
            } else if (zW2) {
                pdVar = new pd(unsafeV);
            }
        }
        f6790d = pdVar;
        if (pdVar == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = pdVar.f6776a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                D(th2);
            }
        }
        f6791e = z10;
        rd rdVar2 = f6790d;
        if (rdVar2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = rdVar2.f6776a.getClass();
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
                D(th3);
                z11 = false;
            }
        }
        f6792f = z11;
        f6793g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (rdVar = f6790d) != null) {
            rdVar.f6776a.objectFieldOffset(fieldB);
        }
        f6794h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static /* synthetic */ boolean A(Object obj, long j10) {
        return ((byte) ((f6790d.f6776a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void D(Throwable th2) {
        Logger.getLogger(sd.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static int E(Class cls) {
        if (f6792f) {
            return f6790d.f6776a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int a(Class cls) {
        if (f6792f) {
            return f6790d.f6776a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field b() {
        int i10 = u9.f6826a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    public static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f6790d.f6776a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f6790d.f6776a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static boolean f() {
        return f6792f;
    }

    public static boolean g() {
        return f6791e;
    }

    public static Object h(Class cls) {
        try {
            return f6788a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int i(Object obj, long j10) {
        return f6790d.f6776a.getInt(obj, j10);
    }

    public static void j(Object obj, long j10, int i10) {
        f6790d.f6776a.putInt(obj, j10, i10);
    }

    public static long k(Object obj, long j10) {
        return f6790d.f6776a.getLong(obj, j10);
    }

    public static void l(Object obj, long j10, long j11) {
        f6790d.f6776a.putLong(obj, j10, j11);
    }

    public static boolean m(Object obj, long j10) {
        return f6790d.b(obj, j10);
    }

    public static void n(Object obj, long j10, boolean z10) {
        f6790d.c(obj, j10, z10);
    }

    public static float o(Object obj, long j10) {
        return f6790d.d(obj, j10);
    }

    public static void p(Object obj, long j10, float f10) {
        f6790d.e(obj, j10, f10);
    }

    public static double q(Object obj, long j10) {
        return f6790d.f(obj, j10);
    }

    public static void r(Object obj, long j10, double d10) {
        f6790d.g(obj, j10, d10);
    }

    public static Object s(Object obj, long j10) {
        return f6790d.f6776a.getObject(obj, j10);
    }

    public static void t(Object obj, long j10, Object obj2) {
        f6790d.f6776a.putObject(obj, j10, obj2);
    }

    public static void u(byte[] bArr, long j10, byte b10) {
        f6790d.a(bArr, f6793g + j10, b10);
    }

    public static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new od());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean w(Class cls) {
        int i10 = u9.f6826a;
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

    public static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f6790d.f6776a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }
}
