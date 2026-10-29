package p517wh;

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
import cm.C1678a;
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.AbstractActivityC3160b;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import com.roblox.engine.jni.RunOnMainEngineJavaCallback;
import gl.C6134a;
import km.C7635f;
import mk.ViewOnTouchListenerC8572f;
import p015ak.C0305k0;
import p093e4.ActivityC4831q;
import p103eh.C5117e;
import p105ej.InterfaceC5143a;
import p107el.C5160a;
import p151gk.C6124q;
import p310nk.AbstractC9490a;
import p310nk.C9491b;
import sg.C11295a1;
import sg.C11329k0;
import sg.C11335m0;
import sg.C11346q;
import sg.C11368x0;
import sg.C11370y;
import sg.InterfaceC11314f0;
import th.C11659h;
import vi.C12217h;

/* JADX INFO: renamed from: wh.a */
/* JADX INFO: loaded from: classes2.dex */
public class SurfaceHolderCallbackC12423a extends C11368x0 implements SurfaceHolder.Callback, ViewOnTouchListenerC8572f.f, View.OnClickListener, InterfaceC5143a {

    /* JADX INFO: renamed from: I0 */
    public g f44419I0;

    /* JADX INFO: renamed from: J0 */
    public SurfaceView f44420J0;

    /* JADX INFO: renamed from: K0 */
    public View f44421K0;

    /* JADX INFO: renamed from: L0 */
    public View f44422L0;

    /* JADX INFO: renamed from: M0 */
    public AbstractC9490a f44423M0;

    /* JADX INFO: renamed from: N0 */
    public ViewTreeObserver.OnGlobalLayoutListener f44424N0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC12468w0 f44426P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f44427Q0;

    /* JADX INFO: renamed from: R0 */
    public IAPPurchaseManager f44428R0;

    /* JADX INFO: renamed from: S0 */
    public f f44429S0;

    /* JADX INFO: renamed from: T0 */
    public d f44430T0;

    /* JADX INFO: renamed from: U0 */
    public C12470x0 f44431U0;

    /* JADX INFO: renamed from: H0 */
    public final String f44418H0 = "AppShellFragment";

    /* JADX INFO: renamed from: O0 */
    public Handler f44425O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: wh.a$a */
    public class a extends AbstractC9490a {
        public a(Context context, AbstractC9490a.a aVar) {
            super(context, aVar);
        }

        @Override // p310nk.AbstractC9490a
        /* JADX INFO: renamed from: b */
        public C9491b mo37380b() {
            ActivityC4831q activityC4831qM4693p = SurfaceHolderCallbackC12423a.this.m4693p();
            if (activityC4831qM4693p != null) {
                return C9491b.m37386a(SurfaceHolderCallbackC12423a.this.f44420J0.getRootView(), activityC4831qM4693p.getWindowManager(), SurfaceHolderCallbackC12423a.this.f44421K0, ((AbstractActivityC3152a) SurfaceHolderCallbackC12423a.this.m4693p()).m14962G1().m34391c());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: wh.a$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!SurfaceHolderCallbackC12423a.this.m4694p0()) {
                C6124q.m27066k("AppShellFragment", "onGlobalLayout() fragment not attached");
                return;
            }
            SurfaceHolderCallbackC12423a.this.f44423M0.m37382d(false);
            if (SurfaceHolderCallbackC12423a.this.m4693p() != null) {
                View viewFindViewById = SurfaceHolderCallbackC12423a.this.m4693p().findViewById(C11335m0.f39803e);
                if (viewFindViewById == null) {
                    C6124q.m27060e("AppShellFragment", "Surface view not found! Cannot reset its layout.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams.width == -1 && layoutParams.height == -1) {
                    return;
                }
                C6124q.m27063h("AppShellFragment", "Resetting surface container's layout.");
                layoutParams.width = -1;
                layoutParams.height = -1;
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: wh.a$c */
    public class c implements C12449n.a {
        @Override // p517wh.C12449n.a
        /* JADX INFO: renamed from: c */
        public void mo46533c(String str) {
            C6124q.m27057b("AppShellFragment", "onAppReady() " + str);
            if (SurfaceHolderCallbackC12423a.this.f44419I0 != null) {
                SurfaceHolderCallbackC12423a.this.f44419I0.mo14771c(str);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c() {
        }
    }

    /* JADX INFO: renamed from: wh.a$d */
    public class d extends AbstractC12443k {

        /* JADX INFO: renamed from: a */
        public OnAppBridgeNotificationListener f44435a;

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: b */
        public void mo15218b(long j10) {
            if (SurfaceHolderCallbackC12423a.this.f44423M0 != null) {
                SurfaceHolderCallbackC12423a.this.f44423M0.m37382d(true);
            }
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: e */
        public void mo15219e(String str) {
            if (SurfaceHolderCallbackC12423a.this.f44429S0 != null) {
                SurfaceHolderCallbackC12423a.this.f44429S0.mo14774f(true);
            }
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: f */
        public void mo15220f(String str, String str2) {
            if (this.f44435a == null) {
                this.f44435a = C11370y.m42581h().m42582a(new c(), new e());
            }
            this.f44435a.mo1303a(str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: i */
        public void mo15786i(String str, String str2) {
            C11346q.m42513f(SurfaceHolderCallbackC12423a.this.m4693p(), str2, str);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: j */
        public void mo15221j(long j10, String str) {
            SurfaceHolderCallbackC12423a.this.f44428R0.m15384y(j10, str);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: k */
        public void mo15222k(long j10, String str, String str2) {
            SurfaceHolderCallbackC12423a.this.f44428R0.m15385z(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: l */
        public void mo15223l(long j10, String str, String str2) {
            SurfaceHolderCallbackC12423a.this.f44428R0.m15371A(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: m */
        public void mo15224m(long j10, String str, String str2) {
            SurfaceHolderCallbackC12423a.this.f44428R0.m15372B(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: n */
        public void mo15225n(long j10, String str, String str2, String str3) {
            SurfaceHolderCallbackC12423a.this.f44428R0.m15373C(j10, str, str2, str3);
        }

        @Override // p517wh.AbstractC12443k
        /* JADX INFO: renamed from: r */
        public InterfaceC12468w0 mo15227r() {
            return SurfaceHolderCallbackC12423a.this.f44426P0;
        }

        /* JADX INFO: renamed from: v */
        public void m46534v() {
            if (this.f44435a == null) {
                this.f44435a = C11370y.m42581h().m42582a(new c(), new e());
            }
            ((C12449n) this.f44435a).m46675g();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d() {
        }
    }

    /* JADX INFO: renamed from: wh.a$e */
    public class e implements C12449n.b {
        @Override // p517wh.C12449n.b
        /* JADX INFO: renamed from: a */
        public C11368x0 mo46535a() {
            return SurfaceHolderCallbackC12423a.this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public e() {
        }
    }

    /* JADX INFO: renamed from: wh.a$f */
    public interface f extends InterfaceC11314f0 {
    }

    /* JADX INFO: renamed from: wh.a$g */
    public interface g {
        /* JADX INFO: renamed from: a0 */
        void mo14767a0();

        /* JADX INFO: renamed from: c */
        void mo14771c(String str);
    }

    public SurfaceHolderCallbackC12423a() {
        d dVar = new d();
        C12433f.m46540j().m46544D(new RunOnMainEngineJavaCallback(this.f44425O0, dVar));
        this.f44428R0 = new IAPPurchaseManager(this, false);
        this.f44430T0 = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: B0 */
    public void mo4587B0(@NonNull Activity activity) {
        super.mo4587B0(activity);
        if (activity instanceof f) {
            this.f44429S0 = (f) activity;
        } else {
            C6124q.m27060e("AppShellFragment", "Error: AppShellFragment cannot find the listener!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(@NonNull Context context) {
        super.mo4590C0(context);
        if (context instanceof g) {
            this.f44419I0 = (g) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        if (C0305k0.m1257B()) {
            C6124q.m27063h("AppShellFragment", "onCreate: App was previously destroyed due to process death");
            super.mo4599F0(bundle);
        } else {
            super.mo4599F0(bundle);
            C6124q.m27063h("AppShellFragment", "onCreate:");
            C12433f.m46540j().m46546F(mo4715x());
            C12433f.m46540j().m46554k(C11295a1.m42389D0() ? C12453p.m46678b(mo4715x(), m4693p()) : C12453p.m46677a(mo4715x()));
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final AbstractC9490a.a m46524H2() {
        AbstractC9490a.a aVar = new AbstractC9490a.a();
        TypedValue typedValue = new TypedValue();
        m4637T().getValue(C11329k0.f39732c, typedValue, true);
        aVar.f34099a = (int) TypedValue.complexToFloat(typedValue.data);
        return aVar;
    }

    /* JADX INFO: renamed from: I2 */
    public Surface m46525I2() {
        if (this.f44427Q0) {
            return this.f44420J0.getHolder().getSurface();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6124q.m27063h("AppShellFragment", "onCreateView:");
        m46529M2(null);
        m46527K2(null);
        m46528L2();
        boolean zMo14769b = this.f44429S0.mo14769b();
        this.f44427Q0 = zMo14769b;
        if (zMo14769b) {
            m46532P2();
        }
        if (!C11659h.m43403a().mo43468J0() && !C11659h.m43403a().mo43416B4()) {
            View viewFindViewById = m4693p().findViewById(C11335m0.f39804e0);
            this.f44422L0 = viewFindViewById;
            viewFindViewById.findViewById(C11335m0.f39802d0).setOnClickListener(this);
            if (C12433f.m46540j().m46556m()) {
                this.f44420J0.setVisibility(0);
            } else {
                this.f44422L0.setVisibility(0);
            }
        } else if (C12433f.m46540j().m46556m()) {
            this.f44420J0.setVisibility(0);
        } else {
            m46526J2();
            this.f44422L0.setVisibility(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m46526J2() {
        ViewStub viewStub;
        if (this.f44422L0 != null || (viewStub = (ViewStub) m4693p().findViewById(C11335m0.f39806f0)) == null) {
            return;
        }
        View viewInflate = viewStub.inflate();
        this.f44422L0 = viewInflate;
        viewInflate.findViewById(C11335m0.f39802d0).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: K0 */
    public void mo4613K0() {
        if (C0305k0.m1257B()) {
            C6124q.m27063h("AppShellFragment", "onDestroy: App was previously destroyed due to process death");
            super.mo4613K0();
        } else {
            super.mo4613K0();
            C6124q.m27063h("AppShellFragment", "onDestroy()");
            this.f44420J0.getHolder().removeCallback(this);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m46527K2(View view) {
        ViewStub viewStub;
        if (C11659h.m43403a().mo43468J0() && (viewStub = (ViewStub) m4693p().findViewById(C11335m0.f39786R)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) m4693p().findViewById(C11335m0.f39775G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setLayoutParams((FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams());
        rbxKeyboard.setBackgroundColor(0);
        C5117e.m23880d(rbxKeyboard, mo4715x(), "SourceSansPro-Regular.ttf");
        this.f44426P0 = new C12456q0(rbxKeyboard);
    }

    /* JADX INFO: renamed from: L2 */
    public final void m46528L2() {
        this.f44423M0 = new a(mo4715x(), m46524H2());
        this.f44424N0 = new b();
        this.f44420J0.getViewTreeObserver().addOnGlobalLayoutListener(this.f44424N0);
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        super.mo4618M0();
        C6124q.m27057b("AppShellFragment", "onDestroyView()");
        this.f44420J0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f44424N0);
    }

    /* JADX INFO: renamed from: M2 */
    public final void m46529M2(View view) {
        C6124q.m27057b("AppShellFragment", "initSurfaceView()");
        SurfaceView surfaceView = (SurfaceView) m4693p().findViewById(C11335m0.f39810h0);
        this.f44420J0 = surfaceView;
        surfaceView.setFocusable(true);
        this.f44420J0.setFocusableInTouchMode(true);
        this.f44420J0.getHolder().addCallback(this);
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: N0 */
    public void mo4621N0() {
        super.mo4621N0();
        this.f44429S0 = null;
    }

    /* JADX INFO: renamed from: N2 */
    public final void m46530N2() {
        C6124q.m27057b("AppShellFragment", "loadSettings()");
        View view = this.f44422L0;
        if (view != null) {
            view.setVisibility(8);
        }
        C12433f.m46540j().m46554k(C11295a1.m42389D0() ? C12453p.m46678b(mo4715x(), m4693p()) : C12453p.m46677a(mo4715x()));
        this.f44420J0.setVisibility(0);
    }

    /* JADX INFO: renamed from: O2 */
    public final void m46531O2() {
        ActivityC4831q activityC4831qM4693p;
        Window window;
        if (Build.VERSION.SDK_INT < 28 || (activityC4831qM4693p = m4693p()) == null || (window = activityC4831qM4693p.getWindow()) == null) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        AbstractActivityC3152a abstractActivityC3152a = (AbstractActivityC3152a) activityC4831qM4693p;
        abstractActivityC3152a.m14962G1().m34393e(window.getDecorView());
        if (this.f44431U0 == null) {
            this.f44431U0 = new C12470x0(activityC4831qM4693p);
        }
        this.f44431U0.m46719i(abstractActivityC3152a, abstractActivityC3152a.m14962G1().m34389a());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: P0 */
    public void mo4627P0(boolean z10) {
        super.mo4627P0(z10);
        C6124q.m27057b("AppShellFragment", "onHiddenChanged() hidden:" + z10);
        if (z10) {
            C12433f.m46540j().m46563t();
            return;
        }
        if (this.f44427Q0) {
            C12433f.m46540j().m46547G(this.f44420J0.getHolder().getSurface());
            return;
        }
        C6124q.m27057b("AppShellFragment", "onHiddenChanged() surface not yet created - show surface");
        this.f44420J0.setVisibility(0);
        View view = this.f44422L0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m46532P2() {
        C12433f.d dVarM46553i;
        if (C11295a1.m42389D0() && (dVarM46553i = C12433f.m46540j().m46553i()) != null) {
            dVarM46553i.f44465a = m4693p();
        }
        C12433f.m46540j().m46547G(this.f44420J0.getHolder().getSurface());
        g gVar = this.f44419I0;
        if (gVar != null) {
            gVar.mo14767a0();
        }
    }

    @Override // sg.C11368x0, p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: U */
    public void mo15184U(int i10) {
        AbstractActivityC3160b abstractActivityC3160b = (AbstractActivityC3160b) m4693p();
        if (abstractActivityC3160b != null) {
            abstractActivityC3160b.m14968U(i10);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: V0 */
    public void mo4643V0() {
        super.mo4643V0();
        f fVar = this.f44429S0;
        if (fVar != null) {
            fVar.mo14782l();
        }
    }

    @Override // sg.C11368x0, p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: W */
    public void mo15185W(String str) {
        AbstractActivityC3160b abstractActivityC3160b = (AbstractActivityC3160b) m4693p();
        if (abstractActivityC3160b != null) {
            abstractActivityC3160b.m14969W(str);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        super.mo4658a1();
        View view = this.f44422L0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        m46530N2();
    }

    @Override // mk.ViewOnTouchListenerC8572f.f
    /* JADX INFO: renamed from: b */
    public boolean getIsSurfaceReady() {
        return this.f44427Q0;
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
        if (C12217h.m45288e().m45295f()) {
            this.f44430T0.m46534v();
        }
        f fVar = this.f44429S0;
        if (fVar != null) {
            fVar.mo14746I();
        }
        C7635f.m31524D().m31531E(mo4715x());
        C6134a.m27112b().m27114d(m4606H1());
        if (C11659h.m43403a().mo43533S4()) {
            m46531O2();
        }
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        super.mo4665d1();
        C6124q.m27063h("AppShellFragment", "onStop()");
        C1678a.m8388a().m8390c();
        C7635f.m31524D().m31532F();
        C6134a.m27112b().m27115e();
    }

    @Override // p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: f0 */
    public Activity mo15198f0() {
        return m4693p();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != C11335m0.f39802d0 || mo1226u2()) {
            return;
        }
        m46530N2();
    }

    @Override // p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: q0 */
    public AbstractActivityC3160b mo15213q0() {
        return (AbstractActivityC3160b) m4693p();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C6124q.m27063h("AppShellFragment", "surfaceChanged()");
        if (m4699r0()) {
            return;
        }
        float fM24001e = C5160a.m24001e(mo4715x());
        Point pointM24005i = C5160a.m24005i(mo4715x());
        C12433f.m46540j().m46549I(surfaceHolder.getSurface(), fM24001e, pointM24005i.x, pointM24005i.y);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C6124q.m27063h("AppShellFragment", "surfaceCreated()");
        this.f44427Q0 = true;
        if (m4699r0()) {
            return;
        }
        C6124q.m27063h("AppShellFragment", "Start the lua app");
        m46532P2();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C6124q.m27063h("AppShellFragment", "surfaceDestroyed()");
        this.f44427Q0 = false;
        C12433f.m46540j().m46548H();
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: z0 */
    public void mo4722z0(Bundle bundle) {
        super.mo4722z0(bundle);
        this.f44421K0 = m4693p().findViewById(C11335m0.f39811i);
    }
}
