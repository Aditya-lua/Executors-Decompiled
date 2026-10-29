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
    public u0.a f17602a;
    public volatile int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f17603c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f17605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f17606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f17607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f17608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageWriter f17609i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f17614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f17615o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f17616p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f17617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ByteBuffer f17618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteBuffer f17619s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f17604d = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f17610j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f17611k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f17612l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Matrix f17613m = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f17620t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17621u = true;

    public static /* synthetic */ void b(x0 x0Var, androidx.camera.core.d dVar, Matrix matrix, androidx.camera.core.d dVar2, Rect rect, u0.a aVar, y1.c.a aVar2) {
        if (!x0Var.f17621u) {
            aVar2.f(new u2.m("ImageAnalysis is detached"));
            return;
        }
        h2 h2Var = new h2(dVar2, o1.f(dVar.H2().c(), dVar.H2().getTimestamp(), x0Var.f17605e ? 0 : x0Var.b, matrix, dVar.H2().b()));
        if (!rect.isEmpty()) {
            h2Var.M0(rect);
        }
        aVar.k(h2Var);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final x0 x0Var, Executor executor, final androidx.camera.core.d dVar, final Matrix matrix, final androidx.camera.core.d dVar2, final Rect rect, final u0.a aVar, final y1.c.a aVar2) {
        x0Var.getClass();
        executor.execute(new Runnable() { // from class: g0.w0
            @Override // java.lang.Runnable
            public final void run() {
                x0.b(this.f17574a, dVar, matrix, dVar2, rect, aVar, aVar2);
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
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), p0.a0.f28056a, Matrix.ScaleToFit.FILL);
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

    public me.x<Void> e(final androidx.camera.core.d dVar) throws Throwable {
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
        int i10 = this.f17605e ? this.b : 0;
        Object obj2 = this.f17620t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f17607g;
                    aVar = this.f17602a;
                    z10 = this.f17605e && i10 != this.f17603c;
                    if (z10) {
                        n(dVar, i10);
                    }
                    if (this.f17605e || this.f17604d == 3) {
                        g(dVar);
                    }
                    try {
                        fVar = this.f17608h;
                        try {
                            imageWriter = this.f17609i;
                            byteBuffer = this.f17614n;
                            byteBuffer2 = this.f17615o;
                            byteBuffer3 = this.f17616p;
                            byteBuffer4 = this.f17617q;
                            byteBuffer5 = this.f17618r;
                            byteBuffer6 = this.f17619s;
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
        if (aVar == null || executor == null || !this.f17621u) {
            return r0.n.n(new u2.m("No analyzer or executor currently set."));
        }
        if (fVar != null) {
            if (this.f17604d == 2) {
                dVarO = ImageProcessingUtil.g(dVar, fVar, byteBuffer, i10, this.f17606f);
            } else {
                if (this.f17604d == 1) {
                    if (this.f17606f) {
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
            if (this.f17604d == 3) {
                if (this.f17606f) {
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
        synchronized (this.f17620t) {
            if (z10 && !z11) {
                try {
                    m(dVar.getWidth(), dVar.getHeight(), dVar3.getWidth(), dVar3.getHeight());
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            this.f17603c = i10;
            rect.set(this.f17611k);
            matrix.set(this.f17613m);
        }
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: g0.v0
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar2) {
                return x0.c(this.f17537a, executor, dVar, matrix, dVar3, rect, aVar, aVar2);
            }
        });
    }

    public abstract void f();

    public final void g(androidx.camera.core.d dVar) {
        if (this.f17604d != 1 && this.f17604d != 3) {
            if (this.f17604d == 2 && this.f17614n == null) {
                this.f17614n = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f17615o == null) {
            this.f17615o = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
        }
        this.f17615o.position(0);
        if (this.f17616p == null) {
            this.f17616p = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f17616p.position(0);
        if (this.f17617q == null) {
            this.f17617q = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f17617q.position(0);
        if (this.f17604d == 3) {
            if (this.f17618r == null) {
                this.f17618r = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
            }
            this.f17618r.position(0);
            if (this.f17619s == null) {
                this.f17619s = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 2);
            }
            this.f17619s.position(0);
        }
    }

    public void i() {
        this.f17621u = false;
        f();
    }

    public abstract void l(androidx.camera.core.d dVar);

    public final void m(int i10, int i11, int i12, int i13) {
        Matrix matrixJ = j(i10, i11, i12, i13, this.b);
        this.f17611k = k(this.f17610j, matrixJ);
        this.f17613m.setConcat(this.f17612l, matrixJ);
    }

    public final void n(androidx.camera.core.d dVar, int i10) {
        androidx.camera.core.f fVar = this.f17608h;
        if (fVar == null) {
            return;
        }
        fVar.j();
        this.f17608h = h(dVar.getWidth(), dVar.getHeight(), i10, this.f17608h.c(), this.f17608h.e());
        if (this.f17604d == 1) {
            ImageWriter imageWriter = this.f17609i;
            if (imageWriter != null) {
                t0.a.a(imageWriter);
            }
            this.f17609i = t0.a.c(this.f17608h.getSurface(), this.f17608h.e());
        }
    }

    public void o(Executor executor, u0.a aVar) {
        if (aVar == null) {
            f();
        }
        synchronized (this.f17620t) {
            this.f17602a = aVar;
            this.f17607g = executor;
        }
    }

    public void p(boolean z10) {
        this.f17606f = z10;
    }

    public void q(int i10) {
        this.f17604d = i10;
    }

    public void r(boolean z10) {
        this.f17605e = z10;
    }

    public void s(androidx.camera.core.f fVar) {
        synchronized (this.f17620t) {
            this.f17608h = fVar;
        }
    }

    public void t(int i10) {
        this.b = i10;
    }

    public void u(Matrix matrix) {
        synchronized (this.f17620t) {
            this.f17612l = matrix;
            this.f17613m = new Matrix(this.f17612l);
        }
    }

    public void v(Rect rect) {
        synchronized (this.f17620t) {
            this.f17610j = rect;
            this.f17611k = new Rect(this.f17610j);
        }
    }
}
