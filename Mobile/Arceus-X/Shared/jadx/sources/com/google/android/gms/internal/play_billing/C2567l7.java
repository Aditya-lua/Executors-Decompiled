package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2567l7 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2567l7 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C2666u7 zzh;
    private int zzi;

    static {
        C2567l7 c2567l7 = new C2567l7();
        zzb = c2567l7;
        AbstractC2652t4.m11738i(C2567l7.class, c2567l7);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m11542B(C2567l7 c2567l7, C2667u8 c2667u8) {
        c2667u8.getClass();
        c2567l7.zzf = c2667u8;
        c2567l7.zze = 7;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m11543C(C2567l7 c2567l7, C2613p9 c2613p9) {
        c2613p9.getClass();
        c2567l7.zzf = c2613p9;
        c2567l7.zze = 6;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11544D(C2567l7 c2567l7, int i10) {
        c2567l7.zzg = i10 - 1;
        c2567l7.zzd |= 1;
    }

    /* JADX INFO: renamed from: E */
    public static C2545j7 m11545E() {
        return (C2545j7) zzb.m11756r();
    }

    /* JADX INFO: renamed from: G */
    public static C2567l7 m11547G(byte[] bArr) {
        return (C2567l7) AbstractC2652t4.m11743v(zzb, bArr);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m11548I(C2567l7 c2567l7, EnumC2721z7 enumC2721z7) {
        c2567l7.zzi = enumC2721z7.zza();
        c2567l7.zzd |= 4;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m11549J(C2567l7 c2567l7, C2666u7 c2666u7) {
        c2666u7.getClass();
        c2567l7.zzh = c2666u7;
        c2567l7.zzd |= 2;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m11550K(C2567l7 c2567l7, C2601o8 c2601o8) {
        c2601o8.getClass();
        c2567l7.zzf = c2601o8;
        c2567l7.zze = 4;
    }

    /* JADX INFO: renamed from: H */
    public final C2667u8 m11551H() {
        return this.zze == 7 ? (C2667u8) this.zzf : C2667u8.m11798C();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C2578m7.f9161a, "zzh", C2601o8.class, "zzi", C2710y7.f9424a, C2613p9.class, C2667u8.class});
        }
        if (i11 == 3) {
            return new C2567l7();
        }
        C2556k7 c2556k7 = null;
        if (i11 == 4) {
            return new C2545j7(c2556k7);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
