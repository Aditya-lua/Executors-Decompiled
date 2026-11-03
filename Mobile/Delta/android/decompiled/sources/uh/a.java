package uh;

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

/* JADX INFO: loaded from: classes2.dex */
public class a extends rg.x0 implements SurfaceHolder.Callback, kk.f.InterfaceC0399f, View.OnClickListener, cj.a {
    public g I0;
    public SurfaceView J0;
    public View K0;
    public View L0;
    public lk.a M0;
    public ViewTreeObserver.OnGlobalLayoutListener N0;
    public x0 P0;
    public boolean Q0;
    public IAPPurchaseManager R0;
    public f S0;
    public d T0;
    public y0 U0;
    public final String H0 = "AppShellFragment";
    public Handler O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: uh.a$a, reason: collision with other inner class name */
    public class C0595a extends lk.a {
        public C0595a(Context context, lk.a.C0412a c0412a) {
            super(context, c0412a);
        }

        @Override // lk.a
        public lk.b b() {
            e4.q qVarP = a.this.p();
            if (qVarP != null) {
                return lk.b.a(a.this.J0.getRootView(), qVarP.getWindowManager(), a.this.K0, ((com.roblox.client.a) a.this.p()).G1().c());
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
                ek.q.k("AppShellFragment", "onGlobalLayout() fragment not attached");
                return;
            }
            a.this.M0.d(false);
            if (a.this.p() != null) {
                View viewFindViewById = a.this.p().findViewById(rg.m0.f30435e);
                if (viewFindViewById == null) {
                    ek.q.e("AppShellFragment", "Surface view not found! Cannot reset its layout.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams.width == -1 && layoutParams.height == -1) {
                    return;
                }
                ek.q.h("AppShellFragment", "Resetting surface container's layout.");
                layoutParams.width = -1;
                layoutParams.height = -1;
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
    }

    public class c implements n.a {
        @Override // uh.n.a
        public void c(String str) {
            ek.q.b("AppShellFragment", "onAppReady() " + str);
            if (a.this.I0 != null) {
                a.this.I0.c(str);
            }
        }

        public c() {
        }
    }

    public class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnAppBridgeNotificationListener f32934a;

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void b(long j10) {
            if (a.this.M0 != null) {
                a.this.M0.d(true);
            }
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void e(String str) {
            if (a.this.S0 != null) {
                a.this.S0.g(true);
            }
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void f(String str, String str2) {
            if (this.f32934a == null) {
                this.f32934a = rg.y.h().a(new c(), new e());
            }
            this.f32934a.a(str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        public void i(String str, String str2) {
            rg.q.f(a.this.p(), str2, str);
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

        @Override // uh.k
        public x0 s() {
            return a.this.P0;
        }

        public void w() {
            if (this.f32934a == null) {
                this.f32934a = rg.y.h().a(new c(), new e());
            }
            ((n) this.f32934a).g();
        }

        public d() {
        }
    }

    public class e implements n.b {
        @Override // uh.n.b
        public rg.x0 a() {
            return a.this;
        }

        public e() {
        }
    }

    public interface f extends rg.f0 {
    }

    public interface g {
        void Z();

        void c(String str);
    }

    public a() {
        d dVar = new d();
        uh.f.j().D(new RunOnMainEngineJavaCallback(this.O0, dVar));
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
            ek.q.e("AppShellFragment", "Error: AppShellFragment cannot find the listener!");
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

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        if (yj.k0.B()) {
            ek.q.h("AppShellFragment", "onCreate: App was previously destroyed due to process death");
            super.F0(bundle);
        } else {
            super.F0(bundle);
            ek.q.h("AppShellFragment", "onCreate:");
            uh.f.j().F(w());
            uh.f.j().k(rg.a1.E0() ? p.b(w(), p()) : p.a(w()));
        }
    }

    public final lk.a.C0412a H2() {
        lk.a.C0412a c0412a = new lk.a.C0412a();
        TypedValue typedValue = new TypedValue();
        S().getValue(rg.k0.f30395c, typedValue, true);
        c0412a.f23579a = (int) TypedValue.complexToFloat(typedValue.data);
        return c0412a;
    }

    public Surface I2() {
        if (this.Q0) {
            return this.J0.getHolder().getSurface();
        }
        return null;
    }

    @Override // androidx.fragment.app.c
    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ek.q.h("AppShellFragment", "onCreateView:");
        M2(null);
        K2(null);
        L2();
        boolean zB = this.S0.b();
        this.Q0 = zB;
        if (zB) {
            P2();
        }
        if (!rh.h.a().L0() && !rh.h.a().I4()) {
            View viewFindViewById = p().findViewById(rg.m0.f30438f0);
            this.L0 = viewFindViewById;
            viewFindViewById.findViewById(rg.m0.f30436e0).setOnClickListener(this);
            if (uh.f.j().m()) {
                this.J0.setVisibility(0);
            } else {
                this.L0.setVisibility(0);
            }
        } else if (uh.f.j().m()) {
            this.J0.setVisibility(0);
        } else {
            J2();
            this.L0.setVisibility(0);
        }
        return null;
    }

    public final void J2() {
        ViewStub viewStub;
        if (this.L0 != null || (viewStub = (ViewStub) p().findViewById(rg.m0.f30440g0)) == null) {
            return;
        }
        View viewInflate = viewStub.inflate();
        this.L0 = viewInflate;
        viewInflate.findViewById(rg.m0.f30436e0).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.c
    public void K0() {
        if (yj.k0.B()) {
            ek.q.h("AppShellFragment", "onDestroy: App was previously destroyed due to process death");
            super.K0();
        } else {
            super.K0();
            ek.q.h("AppShellFragment", "onDestroy()");
            this.J0.getHolder().removeCallback(this);
        }
    }

    public final void K2(View view) {
        ViewStub viewStub;
        if (rh.h.a().L0() && (viewStub = (ViewStub) p().findViewById(rg.m0.R)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) p().findViewById(rg.m0.G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setLayoutParams((FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams());
        rbxKeyboard.setBackgroundColor(0);
        dh.e.d(rbxKeyboard, w(), "SourceSansPro-Regular.ttf");
        this.P0 = new r0(rbxKeyboard);
    }

    public final void L2() {
        this.M0 = new C0595a(w(), H2());
        this.N0 = new b();
        this.J0.getViewTreeObserver().addOnGlobalLayoutListener(this.N0);
    }

    @Override // e4.k, androidx.fragment.app.c
    public void M0() {
        super.M0();
        ek.q.b("AppShellFragment", "onDestroyView()");
        this.J0.getViewTreeObserver().removeOnGlobalLayoutListener(this.N0);
    }

    public final void M2(View view) {
        ek.q.b("AppShellFragment", "initSurfaceView()");
        SurfaceView surfaceView = (SurfaceView) p().findViewById(rg.m0.f30444i0);
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
        ek.q.b("AppShellFragment", "loadSettings()");
        View view = this.L0;
        if (view != null) {
            view.setVisibility(8);
        }
        uh.f.j().k(rg.a1.E0() ? p.b(w(), p()) : p.a(w()));
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
            this.U0 = new y0(qVarP);
        }
        this.U0.i(aVar, aVar.G1().a());
    }

    @Override // androidx.fragment.app.c
    public void P0(boolean z10) {
        super.P0(z10);
        ek.q.b("AppShellFragment", "onHiddenChanged() hidden:" + z10);
        if (z10) {
            uh.f.j().t();
            return;
        }
        if (this.Q0) {
            uh.f.j().G(this.J0.getHolder().getSurface());
            return;
        }
        ek.q.b("AppShellFragment", "onHiddenChanged() surface not yet created - show surface");
        this.J0.setVisibility(0);
        View view = this.L0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void P2() {
        uh.f.d dVarI;
        if (rg.a1.E0() && (dVarI = uh.f.j().i()) != null) {
            dVarI.f32960a = p();
        }
        uh.f.j().G(this.J0.getHolder().getSurface());
        g gVar = this.I0;
        if (gVar != null) {
            gVar.Z();
        }
    }

    @Override // rg.x0, cj.a
    public void T(int i10) {
        com.roblox.client.b bVar = (com.roblox.client.b) p();
        if (bVar != null) {
            bVar.T(i10);
        }
    }

    @Override // rg.x0, cj.a
    public void V(String str) {
        com.roblox.client.b bVar = (com.roblox.client.b) p();
        if (bVar != null) {
            bVar.V(str);
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

    @Override // androidx.fragment.app.c
    public void a1() {
        super.a1();
        View view = this.L0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        N2();
    }

    @Override // kk.f.InterfaceC0399f
    /* JADX INFO: renamed from: b */
    public boolean getIsSurfaceReady() {
        return this.Q0;
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        if (ti.h.e().f()) {
            this.T0.w();
        }
        f fVar = this.S0;
        if (fVar != null) {
            fVar.H();
        }
        im.f.F().G(w());
        el.a.b().d(H1());
        if (rh.h.a().Z4()) {
            O2();
        }
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void d1() {
        super.d1();
        ek.q.h("AppShellFragment", "onStop()");
        am.a.a().c();
        im.f.F().H();
        el.a.b().e();
    }

    @Override // cj.a
    public Activity f0() {
        return p();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != rg.m0.f30436e0 || u2()) {
            return;
        }
        N2();
    }

    @Override // cj.a
    public com.roblox.client.b q0() {
        return (com.roblox.client.b) p();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ek.q.h("AppShellFragment", "surfaceChanged()");
        if (r0()) {
            return;
        }
        float fE = cl.a.e(w());
        Point pointI = cl.a.i(w());
        uh.f.j().I(surfaceHolder.getSurface(), fE, pointI.x, pointI.y);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ek.q.h("AppShellFragment", "surfaceCreated()");
        this.Q0 = true;
        if (r0()) {
            return;
        }
        ek.q.h("AppShellFragment", "Start the lua app");
        P2();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ek.q.h("AppShellFragment", "surfaceDestroyed()");
        this.Q0 = false;
        uh.f.j().H();
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void z0(Bundle bundle) {
        super.z0(bundle);
        this.K0 = p().findViewById(rg.m0.f30443i);
    }
}
