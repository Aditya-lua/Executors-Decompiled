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
import ne.x;
import r0.n;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextureView f1310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f1311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x<v2.g> f1312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v2 f1313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f1315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicReference<y1.c.a<Void>> f1316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.a f1317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Executor f1318m;

    public class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: androidx.camera.view.e$a$a, reason: collision with other inner class name */
        public class C0017a implements r0.c<v2.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SurfaceTexture f1320a;

            public C0017a(SurfaceTexture surfaceTexture) {
                this.f1320a = surfaceTexture;
            }

            @Override // r0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(v2.g gVar) {
                g.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                r1.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f1320a.release();
                e eVar = e.this;
                if (eVar.f1315j != null) {
                    eVar.f1315j = null;
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
            eVar.f1311f = surfaceTexture;
            if (eVar.f1312g == null) {
                eVar.q();
                return;
            }
            g.g(eVar.f1313h);
            r1.a("TextureViewImpl", "Surface invalidated " + e.this.f1313h);
            e.this.f1313h.n().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            e eVar = e.this;
            eVar.f1311f = null;
            x<v2.g> xVar = eVar.f1312g;
            if (xVar == null) {
                r1.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            n.j(xVar, new C0017a(surfaceTexture), l2.b.i(e.this.f1310e.getContext()));
            e.this.f1315j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            r1.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            y1.c.a<Void> andSet = e.this.f1316k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
            e.this.getClass();
            Executor executor = e.this.f1318m;
        }
    }

    public e(FrameLayout frameLayout, b bVar) {
        super(frameLayout, bVar);
        this.f1314i = false;
        this.f1316k = new AtomicReference<>();
    }

    public static /* synthetic */ Object j(e eVar, Surface surface, final y1.c.a aVar) {
        eVar.getClass();
        r1.a("TextureViewImpl", "Surface set on Preview.");
        v2 v2Var = eVar.f1313h;
        Executor executorB = q0.c.b();
        Objects.requireNonNull(aVar);
        v2Var.w(surface, executorB, new x2.a() { // from class: p1.p0
            @Override // x2.a
            public final void accept(Object obj) {
                aVar.c((v2.g) obj);
            }
        });
        return "provideSurface[request=" + eVar.f1313h + " surface=" + surface + "]";
    }

    public static /* synthetic */ void k(e eVar, Surface surface, x xVar, v2 v2Var) {
        eVar.getClass();
        r1.a("TextureViewImpl", "Safe to release surface.");
        eVar.o();
        surface.release();
        if (eVar.f1312g == xVar) {
            eVar.f1312g = null;
        }
        if (eVar.f1313h == v2Var) {
            eVar.f1313h = null;
        }
    }

    public static /* synthetic */ void l(e eVar, v2 v2Var) {
        v2 v2Var2 = eVar.f1313h;
        if (v2Var2 != null && v2Var2 == v2Var) {
            eVar.f1313h = null;
            eVar.f1312g = null;
        }
        eVar.o();
    }

    public static /* synthetic */ Object m(e eVar, y1.c.a aVar) {
        eVar.f1316k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // androidx.camera.view.c
    public View b() {
        return this.f1310e;
    }

    @Override // androidx.camera.view.c
    public Bitmap c() {
        TextureView textureView = this.f1310e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f1310e.getBitmap();
    }

    @Override // androidx.camera.view.c
    public void d() {
        p();
    }

    @Override // androidx.camera.view.c
    public void e() {
        this.f1314i = true;
    }

    @Override // androidx.camera.view.c
    public void g(final v2 v2Var, c.a aVar) {
        this.f1298a = v2Var.q();
        n();
        v2 v2Var2 = this.f1313h;
        if (v2Var2 != null && v2Var2.z()) {
            o();
        }
        this.f1313h = v2Var;
        this.f1317l = aVar;
        v2Var.k(l2.b.i(this.f1310e.getContext()), new Runnable() { // from class: p1.l0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.e.l(this.f28395a, v2Var);
            }
        });
        q();
    }

    @Override // androidx.camera.view.c
    public x<Void> i() {
        return y1.c.a(new y1.c.InterfaceC0665c() { // from class: p1.m0
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return androidx.camera.view.e.m(this.f28397a, aVar);
            }
        });
    }

    public void n() {
        g.g(this.b);
        g.g(this.f1298a);
        TextureView textureView = new TextureView(this.b.getContext());
        this.f1310e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f1298a.getWidth(), this.f1298a.getHeight()));
        this.f1310e.setSurfaceTextureListener(new a());
        this.b.removeAllViews();
        this.b.addView(this.f1310e);
    }

    public final void o() {
        c.a aVar = this.f1317l;
        if (aVar != null) {
            aVar.a();
            this.f1317l = null;
        }
    }

    public final void p() {
        if (!this.f1314i || this.f1315j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f1310e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f1315j;
        if (surfaceTexture != surfaceTexture2) {
            this.f1310e.setSurfaceTexture(surfaceTexture2);
            this.f1315j = null;
            this.f1314i = false;
        }
    }

    public void q() {
        SurfaceTexture surfaceTexture;
        Size size = this.f1298a;
        if (size == null || (surfaceTexture = this.f1311f) == null || this.f1313h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f1298a.getHeight());
        final Surface surface = new Surface(this.f1311f);
        final v2 v2Var = this.f1313h;
        final x<v2.g> xVarA = y1.c.a(new y1.c.InterfaceC0665c() { // from class: p1.n0
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return androidx.camera.view.e.j(this.f28399a, surface, aVar);
            }
        });
        this.f1312g = xVarA;
        xVarA.a(new Runnable() { // from class: p1.o0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.e.k(this.f28401a, surface, xVarA, v2Var);
            }
        }, l2.b.i(this.f1310e.getContext()));
        f();
    }
}
