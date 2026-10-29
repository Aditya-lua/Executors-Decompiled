package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c1;
import androidx.core.view.o0;
import androidx.core.view.y;
import gd.g;
import hc.h;
import hc.j;
import j.l;
import y2.p;
import zc.r;

/* JADX INFO: loaded from: classes2.dex */
public class a extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f7638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f7639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CoordinatorLayout f7640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f7641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f7646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public bd.c f7648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public BottomSheetBehavior.g f7649r;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    public class C0116a implements y {
        public C0116a() {
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
            if (a.this.f7646o != null) {
                a.this.f7638g.F0(a.this.f7646o);
            }
            if (windowInsetsCompat != null) {
                a aVar = a.this;
                aVar.f7646o = new f(aVar.f7641j, windowInsetsCompat, null);
                a.this.f7646o.e(a.this.getWindow());
                a.this.f7638g.c0(a.this.f7646o);
            }
            return windowInsetsCompat;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f7643l && aVar.isShowing() && a.this.z()) {
                a.this.cancel();
            }
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull p pVar) {
            super.g(view, pVar);
            if (!a.this.f7643l) {
                pVar.q0(false);
            } else {
                pVar.a(1048576);
                pVar.q0(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f7643l) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class e extends BottomSheetBehavior.g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    public static class f extends BottomSheetBehavior.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f7655a;

        @NonNull
        public final WindowInsetsCompat b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Window f7656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7657d;

        public /* synthetic */ f(View view, WindowInsetsCompat windowInsetsCompat, C0116a c0116a) {
            this(view, windowInsetsCompat);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@NonNull View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i10) {
            d(view);
        }

        public final void d(View view) {
            if (view.getTop() < this.b.getSystemWindowInsetTop()) {
                Window window = this.f7656c;
                if (window != null) {
                    Boolean bool = this.f7655a;
                    zc.d.f(window, bool == null ? this.f7657d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f7656c;
                if (window2 != null) {
                    zc.d.f(window2, this.f7657d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public void e(Window window) {
            if (this.f7656c == window) {
                return;
            }
            this.f7656c = window;
            if (window != null) {
                this.f7657d = c1.a(window, window.getDecorView()).b();
            }
        }

        public f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            this.b = windowInsetsCompat;
            g gVarT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListX = gVarT0 != null ? gVarT0.x() : o0.r(view);
            if (colorStateListX != null) {
                this.f7655a = Boolean.valueOf(tc.a.h(colorStateListX.getDefaultColor()));
                return;
            }
            Integer numE = r.e(view);
            if (numE != null) {
                this.f7655a = Boolean.valueOf(tc.a.h(numE.intValue()));
            } else {
                this.f7655a = null;
            }
        }
    }

    public a(@NonNull Context context, int i10) {
        super(context, m(context, i10));
        this.f7643l = true;
        this.f7644m = true;
        this.f7649r = new e();
        o(1);
        this.f7647p = getContext().getTheme().obtainStyledAttributes(new int[]{hc.b.f18795t}).getBoolean(0, false);
    }

    public static int m(@NonNull Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(hc.b.b, typedValue, true) ? typedValue.resourceId : j.f18932c;
    }

    public final void B() {
        bd.c cVar = this.f7648q;
        if (cVar == null) {
            return;
        }
        if (this.f7643l) {
            cVar.b();
        } else {
            cVar.d();
        }
    }

    public final View C(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        u();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7639h.findViewById(hc.f.f18863e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f7647p) {
            o0.A0(this.f7641j, new C0116a());
        }
        this.f7641j.removeAllViews();
        if (layoutParams == null) {
            this.f7641j.addView(view);
        } else {
            this.f7641j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(hc.f.V).setOnClickListener(new b());
        o0.m0(this.f7641j, new c());
        this.f7641j.setOnTouchListener(new d());
        return this.f7639h;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorV = v();
        if (!this.f7642k || bottomSheetBehaviorV.v0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorV.X0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f7647p && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f7639h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f7640i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            c1.b(window, !z10);
            f fVar = this.f7646o;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        B();
    }

    @Override // j.l, e.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f7646o;
        if (fVar != null) {
            fVar.e(null);
        }
        bd.c cVar = this.f7648q;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // e.w, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7638g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.v0() != 5) {
            return;
        }
        this.f7638g.X0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f7643l != z10) {
            this.f7643l = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7638g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.P0(z10);
            }
            if (getWindow() != null) {
                B();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f7643l) {
            this.f7643l = true;
        }
        this.f7644m = z10;
        this.f7645n = true;
    }

    @Override // j.l, e.w, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(C(i10, null, null));
    }

    public final FrameLayout u() {
        if (this.f7639h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f18887a, null);
            this.f7639h = frameLayout;
            this.f7640i = (CoordinatorLayout) frameLayout.findViewById(hc.f.f18863e);
            FrameLayout frameLayout2 = (FrameLayout) this.f7639h.findViewById(hc.f.f18864f);
            this.f7641j = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f7638g = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f7649r);
            this.f7638g.P0(this.f7643l);
            this.f7648q = new bd.c(this.f7638g, this.f7641j);
        }
        return this.f7639h;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> v() {
        if (this.f7638g == null) {
            u();
        }
        return this.f7638g;
    }

    public boolean w() {
        return this.f7642k;
    }

    public void y() {
        this.f7638g.F0(this.f7649r);
    }

    public boolean z() {
        if (!this.f7645n) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f7644m = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f7645n = true;
        }
        return this.f7644m;
    }

    @Override // j.l, e.w, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(C(0, view, null));
    }

    @Override // j.l, e.w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(C(0, view, layoutParams));
    }
}
