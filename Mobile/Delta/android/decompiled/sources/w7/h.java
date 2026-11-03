package w7;

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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HashSet<String> f34202i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f34203a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w7.g f34204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0632h f34205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Stack<C0632h> f34206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Stack<w7.g.j0> f34207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Stack<Matrix> f34208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w7.b.q f34209h = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34210a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f34211c;

        static {
            int[] iArr = new int[w7.g.e0.d.values().length];
            f34211c = iArr;
            try {
                iArr[w7.g.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34211c[w7.g.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34211c[w7.g.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[w7.g.e0.c.values().length];
            b = iArr2;
            try {
                iArr2[w7.g.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[w7.g.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[w7.g.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[w7.e.a.values().length];
            f34210a = iArr3;
            try {
                iArr3[w7.e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34210a[w7.e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34210a[w7.e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34210a[w7.e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34210a[w7.e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34210a[w7.e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34210a[w7.e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34210a[w7.e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public class b implements w7.g.x {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f34213c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f34218h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<c> f34212a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f34214d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f34215e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f34216f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f34217g = -1;

        public b(w7.g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
            if (this.f34218h) {
                this.f34214d.b(this.f34212a.get(this.f34217g));
                this.f34212a.set(this.f34217g, this.f34214d);
                this.f34218h = false;
            }
            c cVar = this.f34214d;
            if (cVar != null) {
                this.f34212a.add(cVar);
            }
        }

        @Override // w7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            this.f34214d.a(f10, f11);
            this.f34212a.add(this.f34214d);
            this.f34214d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f34218h = false;
        }

        @Override // w7.g.x
        public void b(float f10, float f11) {
            if (this.f34218h) {
                this.f34214d.b(this.f34212a.get(this.f34217g));
                this.f34212a.set(this.f34217g, this.f34214d);
                this.f34218h = false;
            }
            c cVar = this.f34214d;
            if (cVar != null) {
                this.f34212a.add(cVar);
            }
            this.b = f10;
            this.f34213c = f11;
            this.f34214d = h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f34217g = this.f34212a.size();
        }

        @Override // w7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f34216f || this.f34215e) {
                this.f34214d.a(f10, f11);
                this.f34212a.add(this.f34214d);
                this.f34215e = false;
            }
            this.f34214d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f34218h = false;
        }

        @Override // w7.g.x
        public void close() {
            this.f34212a.add(this.f34214d);
            e(this.b, this.f34213c);
            this.f34218h = true;
        }

        @Override // w7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f34215e = true;
            this.f34216f = false;
            c cVar = this.f34214d;
            h.h(cVar.f34220a, cVar.b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f34216f = true;
            this.f34218h = false;
        }

        @Override // w7.g.x
        public void e(float f10, float f11) {
            this.f34214d.a(f10, f11);
            this.f34212a.add(this.f34214d);
            h hVar = h.this;
            c cVar = this.f34214d;
            this.f34214d = hVar.new c(f10, f11, f10 - cVar.f34220a, f11 - cVar.b);
            this.f34218h = false;
        }

        public List<c> f() {
            return this.f34212a;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f34220a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f34221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f34222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f34223e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f34221c = 0.0f;
            this.f34222d = 0.0f;
            this.f34220a = f10;
            this.b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f34221c = (float) (((double) f12) / dSqrt);
                this.f34222d = (float) (((double) f13) / dSqrt);
            }
        }

        public void a(float f10, float f11) {
            float f12 = f10 - this.f34220a;
            float f13 = f11 - this.b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f34221c;
            if (f12 != (-f14) || f13 != (-this.f34222d)) {
                this.f34221c = f14 + f12;
                this.f34222d += f13;
            } else {
                this.f34223e = true;
                this.f34221c = -f13;
                this.f34222d = f12;
            }
        }

        public void b(c cVar) {
            float f10 = cVar.f34221c;
            float f11 = this.f34221c;
            if (f10 == (-f11)) {
                float f12 = cVar.f34222d;
                if (f12 == (-this.f34222d)) {
                    this.f34223e = true;
                    this.f34221c = -f12;
                    this.f34222d = cVar.f34221c;
                    return;
                }
            }
            this.f34221c = f11 + f10;
            this.f34222d += cVar.f34222d;
        }

        public String toString() {
            return "(" + this.f34220a + "," + this.b + " " + this.f34221c + "," + this.f34222d + ")";
        }
    }

    public class d implements w7.g.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Path f34225a = new Path();
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f34226c;

        public d(w7.g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
        }

        @Override // w7.g.x
        public void a(float f10, float f11, float f12, float f13) {
            this.f34225a.quadTo(f10, f11, f12, f13);
            this.b = f12;
            this.f34226c = f13;
        }

        @Override // w7.g.x
        public void b(float f10, float f11) {
            this.f34225a.moveTo(f10, f11);
            this.b = f10;
            this.f34226c = f11;
        }

        @Override // w7.g.x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f34225a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.b = f14;
            this.f34226c = f15;
        }

        @Override // w7.g.x
        public void close() {
            this.f34225a.close();
        }

        @Override // w7.g.x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.b, this.f34226c, f10, f11, f12, z10, z11, f13, f14, this);
            this.b = f13;
            this.f34226c = f14;
        }

        @Override // w7.g.x
        public void e(float f10, float f11) {
            this.f34225a.lineTo(f10, f11);
            this.b = f10;
            this.f34226c = f11;
        }

        public Path f() {
            return this.f34225a;
        }
    }

    public class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Path f34228e;

        public e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f34228e = path;
        }

        @Override // w7.h.f, w7.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f34205d.b) {
                    str2 = str;
                    h.this.f34203a.drawTextOnPath(str2, this.f34228e, this.b, this.f34230c, h.this.f34205d.f34237d);
                } else {
                    str2 = str;
                }
                if (h.this.f34205d.f34236c) {
                    h.this.f34203a.drawTextOnPath(str2, this.f34228e, this.b, this.f34230c, h.this.f34205d.f34238e);
                }
            } else {
                str2 = str;
            }
            this.b += h.this.f34205d.f34237d.measureText(str2);
        }
    }

    public class f extends j {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f34230c;

        public f(float f10, float f11) {
            super(h.this, null);
            this.b = f10;
            this.f34230c = f11;
        }

        @Override // w7.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f34205d.b) {
                    h.this.f34203a.drawText(str, this.b, this.f34230c, h.this.f34205d.f34237d);
                }
                if (h.this.f34205d.f34236c) {
                    h.this.f34203a.drawText(str, this.b, this.f34230c, h.this.f34205d.f34238e);
                }
            }
            this.b += h.this.f34205d.f34237d.measureText(str);
        }
    }

    public class g extends j {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f34232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f34233d;

        public g(float f10, float f11, Path path) {
            super(h.this, null);
            this.b = f10;
            this.f34232c = f11;
            this.f34233d = path;
        }

        @Override // w7.h.j
        public boolean a(w7.g.y0 y0Var) {
            if (!(y0Var instanceof w7.g.z0)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // w7.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f34205d.f34237d.getTextPath(str2, 0, str.length(), this.b, this.f34232c, path);
                this.f34233d.addPath(path);
            } else {
                str2 = str;
            }
            this.b += h.this.f34205d.f34237d.measureText(str2);
        }
    }

    public class i extends j {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f34243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RectF f34244d;

        public i(float f10, float f11) {
            super(h.this, null);
            this.f34244d = new RectF();
            this.b = f10;
            this.f34243c = f11;
        }

        @Override // w7.h.j
        public boolean a(w7.g.y0 y0Var) {
            if (!(y0Var instanceof w7.g.z0)) {
                return true;
            }
            w7.g.z0 z0Var = (w7.g.z0) y0Var;
            w7.g.n0 n0VarP = y0Var.f34149a.p(z0Var.f34199o);
            if (n0VarP == null) {
                h.F("TextPath path reference '%s' not found", z0Var.f34199o);
                return false;
            }
            w7.g.v vVar = (w7.g.v) n0VarP;
            Path pathF = h.this.new d(vVar.f34183o).f();
            Matrix matrix = vVar.f34138n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.f34244d.union(rectF);
            return false;
        }

        @Override // w7.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f34205d.f34237d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.b, this.f34243c);
                this.f34244d.union(rectF);
            }
            this.b += h.this.f34205d.f34237d.measureText(str);
        }
    }

    public abstract class j {
        public j() {
        }

        public boolean a(w7.g.y0 y0Var) {
            return true;
        }

        public abstract void b(String str);

        public /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    public h(Canvas canvas, float f10) {
        this.f34203a = canvas;
        this.b = f10;
    }

    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static synchronized void V() {
        HashSet<String> hashSet = new HashSet<>();
        f34202i = hashSet;
        hashSet.add("Structure");
        f34202i.add("BasicStructure");
        f34202i.add("ConditionalProcessing");
        f34202i.add("Image");
        f34202i.add("Style");
        f34202i.add("ViewportAttribute");
        f34202i.add("Shape");
        f34202i.add("BasicText");
        f34202i.add("PaintAttribute");
        f34202i.add("BasicPaintAttribute");
        f34202i.add("OpacityAttribute");
        f34202i.add("BasicGraphicsAttribute");
        f34202i.add("Marker");
        f34202i.add("Gradient");
        f34202i.add("Pattern");
        f34202i.add("Clip");
        f34202i.add("BasicClip");
        f34202i.add("Mask");
        f34202i.add("View");
    }

    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, w7.g.x xVar) {
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
        Boolean bool = this.f34205d.f34235a.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void A0(w7.g.n0 n0Var) {
        if (n0Var instanceof w7.g.t) {
            return;
        }
        S0();
        u(n0Var);
        if (n0Var instanceof w7.g.f0) {
            x0((w7.g.f0) n0Var);
        } else if (n0Var instanceof w7.g.e1) {
            E0((w7.g.e1) n0Var);
        } else if (n0Var instanceof w7.g.s0) {
            B0((w7.g.s0) n0Var);
        } else if (n0Var instanceof w7.g.m) {
            q0((w7.g.m) n0Var);
        } else if (n0Var instanceof w7.g.o) {
            r0((w7.g.o) n0Var);
        } else if (n0Var instanceof w7.g.v) {
            t0((w7.g.v) n0Var);
        } else if (n0Var instanceof w7.g.b0) {
            w0((w7.g.b0) n0Var);
        } else if (n0Var instanceof w7.g.d) {
            o0((w7.g.d) n0Var);
        } else if (n0Var instanceof w7.g.i) {
            p0((w7.g.i) n0Var);
        } else if (n0Var instanceof w7.g.q) {
            s0((w7.g.q) n0Var);
        } else if (n0Var instanceof w7.g.a0) {
            v0((w7.g.a0) n0Var);
        } else if (n0Var instanceof w7.g.z) {
            u0((w7.g.z) n0Var);
        } else if (n0Var instanceof w7.g.w0) {
            D0((w7.g.w0) n0Var);
        }
        R0();
    }

    public final void B(w7.g.k0 k0Var, Path path) {
        w7.g.o0 o0Var = this.f34205d.f34235a.b;
        if (o0Var instanceof w7.g.u) {
            w7.g.n0 n0VarP = this.f34204c.p(((w7.g.u) o0Var).f34180a);
            if (n0VarP instanceof w7.g.y) {
                L(k0Var, path, (w7.g.y) n0VarP);
                return;
            }
        }
        this.f34203a.drawPath(path, this.f34205d.f34237d);
    }

    public final void B0(w7.g.s0 s0Var) {
        y("Switch render", new Object[0]);
        W0(this.f34205d, s0Var);
        if (A()) {
            Matrix matrix = s0Var.f34144o;
            if (matrix != null) {
                this.f34203a.concat(matrix);
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
        C0632h c0632h = this.f34205d;
        if (c0632h.f34235a.L != w7.g.e0.i.NonScalingStroke) {
            this.f34203a.drawPath(path, c0632h.f34238e);
            return;
        }
        Matrix matrix = this.f34203a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f34203a.setMatrix(new Matrix());
        Shader shader = this.f34205d.f34238e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f34203a.drawPath(path2, this.f34205d.f34238e);
        this.f34203a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void C0(w7.g.t0 t0Var, w7.g.b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.f34023c == 0.0f || bVar.f34024d == 0.0f) {
            return;
        }
        w7.e eVar = t0Var.f34157o;
        if (eVar == null) {
            eVar = w7.e.f33986e;
        }
        W0(this.f34205d, t0Var);
        C0632h c0632h = this.f34205d;
        c0632h.f34239f = bVar;
        if (!c0632h.f34235a.f34070v.booleanValue()) {
            w7.g.b bVar2 = this.f34205d.f34239f;
            O0(bVar2.f34022a, bVar2.b, bVar2.f34023c, bVar2.f34024d);
        }
        w7.g.b bVar3 = t0Var.f34173p;
        if (bVar3 != null) {
            this.f34203a.concat(o(this.f34205d.f34239f, bVar3, eVar));
            this.f34205d.f34240g = t0Var.f34173p;
        } else {
            Canvas canvas = this.f34203a;
            w7.g.b bVar4 = this.f34205d.f34239f;
            canvas.translate(bVar4.f34022a, bVar4.b);
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

    public final void D0(w7.g.w0 w0Var) {
        y("Text render", new Object[0]);
        W0(this.f34205d, w0Var);
        if (A()) {
            Matrix matrix = w0Var.f34189s;
            if (matrix != null) {
                this.f34203a.concat(matrix);
            }
            List<w7.g.p> list = w0Var.f34018o;
            float fH = 0.0f;
            float f10 = (list == null || list.size() == 0) ? 0.0f : w0Var.f34018o.get(0).f(this);
            List<w7.g.p> list2 = w0Var.f34019p;
            float fH2 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f34019p.get(0).h(this);
            List<w7.g.p> list3 = w0Var.f34020q;
            float f11 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f34020q.get(0).f(this);
            List<w7.g.p> list4 = w0Var.f34021r;
            if (list4 != null && list4.size() != 0) {
                fH = w0Var.f34021r.get(0).h(this);
            }
            w7.g.e0.f fVarO = O();
            if (fVarO != w7.g.e0.f.Start) {
                float fN = n(w0Var);
                if (fVarO == w7.g.e0.f.Middle) {
                    fN /= 2.0f;
                }
                f10 -= fN;
            }
            if (w0Var.f34137h == null) {
                i iVar = new i(f10, fH2);
                E(w0Var, iVar);
                RectF rectF = iVar.f34244d;
                w0Var.f34137h = new w7.g.b(rectF.left, rectF.top, rectF.width(), iVar.f34244d.height());
            }
            U0(w0Var);
            r(w0Var);
            p(w0Var);
            boolean zM0 = m0();
            E(w0Var, new f(f10 + f11, fH2 + fH));
            if (zM0) {
                j0(w0Var);
            }
        }
    }

    public final void E(w7.g.y0 y0Var, j jVar) {
        if (A()) {
            Iterator<w7.g.n0> it = y0Var.f34114i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                w7.g.n0 next = it.next();
                if (next instanceof w7.g.c1) {
                    jVar.b(T0(((w7.g.c1) next).f34034c, z10, !it.hasNext()));
                } else {
                    l0(next, jVar);
                }
                z10 = false;
            }
        }
    }

    public final void E0(w7.g.e1 e1Var) {
        y("Use render", new Object[0]);
        w7.g.p pVar = e1Var.f34104s;
        if (pVar == null || !pVar.j()) {
            w7.g.p pVar2 = e1Var.f34105t;
            if (pVar2 == null || !pVar2.j()) {
                W0(this.f34205d, e1Var);
                if (A()) {
                    w7.g.n0 n0VarP = e1Var.f34149a.p(e1Var.f34101p);
                    if (n0VarP == null) {
                        F("Use reference '%s' not found", e1Var.f34101p);
                        return;
                    }
                    Matrix matrix = e1Var.f34144o;
                    if (matrix != null) {
                        this.f34203a.concat(matrix);
                    }
                    w7.g.p pVar3 = e1Var.f34102q;
                    float f10 = pVar3 != null ? pVar3.f(this) : 0.0f;
                    w7.g.p pVar4 = e1Var.f34103r;
                    this.f34203a.translate(f10, pVar4 != null ? pVar4.h(this) : 0.0f);
                    p(e1Var);
                    boolean zM0 = m0();
                    i0(e1Var);
                    if (n0VarP instanceof w7.g.f0) {
                        w7.g.b bVarF0 = f0(null, null, e1Var.f34104s, e1Var.f34105t);
                        S0();
                        y0((w7.g.f0) n0VarP, bVarF0);
                        R0();
                    } else if (n0VarP instanceof w7.g.t0) {
                        w7.g.p pVar5 = e1Var.f34104s;
                        if (pVar5 == null) {
                            pVar5 = new w7.g.p(100.0f, w7.g.d1.percent);
                        }
                        w7.g.p pVar6 = e1Var.f34105t;
                        if (pVar6 == null) {
                            pVar6 = new w7.g.p(100.0f, w7.g.d1.percent);
                        }
                        w7.g.b bVarF1 = f0(null, null, pVar5, pVar6);
                        S0();
                        C0((w7.g.t0) n0VarP, bVarF1);
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

    public final void F0(w7.g.j0 j0Var, boolean z10) {
        if (z10) {
            i0(j0Var);
        }
        Iterator<w7.g.n0> it = j0Var.getChildren().iterator();
        while (it.hasNext()) {
            A0(it.next());
        }
        if (z10) {
            h0();
        }
    }

    public final void G(w7.g.y0 y0Var, StringBuilder sb2) {
        Iterator<w7.g.n0> it = y0Var.f34114i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            w7.g.n0 next = it.next();
            if (next instanceof w7.g.y0) {
                G((w7.g.y0) next, sb2);
            } else if (next instanceof w7.g.c1) {
                sb2.append(T0(((w7.g.c1) next).f34034c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public void G0(w7.g gVar, w7.f fVar) {
        w7.g.b bVar;
        w7.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f34204c = gVar;
        w7.g.f0 f0VarM = gVar.m();
        if (f0VarM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.e()) {
            w7.g.l0 l0VarI = this.f34204c.i(fVar.f34009e);
            if (l0VarI == null || !(l0VarI instanceof w7.g.f1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f34009e));
                return;
            }
            w7.g.f1 f1Var = (w7.g.f1) l0VarI;
            bVar = f1Var.f34173p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f34009e));
                return;
            }
            eVar = f1Var.f34157o;
        } else {
            bVar = fVar.f() ? fVar.f34008d : f0VarM.f34173p;
            eVar = fVar.c() ? fVar.b : f0VarM.f34157o;
        }
        if (fVar.b()) {
            gVar.a(fVar.f34006a);
        }
        if (fVar.d()) {
            w7.b.q qVar = new w7.b.q();
            this.f34209h = qVar;
            qVar.f33973a = gVar.i(fVar.f34007c);
        }
        N0();
        u(f0VarM);
        S0();
        w7.g.b bVar2 = new w7.g.b(fVar.f34010f);
        w7.g.p pVar = f0VarM.f34110s;
        if (pVar != null) {
            bVar2.f34023c = pVar.e(this, bVar2.f34023c);
        }
        w7.g.p pVar2 = f0VarM.f34111t;
        if (pVar2 != null) {
            bVar2.f34024d = pVar2.e(this, bVar2.f34024d);
        }
        z0(f0VarM, bVar2, bVar, eVar);
        R0();
        if (fVar.b()) {
            gVar.b();
        }
    }

    public final void H(w7.g.j jVar, String str) {
        w7.g.n0 n0VarP = jVar.f34149a.p(str);
        if (n0VarP == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(n0VarP instanceof w7.g.j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (n0VarP == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        w7.g.j jVar2 = (w7.g.j) n0VarP;
        if (jVar.f34130i == null) {
            jVar.f34130i = jVar2.f34130i;
        }
        if (jVar.f34131j == null) {
            jVar.f34131j = jVar2.f34131j;
        }
        if (jVar.f34132k == null) {
            jVar.f34132k = jVar2.f34132k;
        }
        if (jVar.f34129h.isEmpty()) {
            jVar.f34129h = jVar2.f34129h;
        }
        try {
            if (jVar instanceof w7.g.m0) {
                I((w7.g.m0) jVar, (w7.g.m0) n0VarP);
            } else {
                J((w7.g.q0) jVar, (w7.g.q0) n0VarP);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f34133l;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(w7.g.r r12, w7.h.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.H0(w7.g$r, w7.h$c):void");
    }

    public final void I(w7.g.m0 m0Var, w7.g.m0 m0Var2) {
        if (m0Var.f34145m == null) {
            m0Var.f34145m = m0Var2.f34145m;
        }
        if (m0Var.f34146n == null) {
            m0Var.f34146n = m0Var2.f34146n;
        }
        if (m0Var.f34147o == null) {
            m0Var.f34147o = m0Var2.f34147o;
        }
        if (m0Var.f34148p == null) {
            m0Var.f34148p = m0Var2.f34148p;
        }
    }

    public final void I0(w7.g.l lVar) {
        w7.g.r rVar;
        w7.g.r rVar2;
        w7.g.r rVar3;
        List<c> listK;
        int size;
        w7.g.e0 e0Var = this.f34205d.f34235a;
        String str = e0Var.f34072x;
        if (str == null && e0Var.f34073y == null && e0Var.f34074z == null) {
            return;
        }
        if (str == null) {
            rVar = null;
        } else {
            w7.g.n0 n0VarP = lVar.f34149a.p(str);
            if (n0VarP != null) {
                rVar = (w7.g.r) n0VarP;
            } else {
                F("Marker reference '%s' not found", this.f34205d.f34235a.f34072x);
                rVar = null;
            }
        }
        String str2 = this.f34205d.f34235a.f34073y;
        if (str2 == null) {
            rVar2 = null;
        } else {
            w7.g.n0 n0VarP2 = lVar.f34149a.p(str2);
            if (n0VarP2 != null) {
                rVar2 = (w7.g.r) n0VarP2;
            } else {
                F("Marker reference '%s' not found", this.f34205d.f34235a.f34073y);
                rVar2 = null;
            }
        }
        String str3 = this.f34205d.f34235a.f34074z;
        if (str3 == null) {
            rVar3 = null;
        } else {
            w7.g.n0 n0VarP3 = lVar.f34149a.p(str3);
            if (n0VarP3 != null) {
                rVar3 = (w7.g.r) n0VarP3;
            } else {
                F("Marker reference '%s' not found", this.f34205d.f34235a.f34074z);
                rVar3 = null;
            }
        }
        if (lVar instanceof w7.g.v) {
            listK = new b(((w7.g.v) lVar).f34183o).f();
        } else {
            listK = lVar instanceof w7.g.q ? k((w7.g.q) lVar) : l((w7.g.z) lVar);
        }
        if (listK == null || (size = listK.size()) == 0) {
            return;
        }
        w7.g.e0 e0Var2 = this.f34205d.f34235a;
        e0Var2.f34074z = null;
        e0Var2.f34073y = null;
        e0Var2.f34072x = null;
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
                cVarN0 = cVar.f34223e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(rVar2, cVarN0);
                cVar = cVar2;
            }
        }
        if (rVar3 != null) {
            H0(rVar3, listK.get(size - 1));
        }
    }

    public final void J(w7.g.q0 q0Var, w7.g.q0 q0Var2) {
        if (q0Var.f34162m == null) {
            q0Var.f34162m = q0Var2.f34162m;
        }
        if (q0Var.f34163n == null) {
            q0Var.f34163n = q0Var2.f34163n;
        }
        if (q0Var.f34164o == null) {
            q0Var.f34164o = q0Var2.f34164o;
        }
        if (q0Var.f34165p == null) {
            q0Var.f34165p = q0Var2.f34165p;
        }
        if (q0Var.f34166q == null) {
            q0Var.f34166q = q0Var2.f34166q;
        }
    }

    public final void J0(w7.g.s sVar, w7.g.k0 k0Var, w7.g.b bVar) {
        float f10;
        float fH;
        y("Mask render", new Object[0]);
        Boolean bool = sVar.f34174o;
        if (bool == null || !bool.booleanValue()) {
            w7.g.p pVar = sVar.f34178s;
            float fE = pVar != null ? pVar.e(this, 1.0f) : 1.2f;
            w7.g.p pVar2 = sVar.f34179t;
            float fE2 = pVar2 != null ? pVar2.e(this, 1.0f) : 1.2f;
            f10 = fE * bVar.f34023c;
            fH = fE2 * bVar.f34024d;
        } else {
            w7.g.p pVar3 = sVar.f34178s;
            f10 = pVar3 != null ? pVar3.f(this) : bVar.f34023c;
            w7.g.p pVar4 = sVar.f34179t;
            fH = pVar4 != null ? pVar4.h(this) : bVar.f34024d;
        }
        if (f10 == 0.0f || fH == 0.0f) {
            return;
        }
        S0();
        C0632h c0632hM = M(sVar);
        this.f34205d = c0632hM;
        c0632hM.f34235a.f34061m = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f34203a.save();
        Boolean bool2 = sVar.f34175p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f34203a.translate(bVar.f34022a, bVar.b);
            this.f34203a.scale(bVar.f34023c, bVar.f34024d);
        }
        F0(sVar, false);
        this.f34203a.restore();
        if (zM0) {
            k0(k0Var, bVar);
        }
        R0();
    }

    public final void K(w7.g.y yVar, String str) {
        w7.g.n0 n0VarP = yVar.f34149a.p(str);
        if (n0VarP == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(n0VarP instanceof w7.g.y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n0VarP == yVar) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        w7.g.y yVar2 = (w7.g.y) n0VarP;
        if (yVar.f34190q == null) {
            yVar.f34190q = yVar2.f34190q;
        }
        if (yVar.f34191r == null) {
            yVar.f34191r = yVar2.f34191r;
        }
        if (yVar.f34192s == null) {
            yVar.f34192s = yVar2.f34192s;
        }
        if (yVar.f34193t == null) {
            yVar.f34193t = yVar2.f34193t;
        }
        if (yVar.f34194u == null) {
            yVar.f34194u = yVar2.f34194u;
        }
        if (yVar.f34195v == null) {
            yVar.f34195v = yVar2.f34195v;
        }
        if (yVar.f34196w == null) {
            yVar.f34196w = yVar2.f34196w;
        }
        if (yVar.f34114i.isEmpty()) {
            yVar.f34114i = yVar2.f34114i;
        }
        if (yVar.f34173p == null) {
            yVar.f34173p = yVar2.f34173p;
        }
        if (yVar.f34157o == null) {
            yVar.f34157o = yVar2.f34157o;
        }
        String str2 = yVar2.f34197x;
        if (str2 != null) {
            K(yVar, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(w7.g.s0 s0Var) {
        Set<String> setB;
        String language = Locale.getDefault().getLanguage();
        w7.g.k();
        for (w7.g.n0 n0Var : s0Var.getChildren()) {
            if (n0Var instanceof w7.g.g0) {
                w7.g.g0 g0Var = (w7.g.g0) n0Var;
                if (g0Var.c() == null && ((setB = g0Var.b()) == null || (!setB.isEmpty() && setB.contains(language)))) {
                    Set<String> setG = g0Var.g();
                    if (setG != null) {
                        if (f34202i == null) {
                            V();
                        }
                        if (setG.isEmpty() || !f34202i.containsAll(setG)) {
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
    public final void L(w7.g.k0 k0Var, Path path, w7.g.y yVar) {
        float f10;
        float fH;
        float fH2;
        float f11;
        boolean z10;
        boolean z11;
        Boolean bool = yVar.f34190q;
        boolean z12 = bool != null && bool.booleanValue();
        String str = yVar.f34197x;
        if (str != null) {
            K(yVar, str);
        }
        if (z12) {
            w7.g.p pVar = yVar.f34193t;
            f10 = pVar != null ? pVar.f(this) : 0.0f;
            w7.g.p pVar2 = yVar.f34194u;
            fH2 = pVar2 != null ? pVar2.h(this) : 0.0f;
            w7.g.p pVar3 = yVar.f34195v;
            f11 = pVar3 != null ? pVar3.f(this) : 0.0f;
            w7.g.p pVar4 = yVar.f34196w;
            fH = pVar4 != null ? pVar4.h(this) : 0.0f;
        } else {
            w7.g.p pVar5 = yVar.f34193t;
            float fE = pVar5 != null ? pVar5.e(this, 1.0f) : 0.0f;
            w7.g.p pVar6 = yVar.f34194u;
            float fE2 = pVar6 != null ? pVar6.e(this, 1.0f) : 0.0f;
            w7.g.p pVar7 = yVar.f34195v;
            float fE3 = pVar7 != null ? pVar7.e(this, 1.0f) : 0.0f;
            w7.g.p pVar8 = yVar.f34196w;
            float fE4 = pVar8 != null ? pVar8.e(this, 1.0f) : 0.0f;
            w7.g.b bVar = k0Var.f34137h;
            float f12 = bVar.f34022a;
            float f13 = bVar.f34023c;
            f10 = (fE * f13) + f12;
            float f14 = bVar.b;
            float f15 = bVar.f34024d;
            float f16 = fE3 * f13;
            fH = fE4 * f15;
            fH2 = (fE2 * f15) + f14;
            f11 = f16;
        }
        if (f11 == 0.0f || fH == 0.0f) {
            return;
        }
        w7.e eVar = yVar.f34157o;
        if (eVar == null) {
            eVar = w7.e.f33986e;
        }
        S0();
        this.f34203a.clipPath(path);
        C0632h c0632h = new C0632h();
        V0(c0632h, w7.g.e0.a());
        c0632h.f34235a.f34070v = Boolean.FALSE;
        this.f34205d = N(yVar, c0632h);
        w7.g.b bVar2 = k0Var.f34137h;
        Matrix matrix = yVar.f34192s;
        if (matrix != null) {
            this.f34203a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (yVar.f34192s.invert(matrix2)) {
                w7.g.b bVar3 = k0Var.f34137h;
                float f17 = bVar3.f34022a;
                float f18 = bVar3.b;
                float fB = bVar3.b();
                w7.g.b bVar4 = k0Var.f34137h;
                z10 = false;
                float f19 = bVar4.b;
                float fB2 = bVar4.b();
                z11 = true;
                float fC = k0Var.f34137h.c();
                w7.g.b bVar5 = k0Var.f34137h;
                float[] fArr = {f17, f18, fB, f19, fB2, fC, bVar5.f34022a, bVar5.c()};
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
                bVar2 = new w7.g.b(f24, f25, rectF.right - f24, rectF.bottom - f25);
            } else {
                z10 = false;
                z11 = true;
            }
        } else {
            z10 = false;
            z11 = true;
        }
        float fFloor = f10 + (((float) Math.floor((bVar2.f34022a - f10) / f11)) * f11);
        float fB3 = bVar2.b();
        float fC2 = bVar2.c();
        w7.g.b bVar6 = new w7.g.b(0.0f, 0.0f, f11, fH);
        boolean zM0 = m0();
        for (float fFloor2 = fH2 + (((float) Math.floor((bVar2.b - fH2) / fH)) * fH); fFloor2 < fC2; fFloor2 += fH) {
            float f26 = fFloor;
            while (f26 < fB3) {
                bVar6.f34022a = f26;
                bVar6.b = fFloor2;
                S0();
                if (!this.f34205d.f34235a.f34070v.booleanValue()) {
                    O0(bVar6.f34022a, bVar6.b, bVar6.f34023c, bVar6.f34024d);
                }
                w7.g.b bVar7 = yVar.f34173p;
                if (bVar7 != null) {
                    this.f34203a.concat(o(bVar6, bVar7, eVar));
                } else {
                    Boolean bool2 = yVar.f34191r;
                    boolean z13 = (bool2 == null || bool2.booleanValue()) ? z11 : z10;
                    this.f34203a.translate(f26, fFloor2);
                    if (!z13) {
                        Canvas canvas = this.f34203a;
                        w7.g.b bVar8 = k0Var.f34137h;
                        canvas.scale(bVar8.f34023c, bVar8.f34024d);
                    }
                }
                Iterator<w7.g.n0> it = yVar.f34114i.iterator();
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

    public final void L0(w7.g.z0 z0Var) {
        y("TextPath render", new Object[0]);
        W0(this.f34205d, z0Var);
        if (A() && Y0()) {
            w7.g.n0 n0VarP = z0Var.f34149a.p(z0Var.f34199o);
            if (n0VarP == null) {
                F("TextPath reference '%s' not found", z0Var.f34199o);
                return;
            }
            w7.g.v vVar = (w7.g.v) n0VarP;
            Path pathF = new d(vVar.f34183o).f();
            Matrix matrix = vVar.f34138n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            w7.g.p pVar = z0Var.f34200p;
            float fE = pVar != null ? pVar.e(this, pathMeasure.getLength()) : 0.0f;
            w7.g.e0.f fVarO = O();
            if (fVarO != w7.g.e0.f.Start) {
                float fN = n(z0Var);
                if (fVarO == w7.g.e0.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            r((w7.g.k0) z0Var.e());
            boolean zM0 = m0();
            E(z0Var, new e(pathF, fE, 0.0f));
            if (zM0) {
                j0(z0Var);
            }
        }
    }

    public final C0632h M(w7.g.n0 n0Var) {
        C0632h c0632h = new C0632h();
        V0(c0632h, w7.g.e0.a());
        return N(n0Var, c0632h);
    }

    public final boolean M0() {
        return this.f34205d.f34235a.f34061m.floatValue() < 1.0f || this.f34205d.f34235a.G != null;
    }

    public final C0632h N(w7.g.n0 n0Var, C0632h c0632h) {
        int i10;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i10 = 0;
            if (n0Var instanceof w7.g.l0) {
                arrayList.add(0, (w7.g.l0) n0Var);
            }
            Object obj = n0Var.b;
            if (obj == null) {
                break;
            }
            n0Var = (w7.g.n0) obj;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            W0(c0632h, (w7.g.l0) obj2);
        }
        C0632h c0632h2 = this.f34205d;
        c0632h.f34240g = c0632h2.f34240g;
        c0632h.f34239f = c0632h2.f34239f;
        return c0632h;
    }

    public final void N0() {
        this.f34205d = new C0632h();
        this.f34206e = new Stack<>();
        V0(this.f34205d, w7.g.e0.a());
        C0632h c0632h = this.f34205d;
        c0632h.f34239f = null;
        c0632h.f34241h = false;
        this.f34206e.push(new C0632h(c0632h));
        this.f34208g = new Stack<>();
        this.f34207f = new Stack<>();
    }

    public final w7.g.e0.f O() {
        w7.g.e0.f fVar;
        w7.g.e0 e0Var = this.f34205d.f34235a;
        if (e0Var.f34068t == w7.g.e0.h.LTR || (fVar = e0Var.f34069u) == w7.g.e0.f.Middle) {
            return e0Var.f34069u;
        }
        w7.g.e0.f fVar2 = w7.g.e0.f.Start;
        return fVar == fVar2 ? w7.g.e0.f.End : fVar2;
    }

    public final void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float fH = f13 + f11;
        w7.g.c cVar = this.f34205d.f34235a.f34071w;
        if (cVar != null) {
            f10 += cVar.f34033d.f(this);
            f11 += this.f34205d.f34235a.f34071w.f34031a.h(this);
            f14 -= this.f34205d.f34235a.f34071w.b.f(this);
            fH -= this.f34205d.f34235a.f34071w.f34032c.h(this);
        }
        this.f34203a.clipRect(f10, f11, f14, fH);
    }

    public final Path.FillType P() {
        w7.g.e0.a aVar = this.f34205d.f34235a.F;
        return (aVar == null || aVar != w7.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void P0(C0632h c0632h, boolean z10, w7.g.o0 o0Var) {
        int i10;
        w7.g.e0 e0Var = c0632h.f34235a;
        float fFloatValue = (z10 ? e0Var.f34052d : e0Var.f34054f).floatValue();
        if (o0Var instanceof w7.g.f) {
            i10 = ((w7.g.f) o0Var).f34107a;
        } else if (!(o0Var instanceof w7.g.C0631g)) {
            return;
        } else {
            i10 = c0632h.f34235a.f34062n.f34107a;
        }
        int iX = x(i10, fFloatValue);
        if (z10) {
            c0632h.f34237d.setColor(iX);
        } else {
            c0632h.f34238e.setColor(iX);
        }
    }

    public float Q() {
        return this.f34205d.f34237d.getTextSize();
    }

    public final void Q0(boolean z10, w7.g.c0 c0Var) {
        if (z10) {
            if (W(c0Var.f34141e, 2147483648L)) {
                C0632h c0632h = this.f34205d;
                w7.g.e0 e0Var = c0632h.f34235a;
                w7.g.o0 o0Var = c0Var.f34141e.H;
                e0Var.b = o0Var;
                c0632h.b = o0Var != null;
            }
            if (W(c0Var.f34141e, 4294967296L)) {
                this.f34205d.f34235a.f34052d = c0Var.f34141e.I;
            }
            if (W(c0Var.f34141e, 6442450944L)) {
                C0632h c0632h2 = this.f34205d;
                P0(c0632h2, z10, c0632h2.f34235a.b);
                return;
            }
            return;
        }
        if (W(c0Var.f34141e, 2147483648L)) {
            C0632h c0632h3 = this.f34205d;
            w7.g.e0 e0Var2 = c0632h3.f34235a;
            w7.g.o0 o0Var2 = c0Var.f34141e.H;
            e0Var2.f34053e = o0Var2;
            c0632h3.f34236c = o0Var2 != null;
        }
        if (W(c0Var.f34141e, 4294967296L)) {
            this.f34205d.f34235a.f34054f = c0Var.f34141e.I;
        }
        if (W(c0Var.f34141e, 6442450944L)) {
            C0632h c0632h4 = this.f34205d;
            P0(c0632h4, z10, c0632h4.f34235a.f34053e);
        }
    }

    public float R() {
        return this.f34205d.f34237d.getTextSize() / 2.0f;
    }

    public final void R0() {
        this.f34203a.restore();
        this.f34205d = this.f34206e.pop();
    }

    public w7.g.b S() {
        C0632h c0632h = this.f34205d;
        w7.g.b bVar = c0632h.f34240g;
        return bVar != null ? bVar : c0632h.f34239f;
    }

    public final void S0() {
        this.f34203a.save();
        this.f34206e.push(this.f34205d);
        this.f34205d = new C0632h(this.f34205d);
    }

    public float T() {
        return this.b;
    }

    public final String T0(String str, boolean z10, boolean z11) {
        if (this.f34205d.f34241h) {
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

    public final Path.FillType U() {
        w7.g.e0.a aVar = this.f34205d.f34235a.f34051c;
        return (aVar == null || aVar != w7.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void U0(w7.g.k0 k0Var) {
        if (k0Var.b == null || k0Var.f34137h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f34208g.peek().invert(matrix)) {
            w7.g.b bVar = k0Var.f34137h;
            float f10 = bVar.f34022a;
            float f11 = bVar.b;
            float fB = bVar.b();
            w7.g.b bVar2 = k0Var.f34137h;
            float f12 = bVar2.b;
            float fB2 = bVar2.b();
            float fC = k0Var.f34137h.c();
            w7.g.b bVar3 = k0Var.f34137h;
            float[] fArr = {f10, f11, fB, f12, fB2, fC, bVar3.f34022a, bVar3.c()};
            matrix.preConcat(this.f34203a.getMatrix());
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
            w7.g.k0 k0Var2 = (w7.g.k0) this.f34207f.peek();
            w7.g.b bVar4 = k0Var2.f34137h;
            if (bVar4 == null) {
                k0Var2.f34137h = w7.g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(w7.g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final void V0(C0632h c0632h, w7.g.e0 e0Var) {
        if (W(e0Var, 4096L)) {
            c0632h.f34235a.f34062n = e0Var.f34062n;
        }
        if (W(e0Var, 2048L)) {
            c0632h.f34235a.f34061m = e0Var.f34061m;
        }
        if (W(e0Var, 1L)) {
            c0632h.f34235a.b = e0Var.b;
            w7.g.o0 o0Var = e0Var.b;
            c0632h.b = (o0Var == null || o0Var == w7.g.f.f34106c) ? false : true;
        }
        if (W(e0Var, 4L)) {
            c0632h.f34235a.f34052d = e0Var.f34052d;
        }
        if (W(e0Var, 6149L)) {
            P0(c0632h, true, c0632h.f34235a.b);
        }
        if (W(e0Var, 2L)) {
            c0632h.f34235a.f34051c = e0Var.f34051c;
        }
        if (W(e0Var, 8L)) {
            c0632h.f34235a.f34053e = e0Var.f34053e;
            w7.g.o0 o0Var2 = e0Var.f34053e;
            c0632h.f34236c = (o0Var2 == null || o0Var2 == w7.g.f.f34106c) ? false : true;
        }
        if (W(e0Var, 16L)) {
            c0632h.f34235a.f34054f = e0Var.f34054f;
        }
        if (W(e0Var, 6168L)) {
            P0(c0632h, false, c0632h.f34235a.f34053e);
        }
        if (W(e0Var, 34359738368L)) {
            c0632h.f34235a.L = e0Var.L;
        }
        if (W(e0Var, 32L)) {
            w7.g.e0 e0Var2 = c0632h.f34235a;
            w7.g.p pVar = e0Var.f34055g;
            e0Var2.f34055g = pVar;
            c0632h.f34238e.setStrokeWidth(pVar.c(this));
        }
        if (W(e0Var, 64L)) {
            c0632h.f34235a.f34056h = e0Var.f34056h;
            int i10 = a.b[e0Var.f34056h.ordinal()];
            if (i10 == 1) {
                c0632h.f34238e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0632h.f34238e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0632h.f34238e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e0Var, 128L)) {
            c0632h.f34235a.f34057i = e0Var.f34057i;
            int i11 = a.f34211c[e0Var.f34057i.ordinal()];
            if (i11 == 1) {
                c0632h.f34238e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0632h.f34238e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0632h.f34238e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e0Var, 256L)) {
            c0632h.f34235a.f34058j = e0Var.f34058j;
            c0632h.f34238e.setStrokeMiter(e0Var.f34058j.floatValue());
        }
        if (W(e0Var, 512L)) {
            c0632h.f34235a.f34059k = e0Var.f34059k;
        }
        if (W(e0Var, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) {
            c0632h.f34235a.f34060l = e0Var.f34060l;
        }
        Typeface typefaceT = null;
        if (W(e0Var, 1536L)) {
            w7.g.p[] pVarArr = c0632h.f34235a.f34059k;
            if (pVarArr == null) {
                c0632h.f34238e.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fC = c0632h.f34235a.f34059k[i13 % length].c(this);
                    fArr[i13] = fC;
                    f10 += fC;
                }
                if (f10 == 0.0f) {
                    c0632h.f34238e.setPathEffect(null);
                } else {
                    float fC2 = c0632h.f34235a.f34060l.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f10) + f10;
                    }
                    c0632h.f34238e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (W(e0Var, Http2Stream.EMIT_BUFFER_SIZE)) {
            float fQ = Q();
            c0632h.f34235a.f34064p = e0Var.f34064p;
            c0632h.f34237d.setTextSize(e0Var.f34064p.e(this, fQ));
            c0632h.f34238e.setTextSize(e0Var.f34064p.e(this, fQ));
        }
        if (W(e0Var, 8192L)) {
            c0632h.f34235a.f34063o = e0Var.f34063o;
        }
        if (W(e0Var, 32768L)) {
            if (e0Var.f34065q.intValue() == -1 && c0632h.f34235a.f34065q.intValue() > 100) {
                w7.g.e0 e0Var3 = c0632h.f34235a;
                e0Var3.f34065q = Integer.valueOf(e0Var3.f34065q.intValue() - 100);
            } else if (e0Var.f34065q.intValue() != 1 || c0632h.f34235a.f34065q.intValue() >= 900) {
                c0632h.f34235a.f34065q = e0Var.f34065q;
            } else {
                w7.g.e0 e0Var4 = c0632h.f34235a;
                e0Var4.f34065q = Integer.valueOf(e0Var4.f34065q.intValue() + 100);
            }
        }
        if (W(e0Var, 65536L)) {
            c0632h.f34235a.f34066r = e0Var.f34066r;
        }
        if (W(e0Var, 106496L)) {
            if (c0632h.f34235a.f34063o != null && this.f34204c != null) {
                w7.g.k();
                for (String str : c0632h.f34235a.f34063o) {
                    w7.g.e0 e0Var5 = c0632h.f34235a;
                    typefaceT = t(str, e0Var5.f34065q, e0Var5.f34066r);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                w7.g.e0 e0Var6 = c0632h.f34235a;
                typefaceT = t("serif", e0Var6.f34065q, e0Var6.f34066r);
            }
            c0632h.f34237d.setTypeface(typefaceT);
            c0632h.f34238e.setTypeface(typefaceT);
        }
        if (W(e0Var, 131072L)) {
            c0632h.f34235a.f34067s = e0Var.f34067s;
            Paint paint = c0632h.f34237d;
            w7.g.e0.EnumC0630g enumC0630g = e0Var.f34067s;
            w7.g.e0.EnumC0630g enumC0630g2 = w7.g.e0.EnumC0630g.LineThrough;
            paint.setStrikeThruText(enumC0630g == enumC0630g2);
            Paint paint2 = c0632h.f34237d;
            w7.g.e0.EnumC0630g enumC0630g3 = e0Var.f34067s;
            w7.g.e0.EnumC0630g enumC0630g4 = w7.g.e0.EnumC0630g.Underline;
            paint2.setUnderlineText(enumC0630g3 == enumC0630g4);
            c0632h.f34238e.setStrikeThruText(e0Var.f34067s == enumC0630g2);
            c0632h.f34238e.setUnderlineText(e0Var.f34067s == enumC0630g4);
        }
        if (W(e0Var, 68719476736L)) {
            c0632h.f34235a.f34068t = e0Var.f34068t;
        }
        if (W(e0Var, 262144L)) {
            c0632h.f34235a.f34069u = e0Var.f34069u;
        }
        if (W(e0Var, 524288L)) {
            c0632h.f34235a.f34070v = e0Var.f34070v;
        }
        if (W(e0Var, 2097152L)) {
            c0632h.f34235a.f34072x = e0Var.f34072x;
        }
        if (W(e0Var, 4194304L)) {
            c0632h.f34235a.f34073y = e0Var.f34073y;
        }
        if (W(e0Var, 8388608L)) {
            c0632h.f34235a.f34074z = e0Var.f34074z;
        }
        if (W(e0Var, 16777216L)) {
            c0632h.f34235a.A = e0Var.A;
        }
        if (W(e0Var, 33554432L)) {
            c0632h.f34235a.B = e0Var.B;
        }
        if (W(e0Var, 1048576L)) {
            c0632h.f34235a.f34071w = e0Var.f34071w;
        }
        if (W(e0Var, 268435456L)) {
            c0632h.f34235a.E = e0Var.E;
        }
        if (W(e0Var, 536870912L)) {
            c0632h.f34235a.F = e0Var.F;
        }
        if (W(e0Var, 1073741824L)) {
            c0632h.f34235a.G = e0Var.G;
        }
        if (W(e0Var, 67108864L)) {
            c0632h.f34235a.C = e0Var.C;
        }
        if (W(e0Var, 134217728L)) {
            c0632h.f34235a.D = e0Var.D;
        }
        if (W(e0Var, 8589934592L)) {
            c0632h.f34235a.J = e0Var.J;
        }
        if (W(e0Var, 17179869184L)) {
            c0632h.f34235a.K = e0Var.K;
        }
        if (W(e0Var, 137438953472L)) {
            c0632h.f34235a.M = e0Var.M;
        }
    }

    public final boolean W(w7.g.e0 e0Var, long j10) {
        return (e0Var.f34050a & j10) != 0;
    }

    public final void W0(C0632h c0632h, w7.g.l0 l0Var) {
        c0632h.f34235a.b(l0Var.b == null);
        w7.g.e0 e0Var = l0Var.f34141e;
        if (e0Var != null) {
            V0(c0632h, e0Var);
        }
        if (this.f34204c.n()) {
            for (w7.b.p pVar : this.f34204c.d()) {
                if (w7.b.l(this.f34209h, pVar.f33971a, l0Var)) {
                    V0(c0632h, pVar.b);
                }
            }
        }
        w7.g.e0 e0Var2 = l0Var.f34142f;
        if (e0Var2 != null) {
            V0(c0632h, e0Var2);
        }
    }

    public final void X(boolean z10, w7.g.b bVar, w7.g.m0 m0Var) {
        float fE;
        float f10;
        float fE2;
        float f11;
        String str = m0Var.f34133l;
        if (str != null) {
            H(m0Var, str);
        }
        Boolean bool = m0Var.f34130i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0632h c0632h = this.f34205d;
        Paint paint = z10 ? c0632h.f34237d : c0632h.f34238e;
        if (z11) {
            w7.g.b bVarS = S();
            w7.g.p pVar = m0Var.f34145m;
            float f12 = pVar != null ? pVar.f(this) : 0.0f;
            w7.g.p pVar2 = m0Var.f34146n;
            fE = pVar2 != null ? pVar2.h(this) : 0.0f;
            w7.g.p pVar3 = m0Var.f34147o;
            float f13 = pVar3 != null ? pVar3.f(this) : bVarS.f34023c;
            w7.g.p pVar4 = m0Var.f34148p;
            f11 = f13;
            f10 = f12;
            fE2 = pVar4 != null ? pVar4.h(this) : 0.0f;
        } else {
            w7.g.p pVar5 = m0Var.f34145m;
            float fE3 = pVar5 != null ? pVar5.e(this, 1.0f) : 0.0f;
            w7.g.p pVar6 = m0Var.f34146n;
            fE = pVar6 != null ? pVar6.e(this, 1.0f) : 0.0f;
            w7.g.p pVar7 = m0Var.f34147o;
            float fE4 = pVar7 != null ? pVar7.e(this, 1.0f) : 1.0f;
            w7.g.p pVar8 = m0Var.f34148p;
            f10 = fE3;
            fE2 = pVar8 != null ? pVar8.e(this, 1.0f) : 0.0f;
            f11 = fE4;
        }
        float f14 = fE;
        S0();
        this.f34205d = M(m0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f34022a, bVar.b);
            matrix.preScale(bVar.f34023c, bVar.f34024d);
        }
        Matrix matrix2 = m0Var.f34131j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f34129h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f34205d.b = false;
                return;
            } else {
                this.f34205d.f34236c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<w7.g.n0> it = m0Var.f34129h.iterator();
        float f15 = -1.0f;
        while (it.hasNext()) {
            w7.g.d0 d0Var = (w7.g.d0) it.next();
            Float f16 = d0Var.f34039h;
            float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f15) {
                fArr[i10] = fFloatValue;
                f15 = fFloatValue;
            } else {
                fArr[i10] = f15;
            }
            S0();
            W0(this.f34205d, d0Var);
            w7.g.e0 e0Var = this.f34205d.f34235a;
            w7.g.f fVar = (w7.g.f) e0Var.C;
            if (fVar == null) {
                fVar = w7.g.f.b;
            }
            iArr[i10] = x(fVar.f34107a, e0Var.D.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f11 && f14 == fE2) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        w7.g.k kVar = m0Var.f34132k;
        if (kVar != null) {
            if (kVar == w7.g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == w7.g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f14, f11, fE2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f34205d.f34235a.f34052d.floatValue()));
    }

    public final void X0() {
        int iX;
        w7.g.e0 e0Var = this.f34205d.f34235a;
        w7.g.o0 o0Var = e0Var.J;
        if (o0Var instanceof w7.g.f) {
            iX = ((w7.g.f) o0Var).f34107a;
        } else if (!(o0Var instanceof w7.g.C0631g)) {
            return;
        } else {
            iX = e0Var.f34062n.f34107a;
        }
        Float f10 = e0Var.K;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f34203a.drawColor(iX);
    }

    public final Path Y(w7.g.d dVar) {
        w7.g.p pVar = dVar.f34036o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        w7.g.p pVar2 = dVar.f34037p;
        float fH = pVar2 != null ? pVar2.h(this) : 0.0f;
        float fC = dVar.f34038q.c(this);
        float f11 = f10 - fC;
        float f12 = fH - fC;
        float f13 = f10 + fC;
        float f14 = fH + fC;
        if (dVar.f34137h == null) {
            float f15 = 2.0f * fC;
            dVar.f34137h = new w7.g.b(f11, f12, f15, f15);
        }
        float f16 = fC * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f12);
        float f17 = f10 + f16;
        float f18 = fH - f16;
        path.cubicTo(f17, f12, f13, f18, f13, fH);
        float f19 = fH + f16;
        path.cubicTo(f13, f19, f17, f14, f10, f14);
        float f20 = f10 - f16;
        path.cubicTo(f20, f14, f11, f19, f11, fH);
        path.cubicTo(f11, f18, f20, f12, f10, f12);
        path.close();
        return path;
    }

    public final boolean Y0() {
        Boolean bool = this.f34205d.f34235a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path Z(w7.g.i iVar) {
        w7.g.p pVar = iVar.f34120o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        w7.g.p pVar2 = iVar.f34121p;
        float fH = pVar2 != null ? pVar2.h(this) : 0.0f;
        float f11 = iVar.f34122q.f(this);
        float fH2 = iVar.f34123r.h(this);
        float f12 = f10 - f11;
        float f13 = fH - fH2;
        float f14 = f10 + f11;
        float f15 = fH + fH2;
        if (iVar.f34137h == null) {
            iVar.f34137h = new w7.g.b(f12, f13, f11 * 2.0f, 2.0f * fH2);
        }
        float f16 = f11 * 0.5522848f;
        float f17 = fH2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f13);
        float f18 = f10 + f16;
        float f19 = fH - f17;
        path.cubicTo(f18, f13, f14, f19, f14, fH);
        float f20 = fH + f17;
        path.cubicTo(f14, f20, f18, f15, f10, f15);
        float f21 = f10 - f16;
        path.cubicTo(f21, f15, f12, f20, f12, fH);
        path.cubicTo(f12, f19, f21, f13, f10, f13);
        path.close();
        return path;
    }

    public final Path a0(w7.g.q qVar) {
        w7.g.p pVar = qVar.f34158o;
        float f10 = pVar == null ? 0.0f : pVar.f(this);
        w7.g.p pVar2 = qVar.f34159p;
        float fH = pVar2 == null ? 0.0f : pVar2.h(this);
        w7.g.p pVar3 = qVar.f34160q;
        float f11 = pVar3 == null ? 0.0f : pVar3.f(this);
        w7.g.p pVar4 = qVar.f34161r;
        float fH2 = pVar4 != null ? pVar4.h(this) : 0.0f;
        if (qVar.f34137h == null) {
            qVar.f34137h = new w7.g.b(Math.min(f10, f11), Math.min(fH, fH2), Math.abs(f11 - f10), Math.abs(fH2 - fH));
        }
        Path path = new Path();
        path.moveTo(f10, fH);
        path.lineTo(f11, fH2);
        return path;
    }

    public final Path b0(w7.g.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f34198o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = zVar.f34198o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (zVar instanceof w7.g.a0) {
            path.close();
        }
        if (zVar.f34137h == null) {
            zVar.f34137h = m(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    public final Path c0(w7.g.b0 b0Var) {
        float f10;
        float fH;
        float fMin;
        w7.g.p pVar;
        float f11;
        w7.g.p pVar2;
        float fH2;
        float f12;
        float fH3;
        float f13;
        float f14;
        Path path;
        w7.g.p pVar3 = b0Var.f34029s;
        if (pVar3 == null && b0Var.f34030t == null) {
            f10 = 0.0f;
        } else {
            if (pVar3 != null) {
                if (b0Var.f34030t == null) {
                    f10 = pVar3.f(this);
                } else {
                    f10 = pVar3.f(this);
                    fH = b0Var.f34030t.h(this);
                }
                fMin = Math.min(f10, b0Var.f34027q.f(this) / 2.0f);
                float fMin2 = Math.min(fH, b0Var.f34028r.h(this) / 2.0f);
                pVar = b0Var.f34025o;
                if (pVar != null) {
                    f11 = pVar.f(this);
                } else {
                    f11 = 0.0f;
                }
                pVar2 = b0Var.f34026p;
                if (pVar2 != null) {
                    fH2 = pVar2.h(this);
                } else {
                    fH2 = 0.0f;
                }
                f12 = b0Var.f34027q.f(this);
                fH3 = b0Var.f34028r.h(this);
                if (b0Var.f34137h == null) {
                    b0Var.f34137h = new w7.g.b(f11, fH2, f12, fH3);
                }
                f13 = f12 + f11;
                f14 = fH2 + fH3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(f11, fH2);
                    path.lineTo(f13, fH2);
                    path.lineTo(f13, f14);
                    path.lineTo(f11, f14);
                    path.lineTo(f11, fH2);
                } else {
                    float f15 = fMin * 0.5522848f;
                    float f16 = 0.5522848f * fMin2;
                    float f17 = fH2 + fMin2;
                    path.moveTo(f11, f17);
                    float f18 = f17 - f16;
                    float f19 = f11 + fMin;
                    float f20 = f19 - f15;
                    path.cubicTo(f11, f18, f20, fH2, f19, fH2);
                    float f21 = f13 - fMin;
                    path.lineTo(f21, fH2);
                    float f22 = f21 + f15;
                    path.cubicTo(f22, fH2, f13, f18, f13, f17);
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
            f10 = b0Var.f34030t.h(this);
        }
        fH = f10;
        fMin = Math.min(f10, b0Var.f34027q.f(this) / 2.0f);
        float fMin3 = Math.min(fH, b0Var.f34028r.h(this) / 2.0f);
        pVar = b0Var.f34025o;
        if (pVar != null) {
            f11 = pVar.f(this);
        } else {
            f11 = 0.0f;
        }
        pVar2 = b0Var.f34026p;
        if (pVar2 != null) {
            fH2 = pVar2.h(this);
        } else {
            fH2 = 0.0f;
        }
        f12 = b0Var.f34027q.f(this);
        fH3 = b0Var.f34028r.h(this);
        if (b0Var.f34137h == null) {
            b0Var.f34137h = new w7.g.b(f11, fH2, f12, fH3);
        }
        f13 = f12 + f11;
        f14 = fH2 + fH3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(f11, fH2);
            path.lineTo(f13, fH2);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, fH2);
        } else {
            path.moveTo(f11, fH2);
            path.lineTo(f13, fH2);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, fH2);
        }
        path.close();
        return path;
    }

    public final Path d0(w7.g.w0 w0Var) {
        List<w7.g.p> list = w0Var.f34018o;
        float fH = 0.0f;
        float f10 = (list == null || list.size() == 0) ? 0.0f : w0Var.f34018o.get(0).f(this);
        List<w7.g.p> list2 = w0Var.f34019p;
        float fH2 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f34019p.get(0).h(this);
        List<w7.g.p> list3 = w0Var.f34020q;
        float f11 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f34020q.get(0).f(this);
        List<w7.g.p> list4 = w0Var.f34021r;
        if (list4 != null && list4.size() != 0) {
            fH = w0Var.f34021r.get(0).h(this);
        }
        if (this.f34205d.f34235a.f34069u != w7.g.e0.f.Start) {
            float fN = n(w0Var);
            if (this.f34205d.f34235a.f34069u == w7.g.e0.f.Middle) {
                fN /= 2.0f;
            }
            f10 -= fN;
        }
        if (w0Var.f34137h == null) {
            i iVar = new i(f10, fH2);
            E(w0Var, iVar);
            RectF rectF = iVar.f34244d;
            w0Var.f34137h = new w7.g.b(rectF.left, rectF.top, rectF.width(), iVar.f34244d.height());
        }
        Path path = new Path();
        E(w0Var, new g(f10 + f11, fH2 + fH, path));
        return path;
    }

    public final void e0(boolean z10, w7.g.b bVar, w7.g.q0 q0Var) {
        float f10;
        float fE;
        float f11;
        String str = q0Var.f34133l;
        if (str != null) {
            H(q0Var, str);
        }
        Boolean bool = q0Var.f34130i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0632h c0632h = this.f34205d;
        Paint paint = z10 ? c0632h.f34237d : c0632h.f34238e;
        if (z11) {
            w7.g.p pVar = new w7.g.p(50.0f, w7.g.d1.percent);
            w7.g.p pVar2 = q0Var.f34162m;
            float f12 = pVar2 != null ? pVar2.f(this) : pVar.f(this);
            w7.g.p pVar3 = q0Var.f34163n;
            float fH = pVar3 != null ? pVar3.h(this) : pVar.h(this);
            w7.g.p pVar4 = q0Var.f34164o;
            fE = pVar4 != null ? pVar4.c(this) : pVar.c(this);
            f10 = f12;
            f11 = fH;
        } else {
            w7.g.p pVar5 = q0Var.f34162m;
            float fE2 = pVar5 != null ? pVar5.e(this, 1.0f) : 0.5f;
            w7.g.p pVar6 = q0Var.f34163n;
            float fE3 = pVar6 != null ? pVar6.e(this, 1.0f) : 0.5f;
            w7.g.p pVar7 = q0Var.f34164o;
            f10 = fE2;
            fE = pVar7 != null ? pVar7.e(this, 1.0f) : 0.5f;
            f11 = fE3;
        }
        S0();
        this.f34205d = M(q0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f34022a, bVar.b);
            matrix.preScale(bVar.f34023c, bVar.f34024d);
        }
        Matrix matrix2 = q0Var.f34131j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f34129h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f34205d.b = false;
                return;
            } else {
                this.f34205d.f34236c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<w7.g.n0> it = q0Var.f34129h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            w7.g.d0 d0Var = (w7.g.d0) it.next();
            Float f14 = d0Var.f34039h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f34205d, d0Var);
            w7.g.e0 e0Var = this.f34205d.f34235a;
            w7.g.f fVar = (w7.g.f) e0Var.C;
            if (fVar == null) {
                fVar = w7.g.f.b;
            }
            iArr[i10] = x(fVar.f34107a, e0Var.D.floatValue());
            i10++;
            R0();
        }
        if (fE == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        w7.g.k kVar = q0Var.f34132k;
        if (kVar != null) {
            if (kVar == w7.g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == w7.g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fE, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f34205d.f34235a.f34052d.floatValue()));
    }

    public final w7.g.b f0(w7.g.p pVar, w7.g.p pVar2, w7.g.p pVar3, w7.g.p pVar4) {
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        float fH = pVar2 != null ? pVar2.h(this) : 0.0f;
        w7.g.b bVarS = S();
        return new w7.g.b(f10, fH, pVar3 != null ? pVar3.f(this) : bVarS.f34023c, pVar4 != null ? pVar4.h(this) : bVarS.f34024d);
    }

    @TargetApi(19)
    public final Path g0(w7.g.k0 k0Var, boolean z10) {
        Path pathD0;
        Path pathJ;
        this.f34206e.push(this.f34205d);
        C0632h c0632h = new C0632h(this.f34205d);
        this.f34205d = c0632h;
        W0(c0632h, k0Var);
        if (!A() || !Y0()) {
            this.f34205d = this.f34206e.pop();
            return null;
        }
        if (k0Var instanceof w7.g.e1) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            w7.g.e1 e1Var = (w7.g.e1) k0Var;
            w7.g.n0 n0VarP = k0Var.f34149a.p(e1Var.f34101p);
            if (n0VarP == null) {
                F("Use reference '%s' not found", e1Var.f34101p);
                this.f34205d = this.f34206e.pop();
                return null;
            }
            if (!(n0VarP instanceof w7.g.k0)) {
                this.f34205d = this.f34206e.pop();
                return null;
            }
            pathD0 = g0((w7.g.k0) n0VarP, false);
            if (pathD0 == null) {
                return null;
            }
            if (e1Var.f34137h == null) {
                e1Var.f34137h = m(pathD0);
            }
            Matrix matrix = e1Var.f34144o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k0Var instanceof w7.g.l) {
            w7.g.l lVar = (w7.g.l) k0Var;
            if (k0Var instanceof w7.g.v) {
                pathD0 = new d(((w7.g.v) k0Var).f34183o).f();
                if (k0Var.f34137h == null) {
                    k0Var.f34137h = m(pathD0);
                }
            } else if (k0Var instanceof w7.g.b0) {
                pathD0 = c0((w7.g.b0) k0Var);
            } else if (k0Var instanceof w7.g.d) {
                pathD0 = Y((w7.g.d) k0Var);
            } else if (k0Var instanceof w7.g.i) {
                pathD0 = Z((w7.g.i) k0Var);
            } else {
                pathD0 = k0Var instanceof w7.g.z ? b0((w7.g.z) k0Var) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (lVar.f34137h == null) {
                lVar.f34137h = m(pathD0);
            }
            Matrix matrix2 = lVar.f34138n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k0Var instanceof w7.g.w0)) {
                F("Invalid %s element found in clipPath definition", k0Var.n());
                return null;
            }
            w7.g.w0 w0Var = (w7.g.w0) k0Var;
            pathD0 = d0(w0Var);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w0Var.f34189s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f34205d.f34235a.E != null && (pathJ = j(k0Var, k0Var.f34137h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f34205d = this.f34206e.pop();
        return pathD0;
    }

    public final void h0() {
        this.f34207f.pop();
        this.f34208g.pop();
    }

    public final void i0(w7.g.j0 j0Var) {
        this.f34207f.push(j0Var);
        this.f34208g.push(this.f34203a.getMatrix());
    }

    @TargetApi(19)
    public final Path j(w7.g.k0 k0Var, w7.g.b bVar) {
        Path pathG0;
        w7.g.n0 n0VarP = k0Var.f34149a.p(this.f34205d.f34235a.E);
        if (n0VarP == null) {
            F("ClipPath reference '%s' not found", this.f34205d.f34235a.E);
            return null;
        }
        w7.g.e eVar = (w7.g.e) n0VarP;
        this.f34206e.push(this.f34205d);
        this.f34205d = M(eVar);
        Boolean bool = eVar.f34049p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f34022a, bVar.b);
            matrix.preScale(bVar.f34023c, bVar.f34024d);
        }
        Matrix matrix2 = eVar.f34144o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (w7.g.n0 n0Var : eVar.f34114i) {
            if ((n0Var instanceof w7.g.k0) && (pathG0 = g0((w7.g.k0) n0Var, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f34205d.f34235a.E != null) {
            if (eVar.f34137h == null) {
                eVar.f34137h = m(path);
            }
            Path pathJ = j(eVar, eVar.f34137h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f34205d = this.f34206e.pop();
        return path;
    }

    public final void j0(w7.g.k0 k0Var) {
        k0(k0Var, k0Var.f34137h);
    }

    public final List<c> k(w7.g.q qVar) {
        w7.g.p pVar = qVar.f34158o;
        float f10 = pVar != null ? pVar.f(this) : 0.0f;
        w7.g.p pVar2 = qVar.f34159p;
        float fH = pVar2 != null ? pVar2.h(this) : 0.0f;
        w7.g.p pVar3 = qVar.f34160q;
        float f11 = pVar3 != null ? pVar3.f(this) : 0.0f;
        w7.g.p pVar4 = qVar.f34161r;
        float fH2 = pVar4 != null ? pVar4.h(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = f11 - f10;
        float f13 = fH2 - fH;
        arrayList.add(new c(f10, fH, f12, f13));
        arrayList.add(new c(f11, fH2, f12, f13));
        return arrayList;
    }

    public final void k0(w7.g.k0 k0Var, w7.g.b bVar) {
        if (this.f34205d.f34235a.G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f34203a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f34203a.saveLayer(null, paint2, 31);
            w7.g.s sVar = (w7.g.s) this.f34204c.p(this.f34205d.f34235a.G);
            J0(sVar, k0Var, bVar);
            this.f34203a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f34203a.saveLayer(null, paint3, 31);
            J0(sVar, k0Var, bVar);
            this.f34203a.restore();
            this.f34203a.restore();
        }
        R0();
    }

    public final List<c> l(w7.g.z zVar) {
        int length = zVar.f34198o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar.f34198o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = zVar.f34198o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f34220a, f13 - cVar.b);
            f10 = f12;
            f11 = f13;
        }
        if (!(zVar instanceof w7.g.a0)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = zVar.f34198o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f34220a, f15 - cVar.b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    public final void l0(w7.g.n0 n0Var, j jVar) {
        float f10;
        float fH;
        float f11;
        w7.g.e0.f fVarO;
        if (jVar.a((w7.g.y0) n0Var)) {
            if (n0Var instanceof w7.g.z0) {
                S0();
                L0((w7.g.z0) n0Var);
                R0();
                return;
            }
            if (!(n0Var instanceof w7.g.v0)) {
                if (n0Var instanceof w7.g.u0) {
                    S0();
                    w7.g.u0 u0Var = (w7.g.u0) n0Var;
                    W0(this.f34205d, u0Var);
                    if (A()) {
                        r((w7.g.k0) u0Var.e());
                        w7.g.n0 n0VarP = n0Var.f34149a.p(u0Var.f34181o);
                        if (n0VarP == null || !(n0VarP instanceof w7.g.y0)) {
                            F("Tref reference '%s' not found", u0Var.f34181o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((w7.g.y0) n0VarP, sb2);
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
            w7.g.v0 v0Var = (w7.g.v0) n0Var;
            W0(this.f34205d, v0Var);
            if (A()) {
                List<w7.g.p> list = v0Var.f34018o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float fH2 = 0.0f;
                if (z11) {
                    float f12 = !z10 ? ((f) jVar).b : v0Var.f34018o.get(0).f(this);
                    List<w7.g.p> list2 = v0Var.f34019p;
                    fH = (list2 == null || list2.size() == 0) ? ((f) jVar).f34230c : v0Var.f34019p.get(0).h(this);
                    List<w7.g.p> list3 = v0Var.f34020q;
                    f11 = (list3 == null || list3.size() == 0) ? 0.0f : v0Var.f34020q.get(0).f(this);
                    List<w7.g.p> list4 = v0Var.f34021r;
                    if (list4 != null && list4.size() != 0) {
                        fH2 = v0Var.f34021r.get(0).h(this);
                    }
                    f10 = fH2;
                    fH2 = f12;
                } else {
                    f10 = 0.0f;
                    fH = 0.0f;
                    f11 = 0.0f;
                }
                if (z10 && (fVarO = O()) != w7.g.e0.f.Start) {
                    float fN = n(v0Var);
                    if (fVarO == w7.g.e0.f.Middle) {
                        fN /= 2.0f;
                    }
                    fH2 -= fN;
                }
                r((w7.g.k0) v0Var.e());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.b = fH2 + f11;
                    fVar.f34230c = fH + f10;
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

    public final w7.g.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new w7.g.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final boolean m0() {
        w7.g.n0 n0VarP;
        if (!M0()) {
            return false;
        }
        this.f34203a.saveLayerAlpha(null, w(this.f34205d.f34235a.f34061m.floatValue()), 31);
        this.f34206e.push(this.f34205d);
        C0632h c0632h = new C0632h(this.f34205d);
        this.f34205d = c0632h;
        String str = c0632h.f34235a.G;
        if (str != null && ((n0VarP = this.f34204c.p(str)) == null || !(n0VarP instanceof w7.g.s))) {
            F("Mask reference '%s' not found", this.f34205d.f34235a.G);
            this.f34205d.f34235a.G = null;
        }
        return true;
    }

    public final float n(w7.g.y0 y0Var) {
        k kVar = new k(this, null);
        E(y0Var, kVar);
        return kVar.b;
    }

    public final c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f34221c, cVar2.f34222d, cVar2.f34220a - cVar.f34220a, cVar2.b - cVar.b);
        if (fD == 0.0f) {
            fD = D(cVar2.f34221c, cVar2.f34222d, cVar3.f34220a - cVar2.f34220a, cVar3.b - cVar2.b);
        }
        if (fD > 0.0f || (fD == 0.0f && (cVar2.f34221c > 0.0f || cVar2.f34222d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f34221c = -cVar2.f34221c;
        cVar2.f34222d = -cVar2.f34222d;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix o(w7.g.b r10, w7.g.b r11, w7.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            w7.e$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f34023c
            float r2 = r11.f34023c
            float r1 = r1 / r2
            float r2 = r10.f34024d
            float r3 = r11.f34024d
            float r2 = r2 / r3
            float r3 = r11.f34022a
            float r3 = -r3
            float r4 = r11.b
            float r4 = -r4
            w7.e r5 = w7.e.f33985d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f34022a
            float r10 = r10.b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            w7.e$b r5 = r12.b()
            w7.e$b r6 = w7.e.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f34023c
            float r2 = r2 / r1
            float r5 = r10.f34024d
            float r5 = r5 / r1
            int[] r6 = w7.h.a.f34210a
            w7.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f34023c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f34023c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            w7.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f34024d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f34024d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f34022a
            float r10 = r10.b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.h.o(w7.g$b, w7.g$b, w7.e):android.graphics.Matrix");
    }

    public final void o0(w7.g.d dVar) {
        y("Circle render", new Object[0]);
        w7.g.p pVar = dVar.f34038q;
        if (pVar == null || pVar.j()) {
            return;
        }
        W0(this.f34205d, dVar);
        if (A() && Y0()) {
            Matrix matrix = dVar.f34138n;
            if (matrix != null) {
                this.f34203a.concat(matrix);
            }
            Path pathY = Y(dVar);
            U0(dVar);
            r(dVar);
            p(dVar);
            boolean zM0 = m0();
            if (this.f34205d.b) {
                B(dVar, pathY);
            }
            if (this.f34205d.f34236c) {
                C(pathY);
            }
            if (zM0) {
                j0(dVar);
            }
        }
    }

    public final void p(w7.g.k0 k0Var) {
        q(k0Var, k0Var.f34137h);
    }

    public final void p0(w7.g.i iVar) {
        y("Ellipse render", new Object[0]);
        w7.g.p pVar = iVar.f34122q;
        if (pVar == null || iVar.f34123r == null || pVar.j() || iVar.f34123r.j()) {
            return;
        }
        W0(this.f34205d, iVar);
        if (A() && Y0()) {
            Matrix matrix = iVar.f34138n;
            if (matrix != null) {
                this.f34203a.concat(matrix);
            }
            Path pathZ = Z(iVar);
            U0(iVar);
            r(iVar);
            p(iVar);
            boolean zM0 = m0();
            if (this.f34205d.b) {
                B(iVar, pathZ);
            }
            if (this.f34205d.f34236c) {
                C(pathZ);
            }
            if (zM0) {
                j0(iVar);
            }
        }
    }

    public final void q(w7.g.k0 k0Var, w7.g.b bVar) {
        Path pathJ;
        if (this.f34205d.f34235a.E == null || (pathJ = j(k0Var, bVar)) == null) {
            return;
        }
        this.f34203a.clipPath(pathJ);
    }

    public final void q0(w7.g.m mVar) {
        y("Group render", new Object[0]);
        W0(this.f34205d, mVar);
        if (A()) {
            Matrix matrix = mVar.f34144o;
            if (matrix != null) {
                this.f34203a.concat(matrix);
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

    public final void r(w7.g.k0 k0Var) {
        w7.g.o0 o0Var = this.f34205d.f34235a.b;
        if (o0Var instanceof w7.g.u) {
            z(true, k0Var.f34137h, (w7.g.u) o0Var);
        }
        w7.g.o0 o0Var2 = this.f34205d.f34235a.f34053e;
        if (o0Var2 instanceof w7.g.u) {
            z(false, k0Var.f34137h, (w7.g.u) o0Var2);
        }
    }

    public final void r0(w7.g.o oVar) {
        w7.g.p pVar;
        String str;
        y("Image render", new Object[0]);
        w7.g.p pVar2 = oVar.f34153s;
        if (pVar2 == null || pVar2.j() || (pVar = oVar.f34154t) == null || pVar.j() || (str = oVar.f34150p) == null) {
            return;
        }
        w7.e eVar = oVar.f34157o;
        if (eVar == null) {
            eVar = w7.e.f33986e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            w7.g.k();
            return;
        }
        w7.g.b bVar = new w7.g.b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f34205d, oVar);
        if (A() && Y0()) {
            Matrix matrix = oVar.f34155u;
            if (matrix != null) {
                this.f34203a.concat(matrix);
            }
            w7.g.p pVar3 = oVar.f34151q;
            float f10 = pVar3 != null ? pVar3.f(this) : 0.0f;
            w7.g.p pVar4 = oVar.f34152r;
            this.f34205d.f34239f = new w7.g.b(f10, pVar4 != null ? pVar4.h(this) : 0.0f, oVar.f34153s.f(this), oVar.f34154t.f(this));
            if (!this.f34205d.f34235a.f34070v.booleanValue()) {
                w7.g.b bVar2 = this.f34205d.f34239f;
                O0(bVar2.f34022a, bVar2.b, bVar2.f34023c, bVar2.f34024d);
            }
            oVar.f34137h = this.f34205d.f34239f;
            U0(oVar);
            p(oVar);
            boolean zM0 = m0();
            X0();
            this.f34203a.save();
            this.f34203a.concat(o(this.f34205d.f34239f, bVar, eVar));
            this.f34203a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.f34205d.f34235a.M != w7.g.e0.e.optimizeSpeed ? 2 : 0));
            this.f34203a.restore();
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

    public final void s0(w7.g.q qVar) {
        y("Line render", new Object[0]);
        W0(this.f34205d, qVar);
        if (A() && Y0() && this.f34205d.f34236c) {
            Matrix matrix = qVar.f34138n;
            if (matrix != null) {
                this.f34203a.concat(matrix);
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

    public final Typeface t(String str, Integer num, w7.g.e0.b bVar) {
        int i10;
        boolean z10 = bVar == w7.g.e0.b.Italic;
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

    public final void t0(w7.g.v vVar) {
        y("Path render", new Object[0]);
        if (vVar.f34183o == null) {
            return;
        }
        W0(this.f34205d, vVar);
        if (A() && Y0()) {
            C0632h c0632h = this.f34205d;
            if (c0632h.f34236c || c0632h.b) {
                Matrix matrix = vVar.f34138n;
                if (matrix != null) {
                    this.f34203a.concat(matrix);
                }
                Path pathF = new d(vVar.f34183o).f();
                if (vVar.f34137h == null) {
                    vVar.f34137h = m(pathF);
                }
                U0(vVar);
                r(vVar);
                p(vVar);
                boolean zM0 = m0();
                if (this.f34205d.b) {
                    pathF.setFillType(U());
                    B(vVar, pathF);
                }
                if (this.f34205d.f34236c) {
                    C(pathF);
                }
                I0(vVar);
                if (zM0) {
                    j0(vVar);
                }
            }
        }
    }

    public final void u(w7.g.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof w7.g.l0) && (bool = ((w7.g.l0) n0Var).f34140d) != null) {
            this.f34205d.f34241h = bool.booleanValue();
        }
    }

    public final void u0(w7.g.z zVar) {
        y("PolyLine render", new Object[0]);
        W0(this.f34205d, zVar);
        if (A() && Y0()) {
            C0632h c0632h = this.f34205d;
            if (c0632h.f34236c || c0632h.b) {
                Matrix matrix = zVar.f34138n;
                if (matrix != null) {
                    this.f34203a.concat(matrix);
                }
                if (zVar.f34198o.length < 2) {
                    return;
                }
                Path pathB0 = b0(zVar);
                U0(zVar);
                pathB0.setFillType(U());
                r(zVar);
                p(zVar);
                boolean zM0 = m0();
                if (this.f34205d.b) {
                    B(zVar, pathB0);
                }
                if (this.f34205d.f34236c) {
                    C(pathB0);
                }
                I0(zVar);
                if (zM0) {
                    j0(zVar);
                }
            }
        }
    }

    public final void v0(w7.g.a0 a0Var) {
        y("Polygon render", new Object[0]);
        W0(this.f34205d, a0Var);
        if (A() && Y0()) {
            C0632h c0632h = this.f34205d;
            if (c0632h.f34236c || c0632h.b) {
                Matrix matrix = a0Var.f34138n;
                if (matrix != null) {
                    this.f34203a.concat(matrix);
                }
                if (a0Var.f34198o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a0Var);
                U0(a0Var);
                r(a0Var);
                p(a0Var);
                boolean zM0 = m0();
                if (this.f34205d.b) {
                    B(a0Var, pathB0);
                }
                if (this.f34205d.f34236c) {
                    C(pathB0);
                }
                I0(a0Var);
                if (zM0) {
                    j0(a0Var);
                }
            }
        }
    }

    public final void w0(w7.g.b0 b0Var) {
        y("Rect render", new Object[0]);
        w7.g.p pVar = b0Var.f34027q;
        if (pVar == null || b0Var.f34028r == null || pVar.j() || b0Var.f34028r.j()) {
            return;
        }
        W0(this.f34205d, b0Var);
        if (A() && Y0()) {
            Matrix matrix = b0Var.f34138n;
            if (matrix != null) {
                this.f34203a.concat(matrix);
            }
            Path pathC0 = c0(b0Var);
            U0(b0Var);
            r(b0Var);
            p(b0Var);
            boolean zM0 = m0();
            if (this.f34205d.b) {
                B(b0Var, pathC0);
            }
            if (this.f34205d.f34236c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b0Var);
            }
        }
    }

    public final void x0(w7.g.f0 f0Var) {
        z0(f0Var, f0(f0Var.f34108q, f0Var.f34109r, f0Var.f34110s, f0Var.f34111t), f0Var.f34173p, f0Var.f34157o);
    }

    public final void y0(w7.g.f0 f0Var, w7.g.b bVar) {
        z0(f0Var, bVar, f0Var.f34173p, f0Var.f34157o);
    }

    public final void z(boolean z10, w7.g.b bVar, w7.g.u uVar) {
        w7.g.n0 n0VarP = this.f34204c.p(uVar.f34180a);
        if (n0VarP == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", uVar.f34180a);
            w7.g.o0 o0Var = uVar.b;
            if (o0Var != null) {
                P0(this.f34205d, z10, o0Var);
                return;
            } else if (z10) {
                this.f34205d.b = false;
                return;
            } else {
                this.f34205d.f34236c = false;
                return;
            }
        }
        if (n0VarP instanceof w7.g.m0) {
            X(z10, bVar, (w7.g.m0) n0VarP);
        } else if (n0VarP instanceof w7.g.q0) {
            e0(z10, bVar, (w7.g.q0) n0VarP);
        } else if (n0VarP instanceof w7.g.c0) {
            Q0(z10, (w7.g.c0) n0VarP);
        }
    }

    public final void z0(w7.g.f0 f0Var, w7.g.b bVar, w7.g.b bVar2, w7.e eVar) {
        y("Svg render", new Object[0]);
        if (bVar.f34023c == 0.0f || bVar.f34024d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f0Var.f34157o) == null) {
            eVar = w7.e.f33986e;
        }
        W0(this.f34205d, f0Var);
        if (A()) {
            C0632h c0632h = this.f34205d;
            c0632h.f34239f = bVar;
            if (!c0632h.f34235a.f34070v.booleanValue()) {
                w7.g.b bVar3 = this.f34205d.f34239f;
                O0(bVar3.f34022a, bVar3.b, bVar3.f34023c, bVar3.f34024d);
            }
            q(f0Var, this.f34205d.f34239f);
            if (bVar2 != null) {
                this.f34203a.concat(o(this.f34205d.f34239f, bVar2, eVar));
                this.f34205d.f34240g = f0Var.f34173p;
            } else {
                Canvas canvas = this.f34203a;
                w7.g.b bVar4 = this.f34205d.f34239f;
                canvas.translate(bVar4.f34022a, bVar4.b);
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

        @Override // w7.h.j
        public void b(String str) {
            this.b += h.this.f34205d.f34237d.measureText(str);
        }

        public /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: w7.h$h, reason: collision with other inner class name */
    public class C0632h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w7.g.e0 f34235a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f34237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f34238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public w7.g.b f34239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public w7.g.b f34240g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f34241h;

        public C0632h() {
            Paint paint = new Paint();
            this.f34237d = paint;
            paint.setFlags(193);
            this.f34237d.setHinting(0);
            this.f34237d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f34237d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f34238e = paint3;
            paint3.setFlags(193);
            this.f34238e.setHinting(0);
            this.f34238e.setStyle(Paint.Style.STROKE);
            this.f34238e.setTypeface(typeface);
            this.f34235a = w7.g.e0.a();
        }

        public C0632h(C0632h c0632h) {
            this.b = c0632h.b;
            this.f34236c = c0632h.f34236c;
            this.f34237d = new Paint(c0632h.f34237d);
            this.f34238e = new Paint(c0632h.f34238e);
            w7.g.b bVar = c0632h.f34239f;
            if (bVar != null) {
                this.f34239f = new w7.g.b(bVar);
            }
            w7.g.b bVar2 = c0632h.f34240g;
            if (bVar2 != null) {
                this.f34240g = new w7.g.b(bVar2);
            }
            this.f34241h = c0632h.f34241h;
            try {
                this.f34235a = (w7.g.e0) c0632h.f34235a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f34235a = w7.g.e0.a();
            }
        }
    }
}
