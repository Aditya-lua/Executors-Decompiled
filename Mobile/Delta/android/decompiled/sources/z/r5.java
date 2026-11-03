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
    public final ScheduledExecutorService f37491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f37492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<n0.u1> f37493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ne.x<List<Void>> f37494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0.i f37495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d0.h f37496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d0.s f37497u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d0.u f37498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f37499w;

    public r5(n0.k3 k3Var, n0.k3 k3Var2, o3 o3Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(o3Var, executor, scheduledExecutorService, handler);
        this.f37492p = new Object();
        this.f37499w = new AtomicBoolean(false);
        this.f37495s = new d0.i(k3Var, k3Var2);
        this.f37497u = new d0.s(k3Var.a(CaptureSessionStuckQuirk.class) || k3Var.a(IncorrectCaptureStateQuirk.class));
        this.f37496t = new d0.h(k3Var2);
        this.f37498v = new d0.u(k3Var2);
        this.f37491o = scheduledExecutorService;
    }

    public static /* synthetic */ ne.x H(r5 r5Var, CameraDevice cameraDevice, b0.o oVar, List list, List list2) {
        if (r5Var.f37498v.a()) {
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
        this.f37497u.g();
    }

    @Override // z.n5, z.h5
    public void close() {
        if (!this.f37499w.compareAndSet(false, true)) {
            K("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f37498v.a()) {
            try {
                K("Call abortCaptures() before closing session.");
                e();
            } catch (Exception e10) {
                K("Exception when calling abortCaptures()" + e10);
            }
        }
        K("Session call close()");
        this.f37497u.e().a(new Runnable() { // from class: z.p5
            @Override // java.lang.Runnable
            public final void run() {
                r5.I(this.f37447a);
            }
        }, getExecutor());
    }

    @Override // z.n5, z.h5
    public void d(int i10) {
        super.d(i10);
        if (i10 == 5) {
            synchronized (this.f37492p) {
                try {
                    if (E() && this.f37493q != null) {
                        K("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<n0.u1> it = this.f37493q.iterator();
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
        return super.g(captureRequest, this.f37497u.d(captureCallback));
    }

    @Override // z.n5, z.h5.a
    public ne.x<Void> h(final CameraDevice cameraDevice, final b0.o oVar, final List<n0.u1> list) {
        ne.x<Void> xVarS;
        synchronized (this.f37492p) {
            try {
                List<h5> listD = this.b.d();
                ArrayList arrayList = new ArrayList();
                Iterator<h5> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().o());
                }
                ne.x<List<Void>> xVarW = r0.n.w(arrayList);
                this.f37494r = xVarW;
                xVarS = r0.n.s(r0.d.c(xVarW).g(new r0.a() { // from class: z.q5
                    @Override // r0.a
                    public final ne.x apply(Object obj) {
                        return r5.H(this.f37477a, cameraDevice, oVar, list, (List) obj);
                    }
                }, getExecutor()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVarS;
    }

    @Override // z.n5, z.h5.a
    public ne.x<List<Surface>> j(List<n0.u1> list, long j10) {
        ne.x<List<Surface>> xVarJ;
        synchronized (this.f37492p) {
            this.f37493q = list;
            xVarJ = super.j(list, j10);
        }
        return xVarJ;
    }

    @Override // z.n5, z.h5
    public int m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.m(list, this.f37497u.d(captureCallback));
    }

    @Override // z.h5
    public ne.x<Void> o() {
        return r0.n.r(1500L, this.f37491o, this.f37497u.e());
    }

    @Override // z.n5, z.h5.c
    public void r(h5 h5Var) {
        synchronized (this.f37492p) {
            this.f37495s.a(this.f37493q);
        }
        K("onClosed()");
        super.r(h5Var);
    }

    @Override // z.n5, z.h5.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f37492p) {
            try {
                if (E()) {
                    this.f37495s.a(this.f37493q);
                } else {
                    ne.x<List<Void>> xVar = this.f37494r;
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
        this.f37496t.c(h5Var, this.b.e(), this.b.d(), new d0.h.a() { // from class: z.o5
            @Override // d0.h.a
            public final void a(h5 h5Var2) {
                super/*z.n5*/.t(h5Var2);
            }
        });
    }
}
