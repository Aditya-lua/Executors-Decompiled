package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2025d7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2025d7 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC2249pb zze = AbstractC2086gb.m10052A();

    static {
        C2025d7 c2025d7 = new C2025d7();
        zzf = c2025d7;
        AbstractC2086gb.m10057t(C2025d7.class, c2025d7);
    }

    /* JADX INFO: renamed from: F */
    public static C1987b7 m9916F() {
        return (C1987b7) zzf.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", C2006c7.f8128a, "zze", C2262q6.class});
        }
        if (i11 == 3) {
            return new C2025d7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C1987b7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m9918G(C2262q6 c2262q6) {
        c2262q6.getClass();
        InterfaceC2249pb interfaceC2249pb = this.zze;
        if (!interfaceC2249pb.zza()) {
            this.zze = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        this.zze.add(c2262q6);
    }
}
