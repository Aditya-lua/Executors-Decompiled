package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2492e9 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2492e9 zzb;
    private int zzd;
    private int zze;

    static {
        C2492e9 c2492e9 = new C2492e9();
        zzb = c2492e9;
        AbstractC2652t4.m11738i(C2492e9.class, c2492e9);
    }

    /* JADX INFO: renamed from: B */
    public static C2459b9 m11397B() {
        return (C2459b9) zzb.m11756r();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11399D(C2492e9 c2492e9, int i10) {
        c2492e9.zze = i10 - 1;
        c2492e9.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C2470c9.f8946a});
        }
        if (i11 == 3) {
            return new C2492e9();
        }
        C2481d9 c2481d9 = null;
        if (i11 == 4) {
            return new C2459b9(c2481d9);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
