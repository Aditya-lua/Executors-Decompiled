package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2421z3 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2421z3 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC2249pb zzf = AbstractC2086gb.m10052A();
    private boolean zzg;
    private C2060f4 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C2421z3 c2421z3 = new C2421z3();
        zzl = c2421z3;
        AbstractC2086gb.m10057t(C2421z3.class, c2421z3);
    }

    /* JADX INFO: renamed from: T */
    public static C2403y3 m11037T() {
        return (C2403y3) zzl.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", C1984b4.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C2421z3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2403y3(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m11039F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m11040G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final String m11041H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final List m11042J() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: K */
    public final int m11043K() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: M */
    public final C1984b4 m11044M(int i10) {
        return (C1984b4) this.zzf.get(i10);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m11045N() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final C2060f4 m11046O() {
        C2060f4 c2060f4 = this.zzh;
        return c2060f4 == null ? C2060f4.m9967Q() : c2060f4;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m11047P() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m11048Q() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m11049R() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m11050S() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m11051U(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m11052V(int i10, C1984b4 c1984b4) {
        c1984b4.getClass();
        InterfaceC2249pb interfaceC2249pb = this.zzf;
        if (!interfaceC2249pb.zza()) {
            this.zzf = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        this.zzf.set(i10, c1984b4);
    }
}
