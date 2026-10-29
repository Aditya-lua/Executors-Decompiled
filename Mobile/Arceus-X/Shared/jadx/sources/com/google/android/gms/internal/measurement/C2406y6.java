package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2406y6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2406y6 zzh;
    private int zzb;
    private InterfaceC2249pb zzd = AbstractC2086gb.m10052A();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C2406y6 c2406y6 = new C2406y6();
        zzh = c2406y6;
        AbstractC2086gb.m10057t(C2406y6.class, c2406y6);
    }

    /* JADX INFO: renamed from: O */
    public static C2352v6 m10998O() {
        return (C2352v6) zzh.m10074p();
    }

    /* JADX INFO: renamed from: P */
    public static C2352v6 m10999P(C2406y6 c2406y6) {
        C2010cb c2010cbM10074p = zzh.m10074p();
        c2010cbM10074p.m9883v(c2406y6);
        return (C2352v6) c2010cbM10074p;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C1968a7.class, "zze", "zzf", "zzg", C2388x6.f8770a});
        }
        if (i11 == 3) {
            return new C2406y6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2352v6(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final List m11001F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final int m11002G() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: H */
    public final C1968a7 m11003H(int i10) {
        return (C1968a7) this.zzd.get(i10);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m11004J() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final String m11005K() {
        return this.zze;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m11006M() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final String m11007N() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m11008Q(int i10, C1968a7 c1968a7) {
        c1968a7.getClass();
        m11014X();
        this.zzd.set(i10, c1968a7);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m11009R(C1968a7 c1968a7) {
        c1968a7.getClass();
        m11014X();
        this.zzd.add(c1968a7);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m11010S(Iterable iterable) {
        m11014X();
        AbstractC2283r9.m10627i(iterable, this.zzd);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m11011T() {
        this.zzd = AbstractC2086gb.m10052A();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m11012U(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m11013V(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: X */
    public final void m11014X() {
        InterfaceC2249pb interfaceC2249pb = this.zzd;
        if (interfaceC2249pb.zza()) {
            return;
        }
        this.zzd = AbstractC2086gb.m10053B(interfaceC2249pb);
    }
}
