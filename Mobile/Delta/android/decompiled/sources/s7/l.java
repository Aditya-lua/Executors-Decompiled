package s7;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class l {
    public static final Matrix B = new Matrix();
    public s7.b A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f31062a;
    public a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f31063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f31064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f31065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f31066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f31067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f31068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f31069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f31070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f31071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f31072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Canvas f31073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f31074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g7.a f31075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f31076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f31077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f31078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f31079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Canvas f31080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Canvas f31081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g7.a f31082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f31083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f31084x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RenderNode f31085y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RenderNode f31086z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31087a;
        public androidx.core.graphics.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f31088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public s7.b f31089d;

        public a() {
            f();
        }

        public boolean a() {
            androidx.core.graphics.a aVar = this.b;
            return (aVar == null || aVar == androidx.core.graphics.a.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f31088c != null;
        }

        public boolean c() {
            return this.f31089d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f31087a < 255;
        }

        public void f() {
            this.f31087a = 255;
            this.b = null;
            this.f31088c = null;
            this.f31089d = null;
        }
    }

    public enum b {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    public final Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public final RectF b(RectF rectF, s7.b bVar) {
        if (this.f31065e == null) {
            this.f31065e = new RectF();
        }
        if (this.f31067g == null) {
            this.f31067g = new RectF();
        }
        this.f31065e.set(rectF);
        this.f31065e.offsetTo(rectF.left + bVar.f(), rectF.top + bVar.g());
        this.f31065e.inset(-bVar.h(), -bVar.h());
        this.f31067g.set(rectF);
        this.f31065e.union(this.f31067g);
        return this.f31065e;
    }

    public final b c(Canvas canvas, a aVar) {
        if (aVar.d()) {
            return b.DIRECT;
        }
        if (!aVar.c()) {
            return b.SAVE_LAYER;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || !canvas.isHardwareAccelerated()) {
            return b.BITMAP;
        }
        return i10 <= 31 ? b.BITMAP : b.RENDER_NODE;
    }

    public final void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public void e() {
        if (this.f31062a == null || this.b == null || this.f31077q == null || this.f31064d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f31063c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f31062a.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.f31085y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f31062a.save();
                Canvas canvas = this.f31062a;
                float[] fArr = this.f31077q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f31085y.endRecording();
                if (this.b.c()) {
                    i(this.f31062a, this.b.f31089d);
                }
                this.f31062a.drawRenderNode(this.f31085y);
                this.f31062a.restore();
            }
        } else {
            if (this.f31072l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.b.c()) {
                h(this.f31062a, this.b.f31089d);
            }
            if (this.f31074n == null) {
                this.f31074n = new Rect();
            }
            this.f31074n.set(0, 0, (int) (this.f31064d.width() * this.f31077q[0]), (int) (this.f31064d.height() * this.f31077q[4]));
            this.f31062a.drawBitmap(this.f31072l, this.f31074n, this.f31064d, this.f31071k);
        }
        this.f31062a = null;
    }

    public boolean f() {
        return this.f31063c == b.RENDER_NODE;
    }

    public final boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final void h(Canvas canvas, s7.b bVar) {
        g7.a aVar;
        RectF rectF = this.f31064d;
        if (rectF == null || this.f31072l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, bVar);
        if (this.f31066f == null) {
            this.f31066f = new Rect();
        }
        this.f31066f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f31077q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f31068h == null) {
            this.f31068h = new RectF();
        }
        this.f31068h.set(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        if (this.f31069i == null) {
            this.f31069i = new Rect();
        }
        this.f31069i.set(0, 0, Math.round(this.f31068h.width()), Math.round(this.f31068h.height()));
        if (g(this.f31078r, this.f31068h)) {
            Bitmap bitmap = this.f31078r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f31079s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f31078r = a(this.f31068h, Bitmap.Config.ARGB_8888);
            this.f31079s = a(this.f31068h, Bitmap.Config.ALPHA_8);
            this.f31080t = new Canvas(this.f31078r);
            this.f31081u = new Canvas(this.f31079s);
        } else {
            Canvas canvas2 = this.f31080t;
            if (canvas2 == null || this.f31081u == null || (aVar = this.f31075o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f31069i, aVar);
            this.f31081u.drawRect(this.f31069i, this.f31075o);
        }
        if (this.f31079s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f31082v == null) {
            this.f31082v = new g7.a(1);
        }
        RectF rectF2 = this.f31064d;
        this.f31081u.drawBitmap(this.f31072l, Math.round((rectF2.left - rectFB.left) * f10), Math.round((rectF2.top - rectFB.top) * f11), (Paint) null);
        if (this.f31083w == null || this.f31084x != bVar.h()) {
            float fH = (bVar.h() * (f10 + f11)) / 2.0f;
            if (fH > 0.0f) {
                this.f31083w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f31083w = null;
            }
            this.f31084x = bVar.h();
        }
        this.f31082v.setColor(bVar.e());
        if (bVar.h() > 0.0f) {
            this.f31082v.setMaskFilter(this.f31083w);
        } else {
            this.f31082v.setMaskFilter(null);
        }
        this.f31082v.setFilterBitmap(true);
        this.f31080t.drawBitmap(this.f31079s, Math.round(bVar.f() * f10), Math.round(bVar.g() * f11), this.f31082v);
        canvas.drawBitmap(this.f31078r, this.f31069i, this.f31066f, this.f31071k);
    }

    public final void i(Canvas canvas, s7.b bVar) {
        if (this.f31085y == null || this.f31086z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f31077q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        s7.b bVar2 = this.A;
        if (bVar2 == null || !bVar.j(bVar2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.e(), PorterDuff.Mode.SRC_IN));
            if (bVar.h() > 0.0f) {
                float fH = (bVar.h() * (f10 + f11)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f31086z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.A = bVar;
        }
        RectF rectFB = b(this.f31064d, bVar);
        RectF rectF = new RectF(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        this.f31086z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f31086z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (bVar.f() * f10), (-rectF.top) + (bVar.g() * f11));
        recordingCanvasBeginRecording.drawRenderNode(this.f31085y);
        this.f31086z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f31086z);
        canvas.restore();
    }

    public Canvas j(Canvas canvas, RectF rectF, a aVar) {
        if (this.f31062a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f31077q == null) {
            this.f31077q = new float[9];
        }
        if (this.f31076p == null) {
            this.f31076p = new Matrix();
        }
        canvas.getMatrix(this.f31076p);
        this.f31076p.getValues(this.f31077q);
        float[] fArr = this.f31077q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f31070j == null) {
            this.f31070j = new RectF();
        }
        this.f31070j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f31062a = canvas;
        this.b = aVar;
        this.f31063c = c(canvas, aVar);
        if (this.f31064d == null) {
            this.f31064d = new RectF();
        }
        this.f31064d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f31071k == null) {
            this.f31071k = new g7.a();
        }
        this.f31071k.reset();
        int iOrdinal = this.f31063c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f31071k.setAlpha(aVar.f31087a);
            this.f31071k.setColorFilter(aVar.f31088c);
            if (aVar.a()) {
                androidx.core.graphics.d.b(this.f31071k, aVar.b);
            }
            m.n(canvas, rectF, this.f31071k);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.f31075o == null) {
                g7.a aVar2 = new g7.a();
                this.f31075o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f31072l, this.f31070j)) {
                Bitmap bitmap = this.f31072l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f31072l = a(this.f31070j, Bitmap.Config.ARGB_8888);
                this.f31073m = new Canvas(this.f31072l);
            } else {
                Canvas canvas2 = this.f31073m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(B);
                this.f31073m.drawRect(-1.0f, -1.0f, this.f31070j.width() + 1.0f, this.f31070j.height() + 1.0f, this.f31075o);
            }
            androidx.core.graphics.d.b(this.f31071k, aVar.b);
            this.f31071k.setColorFilter(aVar.f31088c);
            this.f31071k.setAlpha(aVar.f31087a);
            Canvas canvas3 = this.f31073m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f31085y == null) {
            this.f31085y = k.a("OffscreenLayer.main");
        }
        if (aVar.c() && this.f31086z == null) {
            this.f31086z = k.a("OffscreenLayer.shadow");
            this.A = null;
        }
        if (aVar.a() || aVar.b()) {
            if (this.f31071k == null) {
                this.f31071k = new g7.a();
            }
            this.f31071k.reset();
            androidx.core.graphics.d.b(this.f31071k, aVar.b);
            this.f31071k.setColorFilter(aVar.f31088c);
            this.f31085y.setUseCompositingLayer(true, this.f31071k);
            if (aVar.c()) {
                RenderNode renderNode = this.f31086z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f31071k);
            }
        }
        this.f31085y.setAlpha(aVar.f31087a / 255.0f);
        if (aVar.c()) {
            RenderNode renderNode2 = this.f31086z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f31087a / 255.0f);
        }
        this.f31085y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f31085y;
        RectF rectF2 = this.f31070j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f31085y.beginRecording((int) this.f31070j.width(), (int) this.f31070j.height());
        recordingCanvasBeginRecording.setMatrix(B);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
