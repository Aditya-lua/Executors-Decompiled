package x0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import g0.j2;
import g0.r1;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements j2 {
    public final Surface b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f35119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j2.a f35120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2.a f35121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f35122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f35124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f35125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x2.a<j2.b> f35126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Executor f35127m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ne.x<Void> f35130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y1.c.a<Void> f35131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Matrix f35132r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35116a = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35128n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35129o = false;

    public q0(Surface surface, int i10, int i11, Size size, j2.a aVar, j2.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f35122h = fArr;
        float[] fArr2 = new float[16];
        this.f35123i = fArr2;
        float[] fArr3 = new float[16];
        this.f35124j = fArr3;
        float[] fArr4 = new float[16];
        this.f35125k = fArr4;
        this.b = surface;
        this.f35117c = i10;
        this.f35118d = i11;
        this.f35119e = size;
        this.f35120f = aVar;
        this.f35121g = aVar2;
        this.f35132r = matrix;
        c(fArr, fArr3, aVar);
        c(fArr2, fArr4, aVar2);
        this.f35130p = y1.c.a(new y1.c.InterfaceC0665c() { // from class: x0.o0
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar3) {
                return q0.a(this.f35112a, aVar3);
            }
        });
    }

    public static /* synthetic */ Object a(q0 q0Var, y1.c.a aVar) {
        q0Var.f35131q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void b(q0 q0Var, AtomicReference atomicReference) {
        q0Var.getClass();
        ((x2.a) atomicReference.get()).accept(j2.b.c(0, q0Var));
    }

    public static void c(float[] fArr, float[] fArr2, j2.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        p0.t.d(fArr, 0.5f);
        p0.t.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeQ = p0.a0.q(aVar.c(), aVar.e());
        Matrix matrixE = p0.a0.e(p0.a0.t(aVar.c()), p0.a0.t(sizeQ), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixE.mapRect(rectF);
        float width = rectF.left / sizeQ.getWidth();
        float height = ((sizeQ.getHeight() - rectF.height()) - rectF.top) / sizeQ.getHeight();
        float fWidth = rectF.width() / sizeQ.getWidth();
        float fHeight = rectF.height() / sizeQ.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        d(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public static void d(float[] fArr, n0.p0 p0Var) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        p0.t.d(fArr, 0.5f);
        if (p0Var != null) {
            x2.g.j(p0Var.q(), "Camera has no transform.");
            p0.t.c(fArr, p0Var.d().d(), 0.5f, 0.5f);
            if (p0Var.l()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // g0.j2
    public void M1(float[] fArr, float[] fArr2) {
        S(fArr, fArr2, true);
    }

    @Override // g0.j2
    public void S(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f35122h : this.f35123i, 0);
    }

    @Override // g0.j2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f35116a) {
            try {
                if (!this.f35129o) {
                    this.f35129o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35131q.c(null);
    }

    public ne.x<Void> e() {
        return this.f35130p;
    }

    public void f() {
        Executor executor;
        x2.a<j2.b> aVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f35116a) {
            try {
                if (this.f35127m == null || (aVar = this.f35126l) == null) {
                    this.f35128n = true;
                } else if (!this.f35129o) {
                    atomicReference.set(aVar);
                    executor = this.f35127m;
                    this.f35128n = false;
                }
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: x0.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.b(this.f35114a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                r1.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // g0.j2
    public int getFormat() {
        return this.f35118d;
    }

    @Override // g0.j2
    public Size i() {
        return this.f35119e;
    }

    @Override // g0.j2
    public Surface r2(Executor executor, x2.a<j2.b> aVar) {
        boolean z10;
        synchronized (this.f35116a) {
            this.f35127m = executor;
            this.f35126l = aVar;
            z10 = this.f35128n;
        }
        if (z10) {
            f();
        }
        return this.b;
    }
}
