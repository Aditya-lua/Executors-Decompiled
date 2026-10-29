package p517wh;

import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.util.AssertDialogUtil;
import java.lang.ref.WeakReference;
import mk.ViewOnTouchListenerC8572f;
import p107el.C5160a;
import p151gk.C6124q;
import p203j.ActivityC6992b;
import p222jj.C7195t;
import p518wi.C12475a;
import p604zg.InterfaceC13810a;
import sg.C11370y;
import th.C11659h;
import vi.C12211b;

/* JADX INFO: renamed from: wh.s0 */
/* JADX INFO: loaded from: classes2.dex */
public class SurfaceHolderCallbackC12460s0 implements InterfaceC0974p, SurfaceHolderCallbackC12423a.f, ViewOnTouchListenerC8572f.f, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: c */
    public InterfaceC13810a f44565c;

    /* JADX INFO: renamed from: e */
    public final WeakReference<AbstractActivityC3152a> f44567e;

    /* JADX INFO: renamed from: f */
    public final ViewOnTouchListenerC8572f f44568f;

    /* JADX INFO: renamed from: g */
    public final SurfaceView f44569g;

    /* JADX INFO: renamed from: h */
    public DisplayManager f44570h;

    /* JADX INFO: renamed from: i */
    public DisplayManager.DisplayListener f44571i;

    /* JADX INFO: renamed from: a */
    public EnumC12462t0 f44563a = EnumC12462t0.APP;

    /* JADX INFO: renamed from: b */
    public final String f44564b = "MainScreenController";

    /* JADX INFO: renamed from: d */
    public Boolean f44566d = Boolean.FALSE;

    /* JADX INFO: renamed from: wh.s0$a */
    public class a implements DisplayManager.DisplayListener {
        public a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 != 0 || SurfaceHolderCallbackC12460s0.this.f44570h == null) {
                return;
            }
            SurfaceHolderCallbackC12460s0 surfaceHolderCallbackC12460s0 = SurfaceHolderCallbackC12460s0.this;
            surfaceHolderCallbackC12460s0.m46703n(surfaceHolderCallbackC12460s0.f44570h.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* JADX INFO: renamed from: wh.s0$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44573a;

        static {
            int[] iArr = new int[AbstractC0966l.a.values().length];
            f44573a = iArr;
            try {
                iArr[AbstractC0966l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44573a[AbstractC0966l.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44573a[AbstractC0966l.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44573a[AbstractC0966l.a.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44573a[AbstractC0966l.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SurfaceHolderCallbackC12460s0(AbstractActivityC3152a abstractActivityC3152a, SurfaceView surfaceView) {
        this.f44567e = new WeakReference<>(abstractActivityC3152a);
        this.f44569g = surfaceView;
        ViewOnTouchListenerC8572f viewOnTouchListenerC8572f = new ViewOnTouchListenerC8572f(abstractActivityC3152a, surfaceView, this);
        this.f44568f = viewOnTouchListenerC8572f;
        surfaceView.setOnTouchListener(viewOnTouchListenerC8572f);
        surfaceView.getHolder().addCallback(this);
    }

    @Override // sg.InterfaceC11314f0
    /* JADX INFO: renamed from: I */
    public void mo14746I() {
    }

    @Override // sg.InterfaceC11314f0
    /* JADX INFO: renamed from: b */
    public boolean mo14769b() {
        return this.f44566d.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m46697d() {
        DisplayManager.DisplayListener displayListener;
        DisplayManager displayManager = this.f44570h;
        if (displayManager != null && (displayListener = this.f44571i) != null) {
            displayManager.unregisterDisplayListener(displayListener);
        }
        this.f44571i = null;
        this.f44570h = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m46698e() {
        C6124q.m27063h("MainScreenController", "Disposing RTC audio manager.");
        InterfaceC13810a interfaceC13810a = this.f44565c;
        if (interfaceC13810a != null) {
            interfaceC13810a.mo50291a();
            this.f44565c = null;
        }
    }

    @Override // sg.InterfaceC11314f0
    /* JADX INFO: renamed from: f */
    public void mo14774f(boolean z10) {
        this.f44568f.m34556H(z10);
    }

    @Override // androidx.p616lifecycle.InterfaceC0974p
    /* JADX INFO: renamed from: g */
    public void mo1334g(@NonNull InterfaceC0980s interfaceC0980s, @NonNull AbstractC0966l.a aVar) {
        C6124q.m27057b("MainScreenController", "onStateChanged: event: " + aVar);
        int i10 = b.f44573a[aVar.ordinal()];
        if (i10 == 1) {
            m46700i((ActivityC6992b) interfaceC0980s);
            m46699h();
            if (!C11659h.m43403a().mo43505O3() || C12211b.m45202n()) {
                return;
            }
            this.f44567e.get().getWindow().setFlags(8192, 8192);
            return;
        }
        if (i10 == 2) {
            this.f44568f.m34556H(false);
            C11370y.m42581h().m42591k().m38649k("POST_NOTIFICATIONS", C7195t.m30098g());
            C11370y.m42581h().m42591k().m38649k("MEDIA_PICKER", C12475a.m46727e());
            if (C11659h.m43403a().mo43629f4() && AssertDialogUtil.m15830b()) {
                AssertDialogUtil.m15831c(this.f44567e.get());
                return;
            }
            return;
        }
        if (i10 == 3) {
            this.f44568f.m34557I();
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return;
            }
            m46698e();
            m46697d();
            return;
        }
        C11370y.m42581h().m42591k().m38642Y("POST_NOTIFICATIONS");
        C11370y.m42581h().m42591k().m38642Y("MEDIA_PICKER");
        if (C11659h.m43403a().mo43629f4() && AssertDialogUtil.m15830b()) {
            AssertDialogUtil.m15831c(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m46699h() {
        AbstractActivityC3152a abstractActivityC3152a = this.f44567e.get();
        if (abstractActivityC3152a == null) {
            return;
        }
        DisplayManager displayManager = (DisplayManager) abstractActivityC3152a.getApplicationContext().getSystemService("display");
        this.f44570h = displayManager;
        if (displayManager == null) {
            return;
        }
        a aVar = new a();
        this.f44571i = aVar;
        this.f44570h.registerDisplayListener(aVar, null);
        Display display = this.f44570h.getDisplay(0);
        if (display == null) {
            return;
        }
        m46703n(display);
        NativeGLInterface.nativePassSupportedRefreshRates(C5160a.m24007k(display));
    }

    /* JADX INFO: renamed from: i */
    public final void m46700i(ActivityC6992b activityC6992b) {
        C6124q.m27063h("MainScreenController", "Initializing RTC audio manager.");
        InterfaceC13810a interfaceC13810aM42584c = C11370y.m42581h().m42584c(activityC6992b.getApplicationContext());
        this.f44565c = interfaceC13810aM42584c;
        if (interfaceC13810aM42584c != null) {
            interfaceC13810aM42584c.mo50292b(activityC6992b);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m46701j(int i10) {
        if (this.f44563a == EnumC12462t0.EXPERIENCE) {
            C6124q.m27063h("MainScreenController", "Handling onTrimMemory level: " + i10);
            if (i10 == 15) {
                C6124q.m27066k("MainScreenController", "TRIM_MEMORY_RUNNING_CRITICAL: notify the engine...");
                NativeGLInterface.nativeAppBridgeV2OnLowMemory();
            }
        }
        RobloxApplication.m14835g("MainScreenController", this.f44563a, i10);
        NativeGLInterface.nativeAppBridgeV2OnLowMemoryForRenderView(this.f44563a.ordinal(), i10);
    }

    /* JADX INFO: renamed from: k */
    public void m46702k(EnumC12462t0 enumC12462t0) {
        C6124q.m27063h("MainScreenController", "Roblox has entered " + enumC12462t0.name() + " mode.");
        this.f44563a = enumC12462t0;
    }

    @Override // sg.InterfaceC11314f0
    /* JADX INFO: renamed from: l */
    public void mo14782l() {
        this.f44568f.m34557I();
    }

    /* JADX INFO: renamed from: n */
    public final void m46703n(Display display) {
        if (this.f44567e.get() == null) {
            return;
        }
        NativeGLInterface.nativePassCurrentDisplayRefreshRate(C5160a.m23997a(display));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C6124q.m27063h("MainScreenController", "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        C6124q.m27063h("MainScreenController", "surfaceCreated");
        this.f44566d = Boolean.TRUE;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        C6124q.m27063h("MainScreenController", "surfaceDestroyed");
        this.f44566d = Boolean.FALSE;
    }
}
