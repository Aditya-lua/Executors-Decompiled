package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2245p7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2245p7 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2245p7 c2245p7 = new C2245p7();
        zzg = c2245p7;
        AbstractC2086gb.m10057t(C2245p7.class, c2245p7);
    }

    /* JADX INFO: renamed from: G */
    public static C2120i7 m10520G() {
        return (C2120i7) zzg.m10074p();
    }

    /* JADX INFO: renamed from: H */
    public static C2245p7 m10521H() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C2209n7.f8507a, "zze", C2137j7.f8340a, "zzf", C2173l7.f8392a});
        }
        if (i11 == 3) {
            return new C2245p7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2120i7(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final EnumC2155k7 m10523F() {
        EnumC2155k7 enumC2155k7M10317a = EnumC2155k7.m10317a(this.zze);
        return enumC2155k7M10317a == null ? EnumC2155k7.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : enumC2155k7M10317a;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10524J(EnumC2155k7 enumC2155k7) {
        this.zze = enumC2155k7.zza();
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: M */
    public final int m10525M() {
        int iM10506a = C2227o7.m10506a(this.zzd);
        if (iM10506a == 0) {
            return 1;
        }
        return iM10506a;
    }

    /* JADX INFO: renamed from: N */
    public final int m10526N() {
        int iM10379a = C2191m7.m10379a(this.zzf);
        if (iM10379a == 0) {
            return 1;
        }
        return iM10379a;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10527O(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10528P(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
