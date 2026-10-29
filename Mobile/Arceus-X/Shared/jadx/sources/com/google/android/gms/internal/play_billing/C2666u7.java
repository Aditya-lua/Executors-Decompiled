package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2666u7 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2666u7 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        C2666u7 c2666u7 = new C2666u7();
        zzb = c2666u7;
        AbstractC2652t4.m11738i(C2666u7.class, c2666u7);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m11789B(C2666u7 c2666u7, int i10) {
        c2666u7.zzd |= 1;
        c2666u7.zze = i10;
    }

    /* JADX INFO: renamed from: C */
    public static C2622q7 m11790C() {
        return (C2622q7) zzb.m11756r();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11792E(C2666u7 c2666u7, String str) {
        c2666u7.zzd |= 8;
        c2666u7.zzh = str;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m11793F(C2666u7 c2666u7, String str) {
        str.getClass();
        c2666u7.zzd |= 2;
        c2666u7.zzf = str;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m11794G(C2666u7 c2666u7, int i10) {
        c2666u7.zzd |= 32;
        c2666u7.zzj = i10;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m11795H(C2666u7 c2666u7, int i10) {
        c2666u7.zzd |= 16;
        c2666u7.zzi = i10;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m11796I(C2666u7 c2666u7, EnumC2644s7 enumC2644s7) {
        c2666u7.zzg = enumC2644s7.zza();
        c2666u7.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", C2633r7.f9215a, "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C2666u7();
        }
        C2655t7 c2655t7 = null;
        if (i11 == 4) {
            return new C2622q7(c2655t7);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
