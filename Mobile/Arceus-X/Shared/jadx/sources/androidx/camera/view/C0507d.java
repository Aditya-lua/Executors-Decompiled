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
import androidx.camera.view.C0507d;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p261l2.C7975b;
import p397r0.C10773n;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: androidx.camera.view.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0507d extends AbstractC0506c {

    /* JADX INFO: renamed from: e */
    public SurfaceView f1893e;

    /* JADX INFO: renamed from: f */
    public final b f1894f;

    /* JADX INFO: renamed from: androidx.camera.view.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m2408a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.d$b */
    public class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public Size f1895a;

        /* JADX INFO: renamed from: b */
        public C5948v2 f1896b;

        /* JADX INFO: renamed from: c */
        public C5948v2 f1897c;

        /* JADX INFO: renamed from: d */
        public AbstractC0506c.a f1898d;

        /* JADX INFO: renamed from: e */
        public Size f1899e;

        /* JADX INFO: renamed from: f */
        public boolean f1900f = false;

        /* JADX INFO: renamed from: g */
        public boolean f1901g = false;

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2409a(AbstractC0506c.a aVar, C5948v2.g gVar) {
            C5931r1.m26561a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.mo2403a();
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m2410b() {
            return (this.f1900f || this.f1896b == null || !Objects.equals(this.f1895a, this.f1899e)) ? false : true;
        }

        /* JADX INFO: renamed from: c */
        public final void m2411c() {
            AbstractC0506c.a aVar;
            if (this.f1896b != null) {
                C5931r1.m26561a("SurfaceViewImpl", "Request canceled: " + this.f1896b);
                if (!this.f1896b.m26664z() || (aVar = this.f1898d) == null) {
                    return;
                }
                aVar.mo2403a();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m2412d() {
            if (this.f1896b != null) {
                C5931r1.m26561a("SurfaceViewImpl", "Surface closed " + this.f1896b);
                this.f1896b.m26652n().mo35430d();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m2413e(C5948v2 c5948v2, AbstractC0506c.a aVar) {
            m2411c();
            if (this.f1901g) {
                this.f1901g = false;
                c5948v2.m26658t();
                return;
            }
            this.f1896b = c5948v2;
            this.f1898d = aVar;
            Size sizeM26655q = c5948v2.m26655q();
            this.f1895a = sizeM26655q;
            this.f1900f = false;
            if (m2414f()) {
                return;
            }
            C5931r1.m26561a("SurfaceViewImpl", "Wait for new Surface creation.");
            C0507d.this.f1893e.getHolder().setFixedSize(sizeM26655q.getWidth(), sizeM26655q.getHeight());
        }

        /* JADX INFO: renamed from: f */
        public final boolean m2414f() {
            Surface surface = C0507d.this.f1893e.getHolder().getSurface();
            if (!m2410b()) {
                return false;
            }
            C5931r1.m26561a("SurfaceViewImpl", "Surface set on Preview.");
            final AbstractC0506c.a aVar = this.f1898d;
            C5948v2 c5948v2 = this.f1896b;
            Objects.requireNonNull(c5948v2);
            c5948v2.m26661w(surface, C7975b.m33011i(C0507d.this.f1893e.getContext()), new InterfaceC12631a() { // from class: p1.j0
                @Override // p533x2.InterfaceC12631a
                public final void accept(Object obj) {
                    C0507d.b.m2409a(aVar, (C5948v2.g) obj);
                }
            });
            this.f1900f = true;
            C0507d.this.m2399f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C5931r1.m26561a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f1899e = new Size(i11, i12);
            m2414f();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C5948v2 c5948v2;
            C5931r1.m26561a("SurfaceViewImpl", "Surface created.");
            if (!this.f1901g || (c5948v2 = this.f1897c) == null) {
                return;
            }
            c5948v2.m26658t();
            this.f1897c = null;
            this.f1901g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C5931r1.m26561a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f1900f) {
                m2412d();
            } else {
                m2411c();
            }
            this.f1901g = true;
            C5948v2 c5948v2 = this.f1896b;
            if (c5948v2 != null) {
                this.f1897c = c5948v2;
            }
            this.f1900f = false;
            this.f1896b = null;
            this.f1898d = null;
            this.f1899e = null;
            this.f1895a = null;
        }
    }

    public C0507d(FrameLayout frameLayout, C0505b c0505b) {
        super(frameLayout, c0505b);
        this.f1894f = new b();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2405k(Semaphore semaphore, int i10) {
        if (i10 == 0) {
            C5931r1.m26561a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            C5931r1.m26563c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
        }
        semaphore.release();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2406m(SurfaceView surfaceView, Size size, C5948v2 c5948v2) {
        return surfaceView != null && Objects.equals(size, c5948v2.m26655q());
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: b */
    public View mo2395b() {
        return this.f1893e;
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: c */
    public Bitmap mo2396c() {
        SurfaceView surfaceView = this.f1893e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f1893e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f1893e.getWidth(), this.f1893e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.m2408a(this.f1893e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: p1.i0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                C0507d.m2405k(semaphore, i10);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                C5931r1.m26563c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e10) {
            C5931r1.m26564d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: d */
    public void mo2397d() {
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: e */
    public void mo2398e() {
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: g */
    public void mo2400g(final C5948v2 c5948v2, final AbstractC0506c.a aVar) {
        if (!m2406m(this.f1893e, this.f1889a, c5948v2)) {
            this.f1889a = c5948v2.m26655q();
            m2407l();
        }
        if (aVar != null) {
            c5948v2.m26649k(C7975b.m33011i(this.f1893e.getContext()), new Runnable() { // from class: p1.g0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.mo2403a();
                }
            });
        }
        this.f1893e.post(new Runnable() { // from class: p1.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f36427a.f1894f.m2413e(c5948v2, aVar);
            }
        });
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: i */
    public InterfaceFutureC9440x<Void> mo2402i() {
        return C10773n.m40993p(null);
    }

    /* JADX INFO: renamed from: l */
    public void m2407l() {
        C12637g.m47075g(this.f1890b);
        C12637g.m47075g(this.f1889a);
        SurfaceView surfaceView = new SurfaceView(this.f1890b.getContext());
        this.f1893e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f1889a.getWidth(), this.f1889a.getHeight()));
        this.f1890b.removeAllViews();
        this.f1890b.addView(this.f1893e);
        this.f1893e.getHolder().addCallback(this.f1894f);
    }
}
