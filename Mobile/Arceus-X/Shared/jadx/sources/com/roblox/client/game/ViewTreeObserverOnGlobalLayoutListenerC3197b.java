package com.roblox.client.game;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.C0593d1;
import androidx.core.view.C0625o0;
import androidx.core.view.WindowInsetsCompat;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import com.roblox.client.RbxKeyboard;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.util.Iterator;
import java.util.List;
import p103eh.AbstractRunnableC5114b;
import p151gk.C6124q;
import p310nk.C9491b;
import p517wh.SurfaceHolderCallbackC12440i0;
import p547xh.AbstractC12833a;
import sg.C11312e2;
import th.C11659h;

/* JADX INFO: renamed from: com.roblox.client.game.b */
/* JADX INFO: loaded from: classes2.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC3197b extends AbstractC12833a implements ViewTreeObserver.OnGlobalLayoutListener, ComponentCallbacks {

    /* JADX INFO: renamed from: c */
    public final boolean f11849c;

    /* JADX INFO: renamed from: d */
    public final int f11850d;

    /* JADX INFO: renamed from: e */
    public final int f11851e;

    /* JADX INFO: renamed from: f */
    public final int f11852f;

    /* JADX INFO: renamed from: g */
    public C9491b f11853g;

    /* JADX INFO: renamed from: h */
    public SurfaceHolderCallbackC12440i0 f11854h;

    /* JADX INFO: renamed from: i */
    public ExperienceSession.C3195f f11855i;

    /* JADX INFO: renamed from: j */
    public NativeTextBoxInfo f11856j;

    /* JADX INFO: renamed from: k */
    public d f11857k;

    /* JADX INFO: renamed from: l */
    public Handler f11858l;

    /* JADX INFO: renamed from: m */
    public long f11859m;

    /* JADX INFO: renamed from: n */
    public int f11860n;

    /* JADX INFO: renamed from: o */
    public int f11861o;

    /* JADX INFO: renamed from: p */
    public boolean f11862p;

    /* JADX INFO: renamed from: q */
    public boolean f11863q;

    /* JADX INFO: renamed from: r */
    public int f11864r;

    /* JADX INFO: renamed from: s */
    public int f11865s;

    /* JADX INFO: renamed from: t */
    public b f11866t;

    /* JADX INFO: renamed from: com.roblox.client.game.b$a */
    public class a extends C0593d1.b {

        /* JADX INFO: renamed from: c */
        public int f11867c;

        public a(int i10) {
            super(i10);
            this.f11867c = 0;
        }

        @Override // androidx.core.view.C0593d1.b
        /* JADX INFO: renamed from: b */
        public void mo2854b(@NonNull C0593d1 c0593d1) {
            super.mo2854b(c0593d1);
            if (!C11659h.m43403a().mo43547U4() || (c0593d1.m2847d() & WindowInsetsCompat.Type.ime()) == 0) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f11862p = false;
            if (ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f11853g != null) {
                ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b = ViewTreeObserverOnGlobalLayoutListenerC3197b.this;
                viewTreeObserverOnGlobalLayoutListenerC3197b.m15245D(viewTreeObserverOnGlobalLayoutListenerC3197b.f11853g, ViewTreeObserverOnGlobalLayoutListenerC3197b.this.m47768g());
            }
        }

        @Override // androidx.core.view.C0593d1.b
        @NonNull
        /* JADX INFO: renamed from: d */
        public WindowInsetsCompat mo2856d(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<C0593d1> list) {
            C0593d1 next;
            Iterator<C0593d1> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while ((next.m2847d() & WindowInsetsCompat.Type.ime()) == 0);
            if (next != null) {
                ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b = ViewTreeObserverOnGlobalLayoutListenerC3197b.this;
                viewTreeObserverOnGlobalLayoutListenerC3197b.f11864r = this.f11867c + ((int) ((viewTreeObserverOnGlobalLayoutListenerC3197b.f11865s - this.f11867c) * next.m2846c()));
                ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b2 = ViewTreeObserverOnGlobalLayoutListenerC3197b.this;
                viewTreeObserverOnGlobalLayoutListenerC3197b2.m15261x(viewTreeObserverOnGlobalLayoutListenerC3197b2.f11864r);
            }
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.C0593d1.b
        @NonNull
        /* JADX INFO: renamed from: e */
        public C0593d1.a mo2857e(@NonNull C0593d1 c0593d1, @NonNull C0593d1.a aVar) {
            if (C11659h.m43403a().mo43547U4() && (c0593d1.m2847d() & WindowInsetsCompat.Type.ime()) != 0) {
                ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f11862p = true;
            }
            this.f11867c = ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f11864r;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.b$b */
    public class b extends AbstractRunnableC5114b<c> {

        /* JADX INFO: renamed from: com.roblox.client.game.b$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f11865s == ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f11864r) {
                    C6124q.m27057b("rbx.glview.text", "Y Shift animated successfully!");
                    return;
                }
                C6124q.m27057b("rbx.glview.text", "The Y shift wasn't animated in time, force set!");
                ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b = ViewTreeObserverOnGlobalLayoutListenerC3197b.this;
                viewTreeObserverOnGlobalLayoutListenerC3197b.f11864r = viewTreeObserverOnGlobalLayoutListenerC3197b.f11865s;
                ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b2 = ViewTreeObserverOnGlobalLayoutListenerC3197b.this;
                viewTreeObserverOnGlobalLayoutListenerC3197b2.m15261x(viewTreeObserverOnGlobalLayoutListenerC3197b2.f11865s);
            }
        }

        public b(String str) {
            super(str);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p103eh.AbstractRunnableC5114b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo15264a(c cVar) {
            ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f11858l.post(new a());
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.b$c */
    public class c {

        /* JADX INFO: renamed from: a */
        public int f11871a;

        public c(int i10) {
            this.f11871a = i10;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.b$d */
    public class d extends AbstractRunnableC5114b<NativeTextBoxInfo> {

        /* JADX INFO: renamed from: com.roblox.client.game.b$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ NativeTextBoxInfo f11874a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(NativeTextBoxInfo nativeTextBoxInfo) {
                this.f11874a = nativeTextBoxInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserverOnGlobalLayoutListenerC3197b.this.m15263z("positioning native textbox: (" + this.f11874a.f12594x + ", " + this.f11874a.f12595y + ") align: (" + this.f11874a.xAlignment + ", " + this.f11874a.yAlignment + ")");
                ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b = ViewTreeObserverOnGlobalLayoutListenerC3197b.this;
                viewTreeObserverOnGlobalLayoutListenerC3197b.m15245D(viewTreeObserverOnGlobalLayoutListenerC3197b.f11853g, ViewTreeObserverOnGlobalLayoutListenerC3197b.this.m47768g());
                ViewTreeObserverOnGlobalLayoutListenerC3197b.this.m15255N(this.f11874a);
                ViewTreeObserverOnGlobalLayoutListenerC3197b.this.m15254M(this.f11874a);
                ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f45632b.requestFocus();
            }
        }

        public d(String str) {
            super(str);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p103eh.AbstractRunnableC5114b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo15264a(NativeTextBoxInfo nativeTextBoxInfo) {
            ViewTreeObserverOnGlobalLayoutListenerC3197b.this.f11858l.post(new a(nativeTextBoxInfo));
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC3197b(RbxKeyboard rbxKeyboard, SurfaceHolderCallbackC12440i0 surfaceHolderCallbackC12440i0, ExperienceSession.C3195f c3195f) {
        super(rbxKeyboard);
        this.f11849c = false;
        this.f11850d = 12;
        this.f11851e = 10;
        this.f11852f = BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES;
        this.f11857k = new d("rbx.glview.text");
        this.f11860n = 0;
        this.f11861o = 0;
        this.f11862p = false;
        this.f11863q = false;
        this.f11864r = 0;
        this.f11865s = 0;
        this.f11866t = new b("rbx.glview.text");
        this.f11854h = surfaceHolderCallbackC12440i0;
        this.f11855i = c3195f;
        this.f11858l = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: A */
    public final float m15242A(float f10, float f11) {
        return f10 * f11;
    }

    /* JADX INFO: renamed from: B */
    public void m15243B() {
        FrameLayout frameLayoutM46609k = this.f11854h.m46609k();
        int width = frameLayoutM46609k.getWidth();
        int height = frameLayoutM46609k.getHeight();
        m15263z("Lock screen: (" + width + ", " + height + ")");
        m15244C(frameLayoutM46609k, width, height);
    }

    /* JADX INFO: renamed from: C */
    public final void m15244C(View view, int i10, int i11) {
        boolean z10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z11 = true;
        if (layoutParams.width != i10) {
            layoutParams.width = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (layoutParams.height != i11) {
            layoutParams.height = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m15245D(C9491b c9491b, float f10) {
        if (c9491b.f34105e > 10) {
            NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
            float f11 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.f12594x : 0.0f;
            float f12 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.f12595y : 0.0f;
            float f13 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.width : 0.0f;
            float f14 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.height : 0.0f;
            float f15 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.fontSize : 0.0f;
            m15263z("textbox pos/size/fontSize: (" + f11 + ", " + f12 + ", " + f13 + ", " + f14 + ", " + f15 + ")");
            float fM15242A = m15242A(f14 + f12, f10);
            float fM15242A2 = fM15242A >= ((float) c9491b.f34102b) ? c9491b.f34106f - m15242A(f12 + f15, f10) : c9491b.f34106f - fM15242A;
            float fM15242A3 = m15242A(12.0f, f10);
            int i10 = (int) (fM15242A2 - fM15242A3);
            m15263z("margin:" + fM15242A3 + " delta:" + fM15242A2 + " adjustment:" + i10);
            if (C11659h.m43403a().mo43574Y3()) {
                m15251J(Math.min(0, i10));
            } else if (i10 < 0) {
                m15251J(i10);
            }
        } else if (C11659h.m43403a().mo43689o1()) {
            m15261x(0);
        }
        if (C11659h.m43403a().mo43547U4()) {
            m15246E(c9491b, f10);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m15246E(C9491b c9491b, float f10) {
        float fM15247F;
        boolean z10 = c9491b.f34105e > 10;
        if (C11659h.m43403a().mo43547U4()) {
            fM15247F = m15247F(c9491b.f34106f - (this.f11862p ? 0 : this.f11864r), f10);
        } else {
            fM15247F = m15247F(c9491b.f34106f, f10);
        }
        int i10 = (int) fM15247F;
        int iM15247F = (int) m15247F(c9491b.f34101a.right, f10);
        int iM15247F2 = (int) m15247F(c9491b.f34105e, f10);
        C6124q.m27064i("rbx.glview.text", "onUpdateKeyboardSize() v:" + z10 + " x:0 y:" + i10 + " w:" + iM15247F + " h:" + iM15247F2);
        if (z10) {
            NativeGLInterface.updateKeyboardSize(true, 0, i10, iM15247F, iM15247F2);
        } else {
            NativeGLInterface.updateKeyboardSize(false, 0, i10, iM15247F, 0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final float m15247F(int i10, float f10) {
        return (i10 / f10) + 0.5f;
    }

    /* JADX INFO: renamed from: G */
    public void m15248G() {
        C0625o0.m2993H0(this.f11854h.m46609k(), null);
    }

    /* JADX INFO: renamed from: H */
    public void m15249H() {
        m15244C(this.f11854h.m46609k(), -1, -1);
    }

    /* JADX INFO: renamed from: I */
    public final void m15250I(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f11857k.m23871e(nativeTextBoxInfo, C11659h.m43403a().mo43459H5());
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m15251J(int i10) {
        this.f11866t.m23871e(new c(i10), C11659h.m43403a().mo43696p1());
        this.f11865s = i10;
    }

    /* JADX INFO: renamed from: K */
    public void m15252K(long j10) {
        this.f11859m = j10;
    }

    /* JADX INFO: renamed from: L */
    public final void m15253L(float f10, float f11, float f12, float f13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f45632b.getLayoutParams();
        float fM47768g = m47768g();
        float fM15242A = m15242A(f10, fM47768g);
        float fM15242A2 = m15242A(f11, fM47768g);
        float fM15242A3 = m15242A(f12, fM47768g);
        float fM15242A4 = m15242A(f13, fM47768g);
        layoutParams.topMargin = (int) fM15242A2;
        layoutParams.width = (int) fM15242A3;
        layoutParams.height = (int) fM15242A4;
        layoutParams.leftMargin = (int) fM15242A;
        this.f45632b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: M */
    public final void m15254M(NativeTextBoxInfo nativeTextBoxInfo) {
        m15253L(nativeTextBoxInfo.f12594x, nativeTextBoxInfo.f12595y, nativeTextBoxInfo.width, nativeTextBoxInfo.height);
        float fM47768g = m47768g();
        this.f45632b.setPadding((int) m15242A(nativeTextBoxInfo.paddingLeft, fM47768g), (int) m15242A(nativeTextBoxInfo.paddingTop, fM47768g), (int) m15242A(nativeTextBoxInfo.paddingRight, fM47768g), (int) m15242A(nativeTextBoxInfo.paddingBottom, fM47768g));
    }

    /* JADX INFO: renamed from: N */
    public final void m15255N(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f45632b.m14831l(nativeTextBoxInfo);
            this.f45632b.m14832m(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, m47768g());
        }
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: a */
    public void mo15256a() {
        if (C11659h.m43403a().mo43689o1()) {
            C6124q.m27057b("rbx.glview.text", "hideKeyboard()");
        }
        m15251J(0);
        this.f45632b.m14824e();
        this.f11856j = null;
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: b */
    public void mo15257b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        this.f11856j = nativeTextBoxInfo;
        m15243B();
        C6124q.m27057b("rbx.glview.text", "showKeyboard() " + str);
        this.f45632b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES)});
        this.f45632b.setCurrentTextBox(j10);
        if (C11659h.m43403a().mo43428D2()) {
            this.f45632b.m14828i(nativeTextBoxInfo, str);
        }
        this.f45632b.setText(str);
        if (z10) {
            NativeTextBoxInfo nativeTextBoxInfo2 = this.f11856j;
            if (nativeTextBoxInfo2 != null) {
                m15253L(0.0f, -150.0f, nativeTextBoxInfo2.width, nativeTextBoxInfo2.height);
            } else {
                m15253L(0.0f, -150.0f, -1.0f, 10.0f);
            }
            m15250I(this.f11856j);
        }
        this.f45632b.setVisibility(0);
        this.f45632b.requestFocus();
        if (!C11659h.m43403a().mo43625f0() || nativeTextBoxInfo == null || nativeTextBoxInfo.editable) {
            C11312e2.m42507k(this.f45632b, 2);
        }
        RbxKeyboard rbxKeyboard = this.f45632b;
        rbxKeyboard.setSelection(rbxKeyboard.getText().length());
        m47771j();
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: c */
    public void mo15258c() {
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeTextBoxInfoNativeGetTextBoxInfo != null) {
            C6124q.m27057b("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeTextBoxInfoNativeGetTextBoxInfo.f12594x + " y:" + nativeTextBoxInfoNativeGetTextBoxInfo.f12595y + " width:" + nativeTextBoxInfoNativeGetTextBoxInfo.width + " height:" + nativeTextBoxInfoNativeGetTextBoxInfo.height + " fontSize:" + nativeTextBoxInfoNativeGetTextBoxInfo.fontSize);
            m15250I(nativeTextBoxInfoNativeGetTextBoxInfo);
        }
        this.f11856j = nativeTextBoxInfoNativeGetTextBoxInfo;
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: d */
    public void mo15259d(String str) {
        m47770i(str);
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: e */
    public void mo15260e() {
        RbxKeyboard rbxKeyboard = this.f45632b;
        if (rbxKeyboard != null) {
            rbxKeyboard.m14827h();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C6124q.m27063h("rbx.glview.text", "Configuration change detected");
        m15249H();
        if (!C11659h.m43403a().mo43689o1()) {
            NativeGLInterface.nativeReleaseFocus(m47769h());
            mo15256a();
        } else {
            this.f11860n = this.f11854h.m46616r().getWidth();
            this.f11861o = this.f11854h.m46616r().getHeight();
            m15261x(0);
            this.f11864r = 0;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C9491b c9491bM15216a = this.f11855i.m15216a();
        if (c9491bM15216a == null) {
            return;
        }
        C9491b c9491b = this.f11853g;
        if (c9491b == null || !c9491b.equals(c9491bM15216a)) {
            this.f11853g = c9491bM15216a;
            if (C11659h.m43403a().mo43689o1()) {
                C6124q.m27057b("rbx.glview.text", "onGlobalLayout()");
                InputMethodManager inputMethodManager = (InputMethodManager) m47767f().getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                    FrameLayout frameLayoutM46609k = this.f11854h.m46609k();
                    int width = frameLayoutM46609k.getWidth();
                    int height = frameLayoutM46609k.getHeight();
                    if (width != this.f11860n || height != this.f11861o) {
                        this.f11860n = width;
                        this.f11861o = height;
                        m15243B();
                    }
                }
            }
            C6124q.m27057b("rbx.glview.text", String.format("Keyboard height: %d", Integer.valueOf(c9491bM15216a.f34105e)));
            boolean z10 = this.f11863q;
            boolean z11 = c9491bM15216a.f34105e > 10;
            this.f11863q = z11;
            if (z10 && !z11) {
                C6124q.m27057b("rbx.glview.text", "Remove view shift on keyboard close");
                m15251J(0);
            }
            float fM47768g = m47768g();
            m15245D(c9491bM15216a, fM47768g);
            if (C11659h.m43403a().mo43547U4()) {
                return;
            }
            m15246E(c9491bM15216a, fM47768g);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* JADX INFO: renamed from: x */
    public void m15261x(int i10) {
        FrameLayout frameLayoutM46609k = this.f11854h.m46609k();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayoutM46609k.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            frameLayoutM46609k.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m15262y() {
        C0625o0.m2993H0(this.f11854h.m46609k(), new a(1));
    }

    /* JADX INFO: renamed from: z */
    public final void m15263z(String str) {
    }
}
