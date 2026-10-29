package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2170l4 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2170l4 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC2249pb zzg = AbstractC2086gb.m10052A();

    static {
        C2170l4 c2170l4 = new C2170l4();
        zzh = c2170l4;
        AbstractC2086gb.m10057t(C2170l4.class, c2170l4);
    }

    /* JADX INFO: renamed from: O */
    public static C2170l4 m10349O() {
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
            return AbstractC2086gb.m10058v(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", C2134j4.f8339a, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2170l4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2117i4(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10351F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m10352G() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final String m10353H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m10354J() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10355K() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: M */
    public final List m10356M() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: N */
    public final int m10357N() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: Q */
    public final int m10358Q() {
        int iM10310a = C2152k4.m10310a(this.zzd);
        if (iM10310a == 0) {
            return 1;
        }
        return iM10310a;
    }
}
