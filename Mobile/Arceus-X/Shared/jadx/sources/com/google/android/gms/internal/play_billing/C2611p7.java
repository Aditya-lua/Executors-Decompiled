package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2611p7 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2611p7 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        C2611p7 c2611p7 = new C2611p7();
        zzb = c2611p7;
        AbstractC2652t4.m11738i(C2611p7.class, c2611p7);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m11663B(C2611p7 c2611p7, int i10) {
        c2611p7.zzg = i10 - 1;
        c2611p7.zzd |= 1;
    }

    /* JADX INFO: renamed from: C */
    public static C2589n7 m11664C() {
        return (C2589n7) zzb.m11756r();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m11666F(C2611p7 c2611p7, EnumC2721z7 enumC2721z7) {
        c2611p7.zzh = enumC2721z7.zza();
        c2611p7.zzd |= 2;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m11667G(C2611p7 c2611p7, C2601o8 c2601o8) {
        c2601o8.getClass();
        c2611p7.zzf = c2601o8;
        c2611p7.zze = 2;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m11668H(C2611p7 c2611p7, C2667u8 c2667u8) {
        c2667u8.getClass();
        c2611p7.zzf = c2667u8;
        c2611p7.zze = 4;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m11669I(C2611p7 c2611p7, C2613p9 c2613p9) {
        c2613p9.getClass();
        c2611p7.zzf = c2613p9;
        c2611p7.zze = 3;
    }

    /* JADX INFO: renamed from: E */
    public final C2667u8 m11670E() {
        return this.zze == 4 ? (C2667u8) this.zzf : C2667u8.m11798C();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C2578m7.f9161a, C2601o8.class, C2613p9.class, C2667u8.class, "zzh", C2710y7.f9424a});
        }
        if (i11 == 3) {
            return new C2611p7();
        }
        C2600o7 c2600o7 = null;
        if (i11 == 4) {
            return new C2589n7(c2600o7);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
