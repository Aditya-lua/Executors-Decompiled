package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2042e5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2042e5 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        C2042e5 c2042e5 = new C2042e5();
        zzh = c2042e5;
        AbstractC2086gb.m10057t(C2042e5.class, c2042e5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2042e5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2023d5(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final String m9929F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9930G() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9931H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9932J() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9933K() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9934M() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final int m9935N() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m9936O(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
