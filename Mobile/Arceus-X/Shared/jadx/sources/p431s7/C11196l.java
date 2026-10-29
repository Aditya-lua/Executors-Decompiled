package p431s7;

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
import androidx.core.graphics.C0547d;
import androidx.core.graphics.EnumC0544a;
import p147g7.C6047a;

/* JADX INFO: renamed from: s7.l */
/* JADX INFO: loaded from: classes3.dex */
public class C11196l {

    /* JADX INFO: renamed from: B */
    public static final Matrix f39487B = new Matrix();

    /* JADX INFO: renamed from: A */
    public C11186b f39488A;

    /* JADX INFO: renamed from: a */
    public Canvas f39489a;

    /* JADX INFO: renamed from: b */
    public a f39490b;

    /* JADX INFO: renamed from: c */
    public b f39491c;

    /* JADX INFO: renamed from: d */
    public RectF f39492d;

    /* JADX INFO: renamed from: e */
    public RectF f39493e;

    /* JADX INFO: renamed from: f */
    public Rect f39494f;

    /* JADX INFO: renamed from: g */
    public RectF f39495g;

    /* JADX INFO: renamed from: h */
    public RectF f39496h;

    /* JADX INFO: renamed from: i */
    public Rect f39497i;

    /* JADX INFO: renamed from: j */
    public RectF f39498j;

    /* JADX INFO: renamed from: k */
    public Paint f39499k;

    /* JADX INFO: renamed from: l */
    public Bitmap f39500l;

    /* JADX INFO: renamed from: m */
    public Canvas f39501m;

    /* JADX INFO: renamed from: n */
    public Rect f39502n;

    /* JADX INFO: renamed from: o */
    public C6047a f39503o;

    /* JADX INFO: renamed from: p */
    public Matrix f39504p;

    /* JADX INFO: renamed from: q */
    public float[] f39505q;

    /* JADX INFO: renamed from: r */
    public Bitmap f39506r;

    /* JADX INFO: renamed from: s */
    public Bitmap f39507s;

    /* JADX INFO: renamed from: t */
    public Canvas f39508t;

    /* JADX INFO: renamed from: u */
    public Canvas f39509u;

    /* JADX INFO: renamed from: v */
    public C6047a f39510v;

    /* JADX INFO: renamed from: w */
    public BlurMaskFilter f39511w;

    /* JADX INFO: renamed from: x */
    public float f39512x = 0.0f;

    /* JADX INFO: renamed from: y */
    public RenderNode f39513y;

    /* JADX INFO: renamed from: z */
    public RenderNode f39514z;

    /* JADX INFO: renamed from: s7.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f39515a;

        /* JADX INFO: renamed from: b */
        public EnumC0544a f39516b;

        /* JADX INFO: renamed from: c */
        public ColorFilter f39517c;

        /* JADX INFO: renamed from: d */
        public C11186b f39518d;

        public a() {
            m42210f();
        }

        /* JADX INFO: renamed from: a */
        public boolean m42205a() {
            EnumC0544a enumC0544a = this.f39516b;
            return (enumC0544a == null || enumC0544a == EnumC0544a.SRC_OVER) ? false : true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m42206b() {
            return this.f39517c != null;
        }

        /* JADX INFO: renamed from: c */
        public boolean m42207c() {
            return this.f39518d != null;
        }

        /* JADX INFO: renamed from: d */
        public boolean m42208d() {
            return (m42209e() || m42205a() || m42207c() || m42206b()) ? false : true;
        }

        /* JADX INFO: renamed from: e */
        public boolean m42209e() {
            return this.f39515a < 255;
        }

        /* JADX INFO: renamed from: f */
        public void m42210f() {
            this.f39515a = 255;
            this.f39516b = null;
            this.f39517c = null;
            this.f39518d = null;
        }
    }

    /* JADX INFO: renamed from: s7.l$b */
    public enum b {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m42195a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    /* JADX INFO: renamed from: b */
    public final RectF m42196b(RectF rectF, C11186b c11186b) {
        if (this.f39493e == null) {
            this.f39493e = new RectF();
        }
        if (this.f39495g == null) {
            this.f39495g = new RectF();
        }
        this.f39493e.set(rectF);
        this.f39493e.offsetTo(rectF.left + c11186b.m42141f(), rectF.top + c11186b.m42142g());
        this.f39493e.inset(-c11186b.m42143h(), -c11186b.m42143h());
        this.f39495g.set(rectF);
        this.f39493e.union(this.f39495g);
        return this.f39493e;
    }

    /* JADX INFO: renamed from: c */
    public final b m42197c(Canvas canvas, a aVar) {
        if (aVar.m42208d()) {
            return b.DIRECT;
        }
        if (!aVar.m42207c()) {
            return b.SAVE_LAYER;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || !canvas.isHardwareAccelerated()) {
            return b.BITMAP;
        }
        return i10 <= 31 ? b.BITMAP : b.RENDER_NODE;
    }

    /* JADX INFO: renamed from: d */
    public final void m42198d(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* JADX INFO: renamed from: e */
    public void m42199e() {
        if (this.f39489a == null || this.f39490b == null || this.f39505q == null || this.f39492d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f39491c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f39489a.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.f39513y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f39489a.save();
                Canvas canvas = this.f39489a;
                float[] fArr = this.f39505q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f39513y.endRecording();
                if (this.f39490b.m42207c()) {
                    m42203i(this.f39489a, this.f39490b.f39518d);
                }
                this.f39489a.drawRenderNode(this.f39513y);
                this.f39489a.restore();
            }
        } else {
            if (this.f39500l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f39490b.m42207c()) {
                m42202h(this.f39489a, this.f39490b.f39518d);
            }
            if (this.f39502n == null) {
                this.f39502n = new Rect();
            }
            this.f39502n.set(0, 0, (int) (this.f39492d.width() * this.f39505q[0]), (int) (this.f39492d.height() * this.f39505q[4]));
            this.f39489a.drawBitmap(this.f39500l, this.f39502n, this.f39492d, this.f39499k);
        }
        this.f39489a = null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m42200f() {
        return this.f39491c == b.RENDER_NODE;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m42201g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    /* JADX INFO: renamed from: h */
    public final void m42202h(Canvas canvas, C11186b c11186b) {
        C6047a c6047a;
        RectF rectF = this.f39492d;
        if (rectF == null || this.f39500l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFM42196b = m42196b(rectF, c11186b);
        if (this.f39494f == null) {
            this.f39494f = new Rect();
        }
        this.f39494f.set((int) Math.floor(rectFM42196b.left), (int) Math.floor(rectFM42196b.top), (int) Math.ceil(rectFM42196b.right), (int) Math.ceil(rectFM42196b.bottom));
        float[] fArr = this.f39505q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f39496h == null) {
            this.f39496h = new RectF();
        }
        this.f39496h.set(rectFM42196b.left * f10, rectFM42196b.top * f11, rectFM42196b.right * f10, rectFM42196b.bottom * f11);
        if (this.f39497i == null) {
            this.f39497i = new Rect();
        }
        this.f39497i.set(0, 0, Math.round(this.f39496h.width()), Math.round(this.f39496h.height()));
        if (m42201g(this.f39506r, this.f39496h)) {
            Bitmap bitmap = this.f39506r;
            if (bitmap != null) {
                m42198d(bitmap);
            }
            Bitmap bitmap2 = this.f39507s;
            if (bitmap2 != null) {
                m42198d(bitmap2);
            }
            this.f39506r = m42195a(this.f39496h, Bitmap.Config.ARGB_8888);
            this.f39507s = m42195a(this.f39496h, Bitmap.Config.ALPHA_8);
            this.f39508t = new Canvas(this.f39506r);
            this.f39509u = new Canvas(this.f39507s);
        } else {
            Canvas canvas2 = this.f39508t;
            if (canvas2 == null || this.f39509u == null || (c6047a = this.f39503o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f39497i, c6047a);
            this.f39509u.drawRect(this.f39497i, this.f39503o);
        }
        if (this.f39507s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f39510v == null) {
            this.f39510v = new C6047a(1);
        }
        RectF rectF2 = this.f39492d;
        this.f39509u.drawBitmap(this.f39500l, Math.round((rectF2.left - rectFM42196b.left) * f10), Math.round((rectF2.top - rectFM42196b.top) * f11), (Paint) null);
        if (this.f39511w == null || this.f39512x != c11186b.m42143h()) {
            float fM42143h = (c11186b.m42143h() * (f10 + f11)) / 2.0f;
            if (fM42143h > 0.0f) {
                this.f39511w = new BlurMaskFilter(fM42143h, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f39511w = null;
            }
            this.f39512x = c11186b.m42143h();
        }
        this.f39510v.setColor(c11186b.m42140e());
        if (c11186b.m42143h() > 0.0f) {
            this.f39510v.setMaskFilter(this.f39511w);
        } else {
            this.f39510v.setMaskFilter(null);
        }
        this.f39510v.setFilterBitmap(true);
        this.f39508t.drawBitmap(this.f39507s, Math.round(c11186b.m42141f() * f10), Math.round(c11186b.m42142g() * f11), this.f39510v);
        canvas.drawBitmap(this.f39506r, this.f39497i, this.f39494f, this.f39499k);
    }

    /* JADX INFO: renamed from: i */
    public final void m42203i(Canvas canvas, C11186b c11186b) {
        if (this.f39513y == null || this.f39514z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f39505q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        C11186b c11186b2 = this.f39488A;
        if (c11186b2 == null || !c11186b.m42145j(c11186b2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c11186b.m42140e(), PorterDuff.Mode.SRC_IN));
            if (c11186b.m42143h() > 0.0f) {
                float fM42143h = (c11186b.m42143h() * (f10 + f11)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fM42143h, fM42143h, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f39514z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.f39488A = c11186b;
        }
        RectF rectFM42196b = m42196b(this.f39492d, c11186b);
        RectF rectF = new RectF(rectFM42196b.left * f10, rectFM42196b.top * f11, rectFM42196b.right * f10, rectFM42196b.bottom * f11);
        this.f39514z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f39514z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (c11186b.m42141f() * f10), (-rectF.top) + (c11186b.m42142g() * f11));
        recordingCanvasBeginRecording.drawRenderNode(this.f39513y);
        this.f39514z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f39514z);
        canvas.restore();
    }

    /* JADX INFO: renamed from: j */
    public Canvas m42204j(Canvas canvas, RectF rectF, a aVar) {
        if (this.f39489a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f39505q == null) {
            this.f39505q = new float[9];
        }
        if (this.f39504p == null) {
            this.f39504p = new Matrix();
        }
        canvas.getMatrix(this.f39504p);
        this.f39504p.getValues(this.f39505q);
        float[] fArr = this.f39505q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f39498j == null) {
            this.f39498j = new RectF();
        }
        this.f39498j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f39489a = canvas;
        this.f39490b = aVar;
        this.f39491c = m42197c(canvas, aVar);
        if (this.f39492d == null) {
            this.f39492d = new RectF();
        }
        this.f39492d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f39499k == null) {
            this.f39499k = new C6047a();
        }
        this.f39499k.reset();
        int iOrdinal = this.f39491c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f39499k.setAlpha(aVar.f39515a);
            this.f39499k.setColorFilter(aVar.f39517c);
            if (aVar.m42205a()) {
                C0547d.m2680b(this.f39499k, aVar.f39516b);
            }
            C11197m.m42225n(canvas, rectF, this.f39499k);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.f39503o == null) {
                C6047a c6047a = new C6047a();
                this.f39503o = c6047a;
                c6047a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (m42201g(this.f39500l, this.f39498j)) {
                Bitmap bitmap = this.f39500l;
                if (bitmap != null) {
                    m42198d(bitmap);
                }
                this.f39500l = m42195a(this.f39498j, Bitmap.Config.ARGB_8888);
                this.f39501m = new Canvas(this.f39500l);
            } else {
                Canvas canvas2 = this.f39501m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(f39487B);
                this.f39501m.drawRect(-1.0f, -1.0f, this.f39498j.width() + 1.0f, this.f39498j.height() + 1.0f, this.f39503o);
            }
            C0547d.m2680b(this.f39499k, aVar.f39516b);
            this.f39499k.setColorFilter(aVar.f39517c);
            this.f39499k.setAlpha(aVar.f39515a);
            Canvas canvas3 = this.f39501m;
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
        if (this.f39513y == null) {
            this.f39513y = C11195k.m42194a("OffscreenLayer.main");
        }
        if (aVar.m42207c() && this.f39514z == null) {
            this.f39514z = C11195k.m42194a("OffscreenLayer.shadow");
            this.f39488A = null;
        }
        if (aVar.m42205a() || aVar.m42206b()) {
            if (this.f39499k == null) {
                this.f39499k = new C6047a();
            }
            this.f39499k.reset();
            C0547d.m2680b(this.f39499k, aVar.f39516b);
            this.f39499k.setColorFilter(aVar.f39517c);
            this.f39513y.setUseCompositingLayer(true, this.f39499k);
            if (aVar.m42207c()) {
                RenderNode renderNode = this.f39514z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f39499k);
            }
        }
        this.f39513y.setAlpha(aVar.f39515a / 255.0f);
        if (aVar.m42207c()) {
            RenderNode renderNode2 = this.f39514z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f39515a / 255.0f);
        }
        this.f39513y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f39513y;
        RectF rectF2 = this.f39498j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f39513y.beginRecording((int) this.f39498j.width(), (int) this.f39498j.height());
        recordingCanvasBeginRecording.setMatrix(f39487B);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
