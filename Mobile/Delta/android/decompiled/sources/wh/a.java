package wh;

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
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class a extends sg.x0 implements SurfaceHolder.Callback, mk.f.InterfaceC0430f, View.OnClickListener, ej.a {
    public g I0;
    public SurfaceView J0;
    public View K0;
    public View L0;
    public nk.a M0;
    public ViewTreeObserver.OnGlobalLayoutListener N0;
    public w0 P0;
    public boolean Q0;
    public IAPPurchaseManager R0;
    public f S0;
    public d T0;
    public x0 U0;
    public final String H0 = "AppShellFragment";
    public Handler O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: wh.a$a, reason: collision with other inner class name */
    public class C0627a extends nk.a {
        public C0627a(Context context, nk.a.C0444a c0444a) {
            super(context, c0444a);
        }

        @Override // nk.a
        public nk.b b() {
            e4.q qVarP = a.this.p();
            if (qVarP != null) {
                return nk.b.a(a.this.J0.getRootView(), qVarP.getWindowManager(), a.this.K0, ((com.roblox.client.a) a.this.p()).G1().c());
            }
            return null;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!a.this.p0()) {
                gk.p.k("AppShellFragment", "onGlobalLayout() fragment not attached");
                return;
            }
            a.this.M0.d(false);
            if (a.this.p() != null) {
                View viewFindViewById = a.this.p().findViewById(sg.m0.f30832e);
                if (viewFindViewById == null) {
                    gk.p.e("AppShellFragment", "Surface view not found! Cannot reset its layout.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams.width == -1 && layoutParams.height == -1) {
                    return;
                }
                gk.p.h("AppShellFragment", "Resetting surface container's layout.");
                layoutParams.width = -1;
                layoutParams.height = -1;
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
    }

    public class c implements n.a {
        @Override // wh.n.a
        public void c(String str) {
            gk.p.b("AppShellFragment", "onAppReady() " + str);
            if (a.this.I0 != null) {
                a.this.I0.c(str);
            }
        }

        public c() {
        }
    }

    public class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnAppBridgeNotificationListener f34259a;

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
            if (this.f34259a == null) {
                this.f34259a = sg.y.h().a(new c(), new e());
            }
            this.f34259a.a(str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void i(String str, String str2) {
            sg.q.f(a.this.p(), str2, str);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void j(long j10, String str) {
            a.this.R0.y(j10, str);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void k(long j10, String str, String str2) {
            a.this.R0.z(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void l(long j10, String str, String str2) {
            a.this.R0.A(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void m(long j10, String str, String str2) {
            a.this.R0.B(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void n(long j10, String str, String str2, String str3) {
            a.this.R0.C(j10, str, str2, str3);
        }

        @Override // wh.k
        public w0 r() {
            return a.this.P0;
        }

        public void v() {
            if (this.f34259a == null) {
                this.f34259a = sg.y.h().a(new c(), new e());
            }
            ((n) this.f34259a).g();
        }

        public d() {
        }
    }

    public class e implements n.b {
        @Override // wh.n.b
        public sg.x0 a() {
            return a.this;
        }

        public e() {
        }
    }

    public interface f extends sg.f0 {
    }

    public interface g {
        void a0();

        void c(String str);
    }

    public a() {
        d dVar = new d();
        wh.f.j().D(new RunOnMainEngineJavaCallback(this.O0, dVar));
        this.R0 = new IAPPurchaseManager(this, false);
        this.T0 = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.c
    public void B0(@NonNull Activity activity) {
        super.B0(activity);
        if (activity instanceof f) {
            this.S0 = (f) activity;
        } else {
            gk.p.e("AppShellFragment", "Error: AppShellFragment cannot find the listener!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e4.k, androidx.fragment.app.c
    public void C0(@NonNull Context context) {
        super.C0(context);
        if (context instanceof g) {
            this.I0 = (g) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // sg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        if (ak.k0.B()) {
            gk.p.h("AppShellFragment", "onCreate: App was previously destroyed due to process death");
            super.F0(bundle);
        } else {
            super.F0(bundle);
            gk.p.h("AppShellFragment", "onCreate:");
            wh.f.j().F(x());
            wh.f.j().k(a1.D0() ? p.b(x(), p()) : p.a(x()));
        }
    }

    public final nk.a.C0444a H2() {
        nk.a.C0444a c0444a = new nk.a.C0444a();
        TypedValue typedValue = new TypedValue();
        T().getValue(sg.k0.f30792c, typedValue, true);
        c0444a.f26290a = (int) TypedValue.complexToFloat(typedValue.data);
        return c0444a;
    }

    public Surface I2() {
        if (this.Q0) {
            return this.J0.getHolder().getSurface();
        }
        return null;
    }

    @Override // androidx.fragment.app.c
    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gk.p.h("AppShellFragment", "onCreateView:");
        M2(null);
        K2(null);
        L2();
        boolean zB = this.S0.b();
        this.Q0 = zB;
        if (zB) {
            P2();
        }
        if (!th.h.a().G0() && !th.h.a().w4()) {
            View viewFindViewById = p().findViewById(sg.m0.f30833e0);
            this.L0 = viewFindViewById;
            viewFindViewById.findViewById(sg.m0.f30831d0).setOnClickListener(this);
            if (wh.f.j().m()) {
                this.J0.setVisibility(0);
            } else {
                this.L0.setVisibility(0);
            }
        } else if (wh.f.j().m()) {
            this.J0.setVisibility(0);
        } else {
            J2();
            this.L0.setVisibility(0);
        }
        return null;
    }

    public final void J2() {
        ViewStub viewStub;
        if (this.L0 != null || (viewStub = (ViewStub) p().findViewById(sg.m0.f30835f0)) == null) {
            return;
        }
        View viewInflate = viewStub.inflate();
        this.L0 = viewInflate;
        viewInflate.findViewById(sg.m0.f30831d0).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.c
    public void K0() {
        if (ak.k0.B()) {
            gk.p.h("AppShellFragment", "onDestroy: App was previously destroyed due to process death");
            super.K0();
        } else {
            super.K0();
            gk.p.h("AppShellFragment", "onDestroy()");
            this.J0.getHolder().removeCallback(this);
        }
    }

    public final void K2(View view) {
        ViewStub viewStub;
        if (th.h.a().G0() && (viewStub = (ViewStub) p().findViewById(sg.m0.R)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) p().findViewById(sg.m0.G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setLayoutParams((FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams());
        rbxKeyboard.setBackgroundColor(0);
        eh.e.d(rbxKeyboard, x(), "SourceSansPro-Regular.ttf");
        this.P0 = new q0(rbxKeyboard);
    }

    public final void L2() {
        this.M0 = new C0627a(x(), H2());
        this.N0 = new b();
        this.J0.getViewTreeObserver().addOnGlobalLayoutListener(this.N0);
    }

    @Override // e4.k, androidx.fragment.app.c
    public void M0() {
        super.M0();
        gk.p.b("AppShellFragment", "onDestroyView()");
        this.J0.getViewTreeObserver().removeOnGlobalLayoutListener(this.N0);
    }

    public final void M2(View view) {
        gk.p.b("AppShellFragment", "initSurfaceView()");
        SurfaceView surfaceView = (SurfaceView) p().findViewById(sg.m0.f30839h0);
        this.J0 = surfaceView;
        surfaceView.setFocusable(true);
        this.J0.setFocusableInTouchMode(true);
        this.J0.getHolder().addCallback(this);
    }

    @Override // e4.k, androidx.fragment.app.c
    public void N0() {
        super.N0();
        this.S0 = null;
    }

    public final void N2() {
        gk.p.b("AppShellFragment", "loadSettings()");
        View view = this.L0;
        if (view != null) {
            view.setVisibility(8);
        }
        wh.f.j().k(a1.D0() ? p.b(x(), p()) : p.a(x()));
        this.J0.setVisibility(0);
    }

    public final void O2() {
        e4.q qVarP;
        Window window;
        if (Build.VERSION.SDK_INT < 28 || (qVarP = p()) == null || (window = qVarP.getWindow()) == null) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        com.roblox.client.a aVar = (com.roblox.client.a) qVarP;
        aVar.G1().e(window.getDecorView());
        if (this.U0 == null) {
            this.U0 = new x0(qVarP);
        }
        this.U0.i(aVar, aVar.G1().a());
    }

    @Override // androidx.fragment.app.c
    public void P0(boolean z10) {
        super.P0(z10);
        gk.p.b("AppShellFragment", "onHiddenChanged() hidden:" + z10);
        if (z10) {
            wh.f.j().t();
            return;
        }
        if (this.Q0) {
            wh.f.j().G(this.J0.getHolder().getSurface());
            return;
        }
        gk.p.b("AppShellFragment", "onHiddenChanged() surface not yet created - show surface");
        this.J0.setVisibility(0);
        View view = this.L0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void P2() {
        wh.f.d dVarI;
        if (a1.D0() && (dVarI = wh.f.j().i()) != null) {
            dVarI.f34283a = p();
        }
        wh.f.j().G(this.J0.getHolder().getSurface());
        g gVar = this.I0;
        if (gVar != null) {
            gVar.a0();
        }
    }

    @Override // sg.x0, ej.a
    public void U(int i10) {
        com.roblox.client.b bVar = (com.roblox.client.b) p();
        if (bVar != null) {
            bVar.U(i10);
        }
    }

    @Override // androidx.fragment.app.c
    public void V0() {
        super.V0();
        f fVar = this.S0;
        if (fVar != null) {
            fVar.l();
        }
    }

    @Override // sg.x0, ej.a
    public void W(String str) {
        com.roblox.client.b bVar = (com.roblox.client.b) p();
        if (bVar != null) {
            bVar.W(str);
        }
    }

    @Override // androidx.fragment.app.c
    public void a1() {
        super.a1();
        View view = this.L0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        N2();
    }

    @Override // mk.f.InterfaceC0430f
    /* JADX INFO: renamed from: b */
    public boolean getIsSurfaceReady() {
        return this.Q0;
    }

    @Override // sg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        if (vi.h.e().f()) {
            this.T0.v();
        }
        f fVar = this.S0;
        if (fVar != null) {
            fVar.I();
        }
        km.f.v().w(x());
        gl.a.b().d(H1());
        if (th.h.a().M4()) {
            O2();
        }
    }

    @Override // sg.x0, e4.k, androidx.fragment.app.c
    public void d1() {
        super.d1();
        gk.p.h("AppShellFragment", "onStop()");
        cm.a.a().c();
        km.f.v().x();
        gl.a.b().e();
    }

    @Override // ej.a
    public Activity f0() {
        return p();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != sg.m0.f30831d0 || u2()) {
            return;
        }
        N2();
    }

    @Override // ej.a
    public com.roblox.client.b q0() {
        return (com.roblox.client.b) p();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        gk.p.h("AppShellFragment", "surfaceChanged()");
        if (r0()) {
            return;
        }
        float fE = el.a.e(x());
        Point pointI = el.a.i(x());
        wh.f.j().I(surfaceHolder.getSurface(), fE, pointI.x, pointI.y);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        gk.p.h("AppShellFragment", "surfaceCreated()");
        this.Q0 = true;
        if (r0()) {
            return;
        }
        gk.p.h("AppShellFragment", "Start the lua app");
        P2();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        gk.p.h("AppShellFragment", "surfaceDestroyed()");
        this.Q0 = false;
        wh.f.j().H();
    }

    @Override // sg.x0, e4.k, androidx.fragment.app.c
    public void z0(Bundle bundle) {
        super.z0(bundle);
        this.K0 = p().findViewById(sg.m0.f30840i);
    }
}
