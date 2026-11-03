package com.google.android.material.bottomsheet;

import ad.r;
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
import hd.g;
import ic.h;
import ic.j;
import j.l;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
public class a extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f7712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f7713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CoordinatorLayout f7714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f7715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7719n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f7720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cd.c f7722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public BottomSheetBehavior.g f7723r;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    public class C0120a implements y {
        public C0120a() {
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
            if (a.this.f7720o != null) {
                a.this.f7712g.F0(a.this.f7720o);
            }
            if (windowInsetsCompat != null) {
                a aVar = a.this;
                aVar.f7720o = new f(aVar.f7715j, windowInsetsCompat, null);
                a.this.f7720o.e(a.this.getWindow());
                a.this.f7712g.c0(a.this.f7720o);
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
            if (aVar.f7717l && aVar.isShowing() && a.this.A()) {
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
            if (!a.this.f7717l) {
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
                if (aVar.f7717l) {
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
        public final Boolean f7729a;

        @NonNull
        public final WindowInsetsCompat b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Window f7730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7731d;

        public /* synthetic */ f(View view, WindowInsetsCompat windowInsetsCompat, C0120a c0120a) {
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
                Window window = this.f7730c;
                if (window != null) {
                    Boolean bool = this.f7729a;
                    ad.d.f(window, bool == null ? this.f7731d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f7730c;
                if (window2 != null) {
                    ad.d.f(window2, this.f7731d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public void e(Window window) {
            if (this.f7730c == window) {
                return;
            }
            this.f7730c = window;
            if (window != null) {
                this.f7731d = c1.a(window, window.getDecorView()).b();
            }
        }

        public f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            this.b = windowInsetsCompat;
            g gVarT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListX = gVarT0 != null ? gVarT0.x() : o0.r(view);
            if (colorStateListX != null) {
                this.f7729a = Boolean.valueOf(uc.a.h(colorStateListX.getDefaultColor()));
                return;
            }
            Integer numE = r.e(view);
            if (numE != null) {
                this.f7729a = Boolean.valueOf(uc.a.h(numE.intValue()));
            } else {
                this.f7729a = null;
            }
        }
    }

    public a(@NonNull Context context, int i10) {
        super(context, m(context, i10));
        this.f7717l = true;
        this.f7718m = true;
        this.f7723r = new e();
        o(1);
        this.f7721p = getContext().getTheme().obtainStyledAttributes(new int[]{ic.b.f20617t}).getBoolean(0, false);
    }

    public static int m(@NonNull Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(ic.b.b, typedValue, true) ? typedValue.resourceId : j.f20754c;
    }

    public boolean A() {
        if (!this.f7719n) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f7718m = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f7719n = true;
        }
        return this.f7718m;
    }

    public final void B() {
        cd.c cVar = this.f7722q;
        if (cVar == null) {
            return;
        }
        if (this.f7717l) {
            cVar.b();
        } else {
            cVar.d();
        }
    }

    public final View C(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        u();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7713h.findViewById(ic.f.f20685e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f7721p) {
            o0.A0(this.f7715j, new C0120a());
        }
        this.f7715j.removeAllViews();
        if (layoutParams == null) {
            this.f7715j.addView(view);
        } else {
            this.f7715j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(ic.f.V).setOnClickListener(new b());
        o0.m0(this.f7715j, new c());
        this.f7715j.setOnTouchListener(new d());
        return this.f7713h;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorV = v();
        if (!this.f7716k || bottomSheetBehaviorV.v0() == 5) {
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
            boolean z10 = this.f7721p && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f7713h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f7714i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            c1.b(window, !z10);
            f fVar = this.f7720o;
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
        f fVar = this.f7720o;
        if (fVar != null) {
            fVar.e(null);
        }
        cd.c cVar = this.f7722q;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // e.w, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7712g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.v0() != 5) {
            return;
        }
        this.f7712g.X0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f7717l != z10) {
            this.f7717l = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7712g;
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
        if (z10 && !this.f7717l) {
            this.f7717l = true;
        }
        this.f7718m = z10;
        this.f7719n = true;
    }

    @Override // j.l, e.w, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(C(i10, null, null));
    }

    public final FrameLayout u() {
        if (this.f7713h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f20709a, null);
            this.f7713h = frameLayout;
            this.f7714i = (CoordinatorLayout) frameLayout.findViewById(ic.f.f20685e);
            FrameLayout frameLayout2 = (FrameLayout) this.f7713h.findViewById(ic.f.f20686f);
            this.f7715j = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f7712g = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f7723r);
            this.f7712g.P0(this.f7717l);
            this.f7722q = new cd.c(this.f7712g, this.f7715j);
        }
        return this.f7713h;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> v() {
        if (this.f7712g == null) {
            u();
        }
        return this.f7712g;
    }

    public boolean x() {
        return this.f7716k;
    }

    public void y() {
        this.f7712g.F0(this.f7723r);
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
