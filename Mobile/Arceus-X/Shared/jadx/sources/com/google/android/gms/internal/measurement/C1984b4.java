package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1984b4 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C1984b4 zzh;
    private int zzb;
    private C2170l4 zzd;
    private C2060f4 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        C1984b4 c1984b4 = new C1984b4();
        zzh = c1984b4;
        AbstractC2086gb.m10057t(C1984b4.class, c1984b4);
    }

    /* JADX INFO: renamed from: P */
    public static C1984b4 m9775P() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C1984b4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C1965a4(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9777F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final C2170l4 m9778G() {
        C2170l4 c2170l4 = this.zzd;
        return c2170l4 == null ? C2170l4.m10349O() : c2170l4;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9779H() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final C2060f4 m9780J() {
        C2060f4 c2060f4 = this.zze;
        return c2060f4 == null ? C2060f4.m9967Q() : c2060f4;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9781K() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9782M() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m9783N() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final String m9784O() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m9785Q(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
