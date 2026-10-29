package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import g0.r1;
import g0.v2;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import me.x;
import r0.n;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SurfaceView f1456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f1457f;

    public static class a {
        public static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    public class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f1458a;
        public v2 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public v2 f1459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.a f1460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Size f1461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1462f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1463g = false;

        public b() {
        }

        public static /* synthetic */ void a(c.a aVar, v2.g gVar) {
            r1.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        public final boolean b() {
            return (this.f1462f || this.b == null || !Objects.equals(this.f1458a, this.f1461e)) ? false : true;
        }

        public final void c() {
            c.a aVar;
            if (this.b != null) {
                r1.a("SurfaceViewImpl", "Request canceled: " + this.b);
                if (!this.b.z() || (aVar = this.f1460d) == null) {
                    return;
                }
                aVar.a();
            }
        }

        public final void d() {
            if (this.b != null) {
                r1.a("SurfaceViewImpl", "Surface closed " + this.b);
                this.b.n().d();
            }
        }

        public void e(v2 v2Var, c.a aVar) {
            c();
            if (this.f1463g) {
                this.f1463g = false;
                v2Var.t();
                return;
            }
            this.b = v2Var;
            this.f1460d = aVar;
            Size sizeQ = v2Var.q();
            this.f1458a = sizeQ;
            this.f1462f = false;
            if (f()) {
                return;
            }
            r1.a("SurfaceViewImpl", "Wait for new Surface creation.");
            d.this.f1456e.getHolder().setFixedSize(sizeQ.getWidth(), sizeQ.getHeight());
        }

        public final boolean f() {
            Surface surface = d.this.f1456e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            r1.a("SurfaceViewImpl", "Surface set on Preview.");
            final c.a aVar = this.f1460d;
            v2 v2Var = this.b;
            Objects.requireNonNull(v2Var);
            v2Var.w(surface, l2.b.i(d.this.f1456e.getContext()), new x2.a() { // from class: p1.j0
                @Override // x2.a
                public final void accept(Object obj) {
                    androidx.camera.view.d.b.a(aVar, (v2.g) obj);
                }
            });
            this.f1462f = true;
            d.this.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            r1.a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f1461e = new Size(i11, i12);
            f();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            v2 v2Var;
            r1.a("SurfaceViewImpl", "Surface created.");
            if (!this.f1463g || (v2Var = this.f1459c) == null) {
                return;
            }
            v2Var.t();
            this.f1459c = null;
            this.f1463g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            r1.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f1462f) {
                d();
            } else {
                c();
            }
            this.f1463g = true;
            v2 v2Var = this.b;
            if (v2Var != null) {
                this.f1459c = v2Var;
            }
            this.f1462f = false;
            this.b = null;
            this.f1460d = null;
            this.f1461e = null;
            this.f1458a = null;
        }
    }

    public d(FrameLayout frameLayout, androidx.camera.view.b bVar) {
        super(frameLayout, bVar);
        this.f1457f = new b();
    }

    public static /* synthetic */ void k(Semaphore semaphore, int i10) {
        if (i10 == 0) {
            r1.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            r1.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
        }
        semaphore.release();
    }

    public static boolean m(SurfaceView surfaceView, Size size, v2 v2Var) {
        return surfaceView != null && Objects.equals(size, v2Var.q());
    }

    @Override // androidx.camera.view.c
    public View b() {
        return this.f1456e;
    }

    @Override // androidx.camera.view.c
    public Bitmap c() {
        SurfaceView surfaceView = this.f1456e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f1456e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f1456e.getWidth(), this.f1456e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f1456e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: p1.i0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                androidx.camera.view.d.k(semaphore, i10);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                r1.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e10) {
            r1.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.c
    public void d() {
    }

    @Override // androidx.camera.view.c
    public void e() {
    }

    @Override // androidx.camera.view.c
    public void g(final v2 v2Var, final c.a aVar) {
        if (!m(this.f1456e, this.f1453a, v2Var)) {
            this.f1453a = v2Var.q();
            l();
        }
        if (aVar != null) {
            v2Var.k(l2.b.i(this.f1456e.getContext()), new Runnable() { // from class: p1.g0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a();
                }
            });
        }
        this.f1456e.post(new Runnable() { // from class: p1.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28141a.f1457f.e(v2Var, aVar);
            }
        });
    }

    @Override // androidx.camera.view.c
    public x<Void> i() {
        return n.p(null);
    }

    public void l() {
        g.g(this.b);
        g.g(this.f1453a);
        SurfaceView surfaceView = new SurfaceView(this.b.getContext());
        this.f1456e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f1453a.getWidth(), this.f1453a.getHeight()));
        this.b.removeAllViews();
        this.b.addView(this.f1456e);
        this.f1456e.getHolder().addCallback(this.f1457f);
    }
}
