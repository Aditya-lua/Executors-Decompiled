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
    public final int f34619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f34621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j2.a f34622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2.a f34623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f34624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f34625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f34626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f34627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x2.a<j2.b> f34628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Executor f34629m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final me.x<Void> f34632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y1.c.a<Void> f34633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Matrix f34634r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34618a = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f34630n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34631o = false;

    public q0(Surface surface, int i10, int i11, Size size, j2.a aVar, j2.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f34624h = fArr;
        float[] fArr2 = new float[16];
        this.f34625i = fArr2;
        float[] fArr3 = new float[16];
        this.f34626j = fArr3;
        float[] fArr4 = new float[16];
        this.f34627k = fArr4;
        this.b = surface;
        this.f34619c = i10;
        this.f34620d = i11;
        this.f34621e = size;
        this.f34622f = aVar;
        this.f34623g = aVar2;
        this.f34634r = matrix;
        c(fArr, fArr3, aVar);
        c(fArr2, fArr4, aVar2);
        this.f34632p = y1.c.a(new y1.c.InterfaceC0650c() { // from class: x0.o0
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar3) {
                return q0.a(this.f34614a, aVar3);
            }
        });
    }

    public static /* synthetic */ Object a(q0 q0Var, y1.c.a aVar) {
        q0Var.f34633q = aVar;
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
    public void N1(float[] fArr, float[] fArr2) {
        S(fArr, fArr2, true);
    }

    @Override // g0.j2
    public void S(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f34624h : this.f34625i, 0);
    }

    @Override // g0.j2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f34618a) {
            try {
                if (!this.f34631o) {
                    this.f34631o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f34633q.c(null);
    }

    public me.x<Void> e() {
        return this.f34632p;
    }

    public void f() {
        Executor executor;
        x2.a<j2.b> aVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f34618a) {
            try {
                if (this.f34629m == null || (aVar = this.f34628l) == null) {
                    this.f34630n = true;
                } else if (!this.f34631o) {
                    atomicReference.set(aVar);
                    executor = this.f34629m;
                    this.f34630n = false;
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
                        q0.b(this.f34616a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                r1.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // g0.j2
    public int getFormat() {
        return this.f34620d;
    }

    @Override // g0.j2
    public Size i() {
        return this.f34621e;
    }

    @Override // g0.j2
    public Surface q2(Executor executor, x2.a<j2.b> aVar) {
        boolean z10;
        synchronized (this.f34618a) {
            this.f34629m = executor;
            this.f34628l = aVar;
            z10 = this.f34630n;
        }
        if (z10) {
            f();
        }
        return this.b;
    }
}
