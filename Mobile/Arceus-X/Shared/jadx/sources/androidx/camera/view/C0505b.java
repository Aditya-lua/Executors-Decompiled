package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p347p0.C10085a0;
import p347p0.C10087c;
import p533x2.C12637g;

/* JADX INFO: renamed from: androidx.camera.view.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0505b {

    /* JADX INFO: renamed from: i */
    public static final PreviewView.EnumC0502d f1879i = PreviewView.EnumC0502d.FILL_CENTER;

    /* JADX INFO: renamed from: a */
    public Size f1880a;

    /* JADX INFO: renamed from: b */
    public Rect f1881b;

    /* JADX INFO: renamed from: c */
    public int f1882c;

    /* JADX INFO: renamed from: d */
    public Matrix f1883d;

    /* JADX INFO: renamed from: e */
    public int f1884e;

    /* JADX INFO: renamed from: f */
    public boolean f1885f;

    /* JADX INFO: renamed from: g */
    public boolean f1886g;

    /* JADX INFO: renamed from: h */
    public PreviewView.EnumC0502d f1887h = f1879i;

    /* JADX INFO: renamed from: androidx.camera.view.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1888a;

        static {
            int[] iArr = new int[PreviewView.EnumC0502d.values().length];
            f1888a = iArr;
            try {
                iArr[PreviewView.EnumC0502d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1888a[PreviewView.EnumC0502d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1888a[PreviewView.EnumC0502d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1888a[PreviewView.EnumC0502d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1888a[PreviewView.EnumC0502d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1888a[PreviewView.EnumC0502d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static RectF m2375b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    /* JADX INFO: renamed from: p */
    public static void m2376p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.EnumC0502d enumC0502d) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f1888a[enumC0502d.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C5931r1.m26563c("PreviewTransform", "Unexpected crop rect: " + enumC0502d);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (enumC0502d == PreviewView.EnumC0502d.FIT_CENTER || enumC0502d == PreviewView.EnumC0502d.FIT_START || enumC0502d == PreviewView.EnumC0502d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m2377a(Bitmap bitmap, Size size, int i10) {
        if (!m2388m()) {
            return bitmap;
        }
        Matrix matrixM2386k = m2386k();
        RectF rectFM2387l = m2387l(size, i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixM2386k);
        matrix.postScale(rectFM2387l.width() / this.f1880a.getWidth(), rectFM2387l.height() / this.f1880a.getHeight());
        matrix.postTranslate(rectFM2387l.left, rectFM2387l.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public Matrix m2378c(Size size, int i10, Rect rect) {
        if (!m2388m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        m2383h(size, i10).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* JADX INFO: renamed from: d */
    public RectF m2379d(Size size, int i10) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeM2381f = m2381f();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeM2381f.getWidth(), sizeM2381f.getHeight());
        Matrix matrix = new Matrix();
        m2376p(matrix, rectF2, rectF, this.f1887h);
        matrix.mapRect(rectF2);
        return i10 == 1 ? m2375b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    /* JADX INFO: renamed from: e */
    public final int m2380e() {
        return !this.f1886g ? this.f1882c : -C10087c.m38903b(this.f1884e);
    }

    /* JADX INFO: renamed from: f */
    public final Size m2381f() {
        return C10085a0.m38881i(this.f1882c) ? new Size(this.f1881b.height(), this.f1881b.width()) : new Size(this.f1881b.width(), this.f1881b.height());
    }

    /* JADX INFO: renamed from: g */
    public PreviewView.EnumC0502d m2382g() {
        return this.f1887h;
    }

    /* JADX INFO: renamed from: h */
    public Matrix m2383h(Size size, int i10) {
        if (!m2388m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f1883d);
        matrix.postConcat(m2385j(size, i10));
        return matrix;
    }

    /* JADX INFO: renamed from: i */
    public Rect m2384i() {
        return this.f1881b;
    }

    /* JADX INFO: renamed from: j */
    public Matrix m2385j(Size size, int i10) {
        C12637g.m47077i(m2388m());
        Matrix matrixM38876d = C10085a0.m38876d(new RectF(this.f1881b), m2389n(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : m2379d(size, i10), this.f1882c);
        if (this.f1885f && this.f1886g) {
            if (C10085a0.m38881i(this.f1882c)) {
                matrixM38876d.preScale(1.0f, -1.0f, this.f1881b.centerX(), this.f1881b.centerY());
                return matrixM38876d;
            }
            matrixM38876d.preScale(-1.0f, 1.0f, this.f1881b.centerX(), this.f1881b.centerY());
        }
        return matrixM38876d;
    }

    /* JADX INFO: renamed from: k */
    public Matrix m2386k() {
        C12637g.m47077i(m2388m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f1880a.getWidth(), this.f1880a.getHeight());
        return C10085a0.m38876d(rectF, rectF, m2380e());
    }

    /* JADX INFO: renamed from: l */
    public final RectF m2387l(Size size, int i10) {
        C12637g.m47077i(m2388m());
        Matrix matrixM2385j = m2385j(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f1880a.getWidth(), this.f1880a.getHeight());
        matrixM2385j.mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2388m() {
        return (this.f1881b == null || this.f1880a == null || !(!this.f1886g || this.f1884e != -1)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m2389n(Size size) {
        return C10085a0.m38883k(size, true, m2381f(), false);
    }

    /* JADX INFO: renamed from: o */
    public void m2390o(int i10, int i11) {
        if (this.f1886g) {
            this.f1882c = i10;
            this.f1884e = i11;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2391q(PreviewView.EnumC0502d enumC0502d) {
        this.f1887h = enumC0502d;
    }

    /* JADX INFO: renamed from: r */
    public void m2392r(C5948v2.h hVar, Size size, boolean z10) {
        C5931r1.m26561a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z10);
        this.f1881b = hVar.mo26509a();
        this.f1882c = hVar.mo26510b();
        this.f1884e = hVar.mo26512d();
        this.f1880a = size;
        this.f1885f = z10;
        this.f1886g = hVar.mo26513e();
        this.f1883d = hVar.mo26511c();
    }

    /* JADX INFO: renamed from: s */
    public void m2393s(Size size, int i10, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            C5931r1.m26572l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (m2388m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(m2386k());
            } else {
                Display display = view.getDisplay();
                boolean z10 = false;
                boolean z11 = (!this.f1886g || display == null || display.getRotation() == this.f1884e) ? false : true;
                if (!this.f1886g && m2380e() != 0) {
                    z10 = true;
                }
                if (z11 || z10) {
                    C5931r1.m26563c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFM2387l = m2387l(size, i10);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFM2387l.width() / this.f1880a.getWidth());
            view.setScaleY(rectFM2387l.height() / this.f1880a.getHeight());
            view.setTranslationX(rectFM2387l.left - view.getLeft());
            view.setTranslationY(rectFM2387l.top - view.getTop());
        }
    }
}
