package wh;

import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.util.AssertDialogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class s0 implements androidx.p000lifecycle.p, wh.a.f, mk.f.InterfaceC0430f, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zg.a f34371c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference<com.roblox.client.a> f34373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mk.f f34374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SurfaceView f34375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DisplayManager f34376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DisplayManager.DisplayListener f34377i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f34370a = t0.APP;
    public final String b = "MainScreenController";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f34372d = Boolean.FALSE;

    public class a implements DisplayManager.DisplayListener {
        public a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 != 0 || s0.this.f34376h == null) {
                return;
            }
            s0 s0Var = s0.this;
            s0Var.n(s0Var.f34376h.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34379a;

        static {
            int[] iArr = new int[androidx.lifecycle.l.a.values().length];
            f34379a = iArr;
            try {
                iArr[androidx.lifecycle.l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34379a[androidx.lifecycle.l.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34379a[androidx.lifecycle.l.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34379a[androidx.lifecycle.l.a.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34379a[androidx.lifecycle.l.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public s0(com.roblox.client.a aVar, SurfaceView surfaceView) {
        this.f34373e = new WeakReference<>(aVar);
        this.f34375g = surfaceView;
        mk.f fVar = new mk.f(aVar, surfaceView, this);
        this.f34374f = fVar;
        surfaceView.setOnTouchListener(fVar);
        surfaceView.getHolder().addCallback(this);
    }

    @Override // sg.f0
    public void I() {
    }

    @Override // sg.f0
    public boolean b() {
        return this.f34372d.booleanValue();
    }

    public final void d() {
        DisplayManager.DisplayListener displayListener;
        DisplayManager displayManager = this.f34376h;
        if (displayManager != null && (displayListener = this.f34377i) != null) {
            displayManager.unregisterDisplayListener(displayListener);
        }
        this.f34377i = null;
        this.f34376h = null;
    }

    public final void e() {
        gk.p.h("MainScreenController", "Disposing RTC audio manager.");
        zg.a aVar = this.f34371c;
        if (aVar != null) {
            aVar.a();
            this.f34371c = null;
        }
    }

    @Override // sg.f0
    public void f(boolean z10) {
        this.f34374f.H(z10);
    }

    @Override // androidx.p000lifecycle.p
    public void g(@NonNull androidx.p000lifecycle.s sVar, @NonNull androidx.lifecycle.l.a aVar) {
        gk.p.b("MainScreenController", "onStateChanged: event: " + aVar);
        int i10 = b.f34379a[aVar.ordinal()];
        if (i10 == 1) {
            i((j.b) sVar);
            h();
            if (!th.h.a().J3() || vi.b.n()) {
                return;
            }
            this.f34373e.get().getWindow().setFlags(8192, 8192);
            return;
        }
        if (i10 == 2) {
            this.f34374f.H(false);
            sg.y.h().k().k("POST_NOTIFICATIONS", jj.t.g());
            sg.y.h().k().k("MEDIA_PICKER", wi.a.e());
            if (th.h.a().a4() && AssertDialogUtil.b()) {
                AssertDialogUtil.c(this.f34373e.get());
                return;
            }
            return;
        }
        if (i10 == 3) {
            this.f34374f.I();
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
        sg.y.h().k().Y("POST_NOTIFICATIONS");
        sg.y.h().k().Y("MEDIA_PICKER");
        if (th.h.a().a4() && AssertDialogUtil.b()) {
            AssertDialogUtil.c(null);
        }
    }

    public final void h() {
        com.roblox.client.a aVar = this.f34373e.get();
        if (aVar == null) {
            return;
        }
        DisplayManager displayManager = (DisplayManager) aVar.getApplicationContext().getSystemService("display");
        this.f34376h = displayManager;
        if (displayManager == null) {
            return;
        }
        a aVar2 = new a();
        this.f34377i = aVar2;
        this.f34376h.registerDisplayListener(aVar2, null);
        Display display = this.f34376h.getDisplay(0);
        if (display == null) {
            return;
        }
        n(display);
        NativeGLInterface.nativePassSupportedRefreshRates(el.a.k(display));
    }

    public final void i(j.b bVar) {
        gk.p.h("MainScreenController", "Initializing RTC audio manager.");
        zg.a aVarC = sg.y.h().c(bVar.getApplicationContext());
        this.f34371c = aVarC;
        if (aVarC != null) {
            aVarC.b(bVar);
        }
    }

    public void j(int i10) {
        if (this.f34370a == t0.EXPERIENCE) {
            gk.p.h("MainScreenController", "Handling onTrimMemory level: " + i10);
            if (i10 == 15) {
                gk.p.k("MainScreenController", "TRIM_MEMORY_RUNNING_CRITICAL: notify the engine...");
                NativeGLInterface.nativeAppBridgeV2OnLowMemory();
            }
        }
        RobloxApplication.g("MainScreenController", this.f34370a, i10);
        NativeGLInterface.nativeAppBridgeV2OnLowMemoryForRenderView(this.f34370a.ordinal(), i10);
    }

    public void k(t0 t0Var) {
        gk.p.h("MainScreenController", "Roblox has entered " + t0Var.name() + " mode.");
        this.f34370a = t0Var;
    }

    @Override // sg.f0
    public void l() {
        this.f34374f.I();
    }

    public final void n(Display display) {
        if (this.f34373e.get() == null) {
            return;
        }
        NativeGLInterface.nativePassCurrentDisplayRefreshRate(el.a.a(display));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        gk.p.h("MainScreenController", "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        gk.p.h("MainScreenController", "surfaceCreated");
        this.f34372d = Boolean.TRUE;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        gk.p.h("MainScreenController", "surfaceDestroyed");
        this.f34372d = Boolean.FALSE;
    }
}
