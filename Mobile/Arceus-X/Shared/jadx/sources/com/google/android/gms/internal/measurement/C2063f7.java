package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2063f7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2063f7 zzg;
    private InterfaceC2231ob zzb = AbstractC2086gb.m10061y();
    private InterfaceC2231ob zzd = AbstractC2086gb.m10061y();
    private InterfaceC2249pb zze = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zzf = AbstractC2086gb.m10052A();

    static {
        C2063f7 c2063f7 = new C2063f7();
        zzg = c2063f7;
        AbstractC2086gb.m10057t(C2063f7.class, c2063f7);
    }

    /* JADX INFO: renamed from: P */
    public static C2044e7 m9988P() {
        return (C2044e7) zzg.m10074p();
    }

    /* JADX INFO: renamed from: Q */
    public static C2063f7 m9989Q() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", C2190m6.class, "zzf", C2101h7.class});
        }
        if (i11 == 3) {
            return new C2063f7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2044e7(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final List m9991F() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: G */
    public final int m9992G() {
        return this.zzb.size();
    }

    /* JADX INFO: renamed from: H */
    public final List m9993H() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: J */
    public final int m9994J() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: K */
    public final List m9995K() {
        return this.zze;
    }

    /* JADX INFO: renamed from: M */
    public final int m9996M() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: N */
    public final List m9997N() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: O */
    public final int m9998O() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m9999R(Iterable iterable) {
        InterfaceC2231ob interfaceC2231ob = this.zzb;
        if (!interfaceC2231ob.zza()) {
            this.zzb = AbstractC2086gb.m10062z(interfaceC2231ob);
        }
        AbstractC2283r9.m10627i(iterable, this.zzb);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m10000S() {
        this.zzb = AbstractC2086gb.m10061y();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m10001T(Iterable iterable) {
        InterfaceC2231ob interfaceC2231ob = this.zzd;
        if (!interfaceC2231ob.zza()) {
            this.zzd = AbstractC2086gb.m10062z(interfaceC2231ob);
        }
        AbstractC2283r9.m10627i(iterable, this.zzd);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m10002U() {
        this.zzd = AbstractC2086gb.m10061y();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m10003V(Iterable iterable) {
        InterfaceC2249pb interfaceC2249pb = this.zze;
        if (!interfaceC2249pb.zza()) {
            this.zze = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        AbstractC2283r9.m10627i(iterable, this.zze);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m10004W() {
        this.zze = AbstractC2086gb.m10052A();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m10005X(Iterable iterable) {
        InterfaceC2249pb interfaceC2249pb = this.zzf;
        if (!interfaceC2249pb.zza()) {
            this.zzf = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        AbstractC2283r9.m10627i(iterable, this.zzf);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m10006Y() {
        this.zzf = AbstractC2086gb.m10052A();
    }
}
