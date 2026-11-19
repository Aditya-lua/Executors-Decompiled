package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e.BackEventCompat;
import id.g;
import id.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jc.i;
import jd.e;
import jd.j;
import y2.p;
import y2.s;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements dd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jd.d f8033a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f8034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f8035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f8036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior<V>.d f8037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s3.c f8042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8046o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8047p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference<V> f8049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WeakReference<View> f8050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public VelocityTracker f8052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public dd.g f8053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final Set<j> f8055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s3.c.AbstractC0615c f8056y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f8032z = i.f20440w;
    public static final int A = jc.j.f20453n;

    public class a extends s3.c.AbstractC0615c {
        public a() {
        }

        @Override // s3.c.AbstractC0615c
        public int a(@NonNull View view, int i10, int i11) {
            return s2.a.c(i10, SideSheetBehavior.this.f8033a.g(), SideSheetBehavior.this.f8033a.f());
        }

        @Override // s3.c.AbstractC0615c
        public int b(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // s3.c.AbstractC0615c
        public int d(@NonNull View view) {
            return SideSheetBehavior.this.f8045n + SideSheetBehavior.this.k0();
        }

        @Override // s3.c.AbstractC0615c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f8039h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // s3.c.AbstractC0615c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f8033a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // s3.c.AbstractC0615c
        public void l(@NonNull View view, float f10, float f11) {
            int iW = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, iW, sideSheetBehavior.K0());
        }

        @Override // s3.c.AbstractC0615c
        public boolean m(@NonNull View view, int i10) {
            return (SideSheetBehavior.this.f8040i == 1 || SideSheetBehavior.this.f8049r == null || SideSheetBehavior.this.f8049r.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f8049r == null || SideSheetBehavior.this.f8049r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f8049r.get()).requestLayout();
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8060a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f8061c = new Runnable() { // from class: jd.i
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d.a(this.f20707a);
            }
        };

        public d() {
        }

        public static /* synthetic */ void a(d dVar) {
            dVar.b = false;
            if (SideSheetBehavior.this.f8042k != null && SideSheetBehavior.this.f8042k.k(true)) {
                dVar.b(dVar.f8060a);
            } else if (SideSheetBehavior.this.f8040i == 2) {
                SideSheetBehavior.this.G0(dVar.f8060a);
            }
        }

        public void b(int i10) {
            if (SideSheetBehavior.this.f8049r == null || SideSheetBehavior.this.f8049r.get() == null) {
                return;
            }
            this.f8060a = i10;
            if (this.b) {
                return;
            }
            o0.e0((View) SideSheetBehavior.this.f8049r.get(), this.f8061c);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.f8037f = new d();
        this.f8039h = true;
        this.f8040i = 5;
        this.f8041j = 5;
        this.f8044m = 0.1f;
        this.f8051t = -1;
        this.f8055x = new LinkedHashSet();
        this.f8056y = new a();
    }

    private void A0(@NonNull V v8, Runnable runnable) {
        if (v0(v8)) {
            v8.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean H0() {
        if (this.f8042k != null) {
            return this.f8039h || this.f8040i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, s.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        V v8 = sideSheetBehavior.f8049r.get();
        if (v8 != null) {
            sideSheetBehavior.L0(v8, i10, false);
        }
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f8033a.o(marginLayoutParams, kc.a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z10) {
        if (!w0(view, i10, z10)) {
            G0(i10);
        } else {
            G0(2);
            this.f8037f.b(i10);
        }
    }

    private void M0() {
        V v8;
        WeakReference<V> weakReference = this.f8049r;
        if (weakReference == null || (v8 = weakReference.get()) == null) {
            return;
        }
        o0.g0(v8, 262144);
        o0.g0(v8, 1048576);
        if (this.f8040i != 5) {
            y0(v8, p.a.f37218y, 5);
        }
        if (this.f8040i != 3) {
            y0(v8, p.a.f37216w, 3);
        }
    }

    private s Y(final int i10) {
        return new s() { // from class: jd.g
            @Override // y2.s
            public final boolean a(View view, s.a aVar) {
                return SideSheetBehavior.I(this.f20703a, i10, view, aVar);
            }
        };
    }

    private void Z(@NonNull Context context) {
        if (this.f8036e == null) {
            return;
        }
        g gVar = new g(this.f8036e);
        this.f8034c = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f8035d;
        if (colorStateList != null) {
            this.f8034c.a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f8034c.setTint(typedValue.data);
    }

    private int c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private void y0(V v8, p.a aVar, int i10) {
        o0.i0(v8, aVar, null, Y(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.B(coordinatorLayout, v8, cVar.a());
        }
        int i10 = cVar.f8059c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f8040i = i10;
        this.f8041j = i10;
    }

    public void B0(int i10) {
        this.f8051t = i10;
        X();
        WeakReference<V> weakReference = this.f8049r;
        if (weakReference != null) {
            V v8 = weakReference.get();
            if (i10 == -1 || !o0.R(v8)) {
                return;
            }
            v8.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8) {
        return new c(super.C(coordinatorLayout, v8), (SideSheetBehavior<?>) this);
    }

    public void C0(boolean z10) {
        this.f8039h = z10;
    }

    public final void D0(int i10) {
        jd.d dVar = this.f8033a;
        if (dVar == null || dVar.j() != i10) {
            if (i10 == 0) {
                this.f8033a = new jd.b(this);
                if (this.f8036e == null || s0()) {
                    return;
                }
                k.b bVarV = this.f8036e.v();
                bVarV.E(0.0f).w(0.0f);
                O0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f8033a = new jd.a(this);
                if (this.f8036e == null || r0()) {
                    return;
                }
                k.b bVarV2 = this.f8036e.v();
                bVarV2.A(0.0f).s(0.0f);
                O0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    public final void E0(@NonNull V v8, int i10) {
        D0(androidx.core.view.k.b(((CoordinatorLayout.f) v8.getLayoutParams()).f1535c, i10) == 3 ? 1 : 0);
    }

    public void F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f8049r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0(this.f8049r.get(), new Runnable() { // from class: jd.f
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(this.f20702a, i10);
                }
            });
        }
    }

    public void G0(int i10) {
        V v8;
        if (this.f8040i == i10) {
            return;
        }
        this.f8040i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f8041j = i10;
        }
        WeakReference<V> weakReference = this.f8049r;
        if (weakReference == null || (v8 = weakReference.get()) == null) {
            return;
        }
        P0(v8);
        Iterator<j> it = this.f8055x.iterator();
        while (it.hasNext()) {
            it.next().a(v8, i10);
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        if (!v8.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8040i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f8042k.z(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f8052u == null) {
            this.f8052u = VelocityTracker.obtain();
        }
        this.f8052u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f8043l && t0(motionEvent)) {
            this.f8042k.b(v8, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f8043l;
    }

    public boolean I0(@NonNull View view, float f10) {
        return this.f8033a.n(view, f10);
    }

    public final boolean J0(@NonNull V v8) {
        return (v8.isShown() || o0.o(v8) != null) && this.f8039h;
    }

    public boolean K0() {
        return true;
    }

    public final void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f8049r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v8 = this.f8049r.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f8033a.o(marginLayoutParams, (int) ((this.f8045n * v8.getScaleX()) + this.f8048q));
        viewF0.requestLayout();
    }

    public final void O0(@NonNull k kVar) {
        g gVar = this.f8034c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    public final void P0(@NonNull View view) {
        int i10 = this.f8040i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    public final int U(int i10, V v8) {
        int i11 = this.f8040i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f8033a.h(v8);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f8033a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f8040i);
    }

    public final float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    public final int W(@NonNull View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (I0(view, f10)) {
            return (this.f8033a.m(f10, f11) || this.f8033a.l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && e.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.f8033a.e()) ? 3 : 5;
    }

    public final void X() {
        WeakReference<View> weakReference = this.f8050s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8050s = null;
    }

    @Override // dd.b
    public void a(@NonNull BackEventCompat backEventCompat) {
        dd.g gVar = this.f8053v;
        if (gVar == null) {
            return;
        }
        gVar.l(backEventCompat, h0());
        N0();
    }

    public final void a0(@NonNull View view, int i10) {
        if (this.f8055x.isEmpty()) {
            return;
        }
        float fB = this.f8033a.b(i10);
        Iterator<j> it = this.f8055x.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    @Override // dd.b
    public void b() {
        dd.g gVar = this.f8053v;
        if (gVar == null) {
            return;
        }
        gVar.f();
    }

    public final void b0(View view) {
        if (o0.o(view) == null) {
            o0.p0(view, view.getResources().getString(f8032z));
        }
    }

    @Override // dd.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        dd.g gVar = this.f8053v;
        if (gVar == null) {
            return;
        }
        gVar.j(backEventCompat);
    }

    @Override // dd.b
    public void d() {
        dd.g gVar = this.f8053v;
        if (gVar == null) {
            return;
        }
        BackEventCompat backEventCompatC = gVar.c();
        if (backEventCompatC == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f8053v.h(backEventCompatC, h0(), new b(), e0());
        }
    }

    public int d0() {
        return this.f8045n;
    }

    public final ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f8033a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: jd.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(this.f20704a, marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    public View f0() {
        WeakReference<View> weakReference = this.f8050s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f8033a.d();
    }

    public final int h0() {
        jd.d dVar = this.f8033a;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    public float i0() {
        return this.f8044m;
    }

    public float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f8049r = null;
        this.f8042k = null;
        this.f8053v = null;
    }

    public int k0() {
        return this.f8048q;
    }

    public int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f8033a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    public int m0() {
        return this.f8047p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f8049r = null;
        this.f8042k = null;
        this.f8053v = null;
    }

    public int n0() {
        return this.f8046o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        s3.c cVar;
        if (!J0(v8)) {
            this.f8043l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f8052u == null) {
            this.f8052u = VelocityTracker.obtain();
        }
        this.f8052u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f8054w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f8043l) {
            this.f8043l = false;
            return false;
        }
        return (this.f8043l || (cVar = this.f8042k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    public int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10) {
        if (o0.w(coordinatorLayout) && !o0.w(v8)) {
            v8.setFitsSystemWindows(true);
        }
        if (this.f8049r == null) {
            this.f8049r = new WeakReference<>(v8);
            this.f8053v = new dd.g(v8);
            g gVar = this.f8034c;
            if (gVar != null) {
                o0.q0(v8, gVar);
                g gVar2 = this.f8034c;
                float fU = this.f8038g;
                if (fU == -1.0f) {
                    fU = o0.u(v8);
                }
                gVar2.Z(fU);
            } else {
                ColorStateList colorStateList = this.f8035d;
                if (colorStateList != null) {
                    o0.r0(v8, colorStateList);
                }
            }
            P0(v8);
            M0();
            if (o0.x(v8) == 0) {
                o0.w0(v8, 1);
            }
            b0(v8);
        }
        E0(v8, i10);
        if (this.f8042k == null) {
            this.f8042k = s3.c.m(coordinatorLayout, this.f8056y);
        }
        int iH = this.f8033a.h(v8);
        coordinatorLayout.I(v8, i10);
        this.f8046o = coordinatorLayout.getWidth();
        this.f8047p = this.f8033a.i(coordinatorLayout);
        this.f8045n = v8.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v8.getLayoutParams();
        this.f8048q = marginLayoutParams != null ? this.f8033a.a(marginLayoutParams) : 0;
        o0.W(v8, U(iH, v8));
        x0(coordinatorLayout);
        for (j jVar : this.f8055x) {
            if (jVar instanceof j) {
                jVar.c(v8);
            }
        }
        return true;
    }

    public s3.c p0() {
        return this.f8042k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v8.getLayoutParams();
        v8.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public final CoordinatorLayout.f q0() {
        V v8;
        WeakReference<V> weakReference = this.f8049r;
        if (weakReference == null || (v8 = weakReference.get()) == null || !(v8.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v8.getLayoutParams();
    }

    public final boolean r0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).leftMargin > 0;
    }

    public final boolean s0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).rightMargin > 0;
    }

    public final boolean t0(@NonNull MotionEvent motionEvent) {
        return H0() && V((float) this.f8054w, motionEvent.getX()) > ((float) this.f8042k.u());
    }

    public final boolean u0(float f10) {
        return this.f8033a.k(f10);
    }

    public final boolean v0(@NonNull V v8) {
        ViewParent parent = v8.getParent();
        return parent != null && parent.isLayoutRequested() && o0.Q(v8);
    }

    public final boolean w0(View view, int i10, boolean z10) {
        int iL0 = l0(i10);
        s3.c cVarP0 = p0();
        if (cVarP0 == null) {
            return false;
        }
        if (z10) {
            return cVarP0.F(iL0, view.getTop());
        }
        return cVarP0.H(view, iL0, view.getTop());
    }

    public final void x0(@NonNull CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f8050s != null || (i10 = this.f8051t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f8050s = new WeakReference<>(viewFindViewById);
    }

    public final void z0() {
        VelocityTracker velocityTracker = this.f8052u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8052u = null;
        }
    }

    public static class c extends r3.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8059c;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8059c = parcel.readInt();
        }

        @Override // r3.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f8059c);
        }

        public c(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f8059c = sideSheetBehavior.f8040i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8037f = new d();
        this.f8039h = true;
        this.f8040i = 5;
        this.f8041j = 5;
        this.f8044m = 0.1f;
        this.f8051t = -1;
        this.f8055x = new LinkedHashSet();
        this.f8056y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jc.k.D5);
        if (typedArrayObtainStyledAttributes.hasValue(jc.k.F5)) {
            this.f8035d = fd.c.a(context, typedArrayObtainStyledAttributes, jc.k.F5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(jc.k.I5)) {
            this.f8036e = k.e(context, attributeSet, 0, A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(jc.k.H5)) {
            B0(typedArrayObtainStyledAttributes.getResourceId(jc.k.H5, -1));
        }
        Z(context);
        this.f8038g = typedArrayObtainStyledAttributes.getDimension(jc.k.E5, -1.0f);
        C0(typedArrayObtainStyledAttributes.getBoolean(jc.k.G5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
