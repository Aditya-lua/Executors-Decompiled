package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2536i9 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2536i9 zzb;
    private int zzd;
    private C2666u7 zze;
    private long zzf;

    static {
        C2536i9 c2536i9 = new C2536i9();
        zzb = c2536i9;
        AbstractC2652t4.m11738i(C2536i9.class, c2536i9);
    }

    /* JADX INFO: renamed from: B */
    public static C2503f9 m11502B() {
        return (C2503f9) zzb.m11756r();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11504D(C2536i9 c2536i9, C2666u7 c2666u7) {
        c2666u7.getClass();
        c2536i9.zze = c2666u7;
        c2536i9.zzd |= 1;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11505E(C2536i9 c2536i9, long j10) {
        c2536i9.zzd |= 2;
        c2536i9.zzf = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2536i9();
        }
        C2525h9 c2525h9 = null;
        if (i11 == 4) {
            return new C2503f9(c2525h9);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
