package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2699x7 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2699x7 zzb;

    static {
        C2699x7 c2699x7 = new C2699x7();
        zzb = c2699x7;
        AbstractC2652t4.m11738i(C2699x7.class, c2699x7);
    }

    /* JADX INFO: renamed from: C */
    public static C2699x7 m11834C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        C2688w7 c2688w7 = null;
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new C2699x7();
        }
        if (i11 == 4) {
            return new C2677v7(c2688w7);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
