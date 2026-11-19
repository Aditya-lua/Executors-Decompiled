package ei;

import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.util.AssertDialogUtil;
import com.roblox.platform.util.DeviceUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class t0 implements androidx.p000lifecycle.p, ei.a.f, uk.f.InterfaceC0678f, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ih.a f13788c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference<com.roblox.client.a> f13790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uk.f f13791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SurfaceView f13792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DisplayManager f13793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DisplayManager.DisplayListener f13794i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0 f13787a = u0.APP;
    public final String b = "MainScreenController";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f13789d = Boolean.FALSE;

    public class a implements DisplayManager.DisplayListener {
        public a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 != 0 || t0.this.f13793h == null) {
                return;
            }
            t0 t0Var = t0.this;
            t0Var.n(t0Var.f13793h.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13796a;

        static {
            int[] iArr = new int[androidx.lifecycle.l.a.values().length];
            f13796a = iArr;
            try {
                iArr[androidx.lifecycle.l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13796a[androidx.lifecycle.l.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13796a[androidx.lifecycle.l.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13796a[androidx.lifecycle.l.a.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13796a[androidx.lifecycle.l.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public t0(com.roblox.client.a aVar, SurfaceView surfaceView) {
        this.f13790e = new WeakReference<>(aVar);
        this.f13792g = surfaceView;
        uk.f fVar = new uk.f(aVar, surfaceView, this);
        this.f13791f = fVar;
        surfaceView.setOnTouchListener(fVar);
        surfaceView.getHolder().addCallback(this);
    }

    @Override // bh.f0
    public void H() {
    }

    @Override // bh.f0
    public boolean b() {
        return this.f13789d.booleanValue();
    }

    public final void d() {
        DisplayManager.DisplayListener displayListener;
        DisplayManager displayManager = this.f13793h;
        if (displayManager != null && (displayListener = this.f13794i) != null) {
            displayManager.unregisterDisplayListener(displayListener);
        }
        this.f13794i = null;
        this.f13793h = null;
    }

    public final void e() {
        ok.q.h("MainScreenController", "Disposing RTC audio manager.");
        ih.a aVar = this.f13788c;
        if (aVar != null) {
            aVar.a();
            this.f13788c = null;
        }
    }

    @Override // bh.f0
    public void f(boolean z10) {
        this.f13791f.H(z10);
    }

    @Override // androidx.p000lifecycle.p
    public void g(@NonNull androidx.p000lifecycle.s sVar, @NonNull androidx.lifecycle.l.a aVar) {
        ok.q.b("MainScreenController", "onStateChanged: event: " + aVar);
        int i10 = b.f13796a[aVar.ordinal()];
        if (i10 == 1) {
            i((j.b) sVar);
            h();
            if (!bi.h.a().Y3() || dj.b.m()) {
                return;
            }
            this.f13790e.get().getWindow().setFlags(8192, 8192);
            return;
        }
        if (i10 == 2) {
            this.f13791f.H(false);
            bh.y.h().k().c("POST_NOTIFICATIONS", rj.t.g());
            bh.y.h().k().c("MEDIA_PICKER", ej.a.e());
            if (bi.h.a().o4() && AssertDialogUtil.b()) {
                AssertDialogUtil.c(this.f13790e.get());
                return;
            }
            return;
        }
        if (i10 == 3) {
            this.f13791f.I();
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return;
            }
            e();
            d();
            return;
        }
        bh.y.h().k().N("POST_NOTIFICATIONS");
        bh.y.h().k().N("MEDIA_PICKER");
        if (bi.h.a().o4() && AssertDialogUtil.b()) {
            AssertDialogUtil.c(null);
        }
    }

    public final void h() {
        com.roblox.client.a aVar = this.f13790e.get();
        if (aVar == null) {
            return;
        }
        DisplayManager displayManager = (DisplayManager) aVar.getApplicationContext().getSystemService("display");
        this.f13793h = displayManager;
        if (displayManager == null) {
            return;
        }
        a aVar2 = new a();
        this.f13794i = aVar2;
        this.f13793h.registerDisplayListener(aVar2, null);
        Display display = this.f13793h.getDisplay(0);
        if (display == null) {
            return;
        }
        n(display);
        NativeGLInterface.nativePassSupportedRefreshRates(DeviceUtils.getSupportedRefreshRates(display));
    }

    public final void i(j.b bVar) {
        ok.q.h("MainScreenController", "Initializing RTC audio manager.");
        ih.a aVarC = bh.y.h().c(bVar.getApplicationContext());
        this.f13788c = aVarC;
        if (aVarC != null) {
            aVarC.b(bVar);
        }
    }

    public void j(int i10) {
        if (this.f13787a == u0.EXPERIENCE) {
            ok.q.h("MainScreenController", "Handling onTrimMemory level: " + i10);
            if (i10 == 15) {
                ok.q.k("MainScreenController", "TRIM_MEMORY_RUNNING_CRITICAL: notify the engine...");
                NativeGLInterface.nativeAppBridgeV2OnLowMemory();
            }
        }
        RobloxApplication.g("MainScreenController", this.f13787a, i10);
        NativeGLInterface.nativeAppBridgeV2OnLowMemoryForRenderView(this.f13787a.ordinal(), i10);
    }

    public void k(u0 u0Var) {
        ok.q.h("MainScreenController", "Roblox has entered " + u0Var.name() + " mode.");
        this.f13787a = u0Var;
    }

    @Override // bh.f0
    public void l() {
        this.f13791f.I();
    }

    public final void n(Display display) {
        if (this.f13790e.get() == null) {
            return;
        }
        NativeGLInterface.nativePassCurrentDisplayRefreshRate(DeviceUtils.getCurrentRefreshRate(display));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ok.q.h("MainScreenController", "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        ok.q.h("MainScreenController", "surfaceCreated");
        this.f13789d = Boolean.TRUE;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        ok.q.h("MainScreenController", "surfaceDestroyed");
        this.f13789d = Boolean.FALSE;
    }
}
