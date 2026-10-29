package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p003a2.C0057b;
import p116f2.C5315a;
import p116f2.C5324j;
import p142g2.C5968c;
import p142g2.C5969d;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.c */
/* JADX INFO: loaded from: classes.dex */
public class C0518c {

    /* JADX INFO: renamed from: g */
    public static final int[] f2067g = {0, 4, 8};

    /* JADX INFO: renamed from: h */
    public static SparseIntArray f2068h = new SparseIntArray();

    /* JADX INFO: renamed from: i */
    public static SparseIntArray f2069i = new SparseIntArray();

    /* JADX INFO: renamed from: a */
    public String f2070a = "";

    /* JADX INFO: renamed from: b */
    public String[] f2071b = new String[0];

    /* JADX INFO: renamed from: c */
    public int f2072c = 0;

    /* JADX INFO: renamed from: d */
    public HashMap<String, C0516a> f2073d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public boolean f2074e = true;

    /* JADX INFO: renamed from: f */
    public HashMap<Integer, a> f2075f = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f2076a;

        /* JADX INFO: renamed from: b */
        public String f2077b;

        /* JADX INFO: renamed from: c */
        public final d f2078c = new d();

        /* JADX INFO: renamed from: d */
        public final c f2079d = new c();

        /* JADX INFO: renamed from: e */
        public final b f2080e = new b();

        /* JADX INFO: renamed from: f */
        public final e f2081f = new e();

        /* JADX INFO: renamed from: g */
        public HashMap<String, C0516a> f2082g = new HashMap<>();

        /* JADX INFO: renamed from: h */
        public C14070a f2083h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        public static class C14070a {

            /* JADX INFO: renamed from: a */
            public int[] f2084a = new int[10];

            /* JADX INFO: renamed from: b */
            public int[] f2085b = new int[10];

            /* JADX INFO: renamed from: c */
            public int f2086c = 0;

            /* JADX INFO: renamed from: d */
            public int[] f2087d = new int[10];

            /* JADX INFO: renamed from: e */
            public float[] f2088e = new float[10];

            /* JADX INFO: renamed from: f */
            public int f2089f = 0;

            /* JADX INFO: renamed from: g */
            public int[] f2090g = new int[5];

            /* JADX INFO: renamed from: h */
            public String[] f2091h = new String[5];

            /* JADX INFO: renamed from: i */
            public int f2092i = 0;

            /* JADX INFO: renamed from: j */
            public int[] f2093j = new int[4];

            /* JADX INFO: renamed from: k */
            public boolean[] f2094k = new boolean[4];

            /* JADX INFO: renamed from: l */
            public int f2095l = 0;

            /* JADX INFO: renamed from: a */
            public void m2534a(int i10, float f10) {
                int i11 = this.f2089f;
                int[] iArr = this.f2087d;
                if (i11 >= iArr.length) {
                    this.f2087d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2088e;
                    this.f2088e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2087d;
                int i12 = this.f2089f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f2088e;
                this.f2089f = i12 + 1;
                fArr2[i12] = f10;
            }

            /* JADX INFO: renamed from: b */
            public void m2535b(int i10, int i11) {
                int i12 = this.f2086c;
                int[] iArr = this.f2084a;
                if (i12 >= iArr.length) {
                    this.f2084a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2085b;
                    this.f2085b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2084a;
                int i13 = this.f2086c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f2085b;
                this.f2086c = i13 + 1;
                iArr4[i13] = i11;
            }

            /* JADX INFO: renamed from: c */
            public void m2536c(int i10, String str) {
                int i11 = this.f2092i;
                int[] iArr = this.f2090g;
                if (i11 >= iArr.length) {
                    this.f2090g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2091h;
                    this.f2091h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2090g;
                int i12 = this.f2092i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f2091h;
                this.f2092i = i12 + 1;
                strArr2[i12] = str;
            }

            /* JADX INFO: renamed from: d */
            public void m2537d(int i10, boolean z10) {
                int i11 = this.f2095l;
                int[] iArr = this.f2093j;
                if (i11 >= iArr.length) {
                    this.f2093j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2094k;
                    this.f2094k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2093j;
                int i12 = this.f2095l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f2094k;
                this.f2095l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m2529d(ConstraintLayout.C0513b c0513b) {
            b bVar = this.f2080e;
            c0513b.f1990e = bVar.f2141j;
            c0513b.f1992f = bVar.f2143k;
            c0513b.f1994g = bVar.f2145l;
            c0513b.f1996h = bVar.f2147m;
            c0513b.f1998i = bVar.f2149n;
            c0513b.f2000j = bVar.f2151o;
            c0513b.f2002k = bVar.f2153p;
            c0513b.f2004l = bVar.f2155q;
            c0513b.f2006m = bVar.f2157r;
            c0513b.f2008n = bVar.f2158s;
            c0513b.f2010o = bVar.f2159t;
            c0513b.f2018s = bVar.f2160u;
            c0513b.f2020t = bVar.f2161v;
            c0513b.f2022u = bVar.f2162w;
            c0513b.f2024v = bVar.f2163x;
            ((ViewGroup.MarginLayoutParams) c0513b).leftMargin = bVar.f2104H;
            ((ViewGroup.MarginLayoutParams) c0513b).rightMargin = bVar.f2105I;
            ((ViewGroup.MarginLayoutParams) c0513b).topMargin = bVar.f2106J;
            ((ViewGroup.MarginLayoutParams) c0513b).bottomMargin = bVar.f2107K;
            c0513b.f1956A = bVar.f2116T;
            c0513b.f1957B = bVar.f2115S;
            c0513b.f2028x = bVar.f2112P;
            c0513b.f2030z = bVar.f2114R;
            c0513b.f1962G = bVar.f2164y;
            c0513b.f1963H = bVar.f2165z;
            c0513b.f2012p = bVar.f2098B;
            c0513b.f2014q = bVar.f2099C;
            c0513b.f2016r = bVar.f2100D;
            c0513b.f1964I = bVar.f2097A;
            c0513b.f1979X = bVar.f2101E;
            c0513b.f1980Y = bVar.f2102F;
            c0513b.f1968M = bVar.f2118V;
            c0513b.f1967L = bVar.f2119W;
            c0513b.f1970O = bVar.f2121Y;
            c0513b.f1969N = bVar.f2120X;
            c0513b.f1983a0 = bVar.f2150n0;
            c0513b.f1985b0 = bVar.f2152o0;
            c0513b.f1971P = bVar.f2122Z;
            c0513b.f1972Q = bVar.f2124a0;
            c0513b.f1975T = bVar.f2126b0;
            c0513b.f1976U = bVar.f2128c0;
            c0513b.f1973R = bVar.f2130d0;
            c0513b.f1974S = bVar.f2132e0;
            c0513b.f1977V = bVar.f2134f0;
            c0513b.f1978W = bVar.f2136g0;
            c0513b.f1981Z = bVar.f2103G;
            c0513b.f1986c = bVar.f2137h;
            c0513b.f1982a = bVar.f2133f;
            c0513b.f1984b = bVar.f2135g;
            ((ViewGroup.MarginLayoutParams) c0513b).width = bVar.f2129d;
            ((ViewGroup.MarginLayoutParams) c0513b).height = bVar.f2131e;
            String str = bVar.f2148m0;
            if (str != null) {
                c0513b.f1987c0 = str;
            }
            c0513b.f1989d0 = bVar.f2156q0;
            c0513b.setMarginStart(bVar.f2109M);
            c0513b.setMarginEnd(this.f2080e.f2108L);
            c0513b.m2465a();
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f2080e.m2538a(this.f2080e);
            aVar.f2079d.m2540a(this.f2079d);
            aVar.f2078c.m2542a(this.f2078c);
            aVar.f2081f.m2544a(this.f2081f);
            aVar.f2076a = this.f2076a;
            aVar.f2083h = this.f2083h;
            return aVar;
        }

        /* JADX INFO: renamed from: f */
        public final void m2531f(int i10, ConstraintLayout.C0513b c0513b) {
            this.f2076a = i10;
            b bVar = this.f2080e;
            bVar.f2141j = c0513b.f1990e;
            bVar.f2143k = c0513b.f1992f;
            bVar.f2145l = c0513b.f1994g;
            bVar.f2147m = c0513b.f1996h;
            bVar.f2149n = c0513b.f1998i;
            bVar.f2151o = c0513b.f2000j;
            bVar.f2153p = c0513b.f2002k;
            bVar.f2155q = c0513b.f2004l;
            bVar.f2157r = c0513b.f2006m;
            bVar.f2158s = c0513b.f2008n;
            bVar.f2159t = c0513b.f2010o;
            bVar.f2160u = c0513b.f2018s;
            bVar.f2161v = c0513b.f2020t;
            bVar.f2162w = c0513b.f2022u;
            bVar.f2163x = c0513b.f2024v;
            bVar.f2164y = c0513b.f1962G;
            bVar.f2165z = c0513b.f1963H;
            bVar.f2097A = c0513b.f1964I;
            bVar.f2098B = c0513b.f2012p;
            bVar.f2099C = c0513b.f2014q;
            bVar.f2100D = c0513b.f2016r;
            bVar.f2101E = c0513b.f1979X;
            bVar.f2102F = c0513b.f1980Y;
            bVar.f2103G = c0513b.f1981Z;
            bVar.f2137h = c0513b.f1986c;
            bVar.f2133f = c0513b.f1982a;
            bVar.f2135g = c0513b.f1984b;
            bVar.f2129d = ((ViewGroup.MarginLayoutParams) c0513b).width;
            bVar.f2131e = ((ViewGroup.MarginLayoutParams) c0513b).height;
            bVar.f2104H = ((ViewGroup.MarginLayoutParams) c0513b).leftMargin;
            bVar.f2105I = ((ViewGroup.MarginLayoutParams) c0513b).rightMargin;
            bVar.f2106J = ((ViewGroup.MarginLayoutParams) c0513b).topMargin;
            bVar.f2107K = ((ViewGroup.MarginLayoutParams) c0513b).bottomMargin;
            bVar.f2110N = c0513b.f1959D;
            bVar.f2118V = c0513b.f1968M;
            bVar.f2119W = c0513b.f1967L;
            bVar.f2121Y = c0513b.f1970O;
            bVar.f2120X = c0513b.f1969N;
            bVar.f2150n0 = c0513b.f1983a0;
            bVar.f2152o0 = c0513b.f1985b0;
            bVar.f2122Z = c0513b.f1971P;
            bVar.f2124a0 = c0513b.f1972Q;
            bVar.f2126b0 = c0513b.f1975T;
            bVar.f2128c0 = c0513b.f1976U;
            bVar.f2130d0 = c0513b.f1973R;
            bVar.f2132e0 = c0513b.f1974S;
            bVar.f2134f0 = c0513b.f1977V;
            bVar.f2136g0 = c0513b.f1978W;
            bVar.f2148m0 = c0513b.f1987c0;
            bVar.f2112P = c0513b.f2028x;
            bVar.f2114R = c0513b.f2030z;
            bVar.f2111O = c0513b.f2026w;
            bVar.f2113Q = c0513b.f2029y;
            bVar.f2116T = c0513b.f1956A;
            bVar.f2115S = c0513b.f1957B;
            bVar.f2117U = c0513b.f1958C;
            bVar.f2156q0 = c0513b.f1989d0;
            bVar.f2108L = c0513b.getMarginEnd();
            this.f2080e.f2109M = c0513b.getMarginStart();
        }

        /* JADX INFO: renamed from: g */
        public final void m2532g(int i10, C0519d.a aVar) {
            m2531f(i10, aVar);
            this.f2078c.f2184d = aVar.f2212x0;
            e eVar = this.f2081f;
            eVar.f2188b = aVar.f2202A0;
            eVar.f2189c = aVar.f2203B0;
            eVar.f2190d = aVar.f2204C0;
            eVar.f2191e = aVar.f2205D0;
            eVar.f2192f = aVar.f2206E0;
            eVar.f2193g = aVar.f2207F0;
            eVar.f2194h = aVar.f2208G0;
            eVar.f2196j = aVar.f2209H0;
            eVar.f2197k = aVar.f2210I0;
            eVar.f2198l = aVar.f2211J0;
            eVar.f2200n = aVar.f2214z0;
            eVar.f2199m = aVar.f2213y0;
        }

        /* JADX INFO: renamed from: h */
        public final void m2533h(AbstractC0517b abstractC0517b, int i10, C0519d.a aVar) {
            m2532g(i10, aVar);
            if (abstractC0517b instanceof Barrier) {
                b bVar = this.f2080e;
                bVar.f2142j0 = 1;
                Barrier barrier = (Barrier) abstractC0517b;
                bVar.f2138h0 = barrier.getType();
                this.f2080e.f2144k0 = barrier.getReferencedIds();
                this.f2080e.f2140i0 = barrier.getMargin();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$b */
    public static class b {

        /* JADX INFO: renamed from: r0 */
        public static SparseIntArray f2096r0;

        /* JADX INFO: renamed from: d */
        public int f2129d;

        /* JADX INFO: renamed from: e */
        public int f2131e;

        /* JADX INFO: renamed from: k0 */
        public int[] f2144k0;

        /* JADX INFO: renamed from: l0 */
        public String f2146l0;

        /* JADX INFO: renamed from: m0 */
        public String f2148m0;

        /* JADX INFO: renamed from: a */
        public boolean f2123a = false;

        /* JADX INFO: renamed from: b */
        public boolean f2125b = false;

        /* JADX INFO: renamed from: c */
        public boolean f2127c = false;

        /* JADX INFO: renamed from: f */
        public int f2133f = -1;

        /* JADX INFO: renamed from: g */
        public int f2135g = -1;

        /* JADX INFO: renamed from: h */
        public float f2137h = -1.0f;

        /* JADX INFO: renamed from: i */
        public boolean f2139i = true;

        /* JADX INFO: renamed from: j */
        public int f2141j = -1;

        /* JADX INFO: renamed from: k */
        public int f2143k = -1;

        /* JADX INFO: renamed from: l */
        public int f2145l = -1;

        /* JADX INFO: renamed from: m */
        public int f2147m = -1;

        /* JADX INFO: renamed from: n */
        public int f2149n = -1;

        /* JADX INFO: renamed from: o */
        public int f2151o = -1;

        /* JADX INFO: renamed from: p */
        public int f2153p = -1;

        /* JADX INFO: renamed from: q */
        public int f2155q = -1;

        /* JADX INFO: renamed from: r */
        public int f2157r = -1;

        /* JADX INFO: renamed from: s */
        public int f2158s = -1;

        /* JADX INFO: renamed from: t */
        public int f2159t = -1;

        /* JADX INFO: renamed from: u */
        public int f2160u = -1;

        /* JADX INFO: renamed from: v */
        public int f2161v = -1;

        /* JADX INFO: renamed from: w */
        public int f2162w = -1;

        /* JADX INFO: renamed from: x */
        public int f2163x = -1;

        /* JADX INFO: renamed from: y */
        public float f2164y = 0.5f;

        /* JADX INFO: renamed from: z */
        public float f2165z = 0.5f;

        /* JADX INFO: renamed from: A */
        public String f2097A = null;

        /* JADX INFO: renamed from: B */
        public int f2098B = -1;

        /* JADX INFO: renamed from: C */
        public int f2099C = 0;

        /* JADX INFO: renamed from: D */
        public float f2100D = 0.0f;

        /* JADX INFO: renamed from: E */
        public int f2101E = -1;

        /* JADX INFO: renamed from: F */
        public int f2102F = -1;

        /* JADX INFO: renamed from: G */
        public int f2103G = -1;

        /* JADX INFO: renamed from: H */
        public int f2104H = 0;

        /* JADX INFO: renamed from: I */
        public int f2105I = 0;

        /* JADX INFO: renamed from: J */
        public int f2106J = 0;

        /* JADX INFO: renamed from: K */
        public int f2107K = 0;

        /* JADX INFO: renamed from: L */
        public int f2108L = 0;

        /* JADX INFO: renamed from: M */
        public int f2109M = 0;

        /* JADX INFO: renamed from: N */
        public int f2110N = 0;

        /* JADX INFO: renamed from: O */
        public int f2111O = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: P */
        public int f2112P = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: Q */
        public int f2113Q = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: R */
        public int f2114R = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: S */
        public int f2115S = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: T */
        public int f2116T = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: U */
        public int f2117U = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: V */
        public float f2118V = -1.0f;

        /* JADX INFO: renamed from: W */
        public float f2119W = -1.0f;

        /* JADX INFO: renamed from: X */
        public int f2120X = 0;

        /* JADX INFO: renamed from: Y */
        public int f2121Y = 0;

        /* JADX INFO: renamed from: Z */
        public int f2122Z = 0;

        /* JADX INFO: renamed from: a0 */
        public int f2124a0 = 0;

        /* JADX INFO: renamed from: b0 */
        public int f2126b0 = 0;

        /* JADX INFO: renamed from: c0 */
        public int f2128c0 = 0;

        /* JADX INFO: renamed from: d0 */
        public int f2130d0 = 0;

        /* JADX INFO: renamed from: e0 */
        public int f2132e0 = 0;

        /* JADX INFO: renamed from: f0 */
        public float f2134f0 = 1.0f;

        /* JADX INFO: renamed from: g0 */
        public float f2136g0 = 1.0f;

        /* JADX INFO: renamed from: h0 */
        public int f2138h0 = -1;

        /* JADX INFO: renamed from: i0 */
        public int f2140i0 = 0;

        /* JADX INFO: renamed from: j0 */
        public int f2142j0 = -1;

        /* JADX INFO: renamed from: n0 */
        public boolean f2150n0 = false;

        /* JADX INFO: renamed from: o0 */
        public boolean f2152o0 = false;

        /* JADX INFO: renamed from: p0 */
        public boolean f2154p0 = true;

        /* JADX INFO: renamed from: q0 */
        public int f2156q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2096r0 = sparseIntArray;
            sparseIntArray.append(C5969d.f22904O5, 24);
            f2096r0.append(C5969d.f22912P5, 25);
            f2096r0.append(C5969d.f22928R5, 28);
            f2096r0.append(C5969d.f22936S5, 29);
            f2096r0.append(C5969d.f22976X5, 35);
            f2096r0.append(C5969d.f22968W5, 34);
            f2096r0.append(C5969d.f23200x5, 4);
            f2096r0.append(C5969d.f23192w5, 3);
            f2096r0.append(C5969d.f23176u5, 1);
            f2096r0.append(C5969d.f23046f6, 6);
            f2096r0.append(C5969d.f23055g6, 7);
            f2096r0.append(C5969d.f22824E5, 17);
            f2096r0.append(C5969d.f22832F5, 18);
            f2096r0.append(C5969d.f22840G5, 19);
            SparseIntArray sparseIntArray2 = f2096r0;
            int i10 = C5969d.f23144q5;
            sparseIntArray2.append(i10, 90);
            f2096r0.append(C5969d.f23018c5, 26);
            f2096r0.append(C5969d.f22944T5, 31);
            f2096r0.append(C5969d.f22952U5, 32);
            f2096r0.append(C5969d.f22816D5, 10);
            f2096r0.append(C5969d.f22808C5, 9);
            f2096r0.append(C5969d.f23082j6, 13);
            f2096r0.append(C5969d.f23109m6, 16);
            f2096r0.append(C5969d.f23091k6, 14);
            f2096r0.append(C5969d.f23064h6, 11);
            f2096r0.append(C5969d.f23100l6, 15);
            f2096r0.append(C5969d.f23073i6, 12);
            f2096r0.append(C5969d.f23001a6, 38);
            f2096r0.append(C5969d.f22888M5, 37);
            f2096r0.append(C5969d.f22880L5, 39);
            f2096r0.append(C5969d.f22992Z5, 40);
            f2096r0.append(C5969d.f22872K5, 20);
            f2096r0.append(C5969d.f22984Y5, 36);
            f2096r0.append(C5969d.f22800B5, 5);
            f2096r0.append(C5969d.f22896N5, 91);
            f2096r0.append(C5969d.f22960V5, 91);
            f2096r0.append(C5969d.f22920Q5, 91);
            f2096r0.append(C5969d.f23184v5, 91);
            f2096r0.append(C5969d.f23168t5, 91);
            f2096r0.append(C5969d.f23045f5, 23);
            f2096r0.append(C5969d.f23063h5, 27);
            f2096r0.append(C5969d.f23081j5, 30);
            f2096r0.append(C5969d.f23090k5, 8);
            f2096r0.append(C5969d.f23054g5, 33);
            f2096r0.append(C5969d.f23072i5, 2);
            f2096r0.append(C5969d.f23027d5, 22);
            f2096r0.append(C5969d.f23036e5, 21);
            SparseIntArray sparseIntArray3 = f2096r0;
            int i11 = C5969d.f23010b6;
            sparseIntArray3.append(i11, 41);
            SparseIntArray sparseIntArray4 = f2096r0;
            int i12 = C5969d.f22848H5;
            sparseIntArray4.append(i12, 42);
            f2096r0.append(C5969d.f23160s5, 87);
            f2096r0.append(C5969d.f23152r5, 88);
            f2096r0.append(C5969d.f23118n6, 76);
            f2096r0.append(C5969d.f23208y5, 61);
            f2096r0.append(C5969d.f22792A5, 62);
            f2096r0.append(C5969d.f23216z5, 63);
            f2096r0.append(C5969d.f23037e6, 69);
            f2096r0.append(C5969d.f22864J5, 70);
            f2096r0.append(C5969d.f23126o5, 71);
            f2096r0.append(C5969d.f23108m5, 72);
            f2096r0.append(C5969d.f23117n5, 73);
            f2096r0.append(C5969d.f23135p5, 74);
            f2096r0.append(C5969d.f23099l5, 75);
            SparseIntArray sparseIntArray5 = f2096r0;
            int i13 = C5969d.f23019c6;
            sparseIntArray5.append(i13, 84);
            f2096r0.append(C5969d.f23028d6, 86);
            f2096r0.append(i13, 83);
            f2096r0.append(C5969d.f22856I5, 85);
            f2096r0.append(i11, 87);
            f2096r0.append(i12, 88);
            f2096r0.append(C5969d.f23157s2, 89);
            f2096r0.append(i10, 90);
        }

        /* JADX INFO: renamed from: a */
        public void m2538a(b bVar) {
            this.f2123a = bVar.f2123a;
            this.f2129d = bVar.f2129d;
            this.f2125b = bVar.f2125b;
            this.f2131e = bVar.f2131e;
            this.f2133f = bVar.f2133f;
            this.f2135g = bVar.f2135g;
            this.f2137h = bVar.f2137h;
            this.f2139i = bVar.f2139i;
            this.f2141j = bVar.f2141j;
            this.f2143k = bVar.f2143k;
            this.f2145l = bVar.f2145l;
            this.f2147m = bVar.f2147m;
            this.f2149n = bVar.f2149n;
            this.f2151o = bVar.f2151o;
            this.f2153p = bVar.f2153p;
            this.f2155q = bVar.f2155q;
            this.f2157r = bVar.f2157r;
            this.f2158s = bVar.f2158s;
            this.f2159t = bVar.f2159t;
            this.f2160u = bVar.f2160u;
            this.f2161v = bVar.f2161v;
            this.f2162w = bVar.f2162w;
            this.f2163x = bVar.f2163x;
            this.f2164y = bVar.f2164y;
            this.f2165z = bVar.f2165z;
            this.f2097A = bVar.f2097A;
            this.f2098B = bVar.f2098B;
            this.f2099C = bVar.f2099C;
            this.f2100D = bVar.f2100D;
            this.f2101E = bVar.f2101E;
            this.f2102F = bVar.f2102F;
            this.f2103G = bVar.f2103G;
            this.f2104H = bVar.f2104H;
            this.f2105I = bVar.f2105I;
            this.f2106J = bVar.f2106J;
            this.f2107K = bVar.f2107K;
            this.f2108L = bVar.f2108L;
            this.f2109M = bVar.f2109M;
            this.f2110N = bVar.f2110N;
            this.f2111O = bVar.f2111O;
            this.f2112P = bVar.f2112P;
            this.f2113Q = bVar.f2113Q;
            this.f2114R = bVar.f2114R;
            this.f2115S = bVar.f2115S;
            this.f2116T = bVar.f2116T;
            this.f2117U = bVar.f2117U;
            this.f2118V = bVar.f2118V;
            this.f2119W = bVar.f2119W;
            this.f2120X = bVar.f2120X;
            this.f2121Y = bVar.f2121Y;
            this.f2122Z = bVar.f2122Z;
            this.f2124a0 = bVar.f2124a0;
            this.f2126b0 = bVar.f2126b0;
            this.f2128c0 = bVar.f2128c0;
            this.f2130d0 = bVar.f2130d0;
            this.f2132e0 = bVar.f2132e0;
            this.f2134f0 = bVar.f2134f0;
            this.f2136g0 = bVar.f2136g0;
            this.f2138h0 = bVar.f2138h0;
            this.f2140i0 = bVar.f2140i0;
            this.f2142j0 = bVar.f2142j0;
            this.f2148m0 = bVar.f2148m0;
            int[] iArr = bVar.f2144k0;
            if (iArr == null || bVar.f2146l0 != null) {
                this.f2144k0 = null;
            } else {
                this.f2144k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f2146l0 = bVar.f2146l0;
            this.f2150n0 = bVar.f2150n0;
            this.f2152o0 = bVar.f2152o0;
            this.f2154p0 = bVar.f2154p0;
            this.f2156q0 = bVar.f2156q0;
        }

        /* JADX INFO: renamed from: b */
        public void m2539b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5969d.f23009b5);
            this.f2125b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f2096r0.get(index);
                switch (i11) {
                    case 1:
                        this.f2157r = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2157r);
                        break;
                    case 2:
                        this.f2107K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2107K);
                        break;
                    case 3:
                        this.f2155q = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2155q);
                        break;
                    case 4:
                        this.f2153p = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2153p);
                        break;
                    case 5:
                        this.f2097A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f2101E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2101E);
                        break;
                    case 7:
                        this.f2102F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2102F);
                        break;
                    case 8:
                        this.f2108L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2108L);
                        break;
                    case 9:
                        this.f2163x = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2163x);
                        break;
                    case 10:
                        this.f2162w = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2162w);
                        break;
                    case 11:
                        this.f2114R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2114R);
                        break;
                    case 12:
                        this.f2115S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2115S);
                        break;
                    case 13:
                        this.f2111O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2111O);
                        break;
                    case 14:
                        this.f2113Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2113Q);
                        break;
                    case 15:
                        this.f2116T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2116T);
                        break;
                    case 16:
                        this.f2112P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2112P);
                        break;
                    case 17:
                        this.f2133f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2133f);
                        break;
                    case 18:
                        this.f2135g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2135g);
                        break;
                    case 19:
                        this.f2137h = typedArrayObtainStyledAttributes.getFloat(index, this.f2137h);
                        break;
                    case 20:
                        this.f2164y = typedArrayObtainStyledAttributes.getFloat(index, this.f2164y);
                        break;
                    case 21:
                        this.f2131e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2131e);
                        break;
                    case 22:
                        this.f2129d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2129d);
                        break;
                    case 23:
                        this.f2104H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2104H);
                        break;
                    case 24:
                        this.f2141j = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2141j);
                        break;
                    case 25:
                        this.f2143k = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2143k);
                        break;
                    case 26:
                        this.f2103G = typedArrayObtainStyledAttributes.getInt(index, this.f2103G);
                        break;
                    case 27:
                        this.f2105I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2105I);
                        break;
                    case 28:
                        this.f2145l = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2145l);
                        break;
                    case 29:
                        this.f2147m = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2147m);
                        break;
                    case 30:
                        this.f2109M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2109M);
                        break;
                    case 31:
                        this.f2160u = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2160u);
                        break;
                    case 32:
                        this.f2161v = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2161v);
                        break;
                    case 33:
                        this.f2106J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2106J);
                        break;
                    case 34:
                        this.f2151o = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2151o);
                        break;
                    case 35:
                        this.f2149n = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2149n);
                        break;
                    case 36:
                        this.f2165z = typedArrayObtainStyledAttributes.getFloat(index, this.f2165z);
                        break;
                    case 37:
                        this.f2119W = typedArrayObtainStyledAttributes.getFloat(index, this.f2119W);
                        break;
                    case 38:
                        this.f2118V = typedArrayObtainStyledAttributes.getFloat(index, this.f2118V);
                        break;
                    case 39:
                        this.f2120X = typedArrayObtainStyledAttributes.getInt(index, this.f2120X);
                        break;
                    case 40:
                        this.f2121Y = typedArrayObtainStyledAttributes.getInt(index, this.f2121Y);
                        break;
                    case 41:
                        C0518c.m2496w(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0518c.m2496w(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f2098B = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2098B);
                                break;
                            case 62:
                                this.f2099C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2099C);
                                break;
                            case 63:
                                this.f2100D = typedArrayObtainStyledAttributes.getFloat(index, this.f2100D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f2134f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f2136g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f2138h0 = typedArrayObtainStyledAttributes.getInt(index, this.f2138h0);
                                        break;
                                    case 73:
                                        this.f2140i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2140i0);
                                        break;
                                    case 74:
                                        this.f2146l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f2154p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2154p0);
                                        break;
                                    case 76:
                                        this.f2156q0 = typedArrayObtainStyledAttributes.getInt(index, this.f2156q0);
                                        break;
                                    case 77:
                                        this.f2158s = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2158s);
                                        break;
                                    case 78:
                                        this.f2159t = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2159t);
                                        break;
                                    case 79:
                                        this.f2117U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2117U);
                                        break;
                                    case 80:
                                        this.f2110N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2110N);
                                        break;
                                    case 81:
                                        this.f2122Z = typedArrayObtainStyledAttributes.getInt(index, this.f2122Z);
                                        break;
                                    case 82:
                                        this.f2124a0 = typedArrayObtainStyledAttributes.getInt(index, this.f2124a0);
                                        break;
                                    case 83:
                                        this.f2128c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2128c0);
                                        break;
                                    case 84:
                                        this.f2126b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2126b0);
                                        break;
                                    case 85:
                                        this.f2132e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2132e0);
                                        break;
                                    case 86:
                                        this.f2130d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2130d0);
                                        break;
                                    case 87:
                                        this.f2150n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2150n0);
                                        break;
                                    case 88:
                                        this.f2152o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2152o0);
                                        break;
                                    case 89:
                                        this.f2148m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f2139i = typedArrayObtainStyledAttributes.getBoolean(index, this.f2139i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2096r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2096r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c */
    public static class c {

        /* JADX INFO: renamed from: o */
        public static SparseIntArray f2166o;

        /* JADX INFO: renamed from: a */
        public boolean f2167a = false;

        /* JADX INFO: renamed from: b */
        public int f2168b = -1;

        /* JADX INFO: renamed from: c */
        public int f2169c = 0;

        /* JADX INFO: renamed from: d */
        public String f2170d = null;

        /* JADX INFO: renamed from: e */
        public int f2171e = -1;

        /* JADX INFO: renamed from: f */
        public int f2172f = 0;

        /* JADX INFO: renamed from: g */
        public float f2173g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public int f2174h = -1;

        /* JADX INFO: renamed from: i */
        public float f2175i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public float f2176j = Float.NaN;

        /* JADX INFO: renamed from: k */
        public int f2177k = -1;

        /* JADX INFO: renamed from: l */
        public String f2178l = null;

        /* JADX INFO: renamed from: m */
        public int f2179m = -3;

        /* JADX INFO: renamed from: n */
        public int f2180n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2166o = sparseIntArray;
            sparseIntArray.append(C5969d.f23169t6, 1);
            f2166o.append(C5969d.f23185v6, 2);
            f2166o.append(C5969d.f23217z6, 3);
            f2166o.append(C5969d.f23161s6, 4);
            f2166o.append(C5969d.f23153r6, 5);
            f2166o.append(C5969d.f23145q6, 6);
            f2166o.append(C5969d.f23177u6, 7);
            f2166o.append(C5969d.f23209y6, 8);
            f2166o.append(C5969d.f23201x6, 9);
            f2166o.append(C5969d.f23193w6, 10);
        }

        /* JADX INFO: renamed from: a */
        public void m2540a(c cVar) {
            this.f2167a = cVar.f2167a;
            this.f2168b = cVar.f2168b;
            this.f2170d = cVar.f2170d;
            this.f2171e = cVar.f2171e;
            this.f2172f = cVar.f2172f;
            this.f2175i = cVar.f2175i;
            this.f2173g = cVar.f2173g;
            this.f2174h = cVar.f2174h;
        }

        /* JADX INFO: renamed from: b */
        public void m2541b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5969d.f23136p6);
            this.f2167a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f2166o.get(index)) {
                    case 1:
                        this.f2175i = typedArrayObtainStyledAttributes.getFloat(index, this.f2175i);
                        break;
                    case 2:
                        this.f2171e = typedArrayObtainStyledAttributes.getInt(index, this.f2171e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2170d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f2170d = C0057b.f114c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f2172f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2168b = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2168b);
                        break;
                    case 6:
                        this.f2169c = typedArrayObtainStyledAttributes.getInteger(index, this.f2169c);
                        break;
                    case 7:
                        this.f2173g = typedArrayObtainStyledAttributes.getFloat(index, this.f2173g);
                        break;
                    case 8:
                        this.f2177k = typedArrayObtainStyledAttributes.getInteger(index, this.f2177k);
                        break;
                    case 9:
                        this.f2176j = typedArrayObtainStyledAttributes.getFloat(index, this.f2176j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f2180n = resourceId;
                            if (resourceId != -1) {
                                this.f2179m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f2178l = string;
                            if (string.indexOf("/") > 0) {
                                this.f2180n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f2179m = -2;
                            } else {
                                this.f2179m = -1;
                            }
                        } else {
                            this.f2179m = typedArrayObtainStyledAttributes.getInteger(index, this.f2180n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public boolean f2181a = false;

        /* JADX INFO: renamed from: b */
        public int f2182b = 0;

        /* JADX INFO: renamed from: c */
        public int f2183c = 0;

        /* JADX INFO: renamed from: d */
        public float f2184d = 1.0f;

        /* JADX INFO: renamed from: e */
        public float f2185e = Float.NaN;

        /* JADX INFO: renamed from: a */
        public void m2542a(d dVar) {
            this.f2181a = dVar.f2181a;
            this.f2182b = dVar.f2182b;
            this.f2184d = dVar.f2184d;
            this.f2185e = dVar.f2185e;
            this.f2183c = dVar.f2183c;
        }

        /* JADX INFO: renamed from: b */
        public void m2543b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5969d.f22873K6);
            this.f2181a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f22889M6) {
                    this.f2184d = typedArrayObtainStyledAttributes.getFloat(index, this.f2184d);
                } else if (index == C5969d.f22881L6) {
                    this.f2182b = typedArrayObtainStyledAttributes.getInt(index, this.f2182b);
                    this.f2182b = C0518c.f2067g[this.f2182b];
                } else if (index == C5969d.f22905O6) {
                    this.f2183c = typedArrayObtainStyledAttributes.getInt(index, this.f2183c);
                } else if (index == C5969d.f22897N6) {
                    this.f2185e = typedArrayObtainStyledAttributes.getFloat(index, this.f2185e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$e */
    public static class e {

        /* JADX INFO: renamed from: o */
        public static SparseIntArray f2186o;

        /* JADX INFO: renamed from: a */
        public boolean f2187a = false;

        /* JADX INFO: renamed from: b */
        public float f2188b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f2189c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f2190d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f2191e = 1.0f;

        /* JADX INFO: renamed from: f */
        public float f2192f = 1.0f;

        /* JADX INFO: renamed from: g */
        public float f2193g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public float f2194h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public int f2195i = -1;

        /* JADX INFO: renamed from: j */
        public float f2196j = 0.0f;

        /* JADX INFO: renamed from: k */
        public float f2197k = 0.0f;

        /* JADX INFO: renamed from: l */
        public float f2198l = 0.0f;

        /* JADX INFO: renamed from: m */
        public boolean f2199m = false;

        /* JADX INFO: renamed from: n */
        public float f2200n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2186o = sparseIntArray;
            sparseIntArray.append(C5969d.f23011b7, 1);
            f2186o.append(C5969d.f23020c7, 2);
            f2186o.append(C5969d.f23029d7, 3);
            f2186o.append(C5969d.f22993Z6, 4);
            f2186o.append(C5969d.f23002a7, 5);
            f2186o.append(C5969d.f22961V6, 6);
            f2186o.append(C5969d.f22969W6, 7);
            f2186o.append(C5969d.f22977X6, 8);
            f2186o.append(C5969d.f22985Y6, 9);
            f2186o.append(C5969d.f23038e7, 10);
            f2186o.append(C5969d.f23047f7, 11);
            f2186o.append(C5969d.f23056g7, 12);
        }

        /* JADX INFO: renamed from: a */
        public void m2544a(e eVar) {
            this.f2187a = eVar.f2187a;
            this.f2188b = eVar.f2188b;
            this.f2189c = eVar.f2189c;
            this.f2190d = eVar.f2190d;
            this.f2191e = eVar.f2191e;
            this.f2192f = eVar.f2192f;
            this.f2193g = eVar.f2193g;
            this.f2194h = eVar.f2194h;
            this.f2195i = eVar.f2195i;
            this.f2196j = eVar.f2196j;
            this.f2197k = eVar.f2197k;
            this.f2198l = eVar.f2198l;
            this.f2199m = eVar.f2199m;
            this.f2200n = eVar.f2200n;
        }

        /* JADX INFO: renamed from: b */
        public void m2545b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5969d.f22953U6);
            this.f2187a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f2186o.get(index)) {
                    case 1:
                        this.f2188b = typedArrayObtainStyledAttributes.getFloat(index, this.f2188b);
                        break;
                    case 2:
                        this.f2189c = typedArrayObtainStyledAttributes.getFloat(index, this.f2189c);
                        break;
                    case 3:
                        this.f2190d = typedArrayObtainStyledAttributes.getFloat(index, this.f2190d);
                        break;
                    case 4:
                        this.f2191e = typedArrayObtainStyledAttributes.getFloat(index, this.f2191e);
                        break;
                    case 5:
                        this.f2192f = typedArrayObtainStyledAttributes.getFloat(index, this.f2192f);
                        break;
                    case 6:
                        this.f2193g = typedArrayObtainStyledAttributes.getDimension(index, this.f2193g);
                        break;
                    case 7:
                        this.f2194h = typedArrayObtainStyledAttributes.getDimension(index, this.f2194h);
                        break;
                    case 8:
                        this.f2196j = typedArrayObtainStyledAttributes.getDimension(index, this.f2196j);
                        break;
                    case 9:
                        this.f2197k = typedArrayObtainStyledAttributes.getDimension(index, this.f2197k);
                        break;
                    case 10:
                        this.f2198l = typedArrayObtainStyledAttributes.getDimension(index, this.f2198l);
                        break;
                    case 11:
                        this.f2199m = true;
                        this.f2200n = typedArrayObtainStyledAttributes.getDimension(index, this.f2200n);
                        break;
                    case 12:
                        this.f2195i = C0518c.m2495v(typedArrayObtainStyledAttributes, index, this.f2195i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f2068h.append(C5969d.f23067i0, 25);
        f2068h.append(C5969d.f23076j0, 26);
        f2068h.append(C5969d.f23094l0, 29);
        f2068h.append(C5969d.f23103m0, 30);
        f2068h.append(C5969d.f23155s0, 36);
        f2068h.append(C5969d.f23147r0, 35);
        f2068h.append(C5969d.f22906P, 4);
        f2068h.append(C5969d.f22898O, 3);
        f2068h.append(C5969d.f22866K, 1);
        f2068h.append(C5969d.f22882M, 91);
        f2068h.append(C5969d.f22874L, 92);
        f2068h.append(C5969d.f22795B0, 6);
        f2068h.append(C5969d.f22803C0, 7);
        f2068h.append(C5969d.f22962W, 17);
        f2068h.append(C5969d.f22970X, 18);
        f2068h.append(C5969d.f22978Y, 19);
        f2068h.append(C5969d.f22834G, 99);
        f2068h.append(C5969d.f23012c, 27);
        f2068h.append(C5969d.f23112n0, 32);
        f2068h.append(C5969d.f23121o0, 33);
        f2068h.append(C5969d.f22954V, 10);
        f2068h.append(C5969d.f22946U, 9);
        f2068h.append(C5969d.f22827F0, 13);
        f2068h.append(C5969d.f22851I0, 16);
        f2068h.append(C5969d.f22835G0, 14);
        f2068h.append(C5969d.f22811D0, 11);
        f2068h.append(C5969d.f22843H0, 15);
        f2068h.append(C5969d.f22819E0, 12);
        f2068h.append(C5969d.f23179v0, 40);
        f2068h.append(C5969d.f23049g0, 39);
        f2068h.append(C5969d.f23040f0, 41);
        f2068h.append(C5969d.f23171u0, 42);
        f2068h.append(C5969d.f23031e0, 20);
        f2068h.append(C5969d.f23163t0, 37);
        f2068h.append(C5969d.f22938T, 5);
        f2068h.append(C5969d.f23058h0, 87);
        f2068h.append(C5969d.f23139q0, 87);
        f2068h.append(C5969d.f23085k0, 87);
        f2068h.append(C5969d.f22890N, 87);
        f2068h.append(C5969d.f22858J, 87);
        f2068h.append(C5969d.f23057h, 24);
        f2068h.append(C5969d.f23075j, 28);
        f2068h.append(C5969d.f23178v, 31);
        f2068h.append(C5969d.f23186w, 8);
        f2068h.append(C5969d.f23066i, 34);
        f2068h.append(C5969d.f23084k, 2);
        f2068h.append(C5969d.f23039f, 23);
        f2068h.append(C5969d.f23048g, 21);
        f2068h.append(C5969d.f23187w0, 95);
        f2068h.append(C5969d.f22986Z, 96);
        f2068h.append(C5969d.f23030e, 22);
        f2068h.append(C5969d.f23093l, 43);
        f2068h.append(C5969d.f23202y, 44);
        f2068h.append(C5969d.f23162t, 45);
        f2068h.append(C5969d.f23170u, 46);
        f2068h.append(C5969d.f23154s, 60);
        f2068h.append(C5969d.f23138q, 47);
        f2068h.append(C5969d.f23146r, 48);
        f2068h.append(C5969d.f23102m, 49);
        f2068h.append(C5969d.f23111n, 50);
        f2068h.append(C5969d.f23120o, 51);
        f2068h.append(C5969d.f23129p, 52);
        f2068h.append(C5969d.f23194x, 53);
        f2068h.append(C5969d.f23195x0, 54);
        f2068h.append(C5969d.f22995a0, 55);
        f2068h.append(C5969d.f23203y0, 56);
        f2068h.append(C5969d.f23004b0, 57);
        f2068h.append(C5969d.f23211z0, 58);
        f2068h.append(C5969d.f23013c0, 59);
        f2068h.append(C5969d.f22914Q, 61);
        f2068h.append(C5969d.f22930S, 62);
        f2068h.append(C5969d.f22922R, 63);
        f2068h.append(C5969d.f23210z, 64);
        f2068h.append(C5969d.f22931S0, 65);
        f2068h.append(C5969d.f22826F, 66);
        f2068h.append(C5969d.f22939T0, 67);
        f2068h.append(C5969d.f22875L0, 79);
        f2068h.append(C5969d.f23021d, 38);
        f2068h.append(C5969d.f22867K0, 68);
        f2068h.append(C5969d.f22787A0, 69);
        f2068h.append(C5969d.f23022d0, 70);
        f2068h.append(C5969d.f22859J0, 97);
        f2068h.append(C5969d.f22810D, 71);
        f2068h.append(C5969d.f22794B, 72);
        f2068h.append(C5969d.f22802C, 73);
        f2068h.append(C5969d.f22818E, 74);
        f2068h.append(C5969d.f22786A, 75);
        f2068h.append(C5969d.f22883M0, 76);
        f2068h.append(C5969d.f23130p0, 77);
        f2068h.append(C5969d.f22947U0, 78);
        f2068h.append(C5969d.f22850I, 80);
        f2068h.append(C5969d.f22842H, 81);
        f2068h.append(C5969d.f22891N0, 82);
        f2068h.append(C5969d.f22923R0, 83);
        f2068h.append(C5969d.f22915Q0, 84);
        f2068h.append(C5969d.f22907P0, 85);
        f2068h.append(C5969d.f22899O0, 86);
        SparseIntArray sparseIntArray = f2069i;
        int i10 = C5969d.f22982Y3;
        sparseIntArray.append(i10, 6);
        f2069i.append(i10, 7);
        f2069i.append(C5969d.f22941T2, 27);
        f2069i.append(C5969d.f23008b4, 13);
        f2069i.append(C5969d.f23035e4, 16);
        f2069i.append(C5969d.f23017c4, 14);
        f2069i.append(C5969d.f22990Z3, 11);
        f2069i.append(C5969d.f23026d4, 15);
        f2069i.append(C5969d.f22999a4, 12);
        f2069i.append(C5969d.f22934S3, 40);
        f2069i.append(C5969d.f22878L3, 39);
        f2069i.append(C5969d.f22870K3, 41);
        f2069i.append(C5969d.f22926R3, 42);
        f2069i.append(C5969d.f22862J3, 20);
        f2069i.append(C5969d.f22918Q3, 37);
        f2069i.append(C5969d.f22814D3, 5);
        f2069i.append(C5969d.f22886M3, 87);
        f2069i.append(C5969d.f22910P3, 87);
        f2069i.append(C5969d.f22894N3, 87);
        f2069i.append(C5969d.f22790A3, 87);
        f2069i.append(C5969d.f23214z3, 87);
        f2069i.append(C5969d.f22981Y2, 24);
        f2069i.append(C5969d.f22998a3, 28);
        f2069i.append(C5969d.f23106m3, 31);
        f2069i.append(C5969d.f23115n3, 8);
        f2069i.append(C5969d.f22989Z2, 34);
        f2069i.append(C5969d.f23007b3, 2);
        f2069i.append(C5969d.f22965W2, 23);
        f2069i.append(C5969d.f22973X2, 21);
        f2069i.append(C5969d.f22942T3, 95);
        f2069i.append(C5969d.f22822E3, 96);
        f2069i.append(C5969d.f22957V2, 22);
        f2069i.append(C5969d.f23016c3, 43);
        f2069i.append(C5969d.f23133p3, 44);
        f2069i.append(C5969d.f23088k3, 45);
        f2069i.append(C5969d.f23097l3, 46);
        f2069i.append(C5969d.f23079j3, 60);
        f2069i.append(C5969d.f23061h3, 47);
        f2069i.append(C5969d.f23070i3, 48);
        f2069i.append(C5969d.f23025d3, 49);
        f2069i.append(C5969d.f23034e3, 50);
        f2069i.append(C5969d.f23043f3, 51);
        f2069i.append(C5969d.f23052g3, 52);
        f2069i.append(C5969d.f23124o3, 53);
        f2069i.append(C5969d.f22950U3, 54);
        f2069i.append(C5969d.f22830F3, 55);
        f2069i.append(C5969d.f22958V3, 56);
        f2069i.append(C5969d.f22838G3, 57);
        f2069i.append(C5969d.f22966W3, 58);
        f2069i.append(C5969d.f22846H3, 59);
        f2069i.append(C5969d.f22806C3, 62);
        f2069i.append(C5969d.f22798B3, 63);
        f2069i.append(C5969d.f23142q3, 64);
        f2069i.append(C5969d.f23134p4, 65);
        f2069i.append(C5969d.f23190w3, 66);
        f2069i.append(C5969d.f23143q4, 67);
        f2069i.append(C5969d.f23062h4, 79);
        f2069i.append(C5969d.f22949U2, 38);
        f2069i.append(C5969d.f23071i4, 98);
        f2069i.append(C5969d.f23053g4, 68);
        f2069i.append(C5969d.f22974X3, 69);
        f2069i.append(C5969d.f22854I3, 70);
        f2069i.append(C5969d.f23174u3, 71);
        f2069i.append(C5969d.f23158s3, 72);
        f2069i.append(C5969d.f23166t3, 73);
        f2069i.append(C5969d.f23182v3, 74);
        f2069i.append(C5969d.f23150r3, 75);
        f2069i.append(C5969d.f23080j4, 76);
        f2069i.append(C5969d.f22902O3, 77);
        f2069i.append(C5969d.f23151r4, 78);
        f2069i.append(C5969d.f23206y3, 80);
        f2069i.append(C5969d.f23198x3, 81);
        f2069i.append(C5969d.f23089k4, 82);
        f2069i.append(C5969d.f23125o4, 83);
        f2069i.append(C5969d.f23116n4, 84);
        f2069i.append(C5969d.f23107m4, 85);
        f2069i.append(C5969d.f23098l4, 86);
        f2069i.append(C5969d.f23044f4, 97);
    }

    /* JADX INFO: renamed from: A */
    public static void m2492A(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C14070a c14070a = new a.C14070a();
        aVar.f2083h = c14070a;
        aVar.f2079d.f2167a = false;
        aVar.f2080e.f2125b = false;
        aVar.f2078c.f2181a = false;
        aVar.f2081f.f2187a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f2069i.get(index)) {
                case 2:
                    c14070a.m2535b(2, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2107K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2068h.get(index));
                    break;
                case 5:
                    c14070a.m2536c(5, typedArray.getString(index));
                    break;
                case 6:
                    c14070a.m2535b(6, typedArray.getDimensionPixelOffset(index, aVar.f2080e.f2101E));
                    break;
                case 7:
                    c14070a.m2535b(7, typedArray.getDimensionPixelOffset(index, aVar.f2080e.f2102F));
                    break;
                case 8:
                    c14070a.m2535b(8, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2108L));
                    break;
                case 11:
                    c14070a.m2535b(11, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2114R));
                    break;
                case 12:
                    c14070a.m2535b(12, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2115S));
                    break;
                case 13:
                    c14070a.m2535b(13, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2111O));
                    break;
                case 14:
                    c14070a.m2535b(14, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2113Q));
                    break;
                case 15:
                    c14070a.m2535b(15, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2116T));
                    break;
                case 16:
                    c14070a.m2535b(16, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2112P));
                    break;
                case 17:
                    c14070a.m2535b(17, typedArray.getDimensionPixelOffset(index, aVar.f2080e.f2133f));
                    break;
                case 18:
                    c14070a.m2535b(18, typedArray.getDimensionPixelOffset(index, aVar.f2080e.f2135g));
                    break;
                case 19:
                    c14070a.m2534a(19, typedArray.getFloat(index, aVar.f2080e.f2137h));
                    break;
                case 20:
                    c14070a.m2534a(20, typedArray.getFloat(index, aVar.f2080e.f2164y));
                    break;
                case 21:
                    c14070a.m2535b(21, typedArray.getLayoutDimension(index, aVar.f2080e.f2131e));
                    break;
                case 22:
                    c14070a.m2535b(22, f2067g[typedArray.getInt(index, aVar.f2078c.f2182b)]);
                    break;
                case 23:
                    c14070a.m2535b(23, typedArray.getLayoutDimension(index, aVar.f2080e.f2129d));
                    break;
                case 24:
                    c14070a.m2535b(24, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2104H));
                    break;
                case 27:
                    c14070a.m2535b(27, typedArray.getInt(index, aVar.f2080e.f2103G));
                    break;
                case 28:
                    c14070a.m2535b(28, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2105I));
                    break;
                case 31:
                    c14070a.m2535b(31, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2109M));
                    break;
                case 34:
                    c14070a.m2535b(34, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2106J));
                    break;
                case 37:
                    c14070a.m2534a(37, typedArray.getFloat(index, aVar.f2080e.f2165z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f2076a);
                    aVar.f2076a = resourceId;
                    c14070a.m2535b(38, resourceId);
                    break;
                case 39:
                    c14070a.m2534a(39, typedArray.getFloat(index, aVar.f2080e.f2119W));
                    break;
                case 40:
                    c14070a.m2534a(40, typedArray.getFloat(index, aVar.f2080e.f2118V));
                    break;
                case 41:
                    c14070a.m2535b(41, typedArray.getInt(index, aVar.f2080e.f2120X));
                    break;
                case 42:
                    c14070a.m2535b(42, typedArray.getInt(index, aVar.f2080e.f2121Y));
                    break;
                case 43:
                    c14070a.m2534a(43, typedArray.getFloat(index, aVar.f2078c.f2184d));
                    break;
                case 44:
                    c14070a.m2537d(44, true);
                    c14070a.m2534a(44, typedArray.getDimension(index, aVar.f2081f.f2200n));
                    break;
                case 45:
                    c14070a.m2534a(45, typedArray.getFloat(index, aVar.f2081f.f2189c));
                    break;
                case 46:
                    c14070a.m2534a(46, typedArray.getFloat(index, aVar.f2081f.f2190d));
                    break;
                case 47:
                    c14070a.m2534a(47, typedArray.getFloat(index, aVar.f2081f.f2191e));
                    break;
                case 48:
                    c14070a.m2534a(48, typedArray.getFloat(index, aVar.f2081f.f2192f));
                    break;
                case 49:
                    c14070a.m2534a(49, typedArray.getDimension(index, aVar.f2081f.f2193g));
                    break;
                case 50:
                    c14070a.m2534a(50, typedArray.getDimension(index, aVar.f2081f.f2194h));
                    break;
                case 51:
                    c14070a.m2534a(51, typedArray.getDimension(index, aVar.f2081f.f2196j));
                    break;
                case 52:
                    c14070a.m2534a(52, typedArray.getDimension(index, aVar.f2081f.f2197k));
                    break;
                case 53:
                    c14070a.m2534a(53, typedArray.getDimension(index, aVar.f2081f.f2198l));
                    break;
                case 54:
                    c14070a.m2535b(54, typedArray.getInt(index, aVar.f2080e.f2122Z));
                    break;
                case 55:
                    c14070a.m2535b(55, typedArray.getInt(index, aVar.f2080e.f2124a0));
                    break;
                case 56:
                    c14070a.m2535b(56, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2126b0));
                    break;
                case 57:
                    c14070a.m2535b(57, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2128c0));
                    break;
                case 58:
                    c14070a.m2535b(58, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2130d0));
                    break;
                case 59:
                    c14070a.m2535b(59, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2132e0));
                    break;
                case 60:
                    c14070a.m2534a(60, typedArray.getFloat(index, aVar.f2081f.f2188b));
                    break;
                case 62:
                    c14070a.m2535b(62, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2099C));
                    break;
                case 63:
                    c14070a.m2534a(63, typedArray.getFloat(index, aVar.f2080e.f2100D));
                    break;
                case 64:
                    c14070a.m2535b(64, m2495v(typedArray, index, aVar.f2079d.f2168b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c14070a.m2536c(65, typedArray.getString(index));
                    } else {
                        c14070a.m2536c(65, C0057b.f114c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c14070a.m2535b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c14070a.m2534a(67, typedArray.getFloat(index, aVar.f2079d.f2175i));
                    break;
                case 68:
                    c14070a.m2534a(68, typedArray.getFloat(index, aVar.f2078c.f2185e));
                    break;
                case 69:
                    c14070a.m2534a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c14070a.m2534a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c14070a.m2535b(72, typedArray.getInt(index, aVar.f2080e.f2138h0));
                    break;
                case 73:
                    c14070a.m2535b(73, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2140i0));
                    break;
                case 74:
                    c14070a.m2536c(74, typedArray.getString(index));
                    break;
                case 75:
                    c14070a.m2537d(75, typedArray.getBoolean(index, aVar.f2080e.f2154p0));
                    break;
                case 76:
                    c14070a.m2535b(76, typedArray.getInt(index, aVar.f2079d.f2171e));
                    break;
                case 77:
                    c14070a.m2536c(77, typedArray.getString(index));
                    break;
                case 78:
                    c14070a.m2535b(78, typedArray.getInt(index, aVar.f2078c.f2183c));
                    break;
                case 79:
                    c14070a.m2534a(79, typedArray.getFloat(index, aVar.f2079d.f2173g));
                    break;
                case 80:
                    c14070a.m2537d(80, typedArray.getBoolean(index, aVar.f2080e.f2150n0));
                    break;
                case 81:
                    c14070a.m2537d(81, typedArray.getBoolean(index, aVar.f2080e.f2152o0));
                    break;
                case 82:
                    c14070a.m2535b(82, typedArray.getInteger(index, aVar.f2079d.f2169c));
                    break;
                case 83:
                    c14070a.m2535b(83, m2495v(typedArray, index, aVar.f2081f.f2195i));
                    break;
                case 84:
                    c14070a.m2535b(84, typedArray.getInteger(index, aVar.f2079d.f2177k));
                    break;
                case 85:
                    c14070a.m2534a(85, typedArray.getFloat(index, aVar.f2079d.f2176j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2079d.f2180n = typedArray.getResourceId(index, -1);
                        c14070a.m2535b(89, aVar.f2079d.f2180n);
                        c cVar = aVar.f2079d;
                        if (cVar.f2180n != -1) {
                            cVar.f2179m = -2;
                            c14070a.m2535b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f2079d.f2178l = typedArray.getString(index);
                        c14070a.m2536c(90, aVar.f2079d.f2178l);
                        if (aVar.f2079d.f2178l.indexOf("/") > 0) {
                            aVar.f2079d.f2180n = typedArray.getResourceId(index, -1);
                            c14070a.m2535b(89, aVar.f2079d.f2180n);
                            aVar.f2079d.f2179m = -2;
                            c14070a.m2535b(88, -2);
                        } else {
                            aVar.f2079d.f2179m = -1;
                            c14070a.m2535b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f2079d;
                        cVar2.f2179m = typedArray.getInteger(index, cVar2.f2180n);
                        c14070a.m2535b(88, aVar.f2079d.f2179m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2068h.get(index));
                    break;
                case 93:
                    c14070a.m2535b(93, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2110N));
                    break;
                case 94:
                    c14070a.m2535b(94, typedArray.getDimensionPixelSize(index, aVar.f2080e.f2117U));
                    break;
                case 95:
                    m2496w(c14070a, typedArray, index, 0);
                    break;
                case 96:
                    m2496w(c14070a, typedArray, index, 1);
                    break;
                case 97:
                    c14070a.m2535b(97, typedArray.getInt(index, aVar.f2080e.f2156q0));
                    break;
                case 98:
                    if (C5324j.f20710v0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f2076a);
                        aVar.f2076a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f2077b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f2077b = typedArray.getString(index);
                    } else {
                        aVar.f2076a = typedArray.getResourceId(index, aVar.f2076a);
                    }
                    break;
                case 99:
                    c14070a.m2537d(99, typedArray.getBoolean(index, aVar.f2080e.f2139i));
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static int m2495v(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public static void m2496w(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        boolean z10;
        a.C14070a c14070a;
        b bVar;
        ConstraintLayout.C0513b c0513b;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            m2497x(obj, typedArray.getString(i10), i11);
            return;
        }
        int i13 = 0;
        if (i12 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize == -4) {
                z10 = true;
                i13 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z10 = false;
            }
            if (obj instanceof ConstraintLayout.C0513b) {
                c0513b = (ConstraintLayout.C0513b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0513b).width = i13;
                    c0513b.f1983a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0513b).height = i13;
                    c0513b.f1985b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f2129d = i13;
                    bVar.f2150n0 = z10;
                    return;
                } else {
                    bVar.f2131e = i13;
                    bVar.f2152o0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C14070a) {
                c14070a = (a.C14070a) obj;
                if (i11 == 0) {
                    c14070a.m2535b(23, i13);
                    c14070a.m2537d(80, z10);
                } else {
                    c14070a.m2535b(21, i13);
                    c14070a.m2537d(81, z10);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        i13 = dimensionPixelSize;
        z10 = false;
        if (obj instanceof ConstraintLayout.C0513b) {
            c0513b = (ConstraintLayout.C0513b) obj;
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) c0513b).width = i13;
                c0513b.f1983a0 = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) c0513b).height = i13;
                c0513b.f1985b0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i11 == 0) {
                bVar.f2129d = i13;
                bVar.f2150n0 = z10;
                return;
            } else {
                bVar.f2131e = i13;
                bVar.f2152o0 = z10;
                return;
            }
        }
        if (obj instanceof a.C14070a) {
            c14070a = (a.C14070a) obj;
            if (i11 == 0) {
                c14070a.m2535b(23, i13);
                c14070a.m2537d(80, z10);
            } else {
                c14070a.m2535b(21, i13);
                c14070a.m2537d(81, z10);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m2497x(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.C0513b) {
                    ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0513b).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0513b).height = 0;
                    }
                    m2498y(c0513b, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f2097A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C14070a) {
                        ((a.C14070a) obj).m2536c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.C0513b) {
                        ConstraintLayout.C0513b c0513b2 = (ConstraintLayout.C0513b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0513b2).width = 0;
                            c0513b2.f1967L = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0513b2).height = 0;
                            c0513b2.f1968M = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (i10 == 0) {
                            bVar.f2129d = 0;
                            bVar.f2119W = f10;
                            return;
                        } else {
                            bVar.f2131e = 0;
                            bVar.f2118V = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C14070a) {
                        a.C14070a c14070a = (a.C14070a) obj;
                        if (i10 == 0) {
                            c14070a.m2535b(23, 0);
                            c14070a.m2534a(39, f10);
                            return;
                        } else {
                            c14070a.m2535b(21, 0);
                            c14070a.m2534a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.C0513b) {
                        ConstraintLayout.C0513b c0513b3 = (ConstraintLayout.C0513b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0513b3).width = 0;
                            c0513b3.f1977V = fMax;
                            c0513b3.f1971P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0513b3).height = 0;
                            c0513b3.f1978W = fMax;
                            c0513b3.f1972Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i10 == 0) {
                            bVar2.f2129d = 0;
                            bVar2.f2134f0 = fMax;
                            bVar2.f2122Z = 2;
                            return;
                        } else {
                            bVar2.f2131e = 0;
                            bVar2.f2136g0 = fMax;
                            bVar2.f2124a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C14070a) {
                        a.C14070a c14070a2 = (a.C14070a) obj;
                        if (i10 == 0) {
                            c14070a2.m2535b(23, 0);
                            c14070a2.m2535b(54, 2);
                        } else {
                            c14070a2.m2535b(21, 0);
                            c14070a2.m2535b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m2498y(ConstraintLayout.C0513b c0513b, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0513b.f1964I = str;
        c0513b.f1965J = fAbs;
        c0513b.f1966K = i10;
    }

    /* JADX INFO: renamed from: B */
    public void m2499B(int i10, float f10) {
        m2522s(i10).f2080e.f2164y = f10;
    }

    /* JADX INFO: renamed from: C */
    public void m2500C(int i10, int i11) {
        m2522s(i10).f2080e.f2120X = i11;
    }

    /* JADX INFO: renamed from: D */
    public void m2501D(int i10, float f10) {
        m2522s(i10).f2080e.f2119W = f10;
    }

    /* JADX INFO: renamed from: E */
    public void m2502E(int i10, int i11, int i12) {
        a aVarM2522s = m2522s(i10);
        switch (i11) {
            case 1:
                aVarM2522s.f2080e.f2104H = i12;
                return;
            case 2:
                aVarM2522s.f2080e.f2105I = i12;
                return;
            case 3:
                aVarM2522s.f2080e.f2106J = i12;
                return;
            case 4:
                aVarM2522s.f2080e.f2107K = i12;
                return;
            case 5:
                aVarM2522s.f2080e.f2110N = i12;
                return;
            case 6:
                aVarM2522s.f2080e.f2109M = i12;
                return;
            case 7:
                aVarM2522s.f2080e.f2108L = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: F */
    public void m2503F(int i10, float f10) {
        m2522s(i10).f2080e.f2165z = f10;
    }

    /* JADX INFO: renamed from: G */
    public void m2504G(int i10, int i11) {
        m2522s(i10).f2080e.f2121Y = i11;
    }

    /* JADX INFO: renamed from: H */
    public final String m2505H(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2506c(ConstraintLayout constraintLayout) {
        m2507d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public void m2507d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f2075f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f2075f.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C5315a.m24626b(childAt));
            } else {
                if (this.f2074e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f2075f.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f2075f.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f2080e.f2142j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f2080e.f2138h0);
                                barrier.setMargin(aVar.f2080e.f2140i0);
                                barrier.setAllowsGoneWidget(aVar.f2080e.f2154p0);
                                b bVar = aVar.f2080e;
                                int[] iArr = bVar.f2144k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f2146l0;
                                    if (str != null) {
                                        bVar.f2144k0 = m2519p(barrier, str);
                                        barrier.setReferencedIds(aVar.f2080e.f2144k0);
                                    }
                                }
                            }
                            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) childAt.getLayoutParams();
                            c0513b.m2465a();
                            aVar.m2529d(c0513b);
                            if (z10) {
                                C0516a.m2473e(childAt, aVar.f2082g);
                            }
                            childAt.setLayoutParams(c0513b);
                            d dVar = aVar.f2078c;
                            if (dVar.f2183c == 0) {
                                childAt.setVisibility(dVar.f2182b);
                            }
                            childAt.setAlpha(aVar.f2078c.f2184d);
                            childAt.setRotation(aVar.f2081f.f2188b);
                            childAt.setRotationX(aVar.f2081f.f2189c);
                            childAt.setRotationY(aVar.f2081f.f2190d);
                            childAt.setScaleX(aVar.f2081f.f2191e);
                            childAt.setScaleY(aVar.f2081f.f2192f);
                            e eVar = aVar.f2081f;
                            if (eVar.f2195i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f2081f.f2195i);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f2193g)) {
                                    childAt.setPivotX(aVar.f2081f.f2193g);
                                }
                                if (!Float.isNaN(aVar.f2081f.f2194h)) {
                                    childAt.setPivotY(aVar.f2081f.f2194h);
                                }
                            }
                            childAt.setTranslationX(aVar.f2081f.f2196j);
                            childAt.setTranslationY(aVar.f2081f.f2197k);
                            childAt.setTranslationZ(aVar.f2081f.f2198l);
                            e eVar2 = aVar.f2081f;
                            if (eVar2.f2199m) {
                                childAt.setElevation(eVar2.f2200n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f2075f.get(num);
            if (aVar2 != null) {
                if (aVar2.f2080e.f2142j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar2.f2080e;
                    int[] iArr2 = bVar2.f2144k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f2146l0;
                        if (str2 != null) {
                            bVar2.f2144k0 = m2519p(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f2080e.f2144k0);
                        }
                    }
                    barrier2.setType(aVar2.f2080e.f2138h0);
                    barrier2.setMargin(aVar2.f2080e.f2140i0);
                    ConstraintLayout.C0513b c0513bGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m2491s();
                    aVar2.m2529d(c0513bGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, c0513bGenerateDefaultLayoutParams);
                }
                if (aVar2.f2080e.f2123a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.C0513b c0513bGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.m2529d(c0513bGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, c0513bGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof AbstractC0517b) {
                ((AbstractC0517b) childAt2).mo2483i(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2508e(Context context, int i10) {
        m2509f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: f */
    public void m2509f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2075f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2074e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2075f.containsKey(Integer.valueOf(id2))) {
                this.f2075f.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f2075f.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f2082g = C0516a.m2471a(this.f2073d, childAt);
                aVar.m2531f(id2, c0513b);
                aVar.f2078c.f2182b = childAt.getVisibility();
                aVar.f2078c.f2184d = childAt.getAlpha();
                aVar.f2081f.f2188b = childAt.getRotation();
                aVar.f2081f.f2189c = childAt.getRotationX();
                aVar.f2081f.f2190d = childAt.getRotationY();
                aVar.f2081f.f2191e = childAt.getScaleX();
                aVar.f2081f.f2192f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f2081f;
                    eVar.f2193g = pivotX;
                    eVar.f2194h = pivotY;
                }
                aVar.f2081f.f2196j = childAt.getTranslationX();
                aVar.f2081f.f2197k = childAt.getTranslationY();
                aVar.f2081f.f2198l = childAt.getTranslationZ();
                e eVar2 = aVar.f2081f;
                if (eVar2.f2199m) {
                    eVar2.f2200n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f2080e.f2154p0 = barrier.getAllowsGoneWidget();
                    aVar.f2080e.f2144k0 = barrier.getReferencedIds();
                    aVar.f2080e.f2138h0 = barrier.getType();
                    aVar.f2080e.f2140i0 = barrier.getMargin();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2510g(C0519d c0519d) {
        int childCount = c0519d.getChildCount();
        this.f2075f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c0519d.getChildAt(i10);
            C0519d.a aVar = (C0519d.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2074e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2075f.containsKey(Integer.valueOf(id2))) {
                this.f2075f.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f2075f.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof AbstractC0517b) {
                    aVar2.m2533h((AbstractC0517b) childAt, id2, aVar);
                }
                aVar2.m2532g(id2, aVar);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2511h(int i10, int i11, int i12, int i13) {
        if (!this.f2075f.containsKey(Integer.valueOf(i10))) {
            this.f2075f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f2075f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f2080e;
                    bVar.f2141j = i12;
                    bVar.f2143k = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f2080e;
                    bVar2.f2143k = i12;
                    bVar2.f2141j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m2505H(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f2080e;
                    bVar3.f2145l = i12;
                    bVar3.f2147m = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f2080e;
                    bVar4.f2147m = i12;
                    bVar4.f2145l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f2080e;
                    bVar5.f2149n = i12;
                    bVar5.f2151o = -1;
                    bVar5.f2157r = -1;
                    bVar5.f2158s = -1;
                    bVar5.f2159t = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                }
                b bVar6 = aVar.f2080e;
                bVar6.f2151o = i12;
                bVar6.f2149n = -1;
                bVar6.f2157r = -1;
                bVar6.f2158s = -1;
                bVar6.f2159t = -1;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f2080e;
                    bVar7.f2155q = i12;
                    bVar7.f2153p = -1;
                    bVar7.f2157r = -1;
                    bVar7.f2158s = -1;
                    bVar7.f2159t = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                }
                b bVar8 = aVar.f2080e;
                bVar8.f2153p = i12;
                bVar8.f2155q = -1;
                bVar8.f2157r = -1;
                bVar8.f2158s = -1;
                bVar8.f2159t = -1;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f2080e;
                    bVar9.f2157r = i12;
                    bVar9.f2155q = -1;
                    bVar9.f2153p = -1;
                    bVar9.f2149n = -1;
                    bVar9.f2151o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f2080e;
                    bVar10.f2158s = i12;
                    bVar10.f2155q = -1;
                    bVar10.f2153p = -1;
                    bVar10.f2149n = -1;
                    bVar10.f2151o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                }
                b bVar11 = aVar.f2080e;
                bVar11.f2159t = i12;
                bVar11.f2155q = -1;
                bVar11.f2153p = -1;
                bVar11.f2149n = -1;
                bVar11.f2151o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f2080e;
                    bVar12.f2161v = i12;
                    bVar12.f2160u = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f2080e;
                    bVar13.f2160u = i12;
                    bVar13.f2161v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f2080e;
                    bVar14.f2163x = i12;
                    bVar14.f2162w = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f2080e;
                    bVar15.f2162w = i12;
                    bVar15.f2163x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m2505H(i11) + " to " + m2505H(i13) + " unknown");
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2512i(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f2075f.containsKey(Integer.valueOf(i10))) {
            this.f2075f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f2075f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f2080e;
                    bVar.f2141j = i12;
                    bVar.f2143k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + m2505H(i13) + " undefined");
                    }
                    b bVar2 = aVar.f2080e;
                    bVar2.f2143k = i12;
                    bVar2.f2141j = -1;
                }
                aVar.f2080e.f2104H = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f2080e;
                    bVar3.f2145l = i12;
                    bVar3.f2147m = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                    }
                    b bVar4 = aVar.f2080e;
                    bVar4.f2147m = i12;
                    bVar4.f2145l = -1;
                }
                aVar.f2080e.f2105I = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f2080e;
                    bVar5.f2149n = i12;
                    bVar5.f2151o = -1;
                    bVar5.f2157r = -1;
                    bVar5.f2158s = -1;
                    bVar5.f2159t = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                    }
                    b bVar6 = aVar.f2080e;
                    bVar6.f2151o = i12;
                    bVar6.f2149n = -1;
                    bVar6.f2157r = -1;
                    bVar6.f2158s = -1;
                    bVar6.f2159t = -1;
                }
                aVar.f2080e.f2106J = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f2080e;
                    bVar7.f2155q = i12;
                    bVar7.f2153p = -1;
                    bVar7.f2157r = -1;
                    bVar7.f2158s = -1;
                    bVar7.f2159t = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                    }
                    b bVar8 = aVar.f2080e;
                    bVar8.f2153p = i12;
                    bVar8.f2155q = -1;
                    bVar8.f2157r = -1;
                    bVar8.f2158s = -1;
                    bVar8.f2159t = -1;
                }
                aVar.f2080e.f2107K = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f2080e;
                    bVar9.f2157r = i12;
                    bVar9.f2155q = -1;
                    bVar9.f2153p = -1;
                    bVar9.f2149n = -1;
                    bVar9.f2151o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f2080e;
                    bVar10.f2158s = i12;
                    bVar10.f2155q = -1;
                    bVar10.f2153p = -1;
                    bVar10.f2149n = -1;
                    bVar10.f2151o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                }
                b bVar11 = aVar.f2080e;
                bVar11.f2159t = i12;
                bVar11.f2155q = -1;
                bVar11.f2153p = -1;
                bVar11.f2149n = -1;
                bVar11.f2151o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f2080e;
                    bVar12.f2161v = i12;
                    bVar12.f2160u = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                    }
                    b bVar13 = aVar.f2080e;
                    bVar13.f2160u = i12;
                    bVar13.f2161v = -1;
                }
                aVar.f2080e.f2109M = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f2080e;
                    bVar14.f2163x = i12;
                    bVar14.f2162w = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + m2505H(i13) + " undefined");
                    }
                    b bVar15 = aVar.f2080e;
                    bVar15.f2162w = i12;
                    bVar15.f2163x = -1;
                }
                aVar.f2080e.f2108L = i14;
                return;
            default:
                throw new IllegalArgumentException(m2505H(i11) + " to " + m2505H(i13) + " unknown");
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2513j(int i10, int i11, int i12, float f10) {
        b bVar = m2522s(i10).f2080e;
        bVar.f2098B = i11;
        bVar.f2099C = i12;
        bVar.f2100D = f10;
    }

    /* JADX INFO: renamed from: k */
    public void m2514k(int i10, int i11) {
        m2522s(i10).f2080e.f2122Z = i11;
    }

    /* JADX INFO: renamed from: l */
    public void m2515l(int i10, int i11) {
        m2522s(i10).f2080e.f2131e = i11;
    }

    /* JADX INFO: renamed from: m */
    public void m2516m(int i10, int i11) {
        m2522s(i10).f2080e.f2129d = i11;
    }

    /* JADX INFO: renamed from: n */
    public void m2517n(int i10, boolean z10) {
        m2522s(i10).f2080e.f2152o0 = z10;
    }

    /* JADX INFO: renamed from: o */
    public void m2518o(int i10, boolean z10) {
        m2522s(i10).f2080e.f2150n0 = z10;
    }

    /* JADX INFO: renamed from: p */
    public final int[] m2519p(View view, String str) {
        int iIntValue;
        Object objM2454l;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = C5968c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM2454l = ((ConstraintLayout) view.getParent()).m2454l(0, strTrim)) != null && (objM2454l instanceof Integer)) {
                iIntValue = ((Integer) objM2454l).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    /* JADX INFO: renamed from: q */
    public void m2520q(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            m2522s(iArr[0]).f2080e.f2118V = fArr[0];
        }
        m2522s(iArr[0]).f2080e.f2121Y = i14;
        m2512i(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            m2512i(iArr[i15], 3, iArr[i16], 4, 0);
            m2512i(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                m2522s(iArr[i15]).f2080e.f2118V = fArr[i15];
            }
        }
        m2512i(iArr[iArr.length - 1], 4, i12, i13, 0);
    }

    /* JADX INFO: renamed from: r */
    public final a m2521r(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? C5969d.f22933S2 : C5969d.f23003b);
        m2525z(aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: s */
    public final a m2522s(int i10) {
        if (!this.f2075f.containsKey(Integer.valueOf(i10))) {
            this.f2075f.put(Integer.valueOf(i10), new a());
        }
        return this.f2075f.get(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: t */
    public void m2523t(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM2521r = m2521r(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM2521r.f2080e.f2123a = true;
                    }
                    this.f2075f.put(Integer.valueOf(aVarM2521r.f2076a), aVarM2521r);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public void m2524u(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarM2521r = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarM2521r == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarM2521r.f2080e.m2539b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarM2521r == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarM2521r.f2079d.m2541b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarM2521r = m2521r(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarM2521r == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarM2521r.f2078c.m2543b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarM2521r == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarM2521r.f2081f.m2545b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarM2521r = m2521r(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarM2521r.f2080e;
                                bVar.f2123a = true;
                                bVar.f2125b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarM2521r = m2521r(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarM2521r.f2080e.f2142j0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarM2521r = m2521r(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarM2521r == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    C0516a.m2472d(context, xmlPullParser, aVarM2521r.f2082g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f2075f.put(Integer.valueOf(aVarM2521r.f2076a), aVarM2521r);
                    aVarM2521r = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing XML resource", e11);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2525z(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            m2492A(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != C5969d.f23021d && C5969d.f23178v != index && C5969d.f23186w != index) {
                aVar.f2079d.f2167a = true;
                aVar.f2080e.f2125b = true;
                aVar.f2078c.f2181a = true;
                aVar.f2081f.f2187a = true;
            }
            switch (f2068h.get(index)) {
                case 1:
                    b bVar = aVar.f2080e;
                    bVar.f2157r = m2495v(typedArray, index, bVar.f2157r);
                    break;
                case 2:
                    b bVar2 = aVar.f2080e;
                    bVar2.f2107K = typedArray.getDimensionPixelSize(index, bVar2.f2107K);
                    break;
                case 3:
                    b bVar3 = aVar.f2080e;
                    bVar3.f2155q = m2495v(typedArray, index, bVar3.f2155q);
                    break;
                case 4:
                    b bVar4 = aVar.f2080e;
                    bVar4.f2153p = m2495v(typedArray, index, bVar4.f2153p);
                    break;
                case 5:
                    aVar.f2080e.f2097A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f2080e;
                    bVar5.f2101E = typedArray.getDimensionPixelOffset(index, bVar5.f2101E);
                    break;
                case 7:
                    b bVar6 = aVar.f2080e;
                    bVar6.f2102F = typedArray.getDimensionPixelOffset(index, bVar6.f2102F);
                    break;
                case 8:
                    b bVar7 = aVar.f2080e;
                    bVar7.f2108L = typedArray.getDimensionPixelSize(index, bVar7.f2108L);
                    break;
                case 9:
                    b bVar8 = aVar.f2080e;
                    bVar8.f2163x = m2495v(typedArray, index, bVar8.f2163x);
                    break;
                case 10:
                    b bVar9 = aVar.f2080e;
                    bVar9.f2162w = m2495v(typedArray, index, bVar9.f2162w);
                    break;
                case 11:
                    b bVar10 = aVar.f2080e;
                    bVar10.f2114R = typedArray.getDimensionPixelSize(index, bVar10.f2114R);
                    break;
                case 12:
                    b bVar11 = aVar.f2080e;
                    bVar11.f2115S = typedArray.getDimensionPixelSize(index, bVar11.f2115S);
                    break;
                case 13:
                    b bVar12 = aVar.f2080e;
                    bVar12.f2111O = typedArray.getDimensionPixelSize(index, bVar12.f2111O);
                    break;
                case 14:
                    b bVar13 = aVar.f2080e;
                    bVar13.f2113Q = typedArray.getDimensionPixelSize(index, bVar13.f2113Q);
                    break;
                case 15:
                    b bVar14 = aVar.f2080e;
                    bVar14.f2116T = typedArray.getDimensionPixelSize(index, bVar14.f2116T);
                    break;
                case 16:
                    b bVar15 = aVar.f2080e;
                    bVar15.f2112P = typedArray.getDimensionPixelSize(index, bVar15.f2112P);
                    break;
                case 17:
                    b bVar16 = aVar.f2080e;
                    bVar16.f2133f = typedArray.getDimensionPixelOffset(index, bVar16.f2133f);
                    break;
                case 18:
                    b bVar17 = aVar.f2080e;
                    bVar17.f2135g = typedArray.getDimensionPixelOffset(index, bVar17.f2135g);
                    break;
                case 19:
                    b bVar18 = aVar.f2080e;
                    bVar18.f2137h = typedArray.getFloat(index, bVar18.f2137h);
                    break;
                case 20:
                    b bVar19 = aVar.f2080e;
                    bVar19.f2164y = typedArray.getFloat(index, bVar19.f2164y);
                    break;
                case 21:
                    b bVar20 = aVar.f2080e;
                    bVar20.f2131e = typedArray.getLayoutDimension(index, bVar20.f2131e);
                    break;
                case 22:
                    d dVar = aVar.f2078c;
                    dVar.f2182b = typedArray.getInt(index, dVar.f2182b);
                    d dVar2 = aVar.f2078c;
                    dVar2.f2182b = f2067g[dVar2.f2182b];
                    break;
                case 23:
                    b bVar21 = aVar.f2080e;
                    bVar21.f2129d = typedArray.getLayoutDimension(index, bVar21.f2129d);
                    break;
                case 24:
                    b bVar22 = aVar.f2080e;
                    bVar22.f2104H = typedArray.getDimensionPixelSize(index, bVar22.f2104H);
                    break;
                case 25:
                    b bVar23 = aVar.f2080e;
                    bVar23.f2141j = m2495v(typedArray, index, bVar23.f2141j);
                    break;
                case 26:
                    b bVar24 = aVar.f2080e;
                    bVar24.f2143k = m2495v(typedArray, index, bVar24.f2143k);
                    break;
                case 27:
                    b bVar25 = aVar.f2080e;
                    bVar25.f2103G = typedArray.getInt(index, bVar25.f2103G);
                    break;
                case 28:
                    b bVar26 = aVar.f2080e;
                    bVar26.f2105I = typedArray.getDimensionPixelSize(index, bVar26.f2105I);
                    break;
                case 29:
                    b bVar27 = aVar.f2080e;
                    bVar27.f2145l = m2495v(typedArray, index, bVar27.f2145l);
                    break;
                case 30:
                    b bVar28 = aVar.f2080e;
                    bVar28.f2147m = m2495v(typedArray, index, bVar28.f2147m);
                    break;
                case 31:
                    b bVar29 = aVar.f2080e;
                    bVar29.f2109M = typedArray.getDimensionPixelSize(index, bVar29.f2109M);
                    break;
                case 32:
                    b bVar30 = aVar.f2080e;
                    bVar30.f2160u = m2495v(typedArray, index, bVar30.f2160u);
                    break;
                case 33:
                    b bVar31 = aVar.f2080e;
                    bVar31.f2161v = m2495v(typedArray, index, bVar31.f2161v);
                    break;
                case 34:
                    b bVar32 = aVar.f2080e;
                    bVar32.f2106J = typedArray.getDimensionPixelSize(index, bVar32.f2106J);
                    break;
                case 35:
                    b bVar33 = aVar.f2080e;
                    bVar33.f2151o = m2495v(typedArray, index, bVar33.f2151o);
                    break;
                case 36:
                    b bVar34 = aVar.f2080e;
                    bVar34.f2149n = m2495v(typedArray, index, bVar34.f2149n);
                    break;
                case 37:
                    b bVar35 = aVar.f2080e;
                    bVar35.f2165z = typedArray.getFloat(index, bVar35.f2165z);
                    break;
                case 38:
                    aVar.f2076a = typedArray.getResourceId(index, aVar.f2076a);
                    break;
                case 39:
                    b bVar36 = aVar.f2080e;
                    bVar36.f2119W = typedArray.getFloat(index, bVar36.f2119W);
                    break;
                case 40:
                    b bVar37 = aVar.f2080e;
                    bVar37.f2118V = typedArray.getFloat(index, bVar37.f2118V);
                    break;
                case 41:
                    b bVar38 = aVar.f2080e;
                    bVar38.f2120X = typedArray.getInt(index, bVar38.f2120X);
                    break;
                case 42:
                    b bVar39 = aVar.f2080e;
                    bVar39.f2121Y = typedArray.getInt(index, bVar39.f2121Y);
                    break;
                case 43:
                    d dVar3 = aVar.f2078c;
                    dVar3.f2184d = typedArray.getFloat(index, dVar3.f2184d);
                    break;
                case 44:
                    e eVar = aVar.f2081f;
                    eVar.f2199m = true;
                    eVar.f2200n = typedArray.getDimension(index, eVar.f2200n);
                    break;
                case 45:
                    e eVar2 = aVar.f2081f;
                    eVar2.f2189c = typedArray.getFloat(index, eVar2.f2189c);
                    break;
                case 46:
                    e eVar3 = aVar.f2081f;
                    eVar3.f2190d = typedArray.getFloat(index, eVar3.f2190d);
                    break;
                case 47:
                    e eVar4 = aVar.f2081f;
                    eVar4.f2191e = typedArray.getFloat(index, eVar4.f2191e);
                    break;
                case 48:
                    e eVar5 = aVar.f2081f;
                    eVar5.f2192f = typedArray.getFloat(index, eVar5.f2192f);
                    break;
                case 49:
                    e eVar6 = aVar.f2081f;
                    eVar6.f2193g = typedArray.getDimension(index, eVar6.f2193g);
                    break;
                case 50:
                    e eVar7 = aVar.f2081f;
                    eVar7.f2194h = typedArray.getDimension(index, eVar7.f2194h);
                    break;
                case 51:
                    e eVar8 = aVar.f2081f;
                    eVar8.f2196j = typedArray.getDimension(index, eVar8.f2196j);
                    break;
                case 52:
                    e eVar9 = aVar.f2081f;
                    eVar9.f2197k = typedArray.getDimension(index, eVar9.f2197k);
                    break;
                case 53:
                    e eVar10 = aVar.f2081f;
                    eVar10.f2198l = typedArray.getDimension(index, eVar10.f2198l);
                    break;
                case 54:
                    b bVar40 = aVar.f2080e;
                    bVar40.f2122Z = typedArray.getInt(index, bVar40.f2122Z);
                    break;
                case 55:
                    b bVar41 = aVar.f2080e;
                    bVar41.f2124a0 = typedArray.getInt(index, bVar41.f2124a0);
                    break;
                case 56:
                    b bVar42 = aVar.f2080e;
                    bVar42.f2126b0 = typedArray.getDimensionPixelSize(index, bVar42.f2126b0);
                    break;
                case 57:
                    b bVar43 = aVar.f2080e;
                    bVar43.f2128c0 = typedArray.getDimensionPixelSize(index, bVar43.f2128c0);
                    break;
                case 58:
                    b bVar44 = aVar.f2080e;
                    bVar44.f2130d0 = typedArray.getDimensionPixelSize(index, bVar44.f2130d0);
                    break;
                case 59:
                    b bVar45 = aVar.f2080e;
                    bVar45.f2132e0 = typedArray.getDimensionPixelSize(index, bVar45.f2132e0);
                    break;
                case 60:
                    e eVar11 = aVar.f2081f;
                    eVar11.f2188b = typedArray.getFloat(index, eVar11.f2188b);
                    break;
                case 61:
                    b bVar46 = aVar.f2080e;
                    bVar46.f2098B = m2495v(typedArray, index, bVar46.f2098B);
                    break;
                case 62:
                    b bVar47 = aVar.f2080e;
                    bVar47.f2099C = typedArray.getDimensionPixelSize(index, bVar47.f2099C);
                    break;
                case 63:
                    b bVar48 = aVar.f2080e;
                    bVar48.f2100D = typedArray.getFloat(index, bVar48.f2100D);
                    break;
                case 64:
                    c cVar = aVar.f2079d;
                    cVar.f2168b = m2495v(typedArray, index, cVar.f2168b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2079d.f2170d = typedArray.getString(index);
                    } else {
                        aVar.f2079d.f2170d = C0057b.f114c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f2079d.f2172f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f2079d;
                    cVar2.f2175i = typedArray.getFloat(index, cVar2.f2175i);
                    break;
                case 68:
                    d dVar4 = aVar.f2078c;
                    dVar4.f2185e = typedArray.getFloat(index, dVar4.f2185e);
                    break;
                case 69:
                    aVar.f2080e.f2134f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2080e.f2136g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f2080e;
                    bVar49.f2138h0 = typedArray.getInt(index, bVar49.f2138h0);
                    break;
                case 73:
                    b bVar50 = aVar.f2080e;
                    bVar50.f2140i0 = typedArray.getDimensionPixelSize(index, bVar50.f2140i0);
                    break;
                case 74:
                    aVar.f2080e.f2146l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f2080e;
                    bVar51.f2154p0 = typedArray.getBoolean(index, bVar51.f2154p0);
                    break;
                case 76:
                    c cVar3 = aVar.f2079d;
                    cVar3.f2171e = typedArray.getInt(index, cVar3.f2171e);
                    break;
                case 77:
                    aVar.f2080e.f2148m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f2078c;
                    dVar5.f2183c = typedArray.getInt(index, dVar5.f2183c);
                    break;
                case 79:
                    c cVar4 = aVar.f2079d;
                    cVar4.f2173g = typedArray.getFloat(index, cVar4.f2173g);
                    break;
                case 80:
                    b bVar52 = aVar.f2080e;
                    bVar52.f2150n0 = typedArray.getBoolean(index, bVar52.f2150n0);
                    break;
                case 81:
                    b bVar53 = aVar.f2080e;
                    bVar53.f2152o0 = typedArray.getBoolean(index, bVar53.f2152o0);
                    break;
                case 82:
                    c cVar5 = aVar.f2079d;
                    cVar5.f2169c = typedArray.getInteger(index, cVar5.f2169c);
                    break;
                case 83:
                    e eVar12 = aVar.f2081f;
                    eVar12.f2195i = m2495v(typedArray, index, eVar12.f2195i);
                    break;
                case 84:
                    c cVar6 = aVar.f2079d;
                    cVar6.f2177k = typedArray.getInteger(index, cVar6.f2177k);
                    break;
                case 85:
                    c cVar7 = aVar.f2079d;
                    cVar7.f2176j = typedArray.getFloat(index, cVar7.f2176j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2079d.f2180n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f2079d;
                        if (cVar8.f2180n != -1) {
                            cVar8.f2179m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f2079d.f2178l = typedArray.getString(index);
                        if (aVar.f2079d.f2178l.indexOf("/") > 0) {
                            aVar.f2079d.f2180n = typedArray.getResourceId(index, -1);
                            aVar.f2079d.f2179m = -2;
                        } else {
                            aVar.f2079d.f2179m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f2079d;
                        cVar9.f2179m = typedArray.getInteger(index, cVar9.f2180n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2068h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2068h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f2080e;
                    bVar54.f2158s = m2495v(typedArray, index, bVar54.f2158s);
                    break;
                case 92:
                    b bVar55 = aVar.f2080e;
                    bVar55.f2159t = m2495v(typedArray, index, bVar55.f2159t);
                    break;
                case 93:
                    b bVar56 = aVar.f2080e;
                    bVar56.f2110N = typedArray.getDimensionPixelSize(index, bVar56.f2110N);
                    break;
                case 94:
                    b bVar57 = aVar.f2080e;
                    bVar57.f2117U = typedArray.getDimensionPixelSize(index, bVar57.f2117U);
                    break;
                case 95:
                    m2496w(aVar.f2080e, typedArray, index, 0);
                    break;
                case 96:
                    m2496w(aVar.f2080e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f2080e;
                    bVar58.f2156q0 = typedArray.getInt(index, bVar58.f2156q0);
                    break;
            }
        }
        b bVar59 = aVar.f2080e;
        if (bVar59.f2146l0 != null) {
            bVar59.f2144k0 = null;
        }
    }
}
