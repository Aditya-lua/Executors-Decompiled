package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2098h4 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2098h4 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private C1984b4 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        C2098h4 c2098h4 = new C2098h4();
        zzj = c2098h4;
        AbstractC2086gb.m10057t(C2098h4.class, c2098h4);
    }

    /* JADX INFO: renamed from: P */
    public static C2079g4 m10159P() {
        return (C2079g4) zzj.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2098h4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2079g4(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10161F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m10162G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final String m10163H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final C1984b4 m10164J() {
        C1984b4 c1984b4 = this.zzf;
        return c1984b4 == null ? C1984b4.m9775P() : c1984b4;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10165K() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m10166M() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m10167N() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m10168O() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m10169Q(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
