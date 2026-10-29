package p509w7;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.p336ws.RealWebSocket;

/* JADX INFO: renamed from: w7.h */
/* JADX INFO: loaded from: classes.dex */
public class C12320h {

    /* JADX INFO: renamed from: i */
    public static HashSet<String> f43970i;

    /* JADX INFO: renamed from: a */
    public Canvas f43971a;

    /* JADX INFO: renamed from: b */
    public float f43972b;

    /* JADX INFO: renamed from: c */
    public C12319g f43973c;

    /* JADX INFO: renamed from: d */
    public h f43974d;

    /* JADX INFO: renamed from: e */
    public Stack<h> f43975e;

    /* JADX INFO: renamed from: f */
    public Stack<C12319g.j0> f43976f;

    /* JADX INFO: renamed from: g */
    public Stack<Matrix> f43977g;

    /* JADX INFO: renamed from: h */
    public C12314b.q f43978h = null;

    /* JADX INFO: renamed from: w7.h$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43979a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f43980b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f43981c;

        static {
            int[] iArr = new int[C12319g.e0.d.values().length];
            f43981c = iArr;
            try {
                iArr[C12319g.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43981c[C12319g.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43981c[C12319g.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C12319g.e0.c.values().length];
            f43980b = iArr2;
            try {
                iArr2[C12319g.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43980b[C12319g.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43980b[C12319g.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[C12317e.a.values().length];
            f43979a = iArr3;
            try {
                iArr3[C12317e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43979a[C12317e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43979a[C12317e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43979a[C12317e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43979a[C12317e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43979a[C12317e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f43979a[C12317e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f43979a[C12317e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: renamed from: w7.h$b */
    public class b implements C12319g.x {

        /* JADX INFO: renamed from: b */
        public float f43983b;

        /* JADX INFO: renamed from: c */
        public float f43984c;

        /* JADX INFO: renamed from: h */
        public boolean f43989h;

        /* JADX INFO: renamed from: a */
        public List<c> f43982a = new ArrayList();

        /* JADX INFO: renamed from: d */
        public c f43985d = null;

        /* JADX INFO: renamed from: e */
        public boolean f43986e = false;

        /* JADX INFO: renamed from: f */
        public boolean f43987f = true;

        /* JADX INFO: renamed from: g */
        public int f43988g = -1;

        public b(C12319g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.m45901h(this);
            if (this.f43989h) {
                this.f43985d.m46010b(this.f43982a.get(this.f43988g));
                this.f43982a.set(this.f43988g, this.f43985d);
                this.f43989h = false;
            }
            c cVar = this.f43985d;
            if (cVar != null) {
                this.f43982a.add(cVar);
            }
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: a */
        public void mo45894a(float f10, float f11, float f12, float f13) {
            this.f43985d.m46009a(f10, f11);
            this.f43982a.add(this.f43985d);
            this.f43985d = C12320h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f43989h = false;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: b */
        public void mo45895b(float f10, float f11) {
            if (this.f43989h) {
                this.f43985d.m46010b(this.f43982a.get(this.f43988g));
                this.f43982a.set(this.f43988g, this.f43985d);
                this.f43989h = false;
            }
            c cVar = this.f43985d;
            if (cVar != null) {
                this.f43982a.add(cVar);
            }
            this.f43983b = f10;
            this.f43984c = f11;
            this.f43985d = C12320h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f43988g = this.f43982a.size();
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: c */
        public void mo45896c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f43987f || this.f43986e) {
                this.f43985d.m46009a(f10, f11);
                this.f43982a.add(this.f43985d);
                this.f43986e = false;
            }
            this.f43985d = C12320h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f43989h = false;
        }

        @Override // p509w7.C12319g.x
        public void close() {
            this.f43982a.add(this.f43985d);
            mo45898e(this.f43983b, this.f43984c);
            this.f43989h = true;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: d */
        public void mo45897d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f43986e = true;
            this.f43987f = false;
            c cVar = this.f43985d;
            C12320h.m45914h(cVar.f43991a, cVar.f43992b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f43987f = true;
            this.f43989h = false;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: e */
        public void mo45898e(float f10, float f11) {
            this.f43985d.m46009a(f10, f11);
            this.f43982a.add(this.f43985d);
            C12320h c12320h = C12320h.this;
            c cVar = this.f43985d;
            this.f43985d = c12320h.new c(f10, f11, f10 - cVar.f43991a, f11 - cVar.f43992b);
            this.f43989h = false;
        }

        /* JADX INFO: renamed from: f */
        public List<c> m46008f() {
            return this.f43982a;
        }
    }

    /* JADX INFO: renamed from: w7.h$c */
    public class c {

        /* JADX INFO: renamed from: a */
        public float f43991a;

        /* JADX INFO: renamed from: b */
        public float f43992b;

        /* JADX INFO: renamed from: c */
        public float f43993c;

        /* JADX INFO: renamed from: d */
        public float f43994d;

        /* JADX INFO: renamed from: e */
        public boolean f43995e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f43993c = 0.0f;
            this.f43994d = 0.0f;
            this.f43991a = f10;
            this.f43992b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f43993c = (float) (((double) f12) / dSqrt);
                this.f43994d = (float) (((double) f13) / dSqrt);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m46009a(float f10, float f11) {
            float f12 = f10 - this.f43991a;
            float f13 = f11 - this.f43992b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f43993c;
            if (f12 != (-f14) || f13 != (-this.f43994d)) {
                this.f43993c = f14 + f12;
                this.f43994d += f13;
            } else {
                this.f43995e = true;
                this.f43993c = -f13;
                this.f43994d = f12;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m46010b(c cVar) {
            float f10 = cVar.f43993c;
            float f11 = this.f43993c;
            if (f10 == (-f11)) {
                float f12 = cVar.f43994d;
                if (f12 == (-this.f43994d)) {
                    this.f43995e = true;
                    this.f43993c = -f12;
                    this.f43994d = cVar.f43993c;
                    return;
                }
            }
            this.f43993c = f11 + f10;
            this.f43994d += cVar.f43994d;
        }

        public String toString() {
            return "(" + this.f43991a + "," + this.f43992b + " " + this.f43993c + "," + this.f43994d + ")";
        }
    }

    /* JADX INFO: renamed from: w7.h$d */
    public class d implements C12319g.x {

        /* JADX INFO: renamed from: a */
        public Path f43997a = new Path();

        /* JADX INFO: renamed from: b */
        public float f43998b;

        /* JADX INFO: renamed from: c */
        public float f43999c;

        public d(C12319g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.m45901h(this);
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: a */
        public void mo45894a(float f10, float f11, float f12, float f13) {
            this.f43997a.quadTo(f10, f11, f12, f13);
            this.f43998b = f12;
            this.f43999c = f13;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: b */
        public void mo45895b(float f10, float f11) {
            this.f43997a.moveTo(f10, f11);
            this.f43998b = f10;
            this.f43999c = f11;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: c */
        public void mo45896c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f43997a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f43998b = f14;
            this.f43999c = f15;
        }

        @Override // p509w7.C12319g.x
        public void close() {
            this.f43997a.close();
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: d */
        public void mo45897d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            C12320h.m45914h(this.f43998b, this.f43999c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f43998b = f13;
            this.f43999c = f14;
        }

        @Override // p509w7.C12319g.x
        /* JADX INFO: renamed from: e */
        public void mo45898e(float f10, float f11) {
            this.f43997a.lineTo(f10, f11);
            this.f43998b = f10;
            this.f43999c = f11;
        }

        /* JADX INFO: renamed from: f */
        public Path m46011f() {
            return this.f43997a;
        }
    }

    /* JADX INFO: renamed from: w7.h$e */
    public class e extends f {

        /* JADX INFO: renamed from: e */
        public Path f44001e;

        public e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f44001e = path;
        }

        @Override // p509w7.C12320h.f, p509w7.C12320h.j
        /* JADX INFO: renamed from: b */
        public void mo46012b(String str) {
            String str2;
            if (C12320h.this.m45967Y0()) {
                if (C12320h.this.f43974d.f44011b) {
                    str2 = str;
                    C12320h.this.f43971a.drawTextOnPath(str2, this.f44001e, this.f44003b, this.f44004c, C12320h.this.f43974d.f44013d);
                } else {
                    str2 = str;
                }
                if (C12320h.this.f43974d.f44012c) {
                    C12320h.this.f43971a.drawTextOnPath(str2, this.f44001e, this.f44003b, this.f44004c, C12320h.this.f43974d.f44014e);
                }
            } else {
                str2 = str;
            }
            this.f44003b += C12320h.this.f43974d.f44013d.measureText(str2);
        }
    }

    /* JADX INFO: renamed from: w7.h$f */
    public class f extends j {

        /* JADX INFO: renamed from: b */
        public float f44003b;

        /* JADX INFO: renamed from: c */
        public float f44004c;

        public f(float f10, float f11) {
            super(C12320h.this, null);
            this.f44003b = f10;
            this.f44004c = f11;
        }

        @Override // p509w7.C12320h.j
        /* JADX INFO: renamed from: b */
        public void mo46012b(String str) {
            C12320h.m45919y("TextSequence render", new Object[0]);
            if (C12320h.this.m45967Y0()) {
                if (C12320h.this.f43974d.f44011b) {
                    C12320h.this.f43971a.drawText(str, this.f44003b, this.f44004c, C12320h.this.f43974d.f44013d);
                }
                if (C12320h.this.f43974d.f44012c) {
                    C12320h.this.f43971a.drawText(str, this.f44003b, this.f44004c, C12320h.this.f43974d.f44014e);
                }
            }
            this.f44003b += C12320h.this.f43974d.f44013d.measureText(str);
        }
    }

    /* JADX INFO: renamed from: w7.h$g */
    public class g extends j {

        /* JADX INFO: renamed from: b */
        public float f44006b;

        /* JADX INFO: renamed from: c */
        public float f44007c;

        /* JADX INFO: renamed from: d */
        public Path f44008d;

        public g(float f10, float f11, Path path) {
            super(C12320h.this, null);
            this.f44006b = f10;
            this.f44007c = f11;
            this.f44008d = path;
        }

        @Override // p509w7.C12320h.j
        /* JADX INFO: renamed from: a */
        public boolean mo46013a(C12319g.y0 y0Var) {
            if (!(y0Var instanceof C12319g.z0)) {
                return true;
            }
            C12320h.m45906Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // p509w7.C12320h.j
        /* JADX INFO: renamed from: b */
        public void mo46012b(String str) {
            String str2;
            if (C12320h.this.m45967Y0()) {
                Path path = new Path();
                str2 = str;
                C12320h.this.f43974d.f44013d.getTextPath(str2, 0, str.length(), this.f44006b, this.f44007c, path);
                this.f44008d.addPath(path);
            } else {
                str2 = str;
            }
            this.f44006b += C12320h.this.f43974d.f44013d.measureText(str2);
        }
    }

    /* JADX INFO: renamed from: w7.h$i */
    public class i extends j {

        /* JADX INFO: renamed from: b */
        public float f44019b;

        /* JADX INFO: renamed from: c */
        public float f44020c;

        /* JADX INFO: renamed from: d */
        public RectF f44021d;

        public i(float f10, float f11) {
            super(C12320h.this, null);
            this.f44021d = new RectF();
            this.f44019b = f10;
            this.f44020c = f11;
        }

        @Override // p509w7.C12320h.j
        /* JADX INFO: renamed from: a */
        public boolean mo46013a(C12319g.y0 y0Var) {
            if (!(y0Var instanceof C12319g.z0)) {
                return true;
            }
            C12319g.z0 z0Var = (C12319g.z0) y0Var;
            C12319g.n0 n0VarM45855p = y0Var.f43913a.m45855p(z0Var.f43967o);
            if (n0VarM45855p == null) {
                C12320h.m45904F("TextPath path reference '%s' not found", z0Var.f43967o);
                return false;
            }
            C12319g.v vVar = (C12319g.v) n0VarM45855p;
            Path pathM46011f = C12320h.this.new d(vVar.f43950o).m46011f();
            Matrix matrix = vVar.f43902n;
            if (matrix != null) {
                pathM46011f.transform(matrix);
            }
            RectF rectF = new RectF();
            pathM46011f.computeBounds(rectF, true);
            this.f44021d.union(rectF);
            return false;
        }

        @Override // p509w7.C12320h.j
        /* JADX INFO: renamed from: b */
        public void mo46012b(String str) {
            if (C12320h.this.m45967Y0()) {
                Rect rect = new Rect();
                C12320h.this.f43974d.f44013d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f44019b, this.f44020c);
                this.f44021d.union(rectF);
            }
            this.f44019b += C12320h.this.f43974d.f44013d.measureText(str);
        }
    }

    /* JADX INFO: renamed from: w7.h$j */
    public abstract class j {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public j() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo46013a(C12319g.y0 y0Var) {
            return true;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo46012b(String str);

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 w7.h) A[MD:(w7.h):void (m)] (LINE:2) call: w7.h.j.<init>(w7.h):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ j(C12320h c12320h, a aVar) {
            this();
        }
    }

    public C12320h(Canvas canvas, float f10) {
        this.f43971a = canvas;
        this.f43972b = f10;
    }

    /* JADX INFO: renamed from: F */
    public static void m45904F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX INFO: renamed from: V */
    public static synchronized void m45905V() {
        HashSet<String> hashSet = new HashSet<>();
        f43970i = hashSet;
        hashSet.add("Structure");
        f43970i.add("BasicStructure");
        f43970i.add("ConditionalProcessing");
        f43970i.add("Image");
        f43970i.add("Style");
        f43970i.add("ViewportAttribute");
        f43970i.add("Shape");
        f43970i.add("BasicText");
        f43970i.add("PaintAttribute");
        f43970i.add("BasicPaintAttribute");
        f43970i.add("OpacityAttribute");
        f43970i.add("BasicGraphicsAttribute");
        f43970i.add("Marker");
        f43970i.add("Gradient");
        f43970i.add("Pattern");
        f43970i.add("Clip");
        f43970i.add("BasicClip");
        f43970i.add("Mask");
        f43970i.add("View");
    }

    /* JADX INFO: renamed from: Z0 */
    public static void m45906Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX INFO: renamed from: h */
    public static void m45914h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, C12319g.x xVar) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            xVar.mo45898e(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (dCos * d11);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = (-((d25 * d12) / d24)) * dSqrt2;
        double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dM45916v = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * m45916v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && dM45916v > 0.0d) {
            dM45916v -= 6.283185307179586d;
        } else if (z11 && dM45916v < 0.0d) {
            dM45916v += 6.283185307179586d;
        }
        float[] fArrM45915i = m45915i(dAcos % 6.283185307179586d, dM45916v % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrM45915i);
        fArrM45915i[fArrM45915i.length - 2] = f15;
        fArrM45915i[fArrM45915i.length - 1] = f16;
        for (int i10 = 0; i10 < fArrM45915i.length; i10 += 6) {
            xVar.mo45896c(fArrM45915i[i10], fArrM45915i[i10 + 1], fArrM45915i[i10 + 2], fArrM45915i[i10 + 3], fArrM45915i[i10 + 4], fArrM45915i[i10 + 5]);
        }
    }

    /* JADX INFO: renamed from: i */
    public static float[] m45915i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d14 = d10 + (((double) i10) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: v */
    public static double m45916v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    /* JADX INFO: renamed from: w */
    public static int m45917w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    /* JADX INFO: renamed from: x */
    public static int m45918x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }

    /* JADX INFO: renamed from: y */
    public static void m45919y(String str, Object... objArr) {
    }

    /* JADX INFO: renamed from: A */
    public final boolean m45920A() {
        Boolean bool = this.f43974d.f44010a.f43789A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m45921A0(C12319g.n0 n0Var) {
        if (n0Var instanceof C12319g.t) {
            return;
        }
        m45956S0();
        m46000u(n0Var);
        if (n0Var instanceof C12319g.f0) {
            m46004x0((C12319g.f0) n0Var);
        } else if (n0Var instanceof C12319g.e1) {
            m45929E0((C12319g.e1) n0Var);
        } else if (n0Var instanceof C12319g.s0) {
            m45923B0((C12319g.s0) n0Var);
        } else if (n0Var instanceof C12319g.m) {
            m45993q0((C12319g.m) n0Var);
        } else if (n0Var instanceof C12319g.o) {
            m45995r0((C12319g.o) n0Var);
        } else if (n0Var instanceof C12319g.v) {
            m45999t0((C12319g.v) n0Var);
        } else if (n0Var instanceof C12319g.b0) {
            m46003w0((C12319g.b0) n0Var);
        } else if (n0Var instanceof C12319g.d) {
            m45989o0((C12319g.d) n0Var);
        } else if (n0Var instanceof C12319g.i) {
            m45991p0((C12319g.i) n0Var);
        } else if (n0Var instanceof C12319g.q) {
            m45997s0((C12319g.q) n0Var);
        } else if (n0Var instanceof C12319g.a0) {
            m46002v0((C12319g.a0) n0Var);
        } else if (n0Var instanceof C12319g.z) {
            m46001u0((C12319g.z) n0Var);
        } else if (n0Var instanceof C12319g.w0) {
            m45927D0((C12319g.w0) n0Var);
        }
        m45954R0();
    }

    /* JADX INFO: renamed from: B */
    public final void m45922B(C12319g.k0 k0Var, Path path) {
        C12319g.o0 o0Var = this.f43974d.f44010a.f43803b;
        if (o0Var instanceof C12319g.u) {
            C12319g.n0 n0VarM45855p = this.f43973c.m45855p(((C12319g.u) o0Var).f43946a);
            if (n0VarM45855p instanceof C12319g.y) {
                m45941L(k0Var, path, (C12319g.y) n0VarM45855p);
                return;
            }
        }
        this.f43971a.drawPath(path, this.f43974d.f44013d);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m45923B0(C12319g.s0 s0Var) {
        m45919y("Switch render", new Object[0]);
        m45963W0(this.f43974d, s0Var);
        if (m45920A()) {
            Matrix matrix = s0Var.f43908o;
            if (matrix != null) {
                this.f43971a.concat(matrix);
            }
            m45990p(s0Var);
            boolean zM45985m0 = m45985m0();
            m45940K0(s0Var);
            if (zM45985m0) {
                m45979j0(s0Var);
            }
            m45960U0(s0Var);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m45924C(Path path) {
        h hVar = this.f43974d;
        if (hVar.f44010a.f43800L != C12319g.e0.i.NonScalingStroke) {
            this.f43971a.drawPath(path, hVar.f44014e);
            return;
        }
        Matrix matrix = this.f43971a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f43971a.setMatrix(new Matrix());
        Shader shader = this.f43974d.f44014e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f43971a.drawPath(path2, this.f43974d.f44014e);
        this.f43971a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m45925C0(C12319g.t0 t0Var, C12319g.b bVar) {
        m45919y("Symbol render", new Object[0]);
        if (bVar.f43760c == 0.0f || bVar.f43761d == 0.0f) {
            return;
        }
        C12317e c12317e = t0Var.f43923o;
        if (c12317e == null) {
            c12317e = C12317e.f43717e;
        }
        m45963W0(this.f43974d, t0Var);
        h hVar = this.f43974d;
        hVar.f44015f = bVar;
        if (!hVar.f44010a.f43823v.booleanValue()) {
            C12319g.b bVar2 = this.f43974d.f44015f;
            m45948O0(bVar2.f43758a, bVar2.f43759b, bVar2.f43760c, bVar2.f43761d);
        }
        C12319g.b bVar3 = t0Var.f43939p;
        if (bVar3 != null) {
            this.f43971a.concat(m45988o(this.f43974d.f44015f, bVar3, c12317e));
            this.f43974d.f44016g = t0Var.f43939p;
        } else {
            Canvas canvas = this.f43971a;
            C12319g.b bVar4 = this.f43974d.f44015f;
            canvas.translate(bVar4.f43758a, bVar4.f43759b);
        }
        boolean zM45985m0 = m45985m0();
        m45930F0(t0Var, true);
        if (zM45985m0) {
            m45979j0(t0Var);
        }
        m45960U0(t0Var);
    }

    /* JADX INFO: renamed from: D */
    public final float m45926D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m45927D0(C12319g.w0 w0Var) {
        m45919y("Text render", new Object[0]);
        m45963W0(this.f43974d, w0Var);
        if (m45920A()) {
            Matrix matrix = w0Var.f43957s;
            if (matrix != null) {
                this.f43971a.concat(matrix);
            }
            List<C12319g.p> list = w0Var.f43754o;
            float fM45889h = 0.0f;
            float fM45888f = (list == null || list.size() == 0) ? 0.0f : w0Var.f43754o.get(0).m45888f(this);
            List<C12319g.p> list2 = w0Var.f43755p;
            float fM45889h2 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f43755p.get(0).m45889h(this);
            List<C12319g.p> list3 = w0Var.f43756q;
            float fM45888f2 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f43756q.get(0).m45888f(this);
            List<C12319g.p> list4 = w0Var.f43757r;
            if (list4 != null && list4.size() != 0) {
                fM45889h = w0Var.f43757r.get(0).m45889h(this);
            }
            C12319g.e0.f fVarM45947O = m45947O();
            if (fVarM45947O != C12319g.e0.f.Start) {
                float fM45986n = m45986n(w0Var);
                if (fVarM45947O == C12319g.e0.f.Middle) {
                    fM45986n /= 2.0f;
                }
                fM45888f -= fM45986n;
            }
            if (w0Var.f43901h == null) {
                i iVar = new i(fM45888f, fM45889h2);
                m45928E(w0Var, iVar);
                RectF rectF = iVar.f44021d;
                w0Var.f43901h = new C12319g.b(rectF.left, rectF.top, rectF.width(), iVar.f44021d.height());
            }
            m45960U0(w0Var);
            m45994r(w0Var);
            m45990p(w0Var);
            boolean zM45985m0 = m45985m0();
            m45928E(w0Var, new f(fM45888f + fM45888f2, fM45889h2 + fM45889h));
            if (zM45985m0) {
                m45979j0(w0Var);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m45928E(C12319g.y0 y0Var, j jVar) {
        if (m45920A()) {
            Iterator<C12319g.n0> it = y0Var.f43877i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                C12319g.n0 next = it.next();
                if (next instanceof C12319g.c1) {
                    jVar.mo46012b(m45958T0(((C12319g.c1) next).f43772c, z10, !it.hasNext()));
                } else {
                    m45983l0(next, jVar);
                }
                z10 = false;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m45929E0(C12319g.e1 e1Var) {
        m45919y("Use render", new Object[0]);
        C12319g.p pVar = e1Var.f43866s;
        if (pVar == null || !pVar.m45891j()) {
            C12319g.p pVar2 = e1Var.f43867t;
            if (pVar2 == null || !pVar2.m45891j()) {
                m45963W0(this.f43974d, e1Var);
                if (m45920A()) {
                    C12319g.n0 n0VarM45855p = e1Var.f43913a.m45855p(e1Var.f43863p);
                    if (n0VarM45855p == null) {
                        m45904F("Use reference '%s' not found", e1Var.f43863p);
                        return;
                    }
                    Matrix matrix = e1Var.f43908o;
                    if (matrix != null) {
                        this.f43971a.concat(matrix);
                    }
                    C12319g.p pVar3 = e1Var.f43864q;
                    float fM45888f = pVar3 != null ? pVar3.m45888f(this) : 0.0f;
                    C12319g.p pVar4 = e1Var.f43865r;
                    this.f43971a.translate(fM45888f, pVar4 != null ? pVar4.m45889h(this) : 0.0f);
                    m45990p(e1Var);
                    boolean zM45985m0 = m45985m0();
                    m45977i0(e1Var);
                    if (n0VarM45855p instanceof C12319g.f0) {
                        C12319g.b bVarM45974f0 = m45974f0(null, null, e1Var.f43866s, e1Var.f43867t);
                        m45956S0();
                        m46005y0((C12319g.f0) n0VarM45855p, bVarM45974f0);
                        m45954R0();
                    } else if (n0VarM45855p instanceof C12319g.t0) {
                        C12319g.p pVar5 = e1Var.f43866s;
                        if (pVar5 == null) {
                            pVar5 = new C12319g.p(100.0f, C12319g.d1.percent);
                        }
                        C12319g.p pVar6 = e1Var.f43867t;
                        if (pVar6 == null) {
                            pVar6 = new C12319g.p(100.0f, C12319g.d1.percent);
                        }
                        C12319g.b bVarM45974f1 = m45974f0(null, null, pVar5, pVar6);
                        m45956S0();
                        m45925C0((C12319g.t0) n0VarM45855p, bVarM45974f1);
                        m45954R0();
                    } else {
                        m45921A0(n0VarM45855p);
                    }
                    m45976h0();
                    if (zM45985m0) {
                        m45979j0(e1Var);
                    }
                    m45960U0(e1Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m45930F0(C12319g.j0 j0Var, boolean z10) {
        if (z10) {
            m45977i0(j0Var);
        }
        Iterator<C12319g.n0> it = j0Var.getChildren().iterator();
        while (it.hasNext()) {
            m45921A0(it.next());
        }
        if (z10) {
            m45976h0();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m45931G(C12319g.y0 y0Var, StringBuilder sb2) {
        Iterator<C12319g.n0> it = y0Var.f43877i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            C12319g.n0 next = it.next();
            if (next instanceof C12319g.y0) {
                m45931G((C12319g.y0) next, sb2);
            } else if (next instanceof C12319g.c1) {
                sb2.append(m45958T0(((C12319g.c1) next).f43772c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m45932G0(C12319g c12319g, C12318f c12318f) {
        C12319g.b bVar;
        C12317e c12317e;
        if (c12318f == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f43973c = c12319g;
        C12319g.f0 f0VarM45852m = c12319g.m45852m();
        if (f0VarM45852m == null) {
            m45906Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (c12318f.m45836e()) {
            C12319g.l0 l0VarM45850i = this.f43973c.m45850i(c12318f.f43744e);
            if (l0VarM45850i == null || !(l0VarM45850i instanceof C12319g.f1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", c12318f.f43744e));
                return;
            }
            C12319g.f1 f1Var = (C12319g.f1) l0VarM45850i;
            bVar = f1Var.f43939p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", c12318f.f43744e));
                return;
            }
            c12317e = f1Var.f43923o;
        } else {
            bVar = c12318f.m45837f() ? c12318f.f43743d : f0VarM45852m.f43939p;
            c12317e = c12318f.m45834c() ? c12318f.f43741b : f0VarM45852m.f43923o;
        }
        if (c12318f.m45833b()) {
            c12319g.m45842a(c12318f.f43740a);
        }
        if (c12318f.m45835d()) {
            C12314b.q qVar = new C12314b.q();
            this.f43978h = qVar;
            qVar.f43699a = c12319g.m45850i(c12318f.f43742c);
        }
        m45946N0();
        m46000u(f0VarM45852m);
        m45956S0();
        C12319g.b bVar2 = new C12319g.b(c12318f.f43745f);
        C12319g.p pVar = f0VarM45852m.f43873s;
        if (pVar != null) {
            bVar2.f43760c = pVar.m45887e(this, bVar2.f43760c);
        }
        C12319g.p pVar2 = f0VarM45852m.f43874t;
        if (pVar2 != null) {
            bVar2.f43761d = pVar2.m45887e(this, bVar2.f43761d);
        }
        m46007z0(f0VarM45852m, bVar2, bVar, c12317e);
        m45954R0();
        if (c12318f.m45833b()) {
            c12319g.m45843b();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m45933H(C12319g.j jVar, String str) {
        C12319g.n0 n0VarM45855p = jVar.f43913a.m45855p(str);
        if (n0VarM45855p == null) {
            m45906Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(n0VarM45855p instanceof C12319g.j)) {
            m45904F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (n0VarM45855p == jVar) {
            m45904F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        C12319g.j jVar2 = (C12319g.j) n0VarM45855p;
        if (jVar.f43893i == null) {
            jVar.f43893i = jVar2.f43893i;
        }
        if (jVar.f43894j == null) {
            jVar.f43894j = jVar2.f43894j;
        }
        if (jVar.f43895k == null) {
            jVar.f43895k = jVar2.f43895k;
        }
        if (jVar.f43892h.isEmpty()) {
            jVar.f43892h = jVar2.f43892h;
        }
        try {
            if (jVar instanceof C12319g.m0) {
                m45935I((C12319g.m0) jVar, (C12319g.m0) n0VarM45855p);
            } else {
                m45937J((C12319g.q0) jVar, (C12319g.q0) n0VarM45855p);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f43896l;
        if (str2 != null) {
            m45933H(jVar, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX INFO: renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m45934H0(C12319g.r rVar, c cVar) {
        float fFloatValue;
        float f10;
        float f11;
        float f12;
        m45956S0();
        Float f13 = rVar.f43938v;
        float f14 = 0.0f;
        if (f13 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f13.floatValue())) {
            float f15 = cVar.f43993c;
            if (f15 == 0.0f && cVar.f43994d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(cVar.f43994d, f15));
            }
        } else {
            fFloatValue = rVar.f43938v.floatValue();
        }
        float fM45885b = rVar.f43933q ? 1.0f : this.f43974d.f44010a.f43808g.m45885b(this.f43972b);
        this.f43974d = m45943M(rVar);
        Matrix matrix = new Matrix();
        matrix.preTranslate(cVar.f43991a, cVar.f43992b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fM45885b, fM45885b);
        C12319g.p pVar = rVar.f43934r;
        float fM45888f = pVar != null ? pVar.m45888f(this) : 0.0f;
        C12319g.p pVar2 = rVar.f43935s;
        float fM45889h = pVar2 != null ? pVar2.m45889h(this) : 0.0f;
        C12319g.p pVar3 = rVar.f43936t;
        float fM45888f2 = pVar3 != null ? pVar3.m45888f(this) : 3.0f;
        C12319g.p pVar4 = rVar.f43937u;
        float fM45889h2 = pVar4 != null ? pVar4.m45889h(this) : 3.0f;
        C12319g.b bVar = rVar.f43939p;
        if (bVar != null) {
            float fMax = fM45888f2 / bVar.f43760c;
            float f16 = fM45889h2 / bVar.f43761d;
            C12317e c12317e = rVar.f43923o;
            if (c12317e == null) {
                c12317e = C12317e.f43717e;
            }
            if (!c12317e.equals(C12317e.f43716d)) {
                fMax = c12317e.m45831b() == C12317e.b.slice ? Math.max(fMax, f16) : Math.min(fMax, f16);
                f16 = fMax;
            }
            matrix.preTranslate((-fM45888f) * fMax, (-fM45889h) * f16);
            this.f43971a.concat(matrix);
            C12319g.b bVar2 = rVar.f43939p;
            float f17 = bVar2.f43760c * fMax;
            float f18 = bVar2.f43761d * f16;
            int[] iArr = a.f43979a;
            switch (iArr[c12317e.m45830a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f10 = (fM45888f2 - f17) / 2.0f;
                    f11 = 0.0f - f10;
                    break;
                case 4:
                case 5:
                case 6:
                    f10 = fM45888f2 - f17;
                    f11 = 0.0f - f10;
                    break;
                default:
                    f11 = 0.0f;
                    break;
            }
            int i10 = iArr[c12317e.m45830a().ordinal()];
            if (i10 == 2) {
                f12 = (fM45889h2 - f18) / 2.0f;
                f14 = 0.0f - f12;
            } else {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                            }
                        }
                    }
                    f12 = (fM45889h2 - f18) / 2.0f;
                    f14 = 0.0f - f12;
                }
                f12 = fM45889h2 - f18;
                f14 = 0.0f - f12;
            }
            if (!this.f43974d.f44010a.f43823v.booleanValue()) {
                m45948O0(f11, f14, fM45888f2, fM45889h2);
            }
            matrix.reset();
            matrix.preScale(fMax, f16);
            this.f43971a.concat(matrix);
        } else {
            matrix.preTranslate(-fM45888f, -fM45889h);
            this.f43971a.concat(matrix);
            if (!this.f43974d.f44010a.f43823v.booleanValue()) {
                m45948O0(0.0f, 0.0f, fM45888f2, fM45889h2);
            }
        }
        boolean zM45985m0 = m45985m0();
        m45930F0(rVar, false);
        if (zM45985m0) {
            m45979j0(rVar);
        }
        m45954R0();
    }

    /* JADX INFO: renamed from: I */
    public final void m45935I(C12319g.m0 m0Var, C12319g.m0 m0Var2) {
        if (m0Var.f43909m == null) {
            m0Var.f43909m = m0Var2.f43909m;
        }
        if (m0Var.f43910n == null) {
            m0Var.f43910n = m0Var2.f43910n;
        }
        if (m0Var.f43911o == null) {
            m0Var.f43911o = m0Var2.f43911o;
        }
        if (m0Var.f43912p == null) {
            m0Var.f43912p = m0Var2.f43912p;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m45936I0(C12319g.l lVar) {
        C12319g.r rVar;
        C12319g.r rVar2;
        C12319g.r rVar3;
        List<c> listM45980k;
        int size;
        C12319g.e0 e0Var = this.f43974d.f44010a;
        String str = e0Var.f43825x;
        if (str == null && e0Var.f43826y == null && e0Var.f43827z == null) {
            return;
        }
        if (str == null) {
            rVar = null;
        } else {
            C12319g.n0 n0VarM45855p = lVar.f43913a.m45855p(str);
            if (n0VarM45855p != null) {
                rVar = (C12319g.r) n0VarM45855p;
            } else {
                m45904F("Marker reference '%s' not found", this.f43974d.f44010a.f43825x);
                rVar = null;
            }
        }
        String str2 = this.f43974d.f44010a.f43826y;
        if (str2 == null) {
            rVar2 = null;
        } else {
            C12319g.n0 n0VarM45855p2 = lVar.f43913a.m45855p(str2);
            if (n0VarM45855p2 != null) {
                rVar2 = (C12319g.r) n0VarM45855p2;
            } else {
                m45904F("Marker reference '%s' not found", this.f43974d.f44010a.f43826y);
                rVar2 = null;
            }
        }
        String str3 = this.f43974d.f44010a.f43827z;
        if (str3 == null) {
            rVar3 = null;
        } else {
            C12319g.n0 n0VarM45855p3 = lVar.f43913a.m45855p(str3);
            if (n0VarM45855p3 != null) {
                rVar3 = (C12319g.r) n0VarM45855p3;
            } else {
                m45904F("Marker reference '%s' not found", this.f43974d.f44010a.f43827z);
                rVar3 = null;
            }
        }
        if (lVar instanceof C12319g.v) {
            listM45980k = new b(((C12319g.v) lVar).f43950o).m46008f();
        } else {
            listM45980k = lVar instanceof C12319g.q ? m45980k((C12319g.q) lVar) : m45982l((C12319g.z) lVar);
        }
        if (listM45980k == null || (size = listM45980k.size()) == 0) {
            return;
        }
        C12319g.e0 e0Var2 = this.f43974d.f44010a;
        e0Var2.f43827z = null;
        e0Var2.f43826y = null;
        e0Var2.f43825x = null;
        if (rVar != null) {
            m45934H0(rVar, listM45980k.get(0));
        }
        if (rVar2 != null && listM45980k.size() > 2) {
            c cVarM45987n0 = listM45980k.get(0);
            c cVar = listM45980k.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = listM45980k.get(i10);
                cVarM45987n0 = cVar.f43995e ? m45987n0(cVarM45987n0, cVar, cVar2) : cVar;
                m45934H0(rVar2, cVarM45987n0);
                cVar = cVar2;
            }
        }
        if (rVar3 != null) {
            m45934H0(rVar3, listM45980k.get(size - 1));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m45937J(C12319g.q0 q0Var, C12319g.q0 q0Var2) {
        if (q0Var.f43928m == null) {
            q0Var.f43928m = q0Var2.f43928m;
        }
        if (q0Var.f43929n == null) {
            q0Var.f43929n = q0Var2.f43929n;
        }
        if (q0Var.f43930o == null) {
            q0Var.f43930o = q0Var2.f43930o;
        }
        if (q0Var.f43931p == null) {
            q0Var.f43931p = q0Var2.f43931p;
        }
        if (q0Var.f43932q == null) {
            q0Var.f43932q = q0Var2.f43932q;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m45938J0(C12319g.s sVar, C12319g.k0 k0Var, C12319g.b bVar) {
        float fM45888f;
        float fM45889h;
        m45919y("Mask render", new Object[0]);
        Boolean bool = sVar.f43940o;
        if (bool == null || !bool.booleanValue()) {
            C12319g.p pVar = sVar.f43944s;
            float fM45887e = pVar != null ? pVar.m45887e(this, 1.0f) : 1.2f;
            C12319g.p pVar2 = sVar.f43945t;
            float fM45887e2 = pVar2 != null ? pVar2.m45887e(this, 1.0f) : 1.2f;
            fM45888f = fM45887e * bVar.f43760c;
            fM45889h = fM45887e2 * bVar.f43761d;
        } else {
            C12319g.p pVar3 = sVar.f43944s;
            fM45888f = pVar3 != null ? pVar3.m45888f(this) : bVar.f43760c;
            C12319g.p pVar4 = sVar.f43945t;
            fM45889h = pVar4 != null ? pVar4.m45889h(this) : bVar.f43761d;
        }
        if (fM45888f == 0.0f || fM45889h == 0.0f) {
            return;
        }
        m45956S0();
        h hVarM45943M = m45943M(sVar);
        this.f43974d = hVarM45943M;
        hVarM45943M.f44010a.f43814m = Float.valueOf(1.0f);
        boolean zM45985m0 = m45985m0();
        this.f43971a.save();
        Boolean bool2 = sVar.f43941p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f43971a.translate(bVar.f43758a, bVar.f43759b);
            this.f43971a.scale(bVar.f43760c, bVar.f43761d);
        }
        m45930F0(sVar, false);
        this.f43971a.restore();
        if (zM45985m0) {
            m45981k0(k0Var, bVar);
        }
        m45954R0();
    }

    /* JADX INFO: renamed from: K */
    public final void m45939K(C12319g.y yVar, String str) {
        C12319g.n0 n0VarM45855p = yVar.f43913a.m45855p(str);
        if (n0VarM45855p == null) {
            m45906Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(n0VarM45855p instanceof C12319g.y)) {
            m45904F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n0VarM45855p == yVar) {
            m45904F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C12319g.y yVar2 = (C12319g.y) n0VarM45855p;
        if (yVar.f43958q == null) {
            yVar.f43958q = yVar2.f43958q;
        }
        if (yVar.f43959r == null) {
            yVar.f43959r = yVar2.f43959r;
        }
        if (yVar.f43960s == null) {
            yVar.f43960s = yVar2.f43960s;
        }
        if (yVar.f43961t == null) {
            yVar.f43961t = yVar2.f43961t;
        }
        if (yVar.f43962u == null) {
            yVar.f43962u = yVar2.f43962u;
        }
        if (yVar.f43963v == null) {
            yVar.f43963v = yVar2.f43963v;
        }
        if (yVar.f43964w == null) {
            yVar.f43964w = yVar2.f43964w;
        }
        if (yVar.f43877i.isEmpty()) {
            yVar.f43877i = yVar2.f43877i;
        }
        if (yVar.f43939p == null) {
            yVar.f43939p = yVar2.f43939p;
        }
        if (yVar.f43923o == null) {
            yVar.f43923o = yVar2.f43923o;
        }
        String str2 = yVar2.f43965x;
        if (str2 != null) {
            m45939K(yVar, str2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: w7.g$n0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K0 */
    public final void m45940K0(C12319g.s0 s0Var) {
        Set<String> setMo45873b;
        String language = Locale.getDefault().getLanguage();
        C12319g.m45840k();
        for (C12319g.n0 n0Var : s0Var.getChildren()) {
            if (n0Var instanceof C12319g.g0) {
                C12319g.g0 g0Var = (C12319g.g0) n0Var;
                if (g0Var.mo45874c() == null && ((setMo45873b = g0Var.mo45873b()) == null || (!setMo45873b.isEmpty() && setMo45873b.contains(language)))) {
                    Set<String> setMo45877g = g0Var.mo45877g();
                    if (setMo45877g != null) {
                        if (f43970i == null) {
                            m45905V();
                        }
                        if (setMo45877g.isEmpty() || !f43970i.containsAll(setMo45877g)) {
                        }
                    }
                    Set<String> setMo45881l = g0Var.mo45881l();
                    if (setMo45881l != null) {
                        setMo45881l.isEmpty();
                    } else {
                        Set<String> setMo45882m = g0Var.mo45882m();
                        if (setMo45882m == null) {
                            m45921A0(n0Var);
                            return;
                        }
                        setMo45882m.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX INFO: renamed from: L */
    public final void m45941L(C12319g.k0 k0Var, Path path, C12319g.y yVar) {
        float fM45888f;
        float fM45889h;
        float fM45889h2;
        float fM45888f2;
        boolean z10;
        boolean z11;
        Boolean bool = yVar.f43958q;
        boolean z12 = bool != null && bool.booleanValue();
        String str = yVar.f43965x;
        if (str != null) {
            m45939K(yVar, str);
        }
        if (z12) {
            C12319g.p pVar = yVar.f43961t;
            fM45888f = pVar != null ? pVar.m45888f(this) : 0.0f;
            C12319g.p pVar2 = yVar.f43962u;
            fM45889h2 = pVar2 != null ? pVar2.m45889h(this) : 0.0f;
            C12319g.p pVar3 = yVar.f43963v;
            fM45888f2 = pVar3 != null ? pVar3.m45888f(this) : 0.0f;
            C12319g.p pVar4 = yVar.f43964w;
            fM45889h = pVar4 != null ? pVar4.m45889h(this) : 0.0f;
        } else {
            C12319g.p pVar5 = yVar.f43961t;
            float fM45887e = pVar5 != null ? pVar5.m45887e(this, 1.0f) : 0.0f;
            C12319g.p pVar6 = yVar.f43962u;
            float fM45887e2 = pVar6 != null ? pVar6.m45887e(this, 1.0f) : 0.0f;
            C12319g.p pVar7 = yVar.f43963v;
            float fM45887e3 = pVar7 != null ? pVar7.m45887e(this, 1.0f) : 0.0f;
            C12319g.p pVar8 = yVar.f43964w;
            float fM45887e4 = pVar8 != null ? pVar8.m45887e(this, 1.0f) : 0.0f;
            C12319g.b bVar = k0Var.f43901h;
            float f10 = bVar.f43758a;
            float f11 = bVar.f43760c;
            fM45888f = (fM45887e * f11) + f10;
            float f12 = bVar.f43759b;
            float f13 = bVar.f43761d;
            float f14 = fM45887e3 * f11;
            fM45889h = fM45887e4 * f13;
            fM45889h2 = (fM45887e2 * f13) + f12;
            fM45888f2 = f14;
        }
        if (fM45888f2 == 0.0f || fM45889h == 0.0f) {
            return;
        }
        C12317e c12317e = yVar.f43923o;
        if (c12317e == null) {
            c12317e = C12317e.f43717e;
        }
        m45956S0();
        this.f43971a.clipPath(path);
        h hVar = new h();
        m45961V0(hVar, C12319g.e0.m45870a());
        hVar.f44010a.f43823v = Boolean.FALSE;
        this.f43974d = m45945N(yVar, hVar);
        C12319g.b bVar2 = k0Var.f43901h;
        Matrix matrix = yVar.f43960s;
        if (matrix != null) {
            this.f43971a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (yVar.f43960s.invert(matrix2)) {
                C12319g.b bVar3 = k0Var.f43901h;
                float f15 = bVar3.f43758a;
                float f16 = bVar3.f43759b;
                float fM45864b = bVar3.m45864b();
                C12319g.b bVar4 = k0Var.f43901h;
                z10 = false;
                float f17 = bVar4.f43759b;
                float fM45864b2 = bVar4.m45864b();
                z11 = true;
                float fM45865c = k0Var.f43901h.m45865c();
                C12319g.b bVar5 = k0Var.f43901h;
                float[] fArr = {f15, f16, fM45864b, f17, fM45864b2, fM45865c, bVar5.f43758a, bVar5.m45865c()};
                matrix2.mapPoints(fArr);
                float f18 = fArr[0];
                float f19 = fArr[1];
                RectF rectF = new RectF(f18, f19, f18, f19);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f20 = fArr[i10];
                    if (f20 < rectF.left) {
                        rectF.left = f20;
                    }
                    if (f20 > rectF.right) {
                        rectF.right = f20;
                    }
                    float f21 = fArr[i10 + 1];
                    if (f21 < rectF.top) {
                        rectF.top = f21;
                    }
                    if (f21 > rectF.bottom) {
                        rectF.bottom = f21;
                    }
                }
                float f22 = rectF.left;
                float f23 = rectF.top;
                bVar2 = new C12319g.b(f22, f23, rectF.right - f22, rectF.bottom - f23);
            } else {
                z10 = false;
                z11 = true;
            }
        } else {
            z10 = false;
            z11 = true;
        }
        float fFloor = fM45888f + (((float) Math.floor((bVar2.f43758a - fM45888f) / fM45888f2)) * fM45888f2);
        float fM45864b3 = bVar2.m45864b();
        float fM45865c2 = bVar2.m45865c();
        C12319g.b bVar6 = new C12319g.b(0.0f, 0.0f, fM45888f2, fM45889h);
        boolean zM45985m0 = m45985m0();
        for (float fFloor2 = fM45889h2 + (((float) Math.floor((bVar2.f43759b - fM45889h2) / fM45889h)) * fM45889h); fFloor2 < fM45865c2; fFloor2 += fM45889h) {
            float f24 = fFloor;
            while (f24 < fM45864b3) {
                bVar6.f43758a = f24;
                bVar6.f43759b = fFloor2;
                m45956S0();
                if (!this.f43974d.f44010a.f43823v.booleanValue()) {
                    m45948O0(bVar6.f43758a, bVar6.f43759b, bVar6.f43760c, bVar6.f43761d);
                }
                C12319g.b bVar7 = yVar.f43939p;
                if (bVar7 != null) {
                    this.f43971a.concat(m45988o(bVar6, bVar7, c12317e));
                } else {
                    Boolean bool2 = yVar.f43959r;
                    boolean z13 = (bool2 == null || bool2.booleanValue()) ? z11 : z10;
                    this.f43971a.translate(f24, fFloor2);
                    if (!z13) {
                        Canvas canvas = this.f43971a;
                        C12319g.b bVar8 = k0Var.f43901h;
                        canvas.scale(bVar8.f43760c, bVar8.f43761d);
                    }
                }
                Iterator<C12319g.n0> it = yVar.f43877i.iterator();
                while (it.hasNext()) {
                    m45921A0(it.next());
                }
                m45954R0();
                f24 += fM45888f2;
                fFloor = fFloor;
            }
        }
        if (zM45985m0) {
            m45979j0(yVar);
        }
        m45954R0();
    }

    /* JADX INFO: renamed from: L0 */
    public final void m45942L0(C12319g.z0 z0Var) {
        m45919y("TextPath render", new Object[0]);
        m45963W0(this.f43974d, z0Var);
        if (m45920A() && m45967Y0()) {
            C12319g.n0 n0VarM45855p = z0Var.f43913a.m45855p(z0Var.f43967o);
            if (n0VarM45855p == null) {
                m45904F("TextPath reference '%s' not found", z0Var.f43967o);
                return;
            }
            C12319g.v vVar = (C12319g.v) n0VarM45855p;
            Path pathM46011f = new d(vVar.f43950o).m46011f();
            Matrix matrix = vVar.f43902n;
            if (matrix != null) {
                pathM46011f.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathM46011f, false);
            C12319g.p pVar = z0Var.f43968p;
            float fM45887e = pVar != null ? pVar.m45887e(this, pathMeasure.getLength()) : 0.0f;
            C12319g.e0.f fVarM45947O = m45947O();
            if (fVarM45947O != C12319g.e0.f.Start) {
                float fM45986n = m45986n(z0Var);
                if (fVarM45947O == C12319g.e0.f.Middle) {
                    fM45986n /= 2.0f;
                }
                fM45887e -= fM45986n;
            }
            m45994r((C12319g.k0) z0Var.mo45869e());
            boolean zM45985m0 = m45985m0();
            m45928E(z0Var, new e(pathM46011f, fM45887e, 0.0f));
            if (zM45985m0) {
                m45979j0(z0Var);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final h m45943M(C12319g.n0 n0Var) {
        h hVar = new h();
        m45961V0(hVar, C12319g.e0.m45870a());
        return m45945N(n0Var, hVar);
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m45944M0() {
        return this.f43974d.f44010a.f43814m.floatValue() < 1.0f || this.f43974d.f44010a.f43795G != null;
    }

    /* JADX INFO: renamed from: N */
    public final h m45945N(C12319g.n0 n0Var, h hVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i10 = 0;
            if (n0Var instanceof C12319g.l0) {
                arrayList.add(0, (C12319g.l0) n0Var);
            }
            Object obj = n0Var.f43914b;
            if (obj == null) {
                break;
            }
            n0Var = (C12319g.n0) obj;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            m45963W0(hVar, (C12319g.l0) obj2);
        }
        h hVar2 = this.f43974d;
        hVar.f44016g = hVar2.f44016g;
        hVar.f44015f = hVar2.f44015f;
        return hVar;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m45946N0() {
        this.f43974d = new h();
        this.f43975e = new Stack<>();
        m45961V0(this.f43974d, C12319g.e0.m45870a());
        h hVar = this.f43974d;
        hVar.f44015f = null;
        hVar.f44017h = false;
        this.f43975e.push(new h(hVar));
        this.f43977g = new Stack<>();
        this.f43976f = new Stack<>();
    }

    /* JADX INFO: renamed from: O */
    public final C12319g.e0.f m45947O() {
        C12319g.e0.f fVar;
        C12319g.e0 e0Var = this.f43974d.f44010a;
        if (e0Var.f43821t == C12319g.e0.h.LTR || (fVar = e0Var.f43822u) == C12319g.e0.f.Middle) {
            return e0Var.f43822u;
        }
        C12319g.e0.f fVar2 = C12319g.e0.f.Start;
        return fVar == fVar2 ? C12319g.e0.f.End : fVar2;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m45948O0(float f10, float f11, float f12, float f13) {
        float fM45888f = f12 + f10;
        float fM45889h = f13 + f11;
        C12319g.c cVar = this.f43974d.f44010a.f43824w;
        if (cVar != null) {
            f10 += cVar.f43771d.m45888f(this);
            f11 += this.f43974d.f44010a.f43824w.f43768a.m45889h(this);
            fM45888f -= this.f43974d.f44010a.f43824w.f43769b.m45888f(this);
            fM45889h -= this.f43974d.f44010a.f43824w.f43770c.m45889h(this);
        }
        this.f43971a.clipRect(f10, f11, fM45888f, fM45889h);
    }

    /* JADX INFO: renamed from: P */
    public final Path.FillType m45949P() {
        C12319g.e0.a aVar = this.f43974d.f44010a.f43794F;
        return (aVar == null || aVar != C12319g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m45950P0(h hVar, boolean z10, C12319g.o0 o0Var) {
        int i10;
        C12319g.e0 e0Var = hVar.f44010a;
        float fFloatValue = (z10 ? e0Var.f43805d : e0Var.f43807f).floatValue();
        if (o0Var instanceof C12319g.f) {
            i10 = ((C12319g.f) o0Var).f43870a;
        } else if (!(o0Var instanceof C12319g.g)) {
            return;
        } else {
            i10 = hVar.f44010a.f43815n.f43870a;
        }
        int iM45918x = m45918x(i10, fFloatValue);
        if (z10) {
            hVar.f44013d.setColor(iM45918x);
        } else {
            hVar.f44014e.setColor(iM45918x);
        }
    }

    /* JADX INFO: renamed from: Q */
    public float m45951Q() {
        return this.f43974d.f44013d.getTextSize();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m45952Q0(boolean z10, C12319g.c0 c0Var) {
        if (z10) {
            if (m45962W(c0Var.f43905e, 2147483648L)) {
                h hVar = this.f43974d;
                C12319g.e0 e0Var = hVar.f44010a;
                C12319g.o0 o0Var = c0Var.f43905e.f43796H;
                e0Var.f43803b = o0Var;
                hVar.f44011b = o0Var != null;
            }
            if (m45962W(c0Var.f43905e, 4294967296L)) {
                this.f43974d.f44010a.f43805d = c0Var.f43905e.f43797I;
            }
            if (m45962W(c0Var.f43905e, 6442450944L)) {
                h hVar2 = this.f43974d;
                m45950P0(hVar2, z10, hVar2.f44010a.f43803b);
                return;
            }
            return;
        }
        if (m45962W(c0Var.f43905e, 2147483648L)) {
            h hVar3 = this.f43974d;
            C12319g.e0 e0Var2 = hVar3.f44010a;
            C12319g.o0 o0Var2 = c0Var.f43905e.f43796H;
            e0Var2.f43806e = o0Var2;
            hVar3.f44012c = o0Var2 != null;
        }
        if (m45962W(c0Var.f43905e, 4294967296L)) {
            this.f43974d.f44010a.f43807f = c0Var.f43905e.f43797I;
        }
        if (m45962W(c0Var.f43905e, 6442450944L)) {
            h hVar4 = this.f43974d;
            m45950P0(hVar4, z10, hVar4.f44010a.f43806e);
        }
    }

    /* JADX INFO: renamed from: R */
    public float m45953R() {
        return this.f43974d.f44013d.getTextSize() / 2.0f;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m45954R0() {
        this.f43971a.restore();
        this.f43974d = this.f43975e.pop();
    }

    /* JADX INFO: renamed from: S */
    public C12319g.b m45955S() {
        h hVar = this.f43974d;
        C12319g.b bVar = hVar.f44016g;
        return bVar != null ? bVar : hVar.f44015f;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m45956S0() {
        this.f43971a.save();
        this.f43975e.push(this.f43974d);
        this.f43974d = new h(this.f43974d);
    }

    /* JADX INFO: renamed from: T */
    public float m45957T() {
        return this.f43972b;
    }

    /* JADX INFO: renamed from: T0 */
    public final String m45958T0(String str, boolean z10, boolean z11) {
        if (this.f43974d.f44017h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    /* JADX INFO: renamed from: U */
    public final Path.FillType m45959U() {
        C12319g.e0.a aVar = this.f43974d.f44010a.f43804c;
        return (aVar == null || aVar != C12319g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m45960U0(C12319g.k0 k0Var) {
        if (k0Var.f43914b == null || k0Var.f43901h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f43977g.peek().invert(matrix)) {
            C12319g.b bVar = k0Var.f43901h;
            float f10 = bVar.f43758a;
            float f11 = bVar.f43759b;
            float fM45864b = bVar.m45864b();
            C12319g.b bVar2 = k0Var.f43901h;
            float f12 = bVar2.f43759b;
            float fM45864b2 = bVar2.m45864b();
            float fM45865c = k0Var.f43901h.m45865c();
            C12319g.b bVar3 = k0Var.f43901h;
            float[] fArr = {f10, f11, fM45864b, f12, fM45864b2, fM45865c, bVar3.f43758a, bVar3.m45865c()};
            matrix.preConcat(this.f43971a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            C12319g.k0 k0Var2 = (C12319g.k0) this.f43976f.peek();
            C12319g.b bVar4 = k0Var2.f43901h;
            if (bVar4 == null) {
                k0Var2.f43901h = C12319g.b.m45863a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.m45867e(C12319g.b.m45863a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m45961V0(h hVar, C12319g.e0 e0Var) {
        if (m45962W(e0Var, 4096L)) {
            hVar.f44010a.f43815n = e0Var.f43815n;
        }
        if (m45962W(e0Var, 2048L)) {
            hVar.f44010a.f43814m = e0Var.f43814m;
        }
        if (m45962W(e0Var, 1L)) {
            hVar.f44010a.f43803b = e0Var.f43803b;
            C12319g.o0 o0Var = e0Var.f43803b;
            hVar.f44011b = (o0Var == null || o0Var == C12319g.f.f43869c) ? false : true;
        }
        if (m45962W(e0Var, 4L)) {
            hVar.f44010a.f43805d = e0Var.f43805d;
        }
        if (m45962W(e0Var, 6149L)) {
            m45950P0(hVar, true, hVar.f44010a.f43803b);
        }
        if (m45962W(e0Var, 2L)) {
            hVar.f44010a.f43804c = e0Var.f43804c;
        }
        if (m45962W(e0Var, 8L)) {
            hVar.f44010a.f43806e = e0Var.f43806e;
            C12319g.o0 o0Var2 = e0Var.f43806e;
            hVar.f44012c = (o0Var2 == null || o0Var2 == C12319g.f.f43869c) ? false : true;
        }
        if (m45962W(e0Var, 16L)) {
            hVar.f44010a.f43807f = e0Var.f43807f;
        }
        if (m45962W(e0Var, 6168L)) {
            m45950P0(hVar, false, hVar.f44010a.f43806e);
        }
        if (m45962W(e0Var, 34359738368L)) {
            hVar.f44010a.f43800L = e0Var.f43800L;
        }
        if (m45962W(e0Var, 32L)) {
            C12319g.e0 e0Var2 = hVar.f44010a;
            C12319g.p pVar = e0Var.f43808g;
            e0Var2.f43808g = pVar;
            hVar.f44014e.setStrokeWidth(pVar.m45886c(this));
        }
        if (m45962W(e0Var, 64L)) {
            hVar.f44010a.f43809h = e0Var.f43809h;
            int i10 = a.f43980b[e0Var.f43809h.ordinal()];
            if (i10 == 1) {
                hVar.f44014e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                hVar.f44014e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                hVar.f44014e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m45962W(e0Var, 128L)) {
            hVar.f44010a.f43810i = e0Var.f43810i;
            int i11 = a.f43981c[e0Var.f43810i.ordinal()];
            if (i11 == 1) {
                hVar.f44014e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                hVar.f44014e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                hVar.f44014e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m45962W(e0Var, 256L)) {
            hVar.f44010a.f43811j = e0Var.f43811j;
            hVar.f44014e.setStrokeMiter(e0Var.f43811j.floatValue());
        }
        if (m45962W(e0Var, 512L)) {
            hVar.f44010a.f43812k = e0Var.f43812k;
        }
        if (m45962W(e0Var, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) {
            hVar.f44010a.f43813l = e0Var.f43813l;
        }
        Typeface typefaceM45998t = null;
        if (m45962W(e0Var, 1536L)) {
            C12319g.p[] pVarArr = hVar.f44010a.f43812k;
            if (pVarArr == null) {
                hVar.f44014e.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fM45886c = hVar.f44010a.f43812k[i13 % length].m45886c(this);
                    fArr[i13] = fM45886c;
                    f10 += fM45886c;
                }
                if (f10 == 0.0f) {
                    hVar.f44014e.setPathEffect(null);
                } else {
                    float fM45886c2 = hVar.f44010a.f43813l.m45886c(this);
                    if (fM45886c2 < 0.0f) {
                        fM45886c2 = (fM45886c2 % f10) + f10;
                    }
                    hVar.f44014e.setPathEffect(new DashPathEffect(fArr, fM45886c2));
                }
            }
        }
        if (m45962W(e0Var, Http2Stream.EMIT_BUFFER_SIZE)) {
            float fM45951Q = m45951Q();
            hVar.f44010a.f43817p = e0Var.f43817p;
            hVar.f44013d.setTextSize(e0Var.f43817p.m45887e(this, fM45951Q));
            hVar.f44014e.setTextSize(e0Var.f43817p.m45887e(this, fM45951Q));
        }
        if (m45962W(e0Var, 8192L)) {
            hVar.f44010a.f43816o = e0Var.f43816o;
        }
        if (m45962W(e0Var, 32768L)) {
            if (e0Var.f43818q.intValue() == -1 && hVar.f44010a.f43818q.intValue() > 100) {
                C12319g.e0 e0Var3 = hVar.f44010a;
                e0Var3.f43818q = Integer.valueOf(e0Var3.f43818q.intValue() - 100);
            } else if (e0Var.f43818q.intValue() != 1 || hVar.f44010a.f43818q.intValue() >= 900) {
                hVar.f44010a.f43818q = e0Var.f43818q;
            } else {
                C12319g.e0 e0Var4 = hVar.f44010a;
                e0Var4.f43818q = Integer.valueOf(e0Var4.f43818q.intValue() + 100);
            }
        }
        if (m45962W(e0Var, 65536L)) {
            hVar.f44010a.f43819r = e0Var.f43819r;
        }
        if (m45962W(e0Var, 106496L)) {
            if (hVar.f44010a.f43816o != null && this.f43973c != null) {
                C12319g.m45840k();
                for (String str : hVar.f44010a.f43816o) {
                    C12319g.e0 e0Var5 = hVar.f44010a;
                    typefaceM45998t = m45998t(str, e0Var5.f43818q, e0Var5.f43819r);
                    if (typefaceM45998t != null) {
                        break;
                    }
                }
            }
            if (typefaceM45998t == null) {
                C12319g.e0 e0Var6 = hVar.f44010a;
                typefaceM45998t = m45998t("serif", e0Var6.f43818q, e0Var6.f43819r);
            }
            hVar.f44013d.setTypeface(typefaceM45998t);
            hVar.f44014e.setTypeface(typefaceM45998t);
        }
        if (m45962W(e0Var, 131072L)) {
            hVar.f44010a.f43820s = e0Var.f43820s;
            Paint paint = hVar.f44013d;
            C12319g.e0.g gVar = e0Var.f43820s;
            C12319g.e0.g gVar2 = C12319g.e0.g.LineThrough;
            paint.setStrikeThruText(gVar == gVar2);
            Paint paint2 = hVar.f44013d;
            C12319g.e0.g gVar3 = e0Var.f43820s;
            C12319g.e0.g gVar4 = C12319g.e0.g.Underline;
            paint2.setUnderlineText(gVar3 == gVar4);
            hVar.f44014e.setStrikeThruText(e0Var.f43820s == gVar2);
            hVar.f44014e.setUnderlineText(e0Var.f43820s == gVar4);
        }
        if (m45962W(e0Var, 68719476736L)) {
            hVar.f44010a.f43821t = e0Var.f43821t;
        }
        if (m45962W(e0Var, 262144L)) {
            hVar.f44010a.f43822u = e0Var.f43822u;
        }
        if (m45962W(e0Var, 524288L)) {
            hVar.f44010a.f43823v = e0Var.f43823v;
        }
        if (m45962W(e0Var, 2097152L)) {
            hVar.f44010a.f43825x = e0Var.f43825x;
        }
        if (m45962W(e0Var, 4194304L)) {
            hVar.f44010a.f43826y = e0Var.f43826y;
        }
        if (m45962W(e0Var, 8388608L)) {
            hVar.f44010a.f43827z = e0Var.f43827z;
        }
        if (m45962W(e0Var, 16777216L)) {
            hVar.f44010a.f43789A = e0Var.f43789A;
        }
        if (m45962W(e0Var, 33554432L)) {
            hVar.f44010a.f43790B = e0Var.f43790B;
        }
        if (m45962W(e0Var, 1048576L)) {
            hVar.f44010a.f43824w = e0Var.f43824w;
        }
        if (m45962W(e0Var, 268435456L)) {
            hVar.f44010a.f43793E = e0Var.f43793E;
        }
        if (m45962W(e0Var, 536870912L)) {
            hVar.f44010a.f43794F = e0Var.f43794F;
        }
        if (m45962W(e0Var, 1073741824L)) {
            hVar.f44010a.f43795G = e0Var.f43795G;
        }
        if (m45962W(e0Var, 67108864L)) {
            hVar.f44010a.f43791C = e0Var.f43791C;
        }
        if (m45962W(e0Var, 134217728L)) {
            hVar.f44010a.f43792D = e0Var.f43792D;
        }
        if (m45962W(e0Var, 8589934592L)) {
            hVar.f44010a.f43798J = e0Var.f43798J;
        }
        if (m45962W(e0Var, 17179869184L)) {
            hVar.f44010a.f43799K = e0Var.f43799K;
        }
        if (m45962W(e0Var, 137438953472L)) {
            hVar.f44010a.f43801M = e0Var.f43801M;
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m45962W(C12319g.e0 e0Var, long j10) {
        return (e0Var.f43802a & j10) != 0;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m45963W0(h hVar, C12319g.l0 l0Var) {
        hVar.f44010a.m45871b(l0Var.f43914b == null);
        C12319g.e0 e0Var = l0Var.f43905e;
        if (e0Var != null) {
            m45961V0(hVar, e0Var);
        }
        if (this.f43973c.m45853n()) {
            for (C12314b.p pVar : this.f43973c.m45845d()) {
                if (C12314b.m45781l(this.f43978h, pVar.f43696a, l0Var)) {
                    m45961V0(hVar, pVar.f43697b);
                }
            }
        }
        C12319g.e0 e0Var2 = l0Var.f43906f;
        if (e0Var2 != null) {
            m45961V0(hVar, e0Var2);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m45964X(boolean z10, C12319g.b bVar, C12319g.m0 m0Var) {
        float fM45887e;
        float f10;
        float fM45887e2;
        float f11;
        String str = m0Var.f43896l;
        if (str != null) {
            m45933H(m0Var, str);
        }
        Boolean bool = m0Var.f43893i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        h hVar = this.f43974d;
        Paint paint = z10 ? hVar.f44013d : hVar.f44014e;
        if (z11) {
            C12319g.b bVarM45955S = m45955S();
            C12319g.p pVar = m0Var.f43909m;
            float fM45888f = pVar != null ? pVar.m45888f(this) : 0.0f;
            C12319g.p pVar2 = m0Var.f43910n;
            fM45887e = pVar2 != null ? pVar2.m45889h(this) : 0.0f;
            C12319g.p pVar3 = m0Var.f43911o;
            float fM45888f2 = pVar3 != null ? pVar3.m45888f(this) : bVarM45955S.f43760c;
            C12319g.p pVar4 = m0Var.f43912p;
            f11 = fM45888f2;
            f10 = fM45888f;
            fM45887e2 = pVar4 != null ? pVar4.m45889h(this) : 0.0f;
        } else {
            C12319g.p pVar5 = m0Var.f43909m;
            float fM45887e3 = pVar5 != null ? pVar5.m45887e(this, 1.0f) : 0.0f;
            C12319g.p pVar6 = m0Var.f43910n;
            fM45887e = pVar6 != null ? pVar6.m45887e(this, 1.0f) : 0.0f;
            C12319g.p pVar7 = m0Var.f43911o;
            float fM45887e4 = pVar7 != null ? pVar7.m45887e(this, 1.0f) : 1.0f;
            C12319g.p pVar8 = m0Var.f43912p;
            f10 = fM45887e3;
            fM45887e2 = pVar8 != null ? pVar8.m45887e(this, 1.0f) : 0.0f;
            f11 = fM45887e4;
        }
        float f12 = fM45887e;
        m45956S0();
        this.f43974d = m45943M(m0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f43758a, bVar.f43759b);
            matrix.preScale(bVar.f43760c, bVar.f43761d);
        }
        Matrix matrix2 = m0Var.f43894j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f43892h.size();
        if (size == 0) {
            m45954R0();
            if (z10) {
                this.f43974d.f44011b = false;
                return;
            } else {
                this.f43974d.f44012c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<C12319g.n0> it = m0Var.f43892h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            C12319g.d0 d0Var = (C12319g.d0) it.next();
            Float f14 = d0Var.f43777h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            m45956S0();
            m45963W0(this.f43974d, d0Var);
            C12319g.e0 e0Var = this.f43974d.f44010a;
            C12319g.f fVar = (C12319g.f) e0Var.f43791C;
            if (fVar == null) {
                fVar = C12319g.f.f43868b;
            }
            iArr[i10] = m45918x(fVar.f43870a, e0Var.f43792D.floatValue());
            i10++;
            m45954R0();
        }
        if ((f10 == f11 && f12 == fM45887e2) || size == 1) {
            m45954R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        C12319g.k kVar = m0Var.f43895k;
        if (kVar != null) {
            if (kVar == C12319g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == C12319g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        m45954R0();
        LinearGradient linearGradient = new LinearGradient(f10, f12, f11, fM45887e2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(m45917w(this.f43974d.f44010a.f43805d.floatValue()));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m45965X0() {
        int iM45918x;
        C12319g.e0 e0Var = this.f43974d.f44010a;
        C12319g.o0 o0Var = e0Var.f43798J;
        if (o0Var instanceof C12319g.f) {
            iM45918x = ((C12319g.f) o0Var).f43870a;
        } else if (!(o0Var instanceof C12319g.g)) {
            return;
        } else {
            iM45918x = e0Var.f43815n.f43870a;
        }
        Float f10 = e0Var.f43799K;
        if (f10 != null) {
            iM45918x = m45918x(iM45918x, f10.floatValue());
        }
        this.f43971a.drawColor(iM45918x);
    }

    /* JADX INFO: renamed from: Y */
    public final Path m45966Y(C12319g.d dVar) {
        C12319g.p pVar = dVar.f43774o;
        float fM45888f = pVar != null ? pVar.m45888f(this) : 0.0f;
        C12319g.p pVar2 = dVar.f43775p;
        float fM45889h = pVar2 != null ? pVar2.m45889h(this) : 0.0f;
        float fM45886c = dVar.f43776q.m45886c(this);
        float f10 = fM45888f - fM45886c;
        float f11 = fM45889h - fM45886c;
        float f12 = fM45888f + fM45886c;
        float f13 = fM45889h + fM45886c;
        if (dVar.f43901h == null) {
            float f14 = 2.0f * fM45886c;
            dVar.f43901h = new C12319g.b(f10, f11, f14, f14);
        }
        float f15 = fM45886c * 0.5522848f;
        Path path = new Path();
        path.moveTo(fM45888f, f11);
        float f16 = fM45888f + f15;
        float f17 = fM45889h - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fM45889h);
        float f18 = fM45889h + f15;
        path.cubicTo(f12, f18, f16, f13, fM45888f, f13);
        float f19 = fM45888f - f15;
        path.cubicTo(f19, f13, f10, f18, f10, fM45889h);
        path.cubicTo(f10, f17, f19, f11, fM45888f, f11);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m45967Y0() {
        Boolean bool = this.f43974d.f44010a.f43790B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final Path m45968Z(C12319g.i iVar) {
        C12319g.p pVar = iVar.f43883o;
        float fM45888f = pVar != null ? pVar.m45888f(this) : 0.0f;
        C12319g.p pVar2 = iVar.f43884p;
        float fM45889h = pVar2 != null ? pVar2.m45889h(this) : 0.0f;
        float fM45888f2 = iVar.f43885q.m45888f(this);
        float fM45889h2 = iVar.f43886r.m45889h(this);
        float f10 = fM45888f - fM45888f2;
        float f11 = fM45889h - fM45889h2;
        float f12 = fM45888f + fM45888f2;
        float f13 = fM45889h + fM45889h2;
        if (iVar.f43901h == null) {
            iVar.f43901h = new C12319g.b(f10, f11, fM45888f2 * 2.0f, 2.0f * fM45889h2);
        }
        float f14 = fM45888f2 * 0.5522848f;
        float f15 = fM45889h2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fM45888f, f11);
        float f16 = fM45888f + f14;
        float f17 = fM45889h - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fM45889h);
        float f18 = fM45889h + f15;
        path.cubicTo(f12, f18, f16, f13, fM45888f, f13);
        float f19 = fM45888f - f14;
        path.cubicTo(f19, f13, f10, f18, f10, fM45889h);
        path.cubicTo(f10, f17, f19, f11, fM45888f, f11);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: a0 */
    public final Path m45969a0(C12319g.q qVar) {
        C12319g.p pVar = qVar.f43924o;
        float fM45888f = pVar == null ? 0.0f : pVar.m45888f(this);
        C12319g.p pVar2 = qVar.f43925p;
        float fM45889h = pVar2 == null ? 0.0f : pVar2.m45889h(this);
        C12319g.p pVar3 = qVar.f43926q;
        float fM45888f2 = pVar3 == null ? 0.0f : pVar3.m45888f(this);
        C12319g.p pVar4 = qVar.f43927r;
        float fM45889h2 = pVar4 != null ? pVar4.m45889h(this) : 0.0f;
        if (qVar.f43901h == null) {
            qVar.f43901h = new C12319g.b(Math.min(fM45888f, fM45888f2), Math.min(fM45889h, fM45889h2), Math.abs(fM45888f2 - fM45888f), Math.abs(fM45889h2 - fM45889h));
        }
        Path path = new Path();
        path.moveTo(fM45888f, fM45889h);
        path.lineTo(fM45888f2, fM45889h2);
        return path;
    }

    /* JADX INFO: renamed from: b0 */
    public final Path m45970b0(C12319g.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f43966o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = zVar.f43966o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (zVar instanceof C12319g.a0) {
            path.close();
        }
        if (zVar.f43901h == null) {
            zVar.f43901h = m45984m(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX INFO: renamed from: c0 */
    public final Path m45971c0(C12319g.b0 b0Var) {
        float fM45888f;
        float fM45889h;
        float fMin;
        C12319g.p pVar;
        float fM45888f2;
        C12319g.p pVar2;
        float fM45889h2;
        float fM45888f3;
        float fM45889h3;
        float f10;
        float f11;
        Path path;
        C12319g.p pVar3 = b0Var.f43766s;
        if (pVar3 == null && b0Var.f43767t == null) {
            fM45888f = 0.0f;
        } else {
            if (pVar3 != null) {
                if (b0Var.f43767t == null) {
                    fM45888f = pVar3.m45888f(this);
                } else {
                    fM45888f = pVar3.m45888f(this);
                    fM45889h = b0Var.f43767t.m45889h(this);
                }
                fMin = Math.min(fM45888f, b0Var.f43764q.m45888f(this) / 2.0f);
                float fMin2 = Math.min(fM45889h, b0Var.f43765r.m45889h(this) / 2.0f);
                pVar = b0Var.f43762o;
                if (pVar != null) {
                    fM45888f2 = pVar.m45888f(this);
                } else {
                    fM45888f2 = 0.0f;
                }
                pVar2 = b0Var.f43763p;
                if (pVar2 != null) {
                    fM45889h2 = pVar2.m45889h(this);
                } else {
                    fM45889h2 = 0.0f;
                }
                fM45888f3 = b0Var.f43764q.m45888f(this);
                fM45889h3 = b0Var.f43765r.m45889h(this);
                if (b0Var.f43901h == null) {
                    b0Var.f43901h = new C12319g.b(fM45888f2, fM45889h2, fM45888f3, fM45889h3);
                }
                f10 = fM45888f3 + fM45888f2;
                f11 = fM45889h2 + fM45889h3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fM45888f2, fM45889h2);
                    path.lineTo(f10, fM45889h2);
                    path.lineTo(f10, f11);
                    path.lineTo(fM45888f2, f11);
                    path.lineTo(fM45888f2, fM45889h2);
                } else {
                    float f12 = fMin * 0.5522848f;
                    float f13 = 0.5522848f * fMin2;
                    float f14 = fM45889h2 + fMin2;
                    path.moveTo(fM45888f2, f14);
                    float f15 = f14 - f13;
                    float f16 = fM45888f2 + fMin;
                    float f17 = f16 - f12;
                    path.cubicTo(fM45888f2, f15, f17, fM45889h2, f16, fM45889h2);
                    float f18 = f10 - fMin;
                    path.lineTo(f18, fM45889h2);
                    float f19 = f18 + f12;
                    path.cubicTo(f19, fM45889h2, f10, f15, f10, f14);
                    float f20 = f11 - fMin2;
                    path.lineTo(f10, f20);
                    float f21 = f20 + f13;
                    path.cubicTo(f10, f21, f19, f11, f18, f11);
                    path.lineTo(f16, f11);
                    float f22 = fM45888f2;
                    path.cubicTo(f17, f11, f22, f21, fM45888f2, f20);
                    path.lineTo(f22, f14);
                }
                path.close();
                return path;
            }
            fM45888f = b0Var.f43767t.m45889h(this);
        }
        fM45889h = fM45888f;
        fMin = Math.min(fM45888f, b0Var.f43764q.m45888f(this) / 2.0f);
        float fMin3 = Math.min(fM45889h, b0Var.f43765r.m45889h(this) / 2.0f);
        pVar = b0Var.f43762o;
        if (pVar != null) {
            fM45888f2 = pVar.m45888f(this);
        } else {
            fM45888f2 = 0.0f;
        }
        pVar2 = b0Var.f43763p;
        if (pVar2 != null) {
            fM45889h2 = pVar2.m45889h(this);
        } else {
            fM45889h2 = 0.0f;
        }
        fM45888f3 = b0Var.f43764q.m45888f(this);
        fM45889h3 = b0Var.f43765r.m45889h(this);
        if (b0Var.f43901h == null) {
            b0Var.f43901h = new C12319g.b(fM45888f2, fM45889h2, fM45888f3, fM45889h3);
        }
        f10 = fM45888f3 + fM45888f2;
        f11 = fM45889h2 + fM45889h3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fM45888f2, fM45889h2);
            path.lineTo(f10, fM45889h2);
            path.lineTo(f10, f11);
            path.lineTo(fM45888f2, f11);
            path.lineTo(fM45888f2, fM45889h2);
        } else {
            path.moveTo(fM45888f2, fM45889h2);
            path.lineTo(f10, fM45889h2);
            path.lineTo(f10, f11);
            path.lineTo(fM45888f2, f11);
            path.lineTo(fM45888f2, fM45889h2);
        }
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: d0 */
    public final Path m45972d0(C12319g.w0 w0Var) {
        List<C12319g.p> list = w0Var.f43754o;
        float fM45889h = 0.0f;
        float fM45888f = (list == null || list.size() == 0) ? 0.0f : w0Var.f43754o.get(0).m45888f(this);
        List<C12319g.p> list2 = w0Var.f43755p;
        float fM45889h2 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f43755p.get(0).m45889h(this);
        List<C12319g.p> list3 = w0Var.f43756q;
        float fM45888f2 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f43756q.get(0).m45888f(this);
        List<C12319g.p> list4 = w0Var.f43757r;
        if (list4 != null && list4.size() != 0) {
            fM45889h = w0Var.f43757r.get(0).m45889h(this);
        }
        if (this.f43974d.f44010a.f43822u != C12319g.e0.f.Start) {
            float fM45986n = m45986n(w0Var);
            if (this.f43974d.f44010a.f43822u == C12319g.e0.f.Middle) {
                fM45986n /= 2.0f;
            }
            fM45888f -= fM45986n;
        }
        if (w0Var.f43901h == null) {
            i iVar = new i(fM45888f, fM45889h2);
            m45928E(w0Var, iVar);
            RectF rectF = iVar.f44021d;
            w0Var.f43901h = new C12319g.b(rectF.left, rectF.top, rectF.width(), iVar.f44021d.height());
        }
        Path path = new Path();
        m45928E(w0Var, new g(fM45888f + fM45888f2, fM45889h2 + fM45889h, path));
        return path;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m45973e0(boolean z10, C12319g.b bVar, C12319g.q0 q0Var) {
        float f10;
        float fM45887e;
        float f11;
        String str = q0Var.f43896l;
        if (str != null) {
            m45933H(q0Var, str);
        }
        Boolean bool = q0Var.f43893i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        h hVar = this.f43974d;
        Paint paint = z10 ? hVar.f44013d : hVar.f44014e;
        if (z11) {
            C12319g.p pVar = new C12319g.p(50.0f, C12319g.d1.percent);
            C12319g.p pVar2 = q0Var.f43928m;
            float fM45888f = pVar2 != null ? pVar2.m45888f(this) : pVar.m45888f(this);
            C12319g.p pVar3 = q0Var.f43929n;
            float fM45889h = pVar3 != null ? pVar3.m45889h(this) : pVar.m45889h(this);
            C12319g.p pVar4 = q0Var.f43930o;
            fM45887e = pVar4 != null ? pVar4.m45886c(this) : pVar.m45886c(this);
            f10 = fM45888f;
            f11 = fM45889h;
        } else {
            C12319g.p pVar5 = q0Var.f43928m;
            float fM45887e2 = pVar5 != null ? pVar5.m45887e(this, 1.0f) : 0.5f;
            C12319g.p pVar6 = q0Var.f43929n;
            float fM45887e3 = pVar6 != null ? pVar6.m45887e(this, 1.0f) : 0.5f;
            C12319g.p pVar7 = q0Var.f43930o;
            f10 = fM45887e2;
            fM45887e = pVar7 != null ? pVar7.m45887e(this, 1.0f) : 0.5f;
            f11 = fM45887e3;
        }
        m45956S0();
        this.f43974d = m45943M(q0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f43758a, bVar.f43759b);
            matrix.preScale(bVar.f43760c, bVar.f43761d);
        }
        Matrix matrix2 = q0Var.f43894j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f43892h.size();
        if (size == 0) {
            m45954R0();
            if (z10) {
                this.f43974d.f44011b = false;
                return;
            } else {
                this.f43974d.f44012c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<C12319g.n0> it = q0Var.f43892h.iterator();
        float f12 = -1.0f;
        while (it.hasNext()) {
            C12319g.d0 d0Var = (C12319g.d0) it.next();
            Float f13 = d0Var.f43777h;
            float fFloatValue = f13 != null ? f13.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f12) {
                fArr[i10] = fFloatValue;
                f12 = fFloatValue;
            } else {
                fArr[i10] = f12;
            }
            m45956S0();
            m45963W0(this.f43974d, d0Var);
            C12319g.e0 e0Var = this.f43974d.f44010a;
            C12319g.f fVar = (C12319g.f) e0Var.f43791C;
            if (fVar == null) {
                fVar = C12319g.f.f43868b;
            }
            iArr[i10] = m45918x(fVar.f43870a, e0Var.f43792D.floatValue());
            i10++;
            m45954R0();
        }
        if (fM45887e == 0.0f || size == 1) {
            m45954R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        C12319g.k kVar = q0Var.f43895k;
        if (kVar != null) {
            if (kVar == C12319g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == C12319g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        m45954R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fM45887e, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(m45917w(this.f43974d.f44010a.f43805d.floatValue()));
    }

    /* JADX INFO: renamed from: f0 */
    public final C12319g.b m45974f0(C12319g.p pVar, C12319g.p pVar2, C12319g.p pVar3, C12319g.p pVar4) {
        float fM45888f = pVar != null ? pVar.m45888f(this) : 0.0f;
        float fM45889h = pVar2 != null ? pVar2.m45889h(this) : 0.0f;
        C12319g.b bVarM45955S = m45955S();
        return new C12319g.b(fM45888f, fM45889h, pVar3 != null ? pVar3.m45888f(this) : bVarM45955S.f43760c, pVar4 != null ? pVar4.m45889h(this) : bVarM45955S.f43761d);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: g0 */
    public final Path m45975g0(C12319g.k0 k0Var, boolean z10) {
        Path pathM45972d0;
        Path pathM45978j;
        this.f43975e.push(this.f43974d);
        h hVar = new h(this.f43974d);
        this.f43974d = hVar;
        m45963W0(hVar, k0Var);
        if (!m45920A() || !m45967Y0()) {
            this.f43974d = this.f43975e.pop();
            return null;
        }
        if (k0Var instanceof C12319g.e1) {
            if (!z10) {
                m45904F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C12319g.e1 e1Var = (C12319g.e1) k0Var;
            C12319g.n0 n0VarM45855p = k0Var.f43913a.m45855p(e1Var.f43863p);
            if (n0VarM45855p == null) {
                m45904F("Use reference '%s' not found", e1Var.f43863p);
                this.f43974d = this.f43975e.pop();
                return null;
            }
            if (!(n0VarM45855p instanceof C12319g.k0)) {
                this.f43974d = this.f43975e.pop();
                return null;
            }
            pathM45972d0 = m45975g0((C12319g.k0) n0VarM45855p, false);
            if (pathM45972d0 == null) {
                return null;
            }
            if (e1Var.f43901h == null) {
                e1Var.f43901h = m45984m(pathM45972d0);
            }
            Matrix matrix = e1Var.f43908o;
            if (matrix != null) {
                pathM45972d0.transform(matrix);
            }
        } else if (k0Var instanceof C12319g.l) {
            C12319g.l lVar = (C12319g.l) k0Var;
            if (k0Var instanceof C12319g.v) {
                pathM45972d0 = new d(((C12319g.v) k0Var).f43950o).m46011f();
                if (k0Var.f43901h == null) {
                    k0Var.f43901h = m45984m(pathM45972d0);
                }
            } else if (k0Var instanceof C12319g.b0) {
                pathM45972d0 = m45971c0((C12319g.b0) k0Var);
            } else if (k0Var instanceof C12319g.d) {
                pathM45972d0 = m45966Y((C12319g.d) k0Var);
            } else if (k0Var instanceof C12319g.i) {
                pathM45972d0 = m45968Z((C12319g.i) k0Var);
            } else {
                pathM45972d0 = k0Var instanceof C12319g.z ? m45970b0((C12319g.z) k0Var) : null;
            }
            if (pathM45972d0 == null) {
                return null;
            }
            if (lVar.f43901h == null) {
                lVar.f43901h = m45984m(pathM45972d0);
            }
            Matrix matrix2 = lVar.f43902n;
            if (matrix2 != null) {
                pathM45972d0.transform(matrix2);
            }
            pathM45972d0.setFillType(m45949P());
        } else {
            if (!(k0Var instanceof C12319g.w0)) {
                m45904F("Invalid %s element found in clipPath definition", k0Var.mo45862n());
                return null;
            }
            C12319g.w0 w0Var = (C12319g.w0) k0Var;
            pathM45972d0 = m45972d0(w0Var);
            if (pathM45972d0 == null) {
                return null;
            }
            Matrix matrix3 = w0Var.f43957s;
            if (matrix3 != null) {
                pathM45972d0.transform(matrix3);
            }
            pathM45972d0.setFillType(m45949P());
        }
        if (this.f43974d.f44010a.f43793E != null && (pathM45978j = m45978j(k0Var, k0Var.f43901h)) != null) {
            pathM45972d0.op(pathM45978j, Path.Op.INTERSECT);
        }
        this.f43974d = this.f43975e.pop();
        return pathM45972d0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m45976h0() {
        this.f43976f.pop();
        this.f43977g.pop();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m45977i0(C12319g.j0 j0Var) {
        this.f43976f.push(j0Var);
        this.f43977g.push(this.f43971a.getMatrix());
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: j */
    public final Path m45978j(C12319g.k0 k0Var, C12319g.b bVar) {
        Path pathM45975g0;
        C12319g.n0 n0VarM45855p = k0Var.f43913a.m45855p(this.f43974d.f44010a.f43793E);
        if (n0VarM45855p == null) {
            m45904F("ClipPath reference '%s' not found", this.f43974d.f44010a.f43793E);
            return null;
        }
        C12319g.e eVar = (C12319g.e) n0VarM45855p;
        this.f43975e.push(this.f43974d);
        this.f43974d = m45943M(eVar);
        Boolean bool = eVar.f43788p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f43758a, bVar.f43759b);
            matrix.preScale(bVar.f43760c, bVar.f43761d);
        }
        Matrix matrix2 = eVar.f43908o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C12319g.n0 n0Var : eVar.f43877i) {
            if ((n0Var instanceof C12319g.k0) && (pathM45975g0 = m45975g0((C12319g.k0) n0Var, true)) != null) {
                path.op(pathM45975g0, Path.Op.UNION);
            }
        }
        if (this.f43974d.f44010a.f43793E != null) {
            if (eVar.f43901h == null) {
                eVar.f43901h = m45984m(path);
            }
            Path pathM45978j = m45978j(eVar, eVar.f43901h);
            if (pathM45978j != null) {
                path.op(pathM45978j, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f43974d = this.f43975e.pop();
        return path;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m45979j0(C12319g.k0 k0Var) {
        m45981k0(k0Var, k0Var.f43901h);
    }

    /* JADX INFO: renamed from: k */
    public final List<c> m45980k(C12319g.q qVar) {
        C12319g.p pVar = qVar.f43924o;
        float fM45888f = pVar != null ? pVar.m45888f(this) : 0.0f;
        C12319g.p pVar2 = qVar.f43925p;
        float fM45889h = pVar2 != null ? pVar2.m45889h(this) : 0.0f;
        C12319g.p pVar3 = qVar.f43926q;
        float fM45888f2 = pVar3 != null ? pVar3.m45888f(this) : 0.0f;
        C12319g.p pVar4 = qVar.f43927r;
        float fM45889h2 = pVar4 != null ? pVar4.m45889h(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f10 = fM45888f2 - fM45888f;
        float f11 = fM45889h2 - fM45889h;
        arrayList.add(new c(fM45888f, fM45889h, f10, f11));
        arrayList.add(new c(fM45888f2, fM45889h2, f10, f11));
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m45981k0(C12319g.k0 k0Var, C12319g.b bVar) {
        if (this.f43974d.f44010a.f43795G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f43971a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f43971a.saveLayer(null, paint2, 31);
            C12319g.s sVar = (C12319g.s) this.f43973c.m45855p(this.f43974d.f44010a.f43795G);
            m45938J0(sVar, k0Var, bVar);
            this.f43971a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f43971a.saveLayer(null, paint3, 31);
            m45938J0(sVar, k0Var, bVar);
            this.f43971a.restore();
            this.f43971a.restore();
        }
        m45954R0();
    }

    /* JADX INFO: renamed from: l */
    public final List<c> m45982l(C12319g.z zVar) {
        int length = zVar.f43966o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar.f43966o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = zVar.f43966o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.m46009a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f43991a, f13 - cVar.f43992b);
            f10 = f12;
            f11 = f13;
        }
        if (!(zVar instanceof C12319g.a0)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = zVar.f43966o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.m46009a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f43991a, f15 - cVar.f43992b);
                cVar2.m46010b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m45983l0(C12319g.n0 n0Var, j jVar) {
        float f10;
        float fM45889h;
        float fM45888f;
        C12319g.e0.f fVarM45947O;
        if (jVar.mo46013a((C12319g.y0) n0Var)) {
            if (n0Var instanceof C12319g.z0) {
                m45956S0();
                m45942L0((C12319g.z0) n0Var);
                m45954R0();
                return;
            }
            if (!(n0Var instanceof C12319g.v0)) {
                if (n0Var instanceof C12319g.u0) {
                    m45956S0();
                    C12319g.u0 u0Var = (C12319g.u0) n0Var;
                    m45963W0(this.f43974d, u0Var);
                    if (m45920A()) {
                        m45994r((C12319g.k0) u0Var.mo45869e());
                        C12319g.n0 n0VarM45855p = n0Var.f43913a.m45855p(u0Var.f43948o);
                        if (n0VarM45855p == null || !(n0VarM45855p instanceof C12319g.y0)) {
                            m45904F("Tref reference '%s' not found", u0Var.f43948o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            m45931G((C12319g.y0) n0VarM45855p, sb2);
                            if (sb2.length() > 0) {
                                jVar.mo46012b(sb2.toString());
                            }
                        }
                    }
                    m45954R0();
                    return;
                }
                return;
            }
            m45919y("TSpan render", new Object[0]);
            m45956S0();
            C12319g.v0 v0Var = (C12319g.v0) n0Var;
            m45963W0(this.f43974d, v0Var);
            if (m45920A()) {
                List<C12319g.p> list = v0Var.f43754o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float fM45889h2 = 0.0f;
                if (z11) {
                    float fM45888f2 = !z10 ? ((f) jVar).f44003b : v0Var.f43754o.get(0).m45888f(this);
                    List<C12319g.p> list2 = v0Var.f43755p;
                    fM45889h = (list2 == null || list2.size() == 0) ? ((f) jVar).f44004c : v0Var.f43755p.get(0).m45889h(this);
                    List<C12319g.p> list3 = v0Var.f43756q;
                    fM45888f = (list3 == null || list3.size() == 0) ? 0.0f : v0Var.f43756q.get(0).m45888f(this);
                    List<C12319g.p> list4 = v0Var.f43757r;
                    if (list4 != null && list4.size() != 0) {
                        fM45889h2 = v0Var.f43757r.get(0).m45889h(this);
                    }
                    f10 = fM45889h2;
                    fM45889h2 = fM45888f2;
                } else {
                    f10 = 0.0f;
                    fM45889h = 0.0f;
                    fM45888f = 0.0f;
                }
                if (z10 && (fVarM45947O = m45947O()) != C12319g.e0.f.Start) {
                    float fM45986n = m45986n(v0Var);
                    if (fVarM45947O == C12319g.e0.f.Middle) {
                        fM45986n /= 2.0f;
                    }
                    fM45889h2 -= fM45986n;
                }
                m45994r((C12319g.k0) v0Var.mo45869e());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f44003b = fM45889h2 + fM45888f;
                    fVar.f44004c = fM45889h + f10;
                }
                boolean zM45985m0 = m45985m0();
                m45928E(v0Var, jVar);
                if (zM45985m0) {
                    m45979j0(v0Var);
                }
            }
            m45954R0();
        }
    }

    /* JADX INFO: renamed from: m */
    public final C12319g.b m45984m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C12319g.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m45985m0() {
        C12319g.n0 n0VarM45855p;
        if (!m45944M0()) {
            return false;
        }
        this.f43971a.saveLayerAlpha(null, m45917w(this.f43974d.f44010a.f43814m.floatValue()), 31);
        this.f43975e.push(this.f43974d);
        h hVar = new h(this.f43974d);
        this.f43974d = hVar;
        String str = hVar.f44010a.f43795G;
        if (str != null && ((n0VarM45855p = this.f43973c.m45855p(str)) == null || !(n0VarM45855p instanceof C12319g.s))) {
            m45904F("Mask reference '%s' not found", this.f43974d.f44010a.f43795G);
            this.f43974d.f44010a.f43795G = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final float m45986n(C12319g.y0 y0Var) {
        k kVar = new k(this, null);
        m45928E(y0Var, kVar);
        return kVar.f44024b;
    }

    /* JADX INFO: renamed from: n0 */
    public final c m45987n0(c cVar, c cVar2, c cVar3) {
        float fM45926D = m45926D(cVar2.f43993c, cVar2.f43994d, cVar2.f43991a - cVar.f43991a, cVar2.f43992b - cVar.f43992b);
        if (fM45926D == 0.0f) {
            fM45926D = m45926D(cVar2.f43993c, cVar2.f43994d, cVar3.f43991a - cVar2.f43991a, cVar3.f43992b - cVar2.f43992b);
        }
        if (fM45926D > 0.0f || (fM45926D == 0.0f && (cVar2.f43993c > 0.0f || cVar2.f43994d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f43993c = -cVar2.f43993c;
        cVar2.f43994d = -cVar2.f43994d;
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Matrix m45988o(C12319g.b bVar, C12319g.b bVar2, C12317e c12317e) {
        int i10;
        float f10;
        float f11;
        Matrix matrix = new Matrix();
        if (c12317e != null && c12317e.m45830a() != null) {
            float f12 = bVar.f43760c / bVar2.f43760c;
            float f13 = bVar.f43761d / bVar2.f43761d;
            float f14 = -bVar2.f43758a;
            float f15 = -bVar2.f43759b;
            if (c12317e.equals(C12317e.f43716d)) {
                matrix.preTranslate(bVar.f43758a, bVar.f43759b);
                matrix.preScale(f12, f13);
                matrix.preTranslate(f14, f15);
                return matrix;
            }
            float fMax = c12317e.m45831b() == C12317e.b.slice ? Math.max(f12, f13) : Math.min(f12, f13);
            float f16 = bVar.f43760c / fMax;
            float f17 = bVar.f43761d / fMax;
            int[] iArr = a.f43979a;
            switch (iArr[c12317e.m45830a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f11 = (bVar2.f43760c - f16) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f11 = bVar2.f43760c - f16;
                    break;
                default:
                    i10 = iArr[c12317e.m45830a().ordinal()];
                    if (i10 == 2) {
                        f10 = (bVar2.f43761d - f17) / 2.0f;
                        f15 -= f10;
                    } else {
                        if (i10 != 3) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    if (i10 != 7) {
                                    }
                                }
                            }
                            f10 = (bVar2.f43761d - f17) / 2.0f;
                            f15 -= f10;
                        }
                        f10 = bVar2.f43761d - f17;
                        f15 -= f10;
                    }
                    matrix.preTranslate(bVar.f43758a, bVar.f43759b);
                    matrix.preScale(fMax, fMax);
                    matrix.preTranslate(f14, f15);
                    break;
            }
            f14 -= f11;
            i10 = iArr[c12317e.m45830a().ordinal()];
            if (i10 == 2) {
                f10 = (bVar2.f43761d - f17) / 2.0f;
                f15 -= f10;
            } else {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                            }
                        }
                    }
                    f10 = (bVar2.f43761d - f17) / 2.0f;
                    f15 -= f10;
                }
                f10 = bVar2.f43761d - f17;
                f15 -= f10;
            }
            matrix.preTranslate(bVar.f43758a, bVar.f43759b);
            matrix.preScale(fMax, fMax);
            matrix.preTranslate(f14, f15);
        }
        return matrix;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m45989o0(C12319g.d dVar) {
        m45919y("Circle render", new Object[0]);
        C12319g.p pVar = dVar.f43776q;
        if (pVar == null || pVar.m45891j()) {
            return;
        }
        m45963W0(this.f43974d, dVar);
        if (m45920A() && m45967Y0()) {
            Matrix matrix = dVar.f43902n;
            if (matrix != null) {
                this.f43971a.concat(matrix);
            }
            Path pathM45966Y = m45966Y(dVar);
            m45960U0(dVar);
            m45994r(dVar);
            m45990p(dVar);
            boolean zM45985m0 = m45985m0();
            if (this.f43974d.f44011b) {
                m45922B(dVar, pathM45966Y);
            }
            if (this.f43974d.f44012c) {
                m45924C(pathM45966Y);
            }
            if (zM45985m0) {
                m45979j0(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m45990p(C12319g.k0 k0Var) {
        m45992q(k0Var, k0Var.f43901h);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m45991p0(C12319g.i iVar) {
        m45919y("Ellipse render", new Object[0]);
        C12319g.p pVar = iVar.f43885q;
        if (pVar == null || iVar.f43886r == null || pVar.m45891j() || iVar.f43886r.m45891j()) {
            return;
        }
        m45963W0(this.f43974d, iVar);
        if (m45920A() && m45967Y0()) {
            Matrix matrix = iVar.f43902n;
            if (matrix != null) {
                this.f43971a.concat(matrix);
            }
            Path pathM45968Z = m45968Z(iVar);
            m45960U0(iVar);
            m45994r(iVar);
            m45990p(iVar);
            boolean zM45985m0 = m45985m0();
            if (this.f43974d.f44011b) {
                m45922B(iVar, pathM45968Z);
            }
            if (this.f43974d.f44012c) {
                m45924C(pathM45968Z);
            }
            if (zM45985m0) {
                m45979j0(iVar);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m45992q(C12319g.k0 k0Var, C12319g.b bVar) {
        Path pathM45978j;
        if (this.f43974d.f44010a.f43793E == null || (pathM45978j = m45978j(k0Var, bVar)) == null) {
            return;
        }
        this.f43971a.clipPath(pathM45978j);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m45993q0(C12319g.m mVar) {
        m45919y("Group render", new Object[0]);
        m45963W0(this.f43974d, mVar);
        if (m45920A()) {
            Matrix matrix = mVar.f43908o;
            if (matrix != null) {
                this.f43971a.concat(matrix);
            }
            m45990p(mVar);
            boolean zM45985m0 = m45985m0();
            m45930F0(mVar, true);
            if (zM45985m0) {
                m45979j0(mVar);
            }
            m45960U0(mVar);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m45994r(C12319g.k0 k0Var) {
        C12319g.o0 o0Var = this.f43974d.f44010a.f43803b;
        if (o0Var instanceof C12319g.u) {
            m46006z(true, k0Var.f43901h, (C12319g.u) o0Var);
        }
        C12319g.o0 o0Var2 = this.f43974d.f44010a.f43806e;
        if (o0Var2 instanceof C12319g.u) {
            m46006z(false, k0Var.f43901h, (C12319g.u) o0Var2);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m45995r0(C12319g.o oVar) {
        C12319g.p pVar;
        String str;
        m45919y("Image render", new Object[0]);
        C12319g.p pVar2 = oVar.f43918s;
        if (pVar2 == null || pVar2.m45891j() || (pVar = oVar.f43919t) == null || pVar.m45891j() || (str = oVar.f43915p) == null) {
            return;
        }
        C12317e c12317e = oVar.f43923o;
        if (c12317e == null) {
            c12317e = C12317e.f43717e;
        }
        Bitmap bitmapM45996s = m45996s(str);
        if (bitmapM45996s == null) {
            C12319g.m45840k();
            return;
        }
        C12319g.b bVar = new C12319g.b(0.0f, 0.0f, bitmapM45996s.getWidth(), bitmapM45996s.getHeight());
        m45963W0(this.f43974d, oVar);
        if (m45920A() && m45967Y0()) {
            Matrix matrix = oVar.f43920u;
            if (matrix != null) {
                this.f43971a.concat(matrix);
            }
            C12319g.p pVar3 = oVar.f43916q;
            float fM45888f = pVar3 != null ? pVar3.m45888f(this) : 0.0f;
            C12319g.p pVar4 = oVar.f43917r;
            this.f43974d.f44015f = new C12319g.b(fM45888f, pVar4 != null ? pVar4.m45889h(this) : 0.0f, oVar.f43918s.m45888f(this), oVar.f43919t.m45888f(this));
            if (!this.f43974d.f44010a.f43823v.booleanValue()) {
                C12319g.b bVar2 = this.f43974d.f44015f;
                m45948O0(bVar2.f43758a, bVar2.f43759b, bVar2.f43760c, bVar2.f43761d);
            }
            oVar.f43901h = this.f43974d.f44015f;
            m45960U0(oVar);
            m45990p(oVar);
            boolean zM45985m0 = m45985m0();
            m45965X0();
            this.f43971a.save();
            this.f43971a.concat(m45988o(this.f43974d.f44015f, bVar, c12317e));
            this.f43971a.drawBitmap(bitmapM45996s, 0.0f, 0.0f, new Paint(this.f43974d.f44010a.f43801M != C12319g.e0.e.optimizeSpeed ? 2 : 0));
            this.f43971a.restore();
            if (zM45985m0) {
                m45979j0(oVar);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final Bitmap m45996s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m45997s0(C12319g.q qVar) {
        m45919y("Line render", new Object[0]);
        m45963W0(this.f43974d, qVar);
        if (m45920A() && m45967Y0() && this.f43974d.f44012c) {
            Matrix matrix = qVar.f43902n;
            if (matrix != null) {
                this.f43971a.concat(matrix);
            }
            Path pathM45969a0 = m45969a0(qVar);
            m45960U0(qVar);
            m45994r(qVar);
            m45990p(qVar);
            boolean zM45985m0 = m45985m0();
            m45924C(pathM45969a0);
            m45936I0(qVar);
            if (zM45985m0) {
                m45979j0(qVar);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final Typeface m45998t(String str, Integer num, C12319g.e0.b bVar) {
        int i10;
        boolean z10 = bVar == C12319g.e0.b.Italic;
        if (num.intValue() > 500) {
            i10 = z10 ? 3 : 1;
        } else {
            i10 = z10 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m45999t0(C12319g.v vVar) {
        m45919y("Path render", new Object[0]);
        if (vVar.f43950o == null) {
            return;
        }
        m45963W0(this.f43974d, vVar);
        if (m45920A() && m45967Y0()) {
            h hVar = this.f43974d;
            if (hVar.f44012c || hVar.f44011b) {
                Matrix matrix = vVar.f43902n;
                if (matrix != null) {
                    this.f43971a.concat(matrix);
                }
                Path pathM46011f = new d(vVar.f43950o).m46011f();
                if (vVar.f43901h == null) {
                    vVar.f43901h = m45984m(pathM46011f);
                }
                m45960U0(vVar);
                m45994r(vVar);
                m45990p(vVar);
                boolean zM45985m0 = m45985m0();
                if (this.f43974d.f44011b) {
                    pathM46011f.setFillType(m45959U());
                    m45922B(vVar, pathM46011f);
                }
                if (this.f43974d.f44012c) {
                    m45924C(pathM46011f);
                }
                m45936I0(vVar);
                if (zM45985m0) {
                    m45979j0(vVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m46000u(C12319g.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof C12319g.l0) && (bool = ((C12319g.l0) n0Var).f43904d) != null) {
            this.f43974d.f44017h = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m46001u0(C12319g.z zVar) {
        m45919y("PolyLine render", new Object[0]);
        m45963W0(this.f43974d, zVar);
        if (m45920A() && m45967Y0()) {
            h hVar = this.f43974d;
            if (hVar.f44012c || hVar.f44011b) {
                Matrix matrix = zVar.f43902n;
                if (matrix != null) {
                    this.f43971a.concat(matrix);
                }
                if (zVar.f43966o.length < 2) {
                    return;
                }
                Path pathM45970b0 = m45970b0(zVar);
                m45960U0(zVar);
                pathM45970b0.setFillType(m45959U());
                m45994r(zVar);
                m45990p(zVar);
                boolean zM45985m0 = m45985m0();
                if (this.f43974d.f44011b) {
                    m45922B(zVar, pathM45970b0);
                }
                if (this.f43974d.f44012c) {
                    m45924C(pathM45970b0);
                }
                m45936I0(zVar);
                if (zM45985m0) {
                    m45979j0(zVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m46002v0(C12319g.a0 a0Var) {
        m45919y("Polygon render", new Object[0]);
        m45963W0(this.f43974d, a0Var);
        if (m45920A() && m45967Y0()) {
            h hVar = this.f43974d;
            if (hVar.f44012c || hVar.f44011b) {
                Matrix matrix = a0Var.f43902n;
                if (matrix != null) {
                    this.f43971a.concat(matrix);
                }
                if (a0Var.f43966o.length < 2) {
                    return;
                }
                Path pathM45970b0 = m45970b0(a0Var);
                m45960U0(a0Var);
                m45994r(a0Var);
                m45990p(a0Var);
                boolean zM45985m0 = m45985m0();
                if (this.f43974d.f44011b) {
                    m45922B(a0Var, pathM45970b0);
                }
                if (this.f43974d.f44012c) {
                    m45924C(pathM45970b0);
                }
                m45936I0(a0Var);
                if (zM45985m0) {
                    m45979j0(a0Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m46003w0(C12319g.b0 b0Var) {
        m45919y("Rect render", new Object[0]);
        C12319g.p pVar = b0Var.f43764q;
        if (pVar == null || b0Var.f43765r == null || pVar.m45891j() || b0Var.f43765r.m45891j()) {
            return;
        }
        m45963W0(this.f43974d, b0Var);
        if (m45920A() && m45967Y0()) {
            Matrix matrix = b0Var.f43902n;
            if (matrix != null) {
                this.f43971a.concat(matrix);
            }
            Path pathM45971c0 = m45971c0(b0Var);
            m45960U0(b0Var);
            m45994r(b0Var);
            m45990p(b0Var);
            boolean zM45985m0 = m45985m0();
            if (this.f43974d.f44011b) {
                m45922B(b0Var, pathM45971c0);
            }
            if (this.f43974d.f44012c) {
                m45924C(pathM45971c0);
            }
            if (zM45985m0) {
                m45979j0(b0Var);
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m46004x0(C12319g.f0 f0Var) {
        m46007z0(f0Var, m45974f0(f0Var.f43871q, f0Var.f43872r, f0Var.f43873s, f0Var.f43874t), f0Var.f43939p, f0Var.f43923o);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m46005y0(C12319g.f0 f0Var, C12319g.b bVar) {
        m46007z0(f0Var, bVar, f0Var.f43939p, f0Var.f43923o);
    }

    /* JADX INFO: renamed from: z */
    public final void m46006z(boolean z10, C12319g.b bVar, C12319g.u uVar) {
        C12319g.n0 n0VarM45855p = this.f43973c.m45855p(uVar.f43946a);
        if (n0VarM45855p == null) {
            m45904F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", uVar.f43946a);
            C12319g.o0 o0Var = uVar.f43947b;
            if (o0Var != null) {
                m45950P0(this.f43974d, z10, o0Var);
                return;
            } else if (z10) {
                this.f43974d.f44011b = false;
                return;
            } else {
                this.f43974d.f44012c = false;
                return;
            }
        }
        if (n0VarM45855p instanceof C12319g.m0) {
            m45964X(z10, bVar, (C12319g.m0) n0VarM45855p);
        } else if (n0VarM45855p instanceof C12319g.q0) {
            m45973e0(z10, bVar, (C12319g.q0) n0VarM45855p);
        } else if (n0VarM45855p instanceof C12319g.c0) {
            m45952Q0(z10, (C12319g.c0) n0VarM45855p);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m46007z0(C12319g.f0 f0Var, C12319g.b bVar, C12319g.b bVar2, C12317e c12317e) {
        m45919y("Svg render", new Object[0]);
        if (bVar.f43760c == 0.0f || bVar.f43761d == 0.0f) {
            return;
        }
        if (c12317e == null && (c12317e = f0Var.f43923o) == null) {
            c12317e = C12317e.f43717e;
        }
        m45963W0(this.f43974d, f0Var);
        if (m45920A()) {
            h hVar = this.f43974d;
            hVar.f44015f = bVar;
            if (!hVar.f44010a.f43823v.booleanValue()) {
                C12319g.b bVar3 = this.f43974d.f44015f;
                m45948O0(bVar3.f43758a, bVar3.f43759b, bVar3.f43760c, bVar3.f43761d);
            }
            m45992q(f0Var, this.f43974d.f44015f);
            if (bVar2 != null) {
                this.f43971a.concat(m45988o(this.f43974d.f44015f, bVar2, c12317e));
                this.f43974d.f44016g = f0Var.f43939p;
            } else {
                Canvas canvas = this.f43971a;
                C12319g.b bVar4 = this.f43974d.f44015f;
                canvas.translate(bVar4.f43758a, bVar4.f43759b);
            }
            boolean zM45985m0 = m45985m0();
            m45965X0();
            m45930F0(f0Var, true);
            if (zM45985m0) {
                m45979j0(f0Var);
            }
            m45960U0(f0Var);
        }
    }

    /* JADX INFO: renamed from: w7.h$k */
    public class k extends j {

        /* JADX INFO: renamed from: b */
        public float f44024b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public k() {
            super(C12320h.this, null);
            this.f44024b = 0.0f;
        }

        @Override // p509w7.C12320h.j
        /* JADX INFO: renamed from: b */
        public void mo46012b(String str) {
            this.f44024b += C12320h.this.f43974d.f44013d.measureText(str);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 w7.h) A[MD:(w7.h):void (m)] (LINE:3) call: w7.h.k.<init>(w7.h):void type: THIS */
        public /* synthetic */ k(C12320h c12320h, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: w7.h$h */
    public class h {

        /* JADX INFO: renamed from: a */
        public C12319g.e0 f44010a;

        /* JADX INFO: renamed from: b */
        public boolean f44011b;

        /* JADX INFO: renamed from: c */
        public boolean f44012c;

        /* JADX INFO: renamed from: d */
        public Paint f44013d;

        /* JADX INFO: renamed from: e */
        public Paint f44014e;

        /* JADX INFO: renamed from: f */
        public C12319g.b f44015f;

        /* JADX INFO: renamed from: g */
        public C12319g.b f44016g;

        /* JADX INFO: renamed from: h */
        public boolean f44017h;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public h() {
            Paint paint = new Paint();
            this.f44013d = paint;
            paint.setFlags(193);
            this.f44013d.setHinting(0);
            this.f44013d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f44013d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f44014e = paint3;
            paint3.setFlags(193);
            this.f44014e.setHinting(0);
            this.f44014e.setStyle(Paint.Style.STROKE);
            this.f44014e.setTypeface(typeface);
            this.f44010a = C12319g.e0.m45870a();
        }

        public h(h hVar) {
            this.f44011b = hVar.f44011b;
            this.f44012c = hVar.f44012c;
            this.f44013d = new Paint(hVar.f44013d);
            this.f44014e = new Paint(hVar.f44014e);
            C12319g.b bVar = hVar.f44015f;
            if (bVar != null) {
                this.f44015f = new C12319g.b(bVar);
            }
            C12319g.b bVar2 = hVar.f44016g;
            if (bVar2 != null) {
                this.f44016g = new C12319g.b(bVar2);
            }
            this.f44017h = hVar.f44017h;
            try {
                this.f44010a = (C12319g.e0) hVar.f44010a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f44010a = C12319g.e0.m45870a();
            }
        }
    }
}
