package x7;

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
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HashSet<String> f36486i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f36487a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x7.g f36488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0752h f36489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Stack<C0752h> f36490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Stack<x7.g.j0> f36491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Stack<Matrix> f36492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x7.b.q f36493h = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36494a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f36495c;

        static {
            int[] iArr = new int[x7.g.e0.d.values().length];
            f36495c = iArr;
            try {
                iArr[x7.g.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36495c[x7.g.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36495c[x7.g.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[x7.g.e0.c.values().length];
            b = iArr2;
            try {
                iArr2[x7.g.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[x7.g.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[x7.g.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[x7.e.a.values().length];
            f36494a = iArr3;
            try {
                iArr3[x7.e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36494a[x7.e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36494a[x7.e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36494a[x7.e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36494a[x7.e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36494a[x7.e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36494a[x7.e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36494a[x7.e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public class b implements x7.g.x {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f36497c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f36502h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<c> f36496a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f36498d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f36499e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f36500f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36501g = -1;

        public b(x7.g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
            if (this.f36502h) {
                this.f36498d.b(this.f36496a.get(this.f36501g));
                this.f36496a.set(this.f36501g, this.f36498d);
                this.f36502h = false;
            }
            c cVar = this.f36498d;
            if (cVar != null) {
                this.f36496a.add(cVar);
            }
        }

        @Override // x7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            this.f36498d.a(f10, f11);
            this.f36496a.add(this.f36498d);
            this.f36498d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f36502h = false;
        }

        @Override // x7.g.x
        public void b(float f10, float f11) {
            if (this.f36502h) {
                this.f36498d.b(this.f36496a.get(this.f36501g));
                this.f36496a.set(this.f36501g, this.f36498d);
                this.f36502h = false;
            }
            c cVar = this.f36498d;
            if (cVar != null) {
                this.f36496a.add(cVar);
            }
            this.b = f10;
            this.f36497c = f11;
            this.f36498d = h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f36501g = this.f36496a.size();
        }

        @Override // x7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f36500f || this.f36499e) {
                this.f36498d.a(f10, f11);
                this.f36496a.add(this.f36498d);
                this.f36499e = false;
            }
            this.f36498d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f36502h = false;
        }

        @Override // x7.g.x
        public void close() {
            this.f36496a.add(this.f36498d);
            e(this.b, this.f36497c);
            this.f36502h = true;
        }

        @Override // x7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f36499e = true;
            this.f36500f = false;
            c cVar = this.f36498d;
            h.h(cVar.f36504a, cVar.b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f36500f = true;
            this.f36502h = false;
        }

        @Override // x7.g.x
        public void e(float f10, float f11) {
            this.f36498d.a(f10, f11);
            this.f36496a.add(this.f36498d);
            h hVar = h.this;
            c cVar = this.f36498d;
            this.f36498d = hVar.new c(f10, f11, f10 - cVar.f36504a, f11 - cVar.b);
            this.f36502h = false;
        }

        public List<c> f() {
            return this.f36496a;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f36504a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f36505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f36506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f36507e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f36505c = 0.0f;
            this.f36506d = 0.0f;
            this.f36504a = f10;
            this.b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f36505c = (float) (((double) f12) / dSqrt);
                this.f36506d = (float) (((double) f13) / dSqrt);
            }
        }

        public void a(float f10, float f11) {
            float f12 = f10 - this.f36504a;
            float f13 = f11 - this.b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f36505c;
            if (f12 != (-f14) || f13 != (-this.f36506d)) {
                this.f36505c = f14 + f12;
                this.f36506d += f13;
            } else {
                this.f36507e = true;
                this.f36505c = -f13;
                this.f36506d = f12;
            }
        }

        public void b(c cVar) {
            float f10 = cVar.f36505c;
            float f11 = this.f36505c;
            if (f10 == (-f11)) {
                float f12 = cVar.f36506d;
                if (f12 == (-this.f36506d)) {
                    this.f36507e = true;
                    this.f36505c = -f12;
                    this.f36506d = cVar.f36505c;
                    return;
                }
            }
            this.f36505c = f11 + f10;
            this.f36506d += cVar.f36506d;
        }

        public String toString() {
            return "(" + this.f36504a + "," + this.b + " " + this.f36505c + "," + this.f36506d + ")";
        }
    }

    public class d implements x7.g.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Path f36509a = new Path();
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f36510c;

        public d(x7.g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
        }

        @Override // x7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            this.f36509a.quadTo(f10, f11, f12, f13);
            this.b = f12;
            this.f36510c = f13;
        }

        @Override // x7.g.x
        public void b(float f10, float f11) {
            this.f36509a.moveTo(f10, f11);
            this.b = f10;
            this.f36510c = f11;
        }

        @Override // x7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f36509a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.b = f14;
            this.f36510c = f15;
        }

        @Override // x7.g.x
        public void close() {
            this.f36509a.close();
        }

        @Override // x7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.b, this.f36510c, f10, f11, f12, z10, z11, f13, f14, this);
            this.b = f13;
            this.f36510c = f14;
        }

        @Override // x7.g.x
        public void e(float f10, float f11) {
            this.f36509a.lineTo(f10, f11);
            this.b = f10;
            this.f36510c = f11;
        }

        public Path f() {
            return this.f36509a;
        }
    }

    public class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Path f36512e;

        public e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f36512e = path;
        }

        @Override // x7.h.f, x7.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f36489d.b) {
                    str2 = str;
                    h.this.f36487a.drawTextOnPath(str2, this.f36512e, this.b, this.f36514c, h.this.f36489d.f36521d);
                } else {
                    str2 = str;
                }
                if (h.this.f36489d.f36520c) {
                    h.this.f36487a.drawTextOnPath(str2, this.f36512e, this.b, this.f36514c, h.this.f36489d.f36522e);
                }
            } else {
                str2 = str;
            }
            this.b += h.this.f36489d.f36521d.measureText(str2);
        }
    }

    public class f extends j {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f36514c;

        public f(float f10, float f11) {
            super(h.this, null);
            this.b = f10;
            this.f36514c = f11;
        }

        @Override // x7.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f36489d.b) {
                    h.this.f36487a.drawText(str, this.b, this.f36514c, h.this.f36489d.f36521d);
                }
                if (h.this.f36489d.f36520c) {
                    h.this.f36487a.drawText(str, this.b, this.f36514c, h.this.f36489d.f36522e);
                }
            }
            this.b += h.this.f36489d.f36521d.measureText(str);
        }
    }

    public class g extends j {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f36516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f36517d;

        public g(float f10, float f11, Path path) {
            super(h.this, null);
            this.b = f10;
            this.f36516c = f11;
            this.f36517d = path;
        }

        @Override // x7.h.j
        public boolean a(x7.g.y0 y0Var) {
            if (!(y0Var instanceof x7.g.z0)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // x7.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f36489d.f36521d.getTextPath(str2, 0, str.length(), this.b, this.f36516c, path);
                this.f36517d.addPath(path);
            } else {
                str2 = str;
            }
            this.b += h.this.f36489d.f36521d.measureText(str2);
        }
    }

    public class i extends j {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f36527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RectF f36528d;

        public i(float f10, float f11) {
            super(h.this, null);
            this.f36528d = new RectF();
            this.b = f10;
            this.f36527c = f11;
        }

        @Override // x7.h.j
        public boolean a(x7.g.y0 y0Var) {
            if (!(y0Var instanceof x7.g.z0)) {
                return true;
            }
            x7.g.z0 z0Var = (x7.g.z0) y0Var;
            x7.g.n0 n0VarP = y0Var.f36433a.p(z0Var.f36483o);
            if (n0VarP == null) {
                h.F("TextPath path reference '%s' not found", z0Var.f36483o);
                return false;
            }
            x7.g.v vVar = (x7.g.v) n0VarP;
            Path pathF = h.this.new d(vVar.f36467o).f();
            Matrix matrix = vVar.f36422n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.f36528d.union(rectF);
            return false;
        }

        @Override // x7.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f36489d.f36521d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.b, this.f36527c);
                this.f36528d.union(rectF);
            }
            this.b += h.this.f36489d.f36521d.measureText(str);
        }
    }

    public abstract class j {
        public j() {
        }

        public boolean a(x7.g.y0 y0Var) {
            return true;
        }

        public abstract void b(String str);

        public /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    public h(Canvas canvas, float f10) {
        this.f36487a = canvas;
        this.b = f10;
    }

    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static synchronized void V() {
        HashSet<String> hashSet = new HashSet<>();
        f36486i = hashSet;
        hashSet.add("Structure");
        f36486i.add("BasicStructure");
        f36486i.add("ConditionalProcessing");
        f36486i.add("Image");
        f36486i.add("Style");
        f36486i.add("ViewportAttribute");
        f36486i.add("Shape");
        f36486i.add("BasicText");
        f36486i.add("PaintAttribute");
        f36486i.add("BasicPaintAttribute");
        f36486i.add("OpacityAttribute");
        f36486i.add("BasicGraphicsAttribute");
        f36486i.add("Marker");
        f36486i.add("Gradient");
        f36486i.add("Pattern");
        f36486i.add("Clip");
        f36486i.add("BasicClip");
        f36486i.add("Mask");
        f36486i.add("View");
    }

    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, x7.g.x xVar) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            xVar.e(f15, f16);
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
        double dV = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && dV > 0.0d) {
            dV -= 6.283185307179586d;
        } else if (z11 && dV < 0.0d) {
            dV += 6.283185307179586d;
        }
        float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrI);
        fArrI[fArrI.length - 2] = f15;
        fArrI[fArrI.length - 1] = f16;
        for (int i10 = 0; i10 < fArrI.length; i10 += 6) {
            xVar.c(fArrI[i10], fArrI[i10 + 1], fArrI[i10 + 2], fArrI[i10 + 3], fArrI[i10 + 4], fArrI[i10 + 5]);
        }
    }

    public static float[] i(double d10, double d11) {
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

    public static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    public static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    public static int x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    public static void y(String str, Object... objArr) {
    }

    public final boolean A() {
        Boolean bool = this.f36489d.f36519a.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void A0(x7.g.n0 n0Var) {
        if (n0Var instanceof x7.g.t) {
            return;
        }
        S0();
        u(n0Var);
        if (n0Var instanceof x7.g.f0) {
            x0((x7.g.f0) n0Var);
        } else if (n0Var instanceof x7.g.e1) {
            E0((x7.g.e1) n0Var);
        } else if (n0Var instanceof x7.g.s0) {
            B0((x7.g.s0) n0Var);
        } else if (n0Var instanceof x7.g.m) {
            q0((x7.g.m) n0Var);
        } else if (n0Var instanceof x7.g.o) {
            r0((x7.g.o) n0Var);
        } else if (n0Var instanceof x7.g.v) {
            t0((x7.g.v) n0Var);
        } else if (n0Var instanceof x7.g.b0) {
            w0((x7.g.b0) n0Var);
        } else if (n0Var instanceof x7.g.d) {
            o0((x7.g.d) n0Var);
        } else if (n0Var instanceof x7.g.i) {
            p0((x7.g.i) n0Var);
        } else if (n0Var instanceof x7.g.q) {
            s0((x7.g.q) n0Var);
        } else if (n0Var instanceof x7.g.a0) {
            v0((x7.g.a0) n0Var);
        } else if (n0Var instanceof x7.g.z) {
            u0((x7.g.z) n0Var);
        } else if (n0Var instanceof x7.g.w0) {
            D0((x7.g.w0) n0Var);
        }
        R0();
    }

    public final void B(x7.g.k0 k0Var, Path path) {
        x7.g.o0 o0Var = this.f36489d.f36519a.b;
        if (o0Var instanceof x7.g.u) {
            x7.g.n0 n0VarP = this.f36488c.p(((x7.g.u) o0Var).f36464a);
            if (n0VarP instanceof x7.g.y) {
                L(k0Var, path, (x7.g.y) n0VarP);
                return;
            }
        }
        this.f36487a.drawPath(path, this.f36489d.f36521d);
    }

    public final void B0(x7.g.s0 s0Var) {
        y("Switch render", new Object[0]);
        W0(this.f36489d, s0Var);
        if (A()) {
            Matrix matrix = s0Var.f36428o;
            if (matrix != null) {
                this.f36487a.concat(matrix);
            }
            p(s0Var);
            boolean zM0 = m0();
            K0(s0Var);
            if (zM0) {
                j0(s0Var);
            }
            U0(s0Var);
        }
    }

    public final void C(Path path) {
        C0752h c0752h = this.f36489d;
        if (c0752h.f36519a.L != x7.g.e0.i.NonScalingStroke) {
            this.f36487a.drawPath(path, c0752h.f36522e);
            return;
        }
        Matrix matrix = this.f36487a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f36487a.setMatrix(new Matrix());
        Shader shader = this.f36489d.f36522e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f36487a.drawPath(path2, this.f36489d.f36522e);
        this.f36487a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void C0(x7.g.t0 t0Var, x7.g.b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.f36307c == 0.0f || bVar.f36308d == 0.0f) {
            return;
        }
        x7.e eVar = t0Var.f36441o;
        if (eVar == null) {
            eVar = x7.e.f36270e;
        }
        W0(this.f36489d, t0Var);
        C0752h c0752h = this.f36489d;
        c0752h.f36523f = bVar;
        if (!c0752h.f36519a.f36354v.booleanValue()) {
            x7.g.b bVar2 = this.f36489d.f36523f;
            O0(bVar2.f36306a, bVar2.b, bVar2.f36307c, bVar2.f36308d);
        }
        x7.g.b bVar3 = t0Var.f36457p;
        if (bVar3 != null) {
            this.f36487a.concat(o(this.f36489d.f36523f, bVar3, eVar));
            this.f36489d.f36524g = t0Var.f36457p;
        } else {
            Canvas canvas = this.f36487a;
            x7.g.b bVar4 = this.f36489d.f36523f;
            canvas.translate(bVar4.f36306a, bVar4.b);
        }
        boolean zM0 = m0();
        F0(t0Var, true);
        if (zM0) {
            j0(t0Var);
        }
        U0(t0Var);
    }

    public final float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    public final void D0(x7.g.w0 w0Var) {
        y("Text render", new Object[0]);
        W0(this.f36489d, w0Var);
        if (A()) {
            Matrix matrix = w0Var.f36473s;
            if (matrix != null) {
                this.f36487a.concat(matrix);
            }
            List<x7.g.p> list = w0Var.f36302o;
            float fI = 0.0f;
            float f10 = (list == null || list.size() == 0) ? 0.0f : w0Var.f36302o.get(0).f(this);
            List<x7.g.p> list2 = w0Var.f36303p;
            float fI2 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f36303p.get(0).i(this);
            List<x7.g.p> list3 = w0Var.f36304q;
            float f11 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f36304q.get(0).f(this);
            List<x7.g.p> list4 = w0Var.f36305r;
            if (list4 != null && list4.size() != 0) {
                fI = w0Var.f36305r.get(0).i(this);
            }
            x7.g.e0.f fVarO = O();
            if (fVarO != x7.g.e0.f.Start) {
                float fN = n(w0Var);
                if (fVarO == x7.g.e0.f.Middle) {
                    fN /= 2.0f;
                }
                f10 -= fN;
            }
            if (w0Var.f36421h == null) {
                i iVar = new i(f10, fI2);
                E(w0Var, iVar);
                RectF rectF = iVar.f36528d;
                w0Var.f36421h = new x7.g.b(rectF.left, rectF.top, rectF.width(), iVar.f36528d.height());
            }
            U0(w0Var);
            r(w0Var);
            p(w0Var);
            boolean zM0 = m0();
            E(w0Var, new f(f10 + f11, fI2 + fI));
            if (zM0) {
                j0(w0Var);
            }
        }
    }

    public final void E(x7.g.y0 y0Var, j jVar) {
        if (A()) {
            Iterator<x7.g.n0> it = y0Var.f36398i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                x7.g.n0 next = it.next();
                if (next instanceof x7.g.c1) {
                    jVar.b(T0(((x7.g.c1) next).f36318c, z10, !it.hasNext()));
                } else {
                    l0(next, jVar);
                }
                z10 = false;
            }
        }
    }

    public final void E0(x7.g.e1 e1Var) {
        y("Use render", new Object[0]);
        x7.g.p pVar = e1Var.f36388s;
        if (pVar == null || !pVar.l()) {
            x7.g.p pVar2 = e1Var.f36389t;
            if (pVar2 == null || !pVar2.l()) {
                W0(this.f36489d, e1Var);
                if (A()) {
                    x7.g.n0 n0VarP = e1Var.f36433a.p(e1Var.f36385p);
                    if (n0VarP == null) {
                        F("Use reference '%s' not found", e1Var.f36385p);
                        return;
                    }
                    Matrix matrix = e1Var.f36428o;
                    if (matrix != null) {
                        this.f36487a.concat(matrix);
                    }
                    x7.g.p pVar3 = e1Var.f36386q;
                    float f10 = pVar3 != null ? pVar3.f(this) : 0.0f;
                    x7.g.p pVar4 = e1Var.f36387r;
                    this.f36487a.translate(f10, pVar4 != null ? pVar4.i(this) : 0.0f);
                    p(e1Var);
                    boolean zM0 = m0();
                    i0(e1Var);
                    if (n0VarP instanceof x7.g.f0) {
                        x7.g.b bVarF0 = f0(null, null, e1Var.f36388s, e1Var.f36389t);
                        S0();
                        y0((x7.g.f0) n0VarP, bVarF0);
                        R0();
                    } else if (n0VarP instanceof x7.g.t0) {
                        x7.g.p pVar5 = e1Var.f36388s;
                        if (pVar5 == null) {
                            pVar5 = new x7.g.p(100.0f, x7.g.d1.percent);
                        }
                        x7.g.p pVar6 = e1Var.f36389t;
                        if (pVar6 == null) {
                            pVar6 = new x7.g.p(100.0f, x7.g.d1.percent);
                        }
                        x7.g.b bVarF1 = f0(null, null, pVar5, pVar6);
                        S0();
                        C0((x7.g.t0) n0VarP, bVarF1);
                        R0();
                    } else {
                        A0(n0VarP);
                    }
                    h0();
                    if (zM0) {
                        j0(e1Var);
                    }
                    U0(e1Var);
                }
            }
        }
    }

    public final void F0(x7.g.j0 j0Var, boolean z10) {
        if (z10) {
            i0(j0Var);
        }
        Iterator<x7.g.n0> it = j0Var.getChildren().iterator();
        while (it.hasNext()) {
            A0(it.next());
        }
        if (z10) {
            h0();
        }
    }

    public final void G(x7.g.y0 y0Var, StringBuilder sb2) {
        Iterator<x7.g.n0> it = y0Var.f36398i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            x7.g.n0 next = it.next();
            if (next instanceof x7.g.y0) {
                G((x7.g.y0) next, sb2);
            } else if (next instanceof x7.g.c1) {
                sb2.append(T0(((x7.g.c1) next).f36318c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public void G0(x7.g gVar, x7.f fVar) {
        x7.g.b bVar;
        x7.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f36488c = gVar;
        x7.g.f0 f0VarM = gVar.m();
        if (f0VarM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.e()) {
            x7.g.l0 l0VarI = this.f36488c.i(fVar.f36293e);
            if (l0VarI == null || !(l0VarI instanceof x7.g.f1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f36293e));
                return;
            }
            x7.g.f1 f1Var = (x7.g.f1) l0VarI;
            bVar = f1Var.f36457p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f36293e));
                return;
            }
            eVar = f1Var.f36441o;
        } else {
            bVar = fVar.f() ? fVar.f36292d : f0VarM.f36457p;
            eVar = fVar.c() ? fVar.b : f0VarM.f36441o;
        }
        if (fVar.b()) {
            gVar.a(fVar.f36290a);
        }
        if (fVar.d()) {
            x7.b.q qVar = new x7.b.q();
            this.f36493h = qVar;
            qVar.f36257a = gVar.i(fVar.f36291c);
        }
        N0();
        u(f0VarM);
        S0();
        x7.g.b bVar2 = new x7.g.b(fVar.f36294f);
        x7.g.p pVar = f0VarM.f36394s;
        if (pVar != null) {
            bVar2.f36307c = pVar.e(this, bVar2.f36307c);
        }
        x7.g.p pVar2 = f0VarM.f36395t;
        if (pVar2 != null) {
            bVar2.f36308d = pVar2.e(this, bVar2.f36308d);
        }
        z0(f0VarM, bVar2, bVar, eVar);
        R0();
        if (fVar.b()) {
            gVar.b();
        }
    }

    public final void H(x7.g.j jVar, String str) {
        x7.g.n0 n0VarP = jVar.f36433a.p(str);
        if (n0VarP == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(n0VarP instanceof x7.g.j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (n0VarP == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        x7.g.j jVar2 = (x7.g.j) n0VarP;
        if (jVar.f36414i == null) {
            jVar.f36414i = jVar2.f36414i;
        }
        if (jVar.f36415j == null) {
            jVar.f36415j = jVar2.f36415j;
        }
        if (jVar.f36416k == null) {
            jVar.f36416k = jVar2.f36416k;
        }
        if (jVar.f36413h.isEmpty()) {
            jVar.f36413h = jVar2.f36413h;
        }
        try {
            if (jVar instanceof x7.g.m0) {
                I((x7.g.m0) jVar, (x7.g.m0) n0VarP);
            } else {
                J((x7.g.q0) jVar, (x7.g.q0) n0VarP);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f36417l;
        if (str2 != null) {
            H(jVar, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(x7.g.r rVar, c cVar) {
        float fFloatValue;
        float f10;
        float f11;
        float f12;
        S0();
        Float f13 = rVar.f36456v;
        float f14 = 0.0f;
        if (f13 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f13.floatValue())) {
            float f15 = cVar.f36505c;
            if (f15 == 0.0f && cVar.f36506d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(cVar.f36506d, f15));
            }
        } else {
            fFloatValue = rVar.f36456v.floatValue();
        }
        float fB = rVar.f36451q ? 1.0f : this.f36489d.f36519a.f36339g.b(this.b);
        this.f36489d = M(rVar);
        Matrix matrix = new Matrix();
        matrix.preTranslate(cVar.f36504a, cVar.b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fB, fB);
        x7.g.p pVar = rVar.f36452r;
        float f16 = pVar != null ? pVar.f(this) : 0.0f;
        x7.g.p pVar2 = rVar.f36453s;
        float fI = pVar2 != null ? pVar2.i(this) : 0.0f;
        x7.g.p pVar3 = rVar.f36454t;
        float f17 = pVar3 != null ? pVar3.f(this) : 3.0f;
        x7.g.p pVar4 = rVar.f36455u;
        float fI2 = pVar4 != null ? pVar4.i(this) : 3.0f;
        x7.g.b bVar = rVar.f36457p;
        if (bVar != null) {
            float fMax = f17 / bVar.f36307c;
            float f18 = fI2 / bVar.f36308d;
            x7.e eVar = rVar.f36441o;
            if (eVar == null) {
                eVar = x7.e.f36270e;
            }
            if (!eVar.equals(x7.e.f36269d)) {
                fMax = eVar.b() == x7.e.b.slice ? Math.max(fMax, f18) : Math.min(fMax, f18);
                f18 = fMax;
            }
            matrix.preTranslate((-f16) * fMax, (-fI) * f18);
            this.f36487a.concat(matrix);
            x7.g.b bVar2 = rVar.f36457p;
            float f19 = bVar2.f36307c * fMax;
            float f20 = bVar2.f36308d * f18;
            int[] iArr = a.f36494a;
            switch (iArr[eVar.a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f10 = (f17 - f19) / 2.0f;
                    f11 = 0.0f - f10;
                    break;
                case 4:
                case 5:
                case 6:
                    f10 = f17 - f19;
                    f11 = 0.0f - f10;
                    break;
                default:
                    f11 = 0.0f;
                    break;
            }
            int i10 = iArr[eVar.a().ordinal()];
            if (i10 == 2) {
                f12 = (fI2 - f20) / 2.0f;
                f14 = 0.0f - f12;
            } else {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                            }
                        }
                    }
                    f12 = (fI2 - f20) / 2.0f;
                    f14 = 0.0f - f12;
                }
                f12 = fI2 - f20;
                f14 = 0.0f - f12;
            }
            if (!this.f36489d.f36519a.f36354v.booleanValue()) {
                O0(f11, f14, f17, fI2);
            }
            matrix.reset();
            matrix.preScale(fMax, f18);
            this.f36487a.concat(matrix);
        } else {
            matrix.preTranslate(-f16, -fI);
            this.f36487a.concat(matrix);
            if (!this.f36489d.f36519a.f36354v.booleanValue()) {
                O0(0.0f, 0.0f, f17, fI2);
            }
        }
        boolean zM0 = m0();
        F0(rVar, false);
        if (zM0) {
            j0(rVar);
        }
        R0();
    }

    public final void I(x7.g.m0 m0Var, x7.g.m0 m0Var2) {
        if (m0Var.f36429m == null) {
            m0Var.f36429m = m0Var2.f36429m;
        }
        if (m0Var.f36430n == null) {
            m0Var.f36430n = m0Var2.f36430n;
        }
        if (m0Var.f36431o == null) {
            m0Var.f36431o = m0Var2.f36431o;
        }
        if (m0Var.f36432p == null) {
            m0Var.f36432p = m0Var2.f36432p;
        }
    }

    public final void I0(x7.g.l lVar) {
        x7.g.r rVar;
        x7.g.r rVar2;
        x7.g.r rVar3;
        List<c> listK;
        int size;
        x7.g.e0 e0Var = this.f36489d.f36519a;
        String str = e0Var.f36356x;
        if (str == null && e0Var.f36357y == null && e0Var.f36358z == null) {
            return;
        }
        if (str == null) {
            rVar = null;
        } else {
            x7.g.n0 n0VarP = lVar.f36433a.p(str);
            if (n0VarP != null) {
                rVar = (x7.g.r) n0VarP;
            } else {
                F("Marker reference '%s' not found", this.f36489d.f36519a.f36356x);
                rVar = null;
            }
        }
        String str2 = this.f36489d.f36519a.f36357y;
        if (str2 == null) {
            rVar2 = null;
        } else {
            x7.g.n0 n0VarP2 = lVar.f36433a.p(str2);
            if (n0VarP2 != null) {
                rVar2 = (x7.g.r) n0VarP2;
            } else {
                F("Marker reference '%s' not found", this.f36489d.f36519a.f36357y);
                rVar2 = null;
            }
        }
        String str3 = this.f36489d.f36519a.f36358z;
        if (str3 == null) {
            rVar3 = null;
        } else {
            x7.g.n0 n0VarP3 = lVar.f36433a.p(str3);
            if (n0VarP3 != null) {
                rVar3 = (x7.g.r) n0VarP3;
            } else {
                F("Marker reference '%s' not found", this.f36489d.f36519a.f36358z);
                rVar3 = null;
            }
        }
        if (lVar instanceof x7.g.v) {
            listK = new b(((x7.g.v) lVar).f36467o).f();
        } else {
            listK = lVar instanceof x7.g.q ? k((x7.g.q) lVar) : l((x7.g.z) lVar);
        }
        if (listK == null || (size = listK.size()) == 0) {
            return;
        }
        x7.g.e0 e0Var2 = this.f36489d.f36519a;
        e0Var2.f36358z = null;
        e0Var2.f36357y = null;
        e0Var2.f36356x = null;
        if (rVar != null) {
            H0(rVar, listK.get(0));
        }
        if (rVar2 != null && listK.size() > 2) {
            c cVarN0 = listK.get(0);
            c cVar = listK.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = listK.get(i10);
                cVarN0 = cVar.f36507e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(rVar2, cVarN0);
                cVar = cVar2;
            }
        }
        if (rVar3 != null) {
            H0(rVar3, listK.get(size - 1));
        }
    }

    public final void J(x7.g.q0 q0Var, x7.g.q0 q0Var2) {
        if (q0Var.f36446m == null) {
            q0Var.f36446m = q0Var2.f36446m;
        }
        if (q0Var.f36447n == null) {
            q0Var.f36447n = q0Var2.f36447n;
        }
        if (q0Var.f36448o == null) {
            q0Var.f36448o = q0Var2.f36448o;
        }
        if (q0Var.f36449p == null) {
            q0Var.f36449p = q0Var2.f36449p;
        }
        if (q0Var.f36450q == null) {
            q0Var.f36450q = q0Var2.f36450q;
        }
    }

    public final void J0(x7.g.s sVar, x7.g.k0 k0Var, x7.g.b bVar) {
        float f10;
        float fI;
        y("Mask render", new Object[0]);
        Boolean bool = sVar.f36458o;
        if (bool == null || !bool.booleanValue()) {
            x7.g.p pVar = sVar.f36462s;
            float fE = pVar != null ? pVar.e(this, 1.0f) : 1.2f;
            x7.g.p pVar2 = sVar.f36463t;
            float fE2 = pVar2 != null ? pVar2.e(this, 1.0f) : 1.2f;
            f10 = fE * bVar.f36307c;
            fI = fE2 * bVar.f36308d;
        } else {
            x7.g.p pVar3 = sVar.f36462s;
            f10 = pVar3 != null ? pVar3.f(this) : bVar.f36307c;
            x7.g.p pVar4 = sVar.f36463t;
            fI = pVar4 != null ? pVar4.i(this) : bVar.f36308d;
        }
        if (f10 == 0.0f || fI == 0.0f) {
            return;
        }
        S0();
        C0752h c0752hM = M(sVar);
        this.f36489d = c0752hM;
        c0752hM.f36519a.f36345m = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f36487a.save();
        Boolean bool2 = sVar.f36459p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f36487a.translate(bVar.f36306a, bVar.b);
            this.f36487a.scale(bVar.f36307c, bVar.f36308d);
        }
        F0(sVar, false);
        this.f36487a.restore();
        if (zM0) {
            k0(k0Var, bVar);
        }
        R0();
    }

    public final void K(x7.g.y yVar, String str) {
        x7.g.n0 n0VarP = yVar.f36433a.p(str);
        if (n0VarP == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(n0VarP instanceof x7.g.y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n0VarP == yVar) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        x7.g.y yVar2 = (x7.g.y) n0VarP;
        if (yVar.f36474q == null) {
            yVar.f36474q = yVar2.f36474q;
        }
        if (yVar.f36475r == null) {
            yVar.f36475r = yVar2.f36475r;
        }
        if (yVar.f36476s == null) {
            yVar.f36476s = yVar2.f36476s;
        }
        if (yVar.f36477t == null) {
            yVar.f36477t = yVar2.f36477t;
        }
        if (yVar.f36478u == null) {
            yVar.f36478u = yVar2.f36478u;
        }
        if (yVar.f36479v == null) {
            yVar.f36479v = yVar2.f36479v;
        }
        if (yVar.f36480w == null) {
            yVar.f36480w = yVar2.f36480w;
        }
        if (yVar.f36398i.isEmpty()) {
            yVar.f36398i = yVar2.f36398i;
        }
        if (yVar.f36457p == null) {
            yVar.f36457p = yVar2.f36457p;
        }
        if (yVar.f36441o == null) {
            yVar.f36441o = yVar2.f36441o;
        }
        String str2 = yVar2.f36481x;
        if (str2 != null) {
            K(yVar, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(x7.g.s0 s0Var) {
        Set<String> setA;
        String language = Locale.getDefault().getLanguage();
        x7.g.k();
        for (x7.g.n0 n0Var : s0Var.getChildren()) {
            if (n0Var instanceof x7.g.g0) {
                x7.g.g0 g0Var = (x7.g.g0) n0Var;
                if (g0Var.b() == null && ((setA = g0Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                    Set<String> setF = g0Var.f();
                    if (setF != null) {
                        if (f36486i == null) {
                            V();
                        }
                        if (setF.isEmpty() || !f36486i.containsAll(setF)) {
                        }
                    }
                    Set<String> setL = g0Var.l();
                    if (setL != null) {
                        setL.isEmpty();
                    } else {
                        Set<String> setM = g0Var.m();
                        if (setM == null) {
                            A0(n0Var);
                            return;
                        }
                        setM.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    public final void L(x7.g.k0 k0Var, Path path, x7.g.y yVar) {
        float f10;
        float fI;
        float fI2;
        float f11;
        boolean z10;
        boolean z11;
        Boolean bool = yVar.f36474q;
        boolean z12 = bool != null && bool.booleanValue();
        String str = yVar.f36481x;
        if (str != null) {
            K(yVar, str);
        }
        if (z12) {
            x7.g.p pVar = yVar.f36477t;
            f10 = pVar != null ? pVar.f(this) : 0.0f;
            x7.g.p pVar2 = yVar.f36478u;
            fI2 = pVar2 != null ? pVar2.i(this) : 0.0f;
            x7.g.p pVar3 = yVar.f36479v;
            f11 = pVar3 != null ? pVar3.f(this) : 0.0f;
            x7.g.p pVar4 = yVar.f36480w;
            fI = pVar4 != null ? pVar4.i(this) : 0.0f;
        } else {
            x7.g.p pVar5 = yVar.f36477t;
            float fE = pVar5 != null ? pVar5.e(this, 1.0f) : 0.0f;
            x7.g.p pVar6 = yVar.f36478u;
            float fE2 = pVar6 != null ? pVar6.e(this, 1.0f) : 0.0f;
            x7.g.p pVar7 = yVar.f36479v;
            float fE3 = pVar7 != null ? pVar7.e(this, 1.0f) : 0.0f;
            x7.g.p pVar8 = yVar.f36480w;
            float fE4 = pVar8 != null ? pVar8.e(this, 1.0f) : 0.0f;
            x7.g.b bVar = k0Var.f36421h;
            float f12 = bVar.f36306a;
            float f13 = bVar.f36307c;
            f10 = (fE * f13) + f12;
            float f14 = bVar.b;
            float f15 = bVar.f36308d;
            float f16 = fE3 * f13;
            fI = fE4 * f15;
            fI2 = (fE2 * f15) + f14;
            f11 = f16;
        }
        if (f11 == 0.0f || fI == 0.0f) {
            return;
        }
        x7.e eVar = yVar.f36441o;
        if (eVar == null) {
            eVar = x7.e.f36270e;
        }
        S0();
        this.f36487a.clipPath(path);
        C0752h c0752h = new C0752h();
        V0(c0752h, x7.g.e0.a());
        c0752h.f36519a.f36354v = Boolean.FALSE;
        this.f36489d = N(yVar, c0752h);
        x7.g.b bVar2 = k0Var.f36421h;
        Matrix matrix = yVar.f36476s;
        if (matrix != null) {
            this.f36487a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (yVar.f36476s.invert(matrix2)) {
                x7.g.b bVar3 = k0Var.f36421h;
                float f17 = bVar3.f36306a;
                float f18 = bVar3.b;
                float fB = bVar3.b();
                x7.g.b bVar4 = k0Var.f36421h;
                z10 = false;
                float f19 = bVar4.b;
                float fB2 = bVar4.b();
                z11 = true;
                float fC = k0Var.f36421h.c();
                x7.g.b bVar5 = k0Var.f36421h;
                float[] fArr = {f17, f18, fB, f19, fB2, fC, bVar5.f36306a, bVar5.c()};
                matrix2.mapPoints(fArr);
                float f20 = fArr[0];
                float f21 = fArr[1];
                RectF rectF = new RectF(f20, f21, f20, f21);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f22 = fArr[i10];
                    if (f22 < rectF.left) {
                        rectF.left = f22;
                    }
                    if (f22 > rectF.right) {
                        rectF.right = f22;
                    }
                    float f23 = fArr[i10 + 1];
                    if (f23 < rectF.top) {
                        rectF.top = f23;
                    }
                    if (f23 > rectF.bottom) {
                        rectF.bottom = f23;
                    }
                }
                float f24 = rectF.left;
                float f25 = rectF.top;
                bVar2 = new x7.g.b(f24, f25, rectF.right - f24, rectF.bottom - f25);
            } else {
                z10 = false;
                z11 = true;
            }
        } else {
            z10 = false;
            z11 = true;
        }
        float fFloor = f10 + (((float) Math.floor((bVar2.f36306a - f10) / f11)) * f11);
        float fB3 = bVar2.b();
        float fC2 = bVar2.c();
        x7.g.b bVar6 = new x7.g.b(0.0f, 0.0f, f11, fI);
        boolean zM0 = m0();
        for (float fFloor2 = fI2 + (((float) Math.floor((bVar2.b - fI2) / fI)) * fI); fFloor2 < fC2; fFloor2 += fI) {
            float f26 = fFloor;
            while (f26 < fB3) {
                bVar6.f36306a = f26;
                bVar6.b = fFloor2;
                S0();
                if (!this.f36489d.f36519a.f36354v.booleanValue()) {
                    O0(bVar6.f36306a, bVar6.b, bVar6.f36307c, bVar6.f36308d);
                }
                x7.g.b bVar7 = yVar.f36457p;
                if (bVar7 != null) {
                    this.f36487a.concat(o(bVar6, bVar7, eVar));
                } else {
                    Boolean bool2 = yVar.f36475r;
                    boolean z13 = (bool2 == null || bool2.booleanValue()) ? z11 : z10;
                    this.f36487a.translate(f26, fFloor2);
                    if (!z13) {
                        Canvas canvas = this.f36487a;
                        x7.g.b bVar8 = k0Var.f36421h;
                        canvas.scale(bVar8.f36307c, bVar8.f36308d);
                    }
                }
                Iterator<x7.g.n0> it = yVar.f36398i.iterator();
                while (it.hasNext()) {
                    A0(it.next());
                }
                R0();
                f26 += f11;
                fFloor = fFloor;
            }
        }
        if (zM0) {
            j0(yVar);
        }
        R0();
    }

    public final void L0(x7.g.z0 z0Var) {
        y("TextPath render", new Object[0]);
        W0(this.f36489d, z0Var);
        if (A() && Y0()) {
            x7.g.n0 n0VarP = z0Var.f36433a.p(z0Var.f36483o);
            if (n0VarP == null) {
                F("TextPath reference '%s' not found", z0Var.f36483o);
                return;
            }
            x7.g.v vVar = (x7.g.v) n0VarP;
            Path pathF = new d(vVar.f36467o).f();
            Matrix matrix = vVar.f36422n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            x7.g.p pVar = z0Var.f36484p;
            float fE = pVar != null ? pVar.e(this, pathMeasure.getLength()) : 0.0f;
            x7.g.e0.f fVarO = O();
            if (fVarO != x7.g.e0.f.Start) {
                float fN = n(z0Var);
                if (fVarO == x7.g.e0.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            r((x7.g.k0) z0Var.d());
            boolean zM0 = m0();
            E(z0Var, new e(pathF, fE, 0.0f));
            if (zM0) {
                j0(z0Var);
            }
        }
    }

    public final C0752h M(x7.g.n0 n0Var) {
        C0752h c0752h = new C0752h();
        V0(c0752h, x7.g.e0.a());
        return N(n0Var, c0752h);
    }

    public final boolean M0() {
        return this.f36489d.f36519a.f36345m.floatValue() < 1.0f || this.f36489d.f36519a.G != null;
    }

    public final C0752h N(x7.g.n0 n0Var, C0752h c0752h) {
        int i10;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i10 = 0;
            if (n0Var instanceof x7.g.l0) {
                arrayList.add(0, (x7.g.l0) n0Var);
            }
            Object obj = n0Var.b;
            if (obj == null) {
                break;
            }
            n0Var = (x7.g.n0) obj;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            W0(c0752h, (x7.g.l0) obj2);
        }
        C0752h c0752h2 = this.f36489d;
        c0752h.f36524g = c0752h2.f36524g;
        c0752h.f36523f = c0752h2.f36523f;
        return c0752h;
    }

    public final void N0() {
        this.f36489d = new C0752h();
        this.f36490e = new Stack<>();
        V0(this.f36489d, x7.g.e0.a());
        C0752h c0752h = this.f36489d;
        c0752h.f36523f = null;
        c0752h.f36525h = false;
        this.f36490e.push(new C0752h(c0752h));
        this.f36492g = new Stack<>();
        this.f36491f = new Stack<>();
    }

    public final x7.g.e0.f O() {
        x7.g.e0.f fVar;
        x7.g.e0 e0Var = this.f36489d.f36519a;
        if (e0Var.f36352t == x7.g.e0.h.LTR || (fVar = e0Var.f36353u) == x7.g.e0.f.Middle) {
            return e0Var.f36353u;
        }
        x7.g.e0.f fVar2 = x7.g.e0.f.Start;
        return fVar == fVar2 ? x7.g.e0.f.End : fVar2;
    }

    public final void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float fI = f13 + f11;
        x7.g.c cVar = this.f36489d.f36519a.f36355w;
        if (cVar != null) {
            f10 += cVar.f36317d.f(this);
            f11 += this.f36489d.f36519a.f36355w.f36315a.i(this);
            f14 -= this.f36489d.f36519a.f36355w.b.f(this);
            fI -= this.f36489d.f36519a.f36355w.f36316c.i(this);
        }
        this.f36487a.clipRect(f10, f11, f14, fI);
    }

    public final Path.FillType P() {
        x7.g.e0.a aVar = this.f36489d.f36519a.F;
        return (aVar == null || aVar != x7.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void P0(C0752h c0752h, boolean z10, x7.g.o0 o0Var) {
        int i10;
        x7.g.e0 e0Var = c0752h.f36519a;
        float fFloatValue = (z10 ? e0Var.f36336d : e0Var.f36338f).floatValue();
        if (o0Var instanceof x7.g.f) {
            i10 = ((x7.g.f) o0Var).f36391a;
        } else if (!(o0Var instanceof x7.g.C0751g)) {
            return;
        } else {
            i10 = c0752h.f36519a.f36346n.f36391a;
        }
        int iX = x(i10, fFloatValue);
        if (z10) {
            c0752h.f36521d.setColor(iX);
        } else {
            c0752h.f36522e.setColor(iX);
        }
    }

    public float Q() {
        return this.f36489d.f36521d.getTextSize();
    }

    public final void Q0(boolean z10, x7.g.c0 c0Var) {
        if (z10) {
            if (W(c0Var.f36425e, 2147483648L)) {
                C0752h c0752h = this.f36489d;
                x7.g.e0 e0Var = c0752h.f36519a;
                x7.g.o0 o0Var = c0Var.f36425e.H;
                e0Var.b = o0Var;
                c0752h.b = o0Var != null;
            }
            if (W(c0Var.f36425e, 4294967296L)) {
                this.f36489d.f36519a.f36336d = c0Var.f36425e.I;
            }
            if (W(c0Var.f36425e, 6442450944L)) {
                C0752h c0752h2 = this.f36489d;
                P0(c0752h2, z10, c0752h2.f36519a.b);
                return;
            }
            return;
        }
        if (W(c0Var.f36425e, 2147483648L)) {
            C0752h c0752h3 = this.f36489d;
            x7.g.e0 e0Var2 = c0752h3.f36519a;
            x7.g.o0 o0Var2 = c0Var.f36425e.H;
            e0Var2.f36337e = o0Var2;
            c0752h3.f36520c = o0Var2 != null;
        }
        if (W(c0Var.f36425e, 4294967296L)) {
            this.f36489d.f36519a.f36338f = c0Var.f36425e.I;
        }
        if (W(c0Var.f36425e, 6442450944L)) {
            C0752h c0752h4 = this.f36489d;
            P0(c0752h4, z10, c0752h4.f36519a.f36337e);
        }
    }

    public float R() {
        return this.f36489d.f36521d.getTextSize() / 2.0f;
    }

    public final void R0() {
        this.f36487a.restore();
        this.f36489d = this.f36490e.pop();
    }

    public x7.g.b S() {
        C0752h c0752h = this.f36489d;
        x7.g.b bVar = c0752h.f36524g;
        return bVar != null ? bVar : c0752h.f36523f;
    }

    public final void S0() {
        this.f36487a.save();
        this.f36490e.push(this.f36489d);
        this.f36489d = new C0752h(this.f36489d);
    }

    public float T() {
        return this.b;
    }

    public final String T0(String str, boolean z10, boolean z11) {
        if (this.f36489d.f36525h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", BuildConfig.FLAVOR).replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", BuildConfig.FLAVOR);
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", BuildConfig.FLAVOR);
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final Path.FillType U() {
        x7.g.e0.a aVar = this.f36489d.f36519a.f36335c;
        return (aVar == null || aVar != x7.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void U0(x7.g.k0 k0Var) {
        if (k0Var.b == null || k0Var.f36421h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f36492g.peek().invert(matrix)) {
            x7.g.b bVar = k0Var.f36421h;
            float f10 = bVar.f36306a;
            float f11 = bVar.b;
            float fB = bVar.b();
            x7.g.b bVar2 = k0Var.f36421h;
            float f12 = bVar2.b;
            float fB2 = bVar2.b();
            float fC = k0Var.f36421h.c();
            x7.g.b bVar3 = k0Var.f36421h;
            float[] fArr = {f10, f11, fB, f12, fB2, fC, bVar3.f36306a, bVar3.c()};
            matrix.preConcat(this.f36487a.getMatrix());
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
            x7.g.k0 k0Var2 = (x7.g.k0) this.f36491f.peek();
            x7.g.b bVar4 = k0Var2.f36421h;
            if (bVar4 == null) {
                k0Var2.f36421h = x7.g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(x7.g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final void V0(C0752h c0752h, x7.g.e0 e0Var) {
        if (W(e0Var, 4096L)) {
            c0752h.f36519a.f36346n = e0Var.f36346n;
        }
        if (W(e0Var, 2048L)) {
            c0752h.f36519a.f36345m = e0Var.f36345m;
        }
        if (W(e0Var, 1L)) {
            c0752h.f36519a.b = e0Var.b;
            x7.g.o0 o0Var = e0Var.b;
            c0752h.b = (o0Var == null || o0Var == x7.g.f.f36390c) ? false : true;
        }
        if (W(e0Var, 4L)) {
            c0752h.f36519a.f36336d = e0Var.f36336d;
        }
        if (W(e0Var, 6149L)) {
            P0(c0752h, true, c0752h.f36519a.b);
        }
        if (W(e0Var, 2L)) {
            c0752h.f36519a.f36335c = e0Var.f36335c;
        }
        if (W(e0Var, 8L)) {
            c0752h.f36519a.f36337e = e0Var.f36337e;
            x7.g.o0 o0Var2 = e0Var.f36337e;
            c0752h.f36520c = (o0Var2 == null || o0Var2 == x7.g.f.f36390c) ? false : true;
        }
        if (W(e0Var, 16L)) {
            c0752h.f36519a.f36338f = e0Var.f36338f;
        }
        if (W(e0Var, 6168L)) {
            P0(c0752h, false, c0752h.f36519a.f36337e);
        }
        if (W(e0Var, 34359738368L)) {
            c0752h.f36519a.L = e0Var.L;
        }
        if (W(e0Var, 32L)) {
            x7.g.e0 e0Var2 = c0752h.f36519a;
            x7.g.p pVar = e0Var.f36339g;
            e0Var2.f36339g = pVar;
            c0752h.f36522e.setStrokeWidth(pVar.c(this));
        }
        if (W(e0Var, 64L)) {
            c0752h.f36519a.f36340h = e0Var.f36340h;
            int i10 = a.b[e0Var.f36340h.ordinal()];
            if (i10 == 1) {
                c0752h.f36522e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0752h.f36522e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0752h.f36522e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e0Var, 128L)) {
            c0752h.f36519a.f36341i = e0Var.f36341i;
            int i11 = a.f36495c[e0Var.f36341i.ordinal()];
            if (i11 == 1) {
                c0752h.f36522e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0752h.f36522e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0752h.f36522e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e0Var, 256L)) {
            c0752h.f36519a.f36342j = e0Var.f36342j;
            c0752h.f36522e.setStrokeMiter(e0Var.f36342j.floatValue());
        }
        if (W(e0Var, 512L)) {
            c0752h.f36519a.f36343k = e0Var.f36343k;
        }
        if (W(e0Var, 1024L)) {
            c0752h.f36519a.f36344l = e0Var.f36344l;
        }
        Typeface typefaceT = null;
        if (W(e0Var, 1536L)) {
            x7.g.p[] pVarArr = c0752h.f36519a.f36343k;
            if (pVarArr == null) {
                c0752h.f36522e.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fC = c0752h.f36519a.f36343k[i13 % length].c(this);
                    fArr[i13] = fC;
                    f10 += fC;
                }
                if (f10 == 0.0f) {
                    c0752h.f36522e.setPathEffect(null);
                } else {
                    float fC2 = c0752h.f36519a.f36344l.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f10) + f10;
                    }
                    c0752h.f36522e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (W(e0Var, 16384L)) {
            float fQ = Q();
            c0752h.f36519a.f36348p = e0Var.f36348p;
            c0752h.f36521d.setTextSize(e0Var.f36348p.e(this, fQ));
            c0752h.f36522e.setTextSize(e0Var.f36348p.e(this, fQ));
        }
        if (W(e0Var, 8192L)) {
            c0752h.f36519a.f36347o = e0Var.f36347o;
        }
        if (W(e0Var, 32768L)) {
            if (e0Var.f36349q.intValue() == -1 && c0752h.f36519a.f36349q.intValue() > 100) {
                x7.g.e0 e0Var3 = c0752h.f36519a;
                e0Var3.f36349q = Integer.valueOf(e0Var3.f36349q.intValue() - 100);
            } else if (e0Var.f36349q.intValue() != 1 || c0752h.f36519a.f36349q.intValue() >= 900) {
                c0752h.f36519a.f36349q = e0Var.f36349q;
            } else {
                x7.g.e0 e0Var4 = c0752h.f36519a;
                e0Var4.f36349q = Integer.valueOf(e0Var4.f36349q.intValue() + 100);
            }
        }
        if (W(e0Var, 65536L)) {
            c0752h.f36519a.f36350r = e0Var.f36350r;
        }
        if (W(e0Var, 106496L)) {
            if (c0752h.f36519a.f36347o != null && this.f36488c != null) {
                x7.g.k();
                for (String str : c0752h.f36519a.f36347o) {
                    x7.g.e0 e0Var5 = c0752h.f36519a;
                    typefaceT = t(str, e0Var5.f36349q, e0Var5.f36350r);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                x7.g.e0 e0Var6 = c0752h.f36519a;
                typefaceT = t("serif", e0Var6.f36349q, e0Var6.f36350r);
            }
            c0752h.f36521d.setTypeface(typefaceT);
            c0752h.f36522e.setTypeface(typefaceT);
        }
        if (W(e0Var, 131072L)) {
            c0752h.f36519a.f36351s = e0Var.f36351s;
            Paint paint = c0752h.f36521d;
            x7.g.e0.EnumC0750g enumC0750g = e0Var.f36351s;
            x7.g.e0.EnumC0750g enumC0750g2 = x7.g.e0.EnumC0750g.LineThrough;
            paint.setStrikeThruText(enumC0750g == enumC0750g2);
            Paint paint2 = c0752h.f36521d;
            x7.g.e0.EnumC0750g enumC0750g3 = e0Var.f36351s;
            x7.g.e0.EnumC0750g enumC0750g4 = x7.g.e0.EnumC0750g.Underline;
            paint2.setUnderlineText(enumC0750g3 == enumC0750g4);
            c0752h.f36522e.setStrikeThruText(e0Var.f36351s == enumC0750g2);
            c0752h.f36522e.setUnderlineText(e0Var.f36351s == enumC0750g4);
        }
        if (W(e0Var, 68719476736L)) {
            c0752h.f36519a.f36352t = e0Var.f36352t;
        }
        if (W(e0Var, 262144L)) {
            c0752h.f36519a.f36353u = e0Var.f36353u;
        }
        if (W(e0Var, 524288L)) {
            c0752h.f36519a.f36354v = e0Var.f36354v;
        }
        if (W(e0Var, 2097152L)) {
            c0752h.f36519a.f36356x = e0Var.f36356x;
        }
        if (W(e0Var, 4194304L)) {
            c0752h.f36519a.f36357y = e0Var.f36357y;
        }
        if (W(e0Var, 8388608L)) {
            c0752h.f36519a.f36358z = e0Var.f36358z;
        }
        if (W(e0Var, 16777216L)) {
            c0752h.f36519a.A = e0Var.A;
        }
        if (W(e0Var, 33554432L)) {
            c0752h.f36519a.B = e0Var.B;
        }
        if (W(e0Var, 1048576L)) {
            c0752h.f36519a.f36355w = e0Var.f36355w;
        }
        if (W(e0Var, 268435456L)) {
            c0752h.f36519a.E = e0Var.E;
        }
        if (W(e0Var, 536870912L)) {
            c0752h.f36519a.F = e0Var.F;
        }
        if (W(e0Var, 1073741824L)) {
            c0752h.f36519a.G = e0Var.G;
        }
        if (W(e0Var, 67108864L)) {
            c0752h.f36519a.C = e0Var.C;
        }
        if (W(e0Var, 134217728L)) {
            c0752h.f36519a.D = e0Var.D;
        }
        if (W(e0Var, 8589934592L)) {
            c0752h.f36519a.J = e0Var.J;
        }
        if (W(e0Var, 17179869184L)) {
            c0752h.f36519a.K = e0Var.K;
        }
        if (W(e0Var, 137438953472L)) {
            c0752h.f36519a.M = e0Var.M;
        }
    }

    public final boolean W(x7.g.e0 e0Var, long j10) {
        return (e0Var.f36334a & j10) != 0;
    }

    public final void W0(C0752h c0752h, x7.g.l0 l0Var) {
        c0752h.f36519a.b(l0Var.b == null);
        x7.g.e0 e0Var = l0Var.f36425e;
        if (e0Var != null) {
            V0(c0752h, e0Var);
        }
        if (this.f36488c.n()) {
            for (x7.b.p pVar : this.f36488c.d()) {
                if (x7.b.l(this.f36493h, pVar.f36255a, l0Var)) {
                    V0(c0752h, pVar.b);
                }
            }
        }
        x7.g.e0 e0Var2 = l0Var.f36426f;
        if (e0Var2 != null) {
            V0(c0752h, e0Var2);
        }
    }

    public final void X(boolean z10, x7.g.b bVar, x7.g.m0 m0Var) {
        float fE;
        float f10;
        float fE2;
        float f11;
        String str = m0Var.f36417l;
        if (str != null) {
            H(m0Var, str);
        }
        Boolean bool = m0Var.f36414i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0752h c0752h = this.f36489d;
        Paint paint = z10 ? c0752h.f36521d : c0752h.f36522e;
        if (z11) {
            x7.g.b bVarS = S();
            x7.g.p pVar = m0Var.f36429m;
            float f12 = pVar != null ? pVar.f(this) : 0.0f;
            x7.g.p pVar2 = m0Var.f36430n;
            fE = pVar2 != null ? pVar2.i(this) : 0.0f;
            x7.g.p pVar3 = m0Var.f36431o;
            float f13 = pVar3 != null ? pVar3.f(this) : bVarS.f36307c;
            x7.g.p pVar4 = m0Var.f36432p;
            f11 = f13;
            f10 = f12;
            fE2 = pVar4 != null ? pVar4.i(this) : 0.0f;
        } else {
            x7.g.p pVar5 = m0Var.f36429m;
            float fE3 = pVar5 != null ? pVar5.e(this, 1.0f) : 0.0f;
            x7.g.p pVar6 = m0Var.f36430n;
            fE = pVar6 != null ? pVar6.e(this, 1.0f) : 0.0f;
            x7.g.p pVar7 = m0Var.f36431o;
            float fE4 = pVar7 != null ? pVar7.e(this, 1.0f) : 1.0f;
            x7.g.p pVar8 = m0Var.f36432p;
            f10 = fE3;
            fE2 = pVar8 != null ? pVar8.e(this, 1.0f) : 0.0f;
            f11 = fE4;
        }
        float f14 = fE;
        S0();
        this.f36489d = M(m0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f36306a, bVar.b);
            matrix.preScale(bVar.f36307c, bVar.f36308d);
        }
        Matrix matrix2 = m0Var.f36415j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f36413h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f36489d.b = false;
                return;
            } else {
                this.f36489d.f36520c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<x7.g.n0> it = m0Var.f36413h.iterator();
        float f15 = -1.0f;
        while (it.hasNext()) {
            x7.g.d0 d0Var = (x7.g.d0) it.next();
            Float f16 = d0Var.f36323h;
            float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f15) {
                fArr[i10] = fFloatValue;
                f15 = fFloatValue;
            } else {
                fArr[i10] = f15;
            }
            S0();
            W0(this.f36489d, d0Var);
            x7.g.e0 e0Var = this.f36489d.f36519a;
            x7.g.f fVar = (x7.g.f) e0Var.C;
            if (fVar == null) {
                fVar = x7.g.f.b;
            }
            iArr[i10] = x(fVar.f36391a, e0Var.D.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f11 && f14 == fE2) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        x7.g.k kVar = m0Var.f36416k;
        if (kVar != null) {
            if (kVar == x7.g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == x7.g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f14, f11, fE2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f36489d.f36519a.f36336d.floatValue()));
    }

    public final void X0() {
        int iX;
        x7.g.e0 e0Var = this.f36489d.f36519a;
        x7.g.o0 o0Var = e0Var.J;
        if (o0Var instanceof x7.g.f) {
            iX = ((x7.g.f) o0Var).f36391a;
        } else if (!(o0Var instanceof x7.g.C0751g)) {
            return;
        } else {
            iX = e0Var.f36346n.f36391a;
        }
        Float f10 = e0Var.K;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f36487a.drawColor(iX);
    }

    public final Path Y(x7.g.d dVar) {
        x7.g.p pVar = dVar.f36320o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        x7.g.p pVar2 = dVar.f36321p;
        float fI = pVar2 != null ? pVar2.i(this) : 0.0f;
        float fC = dVar.f36322q.c(this);
        float f11 = f10 - fC;
        float f12 = fI - fC;
        float f13 = f10 + fC;
        float f14 = fI + fC;
        if (dVar.f36421h == null) {
            float f15 = 2.0f * fC;
            dVar.f36421h = new x7.g.b(f11, f12, f15, f15);
        }
        float f16 = fC * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f12);
        float f17 = f10 + f16;
        float f18 = fI - f16;
        path.cubicTo(f17, f12, f13, f18, f13, fI);
        float f19 = fI + f16;
        path.cubicTo(f13, f19, f17, f14, f10, f14);
        float f20 = f10 - f16;
        path.cubicTo(f20, f14, f11, f19, f11, fI);
        path.cubicTo(f11, f18, f20, f12, f10, f12);
        path.close();
        return path;
    }

    public final boolean Y0() {
        Boolean bool = this.f36489d.f36519a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path Z(x7.g.i iVar) {
        x7.g.p pVar = iVar.f36404o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        x7.g.p pVar2 = iVar.f36405p;
        float fI = pVar2 != null ? pVar2.i(this) : 0.0f;
        float f11 = iVar.f36406q.f(this);
        float fI2 = iVar.f36407r.i(this);
        float f12 = f10 - f11;
        float f13 = fI - fI2;
        float f14 = f10 + f11;
        float f15 = fI + fI2;
        if (iVar.f36421h == null) {
            iVar.f36421h = new x7.g.b(f12, f13, f11 * 2.0f, 2.0f * fI2);
        }
        float f16 = f11 * 0.5522848f;
        float f17 = fI2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f13);
        float f18 = f10 + f16;
        float f19 = fI - f17;
        path.cubicTo(f18, f13, f14, f19, f14, fI);
        float f20 = fI + f17;
        path.cubicTo(f14, f20, f18, f15, f10, f15);
        float f21 = f10 - f16;
        path.cubicTo(f21, f15, f12, f20, f12, fI);
        path.cubicTo(f12, f19, f21, f13, f10, f13);
        path.close();
        return path;
    }

    public final Path a0(x7.g.q qVar) {
        x7.g.p pVar = qVar.f36442o;
        float f10 = pVar == null ? 0.0f : pVar.f(this);
        x7.g.p pVar2 = qVar.f36443p;
        float fI = pVar2 == null ? 0.0f : pVar2.i(this);
        x7.g.p pVar3 = qVar.f36444q;
        float f11 = pVar3 == null ? 0.0f : pVar3.f(this);
        x7.g.p pVar4 = qVar.f36445r;
        float fI2 = pVar4 != null ? pVar4.i(this) : 0.0f;
        if (qVar.f36421h == null) {
            qVar.f36421h = new x7.g.b(Math.min(f10, f11), Math.min(fI, fI2), Math.abs(f11 - f10), Math.abs(fI2 - fI));
        }
        Path path = new Path();
        path.moveTo(f10, fI);
        path.lineTo(f11, fI2);
        return path;
    }

    public final Path b0(x7.g.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f36482o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = zVar.f36482o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (zVar instanceof x7.g.a0) {
            path.close();
        }
        if (zVar.f36421h == null) {
            zVar.f36421h = m(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    public final Path c0(x7.g.b0 b0Var) {
        float f10;
        float fI;
        float fMin;
        x7.g.p pVar;
        float f11;
        x7.g.p pVar2;
        float fI2;
        float f12;
        float fI3;
        float f13;
        float f14;
        Path path;
        x7.g.p pVar3 = b0Var.f36313s;
        if (pVar3 == null && b0Var.f36314t == null) {
            f10 = 0.0f;
        } else {
            if (pVar3 != null) {
                if (b0Var.f36314t == null) {
                    f10 = pVar3.f(this);
                } else {
                    f10 = pVar3.f(this);
                    fI = b0Var.f36314t.i(this);
                }
                fMin = Math.min(f10, b0Var.f36311q.f(this) / 2.0f);
                float fMin2 = Math.min(fI, b0Var.f36312r.i(this) / 2.0f);
                pVar = b0Var.f36309o;
                if (pVar != null) {
                    f11 = pVar.f(this);
                } else {
                    f11 = 0.0f;
                }
                pVar2 = b0Var.f36310p;
                if (pVar2 != null) {
                    fI2 = pVar2.i(this);
                } else {
                    fI2 = 0.0f;
                }
                f12 = b0Var.f36311q.f(this);
                fI3 = b0Var.f36312r.i(this);
                if (b0Var.f36421h == null) {
                    b0Var.f36421h = new x7.g.b(f11, fI2, f12, fI3);
                }
                f13 = f12 + f11;
                f14 = fI2 + fI3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(f11, fI2);
                    path.lineTo(f13, fI2);
                    path.lineTo(f13, f14);
                    path.lineTo(f11, f14);
                    path.lineTo(f11, fI2);
                } else {
                    float f15 = fMin * 0.5522848f;
                    float f16 = 0.5522848f * fMin2;
                    float f17 = fI2 + fMin2;
                    path.moveTo(f11, f17);
                    float f18 = f17 - f16;
                    float f19 = f11 + fMin;
                    float f20 = f19 - f15;
                    path.cubicTo(f11, f18, f20, fI2, f19, fI2);
                    float f21 = f13 - fMin;
                    path.lineTo(f21, fI2);
                    float f22 = f21 + f15;
                    path.cubicTo(f22, fI2, f13, f18, f13, f17);
                    float f23 = f14 - fMin2;
                    path.lineTo(f13, f23);
                    float f24 = f23 + f16;
                    path.cubicTo(f13, f24, f22, f14, f21, f14);
                    path.lineTo(f19, f14);
                    float f25 = f11;
                    path.cubicTo(f20, f14, f25, f24, f11, f23);
                    path.lineTo(f25, f17);
                }
                path.close();
                return path;
            }
            f10 = b0Var.f36314t.i(this);
        }
        fI = f10;
        fMin = Math.min(f10, b0Var.f36311q.f(this) / 2.0f);
        float fMin3 = Math.min(fI, b0Var.f36312r.i(this) / 2.0f);
        pVar = b0Var.f36309o;
        if (pVar != null) {
            f11 = pVar.f(this);
        } else {
            f11 = 0.0f;
        }
        pVar2 = b0Var.f36310p;
        if (pVar2 != null) {
            fI2 = pVar2.i(this);
        } else {
            fI2 = 0.0f;
        }
        f12 = b0Var.f36311q.f(this);
        fI3 = b0Var.f36312r.i(this);
        if (b0Var.f36421h == null) {
            b0Var.f36421h = new x7.g.b(f11, fI2, f12, fI3);
        }
        f13 = f12 + f11;
        f14 = fI2 + fI3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(f11, fI2);
            path.lineTo(f13, fI2);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, fI2);
        } else {
            path.moveTo(f11, fI2);
            path.lineTo(f13, fI2);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, fI2);
        }
        path.close();
        return path;
    }

    public final Path d0(x7.g.w0 w0Var) {
        List<x7.g.p> list = w0Var.f36302o;
        float fI = 0.0f;
        float f10 = (list == null || list.size() == 0) ? 0.0f : w0Var.f36302o.get(0).f(this);
        List<x7.g.p> list2 = w0Var.f36303p;
        float fI2 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f36303p.get(0).i(this);
        List<x7.g.p> list3 = w0Var.f36304q;
        float f11 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f36304q.get(0).f(this);
        List<x7.g.p> list4 = w0Var.f36305r;
        if (list4 != null && list4.size() != 0) {
            fI = w0Var.f36305r.get(0).i(this);
        }
        if (this.f36489d.f36519a.f36353u != x7.g.e0.f.Start) {
            float fN = n(w0Var);
            if (this.f36489d.f36519a.f36353u == x7.g.e0.f.Middle) {
                fN /= 2.0f;
            }
            f10 -= fN;
        }
        if (w0Var.f36421h == null) {
            i iVar = new i(f10, fI2);
            E(w0Var, iVar);
            RectF rectF = iVar.f36528d;
            w0Var.f36421h = new x7.g.b(rectF.left, rectF.top, rectF.width(), iVar.f36528d.height());
        }
        Path path = new Path();
        E(w0Var, new g(f10 + f11, fI2 + fI, path));
        return path;
    }

    public final void e0(boolean z10, x7.g.b bVar, x7.g.q0 q0Var) {
        float f10;
        float fE;
        float f11;
        String str = q0Var.f36417l;
        if (str != null) {
            H(q0Var, str);
        }
        Boolean bool = q0Var.f36414i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0752h c0752h = this.f36489d;
        Paint paint = z10 ? c0752h.f36521d : c0752h.f36522e;
        if (z11) {
            x7.g.p pVar = new x7.g.p(50.0f, x7.g.d1.percent);
            x7.g.p pVar2 = q0Var.f36446m;
            float f12 = pVar2 != null ? pVar2.f(this) : pVar.f(this);
            x7.g.p pVar3 = q0Var.f36447n;
            float fI = pVar3 != null ? pVar3.i(this) : pVar.i(this);
            x7.g.p pVar4 = q0Var.f36448o;
            fE = pVar4 != null ? pVar4.c(this) : pVar.c(this);
            f10 = f12;
            f11 = fI;
        } else {
            x7.g.p pVar5 = q0Var.f36446m;
            float fE2 = pVar5 != null ? pVar5.e(this, 1.0f) : 0.5f;
            x7.g.p pVar6 = q0Var.f36447n;
            float fE3 = pVar6 != null ? pVar6.e(this, 1.0f) : 0.5f;
            x7.g.p pVar7 = q0Var.f36448o;
            f10 = fE2;
            fE = pVar7 != null ? pVar7.e(this, 1.0f) : 0.5f;
            f11 = fE3;
        }
        S0();
        this.f36489d = M(q0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f36306a, bVar.b);
            matrix.preScale(bVar.f36307c, bVar.f36308d);
        }
        Matrix matrix2 = q0Var.f36415j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f36413h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f36489d.b = false;
                return;
            } else {
                this.f36489d.f36520c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<x7.g.n0> it = q0Var.f36413h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            x7.g.d0 d0Var = (x7.g.d0) it.next();
            Float f14 = d0Var.f36323h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f36489d, d0Var);
            x7.g.e0 e0Var = this.f36489d.f36519a;
            x7.g.f fVar = (x7.g.f) e0Var.C;
            if (fVar == null) {
                fVar = x7.g.f.b;
            }
            iArr[i10] = x(fVar.f36391a, e0Var.D.floatValue());
            i10++;
            R0();
        }
        if (fE == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        x7.g.k kVar = q0Var.f36416k;
        if (kVar != null) {
            if (kVar == x7.g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == x7.g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fE, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f36489d.f36519a.f36336d.floatValue()));
    }

    public final x7.g.b f0(x7.g.p pVar, x7.g.p pVar2, x7.g.p pVar3, x7.g.p pVar4) {
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        float fI = pVar2 != null ? pVar2.i(this) : 0.0f;
        x7.g.b bVarS = S();
        return new x7.g.b(f10, fI, pVar3 != null ? pVar3.f(this) : bVarS.f36307c, pVar4 != null ? pVar4.i(this) : bVarS.f36308d);
    }

    @TargetApi(19)
    public final Path g0(x7.g.k0 k0Var, boolean z10) {
        Path pathD0;
        Path pathJ;
        this.f36490e.push(this.f36489d);
        C0752h c0752h = new C0752h(this.f36489d);
        this.f36489d = c0752h;
        W0(c0752h, k0Var);
        if (!A() || !Y0()) {
            this.f36489d = this.f36490e.pop();
            return null;
        }
        if (k0Var instanceof x7.g.e1) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            x7.g.e1 e1Var = (x7.g.e1) k0Var;
            x7.g.n0 n0VarP = k0Var.f36433a.p(e1Var.f36385p);
            if (n0VarP == null) {
                F("Use reference '%s' not found", e1Var.f36385p);
                this.f36489d = this.f36490e.pop();
                return null;
            }
            if (!(n0VarP instanceof x7.g.k0)) {
                this.f36489d = this.f36490e.pop();
                return null;
            }
            pathD0 = g0((x7.g.k0) n0VarP, false);
            if (pathD0 == null) {
                return null;
            }
            if (e1Var.f36421h == null) {
                e1Var.f36421h = m(pathD0);
            }
            Matrix matrix = e1Var.f36428o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k0Var instanceof x7.g.l) {
            x7.g.l lVar = (x7.g.l) k0Var;
            if (k0Var instanceof x7.g.v) {
                pathD0 = new d(((x7.g.v) k0Var).f36467o).f();
                if (k0Var.f36421h == null) {
                    k0Var.f36421h = m(pathD0);
                }
            } else if (k0Var instanceof x7.g.b0) {
                pathD0 = c0((x7.g.b0) k0Var);
            } else if (k0Var instanceof x7.g.d) {
                pathD0 = Y((x7.g.d) k0Var);
            } else if (k0Var instanceof x7.g.i) {
                pathD0 = Z((x7.g.i) k0Var);
            } else {
                pathD0 = k0Var instanceof x7.g.z ? b0((x7.g.z) k0Var) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (lVar.f36421h == null) {
                lVar.f36421h = m(pathD0);
            }
            Matrix matrix2 = lVar.f36422n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k0Var instanceof x7.g.w0)) {
                F("Invalid %s element found in clipPath definition", k0Var.n());
                return null;
            }
            x7.g.w0 w0Var = (x7.g.w0) k0Var;
            pathD0 = d0(w0Var);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w0Var.f36473s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f36489d.f36519a.E != null && (pathJ = j(k0Var, k0Var.f36421h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f36489d = this.f36490e.pop();
        return pathD0;
    }

    public final void h0() {
        this.f36491f.pop();
        this.f36492g.pop();
    }

    public final void i0(x7.g.j0 j0Var) {
        this.f36491f.push(j0Var);
        this.f36492g.push(this.f36487a.getMatrix());
    }

    @TargetApi(19)
    public final Path j(x7.g.k0 k0Var, x7.g.b bVar) {
        Path pathG0;
        x7.g.n0 n0VarP = k0Var.f36433a.p(this.f36489d.f36519a.E);
        if (n0VarP == null) {
            F("ClipPath reference '%s' not found", this.f36489d.f36519a.E);
            return null;
        }
        x7.g.e eVar = (x7.g.e) n0VarP;
        this.f36490e.push(this.f36489d);
        this.f36489d = M(eVar);
        Boolean bool = eVar.f36333p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f36306a, bVar.b);
            matrix.preScale(bVar.f36307c, bVar.f36308d);
        }
        Matrix matrix2 = eVar.f36428o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (x7.g.n0 n0Var : eVar.f36398i) {
            if ((n0Var instanceof x7.g.k0) && (pathG0 = g0((x7.g.k0) n0Var, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f36489d.f36519a.E != null) {
            if (eVar.f36421h == null) {
                eVar.f36421h = m(path);
            }
            Path pathJ = j(eVar, eVar.f36421h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f36489d = this.f36490e.pop();
        return path;
    }

    public final void j0(x7.g.k0 k0Var) {
        k0(k0Var, k0Var.f36421h);
    }

    public final List<c> k(x7.g.q qVar) {
        x7.g.p pVar = qVar.f36442o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        x7.g.p pVar2 = qVar.f36443p;
        float fI = pVar2 != null ? pVar2.i(this) : 0.0f;
        x7.g.p pVar3 = qVar.f36444q;
        float f11 = pVar3 != null ? pVar3.f(this) : 0.0f;
        x7.g.p pVar4 = qVar.f36445r;
        float fI2 = pVar4 != null ? pVar4.i(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = f11 - f10;
        float f13 = fI2 - fI;
        arrayList.add(new c(f10, fI, f12, f13));
        arrayList.add(new c(f11, fI2, f12, f13));
        return arrayList;
    }

    public final void k0(x7.g.k0 k0Var, x7.g.b bVar) {
        if (this.f36489d.f36519a.G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f36487a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f36487a.saveLayer(null, paint2, 31);
            x7.g.s sVar = (x7.g.s) this.f36488c.p(this.f36489d.f36519a.G);
            J0(sVar, k0Var, bVar);
            this.f36487a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f36487a.saveLayer(null, paint3, 31);
            J0(sVar, k0Var, bVar);
            this.f36487a.restore();
            this.f36487a.restore();
        }
        R0();
    }

    public final List<c> l(x7.g.z zVar) {
        int length = zVar.f36482o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar.f36482o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = zVar.f36482o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f36504a, f13 - cVar.b);
            f10 = f12;
            f11 = f13;
        }
        if (!(zVar instanceof x7.g.a0)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = zVar.f36482o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f36504a, f15 - cVar.b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    public final void l0(x7.g.n0 n0Var, j jVar) {
        float f10;
        float fI;
        float f11;
        x7.g.e0.f fVarO;
        if (jVar.a((x7.g.y0) n0Var)) {
            if (n0Var instanceof x7.g.z0) {
                S0();
                L0((x7.g.z0) n0Var);
                R0();
                return;
            }
            if (!(n0Var instanceof x7.g.v0)) {
                if (n0Var instanceof x7.g.u0) {
                    S0();
                    x7.g.u0 u0Var = (x7.g.u0) n0Var;
                    W0(this.f36489d, u0Var);
                    if (A()) {
                        r((x7.g.k0) u0Var.d());
                        x7.g.n0 n0VarP = n0Var.f36433a.p(u0Var.f36465o);
                        if (n0VarP == null || !(n0VarP instanceof x7.g.y0)) {
                            F("Tref reference '%s' not found", u0Var.f36465o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((x7.g.y0) n0VarP, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            x7.g.v0 v0Var = (x7.g.v0) n0Var;
            W0(this.f36489d, v0Var);
            if (A()) {
                List<x7.g.p> list = v0Var.f36302o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float fI2 = 0.0f;
                if (z11) {
                    float f12 = !z10 ? ((f) jVar).b : v0Var.f36302o.get(0).f(this);
                    List<x7.g.p> list2 = v0Var.f36303p;
                    fI = (list2 == null || list2.size() == 0) ? ((f) jVar).f36514c : v0Var.f36303p.get(0).i(this);
                    List<x7.g.p> list3 = v0Var.f36304q;
                    f11 = (list3 == null || list3.size() == 0) ? 0.0f : v0Var.f36304q.get(0).f(this);
                    List<x7.g.p> list4 = v0Var.f36305r;
                    if (list4 != null && list4.size() != 0) {
                        fI2 = v0Var.f36305r.get(0).i(this);
                    }
                    f10 = fI2;
                    fI2 = f12;
                } else {
                    f10 = 0.0f;
                    fI = 0.0f;
                    f11 = 0.0f;
                }
                if (z10 && (fVarO = O()) != x7.g.e0.f.Start) {
                    float fN = n(v0Var);
                    if (fVarO == x7.g.e0.f.Middle) {
                        fN /= 2.0f;
                    }
                    fI2 -= fN;
                }
                r((x7.g.k0) v0Var.d());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.b = fI2 + f11;
                    fVar.f36514c = fI + f10;
                }
                boolean zM0 = m0();
                E(v0Var, jVar);
                if (zM0) {
                    j0(v0Var);
                }
            }
            R0();
        }
    }

    public final x7.g.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new x7.g.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final boolean m0() {
        x7.g.n0 n0VarP;
        if (!M0()) {
            return false;
        }
        this.f36487a.saveLayerAlpha(null, w(this.f36489d.f36519a.f36345m.floatValue()), 31);
        this.f36490e.push(this.f36489d);
        C0752h c0752h = new C0752h(this.f36489d);
        this.f36489d = c0752h;
        String str = c0752h.f36519a.G;
        if (str != null && ((n0VarP = this.f36488c.p(str)) == null || !(n0VarP instanceof x7.g.s))) {
            F("Mask reference '%s' not found", this.f36489d.f36519a.G);
            this.f36489d.f36519a.G = null;
        }
        return true;
    }

    public final float n(x7.g.y0 y0Var) {
        k kVar = new k(this, null);
        E(y0Var, kVar);
        return kVar.b;
    }

    public final c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f36505c, cVar2.f36506d, cVar2.f36504a - cVar.f36504a, cVar2.b - cVar.b);
        if (fD == 0.0f) {
            fD = D(cVar2.f36505c, cVar2.f36506d, cVar3.f36504a - cVar2.f36504a, cVar3.b - cVar2.b);
        }
        if (fD > 0.0f || (fD == 0.0f && (cVar2.f36505c > 0.0f || cVar2.f36506d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f36505c = -cVar2.f36505c;
        cVar2.f36506d = -cVar2.f36506d;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Matrix o(x7.g.b bVar, x7.g.b bVar2, x7.e eVar) {
        int i10;
        float f10;
        float f11;
        Matrix matrix = new Matrix();
        if (eVar != null && eVar.a() != null) {
            float f12 = bVar.f36307c / bVar2.f36307c;
            float f13 = bVar.f36308d / bVar2.f36308d;
            float f14 = -bVar2.f36306a;
            float f15 = -bVar2.b;
            if (eVar.equals(x7.e.f36269d)) {
                matrix.preTranslate(bVar.f36306a, bVar.b);
                matrix.preScale(f12, f13);
                matrix.preTranslate(f14, f15);
                return matrix;
            }
            float fMax = eVar.b() == x7.e.b.slice ? Math.max(f12, f13) : Math.min(f12, f13);
            float f16 = bVar.f36307c / fMax;
            float f17 = bVar.f36308d / fMax;
            int[] iArr = a.f36494a;
            switch (iArr[eVar.a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f11 = (bVar2.f36307c - f16) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f11 = bVar2.f36307c - f16;
                    break;
                default:
                    i10 = iArr[eVar.a().ordinal()];
                    if (i10 == 2) {
                        f10 = (bVar2.f36308d - f17) / 2.0f;
                        f15 -= f10;
                    } else {
                        if (i10 != 3) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    if (i10 != 7) {
                                    }
                                }
                            }
                            f10 = (bVar2.f36308d - f17) / 2.0f;
                            f15 -= f10;
                        }
                        f10 = bVar2.f36308d - f17;
                        f15 -= f10;
                    }
                    matrix.preTranslate(bVar.f36306a, bVar.b);
                    matrix.preScale(fMax, fMax);
                    matrix.preTranslate(f14, f15);
                    break;
            }
            f14 -= f11;
            i10 = iArr[eVar.a().ordinal()];
            if (i10 == 2) {
                f10 = (bVar2.f36308d - f17) / 2.0f;
                f15 -= f10;
            } else {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                            }
                        }
                    }
                    f10 = (bVar2.f36308d - f17) / 2.0f;
                    f15 -= f10;
                }
                f10 = bVar2.f36308d - f17;
                f15 -= f10;
            }
            matrix.preTranslate(bVar.f36306a, bVar.b);
            matrix.preScale(fMax, fMax);
            matrix.preTranslate(f14, f15);
        }
        return matrix;
    }

    public final void o0(x7.g.d dVar) {
        y("Circle render", new Object[0]);
        x7.g.p pVar = dVar.f36322q;
        if (pVar == null || pVar.l()) {
            return;
        }
        W0(this.f36489d, dVar);
        if (A() && Y0()) {
            Matrix matrix = dVar.f36422n;
            if (matrix != null) {
                this.f36487a.concat(matrix);
            }
            Path pathY = Y(dVar);
            U0(dVar);
            r(dVar);
            p(dVar);
            boolean zM0 = m0();
            if (this.f36489d.b) {
                B(dVar, pathY);
            }
            if (this.f36489d.f36520c) {
                C(pathY);
            }
            if (zM0) {
                j0(dVar);
            }
        }
    }

    public final void p(x7.g.k0 k0Var) {
        q(k0Var, k0Var.f36421h);
    }

    public final void p0(x7.g.i iVar) {
        y("Ellipse render", new Object[0]);
        x7.g.p pVar = iVar.f36406q;
        if (pVar == null || iVar.f36407r == null || pVar.l() || iVar.f36407r.l()) {
            return;
        }
        W0(this.f36489d, iVar);
        if (A() && Y0()) {
            Matrix matrix = iVar.f36422n;
            if (matrix != null) {
                this.f36487a.concat(matrix);
            }
            Path pathZ = Z(iVar);
            U0(iVar);
            r(iVar);
            p(iVar);
            boolean zM0 = m0();
            if (this.f36489d.b) {
                B(iVar, pathZ);
            }
            if (this.f36489d.f36520c) {
                C(pathZ);
            }
            if (zM0) {
                j0(iVar);
            }
        }
    }

    public final void q(x7.g.k0 k0Var, x7.g.b bVar) {
        Path pathJ;
        if (this.f36489d.f36519a.E == null || (pathJ = j(k0Var, bVar)) == null) {
            return;
        }
        this.f36487a.clipPath(pathJ);
    }

    public final void q0(x7.g.m mVar) {
        y("Group render", new Object[0]);
        W0(this.f36489d, mVar);
        if (A()) {
            Matrix matrix = mVar.f36428o;
            if (matrix != null) {
                this.f36487a.concat(matrix);
            }
            p(mVar);
            boolean zM0 = m0();
            F0(mVar, true);
            if (zM0) {
                j0(mVar);
            }
            U0(mVar);
        }
    }

    public final void r(x7.g.k0 k0Var) {
        x7.g.o0 o0Var = this.f36489d.f36519a.b;
        if (o0Var instanceof x7.g.u) {
            z(true, k0Var.f36421h, (x7.g.u) o0Var);
        }
        x7.g.o0 o0Var2 = this.f36489d.f36519a.f36337e;
        if (o0Var2 instanceof x7.g.u) {
            z(false, k0Var.f36421h, (x7.g.u) o0Var2);
        }
    }

    public final void r0(x7.g.o oVar) {
        x7.g.p pVar;
        String str;
        y("Image render", new Object[0]);
        x7.g.p pVar2 = oVar.f36437s;
        if (pVar2 == null || pVar2.l() || (pVar = oVar.f36438t) == null || pVar.l() || (str = oVar.f36434p) == null) {
            return;
        }
        x7.e eVar = oVar.f36441o;
        if (eVar == null) {
            eVar = x7.e.f36270e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            x7.g.k();
            return;
        }
        x7.g.b bVar = new x7.g.b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f36489d, oVar);
        if (A() && Y0()) {
            Matrix matrix = oVar.f36439u;
            if (matrix != null) {
                this.f36487a.concat(matrix);
            }
            x7.g.p pVar3 = oVar.f36435q;
            float f10 = pVar3 != null ? pVar3.f(this) : 0.0f;
            x7.g.p pVar4 = oVar.f36436r;
            this.f36489d.f36523f = new x7.g.b(f10, pVar4 != null ? pVar4.i(this) : 0.0f, oVar.f36437s.f(this), oVar.f36438t.f(this));
            if (!this.f36489d.f36519a.f36354v.booleanValue()) {
                x7.g.b bVar2 = this.f36489d.f36523f;
                O0(bVar2.f36306a, bVar2.b, bVar2.f36307c, bVar2.f36308d);
            }
            oVar.f36421h = this.f36489d.f36523f;
            U0(oVar);
            p(oVar);
            boolean zM0 = m0();
            X0();
            this.f36487a.save();
            this.f36487a.concat(o(this.f36489d.f36523f, bVar, eVar));
            this.f36487a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.f36489d.f36519a.M != x7.g.e0.e.optimizeSpeed ? 2 : 0));
            this.f36487a.restore();
            if (zM0) {
                j0(oVar);
            }
        }
    }

    public final Bitmap s(String str) {
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

    public final void s0(x7.g.q qVar) {
        y("Line render", new Object[0]);
        W0(this.f36489d, qVar);
        if (A() && Y0() && this.f36489d.f36520c) {
            Matrix matrix = qVar.f36422n;
            if (matrix != null) {
                this.f36487a.concat(matrix);
            }
            Path pathA0 = a0(qVar);
            U0(qVar);
            r(qVar);
            p(qVar);
            boolean zM0 = m0();
            C(pathA0);
            I0(qVar);
            if (zM0) {
                j0(qVar);
            }
        }
    }

    public final Typeface t(String str, Integer num, x7.g.e0.b bVar) {
        int i10;
        boolean z10 = bVar == x7.g.e0.b.Italic;
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

    public final void t0(x7.g.v vVar) {
        y("Path render", new Object[0]);
        if (vVar.f36467o == null) {
            return;
        }
        W0(this.f36489d, vVar);
        if (A() && Y0()) {
            C0752h c0752h = this.f36489d;
            if (c0752h.f36520c || c0752h.b) {
                Matrix matrix = vVar.f36422n;
                if (matrix != null) {
                    this.f36487a.concat(matrix);
                }
                Path pathF = new d(vVar.f36467o).f();
                if (vVar.f36421h == null) {
                    vVar.f36421h = m(pathF);
                }
                U0(vVar);
                r(vVar);
                p(vVar);
                boolean zM0 = m0();
                if (this.f36489d.b) {
                    pathF.setFillType(U());
                    B(vVar, pathF);
                }
                if (this.f36489d.f36520c) {
                    C(pathF);
                }
                I0(vVar);
                if (zM0) {
                    j0(vVar);
                }
            }
        }
    }

    public final void u(x7.g.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof x7.g.l0) && (bool = ((x7.g.l0) n0Var).f36424d) != null) {
            this.f36489d.f36525h = bool.booleanValue();
        }
    }

    public final void u0(x7.g.z zVar) {
        y("PolyLine render", new Object[0]);
        W0(this.f36489d, zVar);
        if (A() && Y0()) {
            C0752h c0752h = this.f36489d;
            if (c0752h.f36520c || c0752h.b) {
                Matrix matrix = zVar.f36422n;
                if (matrix != null) {
                    this.f36487a.concat(matrix);
                }
                if (zVar.f36482o.length < 2) {
                    return;
                }
                Path pathB0 = b0(zVar);
                U0(zVar);
                pathB0.setFillType(U());
                r(zVar);
                p(zVar);
                boolean zM0 = m0();
                if (this.f36489d.b) {
                    B(zVar, pathB0);
                }
                if (this.f36489d.f36520c) {
                    C(pathB0);
                }
                I0(zVar);
                if (zM0) {
                    j0(zVar);
                }
            }
        }
    }

    public final void v0(x7.g.a0 a0Var) {
        y("Polygon render", new Object[0]);
        W0(this.f36489d, a0Var);
        if (A() && Y0()) {
            C0752h c0752h = this.f36489d;
            if (c0752h.f36520c || c0752h.b) {
                Matrix matrix = a0Var.f36422n;
                if (matrix != null) {
                    this.f36487a.concat(matrix);
                }
                if (a0Var.f36482o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a0Var);
                U0(a0Var);
                r(a0Var);
                p(a0Var);
                boolean zM0 = m0();
                if (this.f36489d.b) {
                    B(a0Var, pathB0);
                }
                if (this.f36489d.f36520c) {
                    C(pathB0);
                }
                I0(a0Var);
                if (zM0) {
                    j0(a0Var);
                }
            }
        }
    }

    public final void w0(x7.g.b0 b0Var) {
        y("Rect render", new Object[0]);
        x7.g.p pVar = b0Var.f36311q;
        if (pVar == null || b0Var.f36312r == null || pVar.l() || b0Var.f36312r.l()) {
            return;
        }
        W0(this.f36489d, b0Var);
        if (A() && Y0()) {
            Matrix matrix = b0Var.f36422n;
            if (matrix != null) {
                this.f36487a.concat(matrix);
            }
            Path pathC0 = c0(b0Var);
            U0(b0Var);
            r(b0Var);
            p(b0Var);
            boolean zM0 = m0();
            if (this.f36489d.b) {
                B(b0Var, pathC0);
            }
            if (this.f36489d.f36520c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b0Var);
            }
        }
    }

    public final void x0(x7.g.f0 f0Var) {
        z0(f0Var, f0(f0Var.f36392q, f0Var.f36393r, f0Var.f36394s, f0Var.f36395t), f0Var.f36457p, f0Var.f36441o);
    }

    public final void y0(x7.g.f0 f0Var, x7.g.b bVar) {
        z0(f0Var, bVar, f0Var.f36457p, f0Var.f36441o);
    }

    public final void z(boolean z10, x7.g.b bVar, x7.g.u uVar) {
        x7.g.n0 n0VarP = this.f36488c.p(uVar.f36464a);
        if (n0VarP == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", uVar.f36464a);
            x7.g.o0 o0Var = uVar.b;
            if (o0Var != null) {
                P0(this.f36489d, z10, o0Var);
                return;
            } else if (z10) {
                this.f36489d.b = false;
                return;
            } else {
                this.f36489d.f36520c = false;
                return;
            }
        }
        if (n0VarP instanceof x7.g.m0) {
            X(z10, bVar, (x7.g.m0) n0VarP);
        } else if (n0VarP instanceof x7.g.q0) {
            e0(z10, bVar, (x7.g.q0) n0VarP);
        } else if (n0VarP instanceof x7.g.c0) {
            Q0(z10, (x7.g.c0) n0VarP);
        }
    }

    public final void z0(x7.g.f0 f0Var, x7.g.b bVar, x7.g.b bVar2, x7.e eVar) {
        y("Svg render", new Object[0]);
        if (bVar.f36307c == 0.0f || bVar.f36308d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f0Var.f36441o) == null) {
            eVar = x7.e.f36270e;
        }
        W0(this.f36489d, f0Var);
        if (A()) {
            C0752h c0752h = this.f36489d;
            c0752h.f36523f = bVar;
            if (!c0752h.f36519a.f36354v.booleanValue()) {
                x7.g.b bVar3 = this.f36489d.f36523f;
                O0(bVar3.f36306a, bVar3.b, bVar3.f36307c, bVar3.f36308d);
            }
            q(f0Var, this.f36489d.f36523f);
            if (bVar2 != null) {
                this.f36487a.concat(o(this.f36489d.f36523f, bVar2, eVar));
                this.f36489d.f36524g = f0Var.f36457p;
            } else {
                Canvas canvas = this.f36487a;
                x7.g.b bVar4 = this.f36489d.f36523f;
                canvas.translate(bVar4.f36306a, bVar4.b);
            }
            boolean zM0 = m0();
            X0();
            F0(f0Var, true);
            if (zM0) {
                j0(f0Var);
            }
            U0(f0Var);
        }
    }

    public class k extends j {
        public float b;

        public k() {
            super(h.this, null);
            this.b = 0.0f;
        }

        @Override // x7.h.j
        public void b(String str) {
            this.b += h.this.f36489d.f36521d.measureText(str);
        }

        public /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: x7.h$h, reason: collision with other inner class name */
    public class C0752h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x7.g.e0 f36519a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f36520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f36521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f36522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public x7.g.b f36523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public x7.g.b f36524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f36525h;

        public C0752h() {
            Paint paint = new Paint();
            this.f36521d = paint;
            paint.setFlags(193);
            this.f36521d.setHinting(0);
            this.f36521d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f36521d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f36522e = paint3;
            paint3.setFlags(193);
            this.f36522e.setHinting(0);
            this.f36522e.setStyle(Paint.Style.STROKE);
            this.f36522e.setTypeface(typeface);
            this.f36519a = x7.g.e0.a();
        }

        public C0752h(C0752h c0752h) {
            this.b = c0752h.b;
            this.f36520c = c0752h.f36520c;
            this.f36521d = new Paint(c0752h.f36521d);
            this.f36522e = new Paint(c0752h.f36522e);
            x7.g.b bVar = c0752h.f36523f;
            if (bVar != null) {
                this.f36523f = new x7.g.b(bVar);
            }
            x7.g.b bVar2 = c0752h.f36524g;
            if (bVar2 != null) {
                this.f36524g = new x7.g.b(bVar2);
            }
            this.f36525h = c0752h.f36525h;
            try {
                this.f36519a = (x7.g.e0) c0752h.f36519a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f36519a = x7.g.e0.a();
            }
        }
    }
}
