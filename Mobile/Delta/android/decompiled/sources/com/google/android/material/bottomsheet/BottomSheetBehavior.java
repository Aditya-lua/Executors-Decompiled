package com.google.android.material.bottomsheet;

import ad.r;
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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import e.BackEventCompat;
import hd.k;
import ic.i;
import ic.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import y2.p;
import y2.s;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements cd.b {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f7662i0 = j.f20758g;
    public boolean A;
    public final BottomSheetBehavior<V>.h B;
    public ValueAnimator C;
    public int D;
    public int E;
    public int F;
    public float G;
    public int H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public r3.c O;
    public boolean P;
    public int Q;
    public boolean R;
    public float S;
    public int T;
    public int U;
    public int V;
    public WeakReference<V> W;
    public WeakReference<View> X;
    public WeakReference<View> Y;

    @NonNull
    public final ArrayList<g> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7663a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public VelocityTracker f7664a0;
    public boolean b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public cd.e f7665b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7666c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f7667c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7668d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f7669d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7670e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f7671e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7672f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Map<View, Integer> f7673f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7674g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final SparseIntArray f7675g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7676h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final r3.c.AbstractC0531c f7677h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hd.g f7679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f7680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7690u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7693x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7694y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f7695z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7701a;
        public final /* synthetic */ int b;

        public a(View view, int i10) {
            this.f7701a = view;
            this.b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.g1(this.f7701a, this.b, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.Y0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.W.get().requestLayout();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f7679j != null) {
                BottomSheetBehavior.this.f7679j.b0(fFloatValue);
            }
        }
    }

    public class d implements r.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7705a;

        public d(boolean z10) {
            this.f7705a = z10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // ad.r.c
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, r.d dVar) {
            boolean z10;
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures());
            BottomSheetBehavior.this.f7693x = insets.top;
            boolean zH = r.h(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f7685p) {
                BottomSheetBehavior.this.f7692w = windowInsetsCompat.getSystemWindowInsetBottom();
                paddingBottom = dVar.f401d + BottomSheetBehavior.this.f7692w;
            }
            if (BottomSheetBehavior.this.f7686q) {
                paddingLeft = (zH ? dVar.f400c : dVar.f399a) + insets.left;
            }
            if (BottomSheetBehavior.this.f7687r) {
                paddingRight = (zH ? dVar.f399a : dVar.f400c) + insets.right;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f7689t) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = insets.left;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (BottomSheetBehavior.this.f7690u) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = insets.right;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
            }
            if (BottomSheetBehavior.this.f7691v) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = insets.top;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                } else {
                    z11 = z10;
                }
            } else {
                z11 = z10;
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f7705a) {
                BottomSheetBehavior.this.f7683n = insets2.bottom;
            }
            if (!BottomSheetBehavior.this.f7685p && !this.f7705a) {
                return windowInsetsCompat;
            }
            BottomSheetBehavior.this.l1(false);
            return windowInsetsCompat;
        }
    }

    public class e extends r3.c.AbstractC0531c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7706a;

        public e() {
        }

        @Override // r3.c.AbstractC0531c
        public int a(@NonNull View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // r3.c.AbstractC0531c
        public int b(@NonNull View view, int i10, int i11) {
            return s2.a.c(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // r3.c.AbstractC0531c
        public int e(@NonNull View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // r3.c.AbstractC0531c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.Y0(1);
            }
        }

        @Override // r3.c.AbstractC0531c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // r3.c.AbstractC0531c
        public void l(@NonNull View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J && bottomSheetBehavior.d1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f7670e) || n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.b || Math.abs(view.getTop() - BottomSheetBehavior.this.s0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.F)) {
                        i10 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.F;
                        if (top < i11) {
                            if (top < Math.abs(top - bottomSheetBehavior2.H)) {
                                i10 = 3;
                            } else if (BottomSheetBehavior.this.e1()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.H) || BottomSheetBehavior.this.e1()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.E) < Math.abs(top - BottomSheetBehavior.this.H)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (BottomSheetBehavior.this.b) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.F) >= Math.abs(top2 - BottomSheetBehavior.this.H) || BottomSheetBehavior.this.e1()) {
                        i10 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.b) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f7706a;
                if (BottomSheetBehavior.this.e1()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.b1(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.V)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.F) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.g1(view, i10, bottomSheetBehavior4.f1());
        }

        @Override // r3.c.AbstractC0531c
        public boolean m(@NonNull View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.M;
            if (i11 == 1 || bottomSheetBehavior.f7671e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f7667c0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f7706a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.s0()) / 2;
        }
    }

    public class f implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7707a;

        public f(int i10) {
            this.f7707a = i10;
        }

        @Override // y2.s
        public boolean a(@NonNull View view, s.a aVar) {
            BottomSheetBehavior.this.X0(this.f7707a);
            return true;
        }
    }

    public static abstract class g {
        public void a(@NonNull View view) {
        }

        public abstract void b(@NonNull View view, float f10);

        public abstract void c(@NonNull View view, int i10);
    }

    public BottomSheetBehavior() {
        this.f7663a = 0;
        this.b = true;
        this.f7666c = false;
        this.f7681l = -1;
        this.f7682m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f7669d0 = -1;
        this.f7675g0 = new SparseIntArray();
        this.f7677h0 = new e();
    }

    private void H0() {
        this.f7667c0 = -1;
        this.f7669d0 = -1;
        VelocityTracker velocityTracker = this.f7664a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7664a0 = null;
        }
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> q0(@NonNull V v5) {
        ViewGroup.LayoutParams layoutParams = v5.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public boolean A0() {
        return this.f7684o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.B(coordinatorLayout, v5, savedState.a());
        I0(savedState);
        int i10 = savedState.f7696c;
        if (i10 == 1 || i10 == 2) {
            this.M = 4;
            this.N = 4;
        } else {
            this.M = i10;
            this.N = i10;
        }
    }

    public boolean B0() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
        return new SavedState(super.C(coordinatorLayout, v5), (BottomSheetBehavior<?>) this);
    }

    public boolean C0() {
        return true;
    }

    public final boolean D0(V v5) {
        ViewParent parent = v5.getParent();
        return parent != null && parent.isLayoutRequested() && o0.Q(v5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        return (i10 & 2) != 0;
    }

    public boolean E0() {
        return true;
    }

    public void F0(@NonNull g gVar) {
        this.Z.remove(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10) {
        WeakReference<View> weakReference;
        int i11 = 3;
        if (v5.getTop() == s0()) {
            Y0(3);
            return;
        }
        if (!E0() || ((weakReference = this.Y) != null && view == weakReference.get() && this.R)) {
            if (this.Q > 0) {
                if (!this.b && v5.getTop() > this.F) {
                    i11 = 6;
                }
            } else if (this.J && d1(v5, x0())) {
                i11 = 5;
            } else if (this.Q == 0) {
                int top = v5.getTop();
                if (!this.b) {
                    int i12 = this.F;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.H)) {
                            if (e1()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.H)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.E) >= Math.abs(top - this.H)) {
                    i11 = 4;
                }
            } else {
                if (!this.b) {
                    int top2 = v5.getTop();
                    if (Math.abs(top2 - this.F) < Math.abs(top2 - this.H)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            g1(v5, i11, false);
            this.R = false;
        }
    }

    public final void G0(View view, p.a aVar, int i10) {
        o0.i0(view, aVar, null, l0(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (c1()) {
            this.O.z(motionEvent);
        }
        if (actionMasked == 0) {
            H0();
        }
        if (this.f7664a0 == null) {
            this.f7664a0 = VelocityTracker.obtain();
        }
        this.f7664a0.addMovement(motionEvent);
        if (c1() && actionMasked == 2 && !this.P && Math.abs(this.f7669d0 - motionEvent.getY()) > this.O.u()) {
            this.O.b(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public final void I0(@NonNull SavedState savedState) {
        int i10 = this.f7663a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f7672f = savedState.f7697d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.b = savedState.f7698e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.J = savedState.f7699f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.K = savedState.f7700g;
        }
    }

    public final void J0(V v5, Runnable runnable) {
        if (D0(v5)) {
            v5.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void K0(boolean z10) {
        this.L = z10;
    }

    public void L0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i10;
        j1(this.M, true);
    }

    public void M0(boolean z10) {
        if (this.b == z10) {
            return;
        }
        this.b = z10;
        if (this.W != null) {
            d0();
        }
        Y0((this.b && this.M == 6) ? 3 : this.M);
        j1(this.M, true);
        h1();
    }

    public void N0(boolean z10) {
        this.f7684o = z10;
    }

    public void O0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f10;
        if (this.W != null) {
            f0();
        }
    }

    public void P0(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10 && this.M == 5) {
                X0(4);
            }
            h1();
        }
    }

    public void Q0(int i10) {
        this.f7682m = i10;
    }

    public void R0(int i10) {
        this.f7681l = i10;
    }

    public void S0(int i10) {
        T0(i10, false);
    }

    public final void T0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f7674g) {
                return;
            } else {
                this.f7674g = true;
            }
        } else {
            if (!this.f7674g && this.f7672f == i10) {
                return;
            }
            this.f7674g = false;
            this.f7672f = Math.max(0, i10);
        }
        l1(z10);
    }

    public void U0(int i10) {
        this.f7663a = i10;
    }

    public void V0(int i10) {
        this.f7670e = i10;
    }

    public void W0(boolean z10) {
        this.K = z10;
    }

    public void X0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.b && w0(i10) <= this.E) ? 3 : i10;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            Y0(i10);
        } else {
            V v5 = this.W.get();
            J0(v5, new a(v5, i11));
        }
    }

    public void Y0(int i10) {
        V v5;
        if (this.M == i10) {
            return;
        }
        this.M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.J && i10 == 5)) {
            this.N = i10;
        }
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            k1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            k1(false);
        }
        j1(i10, true);
        for (int i11 = 0; i11 < this.Z.size(); i11++) {
            this.Z.get(i11).c(v5, i10);
        }
        h1();
    }

    public void Z0(boolean z10) {
        this.f7666c = z10;
    }

    @Override // cd.b
    public void a(@NonNull BackEventCompat backEventCompat) {
        cd.e eVar = this.f7665b0;
        if (eVar == null) {
            return;
        }
        eVar.l(backEventCompat);
    }

    public final void a1(@NonNull View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || A0() || this.f7674g) ? false : true;
        if (this.f7685p || this.f7686q || this.f7687r || this.f7689t || this.f7690u || this.f7691v || z10) {
            r.c(view, new d(z10));
        }
    }

    @Override // cd.b
    public void b() {
        cd.e eVar = this.f7665b0;
        if (eVar == null) {
            return;
        }
        eVar.f();
    }

    public final int b0(View view, int i10, int i11) {
        return o0.c(view, view.getResources().getString(i10), l0(i11));
    }

    public boolean b1(long j10, float f10) {
        return false;
    }

    @Override // cd.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        cd.e eVar = this.f7665b0;
        if (eVar == null) {
            return;
        }
        eVar.j(backEventCompat);
    }

    public void c0(@NonNull g gVar) {
        if (this.Z.contains(gVar)) {
            return;
        }
        this.Z.add(gVar);
    }

    public final boolean c1() {
        if (this.O != null) {
            return this.L || this.M == 1;
        }
        return false;
    }

    @Override // cd.b
    public void d() {
        cd.e eVar = this.f7665b0;
        if (eVar == null) {
            return;
        }
        BackEventCompat backEventCompatC = eVar.c();
        if (backEventCompatC == null || Build.VERSION.SDK_INT < 34) {
            X0(this.J ? 5 : 4);
        } else if (this.J) {
            this.f7665b0.h(backEventCompatC, new b());
        } else {
            this.f7665b0.i(backEventCompatC, null);
            X0(4);
        }
    }

    public final void d0() {
        int iH0 = h0();
        if (this.b) {
            this.H = Math.max(this.V - iH0, this.E);
        } else {
            this.H = this.V - iH0;
        }
    }

    public boolean d1(@NonNull View view, float f10) {
        if (this.K) {
            return true;
        }
        if (C0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.S)) - ((float) this.H)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    public final float e0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    public boolean e1() {
        return false;
    }

    public final void f0() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    public boolean f1() {
        return true;
    }

    public final float g0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f7679j == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v5 = this.W.get();
        if (!y0() || (rootWindowInsets = v5.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f7679j.J(), rootWindowInsets.getRoundedCorner(0)), e0(this.f7679j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    public final void g1(View view, int i10, boolean z10) {
        int iW0 = w0(i10);
        r3.c cVar = this.O;
        if (cVar == null || (!z10 ? cVar.H(view, view.getLeft(), iW0) : cVar.F(view.getLeft(), iW0))) {
            Y0(i10);
            return;
        }
        Y0(2);
        j1(i10, true);
        this.B.c(i10);
    }

    public final int h0() {
        int i10;
        if (this.f7674g) {
            return Math.min(Math.max(this.f7676h, this.V - ((this.U * 9) / 16)), this.T) + this.f7692w;
        }
        return (this.f7684o || this.f7685p || (i10 = this.f7683n) <= 0) ? this.f7672f + this.f7692w : Math.max(this.f7672f, i10 + this.f7678i);
    }

    public final void h1() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null) {
            i1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.X;
        if (weakReference2 != null) {
            i1(weakReference2.get(), 1);
        }
    }

    public final float i0(int i10) {
        float f10;
        float fS0;
        int i11 = this.H;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.H;
            f10 = i12 - i10;
            fS0 = this.V - i12;
        } else {
            int i13 = this.H;
            f10 = i13 - i10;
            fS0 = i13 - s0();
        }
        return f10 / fS0;
    }

    public final void i1(View view, int i10) {
        if (view == null) {
            return;
        }
        k0(view, i10);
        if (!this.b && this.M != 6) {
            this.f7675g0.put(i10, b0(view, i.f20731a, 6));
        }
        if (this.J && C0() && this.M != 5) {
            G0(view, p.a.f36379y, 5);
        }
        int i11 = this.M;
        if (i11 == 3) {
            G0(view, p.a.f36378x, this.b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            G0(view, p.a.f36377w, this.b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            G0(view, p.a.f36378x, 4);
            G0(view, p.a.f36377w, 3);
        }
    }

    public final boolean j0() {
        return B0() && C0();
    }

    public final void j1(int i10, boolean z10) {
        boolean zZ0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.A == (zZ0 = z0()) || this.f7679j == null) {
            return;
        }
        this.A = zZ0;
        if (!z10 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f7679j.b0(this.A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.f7679j.y(), zZ0 ? g0() : 1.0f);
            this.C.start();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.W = null;
        this.O = null;
        this.f7665b0 = null;
    }

    public final void k0(View view, int i10) {
        if (view == null) {
            return;
        }
        o0.g0(view, 524288);
        o0.g0(view, 262144);
        o0.g0(view, 1048576);
        int i11 = this.f7675g0.get(i10, -1);
        if (i11 != -1) {
            o0.g0(view, i11);
            this.f7675g0.delete(i10);
        }
    }

    public final void k1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f7673f0 != null) {
                    return;
                } else {
                    this.f7673f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.W.get()) {
                    if (z10) {
                        this.f7673f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f7666c) {
                            o0.w0(childAt, 4);
                        }
                    } else if (this.f7666c && (map = this.f7673f0) != null && map.containsKey(childAt)) {
                        o0.w0(childAt, this.f7673f0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f7673f0 = null;
            } else if (this.f7666c) {
                this.W.get().sendAccessibilityEvent(8);
            }
        }
    }

    public final s l0(int i10) {
        return new f(i10);
    }

    public final void l1(boolean z10) {
        V v5;
        if (this.W != null) {
            d0();
            if (this.M != 4 || (v5 = this.W.get()) == null) {
                return;
            }
            if (z10) {
                X0(4);
            } else {
                v5.requestLayout();
            }
        }
    }

    public final void m0(@NonNull Context context) {
        if (this.f7695z == null) {
            return;
        }
        hd.g gVar = new hd.g(this.f7695z);
        this.f7679j = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f7680k;
        if (colorStateList != null) {
            this.f7679j.a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f7679j.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.W = null;
        this.O = null;
        this.f7665b0 = null;
    }

    public final void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        int i10;
        r3.c cVar;
        if (!v5.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            H0();
        }
        if (this.f7664a0 == null) {
            this.f7664a0 = VelocityTracker.obtain();
        }
        this.f7664a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f7669d0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference<View> weakReference = this.Y;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x10, this.f7669d0)) {
                    this.f7667c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f7671e0 = true;
                }
            }
            this.P = this.f7667c0 == -1 && !coordinatorLayout.B(v5, x10, this.f7669d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7671e0 = false;
            this.f7667c0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (!this.P && (cVar = this.O) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.Y;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.P || this.M == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i10 = this.f7669d0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.O.u())) ? false : true;
    }

    public void o0(int i10) {
        V v5 = this.W.get();
        if (v5 == null || this.Z.isEmpty()) {
            return;
        }
        float fI0 = i0(i10);
        for (int i11 = 0; i11 < this.Z.size(); i11++) {
            this.Z.get(i11).b(v5, fI0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        if (o0.w(coordinatorLayout) && !o0.w(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f7676h = coordinatorLayout.getResources().getDimensionPixelSize(ic.d.f20633a);
            a1(v5);
            o0.H0(v5, new mc.a(v5));
            this.W = new WeakReference<>(v5);
            this.f7665b0 = new cd.e(v5);
            hd.g gVar = this.f7679j;
            if (gVar != null) {
                o0.q0(v5, gVar);
                hd.g gVar2 = this.f7679j;
                float fU = this.I;
                if (fU == -1.0f) {
                    fU = o0.u(v5);
                }
                gVar2.Z(fU);
            } else {
                ColorStateList colorStateList = this.f7680k;
                if (colorStateList != null) {
                    o0.r0(v5, colorStateList);
                }
            }
            h1();
            if (o0.x(v5) == 0) {
                o0.w0(v5, 1);
            }
        }
        if (this.O == null) {
            this.O = r3.c.m(coordinatorLayout, this.f7677h0);
        }
        int top = v5.getTop();
        coordinatorLayout.I(v5, i10);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = v5.getHeight();
        this.T = height;
        int iMin = this.V;
        int i11 = iMin - height;
        int i12 = this.f7693x;
        if (i11 < i12) {
            if (this.f7688s) {
                int i13 = this.f7682m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f7682m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.T = iMin2;
            }
        }
        this.E = Math.max(0, this.V - this.T);
        f0();
        d0();
        int i15 = this.M;
        if (i15 == 3) {
            o0.X(v5, s0());
        } else if (i15 == 6) {
            o0.X(v5, this.F);
        } else if (this.J && i15 == 5) {
            o0.X(v5, this.V);
        } else if (i15 == 4) {
            o0.X(v5, this.H);
        } else if (i15 == 1 || i15 == 2) {
            o0.X(v5, top - v5.getTop());
        }
        j1(this.M, false);
        this.Y = new WeakReference<>(p0(v5));
        for (int i16 = 0; i16 < this.Z.size(); i16++) {
            this.Z.get(i16).a(v5);
        }
        return true;
    }

    public View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (o0.S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewP0 = p0(viewGroup.getChildAt(i10));
                if (viewP0 != null) {
                    return viewP0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        v5.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f7681l, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f7682m, marginLayoutParams.height));
        return true;
    }

    public final int r0(int i10, int i11, int i12, int i13) {
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11) {
        WeakReference<View> weakReference;
        return E0() && (weakReference = this.Y) != null && view == weakReference.get() && (this.M != 3 || super.s(coordinatorLayout, v5, view, f10, f11));
    }

    public int s0() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.f7688s ? 0 : this.f7693x);
    }

    public hd.g t0() {
        return this.f7679j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!E0() || view == view2) {
            int top = v5.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < s0()) {
                    int iS0 = top - s0();
                    iArr[1] = iS0;
                    o0.X(v5, -iS0);
                    Y0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i11;
                    o0.X(v5, -i11);
                    Y0(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.H && !j0()) {
                    int i14 = top - this.H;
                    iArr[1] = i14;
                    o0.X(v5, -i14);
                    Y0(4);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i11;
                    o0.X(v5, -i11);
                    Y0(1);
                }
            }
            o0(v5.getTop());
            this.Q = i11;
            this.R = true;
        }
    }

    public int u0() {
        if (this.f7674g) {
            return -1;
        }
        return this.f7672f;
    }

    public int v0() {
        return this.M;
    }

    public final int w0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.H;
        }
        if (i10 == 5) {
            return this.V;
        }
        if (i10 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
    }

    public final float x0() {
        VelocityTracker velocityTracker = this.f7664a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f7668d);
        return this.f7664a0.getYVelocity(this.f7667c0);
    }

    public final boolean y0() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.W.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean z0() {
        if (this.M == 3) {
            return this.f7694y || y0();
        }
        return false;
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7708a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f7709c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.b = false;
                r3.c cVar = BottomSheetBehavior.this.O;
                if (cVar != null && cVar.k(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f7708a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.Y0(hVar2.f7708a);
                }
            }
        }

        public h() {
            this.f7709c = new a();
        }

        public void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f7708a = i10;
            if (this.b) {
                return;
            }
            o0.e0(BottomSheetBehavior.this.W.get(), this.f7709c);
            this.b = true;
        }

        public /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f7700g;

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
            this.f7696c = parcel.readInt();
            this.f7697d = parcel.readInt();
            this.f7698e = parcel.readInt() == 1;
            this.f7699f = parcel.readInt() == 1;
            this.f7700g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7696c);
            parcel.writeInt(this.f7697d);
            parcel.writeInt(this.f7698e ? 1 : 0);
            parcel.writeInt(this.f7699f ? 1 : 0);
            parcel.writeInt(this.f7700g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f7696c = bottomSheetBehavior.M;
            this.f7697d = bottomSheetBehavior.f7672f;
            this.f7698e = bottomSheetBehavior.b;
            this.f7699f = bottomSheetBehavior.J;
            this.f7700g = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f7663a = 0;
        this.b = true;
        this.f7666c = false;
        this.f7681l = -1;
        this.f7682m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f7669d0 = -1;
        this.f7675g0 = new SparseIntArray();
        this.f7677h0 = new e();
        this.f7678i = context.getResources().getDimensionPixelSize(ic.d.f20637c0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.k.J);
        int i11 = ic.k.N;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f7680k = ed.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ic.k.f20826f0)) {
            this.f7695z = k.e(context, attributeSet, ic.b.f20593c, f7662i0).m();
        }
        m0(context);
        n0();
        this.I = typedArrayObtainStyledAttributes.getDimension(ic.k.M, -1.0f);
        int i12 = ic.k.K;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = ic.k.L;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = ic.k.T;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            S0(i10);
        } else {
            S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        P0(typedArrayObtainStyledAttributes.getBoolean(ic.k.S, false));
        N0(typedArrayObtainStyledAttributes.getBoolean(ic.k.X, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(ic.k.Q, true));
        W0(typedArrayObtainStyledAttributes.getBoolean(ic.k.W, false));
        K0(typedArrayObtainStyledAttributes.getBoolean(ic.k.O, true));
        U0(typedArrayObtainStyledAttributes.getInt(ic.k.U, 0));
        O0(typedArrayObtainStyledAttributes.getFloat(ic.k.R, 0.5f));
        int i15 = ic.k.P;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            L0(typedValuePeekValue2.data);
        } else {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        V0(typedArrayObtainStyledAttributes.getInt(ic.k.V, 500));
        this.f7685p = typedArrayObtainStyledAttributes.getBoolean(ic.k.f20788b0, false);
        this.f7686q = typedArrayObtainStyledAttributes.getBoolean(ic.k.f20798c0, false);
        this.f7687r = typedArrayObtainStyledAttributes.getBoolean(ic.k.f20808d0, false);
        this.f7688s = typedArrayObtainStyledAttributes.getBoolean(ic.k.f20817e0, true);
        this.f7689t = typedArrayObtainStyledAttributes.getBoolean(ic.k.Y, false);
        this.f7690u = typedArrayObtainStyledAttributes.getBoolean(ic.k.Z, false);
        this.f7691v = typedArrayObtainStyledAttributes.getBoolean(ic.k.f20779a0, false);
        this.f7694y = typedArrayObtainStyledAttributes.getBoolean(ic.k.f20835g0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f7668d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
