package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class r5 extends n5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ScheduledExecutorService f36796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f36797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<n0.u1> f36798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public me.x<List<Void>> f36799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0.i f36800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d0.h f36801t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d0.s f36802u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d0.u f36803v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f36804w;

    public r5(n0.k3 k3Var, n0.k3 k3Var2, o3 o3Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(o3Var, executor, scheduledExecutorService, handler);
        this.f36797p = new Object();
        this.f36804w = new AtomicBoolean(false);
        this.f36800s = new d0.i(k3Var, k3Var2);
        this.f36802u = new d0.s(k3Var.a(CaptureSessionStuckQuirk.class) || k3Var.a(IncorrectCaptureStateQuirk.class));
        this.f36801t = new d0.h(k3Var2);
        this.f36803v = new d0.u(k3Var2);
        this.f36796o = scheduledExecutorService;
    }

    public static /* synthetic */ me.x H(r5 r5Var, CameraDevice cameraDevice, b0.o oVar, List list, List list2) {
        if (r5Var.f36803v.a()) {
            r5Var.J();
        }
        r5Var.K("start openCaptureSession");
        return super.h(cameraDevice, oVar, list);
    }

    public static /* synthetic */ void I(r5 r5Var) {
        r5Var.K("Session call super.close()");
        super.close();
    }

    public final void J() {
        Iterator<h5> it = this.b.d().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public void K(String str) {
        g0.r1.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // z.n5, z.h5
    public void c() {
        super.c();
        this.f36802u.g();
    }

    @Override // z.n5, z.h5
    public void close() {
        if (!this.f36804w.compareAndSet(false, true)) {
            K("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f36803v.a()) {
            try {
                K("Call abortCaptures() before closing session.");
                e();
            } catch (Exception e10) {
                K("Exception when calling abortCaptures()" + e10);
            }
        }
        K("Session call close()");
        this.f36802u.e().a(new Runnable() { // from class: z.p5
            @Override // java.lang.Runnable
            public final void run() {
                r5.I(this.f36752a);
            }
        }, getExecutor());
    }

    @Override // z.n5, z.h5
    public void d(int i10) {
        super.d(i10);
        if (i10 == 5) {
            synchronized (this.f36797p) {
                try {
                    if (E() && this.f36798q != null) {
                        K("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<n0.u1> it = this.f36798q.iterator();
                        while (it.hasNext()) {
                            it.next().d();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // z.n5, z.h5
    public int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.g(captureRequest, this.f36802u.d(captureCallback));
    }

    @Override // z.n5, z.h5.a
    public me.x<Void> h(final CameraDevice cameraDevice, final b0.o oVar, final List<n0.u1> list) {
        me.x<Void> xVarS;
        synchronized (this.f36797p) {
            try {
                List<h5> listD = this.b.d();
                ArrayList arrayList = new ArrayList();
                Iterator<h5> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().o());
                }
                me.x<List<Void>> xVarW = r0.n.w(arrayList);
                this.f36799r = xVarW;
                xVarS = r0.n.s(r0.d.c(xVarW).g(new r0.a() { // from class: z.q5
                    @Override // r0.a
                    public final me.x apply(Object obj) {
                        return r5.H(this.f36782a, cameraDevice, oVar, list, (List) obj);
                    }
                }, getExecutor()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVarS;
    }

    @Override // z.n5, z.h5.a
    public me.x<List<Surface>> j(List<n0.u1> list, long j10) {
        me.x<List<Surface>> xVarJ;
        synchronized (this.f36797p) {
            this.f36798q = list;
            xVarJ = super.j(list, j10);
        }
        return xVarJ;
    }

    @Override // z.n5, z.h5
    public int m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.m(list, this.f36802u.d(captureCallback));
    }

    @Override // z.h5
    public me.x<Void> o() {
        return r0.n.r(1500L, this.f36796o, this.f36802u.e());
    }

    @Override // z.n5, z.h5.c
    public void r(h5 h5Var) {
        synchronized (this.f36797p) {
            this.f36800s.a(this.f36798q);
        }
        K("onClosed()");
        super.r(h5Var);
    }

    @Override // z.n5, z.h5.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f36797p) {
            try {
                if (E()) {
                    this.f36800s.a(this.f36798q);
                } else {
                    me.x<List<Void>> xVar = this.f36799r;
                    if (xVar != null) {
                        xVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zStop;
    }

    @Override // z.n5, z.h5.c
    public void t(h5 h5Var) {
        K("Session onConfigured()");
        this.f36801t.c(h5Var, this.b.e(), this.b.d(), new d0.h.a() { // from class: z.o5
            @Override // d0.h.a
            public final void a(h5 h5Var2) {
                super/*z.n5*/.t(h5Var2);
            }
        });
    }
}
