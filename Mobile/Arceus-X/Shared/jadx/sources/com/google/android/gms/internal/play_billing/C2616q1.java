package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2616q1 extends AbstractC2583n1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f9196a;

    /* JADX INFO: renamed from: b */
    public static final long f9197b;

    /* JADX INFO: renamed from: c */
    public static final long f9198c;

    /* JADX INFO: renamed from: d */
    public static final long f9199d;

    /* JADX INFO: renamed from: e */
    public static final long f9200e;

    /* JADX INFO: renamed from: f */
    public static final long f9201f;

    static {
        Unsafe unsafeM11682h;
        try {
            try {
                unsafeM11682h = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    unsafeM11682h = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.v1
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            return C2616q1.m11682h();
                        }
                    });
                } catch (Exception unused2) {
                    unsafeM11682h = m11682h();
                    Unsafe unsafe = unsafeM11682h;
                }
            }
            try {
                f9198c = unsafeM11682h.objectFieldOffset(AbstractC2638s1.class.getDeclaredField("c"));
                f9197b = unsafeM11682h.objectFieldOffset(AbstractC2638s1.class.getDeclaredField("b"));
                f9199d = unsafeM11682h.objectFieldOffset(AbstractC2638s1.class.getDeclaredField("a"));
                f9200e = unsafeM11682h.objectFieldOffset(C2627r1.class.getDeclaredField("a"));
                f9201f = unsafeM11682h.objectFieldOffset(C2627r1.class.getDeclaredField("b"));
                f9196a = unsafeM11682h;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (null com.google.android.gms.internal.play_billing.w1) A[MD:(com.google.android.gms.internal.play_billing.w1):void (m)] call: com.google.android.gms.internal.play_billing.n1.<init>(com.google.android.gms.internal.play_billing.w1):void type: SUPER */
    public /* synthetic */ C2616q1(C2682w1 c2682w1) {
        super(null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Unsafe m11682h() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: a */
    public final C2550k1 mo11603a(AbstractC2638s1 abstractC2638s1, C2550k1 c2550k1) {
        C2550k1 c2550k2;
        do {
            c2550k2 = abstractC2638s1.f9225b;
            if (c2550k1 == c2550k2) {
                break;
            }
        } while (!mo11607e(abstractC2638s1, c2550k2, c2550k1));
        return c2550k2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: b */
    public final C2627r1 mo11604b(AbstractC2638s1 abstractC2638s1, C2627r1 c2627r1) {
        C2627r1 c2627r2;
        do {
            c2627r2 = abstractC2638s1.f9226c;
            if (c2627r1 == c2627r2) {
                break;
            }
        } while (!mo11609g(abstractC2638s1, c2627r2, c2627r1));
        return c2627r2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: c */
    public final void mo11605c(C2627r1 c2627r1, C2627r1 c2627r2) {
        f9196a.putObject(c2627r1, f9201f, c2627r2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: d */
    public final void mo11606d(C2627r1 c2627r1, Thread thread) {
        f9196a.putObject(c2627r1, f9200e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: e */
    public final boolean mo11607e(AbstractC2638s1 abstractC2638s1, C2550k1 c2550k1, C2550k1 c2550k2) {
        return C2660u1.m11764a(f9196a, abstractC2638s1, f9197b, c2550k1, c2550k2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: f */
    public final boolean mo11608f(AbstractC2638s1 abstractC2638s1, Object obj, Object obj2) {
        return C2660u1.m11764a(f9196a, abstractC2638s1, f9199d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: g */
    public final boolean mo11609g(AbstractC2638s1 abstractC2638s1, C2627r1 c2627r1, C2627r1 c2627r2) {
        return C2660u1.m11764a(f9196a, abstractC2638s1, f9198c, c2627r1, c2627r2);
    }
}
