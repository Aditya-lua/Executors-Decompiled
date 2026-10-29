package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.C0508e;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p261l2.C7975b;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;

/* JADX INFO: renamed from: androidx.camera.view.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0508e extends AbstractC0506c {

    /* JADX INFO: renamed from: e */
    public TextureView f1903e;

    /* JADX INFO: renamed from: f */
    public SurfaceTexture f1904f;

    /* JADX INFO: renamed from: g */
    public InterfaceFutureC9440x<C5948v2.g> f1905g;

    /* JADX INFO: renamed from: h */
    public C5948v2 f1906h;

    /* JADX INFO: renamed from: i */
    public boolean f1907i;

    /* JADX INFO: renamed from: j */
    public SurfaceTexture f1908j;

    /* JADX INFO: renamed from: k */
    public AtomicReference<C12997c.a<Void>> f1909k;

    /* JADX INFO: renamed from: l */
    public AbstractC0506c.a f1910l;

    /* JADX INFO: renamed from: m */
    public Executor f1911m;

    /* JADX INFO: renamed from: androidx.camera.view.e$a */
    public class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: androidx.camera.view.e$a$a, reason: collision with other inner class name */
        public class C14069a implements InterfaceC10762c<C5948v2.g> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ SurfaceTexture f1913a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public C14069a(SurfaceTexture surfaceTexture) {
                this.f1913a = surfaceTexture;
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            @Override // p397r0.InterfaceC10762c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(C5948v2.g gVar) {
                C12637g.m47078j(gVar.mo26499a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C5931r1.m26561a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f1913a.release();
                C0508e c0508e = C0508e.this;
                if (c0508e.f1908j != null) {
                    c0508e.f1908j = null;
                }
            }

            @Override // p397r0.InterfaceC10762c
            public void onFailure(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }
        }

        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            C5931r1.m26561a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            C0508e c0508e = C0508e.this;
            c0508e.f1904f = surfaceTexture;
            if (c0508e.f1905g == null) {
                c0508e.m2422q();
                return;
            }
            C12637g.m47075g(c0508e.f1906h);
            C5931r1.m26561a("TextureViewImpl", "Surface invalidated " + C0508e.this.f1906h);
            C0508e.this.f1906h.m26652n().mo35430d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C0508e c0508e = C0508e.this;
            c0508e.f1904f = null;
            InterfaceFutureC9440x<C5948v2.g> interfaceFutureC9440x = c0508e.f1905g;
            if (interfaceFutureC9440x == null) {
                C5931r1.m26561a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            C10773n.m40987j(interfaceFutureC9440x, new C14069a(surfaceTexture), C7975b.m33011i(C0508e.this.f1903e.getContext()));
            C0508e.this.f1908j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C5931r1.m26561a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C12997c.a<Void> andSet = C0508e.this.f1909k.getAndSet(null);
            if (andSet != null) {
                andSet.m48314c(null);
            }
            C0508e.this.getClass();
            Executor executor = C0508e.this.f1911m;
        }
    }

    public C0508e(FrameLayout frameLayout, C0505b c0505b) {
        super(frameLayout, c0505b);
        this.f1907i = false;
        this.f1909k = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m2415j(C0508e c0508e, Surface surface, final C12997c.a aVar) {
        c0508e.getClass();
        C5931r1.m26561a("TextureViewImpl", "Surface set on Preview.");
        C5948v2 c5948v2 = c0508e.f1906h;
        Executor executorM40081b = C10417c.m40081b();
        Objects.requireNonNull(aVar);
        c5948v2.m26661w(surface, executorM40081b, new InterfaceC12631a() { // from class: p1.p0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                aVar.m48314c((C5948v2.g) obj);
            }
        });
        return "provideSurface[request=" + c0508e.f1906h + " surface=" + surface + "]";
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2416k(C0508e c0508e, Surface surface, InterfaceFutureC9440x interfaceFutureC9440x, C5948v2 c5948v2) {
        c0508e.getClass();
        C5931r1.m26561a("TextureViewImpl", "Safe to release surface.");
        c0508e.m2420o();
        surface.release();
        if (c0508e.f1905g == interfaceFutureC9440x) {
            c0508e.f1905g = null;
        }
        if (c0508e.f1906h == c5948v2) {
            c0508e.f1906h = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2417l(C0508e c0508e, C5948v2 c5948v2) {
        C5948v2 c5948v3 = c0508e.f1906h;
        if (c5948v3 != null && c5948v3 == c5948v2) {
            c0508e.f1906h = null;
            c0508e.f1905g = null;
        }
        c0508e.m2420o();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m2418m(C0508e c0508e, C12997c.a aVar) {
        c0508e.f1909k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: b */
    public View mo2395b() {
        return this.f1903e;
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: c */
    public Bitmap mo2396c() {
        TextureView textureView = this.f1903e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f1903e.getBitmap();
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: d */
    public void mo2397d() {
        m2421p();
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: e */
    public void mo2398e() {
        this.f1907i = true;
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: g */
    public void mo2400g(final C5948v2 c5948v2, AbstractC0506c.a aVar) {
        this.f1889a = c5948v2.m26655q();
        m2419n();
        C5948v2 c5948v3 = this.f1906h;
        if (c5948v3 != null && c5948v3.m26664z()) {
            m2420o();
        }
        this.f1906h = c5948v2;
        this.f1910l = aVar;
        c5948v2.m26649k(C7975b.m33011i(this.f1903e.getContext()), new Runnable() { // from class: p1.l0
            @Override // java.lang.Runnable
            public final void run() {
                C0508e.m2417l(this.f36484a, c5948v2);
            }
        });
        m2422q();
    }

    @Override // androidx.camera.view.AbstractC0506c
    /* JADX INFO: renamed from: i */
    public InterfaceFutureC9440x<Void> mo2402i() {
        return C12997c.m48311a(new C12997c.c() { // from class: p1.m0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C0508e.m2418m(this.f36488a, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m2419n() {
        C12637g.m47075g(this.f1890b);
        C12637g.m47075g(this.f1889a);
        TextureView textureView = new TextureView(this.f1890b.getContext());
        this.f1903e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f1889a.getWidth(), this.f1889a.getHeight()));
        this.f1903e.setSurfaceTextureListener(new a());
        this.f1890b.removeAllViews();
        this.f1890b.addView(this.f1903e);
    }

    /* JADX INFO: renamed from: o */
    public final void m2420o() {
        AbstractC0506c.a aVar = this.f1910l;
        if (aVar != null) {
            aVar.mo2403a();
            this.f1910l = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2421p() {
        if (!this.f1907i || this.f1908j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f1903e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f1908j;
        if (surfaceTexture != surfaceTexture2) {
            this.f1903e.setSurfaceTexture(surfaceTexture2);
            this.f1908j = null;
            this.f1907i = false;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2422q() {
        SurfaceTexture surfaceTexture;
        Size size = this.f1889a;
        if (size == null || (surfaceTexture = this.f1904f) == null || this.f1906h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f1889a.getHeight());
        final Surface surface = new Surface(this.f1904f);
        final C5948v2 c5948v2 = this.f1906h;
        final InterfaceFutureC9440x<C5948v2.g> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: p1.n0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C0508e.m2415j(this.f36490a, surface, aVar);
            }
        });
        this.f1905g = interfaceFutureC9440xM48311a;
        interfaceFutureC9440xM48311a.mo37173a(new Runnable() { // from class: p1.o0
            @Override // java.lang.Runnable
            public final void run() {
                C0508e.m2416k(this.f36493a, surface, interfaceFutureC9440xM48311a, c5948v2);
            }
        }, C7975b.m33011i(this.f1903e.getContext()));
        m2399f();
    }
}
