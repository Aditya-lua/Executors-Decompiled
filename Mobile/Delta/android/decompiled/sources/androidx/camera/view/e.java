package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import g0.r1;
import g0.v2;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import me.x;
import r0.n;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextureView f1465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f1466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x<v2.g> f1467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v2 f1468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f1470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicReference<y1.c.a<Void>> f1471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.a f1472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Executor f1473m;

    public class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: androidx.camera.view.e$a$a, reason: collision with other inner class name */
        public class C0021a implements r0.c<v2.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SurfaceTexture f1475a;

            public C0021a(SurfaceTexture surfaceTexture) {
                this.f1475a = surfaceTexture;
            }

            @Override // r0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(v2.g gVar) {
                g.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                r1.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f1475a.release();
                e eVar = e.this;
                if (eVar.f1470j != null) {
                    eVar.f1470j = null;
                }
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }
        }

        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            r1.a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            e eVar = e.this;
            eVar.f1466f = surfaceTexture;
            if (eVar.f1467g == null) {
                eVar.q();
                return;
            }
            g.g(eVar.f1468h);
            r1.a("TextureViewImpl", "Surface invalidated " + e.this.f1468h);
            e.this.f1468h.n().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            e eVar = e.this;
            eVar.f1466f = null;
            x<v2.g> xVar = eVar.f1467g;
            if (xVar == null) {
                r1.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            n.j(xVar, new C0021a(surfaceTexture), l2.b.i(e.this.f1465e.getContext()));
            e.this.f1470j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            r1.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            y1.c.a<Void> andSet = e.this.f1471k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
            e.this.getClass();
            Executor executor = e.this.f1473m;
        }
    }

    public e(FrameLayout frameLayout, b bVar) {
        super(frameLayout, bVar);
        this.f1469i = false;
        this.f1471k = new AtomicReference<>();
    }

    public static /* synthetic */ Object j(e eVar, Surface surface, final y1.c.a aVar) {
        eVar.getClass();
        r1.a("TextureViewImpl", "Surface set on Preview.");
        v2 v2Var = eVar.f1468h;
        Executor executorB = q0.c.b();
        Objects.requireNonNull(aVar);
        v2Var.w(surface, executorB, new x2.a() { // from class: p1.p0
            @Override // x2.a
            public final void accept(Object obj) {
                aVar.c((v2.g) obj);
            }
        });
        return "provideSurface[request=" + eVar.f1468h + " surface=" + surface + "]";
    }

    public static /* synthetic */ void k(e eVar, Surface surface, x xVar, v2 v2Var) {
        eVar.getClass();
        r1.a("TextureViewImpl", "Safe to release surface.");
        eVar.o();
        surface.release();
        if (eVar.f1467g == xVar) {
            eVar.f1467g = null;
        }
        if (eVar.f1468h == v2Var) {
            eVar.f1468h = null;
        }
    }

    public static /* synthetic */ void l(e eVar, v2 v2Var) {
        v2 v2Var2 = eVar.f1468h;
        if (v2Var2 != null && v2Var2 == v2Var) {
            eVar.f1468h = null;
            eVar.f1467g = null;
        }
        eVar.o();
    }

    public static /* synthetic */ Object m(e eVar, y1.c.a aVar) {
        eVar.f1471k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // androidx.camera.view.c
    public View b() {
        return this.f1465e;
    }

    @Override // androidx.camera.view.c
    public Bitmap c() {
        TextureView textureView = this.f1465e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f1465e.getBitmap();
    }

    @Override // androidx.camera.view.c
    public void d() {
        p();
    }

    @Override // androidx.camera.view.c
    public void e() {
        this.f1469i = true;
    }

    @Override // androidx.camera.view.c
    public void g(final v2 v2Var, c.a aVar) {
        this.f1453a = v2Var.q();
        n();
        v2 v2Var2 = this.f1468h;
        if (v2Var2 != null && v2Var2.z()) {
            o();
        }
        this.f1468h = v2Var;
        this.f1472l = aVar;
        v2Var.k(l2.b.i(this.f1465e.getContext()), new Runnable() { // from class: p1.l0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.e.l(this.f28176a, v2Var);
            }
        });
        q();
    }

    @Override // androidx.camera.view.c
    public x<Void> i() {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: p1.m0
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return androidx.camera.view.e.m(this.f28178a, aVar);
            }
        });
    }

    public void n() {
        g.g(this.b);
        g.g(this.f1453a);
        TextureView textureView = new TextureView(this.b.getContext());
        this.f1465e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f1453a.getWidth(), this.f1453a.getHeight()));
        this.f1465e.setSurfaceTextureListener(new a());
        this.b.removeAllViews();
        this.b.addView(this.f1465e);
    }

    public final void o() {
        c.a aVar = this.f1472l;
        if (aVar != null) {
            aVar.a();
            this.f1472l = null;
        }
    }

    public final void p() {
        if (!this.f1469i || this.f1470j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f1465e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f1470j;
        if (surfaceTexture != surfaceTexture2) {
            this.f1465e.setSurfaceTexture(surfaceTexture2);
            this.f1470j = null;
            this.f1469i = false;
        }
    }

    public void q() {
        SurfaceTexture surfaceTexture;
        Size size = this.f1453a;
        if (size == null || (surfaceTexture = this.f1466f) == null || this.f1468h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f1453a.getHeight());
        final Surface surface = new Surface(this.f1466f);
        final v2 v2Var = this.f1468h;
        final x<v2.g> xVarA = y1.c.a(new y1.c.InterfaceC0650c() { // from class: p1.n0
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return androidx.camera.view.e.j(this.f28180a, surface, aVar);
            }
        });
        this.f1467g = xVarA;
        xVarA.a(new Runnable() { // from class: p1.o0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.e.k(this.f28182a, surface, xVarA, v2Var);
            }
        }, l2.b.i(this.f1465e.getContext()));
        f();
    }
}
