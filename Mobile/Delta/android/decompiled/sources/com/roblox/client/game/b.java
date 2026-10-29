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
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d1;
import androidx.core.view.o0;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import com.roblox.client.RbxKeyboard;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import gk.p;
import java.util.Iterator;
import java.util.List;
import sg.e2;
import th.h;
import wh.i0;

/* JADX INFO: loaded from: classes2.dex */
public class b extends xh.a implements ViewTreeObserver.OnGlobalLayoutListener, ComponentCallbacks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nk.b f9086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0 f9087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExperienceSession.f f9088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NativeTextBoxInfo f9089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f9090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f9091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0140b f9099t;

    public class a extends d1.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9100c;

        public a(int i10) {
            super(i10);
            this.f9100c = 0;
        }

        @Override // androidx.core.view.d1.b
        public void b(@NonNull d1 d1Var) {
            super.b(d1Var);
            if (!h.a().O4() || (d1Var.d() & WindowInsetsCompat.Type.ime()) == 0) {
                return;
            }
            b.this.f9095p = false;
            if (b.this.f9086g != null) {
                b bVar = b.this;
                bVar.D(bVar.f9086g, b.this.g());
            }
        }

        @Override // androidx.core.view.d1.b
        @NonNull
        public WindowInsetsCompat d(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<d1> list) {
            d1 next;
            Iterator<d1> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while ((next.d() & WindowInsetsCompat.Type.ime()) == 0);
            if (next != null) {
                b bVar = b.this;
                bVar.f9097r = this.f9100c + ((int) ((bVar.f9098s - this.f9100c) * next.c()));
                b bVar2 = b.this;
                bVar2.x(bVar2.f9097r);
            }
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.d1.b
        @NonNull
        public d1.a e(@NonNull d1 d1Var, @NonNull d1.a aVar) {
            if (h.a().O4() && (d1Var.d() & WindowInsetsCompat.Type.ime()) != 0) {
                b.this.f9095p = true;
            }
            this.f9100c = b.this.f9097r;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.b$b, reason: collision with other inner class name */
    public class C0140b extends eh.b<c> {

        /* JADX INFO: renamed from: com.roblox.client.game.b$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f9098s == b.this.f9097r) {
                    p.b("rbx.glview.text", "Y Shift animated successfully!");
                    return;
                }
                p.b("rbx.glview.text", "The Y shift wasn't animated in time, force set!");
                b bVar = b.this;
                bVar.f9097r = bVar.f9098s;
                b bVar2 = b.this;
                bVar2.x(bVar2.f9098s);
            }
        }

        public C0140b(String str) {
            super(str);
        }

        @Override // eh.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(c cVar) {
            b.this.f9091l.post(new a());
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9104a;

        public c(int i10) {
            this.f9104a = i10;
        }
    }

    public class d extends eh.b<NativeTextBoxInfo> {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NativeTextBoxInfo f9106a;

            public a(NativeTextBoxInfo nativeTextBoxInfo) {
                this.f9106a = nativeTextBoxInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.z("positioning native textbox: (" + this.f9106a.f9655x + ", " + this.f9106a.f9656y + ") align: (" + this.f9106a.xAlignment + ", " + this.f9106a.yAlignment + ")");
                b bVar = b.this;
                bVar.D(bVar.f9086g, b.this.g());
                b.this.N(this.f9106a);
                b.this.M(this.f9106a);
                b.this.b.requestFocus();
            }
        }

        public d(String str) {
            super(str);
        }

        @Override // eh.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(NativeTextBoxInfo nativeTextBoxInfo) {
            b.this.f9091l.post(new a(nativeTextBoxInfo));
        }
    }

    public b(RbxKeyboard rbxKeyboard, i0 i0Var, ExperienceSession.f fVar) {
        super(rbxKeyboard);
        this.f9082c = false;
        this.f9083d = 12;
        this.f9084e = 10;
        this.f9085f = BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES;
        this.f9090k = new d("rbx.glview.text");
        this.f9093n = 0;
        this.f9094o = 0;
        this.f9095p = false;
        this.f9096q = false;
        this.f9097r = 0;
        this.f9098s = 0;
        this.f9099t = new C0140b("rbx.glview.text");
        this.f9087h = i0Var;
        this.f9088i = fVar;
        this.f9091l = new Handler(Looper.getMainLooper());
    }

    public final float A(float f10, float f11) {
        return f10 * f11;
    }

    public void B() {
        FrameLayout frameLayoutK = this.f9087h.k();
        int width = frameLayoutK.getWidth();
        int height = frameLayoutK.getHeight();
        z("Lock screen: (" + width + ", " + height + ")");
        C(frameLayoutK, width, height);
    }

    public final void C(View view, int i10, int i11) {
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

    public final void D(nk.b bVar, float f10) {
        if (bVar.f26295e > 10) {
            NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
            float f11 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.f9655x : 0.0f;
            float f12 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.f9656y : 0.0f;
            float f13 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.width : 0.0f;
            float f14 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.height : 0.0f;
            float f15 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.fontSize : 0.0f;
            z("textbox pos/size/fontSize: (" + f11 + ", " + f12 + ", " + f13 + ", " + f14 + ", " + f15 + ")");
            float fA = A(f14 + f12, f10);
            float fA2 = fA >= ((float) bVar.b) ? bVar.f26296f - A(f12 + f15, f10) : bVar.f26296f - fA;
            float fA3 = A(12.0f, f10);
            int i10 = (int) (fA2 - fA3);
            z("margin:" + fA3 + " delta:" + fA2 + " adjustment:" + i10);
            if (h.a().T3()) {
                J(Math.min(0, i10));
            } else if (i10 < 0) {
                J(i10);
            }
        } else if (h.a().j1()) {
            x(0);
        }
        if (h.a().O4()) {
            E(bVar, f10);
        }
    }

    public void E(nk.b bVar, float f10) {
        float F;
        boolean z10 = bVar.f26295e > 10;
        if (h.a().O4()) {
            F = F(bVar.f26296f - (this.f9095p ? 0 : this.f9097r), f10);
        } else {
            F = F(bVar.f26296f, f10);
        }
        int i10 = (int) F;
        int iF = (int) F(bVar.f26292a.right, f10);
        int iF2 = (int) F(bVar.f26295e, f10);
        p.i("rbx.glview.text", "onUpdateKeyboardSize() v:" + z10 + " x:0 y:" + i10 + " w:" + iF + " h:" + iF2);
        if (z10) {
            NativeGLInterface.updateKeyboardSize(true, 0, i10, iF, iF2);
        } else {
            NativeGLInterface.updateKeyboardSize(false, 0, i10, iF, 0);
        }
    }

    public final float F(int i10, float f10) {
        return (i10 / f10) + 0.5f;
    }

    public void G() {
        o0.H0(this.f9087h.k(), null);
    }

    public void H() {
        C(this.f9087h.k(), -1, -1);
    }

    public final void I(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f9090k.e(nativeTextBoxInfo, h.a().B5());
        }
    }

    public final void J(int i10) {
        this.f9099t.e(new c(i10), h.a().k1());
        this.f9098s = i10;
    }

    public void K(long j10) {
        this.f9092m = j10;
    }

    public final void L(float f10, float f11, float f12, float f13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        float fG = g();
        float fA = A(f10, fG);
        float fA2 = A(f11, fG);
        float fA3 = A(f12, fG);
        float fA4 = A(f13, fG);
        layoutParams.topMargin = (int) fA2;
        layoutParams.width = (int) fA3;
        layoutParams.height = (int) fA4;
        layoutParams.leftMargin = (int) fA;
        this.b.setLayoutParams(layoutParams);
    }

    public final void M(NativeTextBoxInfo nativeTextBoxInfo) {
        L(nativeTextBoxInfo.f9655x, nativeTextBoxInfo.f9656y, nativeTextBoxInfo.width, nativeTextBoxInfo.height);
        float fG = g();
        this.b.setPadding((int) A(nativeTextBoxInfo.paddingLeft, fG), (int) A(nativeTextBoxInfo.paddingTop, fG), (int) A(nativeTextBoxInfo.paddingRight, fG), (int) A(nativeTextBoxInfo.paddingBottom, fG));
    }

    public final void N(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.b.l(nativeTextBoxInfo);
            this.b.m(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, g());
        }
    }

    @Override // wh.w0
    public void a() {
        if (h.a().j1()) {
            p.b("rbx.glview.text", "hideKeyboard()");
        }
        J(0);
        this.b.e();
        this.f9089j = null;
    }

    @Override // wh.w0
    public void b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        this.f9089j = nativeTextBoxInfo;
        B();
        p.b("rbx.glview.text", "showKeyboard() " + str);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES)});
        this.b.setCurrentTextBox(j10);
        if (h.a().x2()) {
            this.b.i(nativeTextBoxInfo, str);
        }
        this.b.setText(str);
        if (z10) {
            NativeTextBoxInfo nativeTextBoxInfo2 = this.f9089j;
            if (nativeTextBoxInfo2 != null) {
                L(0.0f, -150.0f, nativeTextBoxInfo2.width, nativeTextBoxInfo2.height);
            } else {
                L(0.0f, -150.0f, -1.0f, 10.0f);
            }
            I(this.f9089j);
        }
        this.b.setVisibility(0);
        this.b.requestFocus();
        if (!h.a().b0() || nativeTextBoxInfo == null || nativeTextBoxInfo.editable) {
            e2.k(this.b, 2);
        }
        RbxKeyboard rbxKeyboard = this.b;
        rbxKeyboard.setSelection(rbxKeyboard.getText().length());
        j();
    }

    @Override // wh.w0
    public void c() {
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeTextBoxInfoNativeGetTextBoxInfo != null) {
            p.b("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeTextBoxInfoNativeGetTextBoxInfo.f9655x + " y:" + nativeTextBoxInfoNativeGetTextBoxInfo.f9656y + " width:" + nativeTextBoxInfoNativeGetTextBoxInfo.width + " height:" + nativeTextBoxInfoNativeGetTextBoxInfo.height + " fontSize:" + nativeTextBoxInfoNativeGetTextBoxInfo.fontSize);
            I(nativeTextBoxInfoNativeGetTextBoxInfo);
        }
        this.f9089j = nativeTextBoxInfoNativeGetTextBoxInfo;
    }

    @Override // wh.w0
    public void d(String str) {
        i(str);
    }

    @Override // wh.w0
    public void e() {
        RbxKeyboard rbxKeyboard = this.b;
        if (rbxKeyboard != null) {
            rbxKeyboard.h();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        p.h("rbx.glview.text", "Configuration change detected");
        H();
        if (!h.a().j1()) {
            NativeGLInterface.nativeReleaseFocus(h());
            a();
        } else {
            this.f9093n = this.f9087h.r().getWidth();
            this.f9094o = this.f9087h.r().getHeight();
            x(0);
            this.f9097r = 0;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        nk.b bVarA = this.f9088i.a();
        if (bVarA == null) {
            return;
        }
        nk.b bVar = this.f9086g;
        if (bVar == null || !bVar.equals(bVarA)) {
            this.f9086g = bVarA;
            if (h.a().j1()) {
                p.b("rbx.glview.text", "onGlobalLayout()");
                InputMethodManager inputMethodManager = (InputMethodManager) f().getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                    FrameLayout frameLayoutK = this.f9087h.k();
                    int width = frameLayoutK.getWidth();
                    int height = frameLayoutK.getHeight();
                    if (width != this.f9093n || height != this.f9094o) {
                        this.f9093n = width;
                        this.f9094o = height;
                        B();
                    }
                }
            }
            p.b("rbx.glview.text", String.format("Keyboard height: %d", Integer.valueOf(bVarA.f26295e)));
            boolean z10 = this.f9096q;
            boolean z11 = bVarA.f26295e > 10;
            this.f9096q = z11;
            if (z10 && !z11) {
                p.b("rbx.glview.text", "Remove view shift on keyboard close");
                J(0);
            }
            float fG = g();
            D(bVarA, fG);
            if (h.a().O4()) {
                return;
            }
            E(bVarA, fG);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public void x(int i10) {
        FrameLayout frameLayoutK = this.f9087h.k();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayoutK.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            frameLayoutK.setLayoutParams(layoutParams);
        }
    }

    public void y() {
        o0.H0(this.f9087h.k(), new a(1));
    }

    public final void z(String str) {
    }
}
