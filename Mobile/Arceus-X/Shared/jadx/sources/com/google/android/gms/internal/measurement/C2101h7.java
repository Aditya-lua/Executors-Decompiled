package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2101h7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2101h7 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC2231ob zze = AbstractC2086gb.m10061y();

    static {
        C2101h7 c2101h7 = new C2101h7();
        zzf = c2101h7;
        AbstractC2086gb.m10057t(C2101h7.class, c2101h7);
    }

    /* JADX INFO: renamed from: M */
    public static C2082g7 m10176M() {
        return (C2082g7) zzf.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2101h7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2082g7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10178F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m10179G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final List m10180H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final int m10181J() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: K */
    public final long m10182K(int i10) {
        return this.zze.mo9893x0(i10);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10183N(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10184O(Iterable iterable) {
        InterfaceC2231ob interfaceC2231ob = this.zze;
        if (!interfaceC2231ob.zza()) {
            this.zze = AbstractC2086gb.m10062z(interfaceC2231ob);
        }
        AbstractC2283r9.m10627i(iterable, this.zze);
    }
}
