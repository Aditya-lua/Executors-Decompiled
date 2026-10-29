package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2007c8 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2007c8 zzj;
    private int zzb;
    private int zzd;
    private InterfaceC2249pb zze = AbstractC2086gb.m10052A();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        C2007c8 c2007c8 = new C2007c8();
        zzj = c2007c8;
        AbstractC2086gb.m10057t(C2007c8.class, c2007c8);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", C1969a8.f8092a, "zze", C2007c8.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2007c8();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2425z7(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final List m9860F() {
        return this.zze;
    }

    /* JADX INFO: renamed from: G */
    public final String m9861G() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9862H() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final String m9863J() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9864K() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9865M() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m9866N() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final double m9867O() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: Q */
    public final int m9868Q() {
        int iM9791a = C1988b8.m9791a(this.zzd);
        if (iM9791a == 0) {
            return 1;
        }
        return iM9791a;
    }
}
