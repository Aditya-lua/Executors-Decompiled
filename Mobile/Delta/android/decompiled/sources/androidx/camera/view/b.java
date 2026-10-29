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
import g0.r1;
import g0.v2;
import p0.a0;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final PreviewView.d f1444i = PreviewView.d.FILL_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f1445a;
    public Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f1447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PreviewView.d f1451h = f1444i;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1452a;

        static {
            int[] iArr = new int[PreviewView.d.values().length];
            f1452a = iArr;
            try {
                iArr[PreviewView.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1452a[PreviewView.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1452a[PreviewView.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1452a[PreviewView.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1452a[PreviewView.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1452a[PreviewView.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static RectF b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    public static void p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f1452a[dVar.ordinal()]) {
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
                r1.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (dVar == PreviewView.d.FIT_CENTER || dVar == PreviewView.d.FIT_START || dVar == PreviewView.d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    public Bitmap a(Bitmap bitmap, Size size, int i10) {
        if (!m()) {
            return bitmap;
        }
        Matrix matrixK = k();
        RectF rectFL = l(size, i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixK);
        matrix.postScale(rectFL.width() / this.f1445a.getWidth(), rectFL.height() / this.f1445a.getHeight());
        matrix.postTranslate(rectFL.left, rectFL.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public Matrix c(Size size, int i10, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i10).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public RectF d(Size size, int i10) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeF = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f1451h);
        matrix.mapRect(rectF2);
        return i10 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    public final int e() {
        return !this.f1450g ? this.f1446c : -p0.c.b(this.f1448e);
    }

    public final Size f() {
        return a0.i(this.f1446c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }

    public PreviewView.d g() {
        return this.f1451h;
    }

    public Matrix h(Size size, int i10) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f1447d);
        matrix.postConcat(j(size, i10));
        return matrix;
    }

    public Rect i() {
        return this.b;
    }

    public Matrix j(Size size, int i10) {
        g.i(m());
        Matrix matrixD = a0.d(new RectF(this.b), n(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i10), this.f1446c);
        if (this.f1449f && this.f1450g) {
            if (a0.i(this.f1446c)) {
                matrixD.preScale(1.0f, -1.0f, this.b.centerX(), this.b.centerY());
                return matrixD;
            }
            matrixD.preScale(-1.0f, 1.0f, this.b.centerX(), this.b.centerY());
        }
        return matrixD;
    }

    public Matrix k() {
        g.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f1445a.getWidth(), this.f1445a.getHeight());
        return a0.d(rectF, rectF, e());
    }

    public final RectF l(Size size, int i10) {
        g.i(m());
        Matrix matrixJ = j(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f1445a.getWidth(), this.f1445a.getHeight());
        matrixJ.mapRect(rectF);
        return rectF;
    }

    public final boolean m() {
        return (this.b == null || this.f1445a == null || !(!this.f1450g || this.f1448e != -1)) ? false : true;
    }

    public boolean n(Size size) {
        return a0.k(size, true, f(), false);
    }

    public void o(int i10, int i11) {
        if (this.f1450g) {
            this.f1446c = i10;
            this.f1448e = i11;
        }
    }

    public void q(PreviewView.d dVar) {
        this.f1451h = dVar;
    }

    public void r(v2.h hVar, Size size, boolean z10) {
        r1.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z10);
        this.b = hVar.a();
        this.f1446c = hVar.b();
        this.f1448e = hVar.d();
        this.f1445a = size;
        this.f1449f = z10;
        this.f1450g = hVar.e();
        this.f1447d = hVar.c();
    }

    public void s(Size size, int i10, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            r1.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z10 = false;
                boolean z11 = (!this.f1450g || display == null || display.getRotation() == this.f1448e) ? false : true;
                if (!this.f1450g && e() != 0) {
                    z10 = true;
                }
                if (z11 || z10) {
                    r1.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFL = l(size, i10);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFL.width() / this.f1445a.getWidth());
            view.setScaleY(rectFL.height() / this.f1445a.getHeight());
            view.setTranslationX(rectFL.left - view.getLeft());
            view.setTranslationY(rectFL.top - view.getTop());
        }
    }
}
