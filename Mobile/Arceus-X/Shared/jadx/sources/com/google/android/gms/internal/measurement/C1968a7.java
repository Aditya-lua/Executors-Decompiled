package com.google.android.gms.internal.measurement;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1968a7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C1968a7 zzat;
    private int zzA;
    private boolean zzD;
    private int zzG;
    private int zzH;
    private int zzI;
    private long zzK;
    private long zzL;
    private int zzO;
    private C2025d7 zzQ;
    private long zzS;
    private long zzT;
    private int zzW;
    private boolean zzX;
    private boolean zzZ;
    private C2334u6 zzaa;
    private long zzae;
    private boolean zzaf;
    private boolean zzah;
    private int zzaj;
    private C1967a6 zzal;
    private int zzam;
    private C2369w5 zzan;
    private C2245p7 zzap;
    private long zzaq;
    private C2154k6 zzas;
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
    private InterfaceC2249pb zzf = AbstractC2086gb.m10052A();
    private InterfaceC2249pb zzg = AbstractC2086gb.m10052A();
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
    private InterfaceC2249pb zzE = AbstractC2086gb.m10052A();
    private String zzF = "";
    private String zzJ = "";
    private String zzM = "";
    private String zzN = "";
    private String zzP = "";
    private InterfaceC2213nb zzR = AbstractC2086gb.m10060x();
    private String zzU = "";
    private String zzV = "";
    private String zzY = "";
    private String zzab = "";
    private InterfaceC2249pb zzac = AbstractC2086gb.m10052A();
    private String zzad = "";
    private String zzag = "";
    private String zzai = "";
    private String zzak = "";
    private String zzao = "";
    private String zzar = "";

    static {
        C1968a7 c1968a7 = new C1968a7();
        zzat = c1968a7;
        AbstractC2086gb.m10057t(C1968a7.class, c1968a7);
    }

    /* JADX INFO: renamed from: m0 */
    public static C2424z6 m9604m0() {
        return (C2424z6) zzat.m10074p();
    }

    /* JADX INFO: renamed from: n0 */
    public static C2424z6 m9605n0(C1968a7 c1968a7) {
        C2010cb c2010cbM10074p = zzat.m10074p();
        c2010cbM10074p.m9883v(c1968a7);
        return (C2424z6) c2010cbM10074p;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m9606A0(long j10) {
        this.zzb |= 4;
        this.zzi = j10;
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m9607A1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    /* JADX INFO: renamed from: A2 */
    public final boolean m9608A2() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m9609B0(long j10) {
        this.zzb |= 8;
        this.zzj = j10;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m9610B1(int i10) {
        this.zzd |= 1048576;
        this.zzaj = i10;
    }

    /* JADX INFO: renamed from: B2 */
    public final long m9611B2() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m9612C0(long j10) {
        this.zzb |= 16;
        this.zzk = j10;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m9613C1(C1967a6 c1967a6) {
        c1967a6.getClass();
        this.zzal = c1967a6;
        this.zzd |= 4194304;
    }

    /* JADX INFO: renamed from: C2 */
    public final String m9614C2() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m9615D0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m9616D1(int i10) {
        this.zzd |= 8388608;
        this.zzam = i10;
    }

    /* JADX INFO: renamed from: D2 */
    public final String m9617D2() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", C2226o6.class, "zzg", C2281r7.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", C2005c6.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", C2279r5.f8608a, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i11 == 3) {
            return new C1968a7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2424z6(bArr);
        }
        if (i11 == 5) {
            return zzat;
        }
        throw null;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m9618E0(long j10) {
        this.zzb |= 32;
        this.zzl = j10;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m9619E1(C2369w5 c2369w5) {
        c2369w5.getClass();
        this.zzan = c2369w5;
        this.zzd |= 16777216;
    }

    /* JADX INFO: renamed from: E2 */
    public final String m9620E2() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: F */
    public final String m9621F() {
        return this.zzs;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m9622F0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m9623F1(C2245p7 c2245p7) {
        this.zzap = c2245p7;
        this.zzd |= 67108864;
    }

    /* JADX INFO: renamed from: F2 */
    public final String m9624F2() {
        return this.zzp;
    }

    /* JADX INFO: renamed from: G */
    public final String m9625G() {
        return this.zzt;
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m9626G0(String str) {
        this.zzb |= 64;
        this.zzm = "android";
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m9627G1(long j10) {
        this.zzd |= 134217728;
        this.zzaq = j10;
    }

    /* JADX INFO: renamed from: G2 */
    public final boolean m9628G2() {
        return (this.zzb & 1024) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9629H() {
        return (this.zzb & 16384) != 0;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m9630H0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m9631H1(String str) {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    /* JADX INFO: renamed from: H2 */
    public final int m9632H2() {
        return this.zzq;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m9633I0() {
        return (this.zzd & 2) != 0;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m9634I1(C2154k6 c2154k6) {
        c2154k6.getClass();
        this.zzas = c2154k6;
        this.zzd |= 536870912;
    }

    /* JADX INFO: renamed from: I2 */
    public final String m9635I2() {
        return this.zzr;
    }

    /* JADX INFO: renamed from: J */
    public final long m9636J() {
        return this.zzu;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m9637J0() {
        return this.zzO;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m9638J1(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9639K() {
        return (this.zzb & 32768) != 0;
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m9640K0() {
        return (this.zzd & 16) != 0;
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m9641K1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    /* JADX INFO: renamed from: L0 */
    public final long m9642L0() {
        return this.zzS;
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m9643L1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    /* JADX INFO: renamed from: M */
    public final long m9644M() {
        return this.zzv;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m9645M0() {
        return (this.zzd & 128) != 0;
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m9646M1(int i10) {
        this.zzb |= 1024;
        this.zzq = i10;
    }

    /* JADX INFO: renamed from: N */
    public final String m9647N() {
        return this.zzw;
    }

    /* JADX INFO: renamed from: N0 */
    public final String m9648N0() {
        return this.zzV;
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m9649N1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m9650O() {
        return (this.zzb & 131072) != 0;
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m9651O0() {
        return (this.zzd & 8192) != 0;
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m9652O1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m9653P() {
        return this.zzx;
    }

    /* JADX INFO: renamed from: P0 */
    public final String m9654P0() {
        return this.zzab;
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m9655P1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    /* JADX INFO: renamed from: Q */
    public final String m9656Q() {
        return this.zzy;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m9657Q0() {
        return (this.zzd & 32768) != 0;
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m9658Q1(long j10) {
        this.zzb |= 16384;
        this.zzu = j10;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m9659R() {
        return (this.zzb & 524288) != 0;
    }

    /* JADX INFO: renamed from: R0 */
    public final long m9660R0() {
        return this.zzae;
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m9661R1(long j10) {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    /* JADX INFO: renamed from: S */
    public final long m9662S() {
        return this.zzz;
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m9663S0() {
        return this.zzaf;
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m9664S1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m9665T() {
        return (this.zzb & 1048576) != 0;
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m9666T0() {
        return (this.zzd & 131072) != 0;
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m9667T1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    /* JADX INFO: renamed from: U */
    public final int m9668U() {
        return this.zzA;
    }

    /* JADX INFO: renamed from: U0 */
    public final String m9669U0() {
        return this.zzag;
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m9670U1(boolean z10) {
        this.zzb |= 131072;
        this.zzx = z10;
    }

    /* JADX INFO: renamed from: V */
    public final String m9671V() {
        return this.zzB;
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m9672V0() {
        return (this.zzd & 262144) != 0;
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m9673V1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    /* JADX INFO: renamed from: W */
    public final String m9674W() {
        return this.zzC;
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m9675W0() {
        return this.zzah;
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m9676W1(String str) {
        str.getClass();
        this.zzb |= 262144;
        this.zzy = str;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m9677X() {
        return (this.zzb & 8388608) != 0;
    }

    /* JADX INFO: renamed from: X0 */
    public final boolean m9678X0() {
        return (this.zzd & 524288) != 0;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m9679X1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m9680Y() {
        return this.zzD;
    }

    /* JADX INFO: renamed from: Y0 */
    public final String m9681Y0() {
        return this.zzai;
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m9682Y1(long j10) {
        this.zzb |= 524288;
        this.zzz = j10;
    }

    /* JADX INFO: renamed from: Z */
    public final List m9683Z() {
        return this.zzE;
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m9684Z0() {
        return this.zzaj;
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m9685Z1(int i10) {
        this.zzb |= 1048576;
        this.zzA = i10;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m9686a0() {
        return this.zzF;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m9687a1() {
        return (this.zzd & 4194304) != 0;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m9688a2(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m9689b0() {
        return (this.zzb & 33554432) != 0;
    }

    /* JADX INFO: renamed from: b1 */
    public final C1967a6 m9690b1() {
        C1967a6 c1967a6 = this.zzal;
        return c1967a6 == null ? C1967a6.m9587P() : c1967a6;
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m9691b2() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    /* JADX INFO: renamed from: c0 */
    public final int m9692c0() {
        return this.zzG;
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m9693c1() {
        return (this.zzd & 8388608) != 0;
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m9694c2(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m9695d0() {
        return (this.zzb & 536870912) != 0;
    }

    /* JADX INFO: renamed from: d1 */
    public final int m9696d1() {
        return this.zzam;
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m9697d2(boolean z10) {
        this.zzb |= 8388608;
        this.zzD = z10;
    }

    /* JADX INFO: renamed from: e0 */
    public final long m9698e0() {
        return this.zzK;
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m9699e1() {
        return (this.zzd & 16777216) != 0;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m9700e2(Iterable iterable) {
        InterfaceC2249pb interfaceC2249pb = this.zzE;
        if (!interfaceC2249pb.zza()) {
            this.zzE = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        AbstractC2283r9.m10627i(iterable, this.zzE);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m9701f0() {
        return (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0;
    }

    /* JADX INFO: renamed from: f1 */
    public final C2369w5 m9702f1() {
        C2369w5 c2369w5 = this.zzan;
        return c2369w5 == null ? C2369w5.m10881i0() : c2369w5;
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m9703f2() {
        this.zzE = AbstractC2086gb.m10052A();
    }

    /* JADX INFO: renamed from: g0 */
    public final String m9704g0() {
        return this.zzM;
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m9705g1() {
        return (this.zzd & 67108864) != 0;
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m9706g2(String str) {
        str.getClass();
        this.zzb |= 16777216;
        this.zzF = str;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m9707h0() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: h1 */
    public final C2245p7 m9708h1() {
        C2245p7 c2245p7 = this.zzap;
        return c2245p7 == null ? C2245p7.m10521H() : c2245p7;
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m9709h2(int i10) {
        this.zzb |= 33554432;
        this.zzG = i10;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m9710i0() {
        return (this.zzd & 134217728) != 0;
    }

    /* JADX INFO: renamed from: i1 */
    public final int m9711i1() {
        return this.zze;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m9712i2() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    /* JADX INFO: renamed from: j0 */
    public final long m9713j0() {
        return this.zzaq;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m9714j1(long j10) {
        this.zzb |= 536870912;
        this.zzK = j10;
    }

    /* JADX INFO: renamed from: j2 */
    public final List m9715j2() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m9716k0() {
        return (this.zzd & 536870912) != 0;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m9717k1(String str) {
        str.getClass();
        this.zzb |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.zzM = str;
    }

    /* JADX INFO: renamed from: l0 */
    public final C2154k6 m9718l0() {
        C2154k6 c2154k6 = this.zzas;
        return c2154k6 == null ? C2154k6.m10313H() : c2154k6;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m9719l1() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    /* JADX INFO: renamed from: l2 */
    public final void m9720l2() {
        InterfaceC2249pb interfaceC2249pb = this.zzf;
        if (interfaceC2249pb.zza()) {
            return;
        }
        this.zzf = AbstractC2086gb.m10053B(interfaceC2249pb);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m9721m1(int i10) {
        this.zzd |= 2;
        this.zzO = i10;
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9722m2() {
        InterfaceC2249pb interfaceC2249pb = this.zzg;
        if (interfaceC2249pb.zza()) {
            return;
        }
        this.zzg = AbstractC2086gb.m10053B(interfaceC2249pb);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m9723n1(C2025d7 c2025d7) {
        c2025d7.getClass();
        this.zzQ = c2025d7;
        this.zzd |= 8;
    }

    /* JADX INFO: renamed from: n2 */
    public final int m9724n2() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m9725o0(int i10) {
        this.zzb |= 1;
        this.zze = 1;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m9726o1(Iterable iterable) {
        InterfaceC2213nb interfaceC2213nb = this.zzR;
        if (!interfaceC2213nb.zza()) {
            int size = interfaceC2213nb.size();
            this.zzR = interfaceC2213nb.mo9891v(size + size);
        }
        AbstractC2283r9.m10627i(iterable, this.zzR);
    }

    /* JADX INFO: renamed from: o2 */
    public final C2226o6 m9727o2(int i10) {
        return (C2226o6) this.zzf.get(i10);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m9728p0(int i10, C2226o6 c2226o6) {
        c2226o6.getClass();
        m9720l2();
        this.zzf.set(i10, c2226o6);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m9729p1(long j10) {
        this.zzd |= 16;
        this.zzS = j10;
    }

    /* JADX INFO: renamed from: p2 */
    public final List m9730p2() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m9731q0(C2226o6 c2226o6) {
        c2226o6.getClass();
        m9720l2();
        this.zzf.add(c2226o6);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m9732q1(long j10) {
        this.zzd |= 32;
        this.zzT = j10;
    }

    /* JADX INFO: renamed from: q2 */
    public final int m9733q2() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m9734r0(Iterable iterable) {
        m9720l2();
        AbstractC2283r9.m10627i(iterable, this.zzf);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m9735r1(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    /* JADX INFO: renamed from: r2 */
    public final C2281r7 m9736r2(int i10) {
        return (C2281r7) this.zzg.get(i10);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m9737s0() {
        this.zzf = AbstractC2086gb.m10052A();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m9738s1(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    /* JADX INFO: renamed from: s2 */
    public final boolean m9739s2() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m9740t0(int i10) {
        m9720l2();
        this.zzf.remove(i10);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m9741t1() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    /* JADX INFO: renamed from: t2 */
    public final long m9742t2() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m9743u0(int i10, C2281r7 c2281r7) {
        c2281r7.getClass();
        m9722m2();
        this.zzg.set(i10, c2281r7);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m9744u1(Iterable iterable) {
        InterfaceC2249pb interfaceC2249pb = this.zzac;
        if (!interfaceC2249pb.zza()) {
            this.zzac = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        AbstractC2283r9.m10627i(iterable, this.zzac);
    }

    /* JADX INFO: renamed from: u2 */
    public final boolean m9745u2() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m9746v0(C2281r7 c2281r7) {
        c2281r7.getClass();
        m9722m2();
        this.zzg.add(c2281r7);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m9747v1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    /* JADX INFO: renamed from: v2 */
    public final long m9748v2() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m9749w0(Iterable iterable) {
        m9722m2();
        AbstractC2283r9.m10627i(iterable, this.zzg);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m9750w1(long j10) {
        this.zzd |= 32768;
        this.zzae = j10;
    }

    /* JADX INFO: renamed from: w2 */
    public final boolean m9751w2() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m9752x0(int i10) {
        m9722m2();
        this.zzg.remove(i10);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m9753x1(boolean z10) {
        this.zzd |= 65536;
        this.zzaf = z10;
    }

    /* JADX INFO: renamed from: x2 */
    public final long m9754x2() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m9755y0(long j10) {
        this.zzb |= 2;
        this.zzh = j10;
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m9756y1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    /* JADX INFO: renamed from: y2 */
    public final boolean m9757y2() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m9758z0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m9759z1(boolean z10) {
        this.zzd |= 262144;
        this.zzah = z10;
    }

    /* JADX INFO: renamed from: z2 */
    public final long m9760z2() {
        return this.zzk;
    }
}
