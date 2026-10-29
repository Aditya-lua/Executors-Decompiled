package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2524h8 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2524h8 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        C2524h8 c2524h8 = new C2524h8();
        zzb = c2524h8;
        AbstractC2652t4.m11738i(C2524h8.class, c2524h8);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m11449B(C2524h8 c2524h8, long j10) {
        c2524h8.zzd |= 512;
        c2524h8.zzn = 912213584L;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m11450C(C2524h8 c2524h8, String str) {
        str.getClass();
        c2524h8.zzd |= 4;
        c2524h8.zzg = str;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11451D(C2524h8 c2524h8, String str) {
        str.getClass();
        c2524h8.zzd |= 1024;
        c2524h8.zzo = str;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11452E(C2524h8 c2524h8, String str) {
        str.getClass();
        c2524h8.zzd |= 8192;
        c2524h8.zzr = str;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m11453F(C2524h8 c2524h8, String str) {
        str.getClass();
        c2524h8.zzd |= 4096;
        c2524h8.zzq = str;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m11454G(C2524h8 c2524h8, String str) {
        str.getClass();
        c2524h8.zzd |= 2048;
        c2524h8.zzp = str;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m11455H(C2524h8 c2524h8, int i10) {
        c2524h8.zzd |= 16384;
        c2524h8.zzs = i10;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m11456I(C2524h8 c2524h8, boolean z10) {
        c2524h8.zzd |= 64;
        c2524h8.zzk = z10;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m11457J(C2524h8 c2524h8, String str) {
        str.getClass();
        c2524h8.zzd |= 1;
        c2524h8.zze = str;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m11458K(C2524h8 c2524h8, String str) {
        c2524h8.zzd |= 2;
        c2524h8.zzf = str;
    }

    /* JADX INFO: renamed from: L */
    public static C2491e8 m11459L() {
        return (C2491e8) zzb.m11756r();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m11461N(C2524h8 c2524h8, int i10) {
        c2524h8.zzd |= 128;
        c2524h8.zzl = i10;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m11462O(C2524h8 c2524h8, int i10) {
        c2524h8.zzd |= 256;
        c2524h8.zzm = i10;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m11463P(C2524h8 c2524h8, int i10) {
        c2524h8.zzd |= 8;
        c2524h8.zzh = i10;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m11464Q(C2524h8 c2524h8, long j10) {
        c2524h8.zzd |= 16;
        c2524h8.zzi = j10;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m11465R(C2524h8 c2524h8, long j10) {
        c2524h8.zzd |= 32;
        c2524h8.zzj = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new C2524h8();
        }
        C2513g8 c2513g8 = null;
        if (i11 == 4) {
            return new C2491e8(c2513g8);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
