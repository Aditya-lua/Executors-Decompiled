package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import com.roblox.engine.jni.RunOnMainEngineJavaCallback;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.roblox.platform.util.DeviceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class a extends bh.x0 implements SurfaceHolder.Callback, uk.f.InterfaceC0678f, View.OnClickListener, mj.a {
    public g I0;
    public SurfaceView J0;
    public View K0;
    public View L0;
    public vk.a M0;
    public ViewTreeObserver.OnGlobalLayoutListener N0;
    public x0 P0;
    public boolean Q0;
    public IAPPurchaseManager R0;
    public f S0;
    public d T0;
    public y0 U0;
    public final String H0 = "AppShellFragment";
    public Handler O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ei.a$a, reason: collision with other inner class name */
    public class C0262a extends vk.a {
        public C0262a(Context context, vk.a.C0702a c0702a) {
            super(context, c0702a);
        }

        @Override // vk.a
        public vk.b b() {
            f4.v vVarP = a.this.p();
            if (vVarP == null) {
                return null;
            }
            ui.a aVarG1 = ((com.roblox.client.a) vVarP).G1();
            return vk.b.c(a.this.J0.getRootView(), vVarP.getWindowManager(), a.this.K0, aVarG1.d(), bi.h.a().B5(), aVarG1.f(), aVarG1.b());
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!a.this.p0()) {
                ok.q.k("AppShellFragment", "onGlobalLayout() fragment not attached");
                return;
            }
            a.this.M0.d(false);
            if (a.this.p() != null) {
                View viewFindViewById = a.this.p().findViewById(bh.m0.f4136e);
                if (viewFindViewById == null) {
                    ok.q.e("AppShellFragment", "Surface view not found! Cannot reset its layout.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams.width == -1 && layoutParams.height == -1) {
                    return;
                }
                ok.q.h("AppShellFragment", "Resetting surface container's layout.");
                layoutParams.width = -1;
                layoutParams.height = -1;
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
    }

    public class c implements n.a {
        @Override // ei.n.a
        public void c(String str) {
            ok.q.b("AppShellFragment", "onAppReady() " + str);
            if (a.this.I0 != null) {
                a.this.I0.c(str);
            }
        }

        public c() {
        }
    }

    public class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnAppBridgeNotificationListener f13672a;

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void b(long j10) {
            if (a.this.M0 != null) {
                a.this.M0.d(true);
            }
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void e(String str) {
            if (a.this.S0 != null) {
                a.this.S0.f(true);
            }
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void f(String str, String str2) {
            if (this.f13672a == null) {
                this.f13672a = bh.y.h().a(new c(), new e());
            }
            this.f13672a.a(str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void i(String str, String str2) {
            bh.q.f(a.this.p(), str2, str);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void j(long j10, String str) {
            a.this.R0.F(j10, str);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void k(long j10, String str, String str2) {
            a.this.R0.G(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void l(long j10, String str, NativePurchaseContext nativePurchaseContext) {
            a.this.R0.H(j10, str, nativePurchaseContext);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void m(long j10, String str, String str2) {
            a.this.R0.I(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void n(long j10, String str, String str2) {
            a.this.R0.J(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void o(long j10, String str, String str2, String str3) {
            a.this.R0.K(j10, str, str2, str3);
        }

        @Override // ei.k
        public x0 s() {
            return a.this.P0;
        }

        public void w() {
            if (this.f13672a == null) {
                this.f13672a = bh.y.h().a(new c(), new e());
            }
            ((n) this.f13672a).g();
        }

        public d() {
        }
    }

    public class e implements n.b {
        @Override // ei.n.b
        public bh.x0 a() {
            return a.this;
        }

        public e() {
        }
    }

    public interface f extends bh.f0 {
    }

    public interface g {
        void Z();

        void c(String str);
    }

    public a() {
        d dVar = new d();
        ei.f.j().D(new RunOnMainEngineJavaCallback(this.O0, dVar));
        this.R0 = new IAPPurchaseManager(this, false);
        this.T0 = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f4.q
    public void B0(@NonNull Activity activity) {
        super.B0(activity);
        if (activity instanceof f) {
            this.S0 = (f) activity;
        } else {
            ok.q.e("AppShellFragment", "Error: AppShellFragment cannot find the listener!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f4.o, f4.q
    public void C0(@NonNull Context context) {
        super.C0(context);
        if (context instanceof g) {
            this.I0 = (g) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // bh.x0, f4.o, f4.q
    public void F0(Bundle bundle) {
        if (ik.k0.B()) {
            ok.q.h("AppShellFragment", "onCreate: App was previously destroyed due to process death");
            super.F0(bundle);
        } else {
            super.F0(bundle);
            ok.q.h("AppShellFragment", "onCreate:");
            ei.f.j().F(v());
            ei.f.j().k(bh.a1.E0() ? p.b(v(), p()) : p.a(v()));
        }
    }

    public final vk.a.C0702a H2() {
        vk.a.C0702a c0702a = new vk.a.C0702a();
        TypedValue typedValue = new TypedValue();
        S().getValue(bh.k0.f4096c, typedValue, true);
        c0702a.f34406a = (int) TypedValue.complexToFloat(typedValue.data);
        return c0702a;
    }

    public Surface I2() {
        if (this.Q0) {
            return this.J0.getHolder().getSurface();
        }
        return null;
    }

    @Override // f4.q
    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ok.q.h("AppShellFragment", "onCreateView:");
        M2(null);
        K2(null);
        L2();
        boolean zB = this.S0.b();
        this.Q0 = zB;
        if (zB) {
            P2();
        }
        if (!bi.h.a().O0() && !bi.h.a().J4()) {
            View viewFindViewById = p().findViewById(bh.m0.f4143h0);
            this.L0 = viewFindViewById;
            viewFindViewById.findViewById(bh.m0.f4141g0).setOnClickListener(this);
            if (ei.f.j().m()) {
                this.J0.setVisibility(0);
            } else {
                this.L0.setVisibility(0);
            }
        } else if (ei.f.j().m()) {
            this.J0.setVisibility(0);
        } else {
            J2();
            this.L0.setVisibility(0);
        }
        return null;
    }

    public final void J2() {
        ViewStub viewStub;
        if (this.L0 != null || (viewStub = (ViewStub) p().findViewById(bh.m0.f4145i0)) == null) {
            return;
        }
        View viewInflate = viewStub.inflate();
        this.L0 = viewInflate;
        viewInflate.findViewById(bh.m0.f4141g0).setOnClickListener(this);
    }

    @Override // f4.q
    public void K0() {
        if (ik.k0.B()) {
            ok.q.h("AppShellFragment", "onDestroy: App was previously destroyed due to process death");
            super.K0();
        } else {
            super.K0();
            ok.q.h("AppShellFragment", "onDestroy()");
            this.J0.getHolder().removeCallback(this);
        }
    }

    public final void K2(View view) {
        ViewStub viewStub;
        if (bi.h.a().O0() && (viewStub = (ViewStub) p().findViewById(bh.m0.S)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) p().findViewById(bh.m0.G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setLayoutParams((FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams());
        rbxKeyboard.setBackgroundColor(0);
        nh.e.d(rbxKeyboard, v(), "SourceSansPro-Regular.ttf");
        this.P0 = new r0(rbxKeyboard);
    }

    public final void L2() {
        this.M0 = new C0262a(v(), H2());
        this.N0 = new b();
        this.J0.getViewTreeObserver().addOnGlobalLayoutListener(this.N0);
    }

    @Override // f4.o, f4.q
    public void M0() {
        super.M0();
        ok.q.b("AppShellFragment", "onDestroyView()");
        this.J0.getViewTreeObserver().removeOnGlobalLayoutListener(this.N0);
    }

    public final void M2(View view) {
        ok.q.b("AppShellFragment", "initSurfaceView()");
        SurfaceView surfaceView = (SurfaceView) p().findViewById(bh.m0.f4149k0);
        this.J0 = surfaceView;
        surfaceView.setFocusable(true);
        this.J0.setFocusableInTouchMode(true);
        this.J0.getHolder().addCallback(this);
    }

    @Override // f4.o, f4.q
    public void N0() {
        super.N0();
        this.S0 = null;
    }

    public final void N2() {
        ok.q.b("AppShellFragment", "loadSettings()");
        View view = this.L0;
        if (view != null) {
            view.setVisibility(8);
        }
        ei.f.j().k(bh.a1.E0() ? p.b(v(), p()) : p.a(v()));
        this.J0.setVisibility(0);
    }

    public final void O2() {
        f4.v vVarP;
        Window window;
        if (Build.VERSION.SDK_INT < 28 || (vVarP = p()) == null || (window = vVarP.getWindow()) == null) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        com.roblox.client.a aVar = (com.roblox.client.a) vVarP;
        aVar.G1().g(window.getDecorView());
        if (this.U0 == null) {
            this.U0 = new y0(vVarP);
        }
        this.U0.i(aVar, aVar.G1().a());
    }

    @Override // f4.q
    public void P0(boolean z10) {
        super.P0(z10);
        ok.q.b("AppShellFragment", "onHiddenChanged() hidden:" + z10);
        if (z10) {
            ei.f.j().t();
            return;
        }
        if (this.Q0) {
            ei.f.j().G(this.J0.getHolder().getSurface());
            return;
        }
        ok.q.b("AppShellFragment", "onHiddenChanged() surface not yet created - show surface");
        this.J0.setVisibility(0);
        View view = this.L0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void P2() {
        ei.f.d dVarI;
        if (bh.a1.E0() && (dVarI = ei.f.j().i()) != null) {
            dVarI.f13698a = p();
        }
        ei.f.j().G(this.J0.getHolder().getSurface());
        g gVar = this.I0;
        if (gVar != null) {
            gVar.Z();
        }
    }

    @Override // bh.x0, mj.a
    public void T(int i10) {
        com.roblox.client.b bVar = (com.roblox.client.b) p();
        if (bVar != null) {
            bVar.T(i10);
        }
    }

    @Override // bh.x0, mj.a
    public void V(String str) {
        com.roblox.client.b bVar = (com.roblox.client.b) p();
        if (bVar != null) {
            bVar.V(str);
        }
    }

    @Override // f4.q
    public void V0() {
        super.V0();
        f fVar = this.S0;
        if (fVar != null) {
            fVar.l();
        }
    }

    @Override // f4.q
    public void a1() {
        super.a1();
        View view = this.L0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        N2();
    }

    @Override // uk.f.InterfaceC0678f
    /* JADX INFO: renamed from: b */
    public boolean getIsSurfaceReady() {
        return this.Q0;
    }

    @Override // bh.x0, f4.o, f4.q
    public void c1() {
        super.c1();
        if (dj.h.e().f()) {
            this.T0.w();
        }
        f fVar = this.S0;
        if (fVar != null) {
            fVar.H();
        }
        ym.g.G().H(v());
        tl.a.b().d(H1());
        if (bi.h.a().Z4()) {
            O2();
        }
    }

    @Override // bh.x0, f4.o, f4.q
    public void d1() {
        super.d1();
        ok.q.h("AppShellFragment", "onStop()");
        qm.a.a().c();
        ym.g.G().I();
        tl.a.b().e();
    }

    @Override // mj.a
    public Activity e0() {
        return p();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != bh.m0.f4141g0 || u2()) {
            return;
        }
        N2();
    }

    @Override // mj.a
    public com.roblox.client.b q0() {
        return (com.roblox.client.b) p();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ok.q.h("AppShellFragment", "surfaceChanged()");
        if (r0()) {
            return;
        }
        float screenDensity = DeviceUtils.getScreenDensity(v());
        Point screenPhysicalSizeInMillimeters = DeviceUtils.getScreenPhysicalSizeInMillimeters(v());
        ei.f.j().I(surfaceHolder.getSurface(), screenDensity, screenPhysicalSizeInMillimeters.x, screenPhysicalSizeInMillimeters.y);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ok.q.h("AppShellFragment", "surfaceCreated()");
        this.Q0 = true;
        if (r0()) {
            return;
        }
        ok.q.h("AppShellFragment", "Start the lua app");
        P2();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ok.q.h("AppShellFragment", "surfaceDestroyed()");
        this.Q0 = false;
        ei.f.j().H();
    }

    @Override // bh.x0, f4.o, f4.q
    public void z0(Bundle bundle) {
        super.z0(bundle);
        this.K0 = p().findViewById(bh.m0.f4144i);
    }
}
