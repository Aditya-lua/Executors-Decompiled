package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 implements n0.j2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0.a f18141a;
    public volatile int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f18142c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f18144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f18145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f18146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f18147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageWriter f18148i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f18153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f18154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f18155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f18156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ByteBuffer f18157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteBuffer f18158s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f18143d = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f18149j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f18150k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f18151l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Matrix f18152m = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f18159t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18160u = true;

    public static /* synthetic */ void b(x0 x0Var, androidx.camera.core.d dVar, Matrix matrix, androidx.camera.core.d dVar2, Rect rect, u0.a aVar, y1.c.a aVar2) {
        if (!x0Var.f18160u) {
            aVar2.f(new u2.m("ImageAnalysis is detached"));
            return;
        }
        h2 h2Var = new h2(dVar2, o1.f(dVar.I2().c(), dVar.I2().getTimestamp(), x0Var.f18144e ? 0 : x0Var.b, matrix, dVar.I2().b()));
        if (!rect.isEmpty()) {
            h2Var.I0(rect);
        }
        aVar.k(h2Var);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final x0 x0Var, Executor executor, final androidx.camera.core.d dVar, final Matrix matrix, final androidx.camera.core.d dVar2, final Rect rect, final u0.a aVar, final y1.c.a aVar2) {
        x0Var.getClass();
        executor.execute(new Runnable() { // from class: g0.w0
            @Override // java.lang.Runnable
            public final void run() {
                x0.b(this.f18113a, dVar, matrix, dVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    public static androidx.camera.core.f h(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new androidx.camera.core.f(n1.a(i15, i10, i13, i14));
    }

    public static Matrix j(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), p0.a0.f28275a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(p0.a0.c(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    public static Rect k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @Override // n0.j2.a
    public void a(n0.j2 j2Var) {
        try {
            androidx.camera.core.d dVarD = d(j2Var);
            if (dVarD != null) {
                l(dVarD);
            }
        } catch (IllegalStateException e10) {
            r1.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    public abstract androidx.camera.core.d d(n0.j2 j2Var);

    public ne.x<Void> e(final androidx.camera.core.d dVar) throws Throwable {
        Object obj;
        final Executor executor;
        final u0.a aVar;
        boolean z10;
        androidx.camera.core.f fVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        androidx.camera.core.d dVarO;
        androidx.camera.core.d dVar2;
        int i10 = this.f18144e ? this.b : 0;
        Object obj2 = this.f18159t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f18146g;
                    aVar = this.f18141a;
                    z10 = this.f18144e && i10 != this.f18142c;
                    if (z10) {
                        n(dVar, i10);
                    }
                    if (this.f18144e || this.f18143d == 3) {
                        g(dVar);
                    }
                    try {
                        fVar = this.f18147h;
                        try {
                            imageWriter = this.f18148i;
                            byteBuffer = this.f18153n;
                            byteBuffer2 = this.f18154o;
                            byteBuffer3 = this.f18155p;
                            byteBuffer4 = this.f18156q;
                            byteBuffer5 = this.f18157r;
                            byteBuffer6 = this.f18158s;
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
        if (aVar == null || executor == null || !this.f18160u) {
            return r0.n.n(new u2.m("No analyzer or executor currently set."));
        }
        if (fVar != null) {
            if (this.f18143d == 2) {
                dVarO = ImageProcessingUtil.g(dVar, fVar, byteBuffer, i10, this.f18145f);
            } else {
                if (this.f18143d == 1) {
                    if (this.f18145f) {
                        ImageProcessingUtil.c(dVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        dVarO = ImageProcessingUtil.n(dVar, fVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                    }
                }
                dVar2 = null;
            }
            dVar2 = dVarO;
        } else {
            if (this.f18143d == 3) {
                if (this.f18145f) {
                    ImageProcessingUtil.c(dVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    dVarO = ImageProcessingUtil.o(dVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i10);
                    dVar2 = dVarO;
                }
            }
            dVar2 = null;
        }
        boolean z11 = dVar2 == null;
        final androidx.camera.core.d dVar3 = z11 ? dVar : dVar2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f18159t) {
            if (z10 && !z11) {
                try {
                    m(dVar.getWidth(), dVar.getHeight(), dVar3.getWidth(), dVar3.getHeight());
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            this.f18142c = i10;
            rect.set(this.f18150k);
            matrix.set(this.f18152m);
        }
        return y1.c.a(new y1.c.InterfaceC0665c() { // from class: g0.v0
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar2) {
                return x0.c(this.f18076a, executor, dVar, matrix, dVar3, rect, aVar, aVar2);
            }
        });
    }

    public abstract void f();

    public final void g(androidx.camera.core.d dVar) {
        if (this.f18143d != 1 && this.f18143d != 3) {
            if (this.f18143d == 2 && this.f18153n == null) {
                this.f18153n = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f18154o == null) {
            this.f18154o = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
        }
        this.f18154o.position(0);
        if (this.f18155p == null) {
            this.f18155p = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f18155p.position(0);
        if (this.f18156q == null) {
            this.f18156q = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f18156q.position(0);
        if (this.f18143d == 3) {
            if (this.f18157r == null) {
                this.f18157r = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
            }
            this.f18157r.position(0);
            if (this.f18158s == null) {
                this.f18158s = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 2);
            }
            this.f18158s.position(0);
        }
    }

    public void i() {
        this.f18160u = false;
        f();
    }

    public abstract void l(androidx.camera.core.d dVar);

    public final void m(int i10, int i11, int i12, int i13) {
        Matrix matrixJ = j(i10, i11, i12, i13, this.b);
        this.f18150k = k(this.f18149j, matrixJ);
        this.f18152m.setConcat(this.f18151l, matrixJ);
    }

    public final void n(androidx.camera.core.d dVar, int i10) {
        androidx.camera.core.f fVar = this.f18147h;
        if (fVar == null) {
            return;
        }
        fVar.j();
        this.f18147h = h(dVar.getWidth(), dVar.getHeight(), i10, this.f18147h.c(), this.f18147h.e());
        if (this.f18143d == 1) {
            ImageWriter imageWriter = this.f18148i;
            if (imageWriter != null) {
                t0.a.a(imageWriter);
            }
            this.f18148i = t0.a.c(this.f18147h.getSurface(), this.f18147h.e());
        }
    }

    public void o(Executor executor, u0.a aVar) {
        if (aVar == null) {
            f();
        }
        synchronized (this.f18159t) {
            this.f18141a = aVar;
            this.f18146g = executor;
        }
    }

    public void p(boolean z10) {
        this.f18145f = z10;
    }

    public void q(int i10) {
        this.f18143d = i10;
    }

    public void r(boolean z10) {
        this.f18144e = z10;
    }

    public void s(androidx.camera.core.f fVar) {
        synchronized (this.f18159t) {
            this.f18147h = fVar;
        }
    }

    public void t(int i10) {
        this.b = i10;
    }

    public void u(Matrix matrix) {
        synchronized (this.f18159t) {
            this.f18151l = matrix;
            this.f18152m = new Matrix(this.f18151l);
        }
    }

    public void v(Rect rect) {
        synchronized (this.f18159t) {
            this.f18149j = rect;
            this.f18150k = new Rect(this.f18149j);
        }
    }
}
