package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.g0;
import androidx.core.view.o0;
import androidx.core.view.r0;
import androidx.customview.view.AbsSavedState;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements g0, androidx.core.view.t {
    public static boolean F0;
    public static boolean G0;
    public static final int[] H0 = {R.attr.nestedScrollingEnabled};
    public static final float I0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean J0 = false;
    public static final boolean K0 = true;
    public static final boolean L0 = true;
    public static final Class<?>[] M0;
    public static final Interpolator N0;
    public static final c0 O0;
    public boolean A;
    public int A0;
    public int B;
    public boolean B0;
    public boolean C;
    public final androidx.recyclerview.widget.u.b C0;
    public final AccessibilityManager D;
    public final androidx.core.view.i D0;
    public List<s> E;
    public androidx.core.view.h E0;
    public boolean F;
    public boolean G;
    public int H;
    public int I;

    @NonNull
    public m J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public n O;
    public int P;
    public int Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2768a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public t f2769a0;
    public final z b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f2770b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f2771c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f2772c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SavedState f2773d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f2774d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.a f2775e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f2776e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.e f2777f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f2778f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.u f2779g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final e0 f2780g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2781h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public androidx.recyclerview.widget.j f2782h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f2783i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public androidx.recyclerview.widget.j.b f2784i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f2785j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final b0 f2786j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f2787k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public v f2788k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f2789l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public List<v> f2790l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f2791m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f2792m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f2793n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f2794n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y f2795o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public n.b f2796o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<y> f2797p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f2798p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<p> f2799q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public androidx.recyclerview.widget.p f2800q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<u> f2801r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int[] f2802r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u f2803s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public androidx.core.view.u f2804s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2805t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int[] f2806t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2807u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f2808u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2809v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final int[] f2810v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2811w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final List<f0> f2812w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2813x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Runnable f2814x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2815y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f2816y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2817z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f2818z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f2811w || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f2805t) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f2817z) {
                recyclerView2.f2815y = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    public static abstract class a0 {
        public RecyclerView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q f2822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2823d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2824e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f2825f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2827h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2821a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f2826g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2828a;
            public int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2829c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2830d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Interpolator f2831e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f2832f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f2833g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public boolean a() {
                return this.f2830d >= 0;
            }

            public void b(int i10) {
                this.f2830d = i10;
            }

            public void c(RecyclerView recyclerView) {
                int i10 = this.f2830d;
                if (i10 >= 0) {
                    this.f2830d = -1;
                    recyclerView.F0(i10);
                    this.f2832f = false;
                } else {
                    if (!this.f2832f) {
                        this.f2833g = 0;
                        return;
                    }
                    e();
                    recyclerView.f2780g0.e(this.f2828a, this.b, this.f2829c, this.f2831e);
                    int i11 = this.f2833g + 1;
                    this.f2833g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2832f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2828a = i10;
                this.b = i11;
                this.f2829c = i12;
                this.f2831e = interpolator;
                this.f2832f = true;
            }

            public final void e() {
                if (this.f2831e != null && this.f2829c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f2829c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2830d = -1;
                this.f2832f = false;
                this.f2833g = 0;
                this.f2828a = i10;
                this.b = i11;
                this.f2829c = i12;
                this.f2831e = interpolator;
            }
        }

        public interface b {
            PointF c(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).c(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.b.f2793n.H(i10);
        }

        public int c() {
            return this.b.f2793n.O();
        }

        public int d(View view) {
            return this.b.l0(view);
        }

        public q e() {
            return this.f2822c;
        }

        public int f() {
            return this.f2821a;
        }

        public boolean g() {
            return this.f2823d;
        }

        public boolean h() {
            return this.f2824e;
        }

        public void i(@NonNull PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.b;
            if (this.f2821a == -1 || recyclerView == null) {
                r();
            }
            if (this.f2823d && this.f2825f == null && this.f2822c != null && (pointFA = a(this.f2821a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.s1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f2823d = false;
            View view = this.f2825f;
            if (view != null) {
                if (d(view) == this.f2821a) {
                    o(this.f2825f, recyclerView.f2786j0, this.f2826g);
                    this.f2826g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2825f = null;
                }
            }
            if (this.f2824e) {
                l(i10, i11, recyclerView.f2786j0, this.f2826g);
                boolean zA = this.f2826g.a();
                this.f2826g.c(recyclerView);
                if (zA && this.f2824e) {
                    this.f2823d = true;
                    recyclerView.f2780g0.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f2825f = view;
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        public abstract void l(int i10, int i11, @NonNull b0 b0Var, @NonNull a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(@NonNull View view, @NonNull b0 b0Var, @NonNull a aVar);

        public void p(int i10) {
            this.f2821a = i10;
        }

        public void q(RecyclerView recyclerView, q qVar) {
            recyclerView.f2780g0.f();
            if (this.f2827h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.f2822c = qVar;
            int i10 = this.f2821a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f2786j0.f2835a = i10;
            this.f2824e = true;
            this.f2823d = true;
            this.f2825f = b(f());
            m();
            this.b.f2780g0.d();
            this.f2827h = true;
        }

        public final void r() {
            if (this.f2824e) {
                this.f2824e = false;
                n();
                this.b.f2786j0.f2835a = -1;
                this.f2825f = null;
                this.f2821a = -1;
                this.f2823d = false;
                this.f2822c.k1(this);
                this.f2822c = null;
                this.b = null;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = RecyclerView.this.O;
            if (nVar != null) {
                nVar.u();
            }
            RecyclerView.this.f2798p0 = false;
        }
    }

    public static class b0 {
        public SparseArray<Object> b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2846m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f2847n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f2848o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2849p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2850q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2835a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2836c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2837d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2838e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2839f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2840g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2841h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2842i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2843j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2844k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2845l = false;

        public void a(int i10) {
            if ((this.f2838e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f2838e));
        }

        public int b() {
            return this.f2841h ? this.f2836c - this.f2837d : this.f2839f;
        }

        public int c() {
            return this.f2835a;
        }

        public boolean d() {
            return this.f2835a != -1;
        }

        public boolean e() {
            return this.f2841h;
        }

        public void f(h hVar) {
            this.f2838e = 1;
            this.f2839f = hVar.e();
            this.f2841h = false;
            this.f2842i = false;
            this.f2843j = false;
        }

        public boolean g() {
            return this.f2845l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2835a + ", mData=" + this.b + ", mItemCount=" + this.f2839f + ", mIsMeasuring=" + this.f2843j + ", mPreviousLayoutItemCount=" + this.f2836c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2837d + ", mStructureChanged=" + this.f2840g + ", mInPreLayout=" + this.f2841h + ", mRunSimpleAnimations=" + this.f2844k + ", mRunPredictiveAnimations=" + this.f2845l + '}';
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public static class c0 extends m {
        @Override // androidx.recyclerview.widget.RecyclerView.m
        @NonNull
        public EdgeEffect a(@NonNull RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public class d implements androidx.recyclerview.widget.u.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.u.b
        public void a(f0 f0Var, n.c cVar, n.c cVar2) {
            RecyclerView.this.o(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.u.b
        public void b(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2793n.r1(f0Var.f2861a, recyclerView.f2771c);
        }

        @Override // androidx.recyclerview.widget.u.b
        public void c(f0 f0Var, @NonNull n.c cVar, n.c cVar2) {
            RecyclerView.this.f2771c.O(f0Var);
            RecyclerView.this.q(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.u.b
        public void d(f0 f0Var, @NonNull n.c cVar, @NonNull n.c cVar2) {
            f0Var.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.F) {
                if (recyclerView.O.b(f0Var, f0Var, cVar, cVar2)) {
                    RecyclerView.this.W0();
                }
            } else if (recyclerView.O.d(f0Var, cVar, cVar2)) {
                RecyclerView.this.W0();
            }
        }
    }

    public static abstract class d0 {
    }

    public class e implements androidx.core.view.i {
        public e() {
        }

        @Override // androidx.core.view.i
        public boolean a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f2793n.q()) {
                i11 = (int) f10;
                i10 = 0;
            } else if (RecyclerView.this.f2793n.p()) {
                i10 = (int) f10;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.J1();
            return RecyclerView.this.i0(i10, i11);
        }

        @Override // androidx.core.view.i
        public float b() {
            float f10;
            if (RecyclerView.this.f2793n.q()) {
                f10 = RecyclerView.this.f2776e0;
            } else {
                if (!RecyclerView.this.f2793n.p()) {
                    return 0.0f;
                }
                f10 = RecyclerView.this.f2774d0;
            }
            return -f10;
        }

        @Override // androidx.core.view.i
        public void c() {
            RecyclerView.this.J1();
        }
    }

    public class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2853a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public OverScroller f2854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Interpolator f2855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2857f;

        public e0() {
            Interpolator interpolator = RecyclerView.N0;
            this.f2855d = interpolator;
            this.f2856e = false;
            this.f2857f = false;
            this.f2854c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.f2853a = 0;
            Interpolator interpolator = this.f2855d;
            Interpolator interpolator2 = RecyclerView.N0;
            if (interpolator != interpolator2) {
                this.f2855d = interpolator2;
                this.f2854c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f2854c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            o0.e0(RecyclerView.this, this);
        }

        public void d() {
            if (this.f2856e) {
                this.f2857f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.N0;
            }
            if (this.f2855d != interpolator) {
                this.f2855d = interpolator;
                this.f2854c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.b = 0;
            this.f2853a = 0;
            RecyclerView.this.setScrollState(2);
            this.f2854c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f2854c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2793n == null) {
                f();
                return;
            }
            this.f2857f = false;
            this.f2856e = true;
            recyclerView.A();
            OverScroller overScroller = this.f2854c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f2853a;
                int i14 = currY - this.b;
                this.f2853a = currX;
                this.b = currY;
                int iX = RecyclerView.this.x(i13);
                int iZ = RecyclerView.this.z(i14);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f2810v0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(iX, iZ, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f2810v0;
                    iX -= iArr2[0];
                    iZ -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(iX, iZ);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f2791m != null) {
                    int[] iArr3 = recyclerView3.f2810v0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.s1(iX, iZ, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f2810v0;
                    int i15 = iArr4[0];
                    int i16 = iArr4[1];
                    iX -= i15;
                    iZ -= i16;
                    a0 a0Var = recyclerView4.f2793n.f2899g;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int iB = RecyclerView.this.f2786j0.b();
                        if (iB == 0) {
                            a0Var.r();
                        } else if (a0Var.f() >= iB) {
                            a0Var.p(iB - 1);
                            a0Var.j(i15, i16);
                        } else {
                            a0Var.j(i15, i16);
                        }
                    }
                    i11 = i16;
                    i10 = i15;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i17 = iX;
                int i18 = iZ;
                if (!RecyclerView.this.f2799q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f2810v0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i10, i11, i17, i18, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f2810v0;
                int i19 = i17 - iArr6[0];
                int i20 = i18 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.O(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
                a0 a0Var2 = RecyclerView.this.f2793n.f2899g;
                if ((a0Var2 == null || !a0Var2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i19 < 0) {
                            i12 = -currVelocity;
                        } else {
                            i12 = i19 > 0 ? currVelocity : 0;
                        }
                        if (i20 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i20 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i12, currVelocity);
                    }
                    if (RecyclerView.L0) {
                        RecyclerView.this.f2784i0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.j jVar = recyclerView7.f2782h0;
                    if (jVar != null) {
                        jVar.f(recyclerView7, i10, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    k.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            a0 a0Var3 = RecyclerView.this.f2793n.f2899g;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f2856e = false;
            if (this.f2857f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.I1(1);
            }
        }
    }

    public class f implements androidx.recyclerview.widget.e.b {
        public f() {
        }

        @Override // androidx.recyclerview.widget.e.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void b(View view) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (f0VarN0 != null) {
                f0VarN0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.e.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.e.b
        public f0 d(View view) {
            return RecyclerView.n0(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void e(int i10) {
            View viewA = a(i10);
            if (viewA != null) {
                f0 f0VarN0 = RecyclerView.n0(viewA);
                if (f0VarN0 != null) {
                    if (f0VarN0.y() && !f0VarN0.K()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + f0VarN0 + RecyclerView.this.V());
                    }
                    if (RecyclerView.G0) {
                        Log.d("RecyclerView", "tmpDetach " + f0VarN0);
                    }
                    f0VarN0.b(Barcode.FORMAT_QR_CODE);
                }
            } else if (RecyclerView.F0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void f() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.F(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.e.b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void h(View view) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (f0VarN0 != null) {
                f0VarN0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.e.b
        public void i(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (f0VarN0 != null) {
                if (!f0VarN0.y() && !f0VarN0.K()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f0VarN0 + RecyclerView.this.V());
                }
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "reAttach " + f0VarN0);
                }
                f0VarN0.f();
            } else if (RecyclerView.F0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    public static abstract class f0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final List<Object> f2860t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final View f2861a;
        public WeakReference<RecyclerView> b;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2869j;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public RecyclerView f2877r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public h<? extends f0> f2878s;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2862c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2863d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f2864e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2865f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2866g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f0 f2867h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f0 f2868i = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<Object> f2870k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<Object> f2871l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2872m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public x f2873n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f2874o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2875p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2876q = -1;

        public f0(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f2861a = view;
        }

        public boolean A() {
            return (this.f2869j & 2) != 0;
        }

        public void B(int i10, boolean z10) {
            if (this.f2863d == -1) {
                this.f2863d = this.f2862c;
            }
            if (this.f2866g == -1) {
                this.f2866g = this.f2862c;
            }
            if (z10) {
                this.f2866g += i10;
            }
            this.f2862c += i10;
            if (this.f2861a.getLayoutParams() != null) {
                ((r) this.f2861a.getLayoutParams()).f2917c = true;
            }
        }

        public void C(RecyclerView recyclerView) {
            int i10 = this.f2876q;
            if (i10 != -1) {
                this.f2875p = i10;
            } else {
                this.f2875p = this.f2861a.getImportantForAccessibility();
            }
            recyclerView.v1(this, 4);
        }

        public void D(RecyclerView recyclerView) {
            recyclerView.v1(this, this.f2875p);
            this.f2875p = 0;
        }

        public void E() {
            if (RecyclerView.F0 && y()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f2869j = 0;
            this.f2862c = -1;
            this.f2863d = -1;
            this.f2864e = -1L;
            this.f2866g = -1;
            this.f2872m = 0;
            this.f2867h = null;
            this.f2868i = null;
            d();
            this.f2875p = 0;
            this.f2876q = -1;
            RecyclerView.u(this);
        }

        public void F() {
            if (this.f2863d == -1) {
                this.f2863d = this.f2862c;
            }
        }

        public void G(int i10, int i11) {
            this.f2869j = (i10 & i11) | (this.f2869j & (~i11));
        }

        public final void H(boolean z10) {
            int i10 = this.f2872m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f2872m = i11;
            if (i11 < 0) {
                this.f2872m = 0;
                if (RecyclerView.F0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.f2869j |= 16;
            } else if (z10 && i11 == 0) {
                this.f2869j &= -17;
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        public void I(x xVar, boolean z10) {
            this.f2873n = xVar;
            this.f2874o = z10;
        }

        public boolean J() {
            return (this.f2869j & 16) != 0;
        }

        public boolean K() {
            return (this.f2869j & 128) != 0;
        }

        public void L() {
            this.f2873n.O(this);
        }

        public boolean M() {
            return (this.f2869j & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(Barcode.FORMAT_UPC_E);
            } else if ((1024 & this.f2869j) == 0) {
                g();
                this.f2870k.add(obj);
            }
        }

        public void b(int i10) {
            this.f2869j = i10 | this.f2869j;
        }

        public void c() {
            this.f2863d = -1;
            this.f2866g = -1;
        }

        public void d() {
            List<Object> list = this.f2870k;
            if (list != null) {
                list.clear();
            }
            this.f2869j &= -1025;
        }

        public void e() {
            this.f2869j &= -33;
        }

        public void f() {
            this.f2869j &= -257;
        }

        public final void g() {
            if (this.f2870k == null) {
                ArrayList arrayList = new ArrayList();
                this.f2870k = arrayList;
                this.f2871l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            return (this.f2869j & 16) == 0 && o0.O(this.f2861a);
        }

        public void i(int i10, int i11, boolean z10) {
            b(8);
            B(i11, z10);
            this.f2862c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f2877r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.j0(this);
        }

        public final int k() {
            RecyclerView recyclerView;
            h adapter;
            int iJ0;
            if (this.f2878s == null || (recyclerView = this.f2877r) == null || (adapter = recyclerView.getAdapter()) == null || (iJ0 = this.f2877r.j0(this)) == -1) {
                return -1;
            }
            return adapter.d(this.f2878s, this, iJ0);
        }

        public final long l() {
            return this.f2864e;
        }

        public final int m() {
            return this.f2865f;
        }

        public final int n() {
            int i10 = this.f2866g;
            return i10 == -1 ? this.f2862c : i10;
        }

        public final int o() {
            return this.f2863d;
        }

        public List<Object> p() {
            if ((this.f2869j & Barcode.FORMAT_UPC_E) != 0) {
                return f2860t;
            }
            List<Object> list = this.f2870k;
            return (list == null || list.size() == 0) ? f2860t : this.f2871l;
        }

        public boolean q(int i10) {
            return (i10 & this.f2869j) != 0;
        }

        public boolean r() {
            return (this.f2869j & Barcode.FORMAT_UPC_A) != 0 || u();
        }

        public boolean s() {
            return (this.f2861a.getParent() == null || this.f2861a.getParent() == this.f2877r) ? false : true;
        }

        public boolean t() {
            return (this.f2869j & 1) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2862c + " id=" + this.f2864e + ", oldPos=" + this.f2863d + ", pLpos:" + this.f2866g);
            if (x()) {
                sb2.append(" scrap ");
                sb2.append(this.f2874o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (u()) {
                sb2.append(" invalid");
            }
            if (!t()) {
                sb2.append(" unbound");
            }
            if (A()) {
                sb2.append(" update");
            }
            if (w()) {
                sb2.append(" removed");
            }
            if (K()) {
                sb2.append(" ignored");
            }
            if (y()) {
                sb2.append(" tmpDetached");
            }
            if (!v()) {
                sb2.append(" not recyclable(" + this.f2872m + ")");
            }
            if (r()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2861a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public boolean u() {
            return (this.f2869j & 4) != 0;
        }

        public final boolean v() {
            return (this.f2869j & 16) == 0 && !o0.O(this.f2861a);
        }

        public boolean w() {
            return (this.f2869j & 8) != 0;
        }

        public boolean x() {
            return this.f2873n != null;
        }

        public boolean y() {
            return (this.f2869j & Barcode.FORMAT_QR_CODE) != 0;
        }

        public boolean z() {
            return (this.f2869j & 2) != 0;
        }
    }

    public class g implements androidx.recyclerview.widget.a.InterfaceC0048a {
        public g() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0048a
        public void a(int i10, int i11) {
            RecyclerView.this.M0(i10, i11);
            RecyclerView.this.f2792m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0048a
        public void b(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0048a
        public void c(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0048a
        public void d(int i10, int i11) {
            RecyclerView.this.N0(i10, i11, false);
            RecyclerView.this.f2792m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0048a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.L1(i10, i11, obj);
            RecyclerView.this.f2794n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0048a
        public f0 f(int i10) {
            f0 f0VarF0 = RecyclerView.this.f0(i10, true);
            if (f0VarF0 == null) {
                return null;
            }
            if (!RecyclerView.this.f2777f.n(f0VarF0.f2861a)) {
                return f0VarF0;
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0048a
        public void g(int i10, int i11) {
            RecyclerView.this.L0(i10, i11);
            RecyclerView.this.f2792m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0048a
        public void h(int i10, int i11) {
            RecyclerView.this.N0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2792m0 = true;
            recyclerView.f2786j0.f2837d += i11;
        }

        public void i(androidx.recyclerview.widget.a.b bVar) {
            int i10 = bVar.f2974a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f2793n.W0(recyclerView, bVar.b, bVar.f2976d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f2793n.Z0(recyclerView2, bVar.b, bVar.f2976d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f2793n.b1(recyclerView3, bVar.b, bVar.f2976d, bVar.f2975c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f2793n.Y0(recyclerView4, bVar.b, bVar.f2976d, 1);
            }
        }
    }

    public static abstract class h<VH extends f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f2880a = new i();
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f2881c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public void A(boolean z10) {
            if (h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.b = z10;
        }

        public void B(@NonNull j jVar) {
            this.f2880a.unregisterObserver(jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@NonNull VH vh2, int i10) {
            boolean z10 = vh2.f2878s == null;
            if (z10) {
                vh2.f2862c = i10;
                if (i()) {
                    vh2.f2864e = f(i10);
                }
                vh2.G(1, 519);
                if (u2.o.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(vh2.f2865f)));
                }
            }
            vh2.f2878s = this;
            if (RecyclerView.F0) {
                if (vh2.f2861a.getParent() == null && vh2.f2861a.isAttachedToWindow() != vh2.y()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh2.y() + ", attached to window: " + vh2.f2861a.isAttachedToWindow() + ", holder: " + vh2);
                }
                if (vh2.f2861a.getParent() == null && vh2.f2861a.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh2);
                }
            }
            s(vh2, i10, vh2.p());
            if (z10) {
                vh2.d();
                ViewGroup.LayoutParams layoutParams = vh2.f2861a.getLayoutParams();
                if (layoutParams instanceof r) {
                    ((r) layoutParams).f2917c = true;
                }
                Trace.endSection();
            }
        }

        public boolean b() {
            int iOrdinal = this.f2881c.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2;
            }
            return e() > 0;
        }

        @NonNull
        public final VH c(@NonNull ViewGroup viewGroup, int i10) {
            try {
                if (u2.o.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                VH vh2 = (VH) t(viewGroup, i10);
                if (vh2.f2861a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.f2865f = i10;
                Trace.endSection();
                return vh2;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int d(@NonNull h<? extends f0> hVar, @NonNull f0 f0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i10) {
            return -1L;
        }

        public int g(int i10) {
            return 0;
        }

        public final boolean h() {
            return this.f2880a.a();
        }

        public final boolean i() {
            return this.b;
        }

        public final void j() {
            this.f2880a.b();
        }

        public final void k(int i10) {
            this.f2880a.d(i10, 1);
        }

        public final void l(int i10, Object obj) {
            this.f2880a.e(i10, 1, obj);
        }

        public final void m(int i10, int i11) {
            this.f2880a.c(i10, i11);
        }

        public final void n(int i10, int i11, Object obj) {
            this.f2880a.e(i10, i11, obj);
        }

        public final void o(int i10, int i11) {
            this.f2880a.f(i10, i11);
        }

        public final void p(int i10, int i11) {
            this.f2880a.g(i10, i11);
        }

        public void q(@NonNull RecyclerView recyclerView) {
        }

        public abstract void r(@NonNull VH vh2, int i10);

        public void s(@NonNull VH vh2, int i10, @NonNull List<Object> list) {
            r(vh2, i10);
        }

        @NonNull
        public abstract VH t(@NonNull ViewGroup viewGroup, int i10);

        public void u(@NonNull RecyclerView recyclerView) {
        }

        public boolean v(@NonNull VH vh2) {
            return false;
        }

        public void w(@NonNull VH vh2) {
        }

        public void x(@NonNull VH vh2) {
        }

        public void y(@NonNull VH vh2) {
        }

        public void z(@NonNull j jVar) {
            this.f2880a.registerObserver(jVar);
        }
    }

    public static class i extends Observable<j> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }
    }

    public static final class k {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface l {
    }

    public static class m {
        @NonNull
        public EdgeEffect a(@NonNull RecyclerView recyclerView, int i10) {
            throw null;
        }
    }

    public static abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f2885a = null;
        public ArrayList<a> b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f2886c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f2887d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f2888e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f2889f = 250;

        public interface a {
            void a();
        }

        public interface b {
            void a(@NonNull f0 f0Var);
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2890a;
            public int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2891c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2892d;

            @NonNull
            public c a(@NonNull f0 f0Var) {
                return b(f0Var, 0);
            }

            @NonNull
            public c b(@NonNull f0 f0Var, int i10) {
                View view = f0Var.f2861a;
                this.f2890a = view.getLeft();
                this.b = view.getTop();
                this.f2891c = view.getRight();
                this.f2892d = view.getBottom();
                return this;
            }
        }

        public static int e(f0 f0Var) {
            int i10 = f0Var.f2869j;
            int i11 = i10 & 14;
            if (f0Var.u()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int iO = f0Var.o();
                int iJ = f0Var.j();
                if (iO != -1 && iJ != -1 && iO != iJ) {
                    return i11 | Barcode.FORMAT_PDF417;
                }
            }
            return i11;
        }

        public abstract boolean a(@NonNull f0 f0Var, c cVar, @NonNull c cVar2);

        public abstract boolean b(@NonNull f0 f0Var, @NonNull f0 f0Var2, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean c(@NonNull f0 f0Var, @NonNull c cVar, c cVar2);

        public abstract boolean d(@NonNull f0 f0Var, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean f(@NonNull f0 f0Var);

        public boolean g(@NonNull f0 f0Var, @NonNull List<Object> list) {
            return f(f0Var);
        }

        public final void h(@NonNull f0 f0Var) {
            r(f0Var);
            b bVar = this.f2885a;
            if (bVar != null) {
                bVar.a(f0Var);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.b.get(i10).a();
            }
            this.b.clear();
        }

        public abstract void j(@NonNull f0 f0Var);

        public abstract void k();

        public long l() {
            return this.f2886c;
        }

        public long m() {
            return this.f2889f;
        }

        public long n() {
            return this.f2888e;
        }

        public long o() {
            return this.f2887d;
        }

        public abstract boolean p();

        @NonNull
        public c q() {
            return new c();
        }

        public void r(@NonNull f0 f0Var) {
        }

        @NonNull
        public c s(@NonNull b0 b0Var, @NonNull f0 f0Var) {
            return q().a(f0Var);
        }

        @NonNull
        public c t(@NonNull b0 b0Var, @NonNull f0 f0Var, int i10, @NonNull List<Object> list) {
            return q().a(f0Var);
        }

        public abstract void u();

        public void v(b bVar) {
            this.f2885a = bVar;
        }
    }

    public class o implements n.b {
        public o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n.b
        public void a(f0 f0Var) {
            f0Var.H(true);
            if (f0Var.f2867h != null && f0Var.f2868i == null) {
                f0Var.f2867h = null;
            }
            f0Var.f2868i = null;
            if (f0Var.J() || RecyclerView.this.h1(f0Var.f2861a) || !f0Var.y()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.f2861a, false);
        }
    }

    public static abstract class p {
        @Deprecated
        public void d(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull b0 b0Var) {
            d(rect, ((r) view.getLayoutParams()).b(), recyclerView);
        }

        @Deprecated
        public void f(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull b0 b0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void i(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull b0 b0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.e f2894a;
        public RecyclerView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.recyclerview.widget.t.b f2895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.recyclerview.widget.t.b f2896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.t f2897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.t f2898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a0 f2899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2900h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2901i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2902j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2903k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2904l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2905m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f2906n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f2907o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2908p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2909q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2910r;

        public class a implements androidx.recyclerview.widget.t.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.t.b
            public View a(int i10) {
                return q.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.t.b
            public int b(View view) {
                return q.this.V(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.t.b
            public int c() {
                return q.this.i0();
            }

            @Override // androidx.recyclerview.widget.t.b
            public int d() {
                return q.this.s0() - q.this.j0();
            }

            @Override // androidx.recyclerview.widget.t.b
            public int e(View view) {
                return q.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements androidx.recyclerview.widget.t.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.t.b
            public View a(int i10) {
                return q.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.t.b
            public int b(View view) {
                return q.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.t.b
            public int c() {
                return q.this.k0();
            }

            @Override // androidx.recyclerview.widget.t.b
            public int d() {
                return q.this.b0() - q.this.h0();
            }

            @Override // androidx.recyclerview.widget.t.b
            public int e(View view) {
                return q.this.T(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2913a;
            public int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f2914c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f2915d;
        }

        public q() {
            a aVar = new a();
            this.f2895c = aVar;
            b bVar = new b();
            this.f2896d = bVar;
            this.f2897e = new androidx.recyclerview.widget.t(aVar);
            this.f2898f = new androidx.recyclerview.widget.t(bVar);
            this.f2900h = false;
            this.f2901i = false;
            this.f2902j = false;
            this.f2903k = true;
            this.f2904l = true;
        }

        public static boolean B0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int P(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        public static d m0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v4.c.f33322a, i10, i11);
            dVar.f2913a = typedArrayObtainStyledAttributes.getInt(v4.c.b, 1);
            dVar.b = typedArrayObtainStyledAttributes.getInt(v4.c.f33332l, 1);
            dVar.f2914c = typedArrayObtainStyledAttributes.getBoolean(v4.c.f33331k, false);
            dVar.f2915d = typedArrayObtainStyledAttributes.getBoolean(v4.c.f33333m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        public int A(@NonNull b0 b0Var) {
            return 0;
        }

        public boolean A0() {
            return false;
        }

        public final void A1(x xVar, int i10, View view) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (f0VarN0.K()) {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "ignoring view " + f0VarN0);
                    return;
                }
                return;
            }
            if (f0VarN0.u() && !f0VarN0.w() && !this.b.f2791m.i()) {
                v1(i10);
                xVar.H(f0VarN0);
            } else {
                C(i10);
                xVar.I(view);
                this.b.f2779g.k(f0VarN0);
            }
        }

        public void B(@NonNull x xVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                A1(xVar, iO, N(iO));
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int B1(int i10, x xVar, b0 b0Var) {
            return 0;
        }

        public void C(int i10) {
            D(i10, N(i10));
        }

        public boolean C0() {
            a0 a0Var = this.f2899g;
            return a0Var != null && a0Var.h();
        }

        public void C1(int i10) {
            if (RecyclerView.G0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public final void D(int i10, @NonNull View view) {
            this.f2894a.d(i10);
        }

        public boolean D0(@NonNull View view, boolean z10, boolean z11) {
            boolean z12 = this.f2897e.b(view, 24579) && this.f2898f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        @SuppressLint({"UnknownNullness"})
        public int D1(int i10, x xVar, b0 b0Var) {
            return 0;
        }

        public void E(RecyclerView recyclerView) {
            this.f2901i = true;
            L0(recyclerView);
        }

        public void E0(@NonNull View view, int i10, int i11, int i12, int i13) {
            r rVar = (r) view.getLayoutParams();
            Rect rect = rVar.b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) rVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) rVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) rVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
        }

        public void E1(RecyclerView recyclerView) {
            F1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void F(RecyclerView recyclerView, x xVar) {
            this.f2901i = false;
            N0(recyclerView, xVar);
        }

        public void F0(@NonNull View view, int i10, int i11) {
            r rVar = (r) view.getLayoutParams();
            Rect rectS0 = this.b.s0(view);
            int i12 = i10 + rectS0.left + rectS0.right;
            int i13 = i11 + rectS0.top + rectS0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) rVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) rVar).height, q());
            if (K1(view, iP, iP2, rVar)) {
                view.measure(iP, iP2);
            }
        }

        public void F1(int i10, int i11) {
            this.f2909q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f2907o = mode;
            if (mode == 0 && !RecyclerView.K0) {
                this.f2909q = 0;
            }
            this.f2910r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2908p = mode2;
            if (mode2 != 0 || RecyclerView.K0) {
                return;
            }
            this.f2910r = 0;
        }

        public View G(@NonNull View view) {
            View viewX;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewX = recyclerView.X(view)) == null || this.f2894a.n(viewX)) {
                return null;
            }
            return viewX;
        }

        public void G0(int i10, int i11) {
            View viewN = N(i10);
            if (viewN != null) {
                C(i10);
                m(viewN, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.b.toString());
            }
        }

        public void G1(int i10, int i11) {
            this.b.setMeasuredDimension(i10, i11);
        }

        public View H(int i10) {
            int iO = O();
            for (int i11 = 0; i11 < iO; i11++) {
                View viewN = N(i11);
                f0 f0VarN0 = RecyclerView.n0(viewN);
                if (f0VarN0 != null && f0VarN0.n() == i10 && !f0VarN0.K() && (this.b.f2786j0.e() || !f0VarN0.w())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i10) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.J0(i10);
            }
        }

        public void H1(Rect rect, int i10, int i11) {
            G1(s(i10, rect.width() + i0() + j0(), g0()), s(i11, rect.height() + k0() + h0(), f0()));
        }

        @SuppressLint({"UnknownNullness"})
        public abstract r I();

        public void I0(int i10) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.K0(i10);
            }
        }

        public void I1(int i10, int i11) {
            int iO = O();
            if (iO == 0) {
                this.b.C(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iO; i16++) {
                View viewN = N(i16);
                Rect rect = this.b.f2785j;
                U(viewN, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.b.f2785j.set(i15, i13, i12, i14);
            H1(this.b.f2785j, i10, i11);
        }

        @SuppressLint({"UnknownNullness"})
        public r J(Context context, AttributeSet attributeSet) {
            return new r(context, attributeSet);
        }

        public void J0(h hVar, h hVar2) {
        }

        public void J1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.f2894a = null;
                this.f2909q = 0;
                this.f2910r = 0;
            } else {
                this.b = recyclerView;
                this.f2894a = recyclerView.f2777f;
                this.f2909q = recyclerView.getWidth();
                this.f2910r = recyclerView.getHeight();
            }
            this.f2907o = 1073741824;
            this.f2908p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public r K(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof r) {
                return new r((r) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new r((ViewGroup.MarginLayoutParams) layoutParams) : new r(layoutParams);
        }

        public boolean K0(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public boolean K1(View view, int i10, int i11, r rVar) {
            return (!view.isLayoutRequested() && this.f2903k && B0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && B0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public int L() {
            return -1;
        }

        public void L0(RecyclerView recyclerView) {
        }

        public boolean L1() {
            return false;
        }

        public int M(@NonNull View view) {
            return ((r) view.getLayoutParams()).b.bottom;
        }

        @Deprecated
        public void M0(RecyclerView recyclerView) {
        }

        public boolean M1(View view, int i10, int i11, r rVar) {
            return (this.f2903k && B0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && B0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public View N(int i10) {
            androidx.recyclerview.widget.e eVar = this.f2894a;
            if (eVar != null) {
                return eVar.f(i10);
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void N0(RecyclerView recyclerView, x xVar) {
            M0(recyclerView);
        }

        @SuppressLint({"UnknownNullness"})
        public void N1(RecyclerView recyclerView, b0 b0Var, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int O() {
            androidx.recyclerview.widget.e eVar = this.f2894a;
            if (eVar != null) {
                return eVar.g();
            }
            return 0;
        }

        public View O0(@NonNull View view, int i10, @NonNull x xVar, @NonNull b0 b0Var) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void O1(a0 a0Var) {
            a0 a0Var2 = this.f2899g;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.f2899g.r();
            }
            this.f2899g = a0Var;
            a0Var.q(this.b, this);
        }

        public void P0(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            Q0(recyclerView.f2771c, recyclerView.f2786j0, accessibilityEvent);
        }

        public void P1() {
            a0 a0Var = this.f2899g;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public final int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iI0;
            int iMin = Math.min(0, i10);
            int i11 = top - iK0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iS0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public void Q0(@NonNull x xVar, @NonNull b0 b0Var, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.b.f2791m;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.e());
            }
        }

        public boolean Q1() {
            return false;
        }

        public boolean R() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.f2781h;
        }

        public void R0(@NonNull x xVar, @NonNull b0 b0Var, @NonNull y2.p pVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                pVar.a(8192);
                pVar.G0(true);
                pVar.v0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                pVar.a(Barcode.FORMAT_AZTEC);
                pVar.G0(true);
                pVar.v0(true);
            }
            pVar.n0(y2.p.f.b(o0(xVar, b0Var), S(xVar, b0Var), z0(xVar, b0Var), p0(xVar, b0Var)));
        }

        public int S(@NonNull x xVar, @NonNull b0 b0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.f2791m == null || !p()) {
                return 1;
            }
            return this.b.f2791m.e();
        }

        public void S0(y2.p pVar) {
            RecyclerView recyclerView = this.b;
            R0(recyclerView.f2771c, recyclerView.f2786j0, pVar);
        }

        public int T(@NonNull View view) {
            return view.getBottom() + M(view);
        }

        public void T0(View view, y2.p pVar) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (f0VarN0 == null || f0VarN0.w() || this.f2894a.n(f0VarN0.f2861a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            U0(recyclerView.f2771c, recyclerView.f2786j0, view, pVar);
        }

        public void U(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.p0(view, rect);
        }

        public void U0(@NonNull x xVar, @NonNull b0 b0Var, @NonNull View view, @NonNull y2.p pVar) {
            pVar.o0(y2.p.g.b(q() ? l0(view) : 0, 1, p() ? l0(view) : 0, 1, false, false));
        }

        public int V(@NonNull View view) {
            return view.getLeft() - e0(view);
        }

        public View V0(@NonNull View view, int i10) {
            return null;
        }

        public int W(@NonNull View view) {
            Rect rect = ((r) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public int X(@NonNull View view) {
            Rect rect = ((r) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(@NonNull RecyclerView recyclerView) {
        }

        public int Y(@NonNull View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(@NonNull RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int Z(@NonNull View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2894a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public int b0() {
            return this.f2910r;
        }

        public void b1(@NonNull RecyclerView recyclerView, int i10, int i11, Object obj) {
            a1(recyclerView, i10, i11);
        }

        public int c0() {
            return this.f2908p;
        }

        @SuppressLint({"UnknownNullness"})
        public void c1(x xVar, b0 b0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int d0() {
            return this.b.getLayoutDirection();
        }

        @SuppressLint({"UnknownNullness"})
        public void d1(b0 b0Var) {
        }

        public int e() {
            RecyclerView recyclerView = this.b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public int e0(@NonNull View view) {
            return ((r) view.getLayoutParams()).b.left;
        }

        public void e1(@NonNull x xVar, @NonNull b0 b0Var, int i10, int i11) {
            this.b.C(i10, i11);
        }

        public int f0() {
            return o0.A(this.b);
        }

        @Deprecated
        public boolean f1(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
            return C0() || recyclerView.D0();
        }

        @SuppressLint({"UnknownNullness"})
        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return o0.B(this.b);
        }

        public boolean g1(@NonNull RecyclerView recyclerView, @NonNull b0 b0Var, @NonNull View view, View view2) {
            return f1(recyclerView, view, view2);
        }

        @SuppressLint({"UnknownNullness"})
        public void h(View view, int i10) {
            k(view, i10, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public void h1(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable i1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void j(View view, int i10) {
            k(view, i10, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void j1(int i10) {
        }

        public final void k(View view, int i10, boolean z10) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (z10 || f0VarN0.w()) {
                this.b.f2779g.b(f0VarN0);
            } else {
                this.b.f2779g.p(f0VarN0);
            }
            r rVar = (r) view.getLayoutParams();
            if (f0VarN0.M() || f0VarN0.x()) {
                if (f0VarN0.x()) {
                    f0VarN0.L();
                } else {
                    f0VarN0.e();
                }
                this.f2894a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int iM = this.f2894a.m(view);
                if (i10 == -1) {
                    i10 = this.f2894a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.V());
                }
                if (iM != i10) {
                    this.b.f2793n.G0(iM, i10);
                }
            } else {
                this.f2894a.a(view, i10, false);
                rVar.f2917c = true;
                a0 a0Var = this.f2899g;
                if (a0Var != null && a0Var.h()) {
                    this.f2899g.k(view);
                }
            }
            if (rVar.f2918d) {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + rVar.f2916a);
                }
                f0VarN0.f2861a.invalidate();
                rVar.f2918d = false;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void k1(a0 a0Var) {
            if (this.f2899g == a0Var) {
                this.f2899g = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void l(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int l0(@NonNull View view) {
            return ((r) view.getLayoutParams()).b();
        }

        public boolean l1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return m1(recyclerView.f2771c, recyclerView.f2786j0, i10, bundle);
        }

        public void m(@NonNull View view, int i10) {
            n(view, i10, (r) view.getLayoutParams());
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0065 A[PHI: r11
          0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean m1(@NonNull x xVar, @NonNull b0 b0Var, int i10, Bundle bundle) {
            int iK0;
            int iI0;
            float f10;
            if (this.b == null) {
                return false;
            }
            int iB0 = b0();
            int iS0 = s0();
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                iB0 = rect.height();
                iS0 = rect.width();
            }
            if (i10 == 4096) {
                iK0 = this.b.canScrollVertically(1) ? (iB0 - k0()) - h0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    iI0 = (iS0 - i0()) - j0();
                } else {
                    iI0 = 0;
                }
            } else if (i10 != 8192) {
                iK0 = 0;
                iI0 = 0;
            } else {
                iK0 = this.b.canScrollVertically(-1) ? -((iB0 - k0()) - h0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    iI0 = -((iS0 - i0()) - j0());
                } else {
                    iI0 = 0;
                }
            }
            if (iK0 == 0 && iI0 == 0) {
                return false;
            }
            if (bundle != null) {
                f10 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f10 < 0.0f) {
                    if (!RecyclerView.F0) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f10 + ")");
                }
            } else {
                f10 = 1.0f;
            }
            if (Float.compare(f10, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f10) != 0 && Float.compare(0.0f, f10) != 0) {
                    iI0 = (int) (iI0 * f10);
                    iK0 = (int) (iK0 * f10);
                }
                this.b.B1(iI0, iK0, null, Integer.MIN_VALUE, true);
                return true;
            }
            RecyclerView recyclerView = this.b;
            h hVar = recyclerView.f2791m;
            if (hVar == null) {
                return false;
            }
            if (i10 == 4096) {
                recyclerView.C1(hVar.e() - 1);
            } else if (i10 == 8192) {
                recyclerView.C1(0);
            }
            return true;
        }

        public void n(@NonNull View view, int i10, r rVar) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (f0VarN0.w()) {
                this.b.f2779g.b(f0VarN0);
            } else {
                this.b.f2779g.p(f0VarN0);
            }
            this.f2894a.c(view, i10, rVar, f0VarN0.w());
        }

        public int n0(@NonNull View view) {
            return ((r) view.getLayoutParams()).b.right;
        }

        public boolean n1(@NonNull View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return o1(recyclerView.f2771c, recyclerView.f2786j0, view, i10, bundle);
        }

        public void o(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.s0(view));
            }
        }

        public int o0(@NonNull x xVar, @NonNull b0 b0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.f2791m == null || !q()) {
                return 1;
            }
            return this.b.f2791m.e();
        }

        public boolean o1(@NonNull x xVar, @NonNull b0 b0Var, @NonNull View view, int i10, Bundle bundle) {
            return false;
        }

        public boolean p() {
            return false;
        }

        public int p0(@NonNull x xVar, @NonNull b0 b0Var) {
            return 0;
        }

        public void p1(@NonNull x xVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.n0(N(iO)).K()) {
                    s1(iO, xVar);
                }
            }
        }

        public boolean q() {
            return false;
        }

        public int q0(@NonNull View view) {
            return ((r) view.getLayoutParams()).b.top;
        }

        public void q1(x xVar) {
            int iJ = xVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = xVar.n(i10);
                f0 f0VarN0 = RecyclerView.n0(viewN);
                if (!f0VarN0.K()) {
                    f0VarN0.H(false);
                    if (f0VarN0.y()) {
                        this.b.removeDetachedView(viewN, false);
                    }
                    n nVar = this.b.O;
                    if (nVar != null) {
                        nVar.j(f0VarN0);
                    }
                    f0VarN0.H(true);
                    xVar.D(viewN);
                }
            }
            xVar.e();
            if (iJ > 0) {
                this.b.invalidate();
            }
        }

        public boolean r(r rVar) {
            return rVar != null;
        }

        public void r0(@NonNull View view, boolean z10, @NonNull Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((r) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.f2789l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(@NonNull View view, @NonNull x xVar) {
            u1(view);
            xVar.G(view);
        }

        public int s0() {
            return this.f2909q;
        }

        public void s1(int i10, @NonNull x xVar) {
            View viewN = N(i10);
            v1(i10);
            xVar.G(viewN);
        }

        @SuppressLint({"UnknownNullness"})
        public void t(int i10, int i11, b0 b0Var, c cVar) {
        }

        public int t0() {
            return this.f2907o;
        }

        public boolean t1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void u(int i10, c cVar) {
        }

        public boolean u0() {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void u1(View view) {
            this.f2894a.p(view);
        }

        public int v(@NonNull b0 b0Var) {
            return 0;
        }

        public boolean v0() {
            return this.f2901i;
        }

        public void v1(int i10) {
            if (N(i10) != null) {
                this.f2894a.q(i10);
            }
        }

        public int w(@NonNull b0 b0Var) {
            return 0;
        }

        public boolean w0() {
            return this.f2902j;
        }

        public boolean w1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10) {
            return x1(recyclerView, view, rect, z10, false);
        }

        public int x(@NonNull b0 b0Var) {
            return 0;
        }

        public final boolean x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.b.f2785j;
            U(focusedChild, rect);
            return rect.left - i10 < iS0 && rect.right - i10 > iI0 && rect.top - i11 < iB0 && rect.bottom - i11 > iK0;
        }

        public boolean x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            int[] iArrQ = Q(view, rect);
            int i10 = iArrQ[0];
            int i11 = iArrQ[1];
            if ((z11 && !x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.y1(i10, i11);
            }
            return true;
        }

        public int y(@NonNull b0 b0Var) {
            return 0;
        }

        public final boolean y0() {
            return this.f2904l;
        }

        public void y1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int z(@NonNull b0 b0Var) {
            return 0;
        }

        public boolean z0(@NonNull x xVar, @NonNull b0 b0Var) {
            return false;
        }

        public void z1() {
            this.f2900h = true;
        }
    }

    public interface s {
        void a(@NonNull View view);

        void b(@NonNull View view);
    }

    public static abstract class t {
        public abstract boolean a(int i10, int i11);
    }

    public interface u {
        void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        boolean b(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class v {
        public void a(@NonNull RecyclerView recyclerView, int i10) {
        }

        public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<a> f2919a = new SparseArray<>();
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<h<?>> f2920c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<f0> f2921a = new ArrayList<>();
            public int b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f2922c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f2923d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b(@NonNull h<?> hVar) {
            this.f2920c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f2919a.size(); i10++) {
                a aVarValueAt = this.f2919a.valueAt(i10);
                ArrayList<f0> arrayList = aVarValueAt.f2921a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    f0 f0Var = arrayList.get(i11);
                    i11++;
                    q3.a.a(f0Var.f2861a);
                }
                aVarValueAt.f2921a.clear();
            }
        }

        public void d() {
            this.b--;
        }

        public void e(@NonNull h<?> hVar, boolean z10) {
            this.f2920c.remove(hVar);
            if (this.f2920c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f2919a.size(); i10++) {
                SparseArray<a> sparseArray = this.f2919a;
                ArrayList<f0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f2921a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q3.a.a(arrayList.get(i11).f2861a);
                }
            }
        }

        public void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f2923d = l(aVarI.f2923d, j10);
        }

        public void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f2922c = l(aVarI.f2922c, j10);
        }

        public f0 h(int i10) {
            a aVar = this.f2919a.get(i10);
            if (aVar == null || aVar.f2921a.isEmpty()) {
                return null;
            }
            ArrayList<f0> arrayList = aVar.f2921a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).s()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a i(int i10) {
            a aVar = this.f2919a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2919a.put(i10, aVar2);
            return aVar2;
        }

        public void j(h<?> hVar, h<?> hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(f0 f0Var) {
            int iM = f0Var.m();
            ArrayList<f0> arrayList = i(iM).f2921a;
            if (this.f2919a.get(iM).b <= arrayList.size()) {
                q3.a.a(f0Var.f2861a);
            } else {
                if (RecyclerView.F0 && arrayList.contains(f0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f0Var.E();
                arrayList.add(f0Var);
            }
        }

        public long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        public boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f2923d;
            return j12 == 0 || j10 + j12 < j11;
        }

        public boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f2922c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<f0> f2924a;
        public ArrayList<f0> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<f0> f2925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<f0> f2926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2928f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public w f2929g;

        public x() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.f2924a = arrayList;
            this.b = null;
            this.f2925c = new ArrayList<>();
            this.f2926d = Collections.unmodifiableList(arrayList);
            this.f2927e = 2;
            this.f2928f = 2;
        }

        public void A() {
            for (int i10 = 0; i10 < this.f2925c.size(); i10++) {
                q3.a.a(this.f2925c.get(i10).f2861a);
            }
            B(RecyclerView.this.f2791m);
        }

        public final void B(h<?> hVar) {
            C(hVar, false);
        }

        public final void C(h<?> hVar, boolean z10) {
            w wVar = this.f2929g;
            if (wVar != null) {
                wVar.e(hVar, z10);
            }
        }

        public void D(View view) {
            f0 f0VarN0 = RecyclerView.n0(view);
            f0VarN0.f2873n = null;
            f0VarN0.f2874o = false;
            f0VarN0.e();
            H(f0VarN0);
        }

        public void E() {
            for (int size = this.f2925c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f2925c.clear();
            if (RecyclerView.L0) {
                RecyclerView.this.f2784i0.b();
            }
        }

        public void F(int i10) {
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            f0 f0Var = this.f2925c.get(i10);
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f0Var);
            }
            a(f0Var, true);
            this.f2925c.remove(i10);
        }

        public void G(@NonNull View view) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (f0VarN0.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f0VarN0.x()) {
                f0VarN0.L();
            } else if (f0VarN0.M()) {
                f0VarN0.e();
            }
            H(f0VarN0);
            if (RecyclerView.this.O == null || f0VarN0.v()) {
                return;
            }
            RecyclerView.this.O.j(f0VarN0);
        }

        public void H(f0 f0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (f0Var.x() || f0Var.f2861a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(f0Var.x());
                sb2.append(" isAttached:");
                sb2.append(f0Var.f2861a.getParent() != null);
                sb2.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (f0Var.y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.V());
            }
            if (f0Var.K()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean zH = f0Var.h();
            h hVar = RecyclerView.this.f2791m;
            boolean z13 = hVar != null && zH && hVar.v(f0Var);
            if (RecyclerView.F0 && this.f2925c.contains(f0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f0Var + RecyclerView.this.V());
            }
            if (z13 || f0Var.v()) {
                if (this.f2928f <= 0 || f0Var.q(526)) {
                    z10 = false;
                } else {
                    int size = this.f2925c.size();
                    if (size >= this.f2928f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.L0 && size > 0 && !RecyclerView.this.f2784i0.d(f0Var.f2862c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f2784i0.d(this.f2925c.get(i10).f2862c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f2925c.add(size, f0Var);
                    z10 = true;
                }
                if (z10) {
                    z12 = false;
                } else {
                    a(f0Var, true);
                }
                z11 = z10;
            } else {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
                }
                z12 = false;
            }
            RecyclerView.this.f2779g.q(f0Var);
            if (z11 || z12 || !zH) {
                return;
            }
            q3.a.a(f0Var.f2861a);
            f0Var.f2878s = null;
            f0Var.f2877r = null;
        }

        public void I(View view) {
            f0 f0VarN0 = RecyclerView.n0(view);
            if (!f0VarN0.q(12) && f0VarN0.z() && !RecyclerView.this.s(f0VarN0)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                f0VarN0.I(this, true);
                this.b.add(f0VarN0);
                return;
            }
            if (!f0VarN0.u() || f0VarN0.w() || RecyclerView.this.f2791m.i()) {
                f0VarN0.I(this, false);
                this.f2924a.add(f0VarN0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        public void J(w wVar) {
            B(RecyclerView.this.f2791m);
            w wVar2 = this.f2929g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.f2929g = wVar;
            if (wVar != null && RecyclerView.this.getAdapter() != null) {
                this.f2929g.a();
            }
            u();
        }

        public void K(d0 d0Var) {
        }

        public void L(int i10) {
            this.f2927e = i10;
            P();
        }

        public final boolean M(@NonNull f0 f0Var, int i10, int i11, long j10) {
            f0Var.f2878s = null;
            f0Var.f2877r = RecyclerView.this;
            int iM = f0Var.m();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f2929g.m(iM, nanoTime, j10)) {
                return false;
            }
            if (f0Var.y()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f0Var.f2861a, recyclerView.getChildCount(), f0Var.f2861a.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f2791m.a(f0Var, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(f0Var.f2861a);
            }
            this.f2929g.f(f0Var.m(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f0Var);
            if (RecyclerView.this.f2786j0.e()) {
                f0Var.f2866g = i11;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0217  */
        /* JADX WARN: Code duplicated, block: B:103:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:105:0x0220  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:72:0x0171  */
        /* JADX WARN: Code duplicated, block: B:78:0x019d  */
        /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:97:0x0201  */
        /* JADX WARN: Code duplicated, block: B:99:0x0209  */
        public f0 N(int i10, boolean z10, long j10) {
            f0 f0VarC;
            boolean z11;
            f0 f0Var;
            boolean z12;
            boolean zM;
            ViewGroup.LayoutParams layoutParams;
            r rVar;
            int iM;
            RecyclerView recyclerViewB0;
            if (i10 < 0 || i10 >= RecyclerView.this.f2786j0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.f2786j0.b() + RecyclerView.this.V());
            }
            if (RecyclerView.this.f2786j0.e()) {
                f0VarC = h(i10);
                if (f0VarC != null) {
                    z11 = true;
                }
                if (f0VarC == null && (f0VarC = m(i10, z10)) != null) {
                    if (Q(f0VarC)) {
                        z11 = true;
                    } else {
                        if (!z10) {
                            f0VarC.b(4);
                            if (f0VarC.x()) {
                                RecyclerView.this.removeDetachedView(f0VarC.f2861a, false);
                                f0VarC.L();
                            } else if (f0VarC.M()) {
                                f0VarC.e();
                            }
                            H(f0VarC);
                        }
                        f0VarC = null;
                    }
                }
                if (f0VarC == null) {
                    iM = RecyclerView.this.f2775e.m(i10);
                    if (iM >= 0 || iM >= RecyclerView.this.f2791m.e()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f2786j0.b() + RecyclerView.this.V());
                    }
                    int iG = RecyclerView.this.f2791m.g(iM);
                    if (RecyclerView.this.f2791m.i() && (f0VarC = l(RecyclerView.this.f2791m.f(iM), iG, z10)) != null) {
                        f0VarC.f2862c = iM;
                        z11 = true;
                    }
                    if (f0VarC == null) {
                        if (RecyclerView.G0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i10 + ") fetching from shared pool");
                        }
                        f0VarC = i().h(iG);
                        if (f0VarC != null) {
                            f0VarC.E();
                            if (RecyclerView.J0) {
                                r(f0VarC);
                            }
                        }
                    }
                    if (f0VarC == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != Long.MAX_VALUE && !this.f2929g.n(iG, nanoTime, j10)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        f0VarC = recyclerView.f2791m.c(recyclerView, iG);
                        if (RecyclerView.L0 && (recyclerViewB0 = RecyclerView.b0(f0VarC.f2861a)) != null) {
                            f0VarC.b = new WeakReference<>(recyclerViewB0);
                        }
                        this.f2929g.g(iG, RecyclerView.this.getNanoTime() - nanoTime);
                        if (RecyclerView.G0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
                f0Var = f0VarC;
                z12 = z11;
                if (z12 && !RecyclerView.this.f2786j0.e() && f0Var.q(8192)) {
                    f0Var.G(0, 8192);
                    if (RecyclerView.this.f2786j0.f2844k) {
                        int iE = n.e(f0Var) | Barcode.FORMAT_AZTEC;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.b1(f0Var, recyclerView2.O.t(recyclerView2.f2786j0, f0Var, iE, f0Var.p()));
                    }
                }
                if (RecyclerView.this.f2786j0.e() || !f0Var.t()) {
                    if (f0Var.t() || f0Var.A() || f0Var.u()) {
                        if (!RecyclerView.F0 && f0Var.w()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + f0Var + RecyclerView.this.V());
                        }
                        zM = M(f0Var, RecyclerView.this.f2775e.m(i10), i10, j10);
                    }
                    layoutParams = f0Var.f2861a.getLayoutParams();
                    if (layoutParams == null) {
                        rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                        f0Var.f2861a.setLayoutParams(rVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        rVar = (r) layoutParams;
                    } else {
                        rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                        f0Var.f2861a.setLayoutParams(rVar);
                    }
                    rVar.f2916a = f0Var;
                    rVar.f2918d = !z12 && zM;
                    return f0Var;
                }
                f0Var.f2866g = i10;
                zM = false;
                layoutParams = f0Var.f2861a.getLayoutParams();
                if (layoutParams == null) {
                    rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                    f0Var.f2861a.setLayoutParams(rVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                    f0Var.f2861a.setLayoutParams(rVar);
                } else {
                    rVar = (r) layoutParams;
                }
                rVar.f2916a = f0Var;
                rVar.f2918d = !z12 && zM;
                return f0Var;
            }
            f0VarC = null;
            z11 = false;
            if (f0VarC == null) {
                if (Q(f0VarC)) {
                    if (!z10) {
                        f0VarC.b(4);
                        if (f0VarC.x()) {
                            RecyclerView.this.removeDetachedView(f0VarC.f2861a, false);
                            f0VarC.L();
                        } else if (f0VarC.M()) {
                            f0VarC.e();
                        }
                        H(f0VarC);
                    }
                    f0VarC = null;
                } else {
                    z11 = true;
                }
            }
            if (f0VarC == null) {
                iM = RecyclerView.this.f2775e.m(i10);
                if (iM >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f2786j0.b() + RecyclerView.this.V());
            }
            f0Var = f0VarC;
            z12 = z11;
            if (z12) {
                f0Var.G(0, 8192);
                if (RecyclerView.this.f2786j0.f2844k) {
                    int iE2 = n.e(f0Var) | Barcode.FORMAT_AZTEC;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.b1(f0Var, recyclerView3.O.t(recyclerView3.f2786j0, f0Var, iE2, f0Var.p()));
                }
            }
            if (RecyclerView.this.f2786j0.e()) {
                if (f0Var.t()) {
                }
                if (!RecyclerView.F0) {
                }
                zM = M(f0Var, RecyclerView.this.f2775e.m(i10), i10, j10);
            } else {
                if (f0Var.t()) {
                }
                if (!RecyclerView.F0) {
                }
                zM = M(f0Var, RecyclerView.this.f2775e.m(i10), i10, j10);
            }
            layoutParams = f0Var.f2861a.getLayoutParams();
            if (layoutParams == null) {
                rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                f0Var.f2861a.setLayoutParams(rVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                f0Var.f2861a.setLayoutParams(rVar);
            } else {
                rVar = (r) layoutParams;
            }
            rVar.f2916a = f0Var;
            rVar.f2918d = !z12 && zM;
            return f0Var;
        }

        public void O(f0 f0Var) {
            if (f0Var.f2874o) {
                this.b.remove(f0Var);
            } else {
                this.f2924a.remove(f0Var);
            }
            f0Var.f2873n = null;
            f0Var.f2874o = false;
            f0Var.e();
        }

        public void P() {
            q qVar = RecyclerView.this.f2793n;
            this.f2928f = this.f2927e + (qVar != null ? qVar.f2905m : 0);
            for (int size = this.f2925c.size() - 1; size >= 0 && this.f2925c.size() > this.f2928f; size--) {
                F(size);
            }
        }

        public boolean Q(f0 f0Var) {
            if (f0Var.w()) {
                if (!RecyclerView.F0 || RecyclerView.this.f2786j0.e()) {
                    return RecyclerView.this.f2786j0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i10 = f0Var.f2862c;
            if (i10 >= 0 && i10 < RecyclerView.this.f2791m.e()) {
                if (RecyclerView.this.f2786j0.e() || RecyclerView.this.f2791m.g(f0Var.f2862c) == f0Var.m()) {
                    return !RecyclerView.this.f2791m.i() || f0Var.l() == RecyclerView.this.f2791m.f(f0Var.f2862c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.V());
        }

        public void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f2925c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f2925c.get(size);
                if (f0Var != null && (i12 = f0Var.f2862c) >= i10 && i12 < i13) {
                    f0Var.b(2);
                    F(size);
                }
            }
        }

        public void a(@NonNull f0 f0Var, boolean z10) {
            RecyclerView.u(f0Var);
            View view = f0Var.f2861a;
            androidx.recyclerview.widget.p pVar = RecyclerView.this.f2800q0;
            if (pVar != null) {
                androidx.core.view.a aVarN = pVar.n();
                o0.m0(view, aVarN instanceof androidx.recyclerview.widget.p.a ? ((androidx.recyclerview.widget.p.a) aVarN).n(view) : null);
            }
            if (z10) {
                g(f0Var);
            }
            f0Var.f2878s = null;
            f0Var.f2877r = null;
            i().k(f0Var);
        }

        public final void b(f0 f0Var) {
            if (RecyclerView.this.C0()) {
                View view = f0Var.f2861a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.p pVar = RecyclerView.this.f2800q0;
                if (pVar == null) {
                    return;
                }
                androidx.core.view.a aVarN = pVar.n();
                if (aVarN instanceof androidx.recyclerview.widget.p.a) {
                    ((androidx.recyclerview.widget.p.a) aVarN).o(view);
                }
                o0.m0(view, aVarN);
            }
        }

        public void c() {
            this.f2924a.clear();
            E();
        }

        public void d() {
            int size = this.f2925c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2925c.get(i10).c();
            }
            int size2 = this.f2924a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f2924a.get(i11).c();
            }
            ArrayList<f0> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.b.get(i12).c();
                }
            }
        }

        public void e() {
            this.f2924a.clear();
            ArrayList<f0> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f2786j0.b()) {
                return !RecyclerView.this.f2786j0.e() ? i10 : RecyclerView.this.f2775e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f2786j0.b() + RecyclerView.this.V());
        }

        public void g(@NonNull f0 f0Var) {
            y yVar = RecyclerView.this.f2795o;
            if (yVar != null) {
                yVar.a(f0Var);
            }
            int size = RecyclerView.this.f2797p.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.f2797p.get(i10).a(f0Var);
            }
            h hVar = RecyclerView.this.f2791m;
            if (hVar != null) {
                hVar.y(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2786j0 != null) {
                recyclerView.f2779g.q(f0Var);
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + f0Var);
            }
        }

        public f0 h(int i10) {
            int size;
            int iM;
            ArrayList<f0> arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    f0 f0Var = this.b.get(i11);
                    if (!f0Var.M() && f0Var.n() == i10) {
                        f0Var.b(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.f2791m.i() && (iM = RecyclerView.this.f2775e.m(i10)) > 0 && iM < RecyclerView.this.f2791m.e()) {
                    long jF = RecyclerView.this.f2791m.f(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        f0 f0Var2 = this.b.get(i12);
                        if (!f0Var2.M() && f0Var2.l() == jF) {
                            f0Var2.b(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public w i() {
            if (this.f2929g == null) {
                this.f2929g = new w();
                u();
            }
            return this.f2929g;
        }

        public int j() {
            return this.f2924a.size();
        }

        @NonNull
        public List<f0> k() {
            return this.f2926d;
        }

        public f0 l(long j10, int i10, boolean z10) {
            for (int size = this.f2924a.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f2924a.get(size);
                if (f0Var.l() == j10 && !f0Var.M()) {
                    if (i10 == f0Var.m()) {
                        f0Var.b(32);
                        if (f0Var.w() && !RecyclerView.this.f2786j0.e()) {
                            f0Var.G(2, 14);
                        }
                        return f0Var;
                    }
                    if (!z10) {
                        this.f2924a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.f2861a, false);
                        D(f0Var.f2861a);
                    }
                }
            }
            int size2 = this.f2925c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.f2925c.get(size2);
                if (f0Var2.l() == j10 && !f0Var2.s()) {
                    if (i10 == f0Var2.m()) {
                        if (!z10) {
                            this.f2925c.remove(size2);
                        }
                        return f0Var2;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        public f0 m(int i10, boolean z10) {
            View viewE;
            int size = this.f2924a.size();
            for (int i11 = 0; i11 < size; i11++) {
                f0 f0Var = this.f2924a.get(i11);
                if (!f0Var.M() && f0Var.n() == i10 && !f0Var.u() && (RecyclerView.this.f2786j0.f2841h || !f0Var.w())) {
                    f0Var.b(32);
                    return f0Var;
                }
            }
            if (!z10 && (viewE = RecyclerView.this.f2777f.e(i10)) != null) {
                f0 f0VarN0 = RecyclerView.n0(viewE);
                RecyclerView.this.f2777f.s(viewE);
                int iM = RecyclerView.this.f2777f.m(viewE);
                if (iM != -1) {
                    RecyclerView.this.f2777f.d(iM);
                    I(viewE);
                    f0VarN0.b(8224);
                    return f0VarN0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f0VarN0 + RecyclerView.this.V());
            }
            int size2 = this.f2925c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                f0 f0Var2 = this.f2925c.get(i12);
                if (!f0Var2.u() && f0Var2.n() == i10 && !f0Var2.s()) {
                    if (!z10) {
                        this.f2925c.remove(i12);
                    }
                    if (RecyclerView.G0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f0Var2);
                    }
                    return f0Var2;
                }
            }
            return null;
        }

        public View n(int i10) {
            return this.f2924a.get(i10).f2861a;
        }

        @NonNull
        public View o(int i10) {
            return p(i10, false);
        }

        public View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).f2861a;
        }

        public final void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(f0 f0Var) {
            View view = f0Var.f2861a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f2925c.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) this.f2925c.get(i10).f2861a.getLayoutParams();
                if (rVar != null) {
                    rVar.f2917c = true;
                }
            }
        }

        public void t() {
            int size = this.f2925c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f0 f0Var = this.f2925c.get(i10);
                if (f0Var != null) {
                    f0Var.b(6);
                    f0Var.a(null);
                }
            }
            h hVar = RecyclerView.this.f2791m;
            if (hVar == null || !hVar.i()) {
                E();
            }
        }

        public final void u() {
            if (this.f2929g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2791m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f2929g.b(RecyclerView.this.f2791m);
            }
        }

        public void v(int i10, int i11) {
            int size = this.f2925c.size();
            for (int i12 = 0; i12 < size; i12++) {
                f0 f0Var = this.f2925c.get(i12);
                if (f0Var != null && f0Var.f2862c >= i10) {
                    if (RecyclerView.G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + f0Var + " now at position " + (f0Var.f2862c + i11));
                    }
                    f0Var.B(i11, false);
                }
            }
        }

        public void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f2925c.size();
            for (int i16 = 0; i16 < size; i16++) {
                f0 f0Var = this.f2925c.get(i16);
                if (f0Var != null && (i15 = f0Var.f2862c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        f0Var.B(i11 - i10, false);
                    } else {
                        f0Var.B(i12, false);
                    }
                    if (RecyclerView.G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + f0Var);
                    }
                }
            }
        }

        public void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f2925c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f2925c.get(size);
                if (f0Var != null) {
                    int i13 = f0Var.f2862c;
                    if (i13 >= i12) {
                        if (RecyclerView.G0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f0Var + " now at position " + (f0Var.f2862c - i11));
                        }
                        f0Var.B(-i11, z10);
                    } else if (i13 >= i10) {
                        f0Var.b(8);
                        F(size);
                    }
                }
            }
        }

        public void y(h<?> hVar, h<?> hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        public void z() {
            u();
        }
    }

    public interface y {
        void a(@NonNull f0 f0Var);
    }

    public class z extends j {
        public z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2786j0.f2840g = true;
            recyclerView.Z0(true);
            if (RecyclerView.this.f2775e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f2775e.r(i10, i11, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f2775e.s(i10, i11)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f2775e.t(i10, i11, i12)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f2775e.u(i10, i11)) {
                g();
            }
        }

        public void g() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2807u && recyclerView.f2805t) {
                o0.e0(recyclerView, recyclerView.f2783i);
            } else {
                recyclerView.C = true;
                recyclerView.requestLayout();
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        M0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        N0 = new c();
        O0 = new c0();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private boolean G1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || d3.e.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            d3.e.d(this.K, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && d3.e.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            d3.e.d(this.M, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && d3.e.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            d3.e.d(this.L, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 == null || d3.e.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        d3.e.d(this.N, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public static RecyclerView b0(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewB0 = b0(viewGroup.getChildAt(i10));
            if (recyclerViewB0 != null) {
                return recyclerViewB0;
            }
        }
        return null;
    }

    private int f1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.L;
        float f11 = 0.0f;
        if (edgeEffect == null || d3.e.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.N;
            if (edgeEffect2 != null && d3.e.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.N.onRelease();
                } else {
                    float fD = d3.e.d(this.N, height, 1.0f - width);
                    if (d3.e.b(this.N) == 0.0f) {
                        this.N.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.L.onRelease();
            } else {
                float f12 = -d3.e.d(this.L, -height, width);
                if (d3.e.b(this.L) == 0.0f) {
                    this.L.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private androidx.core.view.u getScrollingChildHelper() {
        if (this.f2804s0 == null) {
            this.f2804s0 = new androidx.core.view.u(this);
        }
        return this.f2804s0;
    }

    public static f0 n0(View view) {
        if (view == null) {
            return null;
        }
        return ((r) view.getLayoutParams()).f2916a;
    }

    public static void p0(View view, Rect rect) {
        r rVar = (r) view.getLayoutParams();
        Rect rect2 = rVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        F0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        G0 = z10;
    }

    private float t0(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f2768a * 0.015f));
        float f10 = I0;
        return (float) (((double) (this.f2768a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    public static void u(@NonNull f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.f2861a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f0Var.b = null;
        }
    }

    public void A() {
        if (!this.f2811w || this.F) {
            Trace.beginSection("RV FullInvalidate");
            H();
            Trace.endSection();
            return;
        }
        if (this.f2775e.p()) {
            if (!this.f2775e.o(4) || this.f2775e.o(11)) {
                if (this.f2775e.p()) {
                    Trace.beginSection("RV FullInvalidate");
                    H();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            D1();
            Q0();
            this.f2775e.w();
            if (!this.f2815y) {
                if (w0()) {
                    H();
                } else {
                    this.f2775e.i();
                }
            }
            H1(true);
            R0();
            Trace.endSection();
        }
    }

    public void A0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(v4.b.f33320a), resources.getDimensionPixelSize(v4.b.f33321c), resources.getDimensionPixelOffset(v4.b.b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void A1(int i10, int i11, Interpolator interpolator, int i12) {
        B1(i10, i11, interpolator, i12, false);
    }

    public final void B(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strR0 = r0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strR0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(q.class);
                try {
                    constructor = clsAsSubclass.getConstructor(M0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strR0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((q) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strR0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strR0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strR0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strR0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strR0, e16);
            }
        }
    }

    public void B0() {
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void B1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        q qVar = this.f2793n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2817z) {
            return;
        }
        if (!qVar.p()) {
            i10 = 0;
        }
        if (!this.f2793n.q()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            E1(i13, 1);
        }
        this.f2780g0.e(i10, i11, i12, interpolator);
    }

    public void C(int i10, int i11) {
        setMeasuredDimension(q.s(i10, getPaddingLeft() + getPaddingRight(), o0.B(this)), q.s(i11, getPaddingTop() + getPaddingBottom(), o0.A(this)));
    }

    public boolean C0() {
        AccessibilityManager accessibilityManager = this.D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void C1(int i10) {
        if (this.f2817z) {
            return;
        }
        q qVar = this.f2793n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.N1(this, this.f2786j0, i10);
        }
    }

    public final boolean D(int i10, int i11) {
        a0(this.f2802r0);
        int[] iArr = this.f2802r0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    public boolean D0() {
        return this.H > 0;
    }

    public void D1() {
        int i10 = this.f2813x + 1;
        this.f2813x = i10;
        if (i10 != 1 || this.f2817z) {
            return;
        }
        this.f2815y = false;
    }

    public void E(View view) {
        f0 f0VarN0 = n0(view);
        O0(view);
        h hVar = this.f2791m;
        if (hVar != null && f0VarN0 != null) {
            hVar.w(f0VarN0);
        }
        List<s> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).b(view);
            }
        }
    }

    public final boolean E0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || X(view2) == null) {
            return false;
        }
        if (view == null || X(view) == null) {
            return true;
        }
        this.f2785j.set(0, 0, view.getWidth(), view.getHeight());
        this.f2787k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f2785j);
        offsetDescendantRectToMyCoords(view2, this.f2787k);
        byte b10 = -1;
        int i12 = this.f2793n.d0() == 1 ? -1 : 1;
        Rect rect = this.f2785j;
        int i13 = rect.left;
        Rect rect2 = this.f2787k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + V());
    }

    public boolean E1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    public void F(View view) {
        f0 f0VarN0 = n0(view);
        P0(view);
        h hVar = this.f2791m;
        if (hVar != null && f0VarN0 != null) {
            hVar.x(f0VarN0);
        }
        List<s> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).a(view);
            }
        }
    }

    public void F0(int i10) {
        if (this.f2793n == null) {
            return;
        }
        setScrollState(2);
        this.f2793n.C1(i10);
        awakenScrollBars();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F1(int i10) {
        boolean zP = this.f2793n.p();
        int i11 = zP;
        if (this.f2793n.q()) {
            i11 = (zP ? 1 : 0) | 2;
        }
        E1(i11, i10);
    }

    public final void G() {
        int i10 = this.B;
        this.B = 0;
        if (i10 == 0 || !C0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(Barcode.FORMAT_PDF417);
        y2.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public void G0() {
        int iJ = this.f2777f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((r) this.f2777f.i(i10).getLayoutParams()).f2917c = true;
        }
        this.f2771c.s();
    }

    public void H() {
        if (this.f2791m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2793n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f2786j0.f2843j = false;
        boolean z10 = this.f2816y0 && !(this.f2818z0 == getWidth() && this.A0 == getHeight());
        this.f2818z0 = 0;
        this.A0 = 0;
        this.f2816y0 = false;
        if (this.f2786j0.f2838e == 1) {
            I();
            this.f2793n.E1(this);
            J();
        } else if (this.f2775e.q() || z10 || this.f2793n.s0() != getWidth() || this.f2793n.b0() != getHeight()) {
            this.f2793n.E1(this);
            J();
        } else {
            this.f2793n.E1(this);
        }
        K();
    }

    public void H0() {
        int iJ = this.f2777f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 f0VarN0 = n0(this.f2777f.i(i10));
            if (f0VarN0 != null && !f0VarN0.K()) {
                f0VarN0.b(6);
            }
        }
        G0();
        this.f2771c.t();
    }

    public void H1(boolean z10) {
        if (this.f2813x < 1) {
            if (F0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.f2813x = 1;
        }
        if (!z10 && !this.f2817z) {
            this.f2815y = false;
        }
        if (this.f2813x == 1) {
            if (z10 && this.f2815y && !this.f2817z && this.f2793n != null && this.f2791m != null) {
                H();
            }
            if (!this.f2817z) {
                this.f2815y = false;
            }
        }
        this.f2813x--;
    }

    public final void I() {
        this.f2786j0.a(1);
        W(this.f2786j0);
        this.f2786j0.f2843j = false;
        D1();
        this.f2779g.f();
        Q0();
        Y0();
        p1();
        b0 b0Var = this.f2786j0;
        b0Var.f2842i = b0Var.f2844k && this.f2794n0;
        this.f2794n0 = false;
        this.f2792m0 = false;
        b0Var.f2841h = b0Var.f2845l;
        b0Var.f2839f = this.f2791m.e();
        a0(this.f2802r0);
        if (this.f2786j0.f2844k) {
            int iG = this.f2777f.g();
            for (int i10 = 0; i10 < iG; i10++) {
                f0 f0VarN0 = n0(this.f2777f.f(i10));
                if (!f0VarN0.K() && (!f0VarN0.u() || this.f2791m.i())) {
                    this.f2779g.e(f0VarN0, this.O.t(this.f2786j0, f0VarN0, n.e(f0VarN0), f0VarN0.p()));
                    if (this.f2786j0.f2842i && f0VarN0.z() && !f0VarN0.w() && !f0VarN0.K() && !f0VarN0.u()) {
                        this.f2779g.c(k0(f0VarN0), f0VarN0);
                    }
                }
            }
        }
        if (this.f2786j0.f2845l) {
            q1();
            b0 b0Var2 = this.f2786j0;
            boolean z10 = b0Var2.f2840g;
            b0Var2.f2840g = false;
            this.f2793n.c1(this.f2771c, b0Var2);
            this.f2786j0.f2840g = z10;
            for (int i11 = 0; i11 < this.f2777f.g(); i11++) {
                f0 f0VarN1 = n0(this.f2777f.f(i11));
                if (!f0VarN1.K() && !this.f2779g.i(f0VarN1)) {
                    int iE = n.e(f0VarN1);
                    boolean zQ = f0VarN1.q(8192);
                    if (!zQ) {
                        iE |= Barcode.FORMAT_AZTEC;
                    }
                    n.c cVarT = this.O.t(this.f2786j0, f0VarN1, iE, f0VarN1.p());
                    if (zQ) {
                        b1(f0VarN1, cVarT);
                    } else {
                        this.f2779g.a(f0VarN1, cVarT);
                    }
                }
            }
            v();
        } else {
            v();
        }
        R0();
        H1(false);
        this.f2786j0.f2838e = 2;
    }

    public final void I0(int i10, int i11, MotionEvent motionEvent, int i12) {
        q qVar = this.f2793n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2817z) {
            return;
        }
        int[] iArr = this.f2810v0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = qVar.p();
        boolean zQ = this.f2793n.q();
        int i13 = zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iE1 = i10 - e1(i10, height);
        int iF1 = i11 - f1(i11, width);
        E1(i13, i12);
        if (L(zP ? iE1 : 0, zQ ? iF1 : 0, this.f2810v0, this.f2806t0, i12)) {
            int[] iArr2 = this.f2810v0;
            iE1 -= iArr2[0];
            iF1 -= iArr2[1];
        }
        r1(zP ? iE1 : 0, zQ ? iF1 : 0, motionEvent, i12);
        androidx.recyclerview.widget.j jVar = this.f2782h0;
        if (jVar != null && (iE1 != 0 || iF1 != 0)) {
            jVar.f(this, iE1, iF1);
        }
        I1(i12);
    }

    public void I1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public final void J() {
        D1();
        Q0();
        this.f2786j0.a(6);
        this.f2775e.j();
        this.f2786j0.f2839f = this.f2791m.e();
        this.f2786j0.f2837d = 0;
        if (this.f2773d != null && this.f2791m.b()) {
            Parcelable parcelable = this.f2773d.f2819c;
            if (parcelable != null) {
                this.f2793n.h1(parcelable);
            }
            this.f2773d = null;
        }
        b0 b0Var = this.f2786j0;
        b0Var.f2841h = false;
        this.f2793n.c1(this.f2771c, b0Var);
        b0 b0Var2 = this.f2786j0;
        b0Var2.f2840g = false;
        b0Var2.f2844k = b0Var2.f2844k && this.O != null;
        b0Var2.f2838e = 4;
        R0();
        H1(false);
    }

    public void J0(int i10) {
        int iG = this.f2777f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f2777f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void J1() {
        setScrollState(0);
        K1();
    }

    public final void K() {
        RecyclerView recyclerView;
        this.f2786j0.a(4);
        D1();
        Q0();
        b0 b0Var = this.f2786j0;
        b0Var.f2838e = 1;
        if (b0Var.f2844k) {
            for (int iG = this.f2777f.g() - 1; iG >= 0; iG--) {
                f0 f0VarN0 = n0(this.f2777f.f(iG));
                if (!f0VarN0.K()) {
                    long jK0 = k0(f0VarN0);
                    n.c cVarS = this.O.s(this.f2786j0, f0VarN0);
                    f0 f0VarG = this.f2779g.g(jK0);
                    if (f0VarG == null || f0VarG.K()) {
                        this.f2779g.d(f0VarN0, cVarS);
                    } else {
                        boolean zH = this.f2779g.h(f0VarG);
                        boolean zH2 = this.f2779g.h(f0VarN0);
                        if (zH && f0VarG == f0VarN0) {
                            this.f2779g.d(f0VarN0, cVarS);
                        } else {
                            n.c cVarN = this.f2779g.n(f0VarG);
                            this.f2779g.d(f0VarN0, cVarS);
                            n.c cVarM = this.f2779g.m(f0VarN0);
                            if (cVarN == null) {
                                u0(jK0, f0VarN0, f0VarG);
                            } else {
                                p(f0VarG, f0VarN0, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f2779g.o(recyclerView.C0);
        } else {
            recyclerView = this;
        }
        recyclerView.f2793n.q1(recyclerView.f2771c);
        b0 b0Var2 = recyclerView.f2786j0;
        b0Var2.f2836c = b0Var2.f2839f;
        recyclerView.F = false;
        recyclerView.G = false;
        b0Var2.f2844k = false;
        b0Var2.f2845l = false;
        recyclerView.f2793n.f2900h = false;
        ArrayList<f0> arrayList = recyclerView.f2771c.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        q qVar = recyclerView.f2793n;
        if (qVar.f2906n) {
            qVar.f2905m = 0;
            qVar.f2906n = false;
            recyclerView.f2771c.P();
        }
        recyclerView.f2793n.d1(recyclerView.f2786j0);
        R0();
        H1(false);
        recyclerView.f2779g.f();
        int[] iArr = recyclerView.f2802r0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        c1();
        n1();
    }

    public void K0(int i10) {
        int iG = this.f2777f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f2777f.f(i11).offsetTopAndBottom(i10);
        }
    }

    public final void K1() {
        this.f2780g0.f();
        q qVar = this.f2793n;
        if (qVar != null) {
            qVar.P1();
        }
    }

    public boolean L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void L0(int i10, int i11) {
        int iJ = this.f2777f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            f0 f0VarN0 = n0(this.f2777f.i(i12));
            if (f0VarN0 != null && !f0VarN0.K() && f0VarN0.f2862c >= i10) {
                if (G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + f0VarN0 + " now at position " + (f0VarN0.f2862c + i11));
                }
                f0VarN0.B(i11, false);
                this.f2786j0.f2840g = true;
            }
        }
        this.f2771c.v(i10, i11);
        requestLayout();
    }

    public void L1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f2777f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f2777f.i(i14);
            f0 f0VarN0 = n0(viewI);
            if (f0VarN0 != null && !f0VarN0.K() && (i12 = f0VarN0.f2862c) >= i10 && i12 < i13) {
                f0VarN0.b(2);
                f0VarN0.a(obj);
                ((r) viewI.getLayoutParams()).f2917c = true;
            }
        }
        this.f2771c.R(i10, i11);
    }

    public final void M(int i10, int i11, int i12, int i13, int[] iArr, int i14, @NonNull int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void M0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f2777f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            f0 f0VarN0 = n0(this.f2777f.i(i16));
            if (f0VarN0 != null && (i15 = f0VarN0.f2862c) >= i13 && i15 <= i12) {
                if (G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + f0VarN0);
                }
                if (f0VarN0.f2862c == i10) {
                    f0VarN0.B(i11 - i10, false);
                } else {
                    f0VarN0.B(i14, false);
                }
                this.f2786j0.f2840g = true;
            }
        }
        this.f2771c.w(i10, i11);
        requestLayout();
    }

    public void N(int i10) {
        q qVar = this.f2793n;
        if (qVar != null) {
            qVar.j1(i10);
        }
        U0(i10);
        v vVar = this.f2788k0;
        if (vVar != null) {
            vVar.a(this, i10);
        }
        List<v> list = this.f2790l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2790l0.get(size).a(this, i10);
            }
        }
    }

    public void N0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f2777f.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            f0 f0VarN0 = n0(this.f2777f.i(i13));
            if (f0VarN0 != null && !f0VarN0.K()) {
                int i14 = f0VarN0.f2862c;
                if (i14 >= i12) {
                    if (G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + f0VarN0 + " now at position " + (f0VarN0.f2862c - i11));
                    }
                    f0VarN0.B(-i11, z10);
                    this.f2786j0.f2840g = true;
                } else if (i14 >= i10) {
                    if (G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + f0VarN0 + " now REMOVED");
                    }
                    f0VarN0.i(i10 - 1, -i11, z10);
                    this.f2786j0.f2840g = true;
                }
            }
        }
        this.f2771c.x(i10, i11, z10);
        requestLayout();
    }

    public void O(int i10, int i11) {
        this.I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        V0(i10, i11);
        v vVar = this.f2788k0;
        if (vVar != null) {
            vVar.b(this, i10, i11);
        }
        List<v> list = this.f2790l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2790l0.get(size).b(this, i10, i11);
            }
        }
        this.I--;
    }

    public void O0(@NonNull View view) {
    }

    public void P() {
        int i10;
        for (int size = this.f2812w0.size() - 1; size >= 0; size--) {
            f0 f0Var = this.f2812w0.get(size);
            if (f0Var.f2861a.getParent() == this && !f0Var.K() && (i10 = f0Var.f2876q) != -1) {
                f0Var.f2861a.setImportantForAccessibility(i10);
                f0Var.f2876q = -1;
            }
        }
        this.f2812w0.clear();
    }

    public void P0(@NonNull View view) {
    }

    public final boolean Q(MotionEvent motionEvent) {
        u uVar = this.f2803s;
        if (uVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return Z(motionEvent);
        }
        uVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f2803s = null;
        }
        return true;
    }

    public void Q0() {
        this.H++;
    }

    public void R() {
        if (this.N != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.J.a(this, 3);
        this.N = edgeEffectA;
        if (this.f2781h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void R0() {
        S0(true);
    }

    public void S() {
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.J.a(this, 0);
        this.K = edgeEffectA;
        if (this.f2781h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void S0(boolean z10) {
        int i10 = this.H - 1;
        this.H = i10;
        if (i10 < 1) {
            if (F0 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.H = 0;
            if (z10) {
                G();
                P();
            }
        }
    }

    public void T() {
        if (this.M != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.J.a(this, 2);
        this.M = edgeEffectA;
        if (this.f2781h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void T0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.U = x10;
            this.S = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.V = y10;
            this.T = y10;
        }
    }

    public void U() {
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.J.a(this, 1);
        this.L = edgeEffectA;
        if (this.f2781h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void U0(int i10) {
    }

    public String V() {
        return " " + super.toString() + ", adapter:" + this.f2791m + ", layout:" + this.f2793n + ", context:" + getContext();
    }

    public void V0(int i10, int i11) {
    }

    public final void W(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.f2849p = 0;
            b0Var.f2850q = 0;
        } else {
            OverScroller overScroller = this.f2780g0.f2854c;
            b0Var.f2849p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f2850q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void W0() {
        if (this.f2798p0 || !this.f2805t) {
            return;
        }
        o0.e0(this, this.f2814x0);
        this.f2798p0 = true;
    }

    public View X(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean X0() {
        return this.O != null && this.f2793n.Q1();
    }

    public f0 Y(@NonNull View view) {
        View viewX = X(view);
        if (viewX == null) {
            return null;
        }
        return m0(viewX);
    }

    public final void Y0() {
        boolean z10;
        if (this.F) {
            this.f2775e.y();
            if (this.G) {
                this.f2793n.X0(this);
            }
        }
        if (X0()) {
            this.f2775e.w();
        } else {
            this.f2775e.j();
        }
        boolean z11 = this.f2792m0 || this.f2794n0;
        this.f2786j0.f2844k = this.f2811w && this.O != null && ((z10 = this.F) || z11 || this.f2793n.f2900h) && (!z10 || this.f2791m.i());
        b0 b0Var = this.f2786j0;
        b0Var.f2845l = b0Var.f2844k && z11 && !this.F && X0();
    }

    public final boolean Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f2801r.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = this.f2801r.get(i10);
            if (uVar.b(this, motionEvent) && action != 3) {
                this.f2803s = uVar;
                return true;
            }
        }
        return false;
    }

    public void Z0(boolean z10) {
        this.G = z10 | this.G;
        this.F = true;
        H0();
    }

    public final void a0(int[] iArr) {
        int iG = this.f2777f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            f0 f0VarN0 = n0(this.f2777f.f(i12));
            if (!f0VarN0.K()) {
                int iN = f0VarN0.n();
                if (iN < i10) {
                    i10 = iN;
                }
                if (iN > i11) {
                    i11 = iN;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    public final void a1(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 >= 0.0f) {
            if (f11 > 0.0f) {
                T();
                d3.e.d(this.M, f11 / getWidth(), f12 / getHeight());
            } else {
                z10 = false;
            }
            if (f13 < 0.0f) {
                U();
                d3.e.d(this.L, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > 0.0f) {
                R();
                d3.e.d(this.N, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z11 = z10;
            }
            if (z11 && f11 == 0.0f && f13 == 0.0f) {
                return;
            }
            postInvalidateOnAnimation();
        }
        S();
        d3.e.d(this.K, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z10 = true;
        if (f13 < 0.0f) {
            U();
            d3.e.d(this.L, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > 0.0f) {
            R();
            d3.e.d(this.N, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z11 = z10;
        }
        if (z11) {
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        q qVar = this.f2793n;
        if (qVar == null || !qVar.K0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            S();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            T();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            U();
            if (this.L.isFinished()) {
                this.L.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            R();
            if (this.N.isFinished()) {
                this.N.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public void b1(f0 f0Var, n.c cVar) {
        f0Var.G(0, 8192);
        if (this.f2786j0.f2842i && f0Var.z() && !f0Var.w() && !f0Var.K()) {
            this.f2779g.c(k0(f0Var), f0Var);
        }
        this.f2779g.e(f0Var, cVar);
    }

    public final View c0() {
        f0 f0VarD0;
        b0 b0Var = this.f2786j0;
        int i10 = b0Var.f2846m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = b0Var.b();
        for (int i11 = i10; i11 < iB; i11++) {
            f0 f0VarD1 = d0(i11);
            if (f0VarD1 == null) {
                break;
            }
            if (f0VarD1.f2861a.hasFocusable()) {
                return f0VarD1.f2861a;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (f0VarD0 = d0(iMin)) == null) {
                return null;
            }
        } while (!f0VarD0.f2861a.hasFocusable());
        return f0VarD0.f2861a;
    }

    public final void c1() {
        View viewFindViewById;
        if (!this.f2778f0 || this.f2791m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f2777f.n(getFocusedChild())) {
                return;
            }
        }
        View viewC0 = null;
        f0 f0VarE0 = (this.f2786j0.f2847n == -1 || !this.f2791m.i()) ? null : e0(this.f2786j0.f2847n);
        if (f0VarE0 != null && !this.f2777f.n(f0VarE0.f2861a) && f0VarE0.f2861a.hasFocusable()) {
            viewC0 = f0VarE0.f2861a;
        } else if (this.f2777f.g() > 0) {
            viewC0 = c0();
        }
        if (viewC0 != null) {
            int i10 = this.f2786j0.f2848o;
            if (i10 != -1 && (viewFindViewById = viewC0.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewC0 = viewFindViewById;
            }
            viewC0.requestFocus();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r) && this.f2793n.r((r) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        q qVar = this.f2793n;
        if (qVar != null && qVar.p()) {
            return this.f2793n.v(this.f2786j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        q qVar = this.f2793n;
        if (qVar != null && qVar.p()) {
            return this.f2793n.w(this.f2786j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        q qVar = this.f2793n;
        if (qVar != null && qVar.p()) {
            return this.f2793n.x(this.f2786j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        q qVar = this.f2793n;
        if (qVar != null && qVar.q()) {
            return this.f2793n.y(this.f2786j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        q qVar = this.f2793n;
        if (qVar != null && qVar.q()) {
            return this.f2793n.z(this.f2786j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        q qVar = this.f2793n;
        if (qVar != null && qVar.q()) {
            return this.f2793n.A(this.f2786j0);
        }
        return 0;
    }

    public f0 d0(int i10) {
        f0 f0Var = null;
        if (this.F) {
            return null;
        }
        int iJ = this.f2777f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            f0 f0VarN0 = n0(this.f2777f.i(i11));
            if (f0VarN0 != null && !f0VarN0.w() && j0(f0VarN0) == i10) {
                if (!this.f2777f.n(f0VarN0.f2861a)) {
                    return f0VarN0;
                }
                f0Var = f0VarN0;
            }
        }
        return f0Var;
    }

    public final void d1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.K.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q layoutManager = getLayoutManager();
        int iE = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.q()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    A1(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    A1(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zA0 = layoutManager.A0();
                if (keyCode == 122) {
                    if (zA0) {
                        iE = getAdapter().e();
                    }
                } else if (!zA0) {
                    iE = getAdapter().e();
                }
                C1(iE);
                return true;
            }
        } else if (layoutManager.p()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    A1(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    A1(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zA1 = layoutManager.A0();
                if (keyCode2 == 122) {
                    if (zA1) {
                        iE = getAdapter().e();
                    }
                } else if (!zA1) {
                    iE = getAdapter().e();
                }
                C1(iE);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f2799q.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f2799q.get(i10).i(canvas, this, this.f2786j0);
        }
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2781h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.K;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2781h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2781h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.M;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2781h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.O == null || this.f2799q.size() <= 0 || !this.O.p()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public f0 e0(long j10) {
        h hVar = this.f2791m;
        f0 f0Var = null;
        if (hVar != null && hVar.i()) {
            int iJ = this.f2777f.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                f0 f0VarN0 = n0(this.f2777f.i(i10));
                if (f0VarN0 != null && !f0VarN0.w() && f0VarN0.l() == j10) {
                    if (!this.f2777f.n(f0VarN0.f2861a)) {
                        return f0VarN0;
                    }
                    f0Var = f0VarN0;
                }
            }
        }
        return f0Var;
    }

    public final int e1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.K;
        float f11 = 0.0f;
        if (edgeEffect == null || d3.e.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.M;
            if (edgeEffect2 != null && d3.e.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.M.onRelease();
                } else {
                    float fD = d3.e.d(this.M, width, height);
                    if (d3.e.b(this.M) == 0.0f) {
                        this.M.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.K.onRelease();
            } else {
                float f12 = -d3.e.d(this.K, -width, 1.0f - height);
                if (d3.e.b(this.K) == 0.0f) {
                    this.K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    public f0 f0(int i10, boolean z10) {
        int iJ = this.f2777f.j();
        f0 f0Var = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            f0 f0VarN0 = n0(this.f2777f.i(i11));
            if (f0VarN0 != null && !f0VarN0.w()) {
                if (z10) {
                    if (f0VarN0.f2862c != i10) {
                        continue;
                    } else {
                        if (this.f2777f.n(f0VarN0.f2861a)) {
                            return f0VarN0;
                        }
                        f0Var = f0VarN0;
                    }
                } else if (f0VarN0.n() != i10) {
                    continue;
                } else {
                    if (this.f2777f.n(f0VarN0.f2861a)) {
                        return f0VarN0;
                    }
                    f0Var = f0VarN0;
                }
            }
        }
        return f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewO0;
        boolean z10;
        View viewV0 = this.f2793n.V0(view, i10);
        if (viewV0 != null) {
            return viewV0;
        }
        boolean z11 = (this.f2791m == null || this.f2793n == null || D0() || this.f2817z) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f2793n.q()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f2793n.p()) {
                z10 = focusFinder.findNextFocus(this, view, (this.f2793n.d0() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z10) {
                A();
                if (X(view) == null) {
                    return null;
                }
                D1();
                this.f2793n.O0(view, i10, this.f2771c, this.f2786j0);
                H1(false);
            }
            viewO0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                A();
                if (X(view) == null) {
                    return null;
                }
                D1();
                viewO0 = this.f2793n.O0(view, i10, this.f2771c, this.f2786j0);
                H1(false);
            } else {
                viewO0 = viewFindNextFocus;
            }
        }
        if (viewO0 == null || viewO0.hasFocusable()) {
            return E0(view, viewO0, i10) ? viewO0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        m1(viewO0, null);
        return view;
    }

    public boolean g0(int i10, int i11) {
        return h0(i10, i11, this.f2770b0, this.f2772c0);
    }

    public void g1() {
        n nVar = this.O;
        if (nVar != null) {
            nVar.k();
        }
        q qVar = this.f2793n;
        if (qVar != null) {
            qVar.p1(this.f2771c);
            this.f2793n.q1(this.f2771c);
        }
        this.f2771c.c();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q qVar = this.f2793n;
        if (qVar != null) {
            return qVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q qVar = this.f2793n;
        if (qVar != null) {
            return qVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f2791m;
    }

    @Override // android.view.View
    public int getBaseline() {
        q qVar = this.f2793n;
        return qVar != null ? qVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2781h;
    }

    public androidx.recyclerview.widget.p getCompatAccessibilityDelegate() {
        return this.f2800q0;
    }

    @NonNull
    public m getEdgeEffectFactory() {
        return this.J;
    }

    public n getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.f2799q.size();
    }

    public q getLayoutManager() {
        return this.f2793n;
    }

    public int getMaxFlingVelocity() {
        return this.f2772c0;
    }

    public int getMinFlingVelocity() {
        return this.f2770b0;
    }

    public long getNanoTime() {
        if (L0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public t getOnFlingListener() {
        return this.f2769a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2778f0;
    }

    @NonNull
    public w getRecycledViewPool() {
        return this.f2771c.i();
    }

    public int getScrollState() {
        return this.P;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    public final boolean h0(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        q qVar = this.f2793n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f2817z) {
            return false;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f2793n.q();
        if (!zP || Math.abs(i10) < i12) {
            i10 = 0;
        }
        if (!zQ || Math.abs(i11) < i12) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.K;
            if (edgeEffect == null || d3.e.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.M;
                if (edgeEffect2 == null || d3.e.b(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (w1(this.M, i10, getWidth())) {
                    this.M.onAbsorb(i10);
                    i10 = 0;
                }
            } else {
                int i15 = -i10;
                if (w1(this.K, i15, getWidth())) {
                    this.K.onAbsorb(i15);
                    i10 = 0;
                }
            }
            iMax = i10;
            i10 = 0;
        }
        if (i11 == 0) {
            i14 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.L;
            if (edgeEffect3 == null || d3.e.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.N;
                if (edgeEffect4 == null || d3.e.b(edgeEffect4) == 0.0f) {
                    i14 = i11;
                    i11 = 0;
                } else if (w1(this.N, i11, getHeight())) {
                    this.N.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i16 = -i11;
                if (w1(this.L, i16, getHeight())) {
                    this.L.onAbsorb(i16);
                    i11 = 0;
                }
            }
            i14 = 0;
        }
        if (iMax != 0 || i11 != 0) {
            int i17 = -i13;
            iMax = Math.max(i17, Math.min(iMax, i13));
            i11 = Math.max(i17, Math.min(i11, i13));
            F1(1);
            this.f2780g0.b(iMax, i11);
        }
        if (i10 == 0 && i14 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i14;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zP || zQ;
            dispatchNestedFling(f10, f11, z10);
            t tVar = this.f2769a0;
            if (tVar != null && tVar.a(i10, i14)) {
                return true;
            }
            if (z10) {
                F1(1);
                int i18 = -i13;
                this.f2780g0.b(Math.max(i18, Math.min(i10, i13)), Math.max(i18, Math.min(i14, i13)));
                return true;
            }
        }
        return false;
    }

    public boolean h1(View view) {
        D1();
        boolean zR = this.f2777f.r(view);
        if (zR) {
            f0 f0VarN0 = n0(view);
            this.f2771c.O(f0VarN0);
            this.f2771c.H(f0VarN0);
            if (G0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        H1(!zR);
        return zR;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public final void i(f0 f0Var) {
        View view = f0Var.f2861a;
        boolean z10 = view.getParent() == this;
        this.f2771c.O(m0(view));
        if (f0Var.y()) {
            this.f2777f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f2777f.k(view);
        } else {
            this.f2777f.b(view, true);
        }
    }

    public boolean i0(int i10, int i11) {
        return h0(i10, i11, 0, Integer.MAX_VALUE);
    }

    public void i1(@NonNull p pVar) {
        q qVar = this.f2793n;
        if (qVar != null) {
            qVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f2799q.remove(pVar);
        if (this.f2799q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        G0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f2805t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2817z;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(@NonNull p pVar) {
        k(pVar, -1);
    }

    public int j0(f0 f0Var) {
        if (f0Var.q(524) || !f0Var.t()) {
            return -1;
        }
        return this.f2775e.e(f0Var.f2862c);
    }

    public void j1(@NonNull u uVar) {
        this.f2801r.remove(uVar);
        if (this.f2803s == uVar) {
            this.f2803s = null;
        }
    }

    public void k(@NonNull p pVar, int i10) {
        q qVar = this.f2793n;
        if (qVar != null) {
            qVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f2799q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f2799q.add(pVar);
        } else {
            this.f2799q.add(i10, pVar);
        }
        G0();
        requestLayout();
    }

    public long k0(f0 f0Var) {
        return this.f2791m.i() ? f0Var.l() : f0Var.f2862c;
    }

    public void k1(@NonNull v vVar) {
        List<v> list = this.f2790l0;
        if (list != null) {
            list.remove(vVar);
        }
    }

    public void l(@NonNull s sVar) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(sVar);
    }

    public int l0(@NonNull View view) {
        f0 f0VarN0 = n0(view);
        if (f0VarN0 != null) {
            return f0VarN0.n();
        }
        return -1;
    }

    public void l1() {
        f0 f0Var;
        int iG = this.f2777f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f2777f.f(i10);
            f0 f0VarM0 = m0(viewF);
            if (f0VarM0 != null && (f0Var = f0VarM0.f2868i) != null) {
                View view = f0Var.f2861a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void m(@NonNull u uVar) {
        this.f2801r.add(uVar);
    }

    public f0 m0(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return n0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void m1(@NonNull View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2785j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r) {
            r rVar = (r) layoutParams;
            if (!rVar.f2917c) {
                Rect rect = rVar.b;
                Rect rect2 = this.f2785j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2785j);
            offsetRectIntoDescendantCoords(view, this.f2785j);
        }
        this.f2793n.x1(this, view, this.f2785j, !this.f2811w, view2 == null);
    }

    public void n(@NonNull v vVar) {
        if (this.f2790l0 == null) {
            this.f2790l0 = new ArrayList();
        }
        this.f2790l0.add(vVar);
    }

    public final void n1() {
        b0 b0Var = this.f2786j0;
        b0Var.f2847n = -1L;
        b0Var.f2846m = -1;
        b0Var.f2848o = -1;
    }

    public void o(@NonNull f0 f0Var, n.c cVar, @NonNull n.c cVar2) {
        f0Var.H(false);
        if (this.O.a(f0Var, cVar, cVar2)) {
            W0();
        }
    }

    public void o0(@NonNull View view, @NonNull Rect rect) {
        p0(view, rect);
    }

    public final void o1() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        I1(0);
        d1();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.H = 0;
        this.f2805t = true;
        this.f2811w = this.f2811w && !isLayoutRequested();
        this.f2771c.z();
        q qVar = this.f2793n;
        if (qVar != null) {
            qVar.E(this);
        }
        this.f2798p0 = false;
        if (L0) {
            ThreadLocal<androidx.recyclerview.widget.j> threadLocal = androidx.recyclerview.widget.j.f3095e;
            androidx.recyclerview.widget.j jVar = threadLocal.get();
            this.f2782h0 = jVar;
            if (jVar == null) {
                this.f2782h0 = new androidx.recyclerview.widget.j();
                Display displayT = o0.t(this);
                if (isInEditMode() || displayT == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayT.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.j jVar2 = this.f2782h0;
                jVar2.f3098c = (long) (1.0E9f / refreshRate);
                threadLocal.set(jVar2);
            }
            this.f2782h0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.j jVar;
        super.onDetachedFromWindow();
        n nVar = this.O;
        if (nVar != null) {
            nVar.k();
        }
        J1();
        this.f2805t = false;
        q qVar = this.f2793n;
        if (qVar != null) {
            qVar.F(this, this.f2771c);
        }
        this.f2812w0.clear();
        removeCallbacks(this.f2814x0);
        this.f2779g.j();
        this.f2771c.A();
        q3.a.b(this);
        if (!L0 || (jVar = this.f2782h0) == null) {
            return;
        }
        jVar.j(this);
        this.f2782h0 = null;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f2799q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2799q.get(i10).g(canvas, this, this.f2786j0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float axisValue;
        RecyclerView recyclerView;
        if (this.f2793n != null && !this.f2817z && motionEvent.getAction() == 8) {
            float f10 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f11 = this.f2793n.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                z10 = false;
                axisValue = this.f2793n.p() ? motionEvent.getAxisValue(10) : 0.0f;
                f10 = f11;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.f2793n.q()) {
                    float f12 = -axisValue;
                    axisValue = 0.0f;
                    f10 = f12;
                } else if (!this.f2793n.p()) {
                    axisValue = 0.0f;
                }
                z10 = this.B0;
            } else {
                i10 = 0;
                z10 = false;
                axisValue = 0.0f;
            }
            int i11 = (int) (f10 * this.f2776e0);
            int i12 = (int) (axisValue * this.f2774d0);
            if (z10) {
                OverScroller overScroller = this.f2780g0.f2854c;
                recyclerView = this;
                recyclerView.B1(i12 + (overScroller.getFinalX() - overScroller.getCurrX()), i11 + (overScroller.getFinalY() - overScroller.getCurrY()), null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                I0(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                recyclerView.E0.g(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f2817z) {
            return false;
        }
        this.f2803s = null;
        if (Z(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f2793n;
        if (qVar == null) {
            return false;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f2793n.q();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.A) {
                this.A = false;
            }
            this.Q = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.U = x10;
            this.S = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.V = y10;
            this.T = y10;
            if (G1(motionEvent) || this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                I1(1);
            }
            int[] iArr = this.f2808u0;
            iArr[1] = 0;
            iArr[0] = 0;
            F1(0);
        } else if (actionMasked == 1) {
            this.R.clear();
            I1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.P != 1) {
                int i10 = x11 - this.S;
                int i11 = y11 - this.T;
                if (!zP || Math.abs(i10) <= this.W) {
                    z10 = false;
                } else {
                    this.U = x11;
                    z10 = true;
                }
                if (zQ && Math.abs(i11) > this.W) {
                    this.V = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.Q = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x12;
            this.S = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.V = y12;
            this.T = y12;
        } else if (actionMasked == 6) {
            T0(motionEvent);
        }
        return this.P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        H();
        Trace.endSection();
        this.f2811w = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        q qVar = this.f2793n;
        if (qVar == null) {
            C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (qVar.w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2793n.e1(this.f2771c, this.f2786j0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f2816y0 = z10;
            if (z10 || this.f2791m == null) {
                return;
            }
            if (this.f2786j0.f2838e == 1) {
                I();
            }
            this.f2793n.F1(i10, i11);
            this.f2786j0.f2843j = true;
            J();
            this.f2793n.I1(i10, i11);
            if (this.f2793n.L1()) {
                this.f2793n.F1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f2786j0.f2843j = true;
                J();
                this.f2793n.I1(i10, i11);
            }
            this.f2818z0 = getMeasuredWidth();
            this.A0 = getMeasuredHeight();
            return;
        }
        if (this.f2807u) {
            this.f2793n.e1(this.f2771c, this.f2786j0, i10, i11);
            return;
        }
        if (this.C) {
            D1();
            Q0();
            Y0();
            R0();
            b0 b0Var = this.f2786j0;
            if (b0Var.f2845l) {
                b0Var.f2841h = true;
            } else {
                this.f2775e.j();
                this.f2786j0.f2841h = false;
            }
            this.C = false;
            H1(false);
        } else if (this.f2786j0.f2845l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f2791m;
        if (hVar != null) {
            this.f2786j0.f2839f = hVar.e();
        } else {
            this.f2786j0.f2839f = 0;
        }
        D1();
        this.f2793n.e1(this.f2771c, this.f2786j0, i10, i11);
        H1(false);
        this.f2786j0.f2841h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (D0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f2773d = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f2773d;
        if (savedState2 != null) {
            savedState.f(savedState2);
            return savedState;
        }
        q qVar = this.f2793n;
        if (qVar != null) {
            savedState.f2819c = qVar.i1();
            return savedState;
        }
        savedState.f2819c = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        B0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f2817z || this.A) {
            return false;
        }
        if (Q(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f2793n;
        if (qVar == null) {
            return false;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f2793n.q();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f2808u0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f2808u0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.R.addMovement(motionEventObtain);
                this.R.computeCurrentVelocity(1000, this.f2772c0);
                float f10 = zP ? -this.R.getXVelocity(this.Q) : 0.0f;
                float f11 = zQ ? -this.R.getYVelocity(this.Q) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !g0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                o1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.U - x10;
                int iMax2 = this.V - y10;
                if (this.P != 1) {
                    if (zP) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.W) : Math.min(0, iMax + this.W);
                        if (iMax != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (zQ) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.W) : Math.min(0, iMax2 + this.W);
                        if (iMax2 != 0) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        setScrollState(1);
                    }
                }
                if (this.P == 1) {
                    int[] iArr3 = this.f2810v0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iE1 = iMax - e1(iMax, motionEvent.getY());
                    int iF1 = iMax2 - f1(iMax2, motionEvent.getX());
                    if (L(zP ? iE1 : 0, zQ ? iF1 : 0, this.f2810v0, this.f2806t0, 0)) {
                        int[] iArr4 = this.f2810v0;
                        iE1 -= iArr4[0];
                        iF1 -= iArr4[1];
                        int[] iArr5 = this.f2808u0;
                        int i10 = iArr5[0];
                        int[] iArr6 = this.f2806t0;
                        iArr5[0] = i10 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f2806t0;
                    this.U = x10 - iArr7[0];
                    this.V = y10 - iArr7[1];
                    if (r1(zP ? iE1 : 0, zQ ? iF1 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.j jVar = this.f2782h0;
                    if (jVar != null && (iE1 != 0 || iF1 != 0)) {
                        jVar.f(this, iE1, iF1);
                    }
                }
            } else if (actionMasked == 3) {
                t();
            } else if (actionMasked == 5) {
                this.Q = motionEvent.getPointerId(actionIndex);
                int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.U = x11;
                this.S = x11;
                int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.V = y11;
                this.T = y11;
            } else if (actionMasked == 6) {
                T0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.Q = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        this.U = x12;
        this.S = x12;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        this.V = y12;
        this.T = y12;
        F1(0);
        this.R.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public final void p(@NonNull f0 f0Var, @NonNull f0 f0Var2, @NonNull n.c cVar, @NonNull n.c cVar2, boolean z10, boolean z11) {
        f0Var.H(false);
        if (z10) {
            i(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z11) {
                i(f0Var2);
            }
            f0Var.f2867h = f0Var2;
            i(f0Var);
            this.f2771c.O(f0Var);
            f0Var2.H(false);
            f0Var2.f2868i = f0Var;
        }
        if (this.O.b(f0Var, f0Var2, cVar, cVar2)) {
            W0();
        }
    }

    public final void p1() {
        int iJ;
        View focusedChild = (this.f2778f0 && hasFocus() && this.f2791m != null) ? getFocusedChild() : null;
        f0 f0VarY = focusedChild != null ? Y(focusedChild) : null;
        if (f0VarY == null) {
            n1();
            return;
        }
        this.f2786j0.f2847n = this.f2791m.i() ? f0VarY.l() : -1L;
        b0 b0Var = this.f2786j0;
        if (this.F) {
            iJ = -1;
        } else {
            iJ = f0VarY.w() ? f0VarY.f2863d : f0VarY.j();
        }
        b0Var.f2846m = iJ;
        this.f2786j0.f2848o = q0(f0VarY.f2861a);
    }

    public void q(@NonNull f0 f0Var, @NonNull n.c cVar, n.c cVar2) {
        i(f0Var);
        f0Var.H(false);
        if (this.O.c(f0Var, cVar, cVar2)) {
            W0();
        }
    }

    public final int q0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    public void q1() {
        int iJ = this.f2777f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 f0VarN0 = n0(this.f2777f.i(i10));
            if (F0 && f0VarN0.f2862c == -1 && !f0VarN0.w()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!f0VarN0.K()) {
                f0VarN0.F();
            }
        }
    }

    public void r(String str) {
        if (D0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    public final String r0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public boolean r1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        A();
        if (this.f2791m != null) {
            int[] iArr = this.f2810v0;
            iArr[0] = 0;
            iArr[1] = 0;
            s1(i10, i11, iArr);
            int[] iArr2 = this.f2810v0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f2799q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f2810v0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i13, i14, i15, i16, this.f2806t0, i12, iArr3);
        int[] iArr4 = this.f2810v0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.U;
        int[] iArr5 = this.f2806t0;
        int i24 = iArr5[0];
        this.U = i23 - i24;
        int i25 = this.V;
        int i26 = iArr5[1];
        this.V = i25 - i26;
        int[] iArr6 = this.f2808u0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.s.a(motionEvent, 8194)) {
                a1(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && androidx.core.view.s.a(motionEvent, 4194304)) {
                    d1();
                }
            }
            w(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            O(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        f0 f0VarN0 = n0(view);
        if (f0VarN0 != null) {
            if (f0VarN0.y()) {
                f0VarN0.f();
            } else if (!f0VarN0.K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f0VarN0 + V());
            }
        } else if (F0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2793n.g1(this, this.f2786j0, view, view2) && view2 != null) {
            m1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2793n.w1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f2801r.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2801r.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2813x != 0 || this.f2817z) {
            this.f2815y = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean s(f0 f0Var) {
        n nVar = this.O;
        return nVar == null || nVar.g(f0Var, f0Var.p());
    }

    public Rect s0(View view) {
        r rVar = (r) view.getLayoutParams();
        if (!rVar.f2917c) {
            return rVar.b;
        }
        if (this.f2786j0.e() && (rVar.c() || rVar.e())) {
            return rVar.b;
        }
        Rect rect = rVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.f2799q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2785j.set(0, 0, 0, 0);
            this.f2799q.get(i10).e(this.f2785j, view, this, this.f2786j0);
            int i11 = rect.left;
            Rect rect2 = this.f2785j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        rVar.f2917c = false;
        return rect;
    }

    public void s1(int i10, int i11, int[] iArr) {
        D1();
        Q0();
        Trace.beginSection("RV Scroll");
        W(this.f2786j0);
        int iB1 = i10 != 0 ? this.f2793n.B1(i10, this.f2771c, this.f2786j0) : 0;
        int iD1 = i11 != 0 ? this.f2793n.D1(i11, this.f2771c, this.f2786j0) : 0;
        Trace.endSection();
        l1();
        R0();
        H1(false);
        if (iArr != null) {
            iArr[0] = iB1;
            iArr[1] = iD1;
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        q qVar = this.f2793n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2817z) {
            return;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f2793n.q();
        if (zP || zQ) {
            if (!zP) {
                i10 = 0;
            }
            if (!zQ) {
                i11 = 0;
            }
            r1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (x1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.p pVar) {
        this.f2800q0 = pVar;
        o0.m0(this, pVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        u1(hVar, false, true);
        Z0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(l lVar) {
        if (lVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2781h) {
            B0();
        }
        this.f2781h = z10;
        super.setClipToPadding(z10);
        if (this.f2811w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull m mVar) {
        x2.g.g(mVar);
        this.J = mVar;
        B0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f2807u = z10;
    }

    public void setItemAnimator(n nVar) {
        n nVar2 = this.O;
        if (nVar2 != null) {
            nVar2.k();
            this.O.v(null);
        }
        this.O = nVar;
        if (nVar != null) {
            nVar.v(this.f2796o0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f2771c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(q qVar) {
        if (qVar == this.f2793n) {
            return;
        }
        J1();
        if (this.f2793n != null) {
            n nVar = this.O;
            if (nVar != null) {
                nVar.k();
            }
            this.f2793n.p1(this.f2771c);
            this.f2793n.q1(this.f2771c);
            this.f2771c.c();
            if (this.f2805t) {
                this.f2793n.F(this, this.f2771c);
            }
            this.f2793n.J1(null);
            this.f2793n = null;
        } else {
            this.f2771c.c();
        }
        this.f2777f.o();
        this.f2793n = qVar;
        if (qVar != null) {
            if (qVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + qVar + " is already attached to a RecyclerView:" + qVar.b.V());
            }
            qVar.J1(this);
            if (this.f2805t) {
                this.f2793n.E(this);
            }
        }
        this.f2771c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(t tVar) {
        this.f2769a0 = tVar;
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
        this.f2788k0 = vVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2778f0 = z10;
    }

    public void setRecycledViewPool(w wVar) {
        this.f2771c.J(wVar);
    }

    @Deprecated
    public void setRecyclerListener(y yVar) {
        this.f2795o = yVar;
    }

    public void setScrollState(int i10) {
        if (i10 == this.P) {
            return;
        }
        if (G0) {
            Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.P, new Exception());
        }
        this.P = i10;
        if (i10 != 2) {
            K1();
        }
        N(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.f2771c.K(d0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f2817z) {
            r("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f2817z = true;
                this.A = true;
                J1();
                return;
            }
            this.f2817z = false;
            if (this.f2815y && this.f2793n != null && this.f2791m != null) {
                requestLayout();
            }
            this.f2815y = false;
        }
    }

    public final void t() {
        o1();
        setScrollState(0);
    }

    public void t1(int i10) {
        if (this.f2817z) {
            return;
        }
        J1();
        q qVar = this.f2793n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.C1(i10);
            awakenScrollBars();
        }
    }

    public final void u0(long j10, f0 f0Var, f0 f0Var2) {
        int iG = this.f2777f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            f0 f0VarN0 = n0(this.f2777f.f(i10));
            if (f0VarN0 != f0Var && k0(f0VarN0) == j10) {
                h hVar = this.f2791m;
                if (hVar == null || !hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f0VarN0 + " \n View Holder 2:" + f0Var + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f0VarN0 + " \n View Holder 2:" + f0Var + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + V());
    }

    public final void u1(h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.f2791m;
        if (hVar2 != null) {
            hVar2.B(this.b);
            this.f2791m.u(this);
        }
        if (!z10 || z11) {
            g1();
        }
        this.f2775e.y();
        h<?> hVar3 = this.f2791m;
        this.f2791m = hVar;
        if (hVar != null) {
            hVar.z(this.b);
            hVar.q(this);
        }
        q qVar = this.f2793n;
        if (qVar != null) {
            qVar.J0(hVar3, this.f2791m);
        }
        this.f2771c.y(hVar3, this.f2791m, z10);
        this.f2786j0.f2840g = true;
    }

    public void v() {
        int iJ = this.f2777f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 f0VarN0 = n0(this.f2777f.i(i10));
            if (!f0VarN0.K()) {
                f0VarN0.c();
            }
        }
        this.f2771c.d();
    }

    public boolean v0() {
        return !this.f2811w || this.F || this.f2775e.p();
    }

    public boolean v1(f0 f0Var, int i10) {
        if (!D0()) {
            f0Var.f2861a.setImportantForAccessibility(i10);
            return true;
        }
        f0Var.f2876q = i10;
        this.f2812w0.add(f0Var);
        return false;
    }

    public void w(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.K.onRelease();
            zIsFinished = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final boolean w0() {
        int iG = this.f2777f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            f0 f0VarN0 = n0(this.f2777f.f(i10));
            if (f0VarN0 != null && !f0VarN0.K() && f0VarN0.z()) {
                return true;
            }
        }
        return false;
    }

    public final boolean w1(@NonNull EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return t0(-i10) < d3.e.b(edgeEffect) * ((float) i11);
    }

    public int x(int i10) {
        return y(i10, this.K, this.M, getWidth());
    }

    public void x0() {
        this.f2775e = new androidx.recyclerview.widget.a(new g());
    }

    public boolean x1(AccessibilityEvent accessibilityEvent) {
        if (!D0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? y2.b.a(accessibilityEvent) : 0;
        this.B |= iA != 0 ? iA : 0;
        return true;
    }

    public final int y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && d3.e.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * d3.e.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || d3.e.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * d3.e.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    @SuppressLint({"InlinedApi"})
    public final void y0() {
        if (o0.y(this) == 0) {
            o0.y0(this, 8);
        }
    }

    public void y1(int i10, int i11) {
        z1(i10, i11, null);
    }

    public int z(int i10) {
        return y(i10, this.L, this.N, getHeight());
    }

    public final void z0() {
        this.f2777f = new androidx.recyclerview.widget.e(new f());
    }

    public void z1(int i10, int i11, Interpolator interpolator) {
        A1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v4.a.f33319a);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f2819c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2819c = parcel.readParcelable(classLoader == null ? q.class.getClassLoader() : classLoader);
        }

        public void f(SavedState savedState) {
            this.f2819c = savedState.f2819c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f2819c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.b = new z();
        this.f2771c = new x();
        this.f2779g = new androidx.recyclerview.widget.u();
        this.f2783i = new a();
        this.f2785j = new Rect();
        this.f2787k = new Rect();
        this.f2789l = new RectF();
        this.f2797p = new ArrayList();
        this.f2799q = new ArrayList<>();
        this.f2801r = new ArrayList<>();
        this.f2813x = 0;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = O0;
        this.O = new androidx.recyclerview.widget.f();
        this.P = 0;
        this.Q = -1;
        this.f2774d0 = Float.MIN_VALUE;
        this.f2776e0 = Float.MIN_VALUE;
        this.f2778f0 = true;
        this.f2780g0 = new e0();
        this.f2784i0 = L0 ? new androidx.recyclerview.widget.j.b() : null;
        this.f2786j0 = new b0();
        this.f2792m0 = false;
        this.f2794n0 = false;
        this.f2796o0 = new o();
        this.f2798p0 = false;
        this.f2802r0 = new int[2];
        this.f2806t0 = new int[2];
        this.f2808u0 = new int[2];
        this.f2810v0 = new int[2];
        this.f2812w0 = new ArrayList();
        this.f2814x0 = new b();
        this.f2818z0 = 0;
        this.A0 = 0;
        this.C0 = new d();
        e eVar = new e();
        this.D0 = eVar;
        this.E0 = new androidx.core.view.h(getContext(), eVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.f2774d0 = r0.e(viewConfiguration, context);
        this.f2776e0 = r0.h(viewConfiguration, context);
        this.f2770b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2772c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2768a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.v(this.f2796o0);
        x0();
        z0();
        y0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.p(this));
        int[] iArr = v4.c.f33322a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        o0.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(v4.c.f33330j);
        if (typedArrayObtainStyledAttributes.getInt(v4.c.f33324d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2781h = typedArrayObtainStyledAttributes.getBoolean(v4.c.f33323c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(v4.c.f33325e, false);
        this.f2809v = z10;
        if (z10) {
            A0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(v4.c.f33328h), typedArrayObtainStyledAttributes.getDrawable(v4.c.f33329i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(v4.c.f33326f), typedArrayObtainStyledAttributes.getDrawable(v4.c.f33327g));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.B0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        B(context, string, attributeSet, i10, 0);
        int[] iArr2 = H0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        o0.k0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        q3.a.d(this, true);
    }

    public static class r extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f0 f2916a;
        public final Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2918d;

        public r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.f2917c = true;
            this.f2918d = false;
        }

        public int a() {
            return this.f2916a.k();
        }

        public int b() {
            return this.f2916a.n();
        }

        public boolean c() {
            return this.f2916a.z();
        }

        public boolean d() {
            return this.f2916a.w();
        }

        public boolean e() {
            return this.f2916a.u();
        }

        public r(int i10, int i11) {
            super(i10, i11);
            this.b = new Rect();
            this.f2917c = true;
            this.f2918d = false;
        }

        public r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.f2917c = true;
            this.f2918d = false;
        }

        public r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.f2917c = true;
            this.f2918d = false;
        }

        public r(r rVar) {
            super((ViewGroup.LayoutParams) rVar);
            this.b = new Rect();
            this.f2917c = true;
            this.f2918d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f2793n;
        if (qVar != null) {
            return qVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }
}
