package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2605p1 extends AbstractC2583n1 {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (null com.google.android.gms.internal.play_billing.w1) A[MD:(com.google.android.gms.internal.play_billing.w1):void (m)] call: com.google.android.gms.internal.play_billing.n1.<init>(com.google.android.gms.internal.play_billing.w1):void type: SUPER */
    public /* synthetic */ C2605p1(C2682w1 c2682w1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: a */
    public final C2550k1 mo11603a(AbstractC2638s1 abstractC2638s1, C2550k1 c2550k1) {
        C2550k1 c2550k2;
        synchronized (abstractC2638s1) {
            try {
                c2550k2 = abstractC2638s1.f9225b;
                if (c2550k2 != c2550k1) {
                    abstractC2638s1.f9225b = c2550k1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2550k2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: b */
    public final C2627r1 mo11604b(AbstractC2638s1 abstractC2638s1, C2627r1 c2627r1) {
        C2627r1 c2627r2;
        synchronized (abstractC2638s1) {
            try {
                c2627r2 = abstractC2638s1.f9226c;
                if (c2627r2 != c2627r1) {
                    abstractC2638s1.f9226c = c2627r1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2627r2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: c */
    public final void mo11605c(C2627r1 c2627r1, C2627r1 c2627r2) {
        c2627r1.f9212b = c2627r2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: d */
    public final void mo11606d(C2627r1 c2627r1, Thread thread) {
        c2627r1.f9211a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: e */
    public final boolean mo11607e(AbstractC2638s1 abstractC2638s1, C2550k1 c2550k1, C2550k1 c2550k2) {
        synchronized (abstractC2638s1) {
            try {
                if (abstractC2638s1.f9225b != c2550k1) {
                    return false;
                }
                abstractC2638s1.f9225b = c2550k2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: f */
    public final boolean mo11608f(AbstractC2638s1 abstractC2638s1, Object obj, Object obj2) {
        synchronized (abstractC2638s1) {
            try {
                if (abstractC2638s1.f9224a != obj) {
                    return false;
                }
                abstractC2638s1.f9224a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: g */
    public final boolean mo11609g(AbstractC2638s1 abstractC2638s1, C2627r1 c2627r1, C2627r1 c2627r2) {
        synchronized (abstractC2638s1) {
            try {
                if (abstractC2638s1.f9226c != c2627r1) {
                    return false;
                }
                abstractC2638s1.f9226c = c2627r2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
