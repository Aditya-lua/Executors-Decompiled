package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2601o8 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2601o8 zzb;
    private int zzd;
    private int zze;

    static {
        C2601o8 c2601o8 = new C2601o8();
        zzb = c2601o8;
        AbstractC2652t4.m11738i(C2601o8.class, c2601o8);
    }

    /* JADX INFO: renamed from: B */
    public static C2568l8 m11635B() {
        return (C2568l8) zzb.m11756r();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11637D(C2601o8 c2601o8, int i10) {
        c2601o8.zze = i10 - 1;
        c2601o8.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C2579m8.f9162a});
        }
        if (i11 == 3) {
            return new C2601o8();
        }
        C2590n8 c2590n8 = null;
        if (i11 == 4) {
            return new C2568l8(c2590n8);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
