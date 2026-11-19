package t7;

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
    public t7.b A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f32168a;
    public a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f32169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f32170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f32171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f32172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f32173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f32174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f32175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f32176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f32177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f32178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Canvas f32179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f32180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h7.a f32181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f32182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f32183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f32184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f32185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Canvas f32186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Canvas f32187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h7.a f32188v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f32189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f32190x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RenderNode f32191y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RenderNode f32192z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32193a;
        public androidx.core.graphics.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f32194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public t7.b f32195d;

        public a() {
            f();
        }

        public boolean a() {
            androidx.core.graphics.a aVar = this.b;
            return (aVar == null || aVar == androidx.core.graphics.a.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f32194c != null;
        }

        public boolean c() {
            return this.f32195d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f32193a < 255;
        }

        public void f() {
            this.f32193a = 255;
            this.b = null;
            this.f32194c = null;
            this.f32195d = null;
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

    public final RectF b(RectF rectF, t7.b bVar) {
        if (this.f32171e == null) {
            this.f32171e = new RectF();
        }
        if (this.f32173g == null) {
            this.f32173g = new RectF();
        }
        this.f32171e.set(rectF);
        this.f32171e.offsetTo(rectF.left + bVar.f(), rectF.top + bVar.g());
        this.f32171e.inset(-bVar.h(), -bVar.h());
        this.f32173g.set(rectF);
        this.f32171e.union(this.f32173g);
        return this.f32171e;
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
        if (this.f32168a == null || this.b == null || this.f32183q == null || this.f32170d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f32169c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f32168a.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.f32191y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f32168a.save();
                Canvas canvas = this.f32168a;
                float[] fArr = this.f32183q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f32191y.endRecording();
                if (this.b.c()) {
                    i(this.f32168a, this.b.f32195d);
                }
                this.f32168a.drawRenderNode(this.f32191y);
                this.f32168a.restore();
            }
        } else {
            if (this.f32178l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.b.c()) {
                h(this.f32168a, this.b.f32195d);
            }
            if (this.f32180n == null) {
                this.f32180n = new Rect();
            }
            this.f32180n.set(0, 0, (int) (this.f32170d.width() * this.f32183q[0]), (int) (this.f32170d.height() * this.f32183q[4]));
            this.f32168a.drawBitmap(this.f32178l, this.f32180n, this.f32170d, this.f32177k);
        }
        this.f32168a = null;
    }

    public boolean f() {
        return this.f32169c == b.RENDER_NODE;
    }

    public final boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final void h(Canvas canvas, t7.b bVar) {
        h7.a aVar;
        RectF rectF = this.f32170d;
        if (rectF == null || this.f32178l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, bVar);
        if (this.f32172f == null) {
            this.f32172f = new Rect();
        }
        this.f32172f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f32183q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f32174h == null) {
            this.f32174h = new RectF();
        }
        this.f32174h.set(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        if (this.f32175i == null) {
            this.f32175i = new Rect();
        }
        this.f32175i.set(0, 0, Math.round(this.f32174h.width()), Math.round(this.f32174h.height()));
        if (g(this.f32184r, this.f32174h)) {
            Bitmap bitmap = this.f32184r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f32185s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f32184r = a(this.f32174h, Bitmap.Config.ARGB_8888);
            this.f32185s = a(this.f32174h, Bitmap.Config.ALPHA_8);
            this.f32186t = new Canvas(this.f32184r);
            this.f32187u = new Canvas(this.f32185s);
        } else {
            Canvas canvas2 = this.f32186t;
            if (canvas2 == null || this.f32187u == null || (aVar = this.f32181o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f32175i, aVar);
            this.f32187u.drawRect(this.f32175i, this.f32181o);
        }
        if (this.f32185s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f32188v == null) {
            this.f32188v = new h7.a(1);
        }
        RectF rectF2 = this.f32170d;
        this.f32187u.drawBitmap(this.f32178l, Math.round((rectF2.left - rectFB.left) * f10), Math.round((rectF2.top - rectFB.top) * f11), (Paint) null);
        if (this.f32189w == null || this.f32190x != bVar.h()) {
            float fH = (bVar.h() * (f10 + f11)) / 2.0f;
            if (fH > 0.0f) {
                this.f32189w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f32189w = null;
            }
            this.f32190x = bVar.h();
        }
        this.f32188v.setColor(bVar.e());
        if (bVar.h() > 0.0f) {
            this.f32188v.setMaskFilter(this.f32189w);
        } else {
            this.f32188v.setMaskFilter(null);
        }
        this.f32188v.setFilterBitmap(true);
        this.f32186t.drawBitmap(this.f32185s, Math.round(bVar.f() * f10), Math.round(bVar.g() * f11), this.f32188v);
        canvas.drawBitmap(this.f32184r, this.f32175i, this.f32172f, this.f32177k);
    }

    public final void i(Canvas canvas, t7.b bVar) {
        if (this.f32191y == null || this.f32192z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f32183q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        t7.b bVar2 = this.A;
        if (bVar2 == null || !bVar.j(bVar2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.e(), PorterDuff.Mode.SRC_IN));
            if (bVar.h() > 0.0f) {
                float fH = (bVar.h() * (f10 + f11)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f32192z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.A = bVar;
        }
        RectF rectFB = b(this.f32170d, bVar);
        RectF rectF = new RectF(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        this.f32192z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f32192z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (bVar.f() * f10), (-rectF.top) + (bVar.g() * f11));
        recordingCanvasBeginRecording.drawRenderNode(this.f32191y);
        this.f32192z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f32192z);
        canvas.restore();
    }

    public Canvas j(Canvas canvas, RectF rectF, a aVar) {
        if (this.f32168a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f32183q == null) {
            this.f32183q = new float[9];
        }
        if (this.f32182p == null) {
            this.f32182p = new Matrix();
        }
        canvas.getMatrix(this.f32182p);
        this.f32182p.getValues(this.f32183q);
        float[] fArr = this.f32183q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f32176j == null) {
            this.f32176j = new RectF();
        }
        this.f32176j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f32168a = canvas;
        this.b = aVar;
        this.f32169c = c(canvas, aVar);
        if (this.f32170d == null) {
            this.f32170d = new RectF();
        }
        this.f32170d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f32177k == null) {
            this.f32177k = new h7.a();
        }
        this.f32177k.reset();
        int iOrdinal = this.f32169c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f32177k.setAlpha(aVar.f32193a);
            this.f32177k.setColorFilter(aVar.f32194c);
            if (aVar.a()) {
                androidx.core.graphics.d.b(this.f32177k, aVar.b);
            }
            m.n(canvas, rectF, this.f32177k);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.f32181o == null) {
                h7.a aVar2 = new h7.a();
                this.f32181o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f32178l, this.f32176j)) {
                Bitmap bitmap = this.f32178l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f32178l = a(this.f32176j, Bitmap.Config.ARGB_8888);
                this.f32179m = new Canvas(this.f32178l);
            } else {
                Canvas canvas2 = this.f32179m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(B);
                this.f32179m.drawRect(-1.0f, -1.0f, this.f32176j.width() + 1.0f, this.f32176j.height() + 1.0f, this.f32181o);
            }
            androidx.core.graphics.d.b(this.f32177k, aVar.b);
            this.f32177k.setColorFilter(aVar.f32194c);
            this.f32177k.setAlpha(aVar.f32193a);
            Canvas canvas3 = this.f32179m;
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
        if (this.f32191y == null) {
            this.f32191y = k.a("OffscreenLayer.main");
        }
        if (aVar.c() && this.f32192z == null) {
            this.f32192z = k.a("OffscreenLayer.shadow");
            this.A = null;
        }
        if (aVar.a() || aVar.b()) {
            if (this.f32177k == null) {
                this.f32177k = new h7.a();
            }
            this.f32177k.reset();
            androidx.core.graphics.d.b(this.f32177k, aVar.b);
            this.f32177k.setColorFilter(aVar.f32194c);
            this.f32191y.setUseCompositingLayer(true, this.f32177k);
            if (aVar.c()) {
                RenderNode renderNode = this.f32192z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f32177k);
            }
        }
        this.f32191y.setAlpha(aVar.f32193a / 255.0f);
        if (aVar.c()) {
            RenderNode renderNode2 = this.f32192z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f32193a / 255.0f);
        }
        this.f32191y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f32191y;
        RectF rectF2 = this.f32176j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f32191y.beginRecording((int) this.f32176j.width(), (int) this.f32176j.height());
        recordingCanvasBeginRecording.setMatrix(B);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
