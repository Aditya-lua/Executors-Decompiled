package c2;

import d2.n;
import d2.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    public int A0;
    public boolean B0;
    public boolean C0;
    public float[] D0;
    public e[] E0;
    public e[] F0;
    public e G0;
    public e H0;
    public int I0;
    public int J0;
    public boolean K;
    public d V;
    public d[] W;
    public ArrayList<d> X;
    public boolean[] Y;
    public b[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e f4361a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f4362b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d2.c f4363c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f4364c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d2.c f4365d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f4366d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f4368e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f4370f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f4372g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f4374h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f4376i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f4378j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f4380k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f4382l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f4384m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f4386n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f4387o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f4388o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f4390p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Object f4392q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f4394r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f4396s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f4398t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f4400u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f4402v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f4404w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f4406x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f4408y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f4410z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4360a = false;
    public p[] b = new p[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d2.l f4367e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f4369f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f4371g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4373h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4375i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4377j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4379k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4381l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4383m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b2.a f4385n = new b2.a(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4389p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4391q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4393r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4395s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4397t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4399u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4401v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4403w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4405x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f4407y = new int[2];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4409z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    public int F = -1;
    public float G = 1.0f;
    public int[] H = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float I = Float.NaN;
    public boolean J = false;
    public boolean L = false;
    public int M = 0;
    public int N = 0;
    public d O = new d(this, d.a.LEFT);
    public d P = new d(this, d.a.TOP);
    public d Q = new d(this, d.a.RIGHT);
    public d R = new d(this, d.a.BOTTOM);
    public d S = new d(this, d.a.BASELINE);
    public d T = new d(this, d.a.CENTER_X);
    public d U = new d(this, d.a.CENTER_Y);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4411a;

        static {
            int[] iArr = new int[d.a.values().length];
            f4411a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4411a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4411a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4411a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4411a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4411a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4411a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4411a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4411a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.a.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList<>();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f4361a0 = null;
        this.f4362b0 = 0;
        this.f4364c0 = 0;
        this.f4366d0 = 0.0f;
        this.f4368e0 = -1;
        this.f4370f0 = 0;
        this.f4372g0 = 0;
        this.f4374h0 = 0;
        this.f4376i0 = 0;
        this.f4378j0 = 0;
        this.f4380k0 = 0;
        this.f4382l0 = 0;
        float f10 = K0;
        this.f4388o0 = f10;
        this.f4390p0 = f10;
        this.f4394r0 = 0;
        this.f4396s0 = 0;
        this.f4398t0 = false;
        this.f4400u0 = null;
        this.f4402v0 = null;
        this.f4408y0 = false;
        this.f4410z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    public b A() {
        return this.Z[0];
    }

    public final void A0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public int B() {
        d dVar = this.O;
        int i10 = dVar != null ? dVar.f4348g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i10 + dVar2.f4348g : i10;
    }

    public void B0(int i10) {
        this.f4382l0 = i10;
        this.J = i10 > 0;
    }

    public int C() {
        return this.M;
    }

    public void C0(Object obj) {
        this.f4392q0 = obj;
    }

    public int D() {
        return this.N;
    }

    public void D0(String str) {
        this.f4400u0 = str;
    }

    public int E(int i10) {
        if (i10 == 0) {
            return W();
        }
        if (i10 == 1) {
            return x();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void E0(String str) {
        float fAbs;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f4366d0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i11 = 0;
        int i12 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i11 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i12 = i11;
            i11 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i11);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i10;
                }
            } else {
                String strSubstring3 = str.substring(i11, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i10;
                } else {
                    float f10 = Float.parseFloat(strSubstring3);
                    float f11 = Float.parseFloat(strSubstring4);
                    if (f10 <= 0.0f || f11 <= 0.0f) {
                        fAbs = i10;
                    } else {
                        fAbs = i12 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i10 = (fAbs > i10 ? 1 : (fAbs == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f4366d0 = fAbs;
            this.f4368e0 = i12;
        }
    }

    public int F() {
        return this.H[1];
    }

    public void F0(int i10) {
        if (this.J) {
            int i11 = i10 - this.f4382l0;
            int i12 = this.f4364c0 + i11;
            this.f4372g0 = i11;
            this.P.t(i11);
            this.R.t(i12);
            this.S.t(i10);
            this.f4391q = true;
        }
    }

    public int G() {
        return this.H[0];
    }

    public void G0(int i10, int i11) {
        if (this.f4389p) {
            return;
        }
        this.O.t(i10);
        this.Q.t(i11);
        this.f4370f0 = i10;
        this.f4362b0 = i11 - i10;
        this.f4389p = true;
    }

    public int H() {
        return this.f4386n0;
    }

    public void H0(int i10) {
        this.O.t(i10);
        this.f4370f0 = i10;
    }

    public int I() {
        return this.f4384m0;
    }

    public void I0(int i10) {
        this.P.t(i10);
        this.f4372g0 = i10;
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.R).f4347f) != null && dVar2.f4347f == dVar) {
                return dVar2.f4345d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f4347f;
        if (dVar4 == null || dVar4.f4347f != dVar3) {
            return null;
        }
        return dVar4.f4345d;
    }

    public void J0(int i10, int i11) {
        if (this.f4391q) {
            return;
        }
        this.P.t(i10);
        this.R.t(i11);
        this.f4372g0 = i10;
        this.f4364c0 = i11 - i10;
        if (this.J) {
            this.S.t(i10 + this.f4382l0);
        }
        this.f4391q = true;
    }

    public e K() {
        return this.f4361a0;
    }

    public void K0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f4370f0 = i10;
        this.f4372g0 = i11;
        if (this.f4396s0 == 8) {
            this.f4362b0 = 0;
            this.f4364c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f4362b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f4364c0)) {
            i17 = i14;
        }
        this.f4362b0 = i16;
        this.f4364c0 = i17;
        int i18 = this.f4386n0;
        if (i17 < i18) {
            this.f4364c0 = i18;
        }
        int i19 = this.f4384m0;
        if (i16 < i19) {
            this.f4362b0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f4362b0 = Math.min(this.f4362b0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f4364c0 = Math.min(this.f4364c0, i21);
        }
        int i22 = this.f4362b0;
        if (i16 != i22) {
            this.f4381l = i22;
        }
        int i23 = this.f4364c0;
        if (i17 != i23) {
            this.f4383m = i23;
        }
    }

    public e L(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.P).f4347f) != null && dVar2.f4347f == dVar) {
                return dVar2.f4345d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f4347f;
        if (dVar4 == null || dVar4.f4347f != dVar3) {
            return null;
        }
        return dVar4.f4345d;
    }

    public void L0(boolean z10) {
        this.J = z10;
    }

    public int M() {
        return X() + this.f4362b0;
    }

    public void M0(int i10) {
        this.f4364c0 = i10;
        int i11 = this.f4386n0;
        if (i10 < i11) {
            this.f4364c0 = i11;
        }
    }

    public p N(int i10) {
        if (i10 == 0) {
            return this.f4367e;
        }
        if (i10 == 1) {
            return this.f4369f;
        }
        return null;
    }

    public void N0(float f10) {
        this.f4388o0 = f10;
    }

    public void O(StringBuilder sb2) {
        sb2.append("  " + this.f4387o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f4362b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f4364c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f4370f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f4372g0);
        sb2.append("\n");
        Q(sb2, "left", this.O);
        Q(sb2, "top", this.P);
        Q(sb2, "right", this.Q);
        Q(sb2, "bottom", this.R);
        Q(sb2, "baseline", this.S);
        Q(sb2, "centerX", this.T);
        Q(sb2, "centerY", this.U);
        P(sb2, "    width", this.f4362b0, this.f4384m0, this.H[0], this.f4381l, this.f4409z, this.f4403w, this.B, this.Z[0], this.D0[0]);
        P(sb2, "    height", this.f4364c0, this.f4386n0, this.H[1], this.f4383m, this.C, this.f4405x, this.E, this.Z[1], this.D0[1]);
        A0(sb2, "    dimensionRatio", this.f4366d0, this.f4368e0);
        x0(sb2, "    horizontalBias", this.f4388o0, K0);
        x0(sb2, "    verticalBias", this.f4390p0, K0);
        y0(sb2, "    horizontalChainStyle", this.f4410z0, 0);
        y0(sb2, "    verticalChainStyle", this.A0, 0);
        sb2.append("  }");
    }

    public void O0(int i10) {
        this.f4410z0 = i10;
    }

    public final void P(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, b bVar, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        z0(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        y0(sb2, "      size", i10, 0);
        y0(sb2, "      min", i11, 0);
        y0(sb2, "      max", i12, Integer.MAX_VALUE);
        y0(sb2, "      matchMin", i14, 0);
        y0(sb2, "      matchDef", i15, 0);
        x0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public void P0(int i10, int i11) {
        this.f4370f0 = i10;
        int i12 = i11 - i10;
        this.f4362b0 = i12;
        int i13 = this.f4384m0;
        if (i12 < i13) {
            this.f4362b0 = i13;
        }
    }

    public final void Q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f4347f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f4347f);
        sb2.append("'");
        if (dVar.f4349h != Integer.MIN_VALUE || dVar.f4348g != 0) {
            sb2.append(",");
            sb2.append(dVar.f4348g);
            if (dVar.f4349h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f4349h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public void Q0(b bVar) {
        this.Z[0] = bVar;
    }

    public float R() {
        return this.f4390p0;
    }

    public void R0(int i10, int i11, int i12, float f10) {
        this.f4403w = i10;
        this.f4409z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f4403w = 2;
    }

    public int S() {
        return this.A0;
    }

    public void S0(float f10) {
        this.D0[0] = f10;
    }

    public b T() {
        return this.Z[1];
    }

    public void T0(int i10, boolean z10) {
        this.Y[i10] = z10;
    }

    public int U() {
        int i10 = this.O != null ? this.P.f4348g : 0;
        return this.Q != null ? i10 + this.R.f4348g : i10;
    }

    public void U0(boolean z10) {
        this.K = z10;
    }

    public int V() {
        return this.f4396s0;
    }

    public void V0(boolean z10) {
        this.L = z10;
    }

    public int W() {
        if (this.f4396s0 == 8) {
            return 0;
        }
        return this.f4362b0;
    }

    public void W0(int i10, int i11) {
        this.M = i10;
        this.N = i11;
        Z0(false);
    }

    public int X() {
        e eVar = this.f4361a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f4370f0 : ((f) eVar).S0 + this.f4370f0;
    }

    public void X0(int i10) {
        this.H[1] = i10;
    }

    public int Y() {
        e eVar = this.f4361a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f4372g0 : ((f) eVar).T0 + this.f4372g0;
    }

    public void Y0(int i10) {
        this.H[0] = i10;
    }

    public boolean Z() {
        return this.J;
    }

    public void Z0(boolean z10) {
        this.f4375i = z10;
    }

    public boolean a0(int i10) {
        if (i10 == 0) {
            return (this.O.f4347f != null ? 1 : 0) + (this.Q.f4347f != null ? 1 : 0) < 2;
        }
        return ((this.P.f4347f != null ? 1 : 0) + (this.R.f4347f != null ? 1 : 0)) + (this.S.f4347f != null ? 1 : 0) < 2;
    }

    public void a1(int i10) {
        if (i10 < 0) {
            this.f4386n0 = 0;
        } else {
            this.f4386n0 = i10;
        }
    }

    public boolean b0() {
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.X.get(i10).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i10) {
        if (i10 < 0) {
            this.f4384m0 = 0;
        } else {
            this.f4384m0 = i10;
        }
    }

    public boolean c0() {
        return (this.f4381l == -1 && this.f4383m == -1) ? false : true;
    }

    public void c1(int i10, int i11) {
        this.f4370f0 = i10;
        this.f4372g0 = i11;
    }

    public final void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    public boolean d0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.O.f4347f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.Q.f4347f) != null && dVar2.n() && (this.Q.f4347f.e() - this.Q.f()) - (this.O.f4347f.e() + this.O.f()) >= i11;
        }
        d dVar4 = this.P.f4347f;
        if (dVar4 != null && dVar4.n() && (dVar = this.R.f4347f) != null && dVar.n() && (this.R.f4347f.e() - this.R.f()) - (this.P.f4347f.e() + this.P.f()) >= i11) {
            return true;
        }
        return false;
    }

    public void d1(e eVar) {
        this.f4361a0 = eVar;
    }

    public void e(f fVar, z1.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.V1(64));
        }
        if (i10 == 0) {
            HashSet<d> hashSetD = this.O.d();
            if (hashSetD != null) {
                Iterator<d> it = hashSetD.iterator();
                while (it.hasNext()) {
                    it.next().f4345d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> hashSetD2 = this.Q.d();
            if (hashSetD2 != null) {
                Iterator<d> it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    it2.next().f4345d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetD3 = this.P.d();
        if (hashSetD3 != null) {
            Iterator<d> it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                it3.next().f4345d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSetD4 = this.R.d();
        if (hashSetD4 != null) {
            Iterator<d> it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                it4.next().f4345d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSetD5 = this.S.d();
        if (hashSetD5 != null) {
            Iterator<d> it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                it5.next().f4345d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public void e0(d.a aVar, e eVar, d.a aVar2, int i10, int i11) {
        o(aVar).b(eVar.o(aVar2), i10, i11, true);
    }

    public void e1(float f10) {
        this.f4390p0 = f10;
    }

    public boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public final boolean f0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.W;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f4347f;
        return (dVar4 == null || dVar4.f4347f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f4347f) == null || dVar2.f4347f != dVar) ? false : true;
    }

    public void f1(int i10) {
        this.A0 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02be  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x030b  */
    /* JADX WARN: Code duplicated, block: B:230:0x036a  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x0449  */
    /* JADX WARN: Code duplicated, block: B:264:0x045b  */
    /* JADX WARN: Code duplicated, block: B:265:0x045d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0460  */
    /* JADX WARN: Code duplicated, block: B:304:0x0537  */
    /* JADX WARN: Code duplicated, block: B:306:0x053e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0545  */
    /* JADX WARN: Code duplicated, block: B:309:0x0554  */
    /* JADX WARN: Code duplicated, block: B:310:0x0557  */
    /* JADX WARN: Code duplicated, block: B:313:0x056f  */
    /* JADX WARN: Multi-variable type inference failed */
    public void g(z1.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        e eVar;
        e eVar2;
        boolean z13;
        boolean z14;
        int i10;
        z1.i iVar;
        int i11;
        int i12;
        boolean z15;
        int i13;
        boolean z16;
        b bVar;
        b bVar2;
        boolean z17;
        int i14;
        int i15;
        boolean z18;
        z1.i iVar2;
        z1.i iVar3;
        z1.i iVar4;
        int i16;
        int i17;
        char c10;
        int i18;
        int i19;
        z1.d dVar2;
        boolean z19;
        n nVar;
        d2.l lVar;
        int i20;
        int i21;
        boolean zI0;
        boolean zK0;
        d2.l lVar2;
        n nVar2;
        z1.d dVar3 = dVar;
        z1.i iVarQ = dVar3.q(this.O);
        z1.i iVarQ2 = dVar3.q(this.Q);
        z1.i iVarQ3 = dVar3.q(this.P);
        z1.i iVarQ4 = dVar3.q(this.R);
        z1.i iVarQ5 = dVar3.q(this.S);
        e eVar3 = this.f4361a0;
        if (eVar3 == null) {
            z11 = false;
            z12 = false;
        } else {
            z12 = eVar3 != null && eVar3.Z[0] == b.WRAP_CONTENT;
            z11 = eVar3 != null && eVar3.Z[1] == b.WRAP_CONTENT;
            int i22 = this.f4401v;
            if (i22 == 1) {
                z11 = false;
            } else if (i22 == 2) {
                z12 = false;
            } else if (i22 == 3) {
                z11 = false;
                z12 = false;
            }
        }
        if (this.f4396s0 == 8 && !this.f4398t0 && !b0()) {
            boolean[] zArr = this.Y;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z20 = this.f4389p;
        if (z20 || this.f4391q) {
            if (z20) {
                dVar3.f(iVarQ, this.f4370f0);
                dVar3.f(iVarQ2, this.f4370f0 + this.f4362b0);
                if (z12 && (eVar2 = this.f4361a0) != null) {
                    if (this.f4379k) {
                        f fVar = (f) eVar2;
                        fVar.A1(this.O);
                        fVar.z1(this.Q);
                    } else {
                        dVar3.h(dVar3.q(eVar2.Q), iVarQ2, 0, 5);
                    }
                }
            }
            if (this.f4391q) {
                dVar3.f(iVarQ3, this.f4372g0);
                dVar3.f(iVarQ4, this.f4372g0 + this.f4364c0);
                if (this.S.m()) {
                    dVar3.f(iVarQ5, this.f4372g0 + this.f4382l0);
                }
                if (z11 && (eVar = this.f4361a0) != null) {
                    if (this.f4379k) {
                        f fVar2 = (f) eVar;
                        fVar2.F1(this.P);
                        fVar2.E1(this.R);
                    } else {
                        dVar3.h(dVar3.q(eVar.R), iVarQ4, 0, 5);
                    }
                }
            }
            if (this.f4389p && this.f4391q) {
                this.f4389p = false;
                this.f4391q = false;
                return;
            }
        }
        boolean z21 = z1.d.f37062s;
        if (z10 && (lVar2 = this.f4367e) != null && (nVar2 = this.f4369f) != null) {
            d2.f fVar3 = lVar2.f14381h;
            if (fVar3.f14337j && lVar2.f14382i.f14337j && nVar2.f14381h.f14337j && nVar2.f14382i.f14337j) {
                dVar3.f(iVarQ, fVar3.f14334g);
                dVar3.f(iVarQ2, this.f4367e.f14382i.f14334g);
                dVar3.f(iVarQ3, this.f4369f.f14381h.f14334g);
                dVar3.f(iVarQ4, this.f4369f.f14382i.f14334g);
                dVar3.f(iVarQ5, this.f4369f.f14360k.f14334g);
                if (this.f4361a0 != null) {
                    if (z12 && this.f4371g[0] && !i0()) {
                        dVar3.h(dVar3.q(this.f4361a0.Q), iVarQ2, 0, 8);
                    }
                    if (z11 && this.f4371g[1] && !k0()) {
                        dVar3.h(dVar3.q(this.f4361a0.R), iVarQ4, 0, 8);
                    }
                }
                this.f4389p = false;
                this.f4391q = false;
                return;
            }
        }
        if (this.f4361a0 != null) {
            if (f0(0)) {
                ((f) this.f4361a0).w1(this, 0);
                zI0 = true;
            } else {
                zI0 = i0();
            }
            if (f0(1)) {
                ((f) this.f4361a0).w1(this, 1);
                zK0 = true;
            } else {
                zK0 = k0();
            }
            if (!zI0 && z12 && this.f4396s0 != 8 && this.O.f4347f == null && this.Q.f4347f == null) {
                dVar3.h(dVar3.q(this.f4361a0.Q), iVarQ2, 0, 1);
            }
            if (!zK0 && z11 && this.f4396s0 != 8 && this.P.f4347f == null && this.R.f4347f == null && this.S == null) {
                dVar3.h(dVar3.q(this.f4361a0.R), iVarQ4, 0, 1);
            }
            z13 = zI0;
            z14 = zK0;
        } else {
            z13 = false;
            z14 = false;
        }
        int i23 = this.f4362b0;
        int i24 = this.f4384m0;
        if (i23 >= i24) {
            i24 = i23;
        }
        int i25 = this.f4364c0;
        int i26 = this.f4386n0;
        if (i25 >= i26) {
            i26 = i25;
        }
        b[] bVarArr = this.Z;
        b bVar3 = bVarArr[0];
        b bVar4 = b.MATCH_CONSTRAINT;
        boolean z22 = bVar3 != bVar4;
        b bVar5 = bVarArr[1];
        boolean z23 = bVar5 != bVar4;
        int i27 = this.f4368e0;
        this.F = i27;
        int i28 = i24;
        float f10 = this.f4366d0;
        this.G = f10;
        int i29 = this.f4403w;
        int i30 = this.f4405x;
        if (f10 > 0.0f) {
            i10 = i26;
            if (this.f4396s0 != 8) {
                i11 = (bVar3 == bVar4 && i29 == 0) ? 3 : i29;
                int i31 = (bVar5 == bVar4 && i30 == 0) ? 3 : i30;
                if (bVar3 == bVar4 && bVar5 == bVar4) {
                    iVar = iVarQ2;
                    i21 = 3;
                    if (i11 == 3 && i31 == 3) {
                        p1(z12, z11, z22, z23);
                    }
                    i12 = i31;
                    z15 = true;
                    int[] iArr = this.f4407y;
                    iArr[0] = i11;
                    iArr[1] = i12;
                    this.f4373h = z15;
                    if (z15) {
                        int i32 = this.F;
                        i13 = -1;
                        boolean z24 = i32 != 0 || i32 == -1;
                        if (z15 || !((i20 = this.F) == 1 || i20 == i13)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        bVar = this.Z[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2 || !(this instanceof f)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            i14 = 0;
                        } else {
                            i14 = i28;
                        }
                        boolean z25 = !this.V.o();
                        boolean[] zArr2 = this.Y;
                        boolean z26 = zArr2[0];
                        boolean z27 = zArr2[1];
                        if (this.f4397t != 2 || this.f4389p) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            if (z10 && (lVar = this.f4367e) != null) {
                                d2.f fVar4 = lVar.f14381h;
                                if (fVar4.f14337j && lVar.f14382i.f14337j) {
                                    if (z10) {
                                        dVar3.f(iVarQ, fVar4.f14334g);
                                        z1.i iVar5 = iVar;
                                        dVar3.f(iVar5, this.f4367e.f14382i.f14334g);
                                        if (this.f4361a0 != null && z12 && this.f4371g[0] && !i0()) {
                                            dVar3.h(dVar3.q(this.f4361a0.Q), iVar5, 0, 8);
                                        }
                                        iVar = iVar5;
                                    }
                                    i15 = i11;
                                    z18 = z12;
                                }
                            }
                            z1.i iVar6 = iVar;
                            e eVar4 = this.f4361a0;
                            z1.i iVarQ6 = eVar4 != null ? dVar3.q(eVar4.Q) : null;
                            e eVar5 = this.f4361a0;
                            z1.i iVarQ7 = eVar5 != null ? dVar3.q(eVar5.O) : null;
                            boolean z28 = this.f4371g[0];
                            b[] bVarArr2 = this.Z;
                            iVar = iVar6;
                            b bVar6 = bVarArr2[0];
                            d dVar4 = this.O;
                            z1.i iVar7 = iVarQ7;
                            d dVar5 = this.Q;
                            z15 = z15;
                            z18 = z12;
                            int i33 = this.f4370f0;
                            int i34 = this.f4384m0;
                            int i35 = this.H[0];
                            float f11 = this.f4388o0;
                            boolean z29 = bVarArr2[1] == bVar4;
                            iVarQ = iVarQ;
                            boolean z30 = z11;
                            z1.i iVar8 = iVarQ6;
                            z11 = z30;
                            i15 = i11;
                            bVar2 = bVar2;
                            dVar3 = dVar;
                            i(dVar3, true, z18, z11, z28, iVar7, iVar8, bVar6, z17, dVar4, dVar5, i33, i14, i34, i35, f11, z24, z29, z13, z14, z26, i15, i12, this.f4409z, this.A, this.B, z25);
                        }
                        if (z10 || (nVar = this.f4369f) == null) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            d2.f fVar5 = nVar.f14381h;
                            if (fVar5.f14337j && nVar.f14382i.f14337j) {
                                int i36 = fVar5.f14334g;
                                iVar2 = iVarQ3;
                                dVar3.f(iVar2, i36);
                                iVar3 = iVarQ4;
                                dVar3.f(iVar3, this.f4369f.f14382i.f14334g);
                                iVar4 = iVarQ5;
                                dVar3.f(iVar4, this.f4369f.f14360k.f14334g);
                                e eVar6 = this.f4361a0;
                                if (eVar6 == null || z14 || !z11) {
                                    i16 = 0;
                                    i17 = 8;
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                    if (this.f4371g[1]) {
                                        i16 = 0;
                                        i17 = 8;
                                        dVar3.h(dVar3.q(eVar6.R), iVar3, 0, 8);
                                    } else {
                                        i16 = 0;
                                        i17 = 8;
                                    }
                                }
                                i18 = i16;
                            } else {
                                iVar2 = r24;
                                iVar3 = r25;
                                iVar4 = r26;
                                i16 = 0;
                                i17 = 8;
                                c10 = 1;
                                i18 = 1;
                            }
                        }
                        if (this.f4399u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0 && !this.f4391q) {
                            boolean z31 = (this.Z[c10] == bVar2 && (this instanceof f)) ? c10 : i16;
                            int i37 = z31 != 0 ? i16 : i10;
                            e eVar7 = this.f4361a0;
                            z1.i iVarQ8 = eVar7 != null ? dVar3.q(eVar7.R) : null;
                            e eVar8 = this.f4361a0;
                            z1.i iVarQ9 = eVar8 != null ? dVar3.q(eVar8.P) : null;
                            if (this.f4382l0 > 0 || this.f4396s0 == i17) {
                                z19 = z25;
                                d dVar6 = this.S;
                                if (dVar6.f4347f != null) {
                                    dVar3.e(iVar4, iVar2, p(), i17);
                                    dVar3.e(iVar4, dVar3.q(this.S.f4347f), this.S.f(), i17);
                                    if (z11) {
                                        dVar3.h(iVarQ8, dVar3.q(this.R), i16, 5);
                                    }
                                    z19 = i16;
                                } else if (this.f4396s0 == i17) {
                                    dVar3.e(iVar4, iVar2, dVar6.f(), i17);
                                    z19 = z25;
                                } else {
                                    dVar3.e(iVar4, iVar2, p(), i17);
                                    z19 = z25;
                                }
                            }
                            z19 = z25;
                            boolean z32 = this.f4371g[c10];
                            b[] bVarArr3 = this.Z;
                            int i38 = i16;
                            i(dVar, false, z11, z18, z32, iVarQ9, iVarQ8, bVarArr3[c10], z31, this.P, this.R, this.f4372g0, i37, this.f4386n0, this.H[c10], this.f4390p0, z16, bVarArr3[i38] == bVar4 ? c10 : i38, z14, z13, z27, i12, i15, this.C, this.D, this.E, z19);
                        }
                        if (!z15) {
                            dVar2 = dVar;
                        } else if (this.F == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                            dVar2 = dVar;
                        }
                        if (this.V.o()) {
                            dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                        }
                        this.f4389p = false;
                        this.f4391q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.Z[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i14 = 0;
                    } else {
                        i14 = i28;
                    }
                    boolean z210 = !this.V.o();
                    boolean[] zArr3 = this.Y;
                    boolean z211 = zArr3[0];
                    boolean z212 = zArr3[1];
                    if (this.f4397t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f4399u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        dVar2 = dVar;
                    } else if (this.F == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                        dVar2 = dVar;
                    }
                    if (this.V.o()) {
                        dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                    }
                    this.f4389p = false;
                    this.f4391q = false;
                }
                iVar = iVarQ2;
                i21 = 3;
                if (bVar3 == bVar4 && i11 == i21) {
                    this.F = 0;
                    i28 = (int) (i25 * f10);
                    if (bVar5 != bVar4) {
                        i11 = 4;
                        i12 = i31;
                    } else {
                        i12 = i31;
                        z15 = true;
                    }
                    int[] iArr2 = this.f4407y;
                    iArr2[0] = i11;
                    iArr2[1] = i12;
                    this.f4373h = z15;
                    if (z15) {
                        int i39 = this.F;
                        i13 = -1;
                        if (i39 != 0) {
                        }
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar = this.Z[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i14 = 0;
                        } else {
                            i14 = i28;
                        }
                        boolean z213 = !this.V.o();
                        boolean[] zArr4 = this.Y;
                        boolean z214 = zArr4[0];
                        boolean z215 = zArr4[1];
                        if (this.f4397t != 2) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            i15 = i11;
                            z18 = z12;
                        }
                        if (z10) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        }
                        if (this.f4399u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0) {
                        }
                        if (!z15) {
                            dVar2 = dVar;
                        } else if (this.F == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                            dVar2 = dVar;
                        }
                        if (this.V.o()) {
                            dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                        }
                        this.f4389p = false;
                        this.f4391q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.Z[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i14 = 0;
                    } else {
                        i14 = i28;
                    }
                    boolean z216 = !this.V.o();
                    boolean[] zArr5 = this.Y;
                    boolean z217 = zArr5[0];
                    boolean z218 = zArr5[1];
                    if (this.f4397t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f4399u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        dVar2 = dVar;
                    } else if (this.F == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                        dVar2 = dVar;
                    }
                    if (this.V.o()) {
                        dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                    }
                    this.f4389p = false;
                    this.f4391q = false;
                }
                if (bVar5 == bVar4 && i31 == i21) {
                    this.F = 1;
                    if (i27 == -1) {
                        this.G = 1.0f / f10;
                    }
                    i10 = (int) (this.G * i23);
                    if (bVar3 != bVar4) {
                        i12 = 4;
                    }
                    int[] iArr3 = this.f4407y;
                    iArr3[0] = i11;
                    iArr3[1] = i12;
                    this.f4373h = z15;
                    if (z15) {
                        int i310 = this.F;
                        i13 = -1;
                        if (i310 != 0) {
                        }
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar = this.Z[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i14 = 0;
                        } else {
                            i14 = i28;
                        }
                        boolean z219 = !this.V.o();
                        boolean[] zArr6 = this.Y;
                        boolean z2110 = zArr6[0];
                        boolean z2111 = zArr6[1];
                        if (this.f4397t != 2) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            i15 = i11;
                            z18 = z12;
                        }
                        if (z10) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        }
                        if (this.f4399u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0) {
                        }
                        if (!z15) {
                            dVar2 = dVar;
                        } else if (this.F == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                            dVar2 = dVar;
                        }
                        if (this.V.o()) {
                            dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                        }
                        this.f4389p = false;
                        this.f4391q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.Z[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i14 = 0;
                    } else {
                        i14 = i28;
                    }
                    boolean z2112 = !this.V.o();
                    boolean[] zArr7 = this.Y;
                    boolean z2113 = zArr7[0];
                    boolean z2114 = zArr7[1];
                    if (this.f4397t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f4399u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        dVar2 = dVar;
                    } else if (this.F == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                        dVar2 = dVar;
                    }
                    if (this.V.o()) {
                        dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                    }
                    this.f4389p = false;
                    this.f4391q = false;
                }
                i12 = i31;
                z15 = true;
                int[] iArr4 = this.f4407y;
                iArr4[0] = i11;
                iArr4[1] = i12;
                this.f4373h = z15;
                if (z15) {
                    int i311 = this.F;
                    i13 = -1;
                    if (i311 != 0) {
                    }
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.Z[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i14 = 0;
                    } else {
                        i14 = i28;
                    }
                    boolean z2115 = !this.V.o();
                    boolean[] zArr8 = this.Y;
                    boolean z2116 = zArr8[0];
                    boolean z2117 = zArr8[1];
                    if (this.f4397t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f4399u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        dVar2 = dVar;
                    } else if (this.F == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                        dVar2 = dVar;
                    }
                    if (this.V.o()) {
                        dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                    }
                    this.f4389p = false;
                    this.f4391q = false;
                }
                i13 = -1;
                if (z15) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar = this.Z[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i14 = 0;
                } else {
                    i14 = i28;
                }
                boolean z2118 = !this.V.o();
                boolean[] zArr9 = this.Y;
                boolean z2119 = zArr9[0];
                boolean z21110 = zArr9[1];
                if (this.f4397t != 2) {
                    i15 = i11;
                    z18 = z12;
                } else {
                    i15 = i11;
                    z18 = z12;
                }
                if (z10) {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                } else {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                }
                if (this.f4399u == 2) {
                    i19 = i16;
                } else {
                    i19 = i18;
                }
                if (i19 == 0) {
                }
                if (!z15) {
                    dVar2 = dVar;
                } else if (this.F == 1) {
                    dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                    dVar2 = dVar;
                }
                if (this.V.o()) {
                    dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                }
                this.f4389p = false;
                this.f4391q = false;
            }
            z15 = false;
            int[] iArr5 = this.f4407y;
            iArr5[0] = i11;
            iArr5[1] = i12;
            this.f4373h = z15;
            if (z15) {
                int i312 = this.F;
                i13 = -1;
                if (i312 != 0) {
                }
                if (z15) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar = this.Z[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i14 = 0;
                } else {
                    i14 = i28;
                }
                boolean z21111 = !this.V.o();
                boolean[] zArr10 = this.Y;
                boolean z21112 = zArr10[0];
                boolean z21113 = zArr10[1];
                if (this.f4397t != 2) {
                    i15 = i11;
                    z18 = z12;
                } else {
                    i15 = i11;
                    z18 = z12;
                }
                if (z10) {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                } else {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                }
                if (this.f4399u == 2) {
                    i19 = i16;
                } else {
                    i19 = i18;
                }
                if (i19 == 0) {
                }
                if (!z15) {
                    dVar2 = dVar;
                } else if (this.F == 1) {
                    dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                    dVar2 = dVar;
                }
                if (this.V.o()) {
                    dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                }
                this.f4389p = false;
                this.f4391q = false;
            }
            i13 = -1;
            if (z15) {
                z16 = false;
            } else {
                z16 = false;
            }
            bVar = this.Z[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (z17) {
                i14 = 0;
            } else {
                i14 = i28;
            }
            boolean z21114 = !this.V.o();
            boolean[] zArr11 = this.Y;
            boolean z21115 = zArr11[0];
            boolean z21116 = zArr11[1];
            if (this.f4397t != 2) {
                i15 = i11;
                z18 = z12;
            } else {
                i15 = i11;
                z18 = z12;
            }
            if (z10) {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            } else {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            }
            if (this.f4399u == 2) {
                i19 = i16;
            } else {
                i19 = i18;
            }
            if (i19 == 0) {
            }
            if (!z15) {
                dVar2 = dVar;
            } else if (this.F == 1) {
                dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                dVar2 = dVar;
            }
            if (this.V.o()) {
                dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
            }
            this.f4389p = false;
            this.f4391q = false;
        }
        i10 = i26;
        iVar = iVarQ2;
        i11 = i29;
        i12 = i30;
        z15 = false;
        int[] iArr6 = this.f4407y;
        iArr6[0] = i11;
        iArr6[1] = i12;
        this.f4373h = z15;
        if (z15) {
            int i313 = this.F;
            i13 = -1;
            if (i313 != 0) {
            }
            if (z15) {
                z16 = false;
            } else {
                z16 = false;
            }
            bVar = this.Z[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (z17) {
                i14 = 0;
            } else {
                i14 = i28;
            }
            boolean z21117 = !this.V.o();
            boolean[] zArr12 = this.Y;
            boolean z21118 = zArr12[0];
            boolean z21119 = zArr12[1];
            if (this.f4397t != 2) {
                i15 = i11;
                z18 = z12;
            } else {
                i15 = i11;
                z18 = z12;
            }
            if (z10) {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            } else {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            }
            if (this.f4399u == 2) {
                i19 = i16;
            } else {
                i19 = i18;
            }
            if (i19 == 0) {
            }
            if (!z15) {
                dVar2 = dVar;
            } else if (this.F == 1) {
                dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                dVar2 = dVar;
            }
            if (this.V.o()) {
                dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
            }
            this.f4389p = false;
            this.f4391q = false;
        }
        i13 = -1;
        if (z15) {
            z16 = false;
        } else {
            z16 = false;
        }
        bVar = this.Z[0];
        bVar2 = b.WRAP_CONTENT;
        if (bVar == bVar2) {
            z17 = false;
        } else {
            z17 = false;
        }
        if (z17) {
            i14 = 0;
        } else {
            i14 = i28;
        }
        boolean z211110 = !this.V.o();
        boolean[] zArr13 = this.Y;
        boolean z211111 = zArr13[0];
        boolean z211112 = zArr13[1];
        if (this.f4397t != 2) {
            i15 = i11;
            z18 = z12;
        } else {
            i15 = i11;
            z18 = z12;
        }
        if (z10) {
            iVar2 = r24;
            iVar3 = r25;
            iVar4 = r26;
            i16 = 0;
            i17 = 8;
            c10 = 1;
            i18 = 1;
        } else {
            iVar2 = r24;
            iVar3 = r25;
            iVar4 = r26;
            i16 = 0;
            i17 = 8;
            c10 = 1;
            i18 = 1;
        }
        if (this.f4399u == 2) {
            i19 = i16;
        } else {
            i19 = i18;
        }
        if (i19 == 0) {
        }
        if (!z15) {
            dVar2 = dVar;
        } else if (this.F == 1) {
            dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
            dVar2 = dVar;
        } else {
            dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
            dVar2 = dVar;
        }
        if (this.V.o()) {
            dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
        }
        this.f4389p = false;
        this.f4391q = false;
    }

    public boolean g0() {
        return this.f4393r;
    }

    public void g1(int i10, int i11) {
        this.f4372g0 = i10;
        int i12 = i11 - i10;
        this.f4364c0 = i12;
        int i13 = this.f4386n0;
        if (i12 < i13) {
            this.f4364c0 = i13;
        }
    }

    public boolean h() {
        return this.f4396s0 != 8;
    }

    public boolean h0(int i10) {
        return this.Y[i10];
    }

    public void h1(b bVar) {
        this.Z[1] = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0582  */
    public final void i(z1.d dVar, boolean z10, boolean z11, boolean z12, boolean z13, z1.i iVar, z1.i iVar2, b bVar, boolean z14, d dVar2, d dVar3, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        boolean z21;
        int iMin;
        int i18;
        z1.i iVar3;
        boolean z22;
        boolean z23;
        int i19;
        int i20;
        z1.i iVarQ;
        z1.i iVarQ2;
        int i21;
        char c10;
        char c11;
        d dVar4;
        boolean z24;
        z1.i iVar4;
        boolean z25;
        boolean z26;
        int i22;
        int i23;
        boolean z27;
        boolean z28;
        z1.i iVar5;
        e eVar;
        int i24;
        boolean z29;
        int iMin2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        e eVar2;
        int i32;
        e eVar3;
        dVar = dVar;
        z1.i iVarQ3 = dVar.q(dVar2);
        z1.i iVarQ4 = dVar.q(dVar3);
        z1.i iVarQ5 = dVar.q(dVar2.j());
        z1.i iVarQ6 = dVar.q(dVar3.j());
        z1.d.x();
        boolean zO = dVar2.o();
        boolean zO2 = dVar3.o();
        boolean zO3 = this.V.o();
        int i33 = zO2 ? (zO ? 1 : 0) + 1 : zO ? 1 : 0;
        if (zO3) {
            i33++;
        }
        int i34 = z15 ? 3 : i14;
        z1.i iVar6 = iVarQ6;
        int iOrdinal = bVar.ordinal();
        boolean z30 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i34 == 4) ? false : true;
        int i35 = this.f4381l;
        if (i35 != -1 && z10) {
            this.f4381l = -1;
            i11 = i35;
            z30 = false;
        }
        int i36 = this.f4383m;
        if (i36 == -1 || z10) {
            i36 = i11;
        } else {
            this.f4383m = -1;
            z30 = false;
        }
        int i37 = i36;
        if (this.f4396s0 == 8) {
            iMin = 0;
            z21 = false;
        } else {
            z21 = z30;
            iMin = i37;
        }
        if (z20) {
            if (!zO && !zO2 && !zO3) {
                dVar.f(iVarQ3, i10);
            } else if (zO && !zO2) {
                i18 = 8;
                dVar.e(iVarQ3, iVarQ5, dVar2.f(), 8);
            }
            i18 = 8;
        } else {
            i18 = 8;
        }
        if (z21 == 0) {
            if (z14) {
                dVar.e(iVarQ4, iVarQ3, 0, 3);
                if (i12 > 0) {
                    dVar.h(iVarQ4, iVarQ3, i12, 8);
                }
                if (i13 < Integer.MAX_VALUE) {
                    dVar.j(iVarQ4, iVarQ3, i13, 8);
                }
            } else {
                dVar.e(iVarQ4, iVarQ3, iMin, i18);
            }
            i20 = i17;
            iVar3 = iVarQ4;
            i33 = i33 == true ? 1 : 0;
            iVar6 = iVar6;
            z22 = z21;
            z23 = z13;
            i19 = i16;
        } else if (i33 == 2 || z15 || !(i34 == 1 || i34 == 0)) {
            int i38 = i16 == -2 ? iMin : i16;
            int i39 = i17 == -2 ? iMin : i17;
            if (iMin > 0 && i34 != 1) {
                iMin = 0;
            }
            if (i38 > 0) {
                dVar.h(iVarQ4, iVarQ3, i38, 8);
                iMin = Math.max(iMin, i38);
            }
            if (i39 > 0) {
                if (!z11 || i34 != 1) {
                    dVar.j(iVarQ4, iVarQ3, i39, 8);
                }
                iMin = Math.min(iMin, i39);
            }
            if (i34 == 1) {
                if (z11) {
                    dVar.e(iVarQ4, iVarQ3, iMin, 8);
                } else if (z17) {
                    dVar.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar.j(iVarQ4, iVarQ3, iMin, 8);
                } else {
                    dVar.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar.j(iVarQ4, iVarQ3, iMin, 8);
                }
                iVar3 = iVarQ4;
                iVar6 = iVar6;
                z22 = z21;
                z23 = z13;
                i19 = i38;
                i20 = i39;
                i33 = i33 == true ? 1 : 0;
            } else {
                if (i34 == 2) {
                    d.a aVarK = dVar2.k();
                    d.a aVar = d.a.TOP;
                    if (aVarK == aVar || dVar2.k() == d.a.BOTTOM) {
                        iVarQ = dVar.q(this.f4361a0.o(aVar));
                        iVarQ2 = dVar.q(this.f4361a0.o(d.a.BOTTOM));
                    } else {
                        iVarQ = dVar.q(this.f4361a0.o(d.a.LEFT));
                        iVarQ2 = dVar.q(this.f4361a0.o(d.a.RIGHT));
                    }
                    z1.i iVar7 = iVarQ2;
                    iVar3 = iVarQ4;
                    dVar.d(dVar.r().k(iVar3, iVarQ3, iVar7, iVarQ, f11));
                    if (z11) {
                        z21 = false;
                    }
                    z23 = z13;
                    z22 = z21;
                } else {
                    iVar3 = iVarQ4;
                    z22 = z21;
                    z23 = true;
                }
                i19 = i38;
                i20 = i39;
            }
        } else {
            int iMax = Math.max(i16, iMin);
            if (i17 > 0) {
                iMax = Math.min(i17, iMax);
            }
            dVar.e(iVarQ4, iVarQ3, iMax, 8);
            i19 = i16;
            i20 = i17;
            iVar3 = iVarQ4;
            i33 = i33 == true ? 1 : 0;
            iVar6 = iVar6;
            z22 = false;
            z23 = z13;
        }
        if (!z20) {
            i21 = 8;
            c10 = 1;
            c11 = 2;
        } else {
            if (!z17) {
                if (!zO && !zO2 && !zO3) {
                    i26 = 5;
                    z29 = z11;
                    i32 = i26;
                } else if (!zO || zO2) {
                    if (zO || !zO2) {
                        if (zO && zO2) {
                            e eVar4 = dVar2.f4347f.f4345d;
                            e eVar5 = dVar3.f4347f.f4345d;
                            e eVarK = K();
                            int i40 = 6;
                            if (!z22) {
                                z24 = true;
                                if (iVarQ5.f37102g && iVar6.f37102g) {
                                    z1.i iVar8 = iVar6;
                                    dVar.c(iVarQ3, iVarQ5, dVar2.f(), f10, iVar8, iVar3, dVar3.f(), 8);
                                    if (z11 && z23) {
                                        int iF = dVar3.f4347f != null ? dVar3.f() : 0;
                                        if (iVar8 != iVar2) {
                                            dVar.h(iVar2, iVar3, iF, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                z1.i iVar9 = iVar6;
                                iVarQ3 = iVarQ3;
                                iVar4 = iVar9;
                                dVar = dVar;
                                iVarQ5 = iVarQ5;
                                z25 = true;
                                z26 = true;
                                i40 = 6;
                                i22 = 5;
                                i23 = 4;
                                z27 = false;
                            } else if (i34 == 0) {
                                if (i20 != 0 || i19 != 0) {
                                    i30 = 5;
                                    i31 = 5;
                                    z26 = true;
                                    z27 = false;
                                    z25 = true;
                                } else if (iVarQ5.f37102g && iVar6.f37102g) {
                                    dVar.e(iVarQ3, iVarQ5, dVar2.f(), 8);
                                    dVar.e(iVar3, iVar6, -dVar3.f(), 8);
                                    return;
                                } else {
                                    i30 = 8;
                                    i31 = 8;
                                    z26 = false;
                                    z27 = true;
                                    z25 = false;
                                }
                                if ((eVar4 instanceof c2.a) || (eVar5 instanceof c2.a)) {
                                    iVar4 = iVar6;
                                    z24 = true;
                                    i23 = 4;
                                } else {
                                    iVar4 = iVar6;
                                    i23 = i31;
                                    z24 = true;
                                }
                                i22 = i30;
                                iVarQ5 = iVarQ5;
                                i40 = 6;
                            } else {
                                if (i34 == 2) {
                                    if ((eVar4 instanceof c2.a) || (eVar5 instanceof c2.a)) {
                                        iVar4 = iVar6;
                                        z24 = true;
                                        i23 = 4;
                                    } else {
                                        iVar4 = iVar6;
                                        z24 = true;
                                        i23 = 5;
                                    }
                                    i22 = 5;
                                } else if (i34 == 1) {
                                    z1.i iVar10 = iVar6;
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar10;
                                    iVarQ5 = iVarQ5;
                                    i40 = 6;
                                    z24 = true;
                                    i23 = 4;
                                    i22 = 8;
                                } else if (i34 != 3) {
                                    z24 = true;
                                    z1.i iVar11 = iVar6;
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar11;
                                    dVar = dVar;
                                    iVarQ5 = iVarQ5;
                                    i40 = 6;
                                    i23 = 4;
                                    i22 = 5;
                                    z25 = false;
                                    z26 = false;
                                    z27 = false;
                                } else if (this.F == -1) {
                                    if (z18) {
                                        z1.i iVar12 = iVar6;
                                        iVarQ3 = iVarQ3;
                                        iVar4 = iVar12;
                                        dVar = dVar;
                                        iVarQ5 = iVarQ5;
                                        z24 = true;
                                        i40 = z11 ? 5 : 4;
                                    } else {
                                        z1.i iVar13 = iVar6;
                                        iVarQ3 = iVarQ3;
                                        iVar4 = iVar13;
                                        dVar = dVar;
                                        iVarQ5 = iVarQ5;
                                        z24 = true;
                                        i40 = 8;
                                    }
                                    i23 = 5;
                                    i22 = 8;
                                    z25 = true;
                                    z26 = true;
                                    z27 = true;
                                } else {
                                    if (z15) {
                                        if (i15 != 2) {
                                            z24 = true;
                                            if (i15 != 1) {
                                                i28 = 8;
                                                i29 = 5;
                                            }
                                            iVar4 = iVar6;
                                            i22 = i28;
                                            i23 = i29;
                                            z25 = z24;
                                            z26 = z25;
                                            z27 = z26;
                                        } else {
                                            z24 = true;
                                        }
                                        i28 = 5;
                                        i29 = 4;
                                        iVar4 = iVar6;
                                        i22 = i28;
                                        i23 = i29;
                                        z25 = z24;
                                        z26 = z25;
                                        z27 = z26;
                                    } else {
                                        z24 = true;
                                        if (i20 > 0) {
                                            iVar4 = iVar6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 5;
                                        } else if (i20 != 0 || i19 != 0) {
                                            iVar4 = iVar6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 4;
                                        } else if (z18) {
                                            iVar4 = iVar6;
                                            i22 = (eVar4 == eVarK || eVar5 == eVarK) ? 5 : 4;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 4;
                                        } else {
                                            iVar4 = iVar6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 8;
                                        }
                                        i22 = 5;
                                    }
                                    dVar = dVar;
                                }
                                z25 = true;
                                z26 = true;
                                z27 = false;
                            }
                            if (z25 && iVarQ5 == iVar4 && eVar4 != eVarK) {
                                z25 = false;
                                z28 = false;
                            } else {
                                z28 = z24;
                            }
                            if (z26) {
                                if (z22 || z16 || z18 || iVarQ5 != iVar || iVar4 != iVar2) {
                                    i27 = i40;
                                    z29 = z11;
                                } else {
                                    i27 = 8;
                                    z29 = false;
                                    i22 = 8;
                                    z28 = false;
                                }
                                z1.i iVar14 = iVarQ3;
                                eVar = eVarK;
                                i24 = 8;
                                z1.i iVar15 = iVar3;
                                dVar.c(iVar14, iVarQ5, dVar2.f(), f10, iVar4, iVar15, dVar3.f(), i27);
                                z1.i iVar16 = iVar4;
                                iVar5 = iVar14;
                                iVar6 = iVar16;
                                iVar3 = iVar15;
                            } else {
                                iVar6 = iVar4;
                                iVar5 = iVarQ3;
                                eVar = eVarK;
                                z24 = z24;
                                i24 = 8;
                                z29 = z11;
                            }
                            if (this.f4396s0 == i24 && !dVar3.m()) {
                                return;
                            }
                            if (z25) {
                                int i41 = (!z29 || iVarQ5 == iVar6 || z22 || !((eVar4 instanceof c2.a) || (eVar5 instanceof c2.a))) ? i22 : 6;
                                dVar.h(iVar5, iVarQ5, dVar2.f(), i41);
                                dVar.j(iVar3, iVar6, -dVar3.f(), i41);
                                i22 = i41;
                            }
                            if (!z29 || !z19 || (eVar4 instanceof c2.a) || (eVar5 instanceof c2.a) || eVar5 == eVar) {
                                iMin2 = i23;
                                i25 = i22;
                                z24 = z28;
                            } else {
                                iMin2 = 6;
                                i25 = 6;
                            }
                            if (z24) {
                                if (z27 && (!z18 || z12)) {
                                    if (eVar4 != eVar && eVar5 != eVar) {
                                        i40 = iMin2;
                                    }
                                    if ((eVar4 instanceof h) || (eVar5 instanceof h)) {
                                        i40 = 5;
                                    }
                                    if ((eVar4 instanceof c2.a) || (eVar5 instanceof c2.a)) {
                                        i40 = 5;
                                    }
                                    iMin2 = Math.max(z18 ? 5 : i40, iMin2);
                                }
                                if (z29) {
                                    iMin2 = Math.min(i25, iMin2);
                                    if (z15 && !z18 && (eVar4 == eVar || eVar5 == eVar)) {
                                        iMin2 = 4;
                                    }
                                }
                                dVar.e(iVar5, iVarQ5, dVar2.f(), iMin2);
                                dVar.e(iVar3, iVar6, -dVar3.f(), iMin2);
                            }
                            if (z29) {
                                int iF2 = iVar == iVarQ5 ? dVar2.f() : 0;
                                if (iVarQ5 != iVar) {
                                    dVar.h(iVar5, iVar, iF2, 5);
                                }
                            }
                            if (!z29 || !z22 || i12 != 0 || i19 != 0) {
                                i26 = 5;
                            } else if (z22 && i34 == 3) {
                                dVar.h(iVar3, iVar5, 0, i24);
                                i26 = 5;
                            } else {
                                i26 = 5;
                                dVar.h(iVar3, iVar5, 0, 5);
                            }
                        }
                        i32 = i26;
                    } else {
                        dVar.e(iVar3, iVar6, -dVar3.f(), 8);
                        if (z11) {
                            if (this.f4377j && iVarQ3.f37102g && (eVar2 = this.f4361a0) != null) {
                                f fVar = (f) eVar2;
                                if (z10) {
                                    fVar.A1(dVar2);
                                } else {
                                    fVar.F1(dVar2);
                                }
                            } else {
                                i26 = 5;
                                dVar.h(iVarQ3, iVar, 0, 5);
                            }
                        }
                        z29 = z11;
                        i32 = i26;
                    }
                    i26 = 5;
                    z29 = z11;
                    i32 = i26;
                } else {
                    i32 = (z11 && (dVar2.f4347f.f4345d instanceof c2.a)) ? 8 : 5;
                    z29 = z11;
                    iVar6 = iVar6;
                }
                if (z29 && z23) {
                    int iF3 = dVar3.f4347f != null ? dVar3.f() : 0;
                    if (iVar6 != iVar2) {
                        if (!this.f4377j || !iVar3.f37102g || (eVar3 = this.f4361a0) == null) {
                            dVar.h(iVar2, iVar3, iF3, i32);
                            return;
                        }
                        f fVar2 = (f) eVar3;
                        if (z10) {
                            fVar2.z1(dVar3);
                            return;
                        } else {
                            fVar2.E1(dVar3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            c11 = 2;
            i21 = 8;
            c10 = 1;
        }
        if (i33 < c11 && z11 && z23) {
            dVar.h(iVarQ3, iVar, 0, i21);
            char c12 = (z10 || this.S.f4347f == null) ? c10 : (char) 0;
            if (!z10 && (dVar4 = this.S.f4347f) != null) {
                e eVar6 = dVar4.f4345d;
                if (eVar6.f4366d0 != 0.0f) {
                    b[] bVarArr = eVar6.Z;
                    b bVar2 = bVarArr[0];
                    b bVar3 = b.MATCH_CONSTRAINT;
                    if (bVar2 == bVar3 && bVarArr[c10] == bVar3) {
                        c12 = c10;
                    } else {
                        c12 = 0;
                    }
                } else {
                    c12 = 0;
                }
            }
            if (c12 != 0) {
                dVar.h(iVar2, iVar3, 0, i21);
            }
        }
    }

    public boolean i0() {
        d dVar = this.O;
        d dVar2 = dVar.f4347f;
        if (dVar2 != null && dVar2.f4347f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f4347f;
        return dVar4 != null && dVar4.f4347f == dVar3;
    }

    public void i1(int i10, int i11, int i12, float f10) {
        this.f4405x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f4405x = 2;
    }

    public void j(d.a aVar, e eVar, d.a aVar2, int i10) {
        d.a aVar3;
        d.a aVar4;
        boolean z10;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    j(aVar6, eVar, aVar2, 0);
                    j(d.a.RIGHT, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    j(aVar7, eVar, aVar2, 0);
                    j(d.a.BOTTOM, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d dVarO = o(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d dVarO2 = o(aVar9);
            d.a aVar10 = d.a.TOP;
            d dVarO3 = o(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d dVarO4 = o(aVar11);
            boolean z11 = true;
            if ((dVarO == null || !dVarO.o()) && (dVarO2 == null || !dVarO2.o())) {
                j(aVar8, eVar, aVar8, 0);
                j(aVar9, eVar, aVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((dVarO3 == null || !dVarO3.o()) && (dVarO4 == null || !dVarO4.o())) {
                j(aVar10, eVar, aVar10, 0);
                j(aVar11, eVar, aVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                o(aVar5).a(eVar.o(aVar5), 0);
                return;
            }
            if (z10) {
                d.a aVar12 = d.a.CENTER_X;
                o(aVar12).a(eVar.o(aVar12), 0);
                return;
            } else {
                if (z11) {
                    d.a aVar13 = d.a.CENTER_Y;
                    o(aVar13).a(eVar.o(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d dVarO5 = o(aVar4);
            d dVarO6 = eVar.o(aVar2);
            d dVarO7 = o(d.a.RIGHT);
            dVarO5.a(dVarO6, 0);
            dVarO7.a(dVarO6, 0);
            o(aVar14).a(dVarO6, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d dVarO8 = eVar.o(aVar2);
            o(aVar3).a(dVarO8, 0);
            o(d.a.BOTTOM).a(dVarO8, 0);
            o(aVar15).a(dVarO8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            o(aVar16).a(eVar.o(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            o(aVar17).a(eVar.o(aVar17), 0);
            o(aVar14).a(eVar.o(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            o(aVar18).a(eVar.o(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            o(aVar19).a(eVar.o(aVar19), 0);
            o(aVar15).a(eVar.o(aVar2), 0);
            return;
        }
        d dVarO9 = o(aVar);
        d dVarO10 = eVar.o(aVar2);
        if (dVarO9.p(dVarO10)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d dVarO11 = o(d.a.TOP);
                d dVarO12 = o(d.a.BOTTOM);
                if (dVarO11 != null) {
                    dVarO11.q();
                }
                if (dVarO12 != null) {
                    dVarO12.q();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d dVarO13 = o(aVar20);
                if (dVarO13 != null) {
                    dVarO13.q();
                }
                d dVarO14 = o(aVar5);
                if (dVarO14.j() != dVarO10) {
                    dVarO14.q();
                }
                d dVarG = o(aVar).g();
                d dVarO15 = o(aVar15);
                if (dVarO15.o()) {
                    dVarG.q();
                    dVarO15.q();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d dVarO16 = o(aVar5);
                if (dVarO16.j() != dVarO10) {
                    dVarO16.q();
                }
                d dVarG2 = o(aVar).g();
                d dVarO17 = o(aVar14);
                if (dVarO17.o()) {
                    dVarG2.q();
                    dVarO17.q();
                }
            }
            dVarO9.a(dVarO10, i10);
        }
    }

    public boolean j0() {
        return this.K;
    }

    public void j1(float f10) {
        this.D0[1] = f10;
    }

    public void k(d dVar, d dVar2, int i10) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i10);
        }
    }

    public boolean k0() {
        d dVar = this.P;
        d dVar2 = dVar.f4347f;
        if (dVar2 != null && dVar2.f4347f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f4347f;
        return dVar4 != null && dVar4.f4347f == dVar3;
    }

    public void k1(int i10) {
        this.f4396s0 = i10;
    }

    public void l(e eVar, float f10, int i10) {
        d.a aVar = d.a.CENTER;
        e0(aVar, eVar, aVar, i10, 0);
        this.I = f10;
    }

    public boolean l0() {
        return this.L;
    }

    public void l1(int i10) {
        this.f4362b0 = i10;
        int i11 = this.f4384m0;
        if (i10 < i11) {
            this.f4362b0 = i11;
        }
    }

    public void m(z1.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f4382l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean m0() {
        return this.f4375i && this.f4396s0 != 8;
    }

    public void m1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f4401v = i10;
    }

    public void n() {
        if (this.f4367e == null) {
            this.f4367e = new d2.l(this);
        }
        if (this.f4369f == null) {
            this.f4369f = new n(this);
        }
    }

    public boolean n0() {
        if (this.f4389p) {
            return true;
        }
        return this.O.n() && this.Q.n();
    }

    public void n1(int i10) {
        this.f4370f0 = i10;
    }

    public d o(d.a aVar) {
        switch (a.f4411a[aVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean o0() {
        if (this.f4391q) {
            return true;
        }
        return this.P.n() && this.R.n();
    }

    public void o1(int i10) {
        this.f4372g0 = i10;
    }

    public int p() {
        return this.f4382l0;
    }

    public boolean p0() {
        return this.f4395s;
    }

    public void p1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.F == -1) {
            if (z12 && !z13) {
                this.F = 0;
            } else if (!z12 && z13) {
                this.F = 1;
                if (this.f4368e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.o() || !this.R.o())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.o() || !this.Q.o())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.o() || !this.R.o() || !this.O.o() || !this.Q.o())) {
            if (this.P.o() && this.R.o()) {
                this.F = 0;
            } else if (this.O.o() && this.Q.o()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i10 = this.f4409z;
            if (i10 > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i10 != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public float q(int i10) {
        if (i10 == 0) {
            return this.f4388o0;
        }
        if (i10 == 1) {
            return this.f4390p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f4393r = true;
    }

    public void q1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zK = z10 & this.f4367e.k();
        boolean zK2 = z11 & this.f4369f.k();
        d2.l lVar = this.f4367e;
        int i12 = lVar.f14381h.f14334g;
        n nVar = this.f4369f;
        int i13 = nVar.f14381h.f14334g;
        int i14 = lVar.f14382i.f14334g;
        int i15 = nVar.f14382i.f14334g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zK) {
            this.f4370f0 = i12;
        }
        if (zK2) {
            this.f4372g0 = i13;
        }
        if (this.f4396s0 == 8) {
            this.f4362b0 = 0;
            this.f4364c0 = 0;
            return;
        }
        if (zK) {
            if (this.Z[0] == b.FIXED && i17 < (i11 = this.f4362b0)) {
                i17 = i11;
            }
            this.f4362b0 = i17;
            int i19 = this.f4384m0;
            if (i17 < i19) {
                this.f4362b0 = i19;
            }
        }
        if (zK2) {
            if (this.Z[1] == b.FIXED && i18 < (i10 = this.f4364c0)) {
                i18 = i10;
            }
            this.f4364c0 = i18;
            int i20 = this.f4386n0;
            if (i18 < i20) {
                this.f4364c0 = i20;
            }
        }
    }

    public int r() {
        return Y() + this.f4364c0;
    }

    public void r0() {
        this.f4395s = true;
    }

    public void r1(z1.d dVar, boolean z10) {
        n nVar;
        d2.l lVar;
        int iY = dVar.y(this.O);
        int iY2 = dVar.y(this.P);
        int iY3 = dVar.y(this.Q);
        int iY4 = dVar.y(this.R);
        if (z10 && (lVar = this.f4367e) != null) {
            d2.f fVar = lVar.f14381h;
            if (fVar.f14337j) {
                d2.f fVar2 = lVar.f14382i;
                if (fVar2.f14337j) {
                    iY = fVar.f14334g;
                    iY3 = fVar2.f14334g;
                }
            }
        }
        if (z10 && (nVar = this.f4369f) != null) {
            d2.f fVar3 = nVar.f14381h;
            if (fVar3.f14337j) {
                d2.f fVar4 = nVar.f14382i;
                if (fVar4.f14337j) {
                    iY2 = fVar3.f14334g;
                    iY4 = fVar4.f14334g;
                }
            }
        }
        int i10 = iY4 - iY2;
        if (iY3 - iY < 0 || i10 < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        K0(iY, iY2, iY3, iY4);
    }

    public Object s() {
        return this.f4392q0;
    }

    public boolean s0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String t() {
        return this.f4400u0;
    }

    public void t0() {
        this.O.q();
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.f4361a0 = null;
        this.I = Float.NaN;
        this.f4362b0 = 0;
        this.f4364c0 = 0;
        this.f4366d0 = 0.0f;
        this.f4368e0 = -1;
        this.f4370f0 = 0;
        this.f4372g0 = 0;
        this.f4378j0 = 0;
        this.f4380k0 = 0;
        this.f4382l0 = 0;
        this.f4384m0 = 0;
        this.f4386n0 = 0;
        float f10 = K0;
        this.f4388o0 = f10;
        this.f4390p0 = f10;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f4392q0 = null;
        this.f4394r0 = 0;
        this.f4396s0 = 0;
        this.f4402v0 = null;
        this.f4404w0 = false;
        this.f4406x0 = false;
        this.f4410z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4397t = -1;
        this.f4399u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4403w = 0;
        this.f4405x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f4409z = 0;
        this.C = 0;
        this.f4373h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f4408y0 = false;
        boolean[] zArr = this.f4371g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4375i = true;
        int[] iArr2 = this.f4407y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f4381l = -1;
        this.f4383m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f4402v0 != null) {
            str = "type: " + this.f4402v0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f4400u0 != null) {
            str2 = "id: " + this.f4400u0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f4370f0);
        sb2.append(", ");
        sb2.append(this.f4372g0);
        sb2.append(") - (");
        sb2.append(this.f4362b0);
        sb2.append(" x ");
        sb2.append(this.f4364c0);
        sb2.append(")");
        return sb2.toString();
    }

    public b u(int i10) {
        if (i10 == 0) {
            return A();
        }
        if (i10 == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        e eVarK = K();
        if (eVarK != null && (eVarK instanceof f) && ((f) K()).N1()) {
            return;
        }
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.X.get(i10).q();
        }
    }

    public float v() {
        return this.f4366d0;
    }

    public void v0() {
        this.f4389p = false;
        this.f4391q = false;
        this.f4393r = false;
        this.f4395s = false;
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.X.get(i10).r();
        }
    }

    public int w() {
        return this.f4368e0;
    }

    public void w0(z1.c cVar) {
        this.O.s(cVar);
        this.P.s(cVar);
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.V.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
    }

    public int x() {
        if (this.f4396s0 == 8) {
            return 0;
        }
        return this.f4364c0;
    }

    public final void x0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public float y() {
        return this.f4388o0;
    }

    public final void y0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public int z() {
        return this.f4410z0;
    }

    public final void z0(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }
}
