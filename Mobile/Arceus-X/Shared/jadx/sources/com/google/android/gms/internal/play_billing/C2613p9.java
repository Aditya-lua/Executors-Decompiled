package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2613p9 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2613p9 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        C2613p9 c2613p9 = new C2613p9();
        zzb = c2613p9;
        AbstractC2652t4.m11738i(C2613p9.class, c2613p9);
    }

    /* JADX INFO: renamed from: B */
    public static C2591n9 m11672B() {
        return (C2591n9) zzb.m11756r();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11674D(C2613p9 c2613p9, boolean z10) {
        c2613p9.zzd |= 8;
        c2613p9.zzh = z10;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11675E(C2613p9 c2613p9, int i10) {
        c2613p9.zzd |= 16;
        c2613p9.zzi = i10;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m11676F(C2613p9 c2613p9, long j10) {
        c2613p9.zzd |= 4;
        c2613p9.zzg = j10;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m11677G(C2613p9 c2613p9, int i10) {
        c2613p9.zzd |= 32;
        c2613p9.zzj = i10;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m11678H(C2613p9 c2613p9, boolean z10) {
        c2613p9.zzd |= 2;
        c2613p9.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C2613p9();
        }
        C2602o9 c2602o9 = null;
        if (i11 == 4) {
            return new C2591n9(c2602o9);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
