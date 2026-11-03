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
import ek.q;
import java.util.Iterator;
import java.util.List;
import rg.e2;
import rh.h;
import uh.j0;

/* JADX INFO: loaded from: classes2.dex */
public class b extends vh.a implements ViewTreeObserver.OnGlobalLayoutListener, ComponentCallbacks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lk.b f9159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f9160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExperienceSession.f f9161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NativeTextBoxInfo f9162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f9163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f9164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0143b f9172t;

    public class a extends d1.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9173c;

        public a(int i10) {
            super(i10);
            this.f9173c = 0;
        }

        @Override // androidx.core.view.d1.b
        public void b(@NonNull d1 d1Var) {
            super.b(d1Var);
            if (!h.a().b5() || (d1Var.d() & WindowInsetsCompat.Type.ime()) == 0) {
                return;
            }
            b.this.f9168p = false;
            if (b.this.f9159g != null) {
                b bVar = b.this;
                bVar.D(bVar.f9159g, b.this.g());
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
                bVar.f9170r = this.f9173c + ((int) ((bVar.f9171s - this.f9173c) * next.c()));
                b bVar2 = b.this;
                bVar2.x(bVar2.f9170r);
            }
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.d1.b
        @NonNull
        public d1.a e(@NonNull d1 d1Var, @NonNull d1.a aVar) {
            if (h.a().b5() && (d1Var.d() & WindowInsetsCompat.Type.ime()) != 0) {
                b.this.f9168p = true;
            }
            this.f9173c = b.this.f9170r;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.b$b, reason: collision with other inner class name */
    public class C0143b extends dh.b<c> {

        /* JADX INFO: renamed from: com.roblox.client.game.b$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f9171s == b.this.f9170r) {
                    q.b("rbx.glview.text", "Y Shift animated successfully!");
                    return;
                }
                q.b("rbx.glview.text", "The Y shift wasn't animated in time, force set!");
                b bVar = b.this;
                bVar.f9170r = bVar.f9171s;
                b bVar2 = b.this;
                bVar2.x(bVar2.f9171s);
            }
        }

        public C0143b(String str) {
            super(str);
        }

        @Override // dh.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(c cVar) {
            b.this.f9164l.post(new a());
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9177a;

        public c(int i10) {
            this.f9177a = i10;
        }
    }

    public class d extends dh.b<NativeTextBoxInfo> {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NativeTextBoxInfo f9179a;

            public a(NativeTextBoxInfo nativeTextBoxInfo) {
                this.f9179a = nativeTextBoxInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.z("positioning native textbox: (" + this.f9179a.f9735x + ", " + this.f9179a.f9736y + ") align: (" + this.f9179a.xAlignment + ", " + this.f9179a.yAlignment + ")");
                b bVar = b.this;
                bVar.D(bVar.f9159g, b.this.g());
                b.this.N(this.f9179a);
                b.this.M(this.f9179a);
                b.this.b.requestFocus();
            }
        }

        public d(String str) {
            super(str);
        }

        @Override // dh.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(NativeTextBoxInfo nativeTextBoxInfo) {
            b.this.f9164l.post(new a(nativeTextBoxInfo));
        }
    }

    public b(RbxKeyboard rbxKeyboard, j0 j0Var, ExperienceSession.f fVar) {
        super(rbxKeyboard);
        this.f9155c = false;
        this.f9156d = 12;
        this.f9157e = 10;
        this.f9158f = BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES;
        this.f9163k = new d("rbx.glview.text");
        this.f9166n = 0;
        this.f9167o = 0;
        this.f9168p = false;
        this.f9169q = false;
        this.f9170r = 0;
        this.f9171s = 0;
        this.f9172t = new C0143b("rbx.glview.text");
        this.f9160h = j0Var;
        this.f9161i = fVar;
        this.f9164l = new Handler(Looper.getMainLooper());
    }

    public final float A(float f10, float f11) {
        return f10 * f11;
    }

    public void B() {
        FrameLayout frameLayoutK = this.f9160h.k();
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

    public final void D(lk.b bVar, float f10) {
        if (bVar.f23584e > 10) {
            NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
            float f11 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.f9735x : 0.0f;
            float f12 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.f9736y : 0.0f;
            float f13 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.width : 0.0f;
            float f14 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.height : 0.0f;
            float f15 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.fontSize : 0.0f;
            z("textbox pos/size/fontSize: (" + f11 + ", " + f12 + ", " + f13 + ", " + f14 + ", " + f15 + ")");
            float fA = A(f14 + f12, f10);
            float fA2 = fA >= ((float) bVar.b) ? bVar.f23585f - A(f12 + f15, f10) : bVar.f23585f - fA;
            float fA3 = A(12.0f, f10);
            int i10 = (int) (fA2 - fA3);
            z("margin:" + fA3 + " delta:" + fA2 + " adjustment:" + i10);
            if (h.a().e4()) {
                J(Math.min(0, i10));
            } else if (i10 < 0) {
                J(i10);
            }
        } else if (h.a().s1()) {
            x(0);
        }
        if (h.a().b5()) {
            E(bVar, f10);
        }
    }

    public void E(lk.b bVar, float f10) {
        float F;
        boolean z10 = bVar.f23584e > 10;
        if (h.a().b5()) {
            F = F(bVar.f23585f - (this.f9168p ? 0 : this.f9170r), f10);
        } else {
            F = F(bVar.f23585f, f10);
        }
        int i10 = (int) F;
        int iF = (int) F(bVar.f23581a.right, f10);
        int iF2 = (int) F(bVar.f23584e, f10);
        q.i("rbx.glview.text", "onUpdateKeyboardSize() v:" + z10 + " x:0 y:" + i10 + " w:" + iF + " h:" + iF2);
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
        o0.H0(this.f9160h.k(), null);
    }

    public void H() {
        C(this.f9160h.k(), -1, -1);
    }

    public final void I(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f9163k.e(nativeTextBoxInfo, h.a().L5());
        }
    }

    public final void J(int i10) {
        this.f9172t.e(new c(i10), h.a().t1());
        this.f9171s = i10;
    }

    public void K(long j10) {
        this.f9165m = j10;
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
        L(nativeTextBoxInfo.f9735x, nativeTextBoxInfo.f9736y, nativeTextBoxInfo.width, nativeTextBoxInfo.height);
        float fG = g();
        this.b.setPadding((int) A(nativeTextBoxInfo.paddingLeft, fG), (int) A(nativeTextBoxInfo.paddingTop, fG), (int) A(nativeTextBoxInfo.paddingRight, fG), (int) A(nativeTextBoxInfo.paddingBottom, fG));
    }

    public final void N(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.b.l(nativeTextBoxInfo);
            this.b.m(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, g());
        }
    }

    @Override // uh.x0
    public void a() {
        if (h.a().s1()) {
            q.b("rbx.glview.text", "hideKeyboard()");
        }
        J(0);
        this.b.e();
        this.f9162j = null;
    }

    @Override // uh.x0
    public void b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        this.f9162j = nativeTextBoxInfo;
        B();
        q.b("rbx.glview.text", "showKeyboard() " + str);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES)});
        this.b.setCurrentTextBox(j10);
        if (h.a().I2()) {
            this.b.i(nativeTextBoxInfo, str);
        }
        this.b.setText(str);
        if (z10) {
            NativeTextBoxInfo nativeTextBoxInfo2 = this.f9162j;
            if (nativeTextBoxInfo2 != null) {
                L(0.0f, -150.0f, nativeTextBoxInfo2.width, nativeTextBoxInfo2.height);
            } else {
                L(0.0f, -150.0f, -1.0f, 10.0f);
            }
            I(this.f9162j);
        }
        this.b.setVisibility(0);
        this.b.requestFocus();
        if (!h.a().g0() || nativeTextBoxInfo == null || nativeTextBoxInfo.editable) {
            e2.k(this.b, 2);
        }
        RbxKeyboard rbxKeyboard = this.b;
        rbxKeyboard.setSelection(rbxKeyboard.getText().length());
        j();
    }

    @Override // uh.x0
    public void c() {
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeTextBoxInfoNativeGetTextBoxInfo != null) {
            q.b("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeTextBoxInfoNativeGetTextBoxInfo.f9735x + " y:" + nativeTextBoxInfoNativeGetTextBoxInfo.f9736y + " width:" + nativeTextBoxInfoNativeGetTextBoxInfo.width + " height:" + nativeTextBoxInfoNativeGetTextBoxInfo.height + " fontSize:" + nativeTextBoxInfoNativeGetTextBoxInfo.fontSize);
            I(nativeTextBoxInfoNativeGetTextBoxInfo);
        }
        this.f9162j = nativeTextBoxInfoNativeGetTextBoxInfo;
    }

    @Override // uh.x0
    public void d(String str) {
        i(str);
    }

    @Override // uh.x0
    public void e() {
        RbxKeyboard rbxKeyboard = this.b;
        if (rbxKeyboard != null) {
            rbxKeyboard.h();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        q.h("rbx.glview.text", "Configuration change detected");
        H();
        if (!h.a().s1()) {
            NativeGLInterface.nativeReleaseFocus(h());
            a();
        } else {
            this.f9166n = this.f9160h.r().getWidth();
            this.f9167o = this.f9160h.r().getHeight();
            x(0);
            this.f9170r = 0;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        lk.b bVarA = this.f9161i.a();
        if (bVarA == null) {
            return;
        }
        lk.b bVar = this.f9159g;
        if (bVar == null || !bVar.equals(bVarA)) {
            this.f9159g = bVarA;
            if (h.a().s1()) {
                q.b("rbx.glview.text", "onGlobalLayout()");
                InputMethodManager inputMethodManager = (InputMethodManager) f().getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                    FrameLayout frameLayoutK = this.f9160h.k();
                    int width = frameLayoutK.getWidth();
                    int height = frameLayoutK.getHeight();
                    if (width != this.f9166n || height != this.f9167o) {
                        this.f9166n = width;
                        this.f9167o = height;
                        B();
                    }
                }
            }
            q.b("rbx.glview.text", String.format("Keyboard height: %d", Integer.valueOf(bVarA.f23584e)));
            boolean z10 = this.f9169q;
            boolean z11 = bVarA.f23584e > 10;
            this.f9169q = z11;
            if (z10 && !z11) {
                q.b("rbx.glview.text", "Remove view shift on keyboard close");
                J(0);
            }
            float fG = g();
            D(bVarA, fG);
            if (h.a().b5()) {
                return;
            }
            E(bVarA, fG);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public void x(int i10) {
        FrameLayout frameLayoutK = this.f9160h.k();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayoutK.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            frameLayoutK.setLayoutParams(layoutParams);
        }
    }

    public void y() {
        o0.H0(this.f9160h.k(), new a(1));
    }

    public final void z(String str) {
    }
}
