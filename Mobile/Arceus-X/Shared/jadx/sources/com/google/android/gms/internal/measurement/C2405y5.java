package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2405y5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2405y5 zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C2405y5 c2405y5 = new C2405y5();
        zzk = c2405y5;
        AbstractC2086gb.m10057t(C2405y5.class, c2405y5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C2405y5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2387x5(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }
}
