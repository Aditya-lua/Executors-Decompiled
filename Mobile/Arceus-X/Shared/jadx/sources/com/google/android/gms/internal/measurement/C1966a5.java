package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1966a5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C1966a5 zzi;
    private int zzb;
    private boolean zzg;
    private InterfaceC2249pb zzd = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zze = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zzf = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zzh = AbstractC2086gb.m10052A();

    static {
        C1966a5 c1966a5 = new C1966a5();
        zzi = c1966a5;
        AbstractC2086gb.m10057t(C1966a5.class, c1966a5);
    }

    /* JADX INFO: renamed from: N */
    public static C1966a5 m9577N() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", C2224o4.class, "zze", C2260q4.class, "zzf", C2386x4.class, "zzg", "zzh", C2224o4.class});
        }
        if (i11 == 3) {
            return new C1966a5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2188m4(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final List m9580F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final List m9581G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: H */
    public final List m9582H() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9583J() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9584K() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final List m9585M() {
        return this.zzh;
    }
}
