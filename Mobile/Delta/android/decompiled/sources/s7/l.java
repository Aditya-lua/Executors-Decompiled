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
    public Canvas f30515a;
    public a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f30516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f30517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f30518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f30519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f30520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f30521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f30522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f30523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f30524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f30525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Canvas f30526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f30527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g7.a f30528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f30529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f30530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f30531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f30532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Canvas f30533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Canvas f30534u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g7.a f30535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f30536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f30537x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RenderNode f30538y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RenderNode f30539z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30540a;
        public androidx.core.graphics.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f30541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public s7.b f30542d;

        public a() {
            f();
        }

        public boolean a() {
            androidx.core.graphics.a aVar = this.b;
            return (aVar == null || aVar == androidx.core.graphics.a.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f30541c != null;
        }

        public boolean c() {
            return this.f30542d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f30540a < 255;
        }

        public void f() {
            this.f30540a = 255;
            this.b = null;
            this.f30541c = null;
            this.f30542d = null;
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
        if (this.f30518e == null) {
            this.f30518e = new RectF();
        }
        if (this.f30520g == null) {
            this.f30520g = new RectF();
        }
        this.f30518e.set(rectF);
        this.f30518e.offsetTo(rectF.left + bVar.f(), rectF.top + bVar.g());
        this.f30518e.inset(-bVar.h(), -bVar.h());
        this.f30520g.set(rectF);
        this.f30518e.union(this.f30520g);
        return this.f30518e;
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
        if (this.f30515a == null || this.b == null || this.f30530q == null || this.f30517d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f30516c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f30515a.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.f30538y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f30515a.save();
                Canvas canvas = this.f30515a;
                float[] fArr = this.f30530q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f30538y.endRecording();
                if (this.b.c()) {
                    i(this.f30515a, this.b.f30542d);
                }
                this.f30515a.drawRenderNode(this.f30538y);
                this.f30515a.restore();
            }
        } else {
            if (this.f30525l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.b.c()) {
                h(this.f30515a, this.b.f30542d);
            }
            if (this.f30527n == null) {
                this.f30527n = new Rect();
            }
            this.f30527n.set(0, 0, (int) (this.f30517d.width() * this.f30530q[0]), (int) (this.f30517d.height() * this.f30530q[4]));
            this.f30515a.drawBitmap(this.f30525l, this.f30527n, this.f30517d, this.f30524k);
        }
        this.f30515a = null;
    }

    public boolean f() {
        return this.f30516c == b.RENDER_NODE;
    }

    public final boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final void h(Canvas canvas, s7.b bVar) {
        g7.a aVar;
        RectF rectF = this.f30517d;
        if (rectF == null || this.f30525l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, bVar);
        if (this.f30519f == null) {
            this.f30519f = new Rect();
        }
        this.f30519f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f30530q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f30521h == null) {
            this.f30521h = new RectF();
        }
        this.f30521h.set(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        if (this.f30522i == null) {
            this.f30522i = new Rect();
        }
        this.f30522i.set(0, 0, Math.round(this.f30521h.width()), Math.round(this.f30521h.height()));
        if (g(this.f30531r, this.f30521h)) {
            Bitmap bitmap = this.f30531r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f30532s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f30531r = a(this.f30521h, Bitmap.Config.ARGB_8888);
            this.f30532s = a(this.f30521h, Bitmap.Config.ALPHA_8);
            this.f30533t = new Canvas(this.f30531r);
            this.f30534u = new Canvas(this.f30532s);
        } else {
            Canvas canvas2 = this.f30533t;
            if (canvas2 == null || this.f30534u == null || (aVar = this.f30528o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f30522i, aVar);
            this.f30534u.drawRect(this.f30522i, this.f30528o);
        }
        if (this.f30532s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f30535v == null) {
            this.f30535v = new g7.a(1);
        }
        RectF rectF2 = this.f30517d;
        this.f30534u.drawBitmap(this.f30525l, Math.round((rectF2.left - rectFB.left) * f10), Math.round((rectF2.top - rectFB.top) * f11), (Paint) null);
        if (this.f30536w == null || this.f30537x != bVar.h()) {
            float fH = (bVar.h() * (f10 + f11)) / 2.0f;
            if (fH > 0.0f) {
                this.f30536w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f30536w = null;
            }
            this.f30537x = bVar.h();
        }
        this.f30535v.setColor(bVar.e());
        if (bVar.h() > 0.0f) {
            this.f30535v.setMaskFilter(this.f30536w);
        } else {
            this.f30535v.setMaskFilter(null);
        }
        this.f30535v.setFilterBitmap(true);
        this.f30533t.drawBitmap(this.f30532s, Math.round(bVar.f() * f10), Math.round(bVar.g() * f11), this.f30535v);
        canvas.drawBitmap(this.f30531r, this.f30522i, this.f30519f, this.f30524k);
    }

    public final void i(Canvas canvas, s7.b bVar) {
        if (this.f30538y == null || this.f30539z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f30530q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        s7.b bVar2 = this.A;
        if (bVar2 == null || !bVar.j(bVar2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.e(), PorterDuff.Mode.SRC_IN));
            if (bVar.h() > 0.0f) {
                float fH = (bVar.h() * (f10 + f11)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f30539z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.A = bVar;
        }
        RectF rectFB = b(this.f30517d, bVar);
        RectF rectF = new RectF(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        this.f30539z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f30539z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (bVar.f() * f10), (-rectF.top) + (bVar.g() * f11));
        recordingCanvasBeginRecording.drawRenderNode(this.f30538y);
        this.f30539z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f30539z);
        canvas.restore();
    }

    public Canvas j(Canvas canvas, RectF rectF, a aVar) {
        if (this.f30515a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f30530q == null) {
            this.f30530q = new float[9];
        }
        if (this.f30529p == null) {
            this.f30529p = new Matrix();
        }
        canvas.getMatrix(this.f30529p);
        this.f30529p.getValues(this.f30530q);
        float[] fArr = this.f30530q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f30523j == null) {
            this.f30523j = new RectF();
        }
        this.f30523j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f30515a = canvas;
        this.b = aVar;
        this.f30516c = c(canvas, aVar);
        if (this.f30517d == null) {
            this.f30517d = new RectF();
        }
        this.f30517d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f30524k == null) {
            this.f30524k = new g7.a();
        }
        this.f30524k.reset();
        int iOrdinal = this.f30516c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f30524k.setAlpha(aVar.f30540a);
            this.f30524k.setColorFilter(aVar.f30541c);
            if (aVar.a()) {
                androidx.core.graphics.d.b(this.f30524k, aVar.b);
            }
            m.n(canvas, rectF, this.f30524k);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.f30528o == null) {
                g7.a aVar2 = new g7.a();
                this.f30528o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f30525l, this.f30523j)) {
                Bitmap bitmap = this.f30525l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f30525l = a(this.f30523j, Bitmap.Config.ARGB_8888);
                this.f30526m = new Canvas(this.f30525l);
            } else {
                Canvas canvas2 = this.f30526m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(B);
                this.f30526m.drawRect(-1.0f, -1.0f, this.f30523j.width() + 1.0f, this.f30523j.height() + 1.0f, this.f30528o);
            }
            androidx.core.graphics.d.b(this.f30524k, aVar.b);
            this.f30524k.setColorFilter(aVar.f30541c);
            this.f30524k.setAlpha(aVar.f30540a);
            Canvas canvas3 = this.f30526m;
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
        if (this.f30538y == null) {
            this.f30538y = k.a("OffscreenLayer.main");
        }
        if (aVar.c() && this.f30539z == null) {
            this.f30539z = k.a("OffscreenLayer.shadow");
            this.A = null;
        }
        if (aVar.a() || aVar.b()) {
            if (this.f30524k == null) {
                this.f30524k = new g7.a();
            }
            this.f30524k.reset();
            androidx.core.graphics.d.b(this.f30524k, aVar.b);
            this.f30524k.setColorFilter(aVar.f30541c);
            this.f30538y.setUseCompositingLayer(true, this.f30524k);
            if (aVar.c()) {
                RenderNode renderNode = this.f30539z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f30524k);
            }
        }
        this.f30538y.setAlpha(aVar.f30540a / 255.0f);
        if (aVar.c()) {
            RenderNode renderNode2 = this.f30539z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f30540a / 255.0f);
        }
        this.f30538y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f30538y;
        RectF rectF2 = this.f30523j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f30538y.beginRecording((int) this.f30523j.width(), (int) this.f30523j.height());
        recordingCanvasBeginRecording.setMatrix(B);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
