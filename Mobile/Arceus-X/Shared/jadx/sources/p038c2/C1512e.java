package p038c2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p022b2.C1207a;
import p065d2.AbstractC4422p;
import p065d2.C4409c;
import p065d2.C4412f;
import p065d2.C4418l;
import p065d2.C4420n;
import p591z1.C13681c;
import p591z1.C13682d;
import p591z1.C13687i;

/* JADX INFO: renamed from: c2.e */
/* JADX INFO: loaded from: classes.dex */
public class C1512e {

    /* JADX INFO: renamed from: K0 */
    public static float f5832K0 = 0.5f;

    /* JADX INFO: renamed from: A0 */
    public int f5834A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f5836B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f5838C0;

    /* JADX INFO: renamed from: D0 */
    public float[] f5840D0;

    /* JADX INFO: renamed from: E0 */
    public C1512e[] f5842E0;

    /* JADX INFO: renamed from: F0 */
    public C1512e[] f5844F0;

    /* JADX INFO: renamed from: G0 */
    public C1512e f5846G0;

    /* JADX INFO: renamed from: H0 */
    public C1512e f5848H0;

    /* JADX INFO: renamed from: I0 */
    public int f5850I0;

    /* JADX INFO: renamed from: J0 */
    public int f5852J0;

    /* JADX INFO: renamed from: K */
    public boolean f5853K;

    /* JADX INFO: renamed from: V */
    public C1511d f5864V;

    /* JADX INFO: renamed from: W */
    public C1511d[] f5865W;

    /* JADX INFO: renamed from: X */
    public ArrayList<C1511d> f5866X;

    /* JADX INFO: renamed from: Y */
    public boolean[] f5867Y;

    /* JADX INFO: renamed from: Z */
    public b[] f5868Z;

    /* JADX INFO: renamed from: a0 */
    public C1512e f5870a0;

    /* JADX INFO: renamed from: b0 */
    public int f5872b0;

    /* JADX INFO: renamed from: c */
    public C4409c f5873c;

    /* JADX INFO: renamed from: c0 */
    public int f5874c0;

    /* JADX INFO: renamed from: d */
    public C4409c f5875d;

    /* JADX INFO: renamed from: d0 */
    public float f5876d0;

    /* JADX INFO: renamed from: e0 */
    public int f5878e0;

    /* JADX INFO: renamed from: f0 */
    public int f5880f0;

    /* JADX INFO: renamed from: g0 */
    public int f5882g0;

    /* JADX INFO: renamed from: h0 */
    public int f5884h0;

    /* JADX INFO: renamed from: i0 */
    public int f5886i0;

    /* JADX INFO: renamed from: j0 */
    public int f5888j0;

    /* JADX INFO: renamed from: k0 */
    public int f5890k0;

    /* JADX INFO: renamed from: l0 */
    public int f5892l0;

    /* JADX INFO: renamed from: m0 */
    public int f5894m0;

    /* JADX INFO: renamed from: n0 */
    public int f5896n0;

    /* JADX INFO: renamed from: o */
    public String f5897o;

    /* JADX INFO: renamed from: o0 */
    public float f5898o0;

    /* JADX INFO: renamed from: p0 */
    public float f5900p0;

    /* JADX INFO: renamed from: q0 */
    public Object f5902q0;

    /* JADX INFO: renamed from: r0 */
    public int f5904r0;

    /* JADX INFO: renamed from: s0 */
    public int f5906s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f5908t0;

    /* JADX INFO: renamed from: u0 */
    public String f5910u0;

    /* JADX INFO: renamed from: v0 */
    public String f5912v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f5914w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f5916x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f5918y0;

    /* JADX INFO: renamed from: z0 */
    public int f5920z0;

    /* JADX INFO: renamed from: a */
    public boolean f5869a = false;

    /* JADX INFO: renamed from: b */
    public AbstractC4422p[] f5871b = new AbstractC4422p[2];

    /* JADX INFO: renamed from: e */
    public C4418l f5877e = null;

    /* JADX INFO: renamed from: f */
    public C4420n f5879f = null;

    /* JADX INFO: renamed from: g */
    public boolean[] f5881g = {true, true};

    /* JADX INFO: renamed from: h */
    public boolean f5883h = false;

    /* JADX INFO: renamed from: i */
    public boolean f5885i = true;

    /* JADX INFO: renamed from: j */
    public boolean f5887j = false;

    /* JADX INFO: renamed from: k */
    public boolean f5889k = true;

    /* JADX INFO: renamed from: l */
    public int f5891l = -1;

    /* JADX INFO: renamed from: m */
    public int f5893m = -1;

    /* JADX INFO: renamed from: n */
    public C1207a f5895n = new C1207a(this);

    /* JADX INFO: renamed from: p */
    public boolean f5899p = false;

    /* JADX INFO: renamed from: q */
    public boolean f5901q = false;

    /* JADX INFO: renamed from: r */
    public boolean f5903r = false;

    /* JADX INFO: renamed from: s */
    public boolean f5905s = false;

    /* JADX INFO: renamed from: t */
    public int f5907t = -1;

    /* JADX INFO: renamed from: u */
    public int f5909u = -1;

    /* JADX INFO: renamed from: v */
    public int f5911v = 0;

    /* JADX INFO: renamed from: w */
    public int f5913w = 0;

    /* JADX INFO: renamed from: x */
    public int f5915x = 0;

    /* JADX INFO: renamed from: y */
    public int[] f5917y = new int[2];

    /* JADX INFO: renamed from: z */
    public int f5919z = 0;

    /* JADX INFO: renamed from: A */
    public int f5833A = 0;

    /* JADX INFO: renamed from: B */
    public float f5835B = 1.0f;

    /* JADX INFO: renamed from: C */
    public int f5837C = 0;

    /* JADX INFO: renamed from: D */
    public int f5839D = 0;

    /* JADX INFO: renamed from: E */
    public float f5841E = 1.0f;

    /* JADX INFO: renamed from: F */
    public int f5843F = -1;

    /* JADX INFO: renamed from: G */
    public float f5845G = 1.0f;

    /* JADX INFO: renamed from: H */
    public int[] f5847H = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: I */
    public float f5849I = Float.NaN;

    /* JADX INFO: renamed from: J */
    public boolean f5851J = false;

    /* JADX INFO: renamed from: L */
    public boolean f5854L = false;

    /* JADX INFO: renamed from: M */
    public int f5855M = 0;

    /* JADX INFO: renamed from: N */
    public int f5856N = 0;

    /* JADX INFO: renamed from: O */
    public C1511d f5857O = new C1511d(this, C1511d.a.LEFT);

    /* JADX INFO: renamed from: P */
    public C1511d f5858P = new C1511d(this, C1511d.a.TOP);

    /* JADX INFO: renamed from: Q */
    public C1511d f5859Q = new C1511d(this, C1511d.a.RIGHT);

    /* JADX INFO: renamed from: R */
    public C1511d f5860R = new C1511d(this, C1511d.a.BOTTOM);

    /* JADX INFO: renamed from: S */
    public C1511d f5861S = new C1511d(this, C1511d.a.BASELINE);

    /* JADX INFO: renamed from: T */
    public C1511d f5862T = new C1511d(this, C1511d.a.CENTER_X);

    /* JADX INFO: renamed from: U */
    public C1511d f5863U = new C1511d(this, C1511d.a.CENTER_Y);

    /* JADX INFO: renamed from: c2.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5921a;

        static {
            int[] iArr = new int[C1511d.a.values().length];
            f5921a = iArr;
            try {
                iArr[C1511d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5921a[C1511d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5921a[C1511d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5921a[C1511d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5921a[C1511d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5921a[C1511d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5921a[C1511d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5921a[C1511d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5921a[C1511d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: c2.e$b */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C1512e() {
        C1511d c1511d = new C1511d(this, C1511d.a.CENTER);
        this.f5864V = c1511d;
        this.f5865W = new C1511d[]{this.f5857O, this.f5859Q, this.f5858P, this.f5860R, this.f5861S, c1511d};
        this.f5866X = new ArrayList<>();
        this.f5867Y = new boolean[2];
        b bVar = b.FIXED;
        this.f5868Z = new b[]{bVar, bVar};
        this.f5870a0 = null;
        this.f5872b0 = 0;
        this.f5874c0 = 0;
        this.f5876d0 = 0.0f;
        this.f5878e0 = -1;
        this.f5880f0 = 0;
        this.f5882g0 = 0;
        this.f5884h0 = 0;
        this.f5886i0 = 0;
        this.f5888j0 = 0;
        this.f5890k0 = 0;
        this.f5892l0 = 0;
        float f10 = f5832K0;
        this.f5898o0 = f10;
        this.f5900p0 = f10;
        this.f5904r0 = 0;
        this.f5906s0 = 0;
        this.f5908t0 = false;
        this.f5910u0 = null;
        this.f5912v0 = null;
        this.f5918y0 = false;
        this.f5920z0 = 0;
        this.f5834A0 = 0;
        this.f5840D0 = new float[]{-1.0f, -1.0f};
        this.f5842E0 = new C1512e[]{null, null};
        this.f5844F0 = new C1512e[]{null, null};
        this.f5846G0 = null;
        this.f5848H0 = null;
        this.f5850I0 = -1;
        this.f5852J0 = -1;
        m7761d();
    }

    /* JADX INFO: renamed from: A */
    public b m7703A() {
        return this.f5868Z[0];
    }

    /* JADX INFO: renamed from: A0 */
    public final void m7704A0(StringBuilder sb2, String str, float f10, int i10) {
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

    /* JADX INFO: renamed from: B */
    public int m7705B() {
        C1511d c1511d = this.f5857O;
        int i10 = c1511d != null ? c1511d.f5819g : 0;
        C1511d c1511d2 = this.f5859Q;
        return c1511d2 != null ? i10 + c1511d2.f5819g : i10;
    }

    /* JADX INFO: renamed from: B0 */
    public void m7706B0(int i10) {
        this.f5892l0 = i10;
        this.f5851J = i10 > 0;
    }

    /* JADX INFO: renamed from: C */
    public int m7707C() {
        return this.f5855M;
    }

    /* JADX INFO: renamed from: C0 */
    public void m7708C0(Object obj) {
        this.f5902q0 = obj;
    }

    /* JADX INFO: renamed from: D */
    public int m7709D() {
        return this.f5856N;
    }

    /* JADX INFO: renamed from: D0 */
    public void m7710D0(String str) {
        this.f5910u0 = str;
    }

    /* JADX INFO: renamed from: E */
    public int m7711E(int i10) {
        if (i10 == 0) {
            return m7747W();
        }
        if (i10 == 1) {
            return m7812x();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: E0 */
    public void m7712E0(String str) {
        float fAbs;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f5876d0 = 0.0f;
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
            this.f5876d0 = fAbs;
            this.f5878e0 = i12;
        }
    }

    /* JADX INFO: renamed from: F */
    public int m7713F() {
        return this.f5847H[1];
    }

    /* JADX INFO: renamed from: F0 */
    public void m7714F0(int i10) {
        if (this.f5851J) {
            int i11 = i10 - this.f5892l0;
            int i12 = this.f5874c0 + i11;
            this.f5882g0 = i11;
            this.f5858P.m7700t(i11);
            this.f5860R.m7700t(i12);
            this.f5861S.m7700t(i10);
            this.f5901q = true;
        }
    }

    /* JADX INFO: renamed from: G */
    public int m7715G() {
        return this.f5847H[0];
    }

    /* JADX INFO: renamed from: G0 */
    public void m7716G0(int i10, int i11) {
        if (this.f5899p) {
            return;
        }
        this.f5857O.m7700t(i10);
        this.f5859Q.m7700t(i11);
        this.f5880f0 = i10;
        this.f5872b0 = i11 - i10;
        this.f5899p = true;
    }

    /* JADX INFO: renamed from: H */
    public int m7717H() {
        return this.f5896n0;
    }

    /* JADX INFO: renamed from: H0 */
    public void m7718H0(int i10) {
        this.f5857O.m7700t(i10);
        this.f5880f0 = i10;
    }

    /* JADX INFO: renamed from: I */
    public int m7719I() {
        return this.f5894m0;
    }

    /* JADX INFO: renamed from: I0 */
    public void m7720I0(int i10) {
        this.f5858P.m7700t(i10);
        this.f5882g0 = i10;
    }

    /* JADX INFO: renamed from: J */
    public C1512e m7721J(int i10) {
        C1511d c1511d;
        C1511d c1511d2;
        if (i10 != 0) {
            if (i10 == 1 && (c1511d2 = (c1511d = this.f5860R).f5818f) != null && c1511d2.f5818f == c1511d) {
                return c1511d2.f5816d;
            }
            return null;
        }
        C1511d c1511d3 = this.f5859Q;
        C1511d c1511d4 = c1511d3.f5818f;
        if (c1511d4 == null || c1511d4.f5818f != c1511d3) {
            return null;
        }
        return c1511d4.f5816d;
    }

    /* JADX INFO: renamed from: J0 */
    public void m7722J0(int i10, int i11) {
        if (this.f5901q) {
            return;
        }
        this.f5858P.m7700t(i10);
        this.f5860R.m7700t(i11);
        this.f5882g0 = i10;
        this.f5874c0 = i11 - i10;
        if (this.f5851J) {
            this.f5861S.m7700t(i10 + this.f5892l0);
        }
        this.f5901q = true;
    }

    /* JADX INFO: renamed from: K */
    public C1512e m7723K() {
        return this.f5870a0;
    }

    /* JADX INFO: renamed from: K0 */
    public void m7724K0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f5880f0 = i10;
        this.f5882g0 = i11;
        if (this.f5906s0 == 8) {
            this.f5872b0 = 0;
            this.f5874c0 = 0;
            return;
        }
        b[] bVarArr = this.f5868Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f5872b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f5874c0)) {
            i17 = i14;
        }
        this.f5872b0 = i16;
        this.f5874c0 = i17;
        int i18 = this.f5896n0;
        if (i17 < i18) {
            this.f5874c0 = i18;
        }
        int i19 = this.f5894m0;
        if (i16 < i19) {
            this.f5872b0 = i19;
        }
        int i20 = this.f5833A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f5872b0 = Math.min(this.f5872b0, i20);
        }
        int i21 = this.f5839D;
        if (i21 > 0 && this.f5868Z[1] == b.MATCH_CONSTRAINT) {
            this.f5874c0 = Math.min(this.f5874c0, i21);
        }
        int i22 = this.f5872b0;
        if (i16 != i22) {
            this.f5891l = i22;
        }
        int i23 = this.f5874c0;
        if (i17 != i23) {
            this.f5893m = i23;
        }
    }

    /* JADX INFO: renamed from: L */
    public C1512e m7725L(int i10) {
        C1511d c1511d;
        C1511d c1511d2;
        if (i10 != 0) {
            if (i10 == 1 && (c1511d2 = (c1511d = this.f5858P).f5818f) != null && c1511d2.f5818f == c1511d) {
                return c1511d2.f5816d;
            }
            return null;
        }
        C1511d c1511d3 = this.f5857O;
        C1511d c1511d4 = c1511d3.f5818f;
        if (c1511d4 == null || c1511d4.f5818f != c1511d3) {
            return null;
        }
        return c1511d4.f5816d;
    }

    /* JADX INFO: renamed from: L0 */
    public void m7726L0(boolean z10) {
        this.f5851J = z10;
    }

    /* JADX INFO: renamed from: M */
    public int m7727M() {
        return m7749X() + this.f5872b0;
    }

    /* JADX INFO: renamed from: M0 */
    public void m7728M0(int i10) {
        this.f5874c0 = i10;
        int i11 = this.f5896n0;
        if (i10 < i11) {
            this.f5874c0 = i11;
        }
    }

    /* JADX INFO: renamed from: N */
    public AbstractC4422p m7729N(int i10) {
        if (i10 == 0) {
            return this.f5877e;
        }
        if (i10 == 1) {
            return this.f5879f;
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public void m7730N0(float f10) {
        this.f5898o0 = f10;
    }

    /* JADX INFO: renamed from: O */
    public void mo7731O(StringBuilder sb2) {
        sb2.append("  " + this.f5897o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f5872b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f5874c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f5880f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f5882g0);
        sb2.append("\n");
        m7735Q(sb2, "left", this.f5857O);
        m7735Q(sb2, "top", this.f5858P);
        m7735Q(sb2, "right", this.f5859Q);
        m7735Q(sb2, "bottom", this.f5860R);
        m7735Q(sb2, "baseline", this.f5861S);
        m7735Q(sb2, "centerX", this.f5862T);
        m7735Q(sb2, "centerY", this.f5863U);
        m7733P(sb2, "    width", this.f5872b0, this.f5894m0, this.f5847H[0], this.f5891l, this.f5919z, this.f5913w, this.f5835B, this.f5868Z[0], this.f5840D0[0]);
        m7733P(sb2, "    height", this.f5874c0, this.f5896n0, this.f5847H[1], this.f5893m, this.f5837C, this.f5915x, this.f5841E, this.f5868Z[1], this.f5840D0[1]);
        m7704A0(sb2, "    dimensionRatio", this.f5876d0, this.f5878e0);
        m7813x0(sb2, "    horizontalBias", this.f5898o0, f5832K0);
        m7813x0(sb2, "    verticalBias", this.f5900p0, f5832K0);
        m7815y0(sb2, "    horizontalChainStyle", this.f5920z0, 0);
        m7815y0(sb2, "    verticalChainStyle", this.f5834A0, 0);
        sb2.append("  }");
    }

    /* JADX INFO: renamed from: O0 */
    public void m7732O0(int i10) {
        this.f5920z0 = i10;
    }

    /* JADX INFO: renamed from: P */
    public final void m7733P(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, b bVar, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        m7817z0(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        m7815y0(sb2, "      size", i10, 0);
        m7815y0(sb2, "      min", i11, 0);
        m7815y0(sb2, "      max", i12, Integer.MAX_VALUE);
        m7815y0(sb2, "      matchMin", i14, 0);
        m7815y0(sb2, "      matchDef", i15, 0);
        m7813x0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    /* JADX INFO: renamed from: P0 */
    public void m7734P0(int i10, int i11) {
        this.f5880f0 = i10;
        int i12 = i11 - i10;
        this.f5872b0 = i12;
        int i13 = this.f5894m0;
        if (i12 < i13) {
            this.f5872b0 = i13;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m7735Q(StringBuilder sb2, String str, C1511d c1511d) {
        if (c1511d.f5818f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(c1511d.f5818f);
        sb2.append("'");
        if (c1511d.f5820h != Integer.MIN_VALUE || c1511d.f5819g != 0) {
            sb2.append(",");
            sb2.append(c1511d.f5819g);
            if (c1511d.f5820h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(c1511d.f5820h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    /* JADX INFO: renamed from: Q0 */
    public void m7736Q0(b bVar) {
        this.f5868Z[0] = bVar;
    }

    /* JADX INFO: renamed from: R */
    public float m7737R() {
        return this.f5900p0;
    }

    /* JADX INFO: renamed from: R0 */
    public void m7738R0(int i10, int i11, int i12, float f10) {
        this.f5913w = i10;
        this.f5919z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f5833A = i12;
        this.f5835B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f5913w = 2;
    }

    /* JADX INFO: renamed from: S */
    public int m7739S() {
        return this.f5834A0;
    }

    /* JADX INFO: renamed from: S0 */
    public void m7740S0(float f10) {
        this.f5840D0[0] = f10;
    }

    /* JADX INFO: renamed from: T */
    public b m7741T() {
        return this.f5868Z[1];
    }

    /* JADX INFO: renamed from: T0 */
    public void m7742T0(int i10, boolean z10) {
        this.f5867Y[i10] = z10;
    }

    /* JADX INFO: renamed from: U */
    public int m7743U() {
        int i10 = this.f5857O != null ? this.f5858P.f5819g : 0;
        return this.f5859Q != null ? i10 + this.f5860R.f5819g : i10;
    }

    /* JADX INFO: renamed from: U0 */
    public void m7744U0(boolean z10) {
        this.f5853K = z10;
    }

    /* JADX INFO: renamed from: V */
    public int m7745V() {
        return this.f5906s0;
    }

    /* JADX INFO: renamed from: V0 */
    public void m7746V0(boolean z10) {
        this.f5854L = z10;
    }

    /* JADX INFO: renamed from: W */
    public int m7747W() {
        if (this.f5906s0 == 8) {
            return 0;
        }
        return this.f5872b0;
    }

    /* JADX INFO: renamed from: W0 */
    public void m7748W0(int i10, int i11) {
        this.f5855M = i10;
        this.f5856N = i11;
        m7754Z0(false);
    }

    /* JADX INFO: renamed from: X */
    public int m7749X() {
        C1512e c1512e = this.f5870a0;
        return (c1512e == null || !(c1512e instanceof C1513f)) ? this.f5880f0 : ((C1513f) c1512e).f5933S0 + this.f5880f0;
    }

    /* JADX INFO: renamed from: X0 */
    public void m7750X0(int i10) {
        this.f5847H[1] = i10;
    }

    /* JADX INFO: renamed from: Y */
    public int m7751Y() {
        C1512e c1512e = this.f5870a0;
        return (c1512e == null || !(c1512e instanceof C1513f)) ? this.f5882g0 : ((C1513f) c1512e).f5934T0 + this.f5882g0;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m7752Y0(int i10) {
        this.f5847H[0] = i10;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m7753Z() {
        return this.f5851J;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m7754Z0(boolean z10) {
        this.f5885i = z10;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m7755a0(int i10) {
        if (i10 == 0) {
            return (this.f5857O.f5818f != null ? 1 : 0) + (this.f5859Q.f5818f != null ? 1 : 0) < 2;
        }
        return ((this.f5858P.f5818f != null ? 1 : 0) + (this.f5860R.f5818f != null ? 1 : 0)) + (this.f5861S.f5818f != null ? 1 : 0) < 2;
    }

    /* JADX INFO: renamed from: a1 */
    public void m7756a1(int i10) {
        if (i10 < 0) {
            this.f5896n0 = 0;
        } else {
            this.f5896n0 = i10;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m7757b0() {
        int size = this.f5866X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f5866X.get(i10).m7693m()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b1 */
    public void m7758b1(int i10) {
        if (i10 < 0) {
            this.f5894m0 = 0;
        } else {
            this.f5894m0 = i10;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m7759c0() {
        return (this.f5891l == -1 && this.f5893m == -1) ? false : true;
    }

    /* JADX INFO: renamed from: c1 */
    public void m7760c1(int i10, int i11) {
        this.f5880f0 = i10;
        this.f5882g0 = i11;
    }

    /* JADX INFO: renamed from: d */
    public final void m7761d() {
        this.f5866X.add(this.f5857O);
        this.f5866X.add(this.f5858P);
        this.f5866X.add(this.f5859Q);
        this.f5866X.add(this.f5860R);
        this.f5866X.add(this.f5862T);
        this.f5866X.add(this.f5863U);
        this.f5866X.add(this.f5864V);
        this.f5866X.add(this.f5861S);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m7762d0(int i10, int i11) {
        C1511d c1511d;
        C1511d c1511d2;
        if (i10 == 0) {
            C1511d c1511d3 = this.f5857O.f5818f;
            return c1511d3 != null && c1511d3.m7694n() && (c1511d2 = this.f5859Q.f5818f) != null && c1511d2.m7694n() && (this.f5859Q.f5818f.m7685e() - this.f5859Q.m7686f()) - (this.f5857O.f5818f.m7685e() + this.f5857O.m7686f()) >= i11;
        }
        C1511d c1511d4 = this.f5858P.f5818f;
        if (c1511d4 != null && c1511d4.m7694n() && (c1511d = this.f5860R.f5818f) != null && c1511d.m7694n() && (this.f5860R.f5818f.m7685e() - this.f5860R.m7686f()) - (this.f5858P.f5818f.m7685e() + this.f5858P.m7686f()) >= i11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d1 */
    public void m7763d1(C1512e c1512e) {
        this.f5870a0 = c1512e;
    }

    /* JADX INFO: renamed from: e */
    public void m7764e(C1513f c1513f, C13682d c13682d, HashSet<C1512e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            C1518k.m7925a(c1513f, c13682d, this);
            hashSet.remove(this);
            mo7666g(c13682d, c1513f.m7840V1(64));
        }
        if (i10 == 0) {
            HashSet<C1511d> hashSetM7684d = this.f5857O.m7684d();
            if (hashSetM7684d != null) {
                Iterator<C1511d> it = hashSetM7684d.iterator();
                while (it.hasNext()) {
                    it.next().f5816d.m7764e(c1513f, c13682d, hashSet, i10, true);
                }
            }
            HashSet<C1511d> hashSetM7684d2 = this.f5859Q.m7684d();
            if (hashSetM7684d2 != null) {
                Iterator<C1511d> it2 = hashSetM7684d2.iterator();
                while (it2.hasNext()) {
                    it2.next().f5816d.m7764e(c1513f, c13682d, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<C1511d> hashSetM7684d3 = this.f5858P.m7684d();
        if (hashSetM7684d3 != null) {
            Iterator<C1511d> it3 = hashSetM7684d3.iterator();
            while (it3.hasNext()) {
                it3.next().f5816d.m7764e(c1513f, c13682d, hashSet, i10, true);
            }
        }
        HashSet<C1511d> hashSetM7684d4 = this.f5860R.m7684d();
        if (hashSetM7684d4 != null) {
            Iterator<C1511d> it4 = hashSetM7684d4.iterator();
            while (it4.hasNext()) {
                it4.next().f5816d.m7764e(c1513f, c13682d, hashSet, i10, true);
            }
        }
        HashSet<C1511d> hashSetM7684d5 = this.f5861S.m7684d();
        if (hashSetM7684d5 != null) {
            Iterator<C1511d> it5 = hashSetM7684d5.iterator();
            while (it5.hasNext()) {
                it5.next().f5816d.m7764e(c1513f, c13682d, hashSet, i10, true);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m7765e0(C1511d.a aVar, C1512e c1512e, C1511d.a aVar2, int i10, int i11) {
        mo7791o(aVar).m7682b(c1512e.mo7791o(aVar2), i10, i11, true);
    }

    /* JADX INFO: renamed from: e1 */
    public void m7766e1(float f10) {
        this.f5900p0 = f10;
    }

    /* JADX INFO: renamed from: f */
    public boolean m7767f() {
        return (this instanceof C1519l) || (this instanceof C1515h);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m7768f0(int i10) {
        C1511d c1511d;
        C1511d c1511d2;
        int i11 = i10 * 2;
        C1511d[] c1511dArr = this.f5865W;
        C1511d c1511d3 = c1511dArr[i11];
        C1511d c1511d4 = c1511d3.f5818f;
        return (c1511d4 == null || c1511d4.f5818f == c1511d3 || (c1511d2 = (c1511d = c1511dArr[i11 + 1]).f5818f) == null || c1511d2.f5818f != c1511d) ? false : true;
    }

    /* JADX INFO: renamed from: f1 */
    public void m7769f1(int i10) {
        this.f5834A0 = i10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r18v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r18v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r27v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r27v5, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r27v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r27v8, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r27v9, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v10, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v11, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v12, resolved type: boolean */
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
    /* JADX INFO: renamed from: g */
    public void mo7666g(C13682d c13682d, boolean z10) {
        boolean z11;
        boolean z12;
        C1512e c1512e;
        C1512e c1512e2;
        boolean z13;
        boolean z14;
        int i10;
        C13687i c13687i;
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
        C13687i c13687i2;
        C13687i c13687i3;
        C13687i c13687i4;
        int i16;
        int i17;
        char c10;
        int i18;
        int i19;
        C13682d c13682d2;
        boolean z19;
        C4420n c4420n;
        C4418l c4418l;
        int i20;
        int i21;
        boolean zM7775i0;
        boolean zM7781k0;
        C4418l c4418l2;
        C4420n c4420n2;
        C13682d c13682d3 = c13682d;
        C13687i c13687iM49971q = c13682d3.m49971q(this.f5857O);
        C13687i c13687iM49971q2 = c13682d3.m49971q(this.f5859Q);
        C13687i c13687iM49971q3 = c13682d3.m49971q(this.f5858P);
        C13687i c13687iM49971q4 = c13682d3.m49971q(this.f5860R);
        C13687i c13687iM49971q5 = c13682d3.m49971q(this.f5861S);
        C1512e c1512e3 = this.f5870a0;
        if (c1512e3 == null) {
            z11 = false;
            z12 = false;
        } else {
            z12 = c1512e3 != null && c1512e3.f5868Z[0] == b.WRAP_CONTENT;
            z11 = c1512e3 != null && c1512e3.f5868Z[1] == b.WRAP_CONTENT;
            int i22 = this.f5911v;
            if (i22 == 1) {
                z11 = false;
            } else if (i22 == 2) {
                z12 = false;
            } else if (i22 == 3) {
                z11 = false;
                z12 = false;
            }
        }
        if (this.f5906s0 == 8 && !this.f5908t0 && !m7757b0()) {
            boolean[] zArr = this.f5867Y;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z20 = this.f5899p;
        if (z20 || this.f5901q) {
            if (z20) {
                c13682d3.m49960f(c13687iM49971q, this.f5880f0);
                c13682d3.m49960f(c13687iM49971q2, this.f5880f0 + this.f5872b0);
                if (z12 && (c1512e2 = this.f5870a0) != null) {
                    if (this.f5889k) {
                        C1513f c1513f = (C1513f) c1512e2;
                        c1513f.m7820A1(this.f5857O);
                        c1513f.m7852z1(this.f5859Q);
                    } else {
                        c13682d3.m49962h(c13682d3.m49971q(c1512e2.f5859Q), c13687iM49971q2, 0, 5);
                    }
                }
            }
            if (this.f5901q) {
                c13682d3.m49960f(c13687iM49971q3, this.f5882g0);
                c13682d3.m49960f(c13687iM49971q4, this.f5882g0 + this.f5874c0);
                if (this.f5861S.m7693m()) {
                    c13682d3.m49960f(c13687iM49971q5, this.f5882g0 + this.f5892l0);
                }
                if (z11 && (c1512e = this.f5870a0) != null) {
                    if (this.f5889k) {
                        C1513f c1513f2 = (C1513f) c1512e;
                        c1513f2.m7825F1(this.f5858P);
                        c1513f2.m7824E1(this.f5860R);
                    } else {
                        c13682d3.m49962h(c13682d3.m49971q(c1512e.f5860R), c13687iM49971q4, 0, 5);
                    }
                }
            }
            if (this.f5899p && this.f5901q) {
                this.f5899p = false;
                this.f5901q = false;
                return;
            }
        }
        boolean z21 = C13682d.f47990s;
        if (z10 && (c4418l2 = this.f5877e) != null && (c4420n2 = this.f5879f) != null) {
            C4412f c4412f = c4418l2.f18385h;
            if (c4412f.f18335j && c4418l2.f18386i.f18335j && c4420n2.f18385h.f18335j && c4420n2.f18386i.f18335j) {
                c13682d3.m49960f(c13687iM49971q, c4412f.f18332g);
                c13682d3.m49960f(c13687iM49971q2, this.f5877e.f18386i.f18332g);
                c13682d3.m49960f(c13687iM49971q3, this.f5879f.f18385h.f18332g);
                c13682d3.m49960f(c13687iM49971q4, this.f5879f.f18386i.f18332g);
                c13682d3.m49960f(c13687iM49971q5, this.f5879f.f18361k.f18332g);
                if (this.f5870a0 != null) {
                    if (z12 && this.f5881g[0] && !m7775i0()) {
                        c13682d3.m49962h(c13682d3.m49971q(this.f5870a0.f5859Q), c13687iM49971q2, 0, 8);
                    }
                    if (z11 && this.f5881g[1] && !m7781k0()) {
                        c13682d3.m49962h(c13682d3.m49971q(this.f5870a0.f5860R), c13687iM49971q4, 0, 8);
                    }
                }
                this.f5899p = false;
                this.f5901q = false;
                return;
            }
        }
        if (this.f5870a0 != null) {
            if (m7768f0(0)) {
                ((C1513f) this.f5870a0).m7849w1(this, 0);
                zM7775i0 = true;
            } else {
                zM7775i0 = m7775i0();
            }
            if (m7768f0(1)) {
                ((C1513f) this.f5870a0).m7849w1(this, 1);
                zM7781k0 = true;
            } else {
                zM7781k0 = m7781k0();
            }
            if (!zM7775i0 && z12 && this.f5906s0 != 8 && this.f5857O.f5818f == null && this.f5859Q.f5818f == null) {
                c13682d3.m49962h(c13682d3.m49971q(this.f5870a0.f5859Q), c13687iM49971q2, 0, 1);
            }
            if (!zM7781k0 && z11 && this.f5906s0 != 8 && this.f5858P.f5818f == null && this.f5860R.f5818f == null && this.f5861S == null) {
                c13682d3.m49962h(c13682d3.m49971q(this.f5870a0.f5860R), c13687iM49971q4, 0, 1);
            }
            z13 = zM7775i0;
            z14 = zM7781k0;
        } else {
            z13 = false;
            z14 = false;
        }
        int i23 = this.f5872b0;
        int i24 = this.f5894m0;
        if (i23 >= i24) {
            i24 = i23;
        }
        int i25 = this.f5874c0;
        int i26 = this.f5896n0;
        if (i25 >= i26) {
            i26 = i25;
        }
        b[] bVarArr = this.f5868Z;
        b bVar3 = bVarArr[0];
        b bVar4 = b.MATCH_CONSTRAINT;
        boolean z22 = bVar3 != bVar4;
        b bVar5 = bVarArr[1];
        boolean z23 = bVar5 != bVar4;
        int i27 = this.f5878e0;
        this.f5843F = i27;
        int i28 = i24;
        float f10 = this.f5876d0;
        this.f5845G = f10;
        int i29 = this.f5913w;
        int i30 = this.f5915x;
        if (f10 > 0.0f) {
            i10 = i26;
            if (this.f5906s0 != 8) {
                i11 = (bVar3 == bVar4 && i29 == 0) ? 3 : i29;
                int i31 = (bVar5 == bVar4 && i30 == 0) ? 3 : i30;
                if (bVar3 == bVar4 && bVar5 == bVar4) {
                    c13687i = c13687iM49971q2;
                    i21 = 3;
                    if (i11 == 3 && i31 == 3) {
                        m7795p1(z12, z11, z22, z23);
                    }
                    i12 = i31;
                    z15 = true;
                    int[] iArr = this.f5917y;
                    iArr[0] = i11;
                    iArr[1] = i12;
                    this.f5883h = z15;
                    if (z15) {
                        int i32 = this.f5843F;
                        i13 = -1;
                        boolean z24 = i32 != 0 || i32 == -1;
                        if (z15 || !((i20 = this.f5843F) == 1 || i20 == i13)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        bVar = this.f5868Z[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2 || !(this instanceof C1513f)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            i14 = 0;
                        } else {
                            i14 = i28;
                        }
                        boolean z25 = !this.f5864V.m7695o();
                        boolean[] zArr2 = this.f5867Y;
                        boolean z26 = zArr2[0];
                        boolean z27 = zArr2[1];
                        if (this.f5907t != 2 || this.f5899p) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            if (z10 && (c4418l = this.f5877e) != null) {
                                C4412f c4412f2 = c4418l.f18385h;
                                if (c4412f2.f18335j && c4418l.f18386i.f18335j) {
                                    if (z10) {
                                        c13682d3.m49960f(c13687iM49971q, c4412f2.f18332g);
                                        C13687i c13687i5 = c13687i;
                                        c13682d3.m49960f(c13687i5, this.f5877e.f18386i.f18332g);
                                        if (this.f5870a0 != null && z12 && this.f5881g[0] && !m7775i0()) {
                                            c13682d3.m49962h(c13682d3.m49971q(this.f5870a0.f5859Q), c13687i5, 0, 8);
                                        }
                                        c13687i = c13687i5;
                                    }
                                    i15 = i11;
                                    z18 = z12;
                                }
                            }
                            C13687i c13687i6 = c13687i;
                            C1512e c1512e4 = this.f5870a0;
                            C13687i c13687iM49971q6 = c1512e4 != null ? c13682d3.m49971q(c1512e4.f5859Q) : null;
                            C1512e c1512e5 = this.f5870a0;
                            C13687i c13687iM49971q7 = c1512e5 != null ? c13682d3.m49971q(c1512e5.f5857O) : null;
                            boolean z28 = this.f5881g[0];
                            b[] bVarArr2 = this.f5868Z;
                            c13687i = c13687i6;
                            b bVar6 = bVarArr2[0];
                            C1511d c1511d = this.f5857O;
                            C13687i c13687i7 = c13687iM49971q7;
                            C1511d c1511d2 = this.f5859Q;
                            z15 = z15;
                            z18 = z12;
                            int i33 = this.f5880f0;
                            int i34 = this.f5894m0;
                            int i35 = this.f5847H[0];
                            float f11 = this.f5898o0;
                            boolean z29 = bVarArr2[1] == bVar4;
                            c13687iM49971q = c13687iM49971q;
                            boolean z30 = z11;
                            C13687i c13687i8 = c13687iM49971q6;
                            z11 = z30;
                            i15 = i11;
                            bVar2 = bVar2;
                            c13682d3 = c13682d;
                            m7774i(c13682d3, true, z18, z11, z28, c13687i7, c13687i8, bVar6, z17, c1511d, c1511d2, i33, i14, i34, i35, f11, z24, z29, z13, z14, z26, i15, i12, this.f5919z, this.f5833A, this.f5835B, z25);
                        }
                        if (z10 || (c4420n = this.f5879f) == null) {
                            c13687i2 = r24;
                            c13687i3 = r25;
                            c13687i4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            C4412f c4412f3 = c4420n.f18385h;
                            if (c4412f3.f18335j && c4420n.f18386i.f18335j) {
                                int i36 = c4412f3.f18332g;
                                c13687i2 = c13687iM49971q3;
                                c13682d3.m49960f(c13687i2, i36);
                                c13687i3 = c13687iM49971q4;
                                c13682d3.m49960f(c13687i3, this.f5879f.f18386i.f18332g);
                                c13687i4 = c13687iM49971q5;
                                c13682d3.m49960f(c13687i4, this.f5879f.f18361k.f18332g);
                                C1512e c1512e6 = this.f5870a0;
                                if (c1512e6 == null || z14 || !z11) {
                                    i16 = 0;
                                    i17 = 8;
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                    if (this.f5881g[1]) {
                                        i16 = 0;
                                        i17 = 8;
                                        c13682d3.m49962h(c13682d3.m49971q(c1512e6.f5860R), c13687i3, 0, 8);
                                    } else {
                                        i16 = 0;
                                        i17 = 8;
                                    }
                                }
                                i18 = i16;
                            } else {
                                c13687i2 = r24;
                                c13687i3 = r25;
                                c13687i4 = r26;
                                i16 = 0;
                                i17 = 8;
                                c10 = 1;
                                i18 = 1;
                            }
                        }
                        if (this.f5909u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0 && !this.f5901q) {
                            boolean z31 = (this.f5868Z[c10] == bVar2 && (this instanceof C1513f)) ? c10 : i16;
                            int i37 = z31 != 0 ? i16 : i10;
                            C1512e c1512e7 = this.f5870a0;
                            C13687i c13687iM49971q8 = c1512e7 != null ? c13682d3.m49971q(c1512e7.f5860R) : null;
                            C1512e c1512e8 = this.f5870a0;
                            C13687i c13687iM49971q9 = c1512e8 != null ? c13682d3.m49971q(c1512e8.f5858P) : null;
                            if (this.f5892l0 > 0 || this.f5906s0 == i17) {
                                z19 = z25;
                                C1511d c1511d3 = this.f5861S;
                                if (c1511d3.f5818f != null) {
                                    c13682d3.m49959e(c13687i4, c13687i2, m7793p(), i17);
                                    c13682d3.m49959e(c13687i4, c13682d3.m49971q(this.f5861S.f5818f), this.f5861S.m7686f(), i17);
                                    if (z11) {
                                        c13682d3.m49962h(c13687iM49971q8, c13682d3.m49971q(this.f5860R), i16, 5);
                                    }
                                    z19 = i16;
                                } else if (this.f5906s0 == i17) {
                                    c13682d3.m49959e(c13687i4, c13687i2, c1511d3.m7686f(), i17);
                                    z19 = z25;
                                } else {
                                    c13682d3.m49959e(c13687i4, c13687i2, m7793p(), i17);
                                    z19 = z25;
                                }
                            }
                            z19 = z25;
                            boolean z32 = this.f5881g[c10];
                            b[] bVarArr3 = this.f5868Z;
                            int i38 = i16;
                            m7774i(c13682d, false, z11, z18, z32, c13687iM49971q9, c13687iM49971q8, bVarArr3[c10], z31, this.f5858P, this.f5860R, this.f5882g0, i37, this.f5896n0, this.f5847H[c10], this.f5900p0, z16, bVarArr3[i38] == bVar4 ? c10 : i38, z14, z13, z27, i12, i15, this.f5837C, this.f5839D, this.f5841E, z19);
                        }
                        if (!z15) {
                            c13682d2 = c13682d;
                        } else if (this.f5843F == 1) {
                            c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                            c13682d2 = c13682d;
                        } else {
                            c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                            c13682d2 = c13682d;
                        }
                        if (this.f5864V.m7695o()) {
                            c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                        }
                        this.f5899p = false;
                        this.f5901q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.f5868Z[0];
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
                    boolean z210 = !this.f5864V.m7695o();
                    boolean[] zArr3 = this.f5867Y;
                    boolean z211 = zArr3[0];
                    boolean z212 = zArr3[1];
                    if (this.f5907t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        c13687i2 = r24;
                        c13687i3 = r25;
                        c13687i4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        c13687i2 = r24;
                        c13687i3 = r25;
                        c13687i4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f5909u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        c13682d2 = c13682d;
                    } else if (this.f5843F == 1) {
                        c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                        c13682d2 = c13682d;
                    } else {
                        c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                        c13682d2 = c13682d;
                    }
                    if (this.f5864V.m7695o()) {
                        c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                    }
                    this.f5899p = false;
                    this.f5901q = false;
                }
                c13687i = c13687iM49971q2;
                i21 = 3;
                if (bVar3 == bVar4 && i11 == i21) {
                    this.f5843F = 0;
                    i28 = (int) (i25 * f10);
                    if (bVar5 != bVar4) {
                        i11 = 4;
                        i12 = i31;
                    } else {
                        i12 = i31;
                        z15 = true;
                    }
                    int[] iArr2 = this.f5917y;
                    iArr2[0] = i11;
                    iArr2[1] = i12;
                    this.f5883h = z15;
                    if (z15) {
                        int i39 = this.f5843F;
                        i13 = -1;
                        if (i39 != 0) {
                        }
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar = this.f5868Z[0];
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
                        boolean z213 = !this.f5864V.m7695o();
                        boolean[] zArr4 = this.f5867Y;
                        boolean z214 = zArr4[0];
                        boolean z215 = zArr4[1];
                        if (this.f5907t != 2) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            i15 = i11;
                            z18 = z12;
                        }
                        if (z10) {
                            c13687i2 = r24;
                            c13687i3 = r25;
                            c13687i4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            c13687i2 = r24;
                            c13687i3 = r25;
                            c13687i4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        }
                        if (this.f5909u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0) {
                        }
                        if (!z15) {
                            c13682d2 = c13682d;
                        } else if (this.f5843F == 1) {
                            c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                            c13682d2 = c13682d;
                        } else {
                            c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                            c13682d2 = c13682d;
                        }
                        if (this.f5864V.m7695o()) {
                            c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                        }
                        this.f5899p = false;
                        this.f5901q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.f5868Z[0];
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
                    boolean z216 = !this.f5864V.m7695o();
                    boolean[] zArr5 = this.f5867Y;
                    boolean z217 = zArr5[0];
                    boolean z218 = zArr5[1];
                    if (this.f5907t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        c13687i2 = r24;
                        c13687i3 = r25;
                        c13687i4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        c13687i2 = r24;
                        c13687i3 = r25;
                        c13687i4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f5909u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        c13682d2 = c13682d;
                    } else if (this.f5843F == 1) {
                        c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                        c13682d2 = c13682d;
                    } else {
                        c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                        c13682d2 = c13682d;
                    }
                    if (this.f5864V.m7695o()) {
                        c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                    }
                    this.f5899p = false;
                    this.f5901q = false;
                }
                if (bVar5 == bVar4 && i31 == i21) {
                    this.f5843F = 1;
                    if (i27 == -1) {
                        this.f5845G = 1.0f / f10;
                    }
                    i10 = (int) (this.f5845G * i23);
                    if (bVar3 != bVar4) {
                        i12 = 4;
                    }
                    int[] iArr3 = this.f5917y;
                    iArr3[0] = i11;
                    iArr3[1] = i12;
                    this.f5883h = z15;
                    if (z15) {
                        int i310 = this.f5843F;
                        i13 = -1;
                        if (i310 != 0) {
                        }
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar = this.f5868Z[0];
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
                        boolean z219 = !this.f5864V.m7695o();
                        boolean[] zArr6 = this.f5867Y;
                        boolean z2110 = zArr6[0];
                        boolean z2111 = zArr6[1];
                        if (this.f5907t != 2) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            i15 = i11;
                            z18 = z12;
                        }
                        if (z10) {
                            c13687i2 = r24;
                            c13687i3 = r25;
                            c13687i4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            c13687i2 = r24;
                            c13687i3 = r25;
                            c13687i4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        }
                        if (this.f5909u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0) {
                        }
                        if (!z15) {
                            c13682d2 = c13682d;
                        } else if (this.f5843F == 1) {
                            c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                            c13682d2 = c13682d;
                        } else {
                            c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                            c13682d2 = c13682d;
                        }
                        if (this.f5864V.m7695o()) {
                            c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                        }
                        this.f5899p = false;
                        this.f5901q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.f5868Z[0];
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
                    boolean z2112 = !this.f5864V.m7695o();
                    boolean[] zArr7 = this.f5867Y;
                    boolean z2113 = zArr7[0];
                    boolean z2114 = zArr7[1];
                    if (this.f5907t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        c13687i2 = r24;
                        c13687i3 = r25;
                        c13687i4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        c13687i2 = r24;
                        c13687i3 = r25;
                        c13687i4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f5909u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        c13682d2 = c13682d;
                    } else if (this.f5843F == 1) {
                        c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                        c13682d2 = c13682d;
                    } else {
                        c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                        c13682d2 = c13682d;
                    }
                    if (this.f5864V.m7695o()) {
                        c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                    }
                    this.f5899p = false;
                    this.f5901q = false;
                }
                i12 = i31;
                z15 = true;
                int[] iArr4 = this.f5917y;
                iArr4[0] = i11;
                iArr4[1] = i12;
                this.f5883h = z15;
                if (z15) {
                    int i311 = this.f5843F;
                    i13 = -1;
                    if (i311 != 0) {
                    }
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.f5868Z[0];
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
                    boolean z2115 = !this.f5864V.m7695o();
                    boolean[] zArr8 = this.f5867Y;
                    boolean z2116 = zArr8[0];
                    boolean z2117 = zArr8[1];
                    if (this.f5907t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        c13687i2 = r24;
                        c13687i3 = r25;
                        c13687i4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        c13687i2 = r24;
                        c13687i3 = r25;
                        c13687i4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f5909u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        c13682d2 = c13682d;
                    } else if (this.f5843F == 1) {
                        c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                        c13682d2 = c13682d;
                    } else {
                        c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                        c13682d2 = c13682d;
                    }
                    if (this.f5864V.m7695o()) {
                        c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                    }
                    this.f5899p = false;
                    this.f5901q = false;
                }
                i13 = -1;
                if (z15) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar = this.f5868Z[0];
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
                boolean z2118 = !this.f5864V.m7695o();
                boolean[] zArr9 = this.f5867Y;
                boolean z2119 = zArr9[0];
                boolean z21110 = zArr9[1];
                if (this.f5907t != 2) {
                    i15 = i11;
                    z18 = z12;
                } else {
                    i15 = i11;
                    z18 = z12;
                }
                if (z10) {
                    c13687i2 = r24;
                    c13687i3 = r25;
                    c13687i4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                } else {
                    c13687i2 = r24;
                    c13687i3 = r25;
                    c13687i4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                }
                if (this.f5909u == 2) {
                    i19 = i16;
                } else {
                    i19 = i18;
                }
                if (i19 == 0) {
                }
                if (!z15) {
                    c13682d2 = c13682d;
                } else if (this.f5843F == 1) {
                    c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                    c13682d2 = c13682d;
                } else {
                    c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                    c13682d2 = c13682d;
                }
                if (this.f5864V.m7695o()) {
                    c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                }
                this.f5899p = false;
                this.f5901q = false;
            }
            z15 = false;
            int[] iArr5 = this.f5917y;
            iArr5[0] = i11;
            iArr5[1] = i12;
            this.f5883h = z15;
            if (z15) {
                int i312 = this.f5843F;
                i13 = -1;
                if (i312 != 0) {
                }
                if (z15) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar = this.f5868Z[0];
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
                boolean z21111 = !this.f5864V.m7695o();
                boolean[] zArr10 = this.f5867Y;
                boolean z21112 = zArr10[0];
                boolean z21113 = zArr10[1];
                if (this.f5907t != 2) {
                    i15 = i11;
                    z18 = z12;
                } else {
                    i15 = i11;
                    z18 = z12;
                }
                if (z10) {
                    c13687i2 = r24;
                    c13687i3 = r25;
                    c13687i4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                } else {
                    c13687i2 = r24;
                    c13687i3 = r25;
                    c13687i4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                }
                if (this.f5909u == 2) {
                    i19 = i16;
                } else {
                    i19 = i18;
                }
                if (i19 == 0) {
                }
                if (!z15) {
                    c13682d2 = c13682d;
                } else if (this.f5843F == 1) {
                    c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                    c13682d2 = c13682d;
                } else {
                    c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                    c13682d2 = c13682d;
                }
                if (this.f5864V.m7695o()) {
                    c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
                }
                this.f5899p = false;
                this.f5901q = false;
            }
            i13 = -1;
            if (z15) {
                z16 = false;
            } else {
                z16 = false;
            }
            bVar = this.f5868Z[0];
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
            boolean z21114 = !this.f5864V.m7695o();
            boolean[] zArr11 = this.f5867Y;
            boolean z21115 = zArr11[0];
            boolean z21116 = zArr11[1];
            if (this.f5907t != 2) {
                i15 = i11;
                z18 = z12;
            } else {
                i15 = i11;
                z18 = z12;
            }
            if (z10) {
                c13687i2 = r24;
                c13687i3 = r25;
                c13687i4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            } else {
                c13687i2 = r24;
                c13687i3 = r25;
                c13687i4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            }
            if (this.f5909u == 2) {
                i19 = i16;
            } else {
                i19 = i18;
            }
            if (i19 == 0) {
            }
            if (!z15) {
                c13682d2 = c13682d;
            } else if (this.f5843F == 1) {
                c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                c13682d2 = c13682d;
            } else {
                c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                c13682d2 = c13682d;
            }
            if (this.f5864V.m7695o()) {
                c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
            }
            this.f5899p = false;
            this.f5901q = false;
        }
        i10 = i26;
        c13687i = c13687iM49971q2;
        i11 = i29;
        i12 = i30;
        z15 = false;
        int[] iArr6 = this.f5917y;
        iArr6[0] = i11;
        iArr6[1] = i12;
        this.f5883h = z15;
        if (z15) {
            int i313 = this.f5843F;
            i13 = -1;
            if (i313 != 0) {
            }
            if (z15) {
                z16 = false;
            } else {
                z16 = false;
            }
            bVar = this.f5868Z[0];
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
            boolean z21117 = !this.f5864V.m7695o();
            boolean[] zArr12 = this.f5867Y;
            boolean z21118 = zArr12[0];
            boolean z21119 = zArr12[1];
            if (this.f5907t != 2) {
                i15 = i11;
                z18 = z12;
            } else {
                i15 = i11;
                z18 = z12;
            }
            if (z10) {
                c13687i2 = r24;
                c13687i3 = r25;
                c13687i4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            } else {
                c13687i2 = r24;
                c13687i3 = r25;
                c13687i4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            }
            if (this.f5909u == 2) {
                i19 = i16;
            } else {
                i19 = i18;
            }
            if (i19 == 0) {
            }
            if (!z15) {
                c13682d2 = c13682d;
            } else if (this.f5843F == 1) {
                c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
                c13682d2 = c13682d;
            } else {
                c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
                c13682d2 = c13682d;
            }
            if (this.f5864V.m7695o()) {
                c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
            }
            this.f5899p = false;
            this.f5901q = false;
        }
        i13 = -1;
        if (z15) {
            z16 = false;
        } else {
            z16 = false;
        }
        bVar = this.f5868Z[0];
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
        boolean z211110 = !this.f5864V.m7695o();
        boolean[] zArr13 = this.f5867Y;
        boolean z211111 = zArr13[0];
        boolean z211112 = zArr13[1];
        if (this.f5907t != 2) {
            i15 = i11;
            z18 = z12;
        } else {
            i15 = i11;
            z18 = z12;
        }
        if (z10) {
            c13687i2 = r24;
            c13687i3 = r25;
            c13687i4 = r26;
            i16 = 0;
            i17 = 8;
            c10 = 1;
            i18 = 1;
        } else {
            c13687i2 = r24;
            c13687i3 = r25;
            c13687i4 = r26;
            i16 = 0;
            i17 = 8;
            c10 = 1;
            i18 = 1;
        }
        if (this.f5909u == 2) {
            i19 = i16;
        } else {
            i19 = i18;
        }
        if (i19 == 0) {
        }
        if (!z15) {
            c13682d2 = c13682d;
        } else if (this.f5843F == 1) {
            c13682d.m49965k(c13687i3, c13687i2, c13687i, c13687iM49971q, this.f5845G, 8);
            c13682d2 = c13682d;
        } else {
            c13682d.m49965k(c13687i, c13687iM49971q, c13687i3, c13687i2, this.f5845G, 8);
            c13682d2 = c13682d;
        }
        if (this.f5864V.m7695o()) {
            c13682d2.m49956b(this, this.f5864V.m7690j().m7688h(), (float) Math.toRadians(this.f5849I + 90.0f), this.f5864V.m7686f());
        }
        this.f5899p = false;
        this.f5901q = false;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m7770g0() {
        return this.f5903r;
    }

    /* JADX INFO: renamed from: g1 */
    public void m7771g1(int i10, int i11) {
        this.f5882g0 = i10;
        int i12 = i11 - i10;
        this.f5874c0 = i12;
        int i13 = this.f5896n0;
        if (i12 < i13) {
            this.f5874c0 = i13;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean mo7667h() {
        return this.f5906s0 != 8;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m7772h0(int i10) {
        return this.f5867Y[i10];
    }

    /* JADX INFO: renamed from: h1 */
    public void m7773h1(b bVar) {
        this.f5868Z[1] = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0582  */
    /* JADX INFO: renamed from: i */
    public final void m7774i(C13682d c13682d, boolean z10, boolean z11, boolean z12, boolean z13, C13687i c13687i, C13687i c13687i2, b bVar, boolean z14, C1511d c1511d, C1511d c1511d2, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        boolean z21;
        int iMin;
        int i18;
        C13687i c13687i3;
        boolean z22;
        boolean z23;
        int i19;
        int i20;
        C13687i c13687iM49971q;
        C13687i c13687iM49971q2;
        int i21;
        char c10;
        char c11;
        C1511d c1511d3;
        boolean z24;
        C13687i c13687i4;
        boolean z25;
        boolean z26;
        int i22;
        int i23;
        boolean z27;
        boolean z28;
        C13687i c13687i5;
        C1512e c1512e;
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
        C1512e c1512e2;
        int i32;
        C1512e c1512e3;
        c13682d = c13682d;
        C13687i c13687iM49971q3 = c13682d.m49971q(c1511d);
        C13687i c13687iM49971q4 = c13682d.m49971q(c1511d2);
        C13687i c13687iM49971q5 = c13682d.m49971q(c1511d.m7690j());
        C13687i c13687iM49971q6 = c13682d.m49971q(c1511d2.m7690j());
        C13682d.m49949x();
        boolean zM7695o = c1511d.m7695o();
        boolean zM7695o2 = c1511d2.m7695o();
        boolean zM7695o3 = this.f5864V.m7695o();
        int i33 = zM7695o2 ? (zM7695o ? 1 : 0) + 1 : zM7695o ? 1 : 0;
        if (zM7695o3) {
            i33++;
        }
        int i34 = z15 ? 3 : i14;
        C13687i c13687i6 = c13687iM49971q6;
        int iOrdinal = bVar.ordinal();
        boolean z30 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i34 == 4) ? false : true;
        int i35 = this.f5891l;
        if (i35 != -1 && z10) {
            this.f5891l = -1;
            i11 = i35;
            z30 = false;
        }
        int i36 = this.f5893m;
        if (i36 == -1 || z10) {
            i36 = i11;
        } else {
            this.f5893m = -1;
            z30 = false;
        }
        int i37 = i36;
        if (this.f5906s0 == 8) {
            iMin = 0;
            z21 = false;
        } else {
            z21 = z30;
            iMin = i37;
        }
        if (z20) {
            if (!zM7695o && !zM7695o2 && !zM7695o3) {
                c13682d.m49960f(c13687iM49971q3, i10);
            } else if (zM7695o && !zM7695o2) {
                i18 = 8;
                c13682d.m49959e(c13687iM49971q3, c13687iM49971q5, c1511d.m7686f(), 8);
            }
            i18 = 8;
        } else {
            i18 = 8;
        }
        if (z21 == 0) {
            if (z14) {
                c13682d.m49959e(c13687iM49971q4, c13687iM49971q3, 0, 3);
                if (i12 > 0) {
                    c13682d.m49962h(c13687iM49971q4, c13687iM49971q3, i12, 8);
                }
                if (i13 < Integer.MAX_VALUE) {
                    c13682d.m49964j(c13687iM49971q4, c13687iM49971q3, i13, 8);
                }
            } else {
                c13682d.m49959e(c13687iM49971q4, c13687iM49971q3, iMin, i18);
            }
            i20 = i17;
            c13687i3 = c13687iM49971q4;
            i33 = i33 == true ? 1 : 0;
            c13687i6 = c13687i6;
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
                c13682d.m49962h(c13687iM49971q4, c13687iM49971q3, i38, 8);
                iMin = Math.max(iMin, i38);
            }
            if (i39 > 0) {
                if (!z11 || i34 != 1) {
                    c13682d.m49964j(c13687iM49971q4, c13687iM49971q3, i39, 8);
                }
                iMin = Math.min(iMin, i39);
            }
            if (i34 == 1) {
                if (z11) {
                    c13682d.m49959e(c13687iM49971q4, c13687iM49971q3, iMin, 8);
                } else if (z17) {
                    c13682d.m49959e(c13687iM49971q4, c13687iM49971q3, iMin, 5);
                    c13682d.m49964j(c13687iM49971q4, c13687iM49971q3, iMin, 8);
                } else {
                    c13682d.m49959e(c13687iM49971q4, c13687iM49971q3, iMin, 5);
                    c13682d.m49964j(c13687iM49971q4, c13687iM49971q3, iMin, 8);
                }
                c13687i3 = c13687iM49971q4;
                c13687i6 = c13687i6;
                z22 = z21;
                z23 = z13;
                i19 = i38;
                i20 = i39;
                i33 = i33 == true ? 1 : 0;
            } else {
                if (i34 == 2) {
                    C1511d.a aVarM7691k = c1511d.m7691k();
                    C1511d.a aVar = C1511d.a.TOP;
                    if (aVarM7691k == aVar || c1511d.m7691k() == C1511d.a.BOTTOM) {
                        c13687iM49971q = c13682d.m49971q(this.f5870a0.mo7791o(aVar));
                        c13687iM49971q2 = c13682d.m49971q(this.f5870a0.mo7791o(C1511d.a.BOTTOM));
                    } else {
                        c13687iM49971q = c13682d.m49971q(this.f5870a0.mo7791o(C1511d.a.LEFT));
                        c13687iM49971q2 = c13682d.m49971q(this.f5870a0.mo7791o(C1511d.a.RIGHT));
                    }
                    C13687i c13687i7 = c13687iM49971q2;
                    c13687i3 = c13687iM49971q4;
                    c13682d.m49958d(c13682d.m49972r().m49932k(c13687i3, c13687iM49971q3, c13687i7, c13687iM49971q, f11));
                    if (z11) {
                        z21 = false;
                    }
                    z23 = z13;
                    z22 = z21;
                } else {
                    c13687i3 = c13687iM49971q4;
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
            c13682d.m49959e(c13687iM49971q4, c13687iM49971q3, iMax, 8);
            i19 = i16;
            i20 = i17;
            c13687i3 = c13687iM49971q4;
            i33 = i33 == true ? 1 : 0;
            c13687i6 = c13687i6;
            z22 = false;
            z23 = z13;
        }
        if (!z20) {
            i21 = 8;
            c10 = 1;
            c11 = 2;
        } else {
            if (!z17) {
                if (!zM7695o && !zM7695o2 && !zM7695o3) {
                    i26 = 5;
                    z29 = z11;
                    i32 = i26;
                } else if (!zM7695o || zM7695o2) {
                    if (zM7695o || !zM7695o2) {
                        if (zM7695o && zM7695o2) {
                            C1512e c1512e4 = c1511d.f5818f.f5816d;
                            C1512e c1512e5 = c1511d2.f5818f.f5816d;
                            C1512e c1512eM7723K = m7723K();
                            int i40 = 6;
                            if (!z22) {
                                z24 = true;
                                if (c13687iM49971q5.f48034g && c13687i6.f48034g) {
                                    C13687i c13687i8 = c13687i6;
                                    c13682d.m49957c(c13687iM49971q3, c13687iM49971q5, c1511d.m7686f(), f10, c13687i8, c13687i3, c1511d2.m7686f(), 8);
                                    if (z11 && z23) {
                                        int iM7686f = c1511d2.f5818f != null ? c1511d2.m7686f() : 0;
                                        if (c13687i8 != c13687i2) {
                                            c13682d.m49962h(c13687i2, c13687i3, iM7686f, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                C13687i c13687i9 = c13687i6;
                                c13687iM49971q3 = c13687iM49971q3;
                                c13687i4 = c13687i9;
                                c13682d = c13682d;
                                c13687iM49971q5 = c13687iM49971q5;
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
                                } else if (c13687iM49971q5.f48034g && c13687i6.f48034g) {
                                    c13682d.m49959e(c13687iM49971q3, c13687iM49971q5, c1511d.m7686f(), 8);
                                    c13682d.m49959e(c13687i3, c13687i6, -c1511d2.m7686f(), 8);
                                    return;
                                } else {
                                    i30 = 8;
                                    i31 = 8;
                                    z26 = false;
                                    z27 = true;
                                    z25 = false;
                                }
                                if ((c1512e4 instanceof C1508a) || (c1512e5 instanceof C1508a)) {
                                    c13687i4 = c13687i6;
                                    z24 = true;
                                    i23 = 4;
                                } else {
                                    c13687i4 = c13687i6;
                                    i23 = i31;
                                    z24 = true;
                                }
                                i22 = i30;
                                c13687iM49971q5 = c13687iM49971q5;
                                i40 = 6;
                            } else {
                                if (i34 == 2) {
                                    if ((c1512e4 instanceof C1508a) || (c1512e5 instanceof C1508a)) {
                                        c13687i4 = c13687i6;
                                        z24 = true;
                                        i23 = 4;
                                    } else {
                                        c13687i4 = c13687i6;
                                        z24 = true;
                                        i23 = 5;
                                    }
                                    i22 = 5;
                                } else if (i34 == 1) {
                                    C13687i c13687i10 = c13687i6;
                                    c13687iM49971q3 = c13687iM49971q3;
                                    c13687i4 = c13687i10;
                                    c13687iM49971q5 = c13687iM49971q5;
                                    i40 = 6;
                                    z24 = true;
                                    i23 = 4;
                                    i22 = 8;
                                } else if (i34 != 3) {
                                    z24 = true;
                                    C13687i c13687i11 = c13687i6;
                                    c13687iM49971q3 = c13687iM49971q3;
                                    c13687i4 = c13687i11;
                                    c13682d = c13682d;
                                    c13687iM49971q5 = c13687iM49971q5;
                                    i40 = 6;
                                    i23 = 4;
                                    i22 = 5;
                                    z25 = false;
                                    z26 = false;
                                    z27 = false;
                                } else if (this.f5843F == -1) {
                                    if (z18) {
                                        C13687i c13687i12 = c13687i6;
                                        c13687iM49971q3 = c13687iM49971q3;
                                        c13687i4 = c13687i12;
                                        c13682d = c13682d;
                                        c13687iM49971q5 = c13687iM49971q5;
                                        z24 = true;
                                        i40 = z11 ? 5 : 4;
                                    } else {
                                        C13687i c13687i13 = c13687i6;
                                        c13687iM49971q3 = c13687iM49971q3;
                                        c13687i4 = c13687i13;
                                        c13682d = c13682d;
                                        c13687iM49971q5 = c13687iM49971q5;
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
                                            c13687i4 = c13687i6;
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
                                        c13687i4 = c13687i6;
                                        i22 = i28;
                                        i23 = i29;
                                        z25 = z24;
                                        z26 = z25;
                                        z27 = z26;
                                    } else {
                                        z24 = true;
                                        if (i20 > 0) {
                                            c13687i4 = c13687i6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 5;
                                        } else if (i20 != 0 || i19 != 0) {
                                            c13687i4 = c13687i6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 4;
                                        } else if (z18) {
                                            c13687i4 = c13687i6;
                                            i22 = (c1512e4 == c1512eM7723K || c1512e5 == c1512eM7723K) ? 5 : 4;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 4;
                                        } else {
                                            c13687i4 = c13687i6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 8;
                                        }
                                        i22 = 5;
                                    }
                                    c13682d = c13682d;
                                }
                                z25 = true;
                                z26 = true;
                                z27 = false;
                            }
                            if (z25 && c13687iM49971q5 == c13687i4 && c1512e4 != c1512eM7723K) {
                                z25 = false;
                                z28 = false;
                            } else {
                                z28 = z24;
                            }
                            if (z26) {
                                if (z22 || z16 || z18 || c13687iM49971q5 != c13687i || c13687i4 != c13687i2) {
                                    i27 = i40;
                                    z29 = z11;
                                } else {
                                    i27 = 8;
                                    z29 = false;
                                    i22 = 8;
                                    z28 = false;
                                }
                                C13687i c13687i14 = c13687iM49971q3;
                                c1512e = c1512eM7723K;
                                i24 = 8;
                                C13687i c13687i15 = c13687i3;
                                c13682d.m49957c(c13687i14, c13687iM49971q5, c1511d.m7686f(), f10, c13687i4, c13687i15, c1511d2.m7686f(), i27);
                                C13687i c13687i16 = c13687i4;
                                c13687i5 = c13687i14;
                                c13687i6 = c13687i16;
                                c13687i3 = c13687i15;
                            } else {
                                c13687i6 = c13687i4;
                                c13687i5 = c13687iM49971q3;
                                c1512e = c1512eM7723K;
                                z24 = z24;
                                i24 = 8;
                                z29 = z11;
                            }
                            if (this.f5906s0 == i24 && !c1511d2.m7693m()) {
                                return;
                            }
                            if (z25) {
                                int i41 = (!z29 || c13687iM49971q5 == c13687i6 || z22 || !((c1512e4 instanceof C1508a) || (c1512e5 instanceof C1508a))) ? i22 : 6;
                                c13682d.m49962h(c13687i5, c13687iM49971q5, c1511d.m7686f(), i41);
                                c13682d.m49964j(c13687i3, c13687i6, -c1511d2.m7686f(), i41);
                                i22 = i41;
                            }
                            if (!z29 || !z19 || (c1512e4 instanceof C1508a) || (c1512e5 instanceof C1508a) || c1512e5 == c1512e) {
                                iMin2 = i23;
                                i25 = i22;
                                z24 = z28;
                            } else {
                                iMin2 = 6;
                                i25 = 6;
                            }
                            if (z24) {
                                if (z27 && (!z18 || z12)) {
                                    if (c1512e4 != c1512e && c1512e5 != c1512e) {
                                        i40 = iMin2;
                                    }
                                    if ((c1512e4 instanceof C1515h) || (c1512e5 instanceof C1515h)) {
                                        i40 = 5;
                                    }
                                    if ((c1512e4 instanceof C1508a) || (c1512e5 instanceof C1508a)) {
                                        i40 = 5;
                                    }
                                    iMin2 = Math.max(z18 ? 5 : i40, iMin2);
                                }
                                if (z29) {
                                    iMin2 = Math.min(i25, iMin2);
                                    if (z15 && !z18 && (c1512e4 == c1512e || c1512e5 == c1512e)) {
                                        iMin2 = 4;
                                    }
                                }
                                c13682d.m49959e(c13687i5, c13687iM49971q5, c1511d.m7686f(), iMin2);
                                c13682d.m49959e(c13687i3, c13687i6, -c1511d2.m7686f(), iMin2);
                            }
                            if (z29) {
                                int iM7686f2 = c13687i == c13687iM49971q5 ? c1511d.m7686f() : 0;
                                if (c13687iM49971q5 != c13687i) {
                                    c13682d.m49962h(c13687i5, c13687i, iM7686f2, 5);
                                }
                            }
                            if (!z29 || !z22 || i12 != 0 || i19 != 0) {
                                i26 = 5;
                            } else if (z22 && i34 == 3) {
                                c13682d.m49962h(c13687i3, c13687i5, 0, i24);
                                i26 = 5;
                            } else {
                                i26 = 5;
                                c13682d.m49962h(c13687i3, c13687i5, 0, 5);
                            }
                        }
                        i32 = i26;
                    } else {
                        c13682d.m49959e(c13687i3, c13687i6, -c1511d2.m7686f(), 8);
                        if (z11) {
                            if (this.f5887j && c13687iM49971q3.f48034g && (c1512e2 = this.f5870a0) != null) {
                                C1513f c1513f = (C1513f) c1512e2;
                                if (z10) {
                                    c1513f.m7820A1(c1511d);
                                } else {
                                    c1513f.m7825F1(c1511d);
                                }
                            } else {
                                i26 = 5;
                                c13682d.m49962h(c13687iM49971q3, c13687i, 0, 5);
                            }
                        }
                        z29 = z11;
                        i32 = i26;
                    }
                    i26 = 5;
                    z29 = z11;
                    i32 = i26;
                } else {
                    i32 = (z11 && (c1511d.f5818f.f5816d instanceof C1508a)) ? 8 : 5;
                    z29 = z11;
                    c13687i6 = c13687i6;
                }
                if (z29 && z23) {
                    int iM7686f3 = c1511d2.f5818f != null ? c1511d2.m7686f() : 0;
                    if (c13687i6 != c13687i2) {
                        if (!this.f5887j || !c13687i3.f48034g || (c1512e3 = this.f5870a0) == null) {
                            c13682d.m49962h(c13687i2, c13687i3, iM7686f3, i32);
                            return;
                        }
                        C1513f c1513f2 = (C1513f) c1512e3;
                        if (z10) {
                            c1513f2.m7852z1(c1511d2);
                            return;
                        } else {
                            c1513f2.m7824E1(c1511d2);
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
            c13682d.m49962h(c13687iM49971q3, c13687i, 0, i21);
            char c12 = (z10 || this.f5861S.f5818f == null) ? c10 : (char) 0;
            if (!z10 && (c1511d3 = this.f5861S.f5818f) != null) {
                C1512e c1512e6 = c1511d3.f5816d;
                if (c1512e6.f5876d0 != 0.0f) {
                    b[] bVarArr = c1512e6.f5868Z;
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
                c13682d.m49962h(c13687i2, c13687i3, 0, i21);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m7775i0() {
        C1511d c1511d = this.f5857O;
        C1511d c1511d2 = c1511d.f5818f;
        if (c1511d2 != null && c1511d2.f5818f == c1511d) {
            return true;
        }
        C1511d c1511d3 = this.f5859Q;
        C1511d c1511d4 = c1511d3.f5818f;
        return c1511d4 != null && c1511d4.f5818f == c1511d3;
    }

    /* JADX INFO: renamed from: i1 */
    public void m7776i1(int i10, int i11, int i12, float f10) {
        this.f5915x = i10;
        this.f5837C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f5839D = i12;
        this.f5841E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f5915x = 2;
    }

    /* JADX INFO: renamed from: j */
    public void m7777j(C1511d.a aVar, C1512e c1512e, C1511d.a aVar2, int i10) {
        C1511d.a aVar3;
        C1511d.a aVar4;
        boolean z10;
        C1511d.a aVar5 = C1511d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                C1511d.a aVar6 = C1511d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == C1511d.a.RIGHT) {
                    m7777j(aVar6, c1512e, aVar2, 0);
                    m7777j(C1511d.a.RIGHT, c1512e, aVar2, 0);
                    mo7791o(aVar5).m7681a(c1512e.mo7791o(aVar2), 0);
                    return;
                }
                C1511d.a aVar7 = C1511d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == C1511d.a.BOTTOM) {
                    m7777j(aVar7, c1512e, aVar2, 0);
                    m7777j(C1511d.a.BOTTOM, c1512e, aVar2, 0);
                    mo7791o(aVar5).m7681a(c1512e.mo7791o(aVar2), 0);
                    return;
                }
                return;
            }
            C1511d.a aVar8 = C1511d.a.LEFT;
            C1511d c1511dMo7791o = mo7791o(aVar8);
            C1511d.a aVar9 = C1511d.a.RIGHT;
            C1511d c1511dMo7791o2 = mo7791o(aVar9);
            C1511d.a aVar10 = C1511d.a.TOP;
            C1511d c1511dMo7791o3 = mo7791o(aVar10);
            C1511d.a aVar11 = C1511d.a.BOTTOM;
            C1511d c1511dMo7791o4 = mo7791o(aVar11);
            boolean z11 = true;
            if ((c1511dMo7791o == null || !c1511dMo7791o.m7695o()) && (c1511dMo7791o2 == null || !c1511dMo7791o2.m7695o())) {
                m7777j(aVar8, c1512e, aVar8, 0);
                m7777j(aVar9, c1512e, aVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((c1511dMo7791o3 == null || !c1511dMo7791o3.m7695o()) && (c1511dMo7791o4 == null || !c1511dMo7791o4.m7695o())) {
                m7777j(aVar10, c1512e, aVar10, 0);
                m7777j(aVar11, c1512e, aVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                mo7791o(aVar5).m7681a(c1512e.mo7791o(aVar5), 0);
                return;
            }
            if (z10) {
                C1511d.a aVar12 = C1511d.a.CENTER_X;
                mo7791o(aVar12).m7681a(c1512e.mo7791o(aVar12), 0);
                return;
            } else {
                if (z11) {
                    C1511d.a aVar13 = C1511d.a.CENTER_Y;
                    mo7791o(aVar13).m7681a(c1512e.mo7791o(aVar13), 0);
                    return;
                }
                return;
            }
        }
        C1511d.a aVar14 = C1511d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = C1511d.a.LEFT) || aVar2 == C1511d.a.RIGHT)) {
            C1511d c1511dMo7791o5 = mo7791o(aVar4);
            C1511d c1511dMo7791o6 = c1512e.mo7791o(aVar2);
            C1511d c1511dMo7791o7 = mo7791o(C1511d.a.RIGHT);
            c1511dMo7791o5.m7681a(c1511dMo7791o6, 0);
            c1511dMo7791o7.m7681a(c1511dMo7791o6, 0);
            mo7791o(aVar14).m7681a(c1511dMo7791o6, 0);
            return;
        }
        C1511d.a aVar15 = C1511d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = C1511d.a.TOP) || aVar2 == C1511d.a.BOTTOM)) {
            C1511d c1511dMo7791o8 = c1512e.mo7791o(aVar2);
            mo7791o(aVar3).m7681a(c1511dMo7791o8, 0);
            mo7791o(C1511d.a.BOTTOM).m7681a(c1511dMo7791o8, 0);
            mo7791o(aVar15).m7681a(c1511dMo7791o8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            C1511d.a aVar16 = C1511d.a.LEFT;
            mo7791o(aVar16).m7681a(c1512e.mo7791o(aVar16), 0);
            C1511d.a aVar17 = C1511d.a.RIGHT;
            mo7791o(aVar17).m7681a(c1512e.mo7791o(aVar17), 0);
            mo7791o(aVar14).m7681a(c1512e.mo7791o(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            C1511d.a aVar18 = C1511d.a.TOP;
            mo7791o(aVar18).m7681a(c1512e.mo7791o(aVar18), 0);
            C1511d.a aVar19 = C1511d.a.BOTTOM;
            mo7791o(aVar19).m7681a(c1512e.mo7791o(aVar19), 0);
            mo7791o(aVar15).m7681a(c1512e.mo7791o(aVar2), 0);
            return;
        }
        C1511d c1511dMo7791o9 = mo7791o(aVar);
        C1511d c1511dMo7791o10 = c1512e.mo7791o(aVar2);
        if (c1511dMo7791o9.m7696p(c1511dMo7791o10)) {
            C1511d.a aVar20 = C1511d.a.BASELINE;
            if (aVar == aVar20) {
                C1511d c1511dMo7791o11 = mo7791o(C1511d.a.TOP);
                C1511d c1511dMo7791o12 = mo7791o(C1511d.a.BOTTOM);
                if (c1511dMo7791o11 != null) {
                    c1511dMo7791o11.m7697q();
                }
                if (c1511dMo7791o12 != null) {
                    c1511dMo7791o12.m7697q();
                }
            } else if (aVar == C1511d.a.TOP || aVar == C1511d.a.BOTTOM) {
                C1511d c1511dMo7791o13 = mo7791o(aVar20);
                if (c1511dMo7791o13 != null) {
                    c1511dMo7791o13.m7697q();
                }
                C1511d c1511dMo7791o14 = mo7791o(aVar5);
                if (c1511dMo7791o14.m7690j() != c1511dMo7791o10) {
                    c1511dMo7791o14.m7697q();
                }
                C1511d c1511dM7687g = mo7791o(aVar).m7687g();
                C1511d c1511dMo7791o15 = mo7791o(aVar15);
                if (c1511dMo7791o15.m7695o()) {
                    c1511dM7687g.m7697q();
                    c1511dMo7791o15.m7697q();
                }
            } else if (aVar == C1511d.a.LEFT || aVar == C1511d.a.RIGHT) {
                C1511d c1511dMo7791o16 = mo7791o(aVar5);
                if (c1511dMo7791o16.m7690j() != c1511dMo7791o10) {
                    c1511dMo7791o16.m7697q();
                }
                C1511d c1511dM7687g2 = mo7791o(aVar).m7687g();
                C1511d c1511dMo7791o17 = mo7791o(aVar14);
                if (c1511dMo7791o17.m7695o()) {
                    c1511dM7687g2.m7697q();
                    c1511dMo7791o17.m7697q();
                }
            }
            c1511dMo7791o9.m7681a(c1511dMo7791o10, i10);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m7778j0() {
        return this.f5853K;
    }

    /* JADX INFO: renamed from: j1 */
    public void m7779j1(float f10) {
        this.f5840D0[1] = f10;
    }

    /* JADX INFO: renamed from: k */
    public void m7780k(C1511d c1511d, C1511d c1511d2, int i10) {
        if (c1511d.m7688h() == this) {
            m7777j(c1511d.m7691k(), c1511d2.m7688h(), c1511d2.m7691k(), i10);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m7781k0() {
        C1511d c1511d = this.f5858P;
        C1511d c1511d2 = c1511d.f5818f;
        if (c1511d2 != null && c1511d2.f5818f == c1511d) {
            return true;
        }
        C1511d c1511d3 = this.f5860R;
        C1511d c1511d4 = c1511d3.f5818f;
        return c1511d4 != null && c1511d4.f5818f == c1511d3;
    }

    /* JADX INFO: renamed from: k1 */
    public void m7782k1(int i10) {
        this.f5906s0 = i10;
    }

    /* JADX INFO: renamed from: l */
    public void m7783l(C1512e c1512e, float f10, int i10) {
        C1511d.a aVar = C1511d.a.CENTER;
        m7765e0(aVar, c1512e, aVar, i10, 0);
        this.f5849I = f10;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m7784l0() {
        return this.f5854L;
    }

    /* JADX INFO: renamed from: l1 */
    public void m7785l1(int i10) {
        this.f5872b0 = i10;
        int i11 = this.f5894m0;
        if (i10 < i11) {
            this.f5872b0 = i11;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m7786m(C13682d c13682d) {
        c13682d.m49971q(this.f5857O);
        c13682d.m49971q(this.f5858P);
        c13682d.m49971q(this.f5859Q);
        c13682d.m49971q(this.f5860R);
        if (this.f5892l0 > 0) {
            c13682d.m49971q(this.f5861S);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m7787m0() {
        return this.f5885i && this.f5906s0 != 8;
    }

    /* JADX INFO: renamed from: m1 */
    public void m7788m1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f5911v = i10;
    }

    /* JADX INFO: renamed from: n */
    public void m7789n() {
        if (this.f5877e == null) {
            this.f5877e = new C4418l(this);
        }
        if (this.f5879f == null) {
            this.f5879f = new C4420n(this);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public boolean mo7668n0() {
        if (this.f5899p) {
            return true;
        }
        return this.f5857O.m7694n() && this.f5859Q.m7694n();
    }

    /* JADX INFO: renamed from: n1 */
    public void m7790n1(int i10) {
        this.f5880f0 = i10;
    }

    /* JADX INFO: renamed from: o */
    public C1511d mo7791o(C1511d.a aVar) {
        switch (a.f5921a[aVar.ordinal()]) {
            case 1:
                return this.f5857O;
            case 2:
                return this.f5858P;
            case 3:
                return this.f5859Q;
            case 4:
                return this.f5860R;
            case 5:
                return this.f5861S;
            case 6:
                return this.f5864V;
            case 7:
                return this.f5862T;
            case 8:
                return this.f5863U;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public boolean mo7669o0() {
        if (this.f5901q) {
            return true;
        }
        return this.f5858P.m7694n() && this.f5860R.m7694n();
    }

    /* JADX INFO: renamed from: o1 */
    public void m7792o1(int i10) {
        this.f5882g0 = i10;
    }

    /* JADX INFO: renamed from: p */
    public int m7793p() {
        return this.f5892l0;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m7794p0() {
        return this.f5905s;
    }

    /* JADX INFO: renamed from: p1 */
    public void m7795p1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f5843F == -1) {
            if (z12 && !z13) {
                this.f5843F = 0;
            } else if (!z12 && z13) {
                this.f5843F = 1;
                if (this.f5878e0 == -1) {
                    this.f5845G = 1.0f / this.f5845G;
                }
            }
        }
        if (this.f5843F == 0 && (!this.f5858P.m7695o() || !this.f5860R.m7695o())) {
            this.f5843F = 1;
        } else if (this.f5843F == 1 && (!this.f5857O.m7695o() || !this.f5859Q.m7695o())) {
            this.f5843F = 0;
        }
        if (this.f5843F == -1 && (!this.f5858P.m7695o() || !this.f5860R.m7695o() || !this.f5857O.m7695o() || !this.f5859Q.m7695o())) {
            if (this.f5858P.m7695o() && this.f5860R.m7695o()) {
                this.f5843F = 0;
            } else if (this.f5857O.m7695o() && this.f5859Q.m7695o()) {
                this.f5845G = 1.0f / this.f5845G;
                this.f5843F = 1;
            }
        }
        if (this.f5843F == -1) {
            int i10 = this.f5919z;
            if (i10 > 0 && this.f5837C == 0) {
                this.f5843F = 0;
            } else {
                if (i10 != 0 || this.f5837C <= 0) {
                    return;
                }
                this.f5845G = 1.0f / this.f5845G;
                this.f5843F = 1;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public float m7796q(int i10) {
        if (i10 == 0) {
            return this.f5898o0;
        }
        if (i10 == 1) {
            return this.f5900p0;
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: q0 */
    public void m7797q0() {
        this.f5903r = true;
    }

    /* JADX INFO: renamed from: q1 */
    public void mo7798q1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zM22217k = z10 & this.f5877e.m22217k();
        boolean zM22217k2 = z11 & this.f5879f.m22217k();
        C4418l c4418l = this.f5877e;
        int i12 = c4418l.f18385h.f18332g;
        C4420n c4420n = this.f5879f;
        int i13 = c4420n.f18385h.f18332g;
        int i14 = c4418l.f18386i.f18332g;
        int i15 = c4420n.f18386i.f18332g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zM22217k) {
            this.f5880f0 = i12;
        }
        if (zM22217k2) {
            this.f5882g0 = i13;
        }
        if (this.f5906s0 == 8) {
            this.f5872b0 = 0;
            this.f5874c0 = 0;
            return;
        }
        if (zM22217k) {
            if (this.f5868Z[0] == b.FIXED && i17 < (i11 = this.f5872b0)) {
                i17 = i11;
            }
            this.f5872b0 = i17;
            int i19 = this.f5894m0;
            if (i17 < i19) {
                this.f5872b0 = i19;
            }
        }
        if (zM22217k2) {
            if (this.f5868Z[1] == b.FIXED && i18 < (i10 = this.f5874c0)) {
                i18 = i10;
            }
            this.f5874c0 = i18;
            int i20 = this.f5896n0;
            if (i18 < i20) {
                this.f5874c0 = i20;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public int m7799r() {
        return m7751Y() + this.f5874c0;
    }

    /* JADX INFO: renamed from: r0 */
    public void m7800r0() {
        this.f5905s = true;
    }

    /* JADX INFO: renamed from: r1 */
    public void mo7801r1(C13682d c13682d, boolean z10) {
        C4420n c4420n;
        C4418l c4418l;
        int iM49977y = c13682d.m49977y(this.f5857O);
        int iM49977y2 = c13682d.m49977y(this.f5858P);
        int iM49977y3 = c13682d.m49977y(this.f5859Q);
        int iM49977y4 = c13682d.m49977y(this.f5860R);
        if (z10 && (c4418l = this.f5877e) != null) {
            C4412f c4412f = c4418l.f18385h;
            if (c4412f.f18335j) {
                C4412f c4412f2 = c4418l.f18386i;
                if (c4412f2.f18335j) {
                    iM49977y = c4412f.f18332g;
                    iM49977y3 = c4412f2.f18332g;
                }
            }
        }
        if (z10 && (c4420n = this.f5879f) != null) {
            C4412f c4412f3 = c4420n.f18385h;
            if (c4412f3.f18335j) {
                C4412f c4412f4 = c4420n.f18386i;
                if (c4412f4.f18335j) {
                    iM49977y2 = c4412f3.f18332g;
                    iM49977y4 = c4412f4.f18332g;
                }
            }
        }
        int i10 = iM49977y4 - iM49977y2;
        if (iM49977y3 - iM49977y < 0 || i10 < 0 || iM49977y == Integer.MIN_VALUE || iM49977y == Integer.MAX_VALUE || iM49977y2 == Integer.MIN_VALUE || iM49977y2 == Integer.MAX_VALUE || iM49977y3 == Integer.MIN_VALUE || iM49977y3 == Integer.MAX_VALUE || iM49977y4 == Integer.MIN_VALUE || iM49977y4 == Integer.MAX_VALUE) {
            iM49977y = 0;
            iM49977y4 = 0;
            iM49977y2 = 0;
            iM49977y3 = 0;
        }
        m7724K0(iM49977y, iM49977y2, iM49977y3, iM49977y4);
    }

    /* JADX INFO: renamed from: s */
    public Object m7802s() {
        return this.f5902q0;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m7803s0() {
        b[] bVarArr = this.f5868Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    /* JADX INFO: renamed from: t */
    public String m7804t() {
        return this.f5910u0;
    }

    /* JADX INFO: renamed from: t0 */
    public void mo7805t0() {
        this.f5857O.m7697q();
        this.f5858P.m7697q();
        this.f5859Q.m7697q();
        this.f5860R.m7697q();
        this.f5861S.m7697q();
        this.f5862T.m7697q();
        this.f5863U.m7697q();
        this.f5864V.m7697q();
        this.f5870a0 = null;
        this.f5849I = Float.NaN;
        this.f5872b0 = 0;
        this.f5874c0 = 0;
        this.f5876d0 = 0.0f;
        this.f5878e0 = -1;
        this.f5880f0 = 0;
        this.f5882g0 = 0;
        this.f5888j0 = 0;
        this.f5890k0 = 0;
        this.f5892l0 = 0;
        this.f5894m0 = 0;
        this.f5896n0 = 0;
        float f10 = f5832K0;
        this.f5898o0 = f10;
        this.f5900p0 = f10;
        b[] bVarArr = this.f5868Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f5902q0 = null;
        this.f5904r0 = 0;
        this.f5906s0 = 0;
        this.f5912v0 = null;
        this.f5914w0 = false;
        this.f5916x0 = false;
        this.f5920z0 = 0;
        this.f5834A0 = 0;
        this.f5836B0 = false;
        this.f5838C0 = false;
        float[] fArr = this.f5840D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f5907t = -1;
        this.f5909u = -1;
        int[] iArr = this.f5847H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f5913w = 0;
        this.f5915x = 0;
        this.f5835B = 1.0f;
        this.f5841E = 1.0f;
        this.f5833A = Integer.MAX_VALUE;
        this.f5839D = Integer.MAX_VALUE;
        this.f5919z = 0;
        this.f5837C = 0;
        this.f5883h = false;
        this.f5843F = -1;
        this.f5845G = 1.0f;
        this.f5918y0 = false;
        boolean[] zArr = this.f5881g;
        zArr[0] = true;
        zArr[1] = true;
        this.f5854L = false;
        boolean[] zArr2 = this.f5867Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f5885i = true;
        int[] iArr2 = this.f5917y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f5891l = -1;
        this.f5893m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f5912v0 != null) {
            str = "type: " + this.f5912v0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f5910u0 != null) {
            str2 = "id: " + this.f5910u0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f5880f0);
        sb2.append(", ");
        sb2.append(this.f5882g0);
        sb2.append(") - (");
        sb2.append(this.f5872b0);
        sb2.append(" x ");
        sb2.append(this.f5874c0);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public b m7806u(int i10) {
        if (i10 == 0) {
            return m7703A();
        }
        if (i10 == 1) {
            return m7741T();
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public void m7807u0() {
        C1512e c1512eM7723K = m7723K();
        if (c1512eM7723K != null && (c1512eM7723K instanceof C1513f) && ((C1513f) m7723K()).m7833N1()) {
            return;
        }
        int size = this.f5866X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5866X.get(i10).m7697q();
        }
    }

    /* JADX INFO: renamed from: v */
    public float m7808v() {
        return this.f5876d0;
    }

    /* JADX INFO: renamed from: v0 */
    public void m7809v0() {
        this.f5899p = false;
        this.f5901q = false;
        this.f5903r = false;
        this.f5905s = false;
        int size = this.f5866X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5866X.get(i10).m7698r();
        }
    }

    /* JADX INFO: renamed from: w */
    public int m7810w() {
        return this.f5878e0;
    }

    /* JADX INFO: renamed from: w0 */
    public void mo7811w0(C13681c c13681c) {
        this.f5857O.m7699s(c13681c);
        this.f5858P.m7699s(c13681c);
        this.f5859Q.m7699s(c13681c);
        this.f5860R.m7699s(c13681c);
        this.f5861S.m7699s(c13681c);
        this.f5864V.m7699s(c13681c);
        this.f5862T.m7699s(c13681c);
        this.f5863U.m7699s(c13681c);
    }

    /* JADX INFO: renamed from: x */
    public int m7812x() {
        if (this.f5906s0 == 8) {
            return 0;
        }
        return this.f5874c0;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m7813x0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    /* JADX INFO: renamed from: y */
    public float m7814y() {
        return this.f5898o0;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m7815y0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    /* JADX INFO: renamed from: z */
    public int m7816z() {
        return this.f5920z0;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m7817z0(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }
}
