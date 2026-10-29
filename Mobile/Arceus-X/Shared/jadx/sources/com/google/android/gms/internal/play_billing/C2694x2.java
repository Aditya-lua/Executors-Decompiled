package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2694x2 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2694x2 zzb;
    private int zzd;
    private String zze = "";

    static {
        C2694x2 c2694x2 = new C2694x2();
        zzb = c2694x2;
        AbstractC2652t4.m11738i(C2694x2.class, c2694x2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2694x2();
        }
        C2705y2 c2705y2 = null;
        if (i11 == 4) {
            return new C2683w2(c2705y2);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
