package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2700x8 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2700x8 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C2524h8 zzg;
    private C2557k8 zzh;

    static {
        C2700x8 c2700x8 = new C2700x8();
        zzb = c2700x8;
        AbstractC2652t4.m11738i(C2700x8.class, c2700x8);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m11835B(C2700x8 c2700x8, C2536i9 c2536i9) {
        c2536i9.getClass();
        c2700x8.zzf = c2536i9;
        c2700x8.zze = 8;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m11836C(C2700x8 c2700x8, C2580m9 c2580m9) {
        c2700x8.zzf = c2580m9;
        c2700x8.zze = 4;
    }

    /* JADX INFO: renamed from: D */
    public static C2678v8 m11837D() {
        return (C2678v8) zzb.m11756r();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m11839F(C2700x8 c2700x8, C2567l7 c2567l7) {
        c2700x8.zzf = c2567l7;
        c2700x8.zze = 2;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m11840G(C2700x8 c2700x8, C2611p7 c2611p7) {
        c2700x8.zzf = c2611p7;
        c2700x8.zze = 3;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m11841H(C2700x8 c2700x8, C2699x7 c2699x7) {
        c2699x7.getClass();
        c2700x8.zzf = c2699x7;
        c2700x8.zze = 7;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m11842I(C2700x8 c2700x8, C2480d8 c2480d8) {
        c2480d8.getClass();
        c2700x8.zzf = c2480d8;
        c2700x8.zze = 5;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m11843J(C2700x8 c2700x8, C2524h8 c2524h8) {
        c2524h8.getClass();
        c2700x8.zzg = c2524h8;
        c2700x8.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C2567l7.class, C2611p7.class, C2580m9.class, C2480d8.class, "zzh", C2699x7.class, C2536i9.class});
        }
        if (i11 == 3) {
            return new C2700x8();
        }
        C2689w8 c2689w8 = null;
        if (i11 == 4) {
            return new C2678v8(c2689w8);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
