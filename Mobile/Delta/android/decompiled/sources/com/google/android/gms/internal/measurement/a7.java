package com.google.android.gms.internal.measurement;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public final class a7 extends gb implements pc {
    private static final a7 zzat;
    private int zzA;
    private boolean zzD;
    private int zzG;
    private int zzH;
    private int zzI;
    private long zzK;
    private long zzL;
    private int zzO;
    private d7 zzQ;
    private long zzS;
    private long zzT;
    private int zzW;
    private boolean zzX;
    private boolean zzZ;
    private u6 zzaa;
    private long zzae;
    private boolean zzaf;
    private boolean zzah;
    private int zzaj;
    private a6 zzal;
    private int zzam;
    private w5 zzan;
    private p7 zzap;
    private long zzaq;
    private k6 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private int zzq;
    private long zzu;
    private long zzv;
    private boolean zzx;
    private long zzz;
    private pb zzf = gb.A();
    private pb zzg = gb.A();
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzw = "";
    private String zzy = "";
    private String zzB = "";
    private String zzC = "";
    private pb zzE = gb.A();
    private String zzF = "";
    private String zzJ = "";
    private String zzM = "";
    private String zzN = "";
    private String zzP = "";
    private nb zzR = gb.x();
    private String zzU = "";
    private String zzV = "";
    private String zzY = "";
    private String zzab = "";
    private pb zzac = gb.A();
    private String zzad = "";
    private String zzag = "";
    private String zzai = "";
    private String zzak = "";
    private String zzao = "";
    private String zzar = "";

    static {
        a7 a7Var = new a7();
        zzat = a7Var;
        gb.u(a7.class, a7Var);
    }

    public static z6 m0() {
        return (z6) zzat.q();
    }

    public static z6 n0(a7 a7Var) {
        cb cbVarQ = zzat.q();
        cbVarQ.v(a7Var);
        return (z6) cbVarQ;
    }

    public final /* synthetic */ void A0(long j10) {
        this.zzb |= 4;
        this.zzi = j10;
    }

    public final /* synthetic */ void A1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final boolean A2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void B0(long j10) {
        this.zzb |= 8;
        this.zzj = j10;
    }

    public final /* synthetic */ void B1(int i10) {
        this.zzd |= 1048576;
        this.zzaj = i10;
    }

    public final long B2() {
        return this.zzl;
    }

    public final /* synthetic */ void C0(long j10) {
        this.zzb |= 16;
        this.zzk = j10;
    }

    public final /* synthetic */ void C1(a6 a6Var) {
        a6Var.getClass();
        this.zzal = a6Var;
        this.zzd |= 4194304;
    }

    public final String C2() {
        return this.zzm;
    }

    public final /* synthetic */ void D0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void D1(int i10) {
        this.zzd |= 8388608;
        this.zzam = i10;
    }

    public final String D2() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", o6.class, "zzg", r7.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", c6.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", r5.f6760a, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i11 == 3) {
            return new a7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new z6(bArr);
        }
        if (i11 == 5) {
            return zzat;
        }
        throw null;
    }

    public final /* synthetic */ void E0(long j10) {
        this.zzb |= 32;
        this.zzl = j10;
    }

    public final /* synthetic */ void E1(w5 w5Var) {
        w5Var.getClass();
        this.zzan = w5Var;
        this.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }

    public final String E2() {
        return this.zzo;
    }

    public final String F() {
        return this.zzs;
    }

    public final /* synthetic */ void F0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void F1(p7 p7Var) {
        this.zzap = p7Var;
        this.zzd |= 67108864;
    }

    public final String F2() {
        return this.zzp;
    }

    public final String G() {
        return this.zzt;
    }

    public final /* synthetic */ void G0(String str) {
        this.zzb |= 64;
        this.zzm = "android";
    }

    public final /* synthetic */ void G1(long j10) {
        this.zzd |= 134217728;
        this.zzaq = j10;
    }

    public final boolean G2() {
        return (this.zzb & Barcode.FORMAT_UPC_E) != 0;
    }

    public final boolean H() {
        return (this.zzb & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
    }

    public final /* synthetic */ void H0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void H1(String str) {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    public final int H2() {
        return this.zzq;
    }

    public final boolean I0() {
        return (this.zzd & 2) != 0;
    }

    public final /* synthetic */ void I1(k6 k6Var) {
        k6Var.getClass();
        this.zzas = k6Var;
        this.zzd |= 536870912;
    }

    public final String I2() {
        return this.zzr;
    }

    public final long J() {
        return this.zzu;
    }

    public final int J0() {
        return this.zzO;
    }

    public final /* synthetic */ void J1(String str) {
        str.getClass();
        this.zzb |= Barcode.FORMAT_QR_CODE;
        this.zzo = str;
    }

    public final boolean K() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean K0() {
        return (this.zzd & 16) != 0;
    }

    public final /* synthetic */ void K1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final long L() {
        return this.zzv;
    }

    public final long L0() {
        return this.zzS;
    }

    public final /* synthetic */ void L1(String str) {
        str.getClass();
        this.zzb |= Barcode.FORMAT_UPC_A;
        this.zzp = str;
    }

    public final boolean M0() {
        return (this.zzd & 128) != 0;
    }

    public final /* synthetic */ void M1(int i10) {
        this.zzb |= Barcode.FORMAT_UPC_E;
        this.zzq = i10;
    }

    public final String N() {
        return this.zzw;
    }

    public final String N0() {
        return this.zzV;
    }

    public final /* synthetic */ void N1(String str) {
        str.getClass();
        this.zzb |= Barcode.FORMAT_PDF417;
        this.zzr = str;
    }

    public final boolean O() {
        return (this.zzb & 131072) != 0;
    }

    public final boolean O0() {
        return (this.zzd & 8192) != 0;
    }

    public final /* synthetic */ void O1(String str) {
        str.getClass();
        this.zzb |= Barcode.FORMAT_AZTEC;
        this.zzs = str;
    }

    public final boolean P() {
        return this.zzx;
    }

    public final String P0() {
        return this.zzab;
    }

    public final /* synthetic */ void P1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final String Q() {
        return this.zzy;
    }

    public final boolean Q0() {
        return (this.zzd & 32768) != 0;
    }

    public final /* synthetic */ void Q1(long j10) {
        this.zzb |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzu = j10;
    }

    public final boolean R() {
        return (this.zzb & 524288) != 0;
    }

    public final long R0() {
        return this.zzae;
    }

    public final /* synthetic */ void R1(long j10) {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    public final long S() {
        return this.zzz;
    }

    public final boolean S0() {
        return this.zzaf;
    }

    public final /* synthetic */ void S1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    public final boolean T() {
        return (this.zzb & 1048576) != 0;
    }

    public final boolean T0() {
        return (this.zzd & 131072) != 0;
    }

    public final /* synthetic */ void T1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    public final int U() {
        return this.zzA;
    }

    public final String U0() {
        return this.zzag;
    }

    public final /* synthetic */ void U1(boolean z10) {
        this.zzb |= 131072;
        this.zzx = z10;
    }

    public final String V() {
        return this.zzB;
    }

    public final boolean V0() {
        return (this.zzd & 262144) != 0;
    }

    public final /* synthetic */ void V1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final String W() {
        return this.zzC;
    }

    public final boolean W0() {
        return this.zzah;
    }

    public final /* synthetic */ void W1(String str) {
        str.getClass();
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final boolean X() {
        return (this.zzb & 8388608) != 0;
    }

    public final boolean X0() {
        return (this.zzd & 524288) != 0;
    }

    public final /* synthetic */ void X1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final boolean Y() {
        return this.zzD;
    }

    public final String Y0() {
        return this.zzai;
    }

    public final /* synthetic */ void Y1(long j10) {
        this.zzb |= 524288;
        this.zzz = j10;
    }

    public final List Z() {
        return this.zzE;
    }

    public final int Z0() {
        return this.zzaj;
    }

    public final /* synthetic */ void Z1(int i10) {
        this.zzb |= 1048576;
        this.zzA = i10;
    }

    public final String a0() {
        return this.zzF;
    }

    public final boolean a1() {
        return (this.zzd & 4194304) != 0;
    }

    public final /* synthetic */ void a2(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final boolean b0() {
        return (this.zzb & 33554432) != 0;
    }

    public final a6 b1() {
        a6 a6Var = this.zzal;
        return a6Var == null ? a6.P() : a6Var;
    }

    public final /* synthetic */ void b2() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final int c0() {
        return this.zzG;
    }

    public final boolean c1() {
        return (this.zzd & 8388608) != 0;
    }

    public final /* synthetic */ void c2(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final boolean d0() {
        return (this.zzb & 536870912) != 0;
    }

    public final int d1() {
        return this.zzam;
    }

    public final /* synthetic */ void d2(boolean z10) {
        this.zzb |= 8388608;
        this.zzD = z10;
    }

    public final long e0() {
        return this.zzK;
    }

    public final boolean e1() {
        return (this.zzd & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
    }

    public final /* synthetic */ void e2(Iterable iterable) {
        pb pbVar = this.zzE;
        if (!pbVar.zza()) {
            this.zzE = gb.B(pbVar);
        }
        r9.i(iterable, this.zzE);
    }

    public final boolean f0() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final w5 f1() {
        w5 w5Var = this.zzan;
        return w5Var == null ? w5.i0() : w5Var;
    }

    public final /* synthetic */ void f2() {
        this.zzE = gb.A();
    }

    public final String g0() {
        return this.zzM;
    }

    public final boolean g1() {
        return (this.zzd & 67108864) != 0;
    }

    public final /* synthetic */ void g2(String str) {
        str.getClass();
        this.zzb |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        this.zzF = str;
    }

    public final boolean h0() {
        return (this.zzb & 1) != 0;
    }

    public final p7 h1() {
        p7 p7Var = this.zzap;
        return p7Var == null ? p7.H() : p7Var;
    }

    public final /* synthetic */ void h2(int i10) {
        this.zzb |= 33554432;
        this.zzG = i10;
    }

    public final boolean i0() {
        return (this.zzd & 134217728) != 0;
    }

    public final int i1() {
        return this.zze;
    }

    public final /* synthetic */ void i2() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final long j0() {
        return this.zzaq;
    }

    public final /* synthetic */ void j1(long j10) {
        this.zzb |= 536870912;
        this.zzK = j10;
    }

    public final List j2() {
        return this.zzf;
    }

    public final boolean k0() {
        return (this.zzd & 536870912) != 0;
    }

    public final /* synthetic */ void k1(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final k6 l0() {
        k6 k6Var = this.zzas;
        return k6Var == null ? k6.H() : k6Var;
    }

    public final /* synthetic */ void l1() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final void l2() {
        pb pbVar = this.zzf;
        if (pbVar.zza()) {
            return;
        }
        this.zzf = gb.B(pbVar);
    }

    public final /* synthetic */ void m1(int i10) {
        this.zzd |= 2;
        this.zzO = i10;
    }

    public final void m2() {
        pb pbVar = this.zzg;
        if (pbVar.zza()) {
            return;
        }
        this.zzg = gb.B(pbVar);
    }

    public final /* synthetic */ void n1(d7 d7Var) {
        d7Var.getClass();
        this.zzQ = d7Var;
        this.zzd |= 8;
    }

    public final int n2() {
        return this.zzf.size();
    }

    public final /* synthetic */ void o0(int i10) {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void o1(Iterable iterable) {
        nb nbVar = this.zzR;
        if (!nbVar.zza()) {
            int size = nbVar.size();
            this.zzR = nbVar.v(size + size);
        }
        r9.i(iterable, this.zzR);
    }

    public final o6 o2(int i10) {
        return (o6) this.zzf.get(i10);
    }

    public final /* synthetic */ void p0(int i10, o6 o6Var) {
        o6Var.getClass();
        l2();
        this.zzf.set(i10, o6Var);
    }

    public final /* synthetic */ void p1(long j10) {
        this.zzd |= 16;
        this.zzS = j10;
    }

    public final List p2() {
        return this.zzg;
    }

    public final /* synthetic */ void q0(o6 o6Var) {
        o6Var.getClass();
        l2();
        this.zzf.add(o6Var);
    }

    public final /* synthetic */ void q1(long j10) {
        this.zzd |= 32;
        this.zzT = j10;
    }

    public final int q2() {
        return this.zzg.size();
    }

    public final /* synthetic */ void r0(Iterable iterable) {
        l2();
        r9.i(iterable, this.zzf);
    }

    public final /* synthetic */ void r1(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final r7 r2(int i10) {
        return (r7) this.zzg.get(i10);
    }

    public final /* synthetic */ void s0() {
        this.zzf = gb.A();
    }

    public final /* synthetic */ void s1(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final boolean s2() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void t0(int i10) {
        l2();
        this.zzf.remove(i10);
    }

    public final /* synthetic */ void t1() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final long t2() {
        return this.zzh;
    }

    public final /* synthetic */ void u0(int i10, r7 r7Var) {
        r7Var.getClass();
        m2();
        this.zzg.set(i10, r7Var);
    }

    public final /* synthetic */ void u1(Iterable iterable) {
        pb pbVar = this.zzac;
        if (!pbVar.zza()) {
            this.zzac = gb.B(pbVar);
        }
        r9.i(iterable, this.zzac);
    }

    public final boolean u2() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void v0(r7 r7Var) {
        r7Var.getClass();
        m2();
        this.zzg.add(r7Var);
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzad = str;
    }

    public final long v2() {
        return this.zzi;
    }

    public final /* synthetic */ void w0(Iterable iterable) {
        m2();
        r9.i(iterable, this.zzg);
    }

    public final /* synthetic */ void w1(long j10) {
        this.zzd |= 32768;
        this.zzae = j10;
    }

    public final boolean w2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void x0(int i10) {
        m2();
        this.zzg.remove(i10);
    }

    public final /* synthetic */ void x1(boolean z10) {
        this.zzd |= 65536;
        this.zzaf = z10;
    }

    public final long x2() {
        return this.zzj;
    }

    public final /* synthetic */ void y0(long j10) {
        this.zzb |= 2;
        this.zzh = j10;
    }

    public final /* synthetic */ void y1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final boolean y2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void z0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void z1(boolean z10) {
        this.zzd |= 262144;
        this.zzah = z10;
    }

    public final long z2() {
        return this.zzk;
    }
}
