package p140g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.C0496f;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC0494d;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p296n0.InterfaceC8775j2;
import p347p0.C10085a0;
import p397r0.C10773n;
import p437t0.C11465a;
import p456u2.C11784m;
import p563y1.C12997c;

/* JADX INFO: renamed from: g0.x0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5954x0 implements InterfaceC8775j2.a {

    /* JADX INFO: renamed from: a */
    public C5942u0.a f22718a;

    /* JADX INFO: renamed from: b */
    public volatile int f22719b;

    /* JADX INFO: renamed from: c */
    public volatile int f22720c;

    /* JADX INFO: renamed from: e */
    public volatile boolean f22722e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f22723f;

    /* JADX INFO: renamed from: g */
    public Executor f22724g;

    /* JADX INFO: renamed from: h */
    public C0496f f22725h;

    /* JADX INFO: renamed from: i */
    public ImageWriter f22726i;

    /* JADX INFO: renamed from: n */
    public ByteBuffer f22731n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f22732o;

    /* JADX INFO: renamed from: p */
    public ByteBuffer f22733p;

    /* JADX INFO: renamed from: q */
    public ByteBuffer f22734q;

    /* JADX INFO: renamed from: r */
    public ByteBuffer f22735r;

    /* JADX INFO: renamed from: s */
    public ByteBuffer f22736s;

    /* JADX INFO: renamed from: d */
    public volatile int f22721d = 1;

    /* JADX INFO: renamed from: j */
    public Rect f22727j = new Rect();

    /* JADX INFO: renamed from: k */
    public Rect f22728k = new Rect();

    /* JADX INFO: renamed from: l */
    public Matrix f22729l = new Matrix();

    /* JADX INFO: renamed from: m */
    public Matrix f22730m = new Matrix();

    /* JADX INFO: renamed from: t */
    public final Object f22737t = new Object();

    /* JADX INFO: renamed from: u */
    public boolean f22738u = true;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m26722b(AbstractC5954x0 abstractC5954x0, InterfaceC0494d interfaceC0494d, Matrix matrix, InterfaceC0494d interfaceC0494d2, Rect rect, C5942u0.a aVar, C12997c.a aVar2) {
        if (!abstractC5954x0.f22738u) {
            aVar2.m48317f(new C11784m("ImageAnalysis is detached"));
            return;
        }
        C5892h2 c5892h2 = new C5892h2(interfaceC0494d2, AbstractC5919o1.m26552f(interfaceC0494d.mo2192H2().mo26441c(), interfaceC0494d.mo2192H2().getTimestamp(), abstractC5954x0.f22722e ? 0 : abstractC5954x0.f22719b, matrix, interfaceC0494d.mo2192H2().mo26440b()));
        if (!rect.isEmpty()) {
            c5892h2.mo2193M0(rect);
        }
        aVar.mo23127k(c5892h2);
        aVar2.m48314c(null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m26723c(final AbstractC5954x0 abstractC5954x0, Executor executor, final InterfaceC0494d interfaceC0494d, final Matrix matrix, final InterfaceC0494d interfaceC0494d2, final Rect rect, final C5942u0.a aVar, final C12997c.a aVar2) {
        abstractC5954x0.getClass();
        executor.execute(new Runnable() { // from class: g0.w0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC5954x0.m26722b(this.f22687a, interfaceC0494d, matrix, interfaceC0494d2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    /* JADX INFO: renamed from: h */
    public static C0496f m26724h(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new C0496f(C5915n1.m26550a(i15, i10, i13, i14));
    }

    /* JADX INFO: renamed from: j */
    public static Matrix m26725j(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), C10085a0.f36321a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(C10085a0.m38875c(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    /* JADX INFO: renamed from: k */
    public static Rect m26726k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @Override // p296n0.InterfaceC8775j2.a
    /* JADX INFO: renamed from: a */
    public void mo26326a(InterfaceC8775j2 interfaceC8775j2) {
        try {
            InterfaceC0494d interfaceC0494dMo2198d = mo2198d(interfaceC8775j2);
            if (interfaceC0494dMo2198d != null) {
                mo2200l(interfaceC0494dMo2198d);
            }
        } catch (IllegalStateException e10) {
            C5931r1.m26564d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC0494d mo2198d(InterfaceC8775j2 interfaceC8775j2);

    /* JADX INFO: renamed from: e */
    public InterfaceFutureC9440x<Void> m26727e(final InterfaceC0494d interfaceC0494d) throws Throwable {
        Object obj;
        final Executor executor;
        final C5942u0.a aVar;
        boolean z10;
        C0496f c0496f;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        InterfaceC0494d interfaceC0494dM2183o;
        InterfaceC0494d interfaceC0494d2;
        int i10 = this.f22722e ? this.f22719b : 0;
        Object obj2 = this.f22737t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f22724g;
                    aVar = this.f22718a;
                    z10 = this.f22722e && i10 != this.f22720c;
                    if (z10) {
                        m26731n(interfaceC0494d, i10);
                    }
                    if (this.f22722e || this.f22721d == 3) {
                        m26728g(interfaceC0494d);
                    }
                    try {
                        c0496f = this.f22725h;
                        try {
                            imageWriter = this.f22726i;
                            byteBuffer = this.f22731n;
                            byteBuffer2 = this.f22732o;
                            byteBuffer3 = this.f22733p;
                            byteBuffer4 = this.f22734q;
                            byteBuffer5 = this.f22735r;
                            byteBuffer6 = this.f22736s;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
        if (aVar == null || executor == null || !this.f22738u) {
            return C10773n.m40991n(new C11784m("No analyzer or executor currently set."));
        }
        if (c0496f != null) {
            if (this.f22721d == 2) {
                interfaceC0494dM2183o = ImageProcessingUtil.m2175g(interfaceC0494d, c0496f, byteBuffer, i10, this.f22723f);
            } else {
                if (this.f22721d == 1) {
                    if (this.f22723f) {
                        ImageProcessingUtil.m2171c(interfaceC0494d);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        interfaceC0494dM2183o = ImageProcessingUtil.m2182n(interfaceC0494d, c0496f, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                    }
                }
                interfaceC0494d2 = null;
            }
            interfaceC0494d2 = interfaceC0494dM2183o;
        } else {
            if (this.f22721d == 3) {
                if (this.f22723f) {
                    ImageProcessingUtil.m2171c(interfaceC0494d);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    interfaceC0494dM2183o = ImageProcessingUtil.m2183o(interfaceC0494d, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i10);
                    interfaceC0494d2 = interfaceC0494dM2183o;
                }
            }
            interfaceC0494d2 = null;
        }
        boolean z11 = interfaceC0494d2 == null;
        final InterfaceC0494d interfaceC0494d3 = z11 ? interfaceC0494d : interfaceC0494d2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f22737t) {
            if (z10 && !z11) {
                try {
                    m26730m(interfaceC0494d.getWidth(), interfaceC0494d.getHeight(), interfaceC0494d3.getWidth(), interfaceC0494d3.getHeight());
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            this.f22720c = i10;
            rect.set(this.f22728k);
            matrix.set(this.f22730m);
        }
        return C12997c.m48311a(new C12997c.c() { // from class: g0.v0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar2) {
                return AbstractC5954x0.m26723c(this.f22643a, executor, interfaceC0494d, matrix, interfaceC0494d3, rect, aVar, aVar2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2199f();

    /* JADX INFO: renamed from: g */
    public final void m26728g(InterfaceC0494d interfaceC0494d) {
        if (this.f22721d != 1 && this.f22721d != 3) {
            if (this.f22721d == 2 && this.f22731n == null) {
                this.f22731n = ByteBuffer.allocateDirect(interfaceC0494d.getWidth() * interfaceC0494d.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f22732o == null) {
            this.f22732o = ByteBuffer.allocateDirect(interfaceC0494d.getWidth() * interfaceC0494d.getHeight());
        }
        this.f22732o.position(0);
        if (this.f22733p == null) {
            this.f22733p = ByteBuffer.allocateDirect((interfaceC0494d.getWidth() * interfaceC0494d.getHeight()) / 4);
        }
        this.f22733p.position(0);
        if (this.f22734q == null) {
            this.f22734q = ByteBuffer.allocateDirect((interfaceC0494d.getWidth() * interfaceC0494d.getHeight()) / 4);
        }
        this.f22734q.position(0);
        if (this.f22721d == 3) {
            if (this.f22735r == null) {
                this.f22735r = ByteBuffer.allocateDirect(interfaceC0494d.getWidth() * interfaceC0494d.getHeight());
            }
            this.f22735r.position(0);
            if (this.f22736s == null) {
                this.f22736s = ByteBuffer.allocateDirect((interfaceC0494d.getWidth() * interfaceC0494d.getHeight()) / 2);
            }
            this.f22736s.position(0);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m26729i() {
        this.f22738u = false;
        mo2199f();
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo2200l(InterfaceC0494d interfaceC0494d);

    /* JADX INFO: renamed from: m */
    public final void m26730m(int i10, int i11, int i12, int i13) {
        Matrix matrixM26725j = m26725j(i10, i11, i12, i13, this.f22719b);
        this.f22728k = m26726k(this.f22727j, matrixM26725j);
        this.f22730m.setConcat(this.f22729l, matrixM26725j);
    }

    /* JADX INFO: renamed from: n */
    public final void m26731n(InterfaceC0494d interfaceC0494d, int i10) {
        C0496f c0496f = this.f22725h;
        if (c0496f == null) {
            return;
        }
        c0496f.m2225j();
        this.f22725h = m26724h(interfaceC0494d.getWidth(), interfaceC0494d.getHeight(), i10, this.f22725h.mo2209c(), this.f22725h.mo2211e());
        if (this.f22721d == 1) {
            ImageWriter imageWriter = this.f22726i;
            if (imageWriter != null) {
                C11465a.m42939a(imageWriter);
            }
            this.f22726i = C11465a.m42941c(this.f22725h.getSurface(), this.f22725h.mo2211e());
        }
    }

    /* JADX INFO: renamed from: o */
    public void m26732o(Executor executor, C5942u0.a aVar) {
        if (aVar == null) {
            mo2199f();
        }
        synchronized (this.f22737t) {
            this.f22718a = aVar;
            this.f22724g = executor;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m26733p(boolean z10) {
        this.f22723f = z10;
    }

    /* JADX INFO: renamed from: q */
    public void m26734q(int i10) {
        this.f22721d = i10;
    }

    /* JADX INFO: renamed from: r */
    public void m26735r(boolean z10) {
        this.f22722e = z10;
    }

    /* JADX INFO: renamed from: s */
    public void m26736s(C0496f c0496f) {
        synchronized (this.f22737t) {
            this.f22725h = c0496f;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m26737t(int i10) {
        this.f22719b = i10;
    }

    /* JADX INFO: renamed from: u */
    public void m26738u(Matrix matrix) {
        synchronized (this.f22737t) {
            this.f22729l = matrix;
            this.f22730m = new Matrix(this.f22729l);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m26739v(Rect rect) {
        synchronized (this.f22737t) {
            this.f22727j = rect;
            this.f22728k = new Rect(this.f22727j);
        }
    }
}
