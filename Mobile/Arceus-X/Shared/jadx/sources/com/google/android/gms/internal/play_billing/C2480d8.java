package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2480d8 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2480d8 zzb;
    private int zzd;
    private int zzf;
    private C2666u7 zzi;
    private boolean zzj;
    private boolean zzk;
    private C2492e9 zzl;
    private String zze = "";
    private InterfaceC2696x4 zzg = AbstractC2652t4.m11744w();
    private InterfaceC2707y4 zzh = AbstractC2652t4.m11745x();

    static {
        C2480d8 c2480d8 = new C2480d8();
        zzb = c2480d8;
        AbstractC2652t4.m11738i(C2480d8.class, c2480d8);
    }

    /* JADX INFO: renamed from: B */
    public static C2447a8 m11367B() {
        return (C2447a8) zzb.m11756r();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11369D(C2480d8 c2480d8, EnumC2721z7 enumC2721z7) {
        enumC2721z7.getClass();
        InterfaceC2696x4 interfaceC2696x4 = c2480d8.zzg;
        if (!interfaceC2696x4.zzc()) {
            int size = interfaceC2696x4.size();
            c2480d8.zzg = interfaceC2696x4.mo11340r(size + size);
        }
        c2480d8.zzg.mo11775w(enumC2721z7.zza());
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11370E(C2480d8 c2480d8, C2666u7 c2666u7) {
        c2666u7.getClass();
        c2480d8.zzi = c2666u7;
        c2480d8.zzd |= 4;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m11371F(C2480d8 c2480d8, String str) {
        c2480d8.zzd |= 1;
        c2480d8.zze = "ProxyBillingBroadcastReceiver";
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m11372G(C2480d8 c2480d8, C2492e9 c2492e9) {
        c2492e9.getClass();
        c2480d8.zzl = c2492e9;
        c2480d8.zzd |= 32;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m11373H(C2480d8 c2480d8, int i10) {
        c2480d8.zzf = i10 - 1;
        c2480d8.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", C2458b8.f8932a, "zzg", C2710y7.f9424a, "zzh", C2448a9.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new C2480d8();
        }
        C2469c8 c2469c8 = null;
        if (i11 == 4) {
            return new C2447a8(c2469c8);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
