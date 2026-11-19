package com.google.android.material.bottomsheet;

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
import bd.r;
import e.BackEventCompat;
import id.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jc.j;
import y2.p;
import y2.s;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements dd.b {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f7506i0 = j.f20446g;
    public boolean A;
    public final BottomSheetBehavior<V>.i B;
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
    public s3.c O;
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
    public int f7507a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public VelocityTracker f7508a0;
    public boolean b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public dd.e f7509b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7510c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f7511c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7512d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f7513d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7514e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f7515e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7516f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Map<View, Integer> f7517f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7518g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final SparseIntArray f7519g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7520h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final s3.c.AbstractC0615c f7521h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public id.g f7523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f7524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7534u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7538y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f7539z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7540a;
        public final /* synthetic */ int b;

        public a(View view, int i10) {
            this.f7540a = view;
            this.b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.g1(this.f7540a, this.b, false);
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
            if (BottomSheetBehavior.this.f7523j != null) {
                BottomSheetBehavior.this.f7523j.b0(fFloatValue);
            }
        }
    }

    public class d implements r.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7544a;

        public d(boolean z10) {
            this.f7544a = z10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // bd.r.c
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, r.d dVar) {
            boolean z10;
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures());
            BottomSheetBehavior.this.f7537x = insets.top;
            boolean zH = r.h(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f7529p) {
                BottomSheetBehavior.this.f7536w = windowInsetsCompat.getSystemWindowInsetBottom();
                paddingBottom = dVar.f3958d + BottomSheetBehavior.this.f7536w;
            }
            if (BottomSheetBehavior.this.f7530q) {
                paddingLeft = (zH ? dVar.f3957c : dVar.f3956a) + insets.left;
            }
            if (BottomSheetBehavior.this.f7531r) {
                paddingRight = (zH ? dVar.f3956a : dVar.f3957c) + insets.right;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f7533t) {
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
            if (BottomSheetBehavior.this.f7534u) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = insets.right;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
            }
            if (BottomSheetBehavior.this.f7535v) {
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
            if (this.f7544a) {
                BottomSheetBehavior.this.f7527n = insets2.bottom;
            }
            if (!BottomSheetBehavior.this.f7529p && !this.f7544a) {
                return windowInsetsCompat;
            }
            BottomSheetBehavior.this.l1(false);
            return windowInsetsCompat;
        }
    }

    public class e extends s3.c.AbstractC0615c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7545a;

        public e() {
        }

        @Override // s3.c.AbstractC0615c
        public int a(@NonNull View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // s3.c.AbstractC0615c
        public int b(@NonNull View view, int i10, int i11) {
            return s2.a.c(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // s3.c.AbstractC0615c
        public int e(@NonNull View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // s3.c.AbstractC0615c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.Y0(1);
            }
        }

        @Override // s3.c.AbstractC0615c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // s3.c.AbstractC0615c
        public void l(@NonNull View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J && bottomSheetBehavior.d1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f7514e) || n(view)) {
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
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f7545a;
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

        @Override // s3.c.AbstractC0615c
        public boolean m(@NonNull View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.M;
            if (i11 == 1 || bottomSheetBehavior.f7515e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f7511c0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f7545a = System.currentTimeMillis();
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
        public final /* synthetic */ int f7546a;

        public f(int i10) {
            this.f7546a = i10;
        }

        @Override // y2.s
        public boolean a(@NonNull View view, s.a aVar) {
            BottomSheetBehavior.this.X0(this.f7546a);
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
        this.f7507a = 0;
        this.b = true;
        this.f7510c = false;
        this.f7525l = -1;
        this.f7526m = -1;
        this.B = new i(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f7513d0 = -1;
        this.f7519g0 = new SparseIntArray();
        this.f7521h0 = new e();
    }

    private void H0() {
        this.f7511c0 = -1;
        this.f7513d0 = -1;
        VelocityTracker velocityTracker = this.f7508a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7508a0 = null;
        }
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> q0(@NonNull V v8) {
        ViewGroup.LayoutParams layoutParams = v8.getLayoutParams();
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
        return this.f7528o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, v8, hVar.a());
        I0(hVar);
        int i10 = hVar.f7547c;
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
    public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8) {
        return new h(super.C(coordinatorLayout, v8), (BottomSheetBehavior<?>) this);
    }

    public boolean C0() {
        return true;
    }

    public final boolean D0(V v8) {
        ViewParent parent = v8.getParent();
        return parent != null && parent.isLayoutRequested() && o0.Q(v8);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, @NonNull View view2, int i10, int i11) {
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
    public void G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, int i10) {
        WeakReference<View> weakReference;
        int i11 = 3;
        if (v8.getTop() == s0()) {
            Y0(3);
            return;
        }
        if (!E0() || ((weakReference = this.Y) != null && view == weakReference.get() && this.R)) {
            if (this.Q > 0) {
                if (!this.b && v8.getTop() > this.F) {
                    i11 = 6;
                }
            } else if (this.J && d1(v8, x0())) {
                i11 = 5;
            } else if (this.Q == 0) {
                int top = v8.getTop();
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
                    int top2 = v8.getTop();
                    if (Math.abs(top2 - this.F) < Math.abs(top2 - this.H)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            g1(v8, i11, false);
            this.R = false;
        }
    }

    public final void G0(View view, p.a aVar, int i10) {
        o0.i0(view, aVar, null, l0(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        if (!v8.isShown()) {
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
        if (this.f7508a0 == null) {
            this.f7508a0 = VelocityTracker.obtain();
        }
        this.f7508a0.addMovement(motionEvent);
        if (c1() && actionMasked == 2 && !this.P && Math.abs(this.f7513d0 - motionEvent.getY()) > this.O.u()) {
            this.O.b(v8, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public final void I0(@NonNull h hVar) {
        int i10 = this.f7507a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f7516f = hVar.f7548d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.b = hVar.f7549e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.J = hVar.f7550f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.K = hVar.f7551g;
        }
    }

    public final void J0(V v8, Runnable runnable) {
        if (D0(v8)) {
            v8.post(runnable);
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
        this.f7528o = z10;
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
        this.f7526m = i10;
    }

    public void R0(int i10) {
        this.f7525l = i10;
    }

    public void S0(int i10) {
        T0(i10, false);
    }

    public final void T0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f7518g) {
                return;
            } else {
                this.f7518g = true;
            }
        } else {
            if (!this.f7518g && this.f7516f == i10) {
                return;
            }
            this.f7518g = false;
            this.f7516f = Math.max(0, i10);
        }
        l1(z10);
    }

    public void U0(int i10) {
        this.f7507a = i10;
    }

    public void V0(int i10) {
        this.f7514e = i10;
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
            V v8 = this.W.get();
            J0(v8, new a(v8, i11));
        }
    }

    public void Y0(int i10) {
        V v8;
        if (this.M == i10) {
            return;
        }
        this.M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.J && i10 == 5)) {
            this.N = i10;
        }
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || (v8 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            k1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            k1(false);
        }
        j1(i10, true);
        for (int i11 = 0; i11 < this.Z.size(); i11++) {
            this.Z.get(i11).c(v8, i10);
        }
        h1();
    }

    public void Z0(boolean z10) {
        this.f7510c = z10;
    }

    @Override // dd.b
    public void a(@NonNull BackEventCompat backEventCompat) {
        dd.e eVar = this.f7509b0;
        if (eVar == null) {
            return;
        }
        eVar.l(backEventCompat);
    }

    public final void a1(@NonNull View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || A0() || this.f7518g) ? false : true;
        if (this.f7529p || this.f7530q || this.f7531r || this.f7533t || this.f7534u || this.f7535v || z10) {
            r.c(view, new d(z10));
        }
    }

    @Override // dd.b
    public void b() {
        dd.e eVar = this.f7509b0;
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

    @Override // dd.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        dd.e eVar = this.f7509b0;
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

    @Override // dd.b
    public void d() {
        dd.e eVar = this.f7509b0;
        if (eVar == null) {
            return;
        }
        BackEventCompat backEventCompatC = eVar.c();
        if (backEventCompatC == null || Build.VERSION.SDK_INT < 34) {
            X0(this.J ? 5 : 4);
        } else if (this.J) {
            this.f7509b0.h(backEventCompatC, new b());
        } else {
            this.f7509b0.i(backEventCompatC, null);
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
        if (this.f7523j == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v8 = this.W.get();
        if (!y0() || (rootWindowInsets = v8.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f7523j.J(), rootWindowInsets.getRoundedCorner(0)), e0(this.f7523j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    public final void g1(View view, int i10, boolean z10) {
        int iW0 = w0(i10);
        s3.c cVar = this.O;
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
        if (this.f7518g) {
            return Math.min(Math.max(this.f7520h, this.V - ((this.U * 9) / 16)), this.T) + this.f7536w;
        }
        return (this.f7528o || this.f7529p || (i10 = this.f7527n) <= 0) ? this.f7516f + this.f7536w : Math.max(this.f7516f, i10 + this.f7522i);
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
            this.f7519g0.put(i10, b0(view, jc.i.f20419a, 6));
        }
        if (this.J && C0() && this.M != 5) {
            G0(view, p.a.f37218y, 5);
        }
        int i11 = this.M;
        if (i11 == 3) {
            G0(view, p.a.f37217x, this.b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            G0(view, p.a.f37216w, this.b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            G0(view, p.a.f37217x, 4);
            G0(view, p.a.f37216w, 3);
        }
    }

    public final boolean j0() {
        return B0() && C0();
    }

    public final void j1(int i10, boolean z10) {
        boolean zZ0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.A == (zZ0 = z0()) || this.f7523j == null) {
            return;
        }
        this.A = zZ0;
        if (!z10 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f7523j.b0(this.A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.f7523j.y(), zZ0 ? g0() : 1.0f);
            this.C.start();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.W = null;
        this.O = null;
        this.f7509b0 = null;
    }

    public final void k0(View view, int i10) {
        if (view == null) {
            return;
        }
        o0.g0(view, 524288);
        o0.g0(view, 262144);
        o0.g0(view, 1048576);
        int i11 = this.f7519g0.get(i10, -1);
        if (i11 != -1) {
            o0.g0(view, i11);
            this.f7519g0.delete(i10);
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
                if (this.f7517f0 != null) {
                    return;
                } else {
                    this.f7517f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.W.get()) {
                    if (z10) {
                        this.f7517f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f7510c) {
                            o0.w0(childAt, 4);
                        }
                    } else if (this.f7510c && (map = this.f7517f0) != null && map.containsKey(childAt)) {
                        o0.w0(childAt, this.f7517f0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f7517f0 = null;
            } else if (this.f7510c) {
                this.W.get().sendAccessibilityEvent(8);
            }
        }
    }

    public final s l0(int i10) {
        return new f(i10);
    }

    public final void l1(boolean z10) {
        V v8;
        if (this.W != null) {
            d0();
            if (this.M != 4 || (v8 = this.W.get()) == null) {
                return;
            }
            if (z10) {
                X0(4);
            } else {
                v8.requestLayout();
            }
        }
    }

    public final void m0(@NonNull Context context) {
        if (this.f7539z == null) {
            return;
        }
        id.g gVar = new id.g(this.f7539z);
        this.f7523j = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f7524k;
        if (colorStateList != null) {
            this.f7523j.a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f7523j.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.W = null;
        this.O = null;
        this.f7509b0 = null;
    }

    public final void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        int i10;
        s3.c cVar;
        if (!v8.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            H0();
        }
        if (this.f7508a0 == null) {
            this.f7508a0 = VelocityTracker.obtain();
        }
        this.f7508a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x5 = (int) motionEvent.getX();
            this.f7513d0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference<View> weakReference = this.Y;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x5, this.f7513d0)) {
                    this.f7511c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f7515e0 = true;
                }
            }
            this.P = this.f7511c0 == -1 && !coordinatorLayout.B(v8, x5, this.f7513d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7515e0 = false;
            this.f7511c0 = -1;
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
        return (actionMasked != 2 || view2 == null || this.P || this.M == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i10 = this.f7513d0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.O.u())) ? false : true;
    }

    public void o0(int i10) {
        V v8 = this.W.get();
        if (v8 == null || this.Z.isEmpty()) {
            return;
        }
        float fI0 = i0(i10);
        for (int i11 = 0; i11 < this.Z.size(); i11++) {
            this.Z.get(i11).b(v8, fI0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10) {
        if (o0.w(coordinatorLayout) && !o0.w(v8)) {
            v8.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f7520h = coordinatorLayout.getResources().getDimensionPixelSize(jc.d.f20321a);
            a1(v8);
            o0.H0(v8, new nc.a(v8));
            this.W = new WeakReference<>(v8);
            this.f7509b0 = new dd.e(v8);
            id.g gVar = this.f7523j;
            if (gVar != null) {
                o0.q0(v8, gVar);
                id.g gVar2 = this.f7523j;
                float fU = this.I;
                if (fU == -1.0f) {
                    fU = o0.u(v8);
                }
                gVar2.Z(fU);
            } else {
                ColorStateList colorStateList = this.f7524k;
                if (colorStateList != null) {
                    o0.r0(v8, colorStateList);
                }
            }
            h1();
            if (o0.x(v8) == 0) {
                o0.w0(v8, 1);
            }
        }
        if (this.O == null) {
            this.O = s3.c.m(coordinatorLayout, this.f7521h0);
        }
        int top = v8.getTop();
        coordinatorLayout.I(v8, i10);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = v8.getHeight();
        this.T = height;
        int iMin = this.V;
        int i11 = iMin - height;
        int i12 = this.f7537x;
        if (i11 < i12) {
            if (this.f7532s) {
                int i13 = this.f7526m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f7526m;
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
            o0.X(v8, s0());
        } else if (i15 == 6) {
            o0.X(v8, this.F);
        } else if (this.J && i15 == 5) {
            o0.X(v8, this.V);
        } else if (i15 == 4) {
            o0.X(v8, this.H);
        } else if (i15 == 1 || i15 == 2) {
            o0.X(v8, top - v8.getTop());
        }
        j1(this.M, false);
        this.Y = new WeakReference<>(p0(v8));
        for (int i16 = 0; i16 < this.Z.size(); i16++) {
            this.Z.get(i16).a(v8);
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
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v8.getLayoutParams();
        v8.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f7525l, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f7526m, marginLayoutParams.height));
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
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, float f10, float f11) {
        WeakReference<View> weakReference;
        return E0() && (weakReference = this.Y) != null && view == weakReference.get() && (this.M != 3 || super.s(coordinatorLayout, v8, view, f10, f11));
    }

    public int s0() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.f7532s ? 0 : this.f7537x);
    }

    public id.g t0() {
        return this.f7523j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!E0() || view == view2) {
            int top = v8.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < s0()) {
                    int iS0 = top - s0();
                    iArr[1] = iS0;
                    o0.X(v8, -iS0);
                    Y0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i11;
                    o0.X(v8, -i11);
                    Y0(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.H && !j0()) {
                    int i14 = top - this.H;
                    iArr[1] = i14;
                    o0.X(v8, -i14);
                    Y0(4);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i11;
                    o0.X(v8, -i11);
                    Y0(1);
                }
            }
            o0(v8.getTop());
            this.Q = i11;
            this.R = true;
        }
    }

    public int u0() {
        if (this.f7518g) {
            return -1;
        }
        return this.f7516f;
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
    public void x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
    }

    public final float x0() {
        VelocityTracker velocityTracker = this.f7508a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f7512d);
        return this.f7508a0.getYVelocity(this.f7511c0);
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
            return this.f7538y || y0();
        }
        return false;
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7552a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f7553c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b = false;
                s3.c cVar = BottomSheetBehavior.this.O;
                if (cVar != null && cVar.k(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.f7552a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.Y0(iVar2.f7552a);
                }
            }
        }

        public i() {
            this.f7553c = new a();
        }

        public void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f7552a = i10;
            if (this.b) {
                return;
            }
            o0.e0(BottomSheetBehavior.this.W.get(), this.f7553c);
            this.b = true;
        }

        public /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class h extends r3.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f7551g;

        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@NonNull Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7547c = parcel.readInt();
            this.f7548d = parcel.readInt();
            this.f7549e = parcel.readInt() == 1;
            this.f7550f = parcel.readInt() == 1;
            this.f7551g = parcel.readInt() == 1;
        }

        @Override // r3.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7547c);
            parcel.writeInt(this.f7548d);
            parcel.writeInt(this.f7549e ? 1 : 0);
            parcel.writeInt(this.f7550f ? 1 : 0);
            parcel.writeInt(this.f7551g ? 1 : 0);
        }

        public h(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f7547c = bottomSheetBehavior.M;
            this.f7548d = bottomSheetBehavior.f7516f;
            this.f7549e = bottomSheetBehavior.b;
            this.f7550f = bottomSheetBehavior.J;
            this.f7551g = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f7507a = 0;
        this.b = true;
        this.f7510c = false;
        this.f7525l = -1;
        this.f7526m = -1;
        this.B = new i(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f7513d0 = -1;
        this.f7519g0 = new SparseIntArray();
        this.f7521h0 = new e();
        this.f7522i = context.getResources().getDimensionPixelSize(jc.d.f20325c0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jc.k.J);
        if (typedArrayObtainStyledAttributes.hasValue(jc.k.N)) {
            this.f7524k = fd.c.a(context, typedArrayObtainStyledAttributes, jc.k.N);
        }
        if (typedArrayObtainStyledAttributes.hasValue(jc.k.f20514f0)) {
            this.f7539z = k.e(context, attributeSet, jc.b.f20281c, f7506i0).m();
        }
        m0(context);
        n0();
        this.I = typedArrayObtainStyledAttributes.getDimension(jc.k.M, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(jc.k.K)) {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.K, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(jc.k.L)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.L, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(jc.k.T);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            S0(i10);
        } else {
            S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.T, -1));
        }
        P0(typedArrayObtainStyledAttributes.getBoolean(jc.k.S, false));
        N0(typedArrayObtainStyledAttributes.getBoolean(jc.k.X, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(jc.k.Q, true));
        W0(typedArrayObtainStyledAttributes.getBoolean(jc.k.W, false));
        K0(typedArrayObtainStyledAttributes.getBoolean(jc.k.O, true));
        U0(typedArrayObtainStyledAttributes.getInt(jc.k.U, 0));
        O0(typedArrayObtainStyledAttributes.getFloat(jc.k.R, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(jc.k.P);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            L0(typedValuePeekValue2.data);
        } else {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(jc.k.P, 0));
        }
        V0(typedArrayObtainStyledAttributes.getInt(jc.k.V, 500));
        this.f7529p = typedArrayObtainStyledAttributes.getBoolean(jc.k.f20476b0, false);
        this.f7530q = typedArrayObtainStyledAttributes.getBoolean(jc.k.f20486c0, false);
        this.f7531r = typedArrayObtainStyledAttributes.getBoolean(jc.k.f20496d0, false);
        this.f7532s = typedArrayObtainStyledAttributes.getBoolean(jc.k.f20505e0, true);
        this.f7533t = typedArrayObtainStyledAttributes.getBoolean(jc.k.Y, false);
        this.f7534u = typedArrayObtainStyledAttributes.getBoolean(jc.k.Z, false);
        this.f7535v = typedArrayObtainStyledAttributes.getBoolean(jc.k.f20467a0, false);
        this.f7538y = typedArrayObtainStyledAttributes.getBoolean(jc.k.f20523g0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f7512d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
