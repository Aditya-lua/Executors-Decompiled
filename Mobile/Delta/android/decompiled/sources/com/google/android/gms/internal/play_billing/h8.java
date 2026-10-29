package com.google.android.gms.internal.play_billing;

import com.google.mlkit.vision.barcode.common.Barcode;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class h8 extends t4 implements y5 {
    private static final h8 zzb;
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
        h8 h8Var = new h8();
        zzb = h8Var;
        t4.i(h8.class, h8Var);
    }

    public static /* synthetic */ void B(h8 h8Var, long j10) {
        h8Var.zzd |= Barcode.FORMAT_UPC_A;
        h8Var.zzn = 912213584L;
    }

    public static /* synthetic */ void C(h8 h8Var, String str) {
        str.getClass();
        h8Var.zzd |= 4;
        h8Var.zzg = str;
    }

    public static /* synthetic */ void D(h8 h8Var, String str) {
        str.getClass();
        h8Var.zzd |= Barcode.FORMAT_UPC_E;
        h8Var.zzo = str;
    }

    public static /* synthetic */ void E(h8 h8Var, String str) {
        str.getClass();
        h8Var.zzd |= 8192;
        h8Var.zzr = str;
    }

    public static /* synthetic */ void F(h8 h8Var, String str) {
        str.getClass();
        h8Var.zzd |= Barcode.FORMAT_AZTEC;
        h8Var.zzq = str;
    }

    public static /* synthetic */ void G(h8 h8Var, String str) {
        str.getClass();
        h8Var.zzd |= Barcode.FORMAT_PDF417;
        h8Var.zzp = str;
    }

    public static /* synthetic */ void H(h8 h8Var, int i10) {
        h8Var.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        h8Var.zzs = i10;
    }

    public static /* synthetic */ void I(h8 h8Var, boolean z10) {
        h8Var.zzd |= 64;
        h8Var.zzk = z10;
    }

    public static /* synthetic */ void J(h8 h8Var, String str) {
        str.getClass();
        h8Var.zzd |= 1;
        h8Var.zze = str;
    }

    public static /* synthetic */ void K(h8 h8Var, String str) {
        h8Var.zzd |= 2;
        h8Var.zzf = str;
    }

    public static e8 L() {
        return (e8) zzb.r();
    }

    public static /* synthetic */ void N(h8 h8Var, int i10) {
        h8Var.zzd |= 128;
        h8Var.zzl = i10;
    }

    public static /* synthetic */ void O(h8 h8Var, int i10) {
        h8Var.zzd |= Barcode.FORMAT_QR_CODE;
        h8Var.zzm = i10;
    }

    public static /* synthetic */ void P(h8 h8Var, int i10) {
        h8Var.zzd |= 8;
        h8Var.zzh = i10;
    }

    public static /* synthetic */ void Q(h8 h8Var, long j10) {
        h8Var.zzd |= 16;
        h8Var.zzi = j10;
    }

    public static /* synthetic */ void R(h8 h8Var, long j10) {
        h8Var.zzd |= 32;
        h8Var.zzj = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new h8();
        }
        g8 g8Var = null;
        if (i11 == 4) {
            return new e8(g8Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
