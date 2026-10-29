package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2080g5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2080g5 zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private C1966a5 zzp;
    private C2153k5 zzq;
    private C2261q5 zzr;
    private C2189m5 zzs;
    private C2118i5 zzt;
    private String zze = "";
    private InterfaceC2249pb zzg = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zzh = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zzi = AbstractC2086gb.m10052A();
    private String zzj = "";
    private InterfaceC2249pb zzl = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zzm = AbstractC2086gb.m10052A();
    private String zzn = "";
    private String zzo = "";

    static {
        C2080g5 c2080g5 = new C2080g5();
        zzu = c2080g5;
        AbstractC2086gb.m10057t(C2080g5.class, c2080g5);
    }

    /* JADX INFO: renamed from: X */
    public static C2061f5 m10019X() {
        return (C2061f5) zzu.m10074p();
    }

    /* JADX INFO: renamed from: Y */
    public static C2080g5 m10020Y() {
        return zzu;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C2225o5.class, "zzh", C2042e5.class, "zzi", C2385x3.class, "zzj", "zzk", "zzl", C2407y7.class, "zzm", C2004c5.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new C2080g5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2061f5(bArr);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10022F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final long m10023G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m10024H() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final String m10025J() {
        return this.zze;
    }

    /* JADX INFO: renamed from: K */
    public final List m10026K() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final int m10027M() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: N */
    public final C2042e5 m10028N(int i10) {
        return (C2042e5) this.zzh.get(i10);
    }

    /* JADX INFO: renamed from: O */
    public final List m10029O() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: P */
    public final List m10030P() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: Q */
    public final int m10031Q() {
        return this.zzl.size();
    }

    /* JADX INFO: renamed from: R */
    public final List m10032R() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: S */
    public final String m10033S() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m10034T() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final C1966a5 m10035U() {
        C1966a5 c1966a5 = this.zzp;
        return c1966a5 == null ? C1966a5.m9577N() : c1966a5;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m10036V() {
        return (this.zzb & 512) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final C2261q5 m10037W() {
        C2261q5 c2261q5 = this.zzr;
        return c2261q5 == null ? C2261q5.m10556K() : c2261q5;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m10038Z(int i10, C2042e5 c2042e5) {
        c2042e5.getClass();
        InterfaceC2249pb interfaceC2249pb = this.zzh;
        if (!interfaceC2249pb.zza()) {
            this.zzh = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        this.zzh.set(i10, c2042e5);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m10039a0() {
        this.zzi = AbstractC2086gb.m10052A();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m10040b0() {
        this.zzl = AbstractC2086gb.m10052A();
    }
}
