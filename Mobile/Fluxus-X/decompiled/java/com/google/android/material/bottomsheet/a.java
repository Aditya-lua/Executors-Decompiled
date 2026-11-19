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
import bd.r;
import id.g;
import j.l;
import jc.h;
import jc.j;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
public class a extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f7556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f7557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CoordinatorLayout f7558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f7559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f7564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public dd.c f7566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public BottomSheetBehavior.g f7567r;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    public class C0120a implements y {
        public C0120a() {
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
            if (a.this.f7564o != null) {
                a.this.f7556g.F0(a.this.f7564o);
            }
            if (windowInsetsCompat != null) {
                a aVar = a.this;
                aVar.f7564o = new f(aVar.f7559j, windowInsetsCompat, null);
                a.this.f7564o.e(a.this.getWindow());
                a.this.f7556g.c0(a.this.f7564o);
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
            if (aVar.f7561l && aVar.isShowing() && a.this.z()) {
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
            if (!a.this.f7561l) {
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
                if (aVar.f7561l) {
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
        public final Boolean f7573a;

        @NonNull
        public final WindowInsetsCompat b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Window f7574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7575d;

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
                Window window = this.f7574c;
                if (window != null) {
                    Boolean bool = this.f7573a;
                    bd.d.f(window, bool == null ? this.f7575d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f7574c;
                if (window2 != null) {
                    bd.d.f(window2, this.f7575d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public void e(Window window) {
            if (this.f7574c == window) {
                return;
            }
            this.f7574c = window;
            if (window != null) {
                this.f7575d = c1.a(window, window.getDecorView()).b();
            }
        }

        public f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            this.b = windowInsetsCompat;
            g gVarT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListX = gVarT0 != null ? gVarT0.x() : o0.r(view);
            if (colorStateListX != null) {
                this.f7573a = Boolean.valueOf(vc.a.h(colorStateListX.getDefaultColor()));
                return;
            }
            Integer numE = r.e(view);
            if (numE != null) {
                this.f7573a = Boolean.valueOf(vc.a.h(numE.intValue()));
            } else {
                this.f7573a = null;
            }
        }
    }

    public a(@NonNull Context context, int i10) {
        super(context, m(context, i10));
        this.f7561l = true;
        this.f7562m = true;
        this.f7567r = new e();
        o(1);
        this.f7565p = getContext().getTheme().obtainStyledAttributes(new int[]{jc.b.f20305t}).getBoolean(0, false);
    }

    public static int m(@NonNull Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(jc.b.b, typedValue, true) ? typedValue.resourceId : j.f20442c;
    }

    public final void B() {
        dd.c cVar = this.f7566q;
        if (cVar == null) {
            return;
        }
        if (this.f7561l) {
            cVar.b();
        } else {
            cVar.d();
        }
    }

    public final View C(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        u();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7557h.findViewById(jc.f.f20373e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f7565p) {
            o0.A0(this.f7559j, new C0120a());
        }
        this.f7559j.removeAllViews();
        if (layoutParams == null) {
            this.f7559j.addView(view);
        } else {
            this.f7559j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(jc.f.V).setOnClickListener(new b());
        o0.m0(this.f7559j, new c());
        this.f7559j.setOnTouchListener(new d());
        return this.f7557h;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorV = v();
        if (!this.f7560k || bottomSheetBehaviorV.v0() == 5) {
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
            boolean z10 = this.f7565p && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f7557h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f7558i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            c1.b(window, !z10);
            f fVar = this.f7564o;
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
        f fVar = this.f7564o;
        if (fVar != null) {
            fVar.e(null);
        }
        dd.c cVar = this.f7566q;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // e.w, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7556g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.v0() != 5) {
            return;
        }
        this.f7556g.X0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f7561l != z10) {
            this.f7561l = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7556g;
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
        if (z10 && !this.f7561l) {
            this.f7561l = true;
        }
        this.f7562m = z10;
        this.f7563n = true;
    }

    @Override // j.l, e.w, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(C(i10, null, null));
    }

    public final FrameLayout u() {
        if (this.f7557h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f20397a, null);
            this.f7557h = frameLayout;
            this.f7558i = (CoordinatorLayout) frameLayout.findViewById(jc.f.f20373e);
            FrameLayout frameLayout2 = (FrameLayout) this.f7557h.findViewById(jc.f.f20374f);
            this.f7559j = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f7556g = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f7567r);
            this.f7556g.P0(this.f7561l);
            this.f7566q = new dd.c(this.f7556g, this.f7559j);
        }
        return this.f7557h;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> v() {
        if (this.f7556g == null) {
            u();
        }
        return this.f7556g;
    }

    public boolean w() {
        return this.f7560k;
    }

    public void y() {
        this.f7556g.F0(this.f7567r);
    }

    public boolean z() {
        if (!this.f7563n) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f7562m = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f7563n = true;
        }
        return this.f7562m;
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
