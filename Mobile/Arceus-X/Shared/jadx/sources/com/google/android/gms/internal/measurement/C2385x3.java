package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2385x3 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2385x3 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC2249pb zze = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zzf = AbstractC2086gb.m10052A();
    private boolean zzg;
    private boolean zzh;

    static {
        C2385x3 c2385x3 = new C2385x3();
        zzi = c2385x3;
        AbstractC2086gb.m10057t(C2385x3.class, c2385x3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", C2098h4.class, "zzf", C2421z3.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2385x3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2367w3(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10959F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m10960G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final List m10961H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final int m10962J() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: K */
    public final C2098h4 m10963K(int i10) {
        return (C2098h4) this.zze.get(i10);
    }

    /* JADX INFO: renamed from: M */
    public final List m10964M() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: N */
    public final int m10965N() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: O */
    public final C2421z3 m10966O(int i10) {
        return (C2421z3) this.zzf.get(i10);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10967P(int i10, C2098h4 c2098h4) {
        c2098h4.getClass();
        InterfaceC2249pb interfaceC2249pb = this.zze;
        if (!interfaceC2249pb.zza()) {
            this.zze = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        this.zze.set(i10, c2098h4);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m10968Q(int i10, C2421z3 c2421z3) {
        c2421z3.getClass();
        InterfaceC2249pb interfaceC2249pb = this.zzf;
        if (!interfaceC2249pb.zza()) {
            this.zzf = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        this.zzf.set(i10, c2421z3);
    }
}
