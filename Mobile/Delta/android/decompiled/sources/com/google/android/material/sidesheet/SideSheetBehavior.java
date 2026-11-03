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
import androidx.customview.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e.BackEventCompat;
import hd.g;
import hd.k;
import ic.i;
import id.d;
import id.e;
import id.j;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import y2.p;
import y2.s;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements cd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f8189a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f8190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f8191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f8192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior<V>.c f8193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r3.c f8198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference<V> f8205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WeakReference<View> f8206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public VelocityTracker f8208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public cd.g f8209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final Set<j> f8211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r3.c.AbstractC0531c f8212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f8188z = i.f20752w;
    public static final int A = ic.j.f20765n;

    public class a extends r3.c.AbstractC0531c {
        public a() {
        }

        @Override // r3.c.AbstractC0531c
        public int a(@NonNull View view, int i10, int i11) {
            return s2.a.c(i10, SideSheetBehavior.this.f8189a.g(), SideSheetBehavior.this.f8189a.f());
        }

        @Override // r3.c.AbstractC0531c
        public int b(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // r3.c.AbstractC0531c
        public int d(@NonNull View view) {
            return SideSheetBehavior.this.f8201n + SideSheetBehavior.this.k0();
        }

        @Override // r3.c.AbstractC0531c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f8195h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // r3.c.AbstractC0531c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f8189a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // r3.c.AbstractC0531c
        public void l(@NonNull View view, float f10, float f11) {
            int iW = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, iW, sideSheetBehavior.K0());
        }

        @Override // r3.c.AbstractC0531c
        public boolean m(@NonNull View view, int i10) {
            return (SideSheetBehavior.this.f8196i == 1 || SideSheetBehavior.this.f8205r == null || SideSheetBehavior.this.f8205r.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f8205r == null || SideSheetBehavior.this.f8205r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f8205r.get()).requestLayout();
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8216a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f8217c = new Runnable() { // from class: id.i
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(this.f21019a);
            }
        };

        public c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.b = false;
            if (SideSheetBehavior.this.f8198k != null && SideSheetBehavior.this.f8198k.k(true)) {
                cVar.b(cVar.f8216a);
            } else if (SideSheetBehavior.this.f8196i == 2) {
                SideSheetBehavior.this.G0(cVar.f8216a);
            }
        }

        public void b(int i10) {
            if (SideSheetBehavior.this.f8205r == null || SideSheetBehavior.this.f8205r.get() == null) {
                return;
            }
            this.f8216a = i10;
            if (this.b) {
                return;
            }
            o0.e0((View) SideSheetBehavior.this.f8205r.get(), this.f8217c);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.f8193f = new c();
        this.f8195h = true;
        this.f8196i = 5;
        this.f8197j = 5;
        this.f8200m = 0.1f;
        this.f8207t = -1;
        this.f8211x = new LinkedHashSet();
        this.f8212y = new a();
    }

    private void A0(@NonNull V v5, Runnable runnable) {
        if (v0(v5)) {
            v5.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean H0() {
        if (this.f8198k != null) {
            return this.f8195h || this.f8196i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, s.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        V v5 = sideSheetBehavior.f8205r.get();
        if (v5 != null) {
            sideSheetBehavior.L0(v5, i10, false);
        }
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f8189a.o(marginLayoutParams, jc.a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z10) {
        if (!w0(view, i10, z10)) {
            G0(i10);
        } else {
            G0(2);
            this.f8193f.b(i10);
        }
    }

    private void M0() {
        V v5;
        WeakReference<V> weakReference = this.f8205r;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        o0.g0(v5, 262144);
        o0.g0(v5, 1048576);
        if (this.f8196i != 5) {
            y0(v5, p.a.f36379y, 5);
        }
        if (this.f8196i != 3) {
            y0(v5, p.a.f36377w, 3);
        }
    }

    private s Y(final int i10) {
        return new s() { // from class: id.g
            @Override // y2.s
            public final boolean a(View view, s.a aVar) {
                return SideSheetBehavior.I(this.f21015a, i10, view, aVar);
            }
        };
    }

    private void Z(@NonNull Context context) {
        if (this.f8192e == null) {
            return;
        }
        g gVar = new g(this.f8192e);
        this.f8190c = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f8191d;
        if (colorStateList != null) {
            this.f8190c.a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f8190c.setTint(typedValue.data);
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

    private void y0(V v5, p.a aVar, int i10) {
        o0.i0(v5, aVar, null, Y(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.B(coordinatorLayout, v5, savedState.a());
        }
        int i10 = savedState.f8213c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f8196i = i10;
        this.f8197j = i10;
    }

    public void B0(int i10) {
        this.f8207t = i10;
        X();
        WeakReference<V> weakReference = this.f8205r;
        if (weakReference != null) {
            V v5 = weakReference.get();
            if (i10 == -1 || !o0.R(v5)) {
                return;
            }
            v5.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
        return new SavedState(super.C(coordinatorLayout, v5), (SideSheetBehavior<?>) this);
    }

    public void C0(boolean z10) {
        this.f8195h = z10;
    }

    public final void D0(int i10) {
        d dVar = this.f8189a;
        if (dVar == null || dVar.j() != i10) {
            if (i10 == 0) {
                this.f8189a = new id.b(this);
                if (this.f8192e == null || s0()) {
                    return;
                }
                k.b bVarV = this.f8192e.v();
                bVarV.E(0.0f).w(0.0f);
                O0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f8189a = new id.a(this);
                if (this.f8192e == null || r0()) {
                    return;
                }
                k.b bVarV2 = this.f8192e.v();
                bVarV2.A(0.0f).s(0.0f);
                O0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    public final void E0(@NonNull V v5, int i10) {
        D0(androidx.core.view.k.b(((CoordinatorLayout.f) v5.getLayoutParams()).f1574c, i10) == 3 ? 1 : 0);
    }

    public void F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f8205r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0(this.f8205r.get(), new Runnable() { // from class: id.f
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(this.f21014a, i10);
                }
            });
        }
    }

    public void G0(int i10) {
        V v5;
        if (this.f8196i == i10) {
            return;
        }
        this.f8196i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f8197j = i10;
        }
        WeakReference<V> weakReference = this.f8205r;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        P0(v5);
        Iterator<j> it = this.f8211x.iterator();
        while (it.hasNext()) {
            it.next().a(v5, i10);
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8196i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f8198k.z(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f8208u == null) {
            this.f8208u = VelocityTracker.obtain();
        }
        this.f8208u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f8199l && t0(motionEvent)) {
            this.f8198k.b(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f8199l;
    }

    public boolean I0(@NonNull View view, float f10) {
        return this.f8189a.n(view, f10);
    }

    public final boolean J0(@NonNull V v5) {
        return (v5.isShown() || o0.o(v5) != null) && this.f8195h;
    }

    public boolean K0() {
        return true;
    }

    public final void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f8205r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v5 = this.f8205r.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f8189a.o(marginLayoutParams, (int) ((this.f8201n * v5.getScaleX()) + this.f8204q));
        viewF0.requestLayout();
    }

    public final void O0(@NonNull k kVar) {
        g gVar = this.f8190c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    public final void P0(@NonNull View view) {
        int i10 = this.f8196i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    public final int U(int i10, V v5) {
        int i11 = this.f8196i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f8189a.h(v5);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f8189a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f8196i);
    }

    public final float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    public final int W(@NonNull View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (I0(view, f10)) {
            return (this.f8189a.m(f10, f11) || this.f8189a.l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && e.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.f8189a.e()) ? 3 : 5;
    }

    public final void X() {
        WeakReference<View> weakReference = this.f8206s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8206s = null;
    }

    @Override // cd.b
    public void a(@NonNull BackEventCompat backEventCompat) {
        cd.g gVar = this.f8209v;
        if (gVar == null) {
            return;
        }
        gVar.l(backEventCompat, h0());
        N0();
    }

    public final void a0(@NonNull View view, int i10) {
        if (this.f8211x.isEmpty()) {
            return;
        }
        float fB = this.f8189a.b(i10);
        Iterator<j> it = this.f8211x.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    @Override // cd.b
    public void b() {
        cd.g gVar = this.f8209v;
        if (gVar == null) {
            return;
        }
        gVar.f();
    }

    public final void b0(View view) {
        if (o0.o(view) == null) {
            o0.p0(view, view.getResources().getString(f8188z));
        }
    }

    @Override // cd.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        cd.g gVar = this.f8209v;
        if (gVar == null) {
            return;
        }
        gVar.j(backEventCompat);
    }

    @Override // cd.b
    public void d() {
        cd.g gVar = this.f8209v;
        if (gVar == null) {
            return;
        }
        BackEventCompat backEventCompatC = gVar.c();
        if (backEventCompatC == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f8209v.h(backEventCompatC, h0(), new b(), e0());
        }
    }

    public int d0() {
        return this.f8201n;
    }

    public final ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f8189a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: id.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(this.f21016a, marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    public View f0() {
        WeakReference<View> weakReference = this.f8206s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f8189a.d();
    }

    public final int h0() {
        d dVar = this.f8189a;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    public float i0() {
        return this.f8200m;
    }

    public float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f8205r = null;
        this.f8198k = null;
        this.f8209v = null;
    }

    public int k0() {
        return this.f8204q;
    }

    public int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f8189a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    public int m0() {
        return this.f8203p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f8205r = null;
        this.f8198k = null;
        this.f8209v = null;
    }

    public int n0() {
        return this.f8202o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        r3.c cVar;
        if (!J0(v5)) {
            this.f8199l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f8208u == null) {
            this.f8208u = VelocityTracker.obtain();
        }
        this.f8208u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f8210w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f8199l) {
            this.f8199l = false;
            return false;
        }
        return (this.f8199l || (cVar = this.f8198k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    public int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        if (o0.w(coordinatorLayout) && !o0.w(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.f8205r == null) {
            this.f8205r = new WeakReference<>(v5);
            this.f8209v = new cd.g(v5);
            g gVar = this.f8190c;
            if (gVar != null) {
                o0.q0(v5, gVar);
                g gVar2 = this.f8190c;
                float fU = this.f8194g;
                if (fU == -1.0f) {
                    fU = o0.u(v5);
                }
                gVar2.Z(fU);
            } else {
                ColorStateList colorStateList = this.f8191d;
                if (colorStateList != null) {
                    o0.r0(v5, colorStateList);
                }
            }
            P0(v5);
            M0();
            if (o0.x(v5) == 0) {
                o0.w0(v5, 1);
            }
            b0(v5);
        }
        E0(v5, i10);
        if (this.f8198k == null) {
            this.f8198k = r3.c.m(coordinatorLayout, this.f8212y);
        }
        int iH = this.f8189a.h(v5);
        coordinatorLayout.I(v5, i10);
        this.f8202o = coordinatorLayout.getWidth();
        this.f8203p = this.f8189a.i(coordinatorLayout);
        this.f8201n = v5.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        this.f8204q = marginLayoutParams != null ? this.f8189a.a(marginLayoutParams) : 0;
        o0.W(v5, U(iH, v5));
        x0(coordinatorLayout);
        for (j jVar : this.f8211x) {
            if (jVar instanceof j) {
                jVar.c(v5);
            }
        }
        return true;
    }

    public r3.c p0() {
        return this.f8198k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        v5.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public final CoordinatorLayout.f q0() {
        V v5;
        WeakReference<V> weakReference = this.f8205r;
        if (weakReference == null || (v5 = weakReference.get()) == null || !(v5.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v5.getLayoutParams();
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
        return H0() && V((float) this.f8210w, motionEvent.getX()) > ((float) this.f8198k.u());
    }

    public final boolean u0(float f10) {
        return this.f8189a.k(f10);
    }

    public final boolean v0(@NonNull V v5) {
        ViewParent parent = v5.getParent();
        return parent != null && parent.isLayoutRequested() && o0.Q(v5);
    }

    public final boolean w0(View view, int i10, boolean z10) {
        int iL0 = l0(i10);
        r3.c cVarP0 = p0();
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
        if (this.f8206s != null || (i10 = this.f8207t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f8206s = new WeakReference<>(viewFindViewById);
    }

    public final void z0() {
        VelocityTracker velocityTracker = this.f8208u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8208u = null;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8213c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8213c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f8213c);
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f8213c = sideSheetBehavior.f8196i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8193f = new c();
        this.f8195h = true;
        this.f8196i = 5;
        this.f8197j = 5;
        this.f8200m = 0.1f;
        this.f8207t = -1;
        this.f8211x = new LinkedHashSet();
        this.f8212y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.k.D5);
        int i10 = ic.k.F5;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f8191d = ed.c.a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ic.k.I5)) {
            this.f8192e = k.e(context, attributeSet, 0, A).m();
        }
        int i11 = ic.k.H5;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            B0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        Z(context);
        this.f8194g = typedArrayObtainStyledAttributes.getDimension(ic.k.E5, -1.0f);
        C0(typedArrayObtainStyledAttributes.getBoolean(ic.k.G5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
