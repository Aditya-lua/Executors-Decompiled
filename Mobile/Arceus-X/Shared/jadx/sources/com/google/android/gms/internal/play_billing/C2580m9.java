package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2580m9 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2580m9 zzb;
    private int zzd;
    private int zze;

    static {
        C2580m9 c2580m9 = new C2580m9();
        zzb = c2580m9;
        AbstractC2652t4.m11738i(C2580m9.class, c2580m9);
    }

    /* JADX INFO: renamed from: C */
    public static C2580m9 m11596C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C2558k9.f9073a});
        }
        if (i11 == 3) {
            return new C2580m9();
        }
        C2569l9 c2569l9 = null;
        if (i11 == 4) {
            return new C2547j9(c2569l9);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
