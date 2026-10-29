package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2448a9 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2448a9 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC2707y4 zze = AbstractC2652t4.m11745x();
    private String zzg = "";

    static {
        C2448a9 c2448a9 = new C2448a9();
        zzb = c2448a9;
        AbstractC2652t4.m11738i(C2448a9.class, c2448a9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2448a9();
        }
        C2722z8 c2722z8 = null;
        if (i11 == 4) {
            return new C2711y8(c2722z8);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
