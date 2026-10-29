package p531x0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p140g0.InterfaceC5900j2;
import p296n0.InterfaceC8804p0;
import p347p0.C10085a0;
import p347p0.C10104t;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;

/* JADX INFO: renamed from: x0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12608q0 implements InterfaceC5900j2 {

    /* JADX INFO: renamed from: b */
    public final Surface f44878b;

    /* JADX INFO: renamed from: c */
    public final int f44879c;

    /* JADX INFO: renamed from: d */
    public final int f44880d;

    /* JADX INFO: renamed from: e */
    public final Size f44881e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5900j2.a f44882f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5900j2.a f44883g;

    /* JADX INFO: renamed from: h */
    public final float[] f44884h;

    /* JADX INFO: renamed from: i */
    public final float[] f44885i;

    /* JADX INFO: renamed from: j */
    public final float[] f44886j;

    /* JADX INFO: renamed from: k */
    public final float[] f44887k;

    /* JADX INFO: renamed from: l */
    public InterfaceC12631a<InterfaceC5900j2.b> f44888l;

    /* JADX INFO: renamed from: m */
    public Executor f44889m;

    /* JADX INFO: renamed from: p */
    public final InterfaceFutureC9440x<Void> f44892p;

    /* JADX INFO: renamed from: q */
    public C12997c.a<Void> f44893q;

    /* JADX INFO: renamed from: r */
    public Matrix f44894r;

    /* JADX INFO: renamed from: a */
    public final Object f44877a = new Object();

    /* JADX INFO: renamed from: n */
    public boolean f44890n = false;

    /* JADX INFO: renamed from: o */
    public boolean f44891o = false;

    public C12608q0(Surface surface, int i10, int i11, Size size, InterfaceC5900j2.a aVar, InterfaceC5900j2.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f44884h = fArr;
        float[] fArr2 = new float[16];
        this.f44885i = fArr2;
        float[] fArr3 = new float[16];
        this.f44886j = fArr3;
        float[] fArr4 = new float[16];
        this.f44887k = fArr4;
        this.f44878b = surface;
        this.f44879c = i10;
        this.f44880d = i11;
        this.f44881e = size;
        this.f44882f = aVar;
        this.f44883g = aVar2;
        this.f44894r = matrix;
        m46976c(fArr, fArr3, aVar);
        m46976c(fArr2, fArr4, aVar2);
        this.f44892p = C12997c.m48311a(new C12997c.c() { // from class: x0.o0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar3) {
                return C12608q0.m46974a(this.f44872a, aVar3);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m46974a(C12608q0 c12608q0, C12997c.a aVar) {
        c12608q0.f44893q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m46975b(C12608q0 c12608q0, AtomicReference atomicReference) {
        c12608q0.getClass();
        ((InterfaceC12631a) atomicReference.get()).accept(InterfaceC5900j2.b.m26508c(0, c12608q0));
    }

    /* JADX INFO: renamed from: c */
    public static void m46976c(float[] fArr, float[] fArr2, InterfaceC5900j2.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        C10104t.m39001d(fArr, 0.5f);
        C10104t.m39000c(fArr, aVar.mo26485e(), 0.5f, 0.5f);
        if (aVar.mo26484d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeM38889q = C10085a0.m38889q(aVar.mo26483c(), aVar.mo26485e());
        Matrix matrixM38877e = C10085a0.m38877e(C10085a0.m38892t(aVar.mo26483c()), C10085a0.m38892t(sizeM38889q), aVar.mo26485e(), aVar.mo26484d());
        RectF rectF = new RectF(aVar.mo26482b());
        matrixM38877e.mapRect(rectF);
        float width = rectF.left / sizeM38889q.getWidth();
        float height = ((sizeM38889q.getHeight() - rectF.height()) - rectF.top) / sizeM38889q.getHeight();
        float fWidth = rectF.width() / sizeM38889q.getWidth();
        float fHeight = rectF.height() / sizeM38889q.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        m46977d(fArr2, aVar.mo26481a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    /* JADX INFO: renamed from: d */
    public static void m46977d(float[] fArr, InterfaceC8804p0 interfaceC8804p0) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        C10104t.m39001d(fArr, 0.5f);
        if (interfaceC8804p0 != null) {
            C12637g.m47078j(interfaceC8804p0.mo6701q(), "Camera has no transform.");
            C10104t.m39000c(fArr, interfaceC8804p0.mo22074d().mo6749d(), 0.5f, 0.5f);
            if (interfaceC8804p0.mo35084l()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // p140g0.InterfaceC5900j2
    /* JADX INFO: renamed from: N1 */
    public void mo26503N1(float[] fArr, float[] fArr2) {
        mo26504S(fArr, fArr2, true);
    }

    @Override // p140g0.InterfaceC5900j2
    /* JADX INFO: renamed from: S */
    public void mo26504S(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f44884h : this.f44885i, 0);
    }

    @Override // p140g0.InterfaceC5900j2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f44877a) {
            try {
                if (!this.f44891o) {
                    this.f44891o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f44893q.m48314c(null);
    }

    /* JADX INFO: renamed from: e */
    public InterfaceFutureC9440x<Void> m46978e() {
        return this.f44892p;
    }

    /* JADX INFO: renamed from: f */
    public void m46979f() {
        Executor executor;
        InterfaceC12631a<InterfaceC5900j2.b> interfaceC12631a;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f44877a) {
            try {
                if (this.f44889m == null || (interfaceC12631a = this.f44888l) == null) {
                    this.f44890n = true;
                } else if (!this.f44891o) {
                    atomicReference.set(interfaceC12631a);
                    executor = this.f44889m;
                    this.f44890n = false;
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
                        C12608q0.m46975b(this.f44874a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                C5931r1.m26562b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // p140g0.InterfaceC5900j2
    public int getFormat() {
        return this.f44880d;
    }

    @Override // p140g0.InterfaceC5900j2
    /* JADX INFO: renamed from: i */
    public Size mo26505i() {
        return this.f44881e;
    }

    @Override // p140g0.InterfaceC5900j2
    /* JADX INFO: renamed from: q2 */
    public Surface mo26506q2(Executor executor, InterfaceC12631a<InterfaceC5900j2.b> interfaceC12631a) {
        boolean z10;
        synchronized (this.f44877a) {
            this.f44889m = executor;
            this.f44888l = interfaceC12631a;
            z10 = this.f44890n;
        }
        if (z10) {
            m46979f();
        }
        return this.f44878b;
    }
}
