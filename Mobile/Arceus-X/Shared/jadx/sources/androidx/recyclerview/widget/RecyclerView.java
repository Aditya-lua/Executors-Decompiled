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
import androidx.core.view.C0582a;
import androidx.core.view.C0603h;
import androidx.core.view.C0625o0;
import androidx.core.view.C0631r0;
import androidx.core.view.C0632s;
import androidx.core.view.C0636u;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.InterfaceC0601g0;
import androidx.core.view.InterfaceC0606i;
import androidx.core.view.InterfaceC0634t;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import p066d3.C4427e;
import p369q3.C10427a;
import p456u2.C11786o;
import p484v4.C12009a;
import p484v4.C12010b;
import p484v4.C12011c;
import p533x2.C12637g;
import p564y2.C13003b;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0601g0, InterfaceC0634t {

    /* JADX INFO: renamed from: F0 */
    public static boolean f3845F0;

    /* JADX INFO: renamed from: G0 */
    public static boolean f3846G0;

    /* JADX INFO: renamed from: H0 */
    public static final int[] f3847H0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: I0 */
    public static final float f3848I0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: J0 */
    public static final boolean f3849J0 = false;

    /* JADX INFO: renamed from: K0 */
    public static final boolean f3850K0 = true;

    /* JADX INFO: renamed from: L0 */
    public static final boolean f3851L0 = true;

    /* JADX INFO: renamed from: M0 */
    public static final Class<?>[] f3852M0;

    /* JADX INFO: renamed from: N0 */
    public static final Interpolator f3853N0;

    /* JADX INFO: renamed from: O0 */
    public static final C1017c0 f3854O0;

    /* JADX INFO: renamed from: A */
    public boolean f3855A;

    /* JADX INFO: renamed from: A0 */
    public int f3856A0;

    /* JADX INFO: renamed from: B */
    public int f3857B;

    /* JADX INFO: renamed from: B0 */
    public boolean f3858B0;

    /* JADX INFO: renamed from: C */
    public boolean f3859C;

    /* JADX INFO: renamed from: C0 */
    public final C1070u.b f3860C0;

    /* JADX INFO: renamed from: D */
    public final AccessibilityManager f3861D;

    /* JADX INFO: renamed from: D0 */
    public final InterfaceC0606i f3862D0;

    /* JADX INFO: renamed from: E */
    public List<InterfaceC1036s> f3863E;

    /* JADX INFO: renamed from: E0 */
    public C0603h f3864E0;

    /* JADX INFO: renamed from: F */
    public boolean f3865F;

    /* JADX INFO: renamed from: G */
    public boolean f3866G;

    /* JADX INFO: renamed from: H */
    public int f3867H;

    /* JADX INFO: renamed from: I */
    public int f3868I;

    /* JADX INFO: renamed from: J */
    @NonNull
    public C1030m f3869J;

    /* JADX INFO: renamed from: K */
    public EdgeEffect f3870K;

    /* JADX INFO: renamed from: L */
    public EdgeEffect f3871L;

    /* JADX INFO: renamed from: M */
    public EdgeEffect f3872M;

    /* JADX INFO: renamed from: N */
    public EdgeEffect f3873N;

    /* JADX INFO: renamed from: O */
    public AbstractC1031n f3874O;

    /* JADX INFO: renamed from: P */
    public int f3875P;

    /* JADX INFO: renamed from: Q */
    public int f3876Q;

    /* JADX INFO: renamed from: R */
    public VelocityTracker f3877R;

    /* JADX INFO: renamed from: S */
    public int f3878S;

    /* JADX INFO: renamed from: T */
    public int f3879T;

    /* JADX INFO: renamed from: U */
    public int f3880U;

    /* JADX INFO: renamed from: V */
    public int f3881V;

    /* JADX INFO: renamed from: W */
    public int f3882W;

    /* JADX INFO: renamed from: a */
    public final float f3883a;

    /* JADX INFO: renamed from: a0 */
    public AbstractC1037t f3884a0;

    /* JADX INFO: renamed from: b */
    public final C1043z f3885b;

    /* JADX INFO: renamed from: b0 */
    public final int f3886b0;

    /* JADX INFO: renamed from: c */
    public final C1041x f3887c;

    /* JADX INFO: renamed from: c0 */
    public final int f3888c0;

    /* JADX INFO: renamed from: d */
    public SavedState f3889d;

    /* JADX INFO: renamed from: d0 */
    public float f3890d0;

    /* JADX INFO: renamed from: e */
    public C1050a f3891e;

    /* JADX INFO: renamed from: e0 */
    public float f3892e0;

    /* JADX INFO: renamed from: f */
    public C1054e f3893f;

    /* JADX INFO: renamed from: f0 */
    public boolean f3894f0;

    /* JADX INFO: renamed from: g */
    public final C1070u f3895g;

    /* JADX INFO: renamed from: g0 */
    public final RunnableC1021e0 f3896g0;

    /* JADX INFO: renamed from: h */
    public boolean f3897h;

    /* JADX INFO: renamed from: h0 */
    public RunnableC1059j f3898h0;

    /* JADX INFO: renamed from: i */
    public final Runnable f3899i;

    /* JADX INFO: renamed from: i0 */
    public RunnableC1059j.b f3900i0;

    /* JADX INFO: renamed from: j */
    public final Rect f3901j;

    /* JADX INFO: renamed from: j0 */
    public final C1015b0 f3902j0;

    /* JADX INFO: renamed from: k */
    public final Rect f3903k;

    /* JADX INFO: renamed from: k0 */
    public AbstractC1039v f3904k0;

    /* JADX INFO: renamed from: l */
    public final RectF f3905l;

    /* JADX INFO: renamed from: l0 */
    public List<AbstractC1039v> f3906l0;

    /* JADX INFO: renamed from: m */
    public AbstractC1025h f3907m;

    /* JADX INFO: renamed from: m0 */
    public boolean f3908m0;

    /* JADX INFO: renamed from: n */
    public AbstractC1034q f3909n;

    /* JADX INFO: renamed from: n0 */
    public boolean f3910n0;

    /* JADX INFO: renamed from: o */
    public InterfaceC1042y f3911o;

    /* JADX INFO: renamed from: o0 */
    public AbstractC1031n.b f3912o0;

    /* JADX INFO: renamed from: p */
    public final List<InterfaceC1042y> f3913p;

    /* JADX INFO: renamed from: p0 */
    public boolean f3914p0;

    /* JADX INFO: renamed from: q */
    public final ArrayList<AbstractC1033p> f3915q;

    /* JADX INFO: renamed from: q0 */
    public C1065p f3916q0;

    /* JADX INFO: renamed from: r */
    public final ArrayList<InterfaceC1038u> f3917r;

    /* JADX INFO: renamed from: r0 */
    public final int[] f3918r0;

    /* JADX INFO: renamed from: s */
    public InterfaceC1038u f3919s;

    /* JADX INFO: renamed from: s0 */
    public C0636u f3920s0;

    /* JADX INFO: renamed from: t */
    public boolean f3921t;

    /* JADX INFO: renamed from: t0 */
    public final int[] f3922t0;

    /* JADX INFO: renamed from: u */
    public boolean f3923u;

    /* JADX INFO: renamed from: u0 */
    public final int[] f3924u0;

    /* JADX INFO: renamed from: v */
    public boolean f3925v;

    /* JADX INFO: renamed from: v0 */
    public final int[] f3926v0;

    /* JADX INFO: renamed from: w */
    public boolean f3927w;

    /* JADX INFO: renamed from: w0 */
    public final List<AbstractC1023f0> f3928w0;

    /* JADX INFO: renamed from: x */
    public int f3929x;

    /* JADX INFO: renamed from: x0 */
    public Runnable f3930x0;

    /* JADX INFO: renamed from: y */
    public boolean f3931y;

    /* JADX INFO: renamed from: y0 */
    public boolean f3932y0;

    /* JADX INFO: renamed from: z */
    public boolean f3933z;

    /* JADX INFO: renamed from: z0 */
    public int f3934z0;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC1012a implements Runnable {
        public RunnableC1012a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f3927w || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f3921t) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f3933z) {
                recyclerView2.f3931y = true;
            } else {
                recyclerView2.m5236A();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class AbstractC1013a0 {

        /* JADX INFO: renamed from: b */
        public RecyclerView f3938b;

        /* JADX INFO: renamed from: c */
        public AbstractC1034q f3939c;

        /* JADX INFO: renamed from: d */
        public boolean f3940d;

        /* JADX INFO: renamed from: e */
        public boolean f3941e;

        /* JADX INFO: renamed from: f */
        public View f3942f;

        /* JADX INFO: renamed from: h */
        public boolean f3944h;

        /* JADX INFO: renamed from: a */
        public int f3937a = -1;

        /* JADX INFO: renamed from: g */
        public final a f3943g = new a(0, 0);

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a0$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f3945a;

            /* JADX INFO: renamed from: b */
            public int f3946b;

            /* JADX INFO: renamed from: c */
            public int f3947c;

            /* JADX INFO: renamed from: d */
            public int f3948d;

            /* JADX INFO: renamed from: e */
            public Interpolator f3949e;

            /* JADX INFO: renamed from: f */
            public boolean f3950f;

            /* JADX INFO: renamed from: g */
            public int f3951g;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public a(int i10, int i11) {
                this(i10, i11, EditorInfoCompat.IME_FLAG_FORCE_ASCII, null);
            }

            /* JADX INFO: renamed from: a */
            public boolean m5386a() {
                return this.f3948d >= 0;
            }

            /* JADX INFO: renamed from: b */
            public void m5387b(int i10) {
                this.f3948d = i10;
            }

            /* JADX INFO: renamed from: c */
            public void m5388c(RecyclerView recyclerView) {
                int i10 = this.f3948d;
                if (i10 >= 0) {
                    this.f3948d = -1;
                    recyclerView.m5252F0(i10);
                    this.f3950f = false;
                } else {
                    if (!this.f3950f) {
                        this.f3951g = 0;
                        return;
                    }
                    m5390e();
                    recyclerView.f3896g0.m5407e(this.f3945a, this.f3946b, this.f3947c, this.f3949e);
                    int i11 = this.f3951g + 1;
                    this.f3951g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3950f = false;
                }
            }

            /* JADX INFO: renamed from: d */
            public void m5389d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3945a = i10;
                this.f3946b = i11;
                this.f3947c = i12;
                this.f3949e = interpolator;
                this.f3950f = true;
            }

            /* JADX INFO: renamed from: e */
            public final void m5390e() {
                if (this.f3949e != null && this.f3947c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3947c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3948d = -1;
                this.f3950f = false;
                this.f3951g = 0;
                this.f3945a = i10;
                this.f3946b = i11;
                this.f3947c = i12;
                this.f3949e = interpolator;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a0$b */
        public interface b {
            /* JADX INFO: renamed from: c */
            PointF mo5177c(int i10);
        }

        /* JADX INFO: renamed from: a */
        public PointF mo5368a(int i10) {
            Object objM5372e = m5372e();
            if (objM5372e instanceof b) {
                return ((b) objM5372e).mo5177c(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* JADX INFO: renamed from: b */
        public View m5369b(int i10) {
            return this.f3938b.f3909n.mo5154H(i10);
        }

        /* JADX INFO: renamed from: c */
        public int m5370c() {
            return this.f3938b.f3909n.m5574O();
        }

        /* JADX INFO: renamed from: d */
        public int m5371d(View view) {
            return this.f3938b.m5324l0(view);
        }

        /* JADX INFO: renamed from: e */
        public AbstractC1034q m5372e() {
            return this.f3939c;
        }

        /* JADX INFO: renamed from: f */
        public int m5373f() {
            return this.f3937a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m5374g() {
            return this.f3940d;
        }

        /* JADX INFO: renamed from: h */
        public boolean m5375h() {
            return this.f3941e;
        }

        /* JADX INFO: renamed from: i */
        public void m5376i(@NonNull PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        /* JADX INFO: renamed from: j */
        public void m5377j(int i10, int i11) {
            PointF pointFMo5368a;
            RecyclerView recyclerView = this.f3938b;
            if (this.f3937a == -1 || recyclerView == null) {
                m5385r();
            }
            if (this.f3940d && this.f3942f == null && this.f3939c != null && (pointFMo5368a = mo5368a(this.f3937a)) != null) {
                float f10 = pointFMo5368a.x;
                if (f10 != 0.0f || pointFMo5368a.y != 0.0f) {
                    recyclerView.m5344s1((int) Math.signum(f10), (int) Math.signum(pointFMo5368a.y), null);
                }
            }
            this.f3940d = false;
            View view = this.f3942f;
            if (view != null) {
                if (m5371d(view) == this.f3937a) {
                    mo5382o(this.f3942f, recyclerView.f3902j0, this.f3943g);
                    this.f3943g.m5388c(recyclerView);
                    m5385r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3942f = null;
                }
            }
            if (this.f3941e) {
                mo5379l(i10, i11, recyclerView.f3902j0, this.f3943g);
                boolean zM5386a = this.f3943g.m5386a();
                this.f3943g.m5388c(recyclerView);
                if (zM5386a && this.f3941e) {
                    this.f3940d = true;
                    recyclerView.f3896g0.m5406d();
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public void m5378k(View view) {
            if (m5371d(view) == m5373f()) {
                this.f3942f = view;
                if (RecyclerView.f3846G0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public abstract void mo5379l(int i10, int i11, @NonNull C1015b0 c1015b0, @NonNull a aVar);

        /* JADX INFO: renamed from: m */
        public abstract void mo5380m();

        /* JADX INFO: renamed from: n */
        public abstract void mo5381n();

        /* JADX INFO: renamed from: o */
        public abstract void mo5382o(@NonNull View view, @NonNull C1015b0 c1015b0, @NonNull a aVar);

        /* JADX INFO: renamed from: p */
        public void m5383p(int i10) {
            this.f3937a = i10;
        }

        /* JADX INFO: renamed from: q */
        public void m5384q(RecyclerView recyclerView, AbstractC1034q abstractC1034q) {
            recyclerView.f3896g0.m5408f();
            if (this.f3944h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3938b = recyclerView;
            this.f3939c = abstractC1034q;
            int i10 = this.f3937a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f3902j0.f3953a = i10;
            this.f3941e = true;
            this.f3940d = true;
            this.f3942f = m5369b(m5373f());
            mo5380m();
            this.f3938b.f3896g0.m5406d();
            this.f3944h = true;
        }

        /* JADX INFO: renamed from: r */
        public final void m5385r() {
            if (this.f3941e) {
                this.f3941e = false;
                mo5381n();
                this.f3938b.f3902j0.f3953a = -1;
                this.f3942f = null;
                this.f3937a = -1;
                this.f3940d = false;
                this.f3939c.m5612k1(this);
                this.f3939c = null;
                this.f3938b = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class RunnableC1014b implements Runnable {
        public RunnableC1014b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1031n abstractC1031n = RecyclerView.this.f3874O;
            if (abstractC1031n != null) {
                abstractC1031n.mo5530u();
            }
            RecyclerView.this.f3914p0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static class C1015b0 {

        /* JADX INFO: renamed from: b */
        public SparseArray<Object> f3954b;

        /* JADX INFO: renamed from: m */
        public int f3965m;

        /* JADX INFO: renamed from: n */
        public long f3966n;

        /* JADX INFO: renamed from: o */
        public int f3967o;

        /* JADX INFO: renamed from: p */
        public int f3968p;

        /* JADX INFO: renamed from: q */
        public int f3969q;

        /* JADX INFO: renamed from: a */
        public int f3953a = -1;

        /* JADX INFO: renamed from: c */
        public int f3955c = 0;

        /* JADX INFO: renamed from: d */
        public int f3956d = 0;

        /* JADX INFO: renamed from: e */
        public int f3957e = 1;

        /* JADX INFO: renamed from: f */
        public int f3958f = 0;

        /* JADX INFO: renamed from: g */
        public boolean f3959g = false;

        /* JADX INFO: renamed from: h */
        public boolean f3960h = false;

        /* JADX INFO: renamed from: i */
        public boolean f3961i = false;

        /* JADX INFO: renamed from: j */
        public boolean f3962j = false;

        /* JADX INFO: renamed from: k */
        public boolean f3963k = false;

        /* JADX INFO: renamed from: l */
        public boolean f3964l = false;

        /* JADX INFO: renamed from: a */
        public void m5391a(int i10) {
            if ((this.f3957e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f3957e));
        }

        /* JADX INFO: renamed from: b */
        public int m5392b() {
            return this.f3960h ? this.f3955c - this.f3956d : this.f3958f;
        }

        /* JADX INFO: renamed from: c */
        public int m5393c() {
            return this.f3953a;
        }

        /* JADX INFO: renamed from: d */
        public boolean m5394d() {
            return this.f3953a != -1;
        }

        /* JADX INFO: renamed from: e */
        public boolean m5395e() {
            return this.f3960h;
        }

        /* JADX INFO: renamed from: f */
        public void m5396f(AbstractC1025h abstractC1025h) {
            this.f3957e = 1;
            this.f3958f = abstractC1025h.mo5473e();
            this.f3960h = false;
            this.f3961i = false;
            this.f3962j = false;
        }

        /* JADX INFO: renamed from: g */
        public boolean m5397g() {
            return this.f3964l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3953a + ", mData=" + this.f3954b + ", mItemCount=" + this.f3958f + ", mIsMeasuring=" + this.f3962j + ", mPreviousLayoutItemCount=" + this.f3955c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3956d + ", mStructureChanged=" + this.f3959g + ", mInPreLayout=" + this.f3960h + ", mRunSimpleAnimations=" + this.f3963k + ", mRunPredictiveAnimations=" + this.f3964l + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class InterpolatorC1016c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public static class C1017c0 extends C1030m {
        @Override // androidx.recyclerview.widget.RecyclerView.C1030m
        @NonNull
        /* JADX INFO: renamed from: a */
        public EdgeEffect mo5398a(@NonNull RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C1018d implements C1070u.b {
        public C1018d() {
        }

        @Override // androidx.recyclerview.widget.C1070u.b
        /* JADX INFO: renamed from: a */
        public void mo5399a(AbstractC1023f0 abstractC1023f0, AbstractC1031n.c cVar, AbstractC1031n.c cVar2) {
            RecyclerView.this.m5331o(abstractC1023f0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C1070u.b
        /* JADX INFO: renamed from: b */
        public void mo5400b(AbstractC1023f0 abstractC1023f0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3909n.m5626r1(abstractC1023f0.f3981a, recyclerView.f3887c);
        }

        @Override // androidx.recyclerview.widget.C1070u.b
        /* JADX INFO: renamed from: c */
        public void mo5401c(AbstractC1023f0 abstractC1023f0, @NonNull AbstractC1031n.c cVar, AbstractC1031n.c cVar2) {
            RecyclerView.this.f3887c.m5689O(abstractC1023f0);
            RecyclerView.this.m5336q(abstractC1023f0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C1070u.b
        /* JADX INFO: renamed from: d */
        public void mo5402d(AbstractC1023f0 abstractC1023f0, @NonNull AbstractC1031n.c cVar, @NonNull AbstractC1031n.c cVar2) {
            abstractC1023f0.m5426H(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3865F) {
                if (recyclerView.f3874O.mo5512b(abstractC1023f0, abstractC1023f0, cVar, cVar2)) {
                    RecyclerView.this.m5292W0();
                }
            } else if (recyclerView.f3874O.mo5514d(abstractC1023f0, cVar, cVar2)) {
                RecyclerView.this.m5292W0();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class AbstractC1019d0 {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C1020e implements InterfaceC0606i {
        public C1020e() {
        }

        @Override // androidx.core.view.InterfaceC0606i
        /* JADX INFO: renamed from: a */
        public boolean mo2906a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f3909n.mo5193q()) {
                i11 = (int) f10;
                i10 = 0;
            } else if (RecyclerView.this.f3909n.mo5191p()) {
                i10 = (int) f10;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.m5264J1();
            return RecyclerView.this.m5315i0(i10, i11);
        }

        @Override // androidx.core.view.InterfaceC0606i
        /* JADX INFO: renamed from: b */
        public float mo2907b() {
            float f10;
            if (RecyclerView.this.f3909n.mo5193q()) {
                f10 = RecyclerView.this.f3892e0;
            } else {
                if (!RecyclerView.this.f3909n.mo5191p()) {
                    return 0.0f;
                }
                f10 = RecyclerView.this.f3890d0;
            }
            return -f10;
        }

        @Override // androidx.core.view.InterfaceC0606i
        /* JADX INFO: renamed from: c */
        public void mo2908c() {
            RecyclerView.this.m5264J1();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    public class RunnableC1021e0 implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f3972a;

        /* JADX INFO: renamed from: b */
        public int f3973b;

        /* JADX INFO: renamed from: c */
        public OverScroller f3974c;

        /* JADX INFO: renamed from: d */
        public Interpolator f3975d;

        /* JADX INFO: renamed from: e */
        public boolean f3976e;

        /* JADX INFO: renamed from: f */
        public boolean f3977f;

        public RunnableC1021e0() {
            Interpolator interpolator = RecyclerView.f3853N0;
            this.f3975d = interpolator;
            this.f3976e = false;
            this.f3977f = false;
            this.f3974c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* JADX INFO: renamed from: a */
        public final int m5403a(int i10, int i11) {
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

        /* JADX INFO: renamed from: b */
        public void m5404b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f3973b = 0;
            this.f3972a = 0;
            Interpolator interpolator = this.f3975d;
            Interpolator interpolator2 = RecyclerView.f3853N0;
            if (interpolator != interpolator2) {
                this.f3975d = interpolator2;
                this.f3974c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3974c.fling(0, 0, i10, i11, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
            m5406d();
        }

        /* JADX INFO: renamed from: c */
        public final void m5405c() {
            RecyclerView.this.removeCallbacks(this);
            C0625o0.m3024e0(RecyclerView.this, this);
        }

        /* JADX INFO: renamed from: d */
        public void m5406d() {
            if (this.f3976e) {
                this.f3977f = true;
            } else {
                m5405c();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m5407e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = m5403a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f3853N0;
            }
            if (this.f3975d != interpolator) {
                this.f3975d = interpolator;
                this.f3974c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3973b = 0;
            this.f3972a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3974c.startScroll(0, 0, i10, i11, i13);
            m5406d();
        }

        /* JADX INFO: renamed from: f */
        public void m5408f() {
            RecyclerView.this.removeCallbacks(this);
            this.f3974c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3909n == null) {
                m5408f();
                return;
            }
            this.f3977f = false;
            this.f3976e = true;
            recyclerView.m5236A();
            OverScroller overScroller = this.f3974c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f3972a;
                int i14 = currY - this.f3973b;
                this.f3972a = currX;
                this.f3973b = currY;
                int iM5355x = RecyclerView.this.m5355x(i13);
                int iM5361z = RecyclerView.this.m5361z(i14);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3926v0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m5268L(iM5355x, iM5361z, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3926v0;
                    iM5355x -= iArr2[0];
                    iM5361z -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m5352w(iM5355x, iM5361z);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3907m != null) {
                    int[] iArr3 = recyclerView3.f3926v0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m5344s1(iM5355x, iM5361z, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3926v0;
                    int i15 = iArr4[0];
                    int i16 = iArr4[1];
                    iM5355x -= i15;
                    iM5361z -= i16;
                    AbstractC1013a0 abstractC1013a0 = recyclerView4.f3909n.f4025g;
                    if (abstractC1013a0 != null && !abstractC1013a0.m5374g() && abstractC1013a0.m5375h()) {
                        int iM5392b = RecyclerView.this.f3902j0.m5392b();
                        if (iM5392b == 0) {
                            abstractC1013a0.m5385r();
                        } else if (abstractC1013a0.m5373f() >= iM5392b) {
                            abstractC1013a0.m5383p(iM5392b - 1);
                            abstractC1013a0.m5377j(i15, i16);
                        } else {
                            abstractC1013a0.m5377j(i15, i16);
                        }
                    }
                    i11 = i16;
                    i10 = i15;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i17 = iM5355x;
                int i18 = iM5361z;
                if (!RecyclerView.this.f3915q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3926v0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m5271M(i10, i11, i17, i18, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3926v0;
                int i19 = i17 - iArr6[0];
                int i20 = i18 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.m5275O(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
                AbstractC1013a0 abstractC1013a1 = RecyclerView.this.f3909n.f4025g;
                if ((abstractC1013a1 == null || !abstractC1013a1.m5374g()) && z10) {
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
                        RecyclerView.this.m5301b(i12, currVelocity);
                    }
                    if (RecyclerView.f3851L0) {
                        RecyclerView.this.f3900i0.m5980b();
                    }
                } else {
                    m5406d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC1059j runnableC1059j = recyclerView7.f3898h0;
                    if (runnableC1059j != null) {
                        runnableC1059j.m5974f(recyclerView7, i10, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    C1028k.m5509a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            AbstractC1013a0 abstractC1013a2 = RecyclerView.this.f3909n.f4025g;
            if (abstractC1013a2 != null && abstractC1013a2.m5374g()) {
                abstractC1013a2.m5377j(0, 0);
            }
            this.f3976e = false;
            if (this.f3977f) {
                m5405c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m5261I1(1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C1022f implements C1054e.b {
        public C1022f() {
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: a */
        public View mo5409a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.m5248E(view);
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: b */
        public void mo5410b(View view) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (abstractC1023f0M5232n0 != null) {
                abstractC1023f0M5232n0.m5421C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: c */
        public int mo5411c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: d */
        public AbstractC1023f0 mo5412d(View view) {
            return RecyclerView.m5232n0(view);
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: e */
        public void mo5413e(int i10) {
            View viewMo5409a = mo5409a(i10);
            if (viewMo5409a != null) {
                AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(viewMo5409a);
                if (abstractC1023f0M5232n0 != null) {
                    if (abstractC1023f0M5232n0.m5456y() && !abstractC1023f0M5232n0.m5429K()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + abstractC1023f0M5232n0 + RecyclerView.this.m5289V());
                    }
                    if (RecyclerView.f3846G0) {
                        Log.d("RecyclerView", "tmpDetach " + abstractC1023f0M5232n0);
                    }
                    abstractC1023f0M5232n0.m5433b(256);
                }
            } else if (RecyclerView.f3845F0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.m5289V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: f */
        public void mo5414f() {
            int iMo5411c = mo5411c();
            for (int i10 = 0; i10 < iMo5411c; i10++) {
                View viewMo5409a = mo5409a(i10);
                RecyclerView.this.m5251F(viewMo5409a);
                viewMo5409a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: g */
        public int mo5415g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: h */
        public void mo5416h(View view) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (abstractC1023f0M5232n0 != null) {
                abstractC1023f0M5232n0.m5422D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: i */
        public void mo5417i(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.m5251F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.C1054e.b
        /* JADX INFO: renamed from: j */
        public void mo5418j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (abstractC1023f0M5232n0 != null) {
                if (!abstractC1023f0M5232n0.m5456y() && !abstractC1023f0M5232n0.m5429K()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC1023f0M5232n0 + RecyclerView.this.m5289V());
                }
                if (RecyclerView.f3846G0) {
                    Log.d("RecyclerView", "reAttach " + abstractC1023f0M5232n0);
                }
                abstractC1023f0M5232n0.m5437f();
            } else if (RecyclerView.f3845F0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.m5289V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f0 */
    public static abstract class AbstractC1023f0 {

        /* JADX INFO: renamed from: t */
        public static final List<Object> f3980t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a */
        @NonNull
        public final View f3981a;

        /* JADX INFO: renamed from: b */
        public WeakReference<RecyclerView> f3982b;

        /* JADX INFO: renamed from: j */
        public int f3990j;

        /* JADX INFO: renamed from: r */
        public RecyclerView f3998r;

        /* JADX INFO: renamed from: s */
        public AbstractC1025h<? extends AbstractC1023f0> f3999s;

        /* JADX INFO: renamed from: c */
        public int f3983c = -1;

        /* JADX INFO: renamed from: d */
        public int f3984d = -1;

        /* JADX INFO: renamed from: e */
        public long f3985e = -1;

        /* JADX INFO: renamed from: f */
        public int f3986f = -1;

        /* JADX INFO: renamed from: g */
        public int f3987g = -1;

        /* JADX INFO: renamed from: h */
        public AbstractC1023f0 f3988h = null;

        /* JADX INFO: renamed from: i */
        public AbstractC1023f0 f3989i = null;

        /* JADX INFO: renamed from: k */
        public List<Object> f3991k = null;

        /* JADX INFO: renamed from: l */
        public List<Object> f3992l = null;

        /* JADX INFO: renamed from: m */
        public int f3993m = 0;

        /* JADX INFO: renamed from: n */
        public C1041x f3994n = null;

        /* JADX INFO: renamed from: o */
        public boolean f3995o = false;

        /* JADX INFO: renamed from: p */
        public int f3996p = 0;

        /* JADX INFO: renamed from: q */
        public int f3997q = -1;

        public AbstractC1023f0(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f3981a = view;
        }

        /* JADX INFO: renamed from: A */
        public boolean m5419A() {
            return (this.f3990j & 2) != 0;
        }

        /* JADX INFO: renamed from: B */
        public void m5420B(int i10, boolean z10) {
            if (this.f3984d == -1) {
                this.f3984d = this.f3983c;
            }
            if (this.f3987g == -1) {
                this.f3987g = this.f3983c;
            }
            if (z10) {
                this.f3987g += i10;
            }
            this.f3983c += i10;
            if (this.f3981a.getLayoutParams() != null) {
                ((C1035r) this.f3981a.getLayoutParams()).f4045c = true;
            }
        }

        /* JADX INFO: renamed from: C */
        public void m5421C(RecyclerView recyclerView) {
            int i10 = this.f3997q;
            if (i10 != -1) {
                this.f3996p = i10;
            } else {
                this.f3996p = this.f3981a.getImportantForAccessibility();
            }
            recyclerView.m5351v1(this, 4);
        }

        /* JADX INFO: renamed from: D */
        public void m5422D(RecyclerView recyclerView) {
            recyclerView.m5351v1(this, this.f3996p);
            this.f3996p = 0;
        }

        /* JADX INFO: renamed from: E */
        public void m5423E() {
            if (RecyclerView.f3845F0 && m5456y()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f3990j = 0;
            this.f3983c = -1;
            this.f3984d = -1;
            this.f3985e = -1L;
            this.f3987g = -1;
            this.f3993m = 0;
            this.f3988h = null;
            this.f3989i = null;
            m5435d();
            this.f3996p = 0;
            this.f3997q = -1;
            RecyclerView.m5235u(this);
        }

        /* JADX INFO: renamed from: F */
        public void m5424F() {
            if (this.f3984d == -1) {
                this.f3984d = this.f3983c;
            }
        }

        /* JADX INFO: renamed from: G */
        public void m5425G(int i10, int i11) {
            this.f3990j = (i10 & i11) | (this.f3990j & (~i11));
        }

        /* JADX INFO: renamed from: H */
        public final void m5426H(boolean z10) {
            int i10 = this.f3993m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f3993m = i11;
            if (i11 < 0) {
                this.f3993m = 0;
                if (RecyclerView.f3845F0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.f3990j |= 16;
            } else if (z10 && i11 == 0) {
                this.f3990j &= -17;
            }
            if (RecyclerView.f3846G0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        /* JADX INFO: renamed from: I */
        public void m5427I(C1041x c1041x, boolean z10) {
            this.f3994n = c1041x;
            this.f3995o = z10;
        }

        /* JADX INFO: renamed from: J */
        public boolean m5428J() {
            return (this.f3990j & 16) != 0;
        }

        /* JADX INFO: renamed from: K */
        public boolean m5429K() {
            return (this.f3990j & 128) != 0;
        }

        /* JADX INFO: renamed from: L */
        public void m5430L() {
            this.f3994n.m5689O(this);
        }

        /* JADX INFO: renamed from: M */
        public boolean m5431M() {
            return (this.f3990j & 32) != 0;
        }

        /* JADX INFO: renamed from: a */
        public void m5432a(Object obj) {
            if (obj == null) {
                m5433b(1024);
            } else if ((1024 & this.f3990j) == 0) {
                m5438g();
                this.f3991k.add(obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m5433b(int i10) {
            this.f3990j = i10 | this.f3990j;
        }

        /* JADX INFO: renamed from: c */
        public void m5434c() {
            this.f3984d = -1;
            this.f3987g = -1;
        }

        /* JADX INFO: renamed from: d */
        public void m5435d() {
            List<Object> list = this.f3991k;
            if (list != null) {
                list.clear();
            }
            this.f3990j &= -1025;
        }

        /* JADX INFO: renamed from: e */
        public void m5436e() {
            this.f3990j &= -33;
        }

        /* JADX INFO: renamed from: f */
        public void m5437f() {
            this.f3990j &= -257;
        }

        /* JADX INFO: renamed from: g */
        public final void m5438g() {
            if (this.f3991k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3991k = arrayList;
                this.f3992l = Collections.unmodifiableList(arrayList);
            }
        }

        /* JADX INFO: renamed from: h */
        public boolean m5439h() {
            return (this.f3990j & 16) == 0 && C0625o0.m3003O(this.f3981a);
        }

        /* JADX INFO: renamed from: i */
        public void m5440i(int i10, int i11, boolean z10) {
            m5433b(8);
            m5420B(i11, z10);
            this.f3983c = i10;
        }

        /* JADX INFO: renamed from: j */
        public final int m5441j() {
            RecyclerView recyclerView = this.f3998r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m5318j0(this);
        }

        /* JADX INFO: renamed from: k */
        public final int m5442k() {
            RecyclerView recyclerView;
            AbstractC1025h adapter;
            int iM5318j0;
            if (this.f3999s == null || (recyclerView = this.f3998r) == null || (adapter = recyclerView.getAdapter()) == null || (iM5318j0 = this.f3998r.m5318j0(this)) == -1) {
                return -1;
            }
            return adapter.m5472d(this.f3999s, this, iM5318j0);
        }

        /* JADX INFO: renamed from: l */
        public final long m5443l() {
            return this.f3985e;
        }

        /* JADX INFO: renamed from: m */
        public final int m5444m() {
            return this.f3986f;
        }

        /* JADX INFO: renamed from: n */
        public final int m5445n() {
            int i10 = this.f3987g;
            return i10 == -1 ? this.f3983c : i10;
        }

        /* JADX INFO: renamed from: o */
        public final int m5446o() {
            return this.f3984d;
        }

        /* JADX INFO: renamed from: p */
        public List<Object> m5447p() {
            if ((this.f3990j & 1024) != 0) {
                return f3980t;
            }
            List<Object> list = this.f3991k;
            return (list == null || list.size() == 0) ? f3980t : this.f3992l;
        }

        /* JADX INFO: renamed from: q */
        public boolean m5448q(int i10) {
            return (i10 & this.f3990j) != 0;
        }

        /* JADX INFO: renamed from: r */
        public boolean m5449r() {
            return (this.f3990j & 512) != 0 || m5452u();
        }

        /* JADX INFO: renamed from: s */
        public boolean m5450s() {
            return (this.f3981a.getParent() == null || this.f3981a.getParent() == this.f3998r) ? false : true;
        }

        /* JADX INFO: renamed from: t */
        public boolean m5451t() {
            return (this.f3990j & 1) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3983c + " id=" + this.f3985e + ", oldPos=" + this.f3984d + ", pLpos:" + this.f3987g);
            if (m5455x()) {
                sb2.append(" scrap ");
                sb2.append(this.f3995o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m5452u()) {
                sb2.append(" invalid");
            }
            if (!m5451t()) {
                sb2.append(" unbound");
            }
            if (m5419A()) {
                sb2.append(" update");
            }
            if (m5454w()) {
                sb2.append(" removed");
            }
            if (m5429K()) {
                sb2.append(" ignored");
            }
            if (m5456y()) {
                sb2.append(" tmpDetached");
            }
            if (!m5453v()) {
                sb2.append(" not recyclable(" + this.f3993m + ")");
            }
            if (m5449r()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f3981a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* JADX INFO: renamed from: u */
        public boolean m5452u() {
            return (this.f3990j & 4) != 0;
        }

        /* JADX INFO: renamed from: v */
        public final boolean m5453v() {
            return (this.f3990j & 16) == 0 && !C0625o0.m3003O(this.f3981a);
        }

        /* JADX INFO: renamed from: w */
        public boolean m5454w() {
            return (this.f3990j & 8) != 0;
        }

        /* JADX INFO: renamed from: x */
        public boolean m5455x() {
            return this.f3994n != null;
        }

        /* JADX INFO: renamed from: y */
        public boolean m5456y() {
            return (this.f3990j & 256) != 0;
        }

        /* JADX INFO: renamed from: z */
        public boolean m5457z() {
            return (this.f3990j & 2) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public class C1024g implements C1050a.a {
        public C1024g() {
        }

        @Override // androidx.recyclerview.widget.C1050a.a
        /* JADX INFO: renamed from: a */
        public void mo5458a(int i10, int i11) {
            RecyclerView.this.m5272M0(i10, i11);
            RecyclerView.this.f3908m0 = true;
        }

        @Override // androidx.recyclerview.widget.C1050a.a
        /* JADX INFO: renamed from: b */
        public void mo5459b(C1050a.b bVar) {
            m5466i(bVar);
        }

        @Override // androidx.recyclerview.widget.C1050a.a
        /* JADX INFO: renamed from: c */
        public void mo5460c(C1050a.b bVar) {
            m5466i(bVar);
        }

        @Override // androidx.recyclerview.widget.C1050a.a
        /* JADX INFO: renamed from: d */
        public void mo5461d(int i10, int i11) {
            RecyclerView.this.m5274N0(i10, i11, false);
            RecyclerView.this.f3908m0 = true;
        }

        @Override // androidx.recyclerview.widget.C1050a.a
        /* JADX INFO: renamed from: e */
        public void mo5462e(int i10, int i11, Object obj) {
            RecyclerView.this.m5270L1(i10, i11, obj);
            RecyclerView.this.f3910n0 = true;
        }

        @Override // androidx.recyclerview.widget.C1050a.a
        /* JADX INFO: renamed from: f */
        public AbstractC1023f0 mo5463f(int i10) {
            AbstractC1023f0 abstractC1023f0M5309f0 = RecyclerView.this.m5309f0(i10, true);
            if (abstractC1023f0M5309f0 == null) {
                return null;
            }
            if (!RecyclerView.this.f3893f.m5888n(abstractC1023f0M5309f0.f3981a)) {
                return abstractC1023f0M5309f0;
            }
            if (RecyclerView.f3846G0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.C1050a.a
        /* JADX INFO: renamed from: g */
        public void mo5464g(int i10, int i11) {
            RecyclerView.this.m5269L0(i10, i11);
            RecyclerView.this.f3908m0 = true;
        }

        @Override // androidx.recyclerview.widget.C1050a.a
        /* JADX INFO: renamed from: h */
        public void mo5465h(int i10, int i11) {
            RecyclerView.this.m5274N0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3908m0 = true;
            recyclerView.f3902j0.f3956d += i11;
        }

        /* JADX INFO: renamed from: i */
        public void m5466i(C1050a.b bVar) {
            int i10 = bVar.f4127a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3909n.mo5092W0(recyclerView, bVar.f4128b, bVar.f4130d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3909n.mo5098Z0(recyclerView2, bVar.f4128b, bVar.f4130d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3909n.mo5101b1(recyclerView3, bVar.f4128b, bVar.f4130d, bVar.f4129c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3909n.mo5096Y0(recyclerView4, bVar.f4128b, bVar.f4130d, 1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class AbstractC1025h<VH extends AbstractC1023f0> {

        /* JADX INFO: renamed from: a */
        public final C1026i f4001a = new C1026i();

        /* JADX INFO: renamed from: b */
        public boolean f4002b = false;

        /* JADX INFO: renamed from: c */
        public a f4003c = a.ALLOW;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX INFO: renamed from: A */
        public void m5467A(boolean z10) {
            if (m5476h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f4002b = z10;
        }

        /* JADX INFO: renamed from: B */
        public void m5468B(@NonNull AbstractC1027j abstractC1027j) {
            this.f4001a.unregisterObserver(abstractC1027j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.recyclerview.widget.RecyclerView$h<VH extends androidx.recyclerview.widget.RecyclerView$f0> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m5469a(@NonNull VH vh2, int i10) {
            boolean z10 = vh2.f3999s == null;
            if (z10) {
                vh2.f3983c = i10;
                if (m5477i()) {
                    vh2.f3985e = mo5474f(i10);
                }
                vh2.m5425G(1, 519);
                if (C11786o.m44083c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(vh2.f3986f)));
                }
            }
            vh2.f3999s = this;
            if (RecyclerView.f3845F0) {
                if (vh2.f3981a.getParent() == null && vh2.f3981a.isAttachedToWindow() != vh2.m5456y()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh2.m5456y() + ", attached to window: " + vh2.f3981a.isAttachedToWindow() + ", holder: " + vh2);
                }
                if (vh2.f3981a.getParent() == null && vh2.f3981a.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh2);
                }
            }
            m5487s(vh2, i10, vh2.m5447p());
            if (z10) {
                vh2.m5435d();
                ViewGroup.LayoutParams layoutParams = vh2.f3981a.getLayoutParams();
                if (layoutParams instanceof C1035r) {
                    ((C1035r) layoutParams).f4045c = true;
                }
                Trace.endSection();
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m5470b() {
            int iOrdinal = this.f4003c.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2;
            }
            return mo5473e() > 0;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public final VH m5471c(@NonNull ViewGroup viewGroup, int i10) {
            try {
                if (C11786o.m44083c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                VH vh2 = (VH) mo5488t(viewGroup, i10);
                if (vh2.f3981a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.f3986f = i10;
                Trace.endSection();
                return vh2;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        /* JADX INFO: renamed from: d */
        public int m5472d(@NonNull AbstractC1025h<? extends AbstractC1023f0> abstractC1025h, @NonNull AbstractC1023f0 abstractC1023f0, int i10) {
            if (abstractC1025h == this) {
                return i10;
            }
            return -1;
        }

        /* JADX INFO: renamed from: e */
        public abstract int mo5473e();

        /* JADX INFO: renamed from: f */
        public long mo5474f(int i10) {
            return -1L;
        }

        /* JADX INFO: renamed from: g */
        public int mo5475g(int i10) {
            return 0;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m5476h() {
            return this.f4001a.m5496a();
        }

        /* JADX INFO: renamed from: i */
        public final boolean m5477i() {
            return this.f4002b;
        }

        /* JADX INFO: renamed from: j */
        public final void m5478j() {
            this.f4001a.m5497b();
        }

        /* JADX INFO: renamed from: k */
        public final void m5479k(int i10) {
            this.f4001a.m5499d(i10, 1);
        }

        /* JADX INFO: renamed from: l */
        public final void m5480l(int i10, Object obj) {
            this.f4001a.m5500e(i10, 1, obj);
        }

        /* JADX INFO: renamed from: m */
        public final void m5481m(int i10, int i11) {
            this.f4001a.m5498c(i10, i11);
        }

        /* JADX INFO: renamed from: n */
        public final void m5482n(int i10, int i11, Object obj) {
            this.f4001a.m5500e(i10, i11, obj);
        }

        /* JADX INFO: renamed from: o */
        public final void m5483o(int i10, int i11) {
            this.f4001a.m5501f(i10, i11);
        }

        /* JADX INFO: renamed from: p */
        public final void m5484p(int i10, int i11) {
            this.f4001a.m5502g(i10, i11);
        }

        /* JADX INFO: renamed from: q */
        public void m5485q(@NonNull RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: r */
        public abstract void mo5486r(@NonNull VH vh2, int i10);

        /* JADX INFO: renamed from: s */
        public void m5487s(@NonNull VH vh2, int i10, @NonNull List<Object> list) {
            mo5486r(vh2, i10);
        }

        @NonNull
        /* JADX INFO: renamed from: t */
        public abstract VH mo5488t(@NonNull ViewGroup viewGroup, int i10);

        /* JADX INFO: renamed from: u */
        public void m5489u(@NonNull RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: v */
        public boolean m5490v(@NonNull VH vh2) {
            return false;
        }

        /* JADX INFO: renamed from: w */
        public void m5491w(@NonNull VH vh2) {
        }

        /* JADX INFO: renamed from: x */
        public void m5492x(@NonNull VH vh2) {
        }

        /* JADX INFO: renamed from: y */
        public void m5493y(@NonNull VH vh2) {
        }

        /* JADX INFO: renamed from: z */
        public void m5494z(@NonNull AbstractC1027j abstractC1027j) {
            this.f4001a.registerObserver(abstractC1027j);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C1026i extends Observable<AbstractC1027j> {
        /* JADX INFO: renamed from: a */
        public boolean m5496a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public void m5497b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1027j) ((Observable) this).mObservers.get(size)).mo5503a();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m5498c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1027j) ((Observable) this).mObservers.get(size)).mo5507e(i10, i11, 1);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m5499d(int i10, int i11) {
            m5500e(i10, i11, null);
        }

        /* JADX INFO: renamed from: e */
        public void m5500e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1027j) ((Observable) this).mObservers.get(size)).mo5505c(i10, i11, obj);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m5501f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1027j) ((Observable) this).mObservers.get(size)).mo5506d(i10, i11);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m5502g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1027j) ((Observable) this).mObservers.get(size)).mo5508f(i10, i11);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class AbstractC1027j {
        /* JADX INFO: renamed from: a */
        public void mo5503a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo5504b(int i10, int i11) {
        }

        /* JADX INFO: renamed from: c */
        public void mo5505c(int i10, int i11, Object obj) {
            mo5504b(i10, i11);
        }

        /* JADX INFO: renamed from: d */
        public void mo5506d(int i10, int i11) {
        }

        /* JADX INFO: renamed from: e */
        public void mo5507e(int i10, int i11, int i12) {
        }

        /* JADX INFO: renamed from: f */
        public void mo5508f(int i10, int i11) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static final class C1028k {
        /* JADX INFO: renamed from: a */
        public static void m5509a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public interface InterfaceC1029l {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static class C1030m {
        @NonNull
        /* JADX INFO: renamed from: a */
        public EdgeEffect mo5398a(@NonNull RecyclerView recyclerView, int i10) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC1031n {

        /* JADX INFO: renamed from: a */
        public b f4008a = null;

        /* JADX INFO: renamed from: b */
        public ArrayList<a> f4009b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public long f4010c = 120;

        /* JADX INFO: renamed from: d */
        public long f4011d = 120;

        /* JADX INFO: renamed from: e */
        public long f4012e = 250;

        /* JADX INFO: renamed from: f */
        public long f4013f = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m5532a();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            void mo5533a(@NonNull AbstractC1023f0 abstractC1023f0);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public int f4014a;

            /* JADX INFO: renamed from: b */
            public int f4015b;

            /* JADX INFO: renamed from: c */
            public int f4016c;

            /* JADX INFO: renamed from: d */
            public int f4017d;

            @NonNull
            /* JADX INFO: renamed from: a */
            public c m5534a(@NonNull AbstractC1023f0 abstractC1023f0) {
                return m5535b(abstractC1023f0, 0);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public c m5535b(@NonNull AbstractC1023f0 abstractC1023f0, int i10) {
                View view = abstractC1023f0.f3981a;
                this.f4014a = view.getLeft();
                this.f4015b = view.getTop();
                this.f4016c = view.getRight();
                this.f4017d = view.getBottom();
                return this;
            }
        }

        /* JADX INFO: renamed from: e */
        public static int m5510e(AbstractC1023f0 abstractC1023f0) {
            int i10 = abstractC1023f0.f3990j;
            int i11 = i10 & 14;
            if (abstractC1023f0.m5452u()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int iM5446o = abstractC1023f0.m5446o();
                int iM5441j = abstractC1023f0.m5441j();
                if (iM5446o != -1 && iM5441j != -1 && iM5446o != iM5441j) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo5511a(@NonNull AbstractC1023f0 abstractC1023f0, c cVar, @NonNull c cVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo5512b(@NonNull AbstractC1023f0 abstractC1023f0, @NonNull AbstractC1023f0 abstractC1023f1, @NonNull c cVar, @NonNull c cVar2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo5513c(@NonNull AbstractC1023f0 abstractC1023f0, @NonNull c cVar, c cVar2);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo5514d(@NonNull AbstractC1023f0 abstractC1023f0, @NonNull c cVar, @NonNull c cVar2);

        /* JADX INFO: renamed from: f */
        public abstract boolean mo5515f(@NonNull AbstractC1023f0 abstractC1023f0);

        /* JADX INFO: renamed from: g */
        public boolean mo5516g(@NonNull AbstractC1023f0 abstractC1023f0, @NonNull List<Object> list) {
            return mo5515f(abstractC1023f0);
        }

        /* JADX INFO: renamed from: h */
        public final void m5517h(@NonNull AbstractC1023f0 abstractC1023f0) {
            m5527r(abstractC1023f0);
            b bVar = this.f4008a;
            if (bVar != null) {
                bVar.mo5533a(abstractC1023f0);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m5518i() {
            int size = this.f4009b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4009b.get(i10).m5532a();
            }
            this.f4009b.clear();
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo5519j(@NonNull AbstractC1023f0 abstractC1023f0);

        /* JADX INFO: renamed from: k */
        public abstract void mo5520k();

        /* JADX INFO: renamed from: l */
        public long m5521l() {
            return this.f4010c;
        }

        /* JADX INFO: renamed from: m */
        public long m5522m() {
            return this.f4013f;
        }

        /* JADX INFO: renamed from: n */
        public long m5523n() {
            return this.f4012e;
        }

        /* JADX INFO: renamed from: o */
        public long m5524o() {
            return this.f4011d;
        }

        /* JADX INFO: renamed from: p */
        public abstract boolean mo5525p();

        @NonNull
        /* JADX INFO: renamed from: q */
        public c m5526q() {
            return new c();
        }

        /* JADX INFO: renamed from: r */
        public void m5527r(@NonNull AbstractC1023f0 abstractC1023f0) {
        }

        @NonNull
        /* JADX INFO: renamed from: s */
        public c m5528s(@NonNull C1015b0 c1015b0, @NonNull AbstractC1023f0 abstractC1023f0) {
            return m5526q().m5534a(abstractC1023f0);
        }

        @NonNull
        /* JADX INFO: renamed from: t */
        public c m5529t(@NonNull C1015b0 c1015b0, @NonNull AbstractC1023f0 abstractC1023f0, int i10, @NonNull List<Object> list) {
            return m5526q().m5534a(abstractC1023f0);
        }

        /* JADX INFO: renamed from: u */
        public abstract void mo5530u();

        /* JADX INFO: renamed from: v */
        public void m5531v(b bVar) {
            this.f4008a = bVar;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public class C1032o implements AbstractC1031n.b {
        public C1032o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n.b
        /* JADX INFO: renamed from: a */
        public void mo5533a(AbstractC1023f0 abstractC1023f0) {
            abstractC1023f0.m5426H(true);
            if (abstractC1023f0.f3988h != null && abstractC1023f0.f3989i == null) {
                abstractC1023f0.f3988h = null;
            }
            abstractC1023f0.f3989i = null;
            if (abstractC1023f0.m5428J() || RecyclerView.this.m5313h1(abstractC1023f0.f3981a) || !abstractC1023f0.m5456y()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC1023f0.f3981a, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC1033p {
        @Deprecated
        /* JADX INFO: renamed from: d */
        public void m5536d(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* JADX INFO: renamed from: e */
        public void mo5537e(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull C1015b0 c1015b0) {
            m5536d(rect, ((C1035r) view.getLayoutParams()).m5649b(), recyclerView);
        }

        @Deprecated
        /* JADX INFO: renamed from: f */
        public void m5538f(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: g */
        public void mo5539g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull C1015b0 c1015b0) {
            m5538f(canvas, recyclerView);
        }

        @Deprecated
        /* JADX INFO: renamed from: h */
        public void m5540h(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: i */
        public void mo5541i(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull C1015b0 c1015b0) {
            m5540h(canvas, recyclerView);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static abstract class AbstractC1034q {

        /* JADX INFO: renamed from: a */
        public C1054e f4019a;

        /* JADX INFO: renamed from: b */
        public RecyclerView f4020b;

        /* JADX INFO: renamed from: c */
        public final C1069t.b f4021c;

        /* JADX INFO: renamed from: d */
        public final C1069t.b f4022d;

        /* JADX INFO: renamed from: e */
        public C1069t f4023e;

        /* JADX INFO: renamed from: f */
        public C1069t f4024f;

        /* JADX INFO: renamed from: g */
        public AbstractC1013a0 f4025g;

        /* JADX INFO: renamed from: h */
        public boolean f4026h;

        /* JADX INFO: renamed from: i */
        public boolean f4027i;

        /* JADX INFO: renamed from: j */
        public boolean f4028j;

        /* JADX INFO: renamed from: k */
        public boolean f4029k;

        /* JADX INFO: renamed from: l */
        public boolean f4030l;

        /* JADX INFO: renamed from: m */
        public int f4031m;

        /* JADX INFO: renamed from: n */
        public boolean f4032n;

        /* JADX INFO: renamed from: o */
        public int f4033o;

        /* JADX INFO: renamed from: p */
        public int f4034p;

        /* JADX INFO: renamed from: q */
        public int f4035q;

        /* JADX INFO: renamed from: r */
        public int f4036r;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q$a */
        public class a implements C1069t.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: a */
            public View mo5642a(int i10) {
                return AbstractC1034q.this.m5573N(i10);
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: b */
            public int mo5643b(View view) {
                return AbstractC1034q.this.m5584V(view) - ((ViewGroup.MarginLayoutParams) ((C1035r) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: c */
            public int mo5644c() {
                return AbstractC1034q.this.m5606i0();
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: d */
            public int mo5645d() {
                return AbstractC1034q.this.m5627s0() - AbstractC1034q.this.m5608j0();
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: e */
            public int mo5646e(View view) {
                return AbstractC1034q.this.m5588Y(view) + ((ViewGroup.MarginLayoutParams) ((C1035r) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q$b */
        public class b implements C1069t.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: a */
            public View mo5642a(int i10) {
                return AbstractC1034q.this.m5573N(i10);
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: b */
            public int mo5643b(View view) {
                return AbstractC1034q.this.m5589Z(view) - ((ViewGroup.MarginLayoutParams) ((C1035r) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: c */
            public int mo5644c() {
                return AbstractC1034q.this.m5611k0();
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: d */
            public int mo5645d() {
                return AbstractC1034q.this.m5592b0() - AbstractC1034q.this.m5604h0();
            }

            @Override // androidx.recyclerview.widget.C1069t.b
            /* JADX INFO: renamed from: e */
            public int mo5646e(View view) {
                return AbstractC1034q.this.m5581T(view) + ((ViewGroup.MarginLayoutParams) ((C1035r) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q$c */
        public interface c {
            /* JADX INFO: renamed from: a */
            void mo5647a(int i10, int i11);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q$d */
        public static class d {

            /* JADX INFO: renamed from: a */
            public int f4039a;

            /* JADX INFO: renamed from: b */
            public int f4040b;

            /* JADX INFO: renamed from: c */
            public boolean f4041c;

            /* JADX INFO: renamed from: d */
            public boolean f4042d;
        }

        public AbstractC1034q() {
            a aVar = new a();
            this.f4021c = aVar;
            b bVar = new b();
            this.f4022d = bVar;
            this.f4023e = new C1069t(aVar);
            this.f4024f = new C1069t(bVar);
            this.f4026h = false;
            this.f4027i = false;
            this.f4028j = false;
            this.f4029k = true;
            this.f4030l = true;
        }

        /* JADX INFO: renamed from: B0 */
        public static boolean m5542B0(int i10, int i11, int i12) {
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
        /* JADX INFO: renamed from: P */
        public static int m5543P(int i10, int i11, int i12, int i13, boolean z10) {
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

        /* JADX INFO: renamed from: m0 */
        public static d m5544m0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12011c.f42557a, i10, i11);
            dVar.f4039a = typedArrayObtainStyledAttributes.getInt(C12011c.f42558b, 1);
            dVar.f4040b = typedArrayObtainStyledAttributes.getInt(C12011c.f42568l, 1);
            dVar.f4041c = typedArrayObtainStyledAttributes.getBoolean(C12011c.f42567k, false);
            dVar.f4042d = typedArrayObtainStyledAttributes.getBoolean(C12011c.f42569m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        /* JADX INFO: renamed from: s */
        public static int m5545s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        /* JADX INFO: renamed from: A */
        public int mo5072A(@NonNull C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: A0 */
        public boolean mo5146A0() {
            return false;
        }

        /* JADX INFO: renamed from: A1 */
        public final void m5546A1(C1041x c1041x, int i10, View view) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (abstractC1023f0M5232n0.m5429K()) {
                if (RecyclerView.f3846G0) {
                    Log.d("RecyclerView", "ignoring view " + abstractC1023f0M5232n0);
                    return;
                }
                return;
            }
            if (abstractC1023f0M5232n0.m5452u() && !abstractC1023f0M5232n0.m5454w() && !this.f4020b.f3907m.m5477i()) {
                m5634v1(i10);
                c1041x.m5682H(abstractC1023f0M5232n0);
            } else {
                m5548C(i10);
                c1041x.m5683I(view);
                this.f4020b.f3895g.m6079k(abstractC1023f0M5232n0);
            }
        }

        /* JADX INFO: renamed from: B */
        public void m5547B(@NonNull C1041x c1041x) {
            for (int iM5574O = m5574O() - 1; iM5574O >= 0; iM5574O--) {
                m5546A1(c1041x, iM5574O, m5573N(iM5574O));
            }
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: B1 */
        public int mo5073B1(int i10, C1041x c1041x, C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: C */
        public void m5548C(int i10) {
            m5550D(i10, m5573N(i10));
        }

        /* JADX INFO: renamed from: C0 */
        public boolean m5549C0() {
            AbstractC1013a0 abstractC1013a0 = this.f4025g;
            return abstractC1013a0 != null && abstractC1013a0.m5375h();
        }

        /* JADX INFO: renamed from: C1 */
        public void mo5149C1(int i10) {
            if (RecyclerView.f3846G0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m5550D(int i10, @NonNull View view) {
            this.f4019a.m5878d(i10);
        }

        /* JADX INFO: renamed from: D0 */
        public boolean m5551D0(@NonNull View view, boolean z10, boolean z11) {
            boolean z12 = this.f4023e.m6063b(view, 24579) && this.f4024f.m6063b(view, 24579);
            return z10 ? z12 : !z12;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: D1 */
        public int mo5074D1(int i10, C1041x c1041x, C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: E */
        public void m5552E(RecyclerView recyclerView) {
            this.f4027i = true;
            mo5569L0(recyclerView);
        }

        /* JADX INFO: renamed from: E0 */
        public void m5553E0(@NonNull View view, int i10, int i11, int i12, int i13) {
            C1035r c1035r = (C1035r) view.getLayoutParams();
            Rect rect = c1035r.f4044b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) c1035r).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) c1035r).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) c1035r).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin);
        }

        /* JADX INFO: renamed from: E1 */
        public void m5554E1(RecyclerView recyclerView) {
            m5557F1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* JADX INFO: renamed from: F */
        public void m5555F(RecyclerView recyclerView, C1041x c1041x) {
            this.f4027i = false;
            mo5162N0(recyclerView, c1041x);
        }

        /* JADX INFO: renamed from: F0 */
        public void mo5556F0(@NonNull View view, int i10, int i11) {
            C1035r c1035r = (C1035r) view.getLayoutParams();
            Rect rectM5343s0 = this.f4020b.m5343s0(view);
            int i12 = i10 + rectM5343s0.left + rectM5343s0.right;
            int i13 = i11 + rectM5343s0.top + rectM5343s0.bottom;
            int iM5543P = m5543P(m5627s0(), m5629t0(), m5606i0() + m5608j0() + ((ViewGroup.MarginLayoutParams) c1035r).leftMargin + ((ViewGroup.MarginLayoutParams) c1035r).rightMargin + i12, ((ViewGroup.MarginLayoutParams) c1035r).width, mo5191p());
            int iM5543P2 = m5543P(m5592b0(), m5593c0(), m5611k0() + m5604h0() + ((ViewGroup.MarginLayoutParams) c1035r).topMargin + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) c1035r).height, mo5193q());
            if (m5567K1(view, iM5543P, iM5543P2, c1035r)) {
                view.measure(iM5543P, iM5543P2);
            }
        }

        /* JADX INFO: renamed from: F1 */
        public void m5557F1(int i10, int i11) {
            this.f4035q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f4033o = mode;
            if (mode == 0 && !RecyclerView.f3850K0) {
                this.f4035q = 0;
            }
            this.f4036r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4034p = mode2;
            if (mode2 != 0 || RecyclerView.f3850K0) {
                return;
            }
            this.f4036r = 0;
        }

        /* JADX INFO: renamed from: G */
        public View m5558G(@NonNull View view) {
            View viewM5293X;
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView == null || (viewM5293X = recyclerView.m5293X(view)) == null || this.f4019a.m5888n(viewM5293X)) {
                return null;
            }
            return viewM5293X;
        }

        /* JADX INFO: renamed from: G0 */
        public void m5559G0(int i10, int i11) {
            View viewM5573N = m5573N(i10);
            if (viewM5573N != null) {
                m5548C(i10);
                m5614m(viewM5573N, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f4020b.toString());
            }
        }

        /* JADX INFO: renamed from: G1 */
        public void m5560G1(int i10, int i11) {
            this.f4020b.setMeasuredDimension(i10, i11);
        }

        /* JADX INFO: renamed from: H */
        public View mo5154H(int i10) {
            int iM5574O = m5574O();
            for (int i11 = 0; i11 < iM5574O; i11++) {
                View viewM5573N = m5573N(i11);
                AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(viewM5573N);
                if (abstractC1023f0M5232n0 != null && abstractC1023f0M5232n0.m5445n() == i10 && !abstractC1023f0M5232n0.m5429K() && (this.f4020b.f3902j0.m5395e() || !abstractC1023f0M5232n0.m5454w())) {
                    return viewM5573N;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: H0 */
        public void mo5561H0(int i10) {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                recyclerView.m5263J0(i10);
            }
        }

        /* JADX INFO: renamed from: H1 */
        public void mo5076H1(Rect rect, int i10, int i11) {
            m5560G1(m5545s(i10, rect.width() + m5606i0() + m5608j0(), m5601g0()), m5545s(i11, rect.height() + m5611k0() + m5604h0(), m5598f0()));
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: I */
        public abstract C1035r mo5077I();

        /* JADX INFO: renamed from: I0 */
        public void mo5562I0(int i10) {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                recyclerView.m5266K0(i10);
            }
        }

        /* JADX INFO: renamed from: I1 */
        public void m5563I1(int i10, int i11) {
            int iM5574O = m5574O();
            if (iM5574O == 0) {
                this.f4020b.m5242C(i10, i11);
                return;
            }
            int i12 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iM5574O; i16++) {
                View viewM5573N = m5573N(i16);
                Rect rect = this.f4020b.f3901j;
                mo5583U(viewM5573N, rect);
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
            this.f4020b.f3901j.set(i15, i13, i12, i14);
            mo5076H1(this.f4020b.f3901j, i10, i11);
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: J */
        public C1035r mo5078J(Context context, AttributeSet attributeSet) {
            return new C1035r(context, attributeSet);
        }

        /* JADX INFO: renamed from: J0 */
        public void mo5564J0(AbstractC1025h abstractC1025h, AbstractC1025h abstractC1025h2) {
        }

        /* JADX INFO: renamed from: J1 */
        public void m5565J1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4020b = null;
                this.f4019a = null;
                this.f4035q = 0;
                this.f4036r = 0;
            } else {
                this.f4020b = recyclerView;
                this.f4019a = recyclerView.f3893f;
                this.f4035q = recyclerView.getWidth();
                this.f4036r = recyclerView.getHeight();
            }
            this.f4033o = 1073741824;
            this.f4034p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: K */
        public C1035r mo5079K(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C1035r) {
                return new C1035r((C1035r) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1035r((ViewGroup.MarginLayoutParams) layoutParams) : new C1035r(layoutParams);
        }

        /* JADX INFO: renamed from: K0 */
        public boolean m5566K0(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        /* JADX INFO: renamed from: K1 */
        public boolean m5567K1(View view, int i10, int i11, C1035r c1035r) {
            return (!view.isLayoutRequested() && this.f4029k && m5542B0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) c1035r).width) && m5542B0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) c1035r).height)) ? false : true;
        }

        /* JADX INFO: renamed from: L */
        public int m5568L() {
            return -1;
        }

        /* JADX INFO: renamed from: L0 */
        public void mo5569L0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: L1 */
        public boolean mo5159L1() {
            return false;
        }

        /* JADX INFO: renamed from: M */
        public int m5570M(@NonNull View view) {
            return ((C1035r) view.getLayoutParams()).f4044b.bottom;
        }

        @Deprecated
        /* JADX INFO: renamed from: M0 */
        public void m5571M0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: M1 */
        public boolean m5572M1(View view, int i10, int i11, C1035r c1035r) {
            return (this.f4029k && m5542B0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) c1035r).width) && m5542B0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) c1035r).height)) ? false : true;
        }

        /* JADX INFO: renamed from: N */
        public View m5573N(int i10) {
            C1054e c1054e = this.f4019a;
            if (c1054e != null) {
                return c1054e.m5880f(i10);
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: N0 */
        public void mo5162N0(RecyclerView recyclerView, C1041x c1041x) {
            m5571M0(recyclerView);
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: N1 */
        public void mo5163N1(RecyclerView recyclerView, C1015b0 c1015b0, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* JADX INFO: renamed from: O */
        public int m5574O() {
            C1054e c1054e = this.f4019a;
            if (c1054e != null) {
                return c1054e.m5881g();
            }
            return 0;
        }

        /* JADX INFO: renamed from: O0 */
        public View mo5080O0(@NonNull View view, int i10, @NonNull C1041x c1041x, @NonNull C1015b0 c1015b0) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: O1 */
        public void m5575O1(AbstractC1013a0 abstractC1013a0) {
            AbstractC1013a0 abstractC1013a1 = this.f4025g;
            if (abstractC1013a1 != null && abstractC1013a0 != abstractC1013a1 && abstractC1013a1.m5375h()) {
                this.f4025g.m5385r();
            }
            this.f4025g = abstractC1013a0;
            abstractC1013a0.m5384q(this.f4020b, this);
        }

        /* JADX INFO: renamed from: P0 */
        public void mo5166P0(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4020b;
            m5578Q0(recyclerView.f3887c, recyclerView.f3902j0, accessibilityEvent);
        }

        /* JADX INFO: renamed from: P1 */
        public void m5576P1() {
            AbstractC1013a0 abstractC1013a0 = this.f4025g;
            if (abstractC1013a0 != null) {
                abstractC1013a0.m5385r();
            }
        }

        /* JADX INFO: renamed from: Q */
        public final int[] m5577Q(View view, Rect rect) {
            int iM5606i0 = m5606i0();
            int iM5611k0 = m5611k0();
            int iM5627s0 = m5627s0() - m5608j0();
            int iM5592b0 = m5592b0() - m5604h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iM5606i0;
            int iMin = Math.min(0, i10);
            int i11 = top - iM5611k0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iM5627s0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iM5592b0);
            if (m5594d0() != 1) {
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

        /* JADX INFO: renamed from: Q0 */
        public void m5578Q0(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4020b.canScrollVertically(-1) && !this.f4020b.canScrollHorizontally(-1) && !this.f4020b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            AbstractC1025h abstractC1025h = this.f4020b.f3907m;
            if (abstractC1025h != null) {
                accessibilityEvent.setItemCount(abstractC1025h.mo5473e());
            }
        }

        /* JADX INFO: renamed from: Q1 */
        public boolean mo5082Q1() {
            return false;
        }

        /* JADX INFO: renamed from: R */
        public boolean m5579R() {
            RecyclerView recyclerView = this.f4020b;
            return recyclerView != null && recyclerView.f3897h;
        }

        /* JADX INFO: renamed from: R0 */
        public void mo5084R0(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0, @NonNull C13017p c13017p) {
            if (this.f4020b.canScrollVertically(-1) || this.f4020b.canScrollHorizontally(-1)) {
                c13017p.m48387a(8192);
                c13017p.m48362G0(true);
                c13017p.m48426v0(true);
            }
            if (this.f4020b.canScrollVertically(1) || this.f4020b.canScrollHorizontally(1)) {
                c13017p.m48387a(4096);
                c13017p.m48362G0(true);
                c13017p.m48426v0(true);
            }
            c13017p.m48412n0(C13017p.f.m48453b(mo5119o0(c1041x, c1015b0), mo5086S(c1041x, c1015b0), m5640z0(c1041x, c1015b0), m5621p0(c1041x, c1015b0)));
        }

        /* JADX INFO: renamed from: S */
        public int mo5086S(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0) {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView == null || recyclerView.f3907m == null || !mo5191p()) {
                return 1;
            }
            return this.f4020b.f3907m.mo5473e();
        }

        /* JADX INFO: renamed from: S0 */
        public void m5580S0(C13017p c13017p) {
            RecyclerView recyclerView = this.f4020b;
            mo5084R0(recyclerView.f3887c, recyclerView.f3902j0, c13017p);
        }

        /* JADX INFO: renamed from: T */
        public int m5581T(@NonNull View view) {
            return view.getBottom() + m5570M(view);
        }

        /* JADX INFO: renamed from: T0 */
        public void m5582T0(View view, C13017p c13017p) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (abstractC1023f0M5232n0 == null || abstractC1023f0M5232n0.m5454w() || this.f4019a.m5888n(abstractC1023f0M5232n0.f3981a)) {
                return;
            }
            RecyclerView recyclerView = this.f4020b;
            mo5089U0(recyclerView.f3887c, recyclerView.f3902j0, view, c13017p);
        }

        /* JADX INFO: renamed from: U */
        public void mo5583U(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.m5233p0(view, rect);
        }

        /* JADX INFO: renamed from: U0 */
        public void mo5089U0(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0, @NonNull View view, @NonNull C13017p c13017p) {
            c13017p.m48414o0(C13017p.g.m48455b(mo5193q() ? m5613l0(view) : 0, 1, mo5191p() ? m5613l0(view) : 0, 1, false, false));
        }

        /* JADX INFO: renamed from: V */
        public int m5584V(@NonNull View view) {
            return view.getLeft() - m5596e0(view);
        }

        /* JADX INFO: renamed from: V0 */
        public View m5585V0(@NonNull View view, int i10) {
            return null;
        }

        /* JADX INFO: renamed from: W */
        public int m5586W(@NonNull View view) {
            Rect rect = ((C1035r) view.getLayoutParams()).f4044b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* JADX INFO: renamed from: W0 */
        public void mo5092W0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        /* JADX INFO: renamed from: X */
        public int m5587X(@NonNull View view) {
            Rect rect = ((C1035r) view.getLayoutParams()).f4044b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* JADX INFO: renamed from: X0 */
        public void mo5094X0(@NonNull RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: Y */
        public int m5588Y(@NonNull View view) {
            return view.getRight() + m5617n0(view);
        }

        /* JADX INFO: renamed from: Y0 */
        public void mo5096Y0(@NonNull RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        /* JADX INFO: renamed from: Z */
        public int m5589Z(@NonNull View view) {
            return view.getTop() - m5623q0(view);
        }

        /* JADX INFO: renamed from: Z0 */
        public void mo5098Z0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        /* JADX INFO: renamed from: a0 */
        public View m5590a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4019a.m5888n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX INFO: renamed from: a1 */
        public void m5591a1(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        /* JADX INFO: renamed from: b0 */
        public int m5592b0() {
            return this.f4036r;
        }

        /* JADX INFO: renamed from: b1 */
        public void mo5101b1(@NonNull RecyclerView recyclerView, int i10, int i11, Object obj) {
            m5591a1(recyclerView, i10, i11);
        }

        /* JADX INFO: renamed from: c0 */
        public int m5593c0() {
            return this.f4034p;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: c1 */
        public void mo5103c1(C1041x c1041x, C1015b0 c1015b0) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* JADX INFO: renamed from: d0 */
        public int m5594d0() {
            return this.f4020b.getLayoutDirection();
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: d1 */
        public void mo5105d1(C1015b0 c1015b0) {
        }

        /* JADX INFO: renamed from: e */
        public int m5595e() {
            RecyclerView recyclerView = this.f4020b;
            AbstractC1025h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo5473e();
            }
            return 0;
        }

        /* JADX INFO: renamed from: e0 */
        public int m5596e0(@NonNull View view) {
            return ((C1035r) view.getLayoutParams()).f4044b.left;
        }

        /* JADX INFO: renamed from: e1 */
        public void m5597e1(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0, int i10, int i11) {
            this.f4020b.m5242C(i10, i11);
        }

        /* JADX INFO: renamed from: f0 */
        public int m5598f0() {
            return C0625o0.m2978A(this.f4020b);
        }

        @Deprecated
        /* JADX INFO: renamed from: f1 */
        public boolean m5599f1(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
            return m5549C0() || recyclerView.m5246D0();
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: g */
        public void m5600g(View view) {
            m5603h(view, -1);
        }

        /* JADX INFO: renamed from: g0 */
        public int m5601g0() {
            return C0625o0.m2980B(this.f4020b);
        }

        /* JADX INFO: renamed from: g1 */
        public boolean m5602g1(@NonNull RecyclerView recyclerView, @NonNull C1015b0 c1015b0, @NonNull View view, View view2) {
            return m5599f1(recyclerView, view, view2);
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: h */
        public void m5603h(View view, int i10) {
            m5610k(view, i10, true);
        }

        /* JADX INFO: renamed from: h0 */
        public int m5604h0() {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: h1 */
        public void mo5183h1(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: i */
        public void m5605i(View view) {
            m5607j(view, -1);
        }

        /* JADX INFO: renamed from: i0 */
        public int m5606i0() {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* JADX INFO: renamed from: i1 */
        public Parcelable mo5185i1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: j */
        public void m5607j(View view, int i10) {
            m5610k(view, i10, false);
        }

        /* JADX INFO: renamed from: j0 */
        public int m5608j0() {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* JADX INFO: renamed from: j1 */
        public void mo5609j1(int i10) {
        }

        /* JADX INFO: renamed from: k */
        public final void m5610k(View view, int i10, boolean z10) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (z10 || abstractC1023f0M5232n0.m5454w()) {
                this.f4020b.f3895g.m6070b(abstractC1023f0M5232n0);
            } else {
                this.f4020b.f3895g.m6084p(abstractC1023f0M5232n0);
            }
            C1035r c1035r = (C1035r) view.getLayoutParams();
            if (abstractC1023f0M5232n0.m5431M() || abstractC1023f0M5232n0.m5455x()) {
                if (abstractC1023f0M5232n0.m5455x()) {
                    abstractC1023f0M5232n0.m5430L();
                } else {
                    abstractC1023f0M5232n0.m5436e();
                }
                this.f4019a.m5877c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4020b) {
                int iM5887m = this.f4019a.m5887m(view);
                if (i10 == -1) {
                    i10 = this.f4019a.m5881g();
                }
                if (iM5887m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4020b.indexOfChild(view) + this.f4020b.m5289V());
                }
                if (iM5887m != i10) {
                    this.f4020b.f3909n.m5559G0(iM5887m, i10);
                }
            } else {
                this.f4019a.m5875a(view, i10, false);
                c1035r.f4045c = true;
                AbstractC1013a0 abstractC1013a0 = this.f4025g;
                if (abstractC1013a0 != null && abstractC1013a0.m5375h()) {
                    this.f4025g.m5378k(view);
                }
            }
            if (c1035r.f4046d) {
                if (RecyclerView.f3846G0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + c1035r.f4043a);
                }
                abstractC1023f0M5232n0.f3981a.invalidate();
                c1035r.f4046d = false;
            }
        }

        /* JADX INFO: renamed from: k0 */
        public int m5611k0() {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: renamed from: k1 */
        public void m5612k1(AbstractC1013a0 abstractC1013a0) {
            if (this.f4025g == abstractC1013a0) {
                this.f4025g = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: l */
        public void mo5188l(String str) {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                recyclerView.m5339r(str);
            }
        }

        /* JADX INFO: renamed from: l0 */
        public int m5613l0(@NonNull View view) {
            return ((C1035r) view.getLayoutParams()).m5649b();
        }

        /* JADX INFO: renamed from: l1 */
        public boolean mo5115l1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4020b;
            return mo5615m1(recyclerView.f3887c, recyclerView.f3902j0, i10, bundle);
        }

        /* JADX INFO: renamed from: m */
        public void m5614m(@NonNull View view, int i10) {
            m5616n(view, i10, (C1035r) view.getLayoutParams());
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0065 A[PHI: r11
          0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: m1 */
        public boolean mo5615m1(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0, int i10, Bundle bundle) {
            int iM5611k0;
            int iM5606i0;
            float f10;
            if (this.f4020b == null) {
                return false;
            }
            int iM5592b0 = m5592b0();
            int iM5627s0 = m5627s0();
            Rect rect = new Rect();
            if (this.f4020b.getMatrix().isIdentity() && this.f4020b.getGlobalVisibleRect(rect)) {
                iM5592b0 = rect.height();
                iM5627s0 = rect.width();
            }
            if (i10 == 4096) {
                iM5611k0 = this.f4020b.canScrollVertically(1) ? (iM5592b0 - m5611k0()) - m5604h0() : 0;
                if (this.f4020b.canScrollHorizontally(1)) {
                    iM5606i0 = (iM5627s0 - m5606i0()) - m5608j0();
                } else {
                    iM5606i0 = 0;
                }
            } else if (i10 != 8192) {
                iM5611k0 = 0;
                iM5606i0 = 0;
            } else {
                iM5611k0 = this.f4020b.canScrollVertically(-1) ? -((iM5592b0 - m5611k0()) - m5604h0()) : 0;
                if (this.f4020b.canScrollHorizontally(-1)) {
                    iM5606i0 = -((iM5627s0 - m5606i0()) - m5608j0());
                } else {
                    iM5606i0 = 0;
                }
            }
            if (iM5611k0 == 0 && iM5606i0 == 0) {
                return false;
            }
            if (bundle != null) {
                f10 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f10 < 0.0f) {
                    if (!RecyclerView.f3845F0) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f10 + ")");
                }
            } else {
                f10 = 1.0f;
            }
            if (Float.compare(f10, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f10) != 0 && Float.compare(0.0f, f10) != 0) {
                    iM5606i0 = (int) (iM5606i0 * f10);
                    iM5611k0 = (int) (iM5611k0 * f10);
                }
                this.f4020b.m5241B1(iM5606i0, iM5611k0, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII, true);
                return true;
            }
            RecyclerView recyclerView = this.f4020b;
            AbstractC1025h abstractC1025h = recyclerView.f3907m;
            if (abstractC1025h == null) {
                return false;
            }
            if (i10 == 4096) {
                recyclerView.m5244C1(abstractC1025h.mo5473e() - 1);
            } else if (i10 == 8192) {
                recyclerView.m5244C1(0);
            }
            return true;
        }

        /* JADX INFO: renamed from: n */
        public void m5616n(@NonNull View view, int i10, C1035r c1035r) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (abstractC1023f0M5232n0.m5454w()) {
                this.f4020b.f3895g.m6070b(abstractC1023f0M5232n0);
            } else {
                this.f4020b.f3895g.m6084p(abstractC1023f0M5232n0);
            }
            this.f4019a.m5877c(view, i10, c1035r, abstractC1023f0M5232n0.m5454w());
        }

        /* JADX INFO: renamed from: n0 */
        public int m5617n0(@NonNull View view) {
            return ((C1035r) view.getLayoutParams()).f4044b.right;
        }

        /* JADX INFO: renamed from: n1 */
        public boolean m5618n1(@NonNull View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4020b;
            return m5620o1(recyclerView.f3887c, recyclerView.f3902j0, view, i10, bundle);
        }

        /* JADX INFO: renamed from: o */
        public void m5619o(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m5343s0(view));
            }
        }

        /* JADX INFO: renamed from: o0 */
        public int mo5119o0(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0) {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView == null || recyclerView.f3907m == null || !mo5193q()) {
                return 1;
            }
            return this.f4020b.f3907m.mo5473e();
        }

        /* JADX INFO: renamed from: o1 */
        public boolean m5620o1(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0, @NonNull View view, int i10, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo5191p() {
            return false;
        }

        /* JADX INFO: renamed from: p0 */
        public int m5621p0(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: p1 */
        public void m5622p1(@NonNull C1041x c1041x) {
            for (int iM5574O = m5574O() - 1; iM5574O >= 0; iM5574O--) {
                if (!RecyclerView.m5232n0(m5573N(iM5574O)).m5429K()) {
                    m5628s1(iM5574O, c1041x);
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public boolean mo5193q() {
            return false;
        }

        /* JADX INFO: renamed from: q0 */
        public int m5623q0(@NonNull View view) {
            return ((C1035r) view.getLayoutParams()).f4044b.top;
        }

        /* JADX INFO: renamed from: q1 */
        public void m5624q1(C1041x c1041x) {
            int iM5702j = c1041x.m5702j();
            for (int i10 = iM5702j - 1; i10 >= 0; i10--) {
                View viewM5706n = c1041x.m5706n(i10);
                AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(viewM5706n);
                if (!abstractC1023f0M5232n0.m5429K()) {
                    abstractC1023f0M5232n0.m5426H(false);
                    if (abstractC1023f0M5232n0.m5456y()) {
                        this.f4020b.removeDetachedView(viewM5706n, false);
                    }
                    AbstractC1031n abstractC1031n = this.f4020b.f3874O;
                    if (abstractC1031n != null) {
                        abstractC1031n.mo5519j(abstractC1023f0M5232n0);
                    }
                    abstractC1023f0M5232n0.m5426H(true);
                    c1041x.m5678D(viewM5706n);
                }
            }
            c1041x.m5697e();
            if (iM5702j > 0) {
                this.f4020b.invalidate();
            }
        }

        /* JADX INFO: renamed from: r */
        public boolean mo5123r(C1035r c1035r) {
            return c1035r != null;
        }

        /* JADX INFO: renamed from: r0 */
        public void m5625r0(@NonNull View view, boolean z10, @NonNull Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((C1035r) view.getLayoutParams()).f4044b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4020b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4020b.f3905l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX INFO: renamed from: r1 */
        public void m5626r1(@NonNull View view, @NonNull C1041x c1041x) {
            m5632u1(view);
            c1041x.m5681G(view);
        }

        /* JADX INFO: renamed from: s0 */
        public int m5627s0() {
            return this.f4035q;
        }

        /* JADX INFO: renamed from: s1 */
        public void m5628s1(int i10, @NonNull C1041x c1041x) {
            View viewM5573N = m5573N(i10);
            m5634v1(i10);
            c1041x.m5681G(viewM5573N);
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: t */
        public void mo5197t(int i10, int i11, C1015b0 c1015b0, c cVar) {
        }

        /* JADX INFO: renamed from: t0 */
        public int m5629t0() {
            return this.f4033o;
        }

        /* JADX INFO: renamed from: t1 */
        public boolean m5630t1(Runnable runnable) {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: u */
        public void mo5198u(int i10, c cVar) {
        }

        /* JADX INFO: renamed from: u0 */
        public boolean m5631u0() {
            int iM5574O = m5574O();
            for (int i10 = 0; i10 < iM5574O; i10++) {
                ViewGroup.LayoutParams layoutParams = m5573N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: u1 */
        public void m5632u1(View view) {
            this.f4019a.m5890p(view);
        }

        /* JADX INFO: renamed from: v */
        public int mo5200v(@NonNull C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: v0 */
        public boolean m5633v0() {
            return this.f4027i;
        }

        /* JADX INFO: renamed from: v1 */
        public void m5634v1(int i10) {
            if (m5573N(i10) != null) {
                this.f4019a.m5891q(i10);
            }
        }

        /* JADX INFO: renamed from: w */
        public int mo5130w(@NonNull C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: w0 */
        public boolean mo5201w0() {
            return this.f4028j;
        }

        /* JADX INFO: renamed from: w1 */
        public boolean m5635w1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10) {
            return mo5637x1(recyclerView, view, rect, z10, false);
        }

        /* JADX INFO: renamed from: x */
        public int mo5131x(@NonNull C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: x0 */
        public final boolean m5636x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iM5606i0 = m5606i0();
            int iM5611k0 = m5611k0();
            int iM5627s0 = m5627s0() - m5608j0();
            int iM5592b0 = m5592b0() - m5604h0();
            Rect rect = this.f4020b.f3901j;
            mo5583U(focusedChild, rect);
            return rect.left - i10 < iM5627s0 && rect.right - i10 > iM5606i0 && rect.top - i11 < iM5592b0 && rect.bottom - i11 > iM5611k0;
        }

        /* JADX INFO: renamed from: x1 */
        public boolean mo5637x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            int[] iArrM5577Q = m5577Q(view, rect);
            int i10 = iArrM5577Q[0];
            int i11 = iArrM5577Q[1];
            if ((z11 && !m5636x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.m5360y1(i10, i11);
            }
            return true;
        }

        /* JADX INFO: renamed from: y */
        public int mo5204y(@NonNull C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: y0 */
        public final boolean m5638y0() {
            return this.f4030l;
        }

        /* JADX INFO: renamed from: y1 */
        public void m5639y1() {
            RecyclerView recyclerView = this.f4020b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* JADX INFO: renamed from: z */
        public int mo5132z(@NonNull C1015b0 c1015b0) {
            return 0;
        }

        /* JADX INFO: renamed from: z0 */
        public boolean m5640z0(@NonNull C1041x c1041x, @NonNull C1015b0 c1015b0) {
            return false;
        }

        /* JADX INFO: renamed from: z1 */
        public void m5641z1() {
            this.f4026h = true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface InterfaceC1036s {
        /* JADX INFO: renamed from: a */
        void mo5653a(@NonNull View view);

        /* JADX INFO: renamed from: b */
        void mo5654b(@NonNull View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC1037t {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo5655a(int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public interface InterfaceC1038u {
        /* JADX INFO: renamed from: a */
        void mo5656a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        /* JADX INFO: renamed from: b */
        boolean mo5657b(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        void mo5658c(boolean z10);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static abstract class AbstractC1039v {
        /* JADX INFO: renamed from: a */
        public void mo5659a(@NonNull RecyclerView recyclerView, int i10) {
        }

        /* JADX INFO: renamed from: b */
        public void mo5660b(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static class C1040w {

        /* JADX INFO: renamed from: a */
        public SparseArray<a> f4047a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f4048b = 0;

        /* JADX INFO: renamed from: c */
        public Set<AbstractC1025h<?>> f4049c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ArrayList<AbstractC1023f0> f4050a = new ArrayList<>();

            /* JADX INFO: renamed from: b */
            public int f4051b = 5;

            /* JADX INFO: renamed from: c */
            public long f4052c = 0;

            /* JADX INFO: renamed from: d */
            public long f4053d = 0;
        }

        /* JADX INFO: renamed from: a */
        public void m5661a() {
            this.f4048b++;
        }

        /* JADX INFO: renamed from: b */
        public void m5662b(@NonNull AbstractC1025h<?> abstractC1025h) {
            this.f4049c.add(abstractC1025h);
        }

        /* JADX INFO: renamed from: c */
        public void m5663c() {
            for (int i10 = 0; i10 < this.f4047a.size(); i10++) {
                a aVarValueAt = this.f4047a.valueAt(i10);
                ArrayList<AbstractC1023f0> arrayList = aVarValueAt.f4050a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    AbstractC1023f0 abstractC1023f0 = arrayList.get(i11);
                    i11++;
                    C10427a.m40135a(abstractC1023f0.f3981a);
                }
                aVarValueAt.f4050a.clear();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m5664d() {
            this.f4048b--;
        }

        /* JADX INFO: renamed from: e */
        public void m5665e(@NonNull AbstractC1025h<?> abstractC1025h, boolean z10) {
            this.f4049c.remove(abstractC1025h);
            if (this.f4049c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f4047a.size(); i10++) {
                SparseArray<a> sparseArray = this.f4047a;
                ArrayList<AbstractC1023f0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f4050a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    C10427a.m40135a(arrayList.get(i11).f3981a);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m5666f(int i10, long j10) {
            a aVarM5669i = m5669i(i10);
            aVarM5669i.f4053d = m5672l(aVarM5669i.f4053d, j10);
        }

        /* JADX INFO: renamed from: g */
        public void m5667g(int i10, long j10) {
            a aVarM5669i = m5669i(i10);
            aVarM5669i.f4052c = m5672l(aVarM5669i.f4052c, j10);
        }

        /* JADX INFO: renamed from: h */
        public AbstractC1023f0 m5668h(int i10) {
            a aVar = this.f4047a.get(i10);
            if (aVar == null || aVar.f4050a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC1023f0> arrayList = aVar.f4050a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).m5450s()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public final a m5669i(int i10) {
            a aVar = this.f4047a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f4047a.put(i10, aVar2);
            return aVar2;
        }

        /* JADX INFO: renamed from: j */
        public void m5670j(AbstractC1025h<?> abstractC1025h, AbstractC1025h<?> abstractC1025h2, boolean z10) {
            if (abstractC1025h != null) {
                m5664d();
            }
            if (!z10 && this.f4048b == 0) {
                m5663c();
            }
            if (abstractC1025h2 != null) {
                m5661a();
            }
        }

        /* JADX INFO: renamed from: k */
        public void m5671k(AbstractC1023f0 abstractC1023f0) {
            int iM5444m = abstractC1023f0.m5444m();
            ArrayList<AbstractC1023f0> arrayList = m5669i(iM5444m).f4050a;
            if (this.f4047a.get(iM5444m).f4051b <= arrayList.size()) {
                C10427a.m40135a(abstractC1023f0.f3981a);
            } else {
                if (RecyclerView.f3845F0 && arrayList.contains(abstractC1023f0)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                abstractC1023f0.m5423E();
                arrayList.add(abstractC1023f0);
            }
        }

        /* JADX INFO: renamed from: l */
        public long m5672l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        /* JADX INFO: renamed from: m */
        public boolean m5673m(int i10, long j10, long j11) {
            long j12 = m5669i(i10).f4053d;
            return j12 == 0 || j10 + j12 < j11;
        }

        /* JADX INFO: renamed from: n */
        public boolean m5674n(int i10, long j10, long j11) {
            long j12 = m5669i(i10).f4052c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public final class C1041x {

        /* JADX INFO: renamed from: a */
        public final ArrayList<AbstractC1023f0> f4054a;

        /* JADX INFO: renamed from: b */
        public ArrayList<AbstractC1023f0> f4055b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<AbstractC1023f0> f4056c;

        /* JADX INFO: renamed from: d */
        public final List<AbstractC1023f0> f4057d;

        /* JADX INFO: renamed from: e */
        public int f4058e;

        /* JADX INFO: renamed from: f */
        public int f4059f;

        /* JADX INFO: renamed from: g */
        public C1040w f4060g;

        public C1041x() {
            ArrayList<AbstractC1023f0> arrayList = new ArrayList<>();
            this.f4054a = arrayList;
            this.f4055b = null;
            this.f4056c = new ArrayList<>();
            this.f4057d = Collections.unmodifiableList(arrayList);
            this.f4058e = 2;
            this.f4059f = 2;
        }

        /* JADX INFO: renamed from: A */
        public void m5675A() {
            for (int i10 = 0; i10 < this.f4056c.size(); i10++) {
                C10427a.m40135a(this.f4056c.get(i10).f3981a);
            }
            m5676B(RecyclerView.this.f3907m);
        }

        /* JADX INFO: renamed from: B */
        public final void m5676B(AbstractC1025h<?> abstractC1025h) {
            m5677C(abstractC1025h, false);
        }

        /* JADX INFO: renamed from: C */
        public final void m5677C(AbstractC1025h<?> abstractC1025h, boolean z10) {
            C1040w c1040w = this.f4060g;
            if (c1040w != null) {
                c1040w.m5665e(abstractC1025h, z10);
            }
        }

        /* JADX INFO: renamed from: D */
        public void m5678D(View view) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            abstractC1023f0M5232n0.f3994n = null;
            abstractC1023f0M5232n0.f3995o = false;
            abstractC1023f0M5232n0.m5436e();
            m5682H(abstractC1023f0M5232n0);
        }

        /* JADX INFO: renamed from: E */
        public void m5679E() {
            for (int size = this.f4056c.size() - 1; size >= 0; size--) {
                m5680F(size);
            }
            this.f4056c.clear();
            if (RecyclerView.f3851L0) {
                RecyclerView.this.f3900i0.m5980b();
            }
        }

        /* JADX INFO: renamed from: F */
        public void m5680F(int i10) {
            if (RecyclerView.f3846G0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            AbstractC1023f0 abstractC1023f0 = this.f4056c.get(i10);
            if (RecyclerView.f3846G0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC1023f0);
            }
            m5693a(abstractC1023f0, true);
            this.f4056c.remove(i10);
        }

        /* JADX INFO: renamed from: G */
        public void m5681G(@NonNull View view) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (abstractC1023f0M5232n0.m5456y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (abstractC1023f0M5232n0.m5455x()) {
                abstractC1023f0M5232n0.m5430L();
            } else if (abstractC1023f0M5232n0.m5431M()) {
                abstractC1023f0M5232n0.m5436e();
            }
            m5682H(abstractC1023f0M5232n0);
            if (RecyclerView.this.f3874O == null || abstractC1023f0M5232n0.m5453v()) {
                return;
            }
            RecyclerView.this.f3874O.mo5519j(abstractC1023f0M5232n0);
        }

        /* JADX INFO: renamed from: H */
        public void m5682H(AbstractC1023f0 abstractC1023f0) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (abstractC1023f0.m5455x() || abstractC1023f0.f3981a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(abstractC1023f0.m5455x());
                sb2.append(" isAttached:");
                sb2.append(abstractC1023f0.f3981a.getParent() != null);
                sb2.append(RecyclerView.this.m5289V());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (abstractC1023f0.m5456y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC1023f0 + RecyclerView.this.m5289V());
            }
            if (abstractC1023f0.m5429K()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m5289V());
            }
            boolean zM5439h = abstractC1023f0.m5439h();
            AbstractC1025h abstractC1025h = RecyclerView.this.f3907m;
            boolean z13 = abstractC1025h != null && zM5439h && abstractC1025h.m5490v(abstractC1023f0);
            if (RecyclerView.f3845F0 && this.f4056c.contains(abstractC1023f0)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + abstractC1023f0 + RecyclerView.this.m5289V());
            }
            if (z13 || abstractC1023f0.m5453v()) {
                if (this.f4059f <= 0 || abstractC1023f0.m5448q(526)) {
                    z10 = false;
                } else {
                    int size = this.f4056c.size();
                    if (size >= this.f4059f && size > 0) {
                        m5680F(0);
                        size--;
                    }
                    if (RecyclerView.f3851L0 && size > 0 && !RecyclerView.this.f3900i0.m5982d(abstractC1023f0.f3983c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f3900i0.m5982d(this.f4056c.get(i10).f3983c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f4056c.add(size, abstractC1023f0);
                    z10 = true;
                }
                if (z10) {
                    z12 = false;
                } else {
                    m5693a(abstractC1023f0, true);
                }
                z11 = z10;
            } else {
                if (RecyclerView.f3846G0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.m5289V());
                }
                z12 = false;
            }
            RecyclerView.this.f3895g.m6085q(abstractC1023f0);
            if (z11 || z12 || !zM5439h) {
                return;
            }
            C10427a.m40135a(abstractC1023f0.f3981a);
            abstractC1023f0.f3999s = null;
            abstractC1023f0.f3998r = null;
        }

        /* JADX INFO: renamed from: I */
        public void m5683I(View view) {
            AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(view);
            if (!abstractC1023f0M5232n0.m5448q(12) && abstractC1023f0M5232n0.m5457z() && !RecyclerView.this.m5342s(abstractC1023f0M5232n0)) {
                if (this.f4055b == null) {
                    this.f4055b = new ArrayList<>();
                }
                abstractC1023f0M5232n0.m5427I(this, true);
                this.f4055b.add(abstractC1023f0M5232n0);
                return;
            }
            if (!abstractC1023f0M5232n0.m5452u() || abstractC1023f0M5232n0.m5454w() || RecyclerView.this.f3907m.m5477i()) {
                abstractC1023f0M5232n0.m5427I(this, false);
                this.f4054a.add(abstractC1023f0M5232n0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m5289V());
            }
        }

        /* JADX INFO: renamed from: J */
        public void m5684J(C1040w c1040w) {
            m5676B(RecyclerView.this.f3907m);
            C1040w c1040w2 = this.f4060g;
            if (c1040w2 != null) {
                c1040w2.m5664d();
            }
            this.f4060g = c1040w;
            if (c1040w != null && RecyclerView.this.getAdapter() != null) {
                this.f4060g.m5661a();
            }
            m5713u();
        }

        /* JADX INFO: renamed from: K */
        public void m5685K(AbstractC1019d0 abstractC1019d0) {
        }

        /* JADX INFO: renamed from: L */
        public void m5686L(int i10) {
            this.f4058e = i10;
            m5690P();
        }

        /* JADX INFO: renamed from: M */
        public final boolean m5687M(@NonNull AbstractC1023f0 abstractC1023f0, int i10, int i11, long j10) {
            abstractC1023f0.f3999s = null;
            abstractC1023f0.f3998r = RecyclerView.this;
            int iM5444m = abstractC1023f0.m5444m();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f4060g.m5673m(iM5444m, nanoTime, j10)) {
                return false;
            }
            if (abstractC1023f0.m5456y()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(abstractC1023f0.f3981a, recyclerView.getChildCount(), abstractC1023f0.f3981a.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f3907m.m5469a(abstractC1023f0, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(abstractC1023f0.f3981a);
            }
            this.f4060g.m5666f(abstractC1023f0.m5444m(), RecyclerView.this.getNanoTime() - nanoTime);
            m5694b(abstractC1023f0);
            if (RecyclerView.this.f3902j0.m5395e()) {
                abstractC1023f0.f3987g = i11;
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
        /* JADX INFO: renamed from: N */
        public AbstractC1023f0 m5688N(int i10, boolean z10, long j10) {
            AbstractC1023f0 abstractC1023f0M5471c;
            boolean z11;
            AbstractC1023f0 abstractC1023f0;
            boolean z12;
            boolean zM5687M;
            ViewGroup.LayoutParams layoutParams;
            C1035r c1035r;
            int iM5841m;
            RecyclerView recyclerViewM5224b0;
            if (i10 < 0 || i10 >= RecyclerView.this.f3902j0.m5392b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.f3902j0.m5392b() + RecyclerView.this.m5289V());
            }
            if (RecyclerView.this.f3902j0.m5395e()) {
                abstractC1023f0M5471c = m5700h(i10);
                if (abstractC1023f0M5471c != null) {
                    z11 = true;
                }
                if (abstractC1023f0M5471c == null && (abstractC1023f0M5471c = m5705m(i10, z10)) != null) {
                    if (m5691Q(abstractC1023f0M5471c)) {
                        z11 = true;
                    } else {
                        if (!z10) {
                            abstractC1023f0M5471c.m5433b(4);
                            if (abstractC1023f0M5471c.m5455x()) {
                                RecyclerView.this.removeDetachedView(abstractC1023f0M5471c.f3981a, false);
                                abstractC1023f0M5471c.m5430L();
                            } else if (abstractC1023f0M5471c.m5431M()) {
                                abstractC1023f0M5471c.m5436e();
                            }
                            m5682H(abstractC1023f0M5471c);
                        }
                        abstractC1023f0M5471c = null;
                    }
                }
                if (abstractC1023f0M5471c == null) {
                    iM5841m = RecyclerView.this.f3891e.m5841m(i10);
                    if (iM5841m >= 0 || iM5841m >= RecyclerView.this.f3907m.mo5473e()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM5841m + ").state:" + RecyclerView.this.f3902j0.m5392b() + RecyclerView.this.m5289V());
                    }
                    int iMo5475g = RecyclerView.this.f3907m.mo5475g(iM5841m);
                    if (RecyclerView.this.f3907m.m5477i() && (abstractC1023f0M5471c = m5704l(RecyclerView.this.f3907m.mo5474f(iM5841m), iMo5475g, z10)) != null) {
                        abstractC1023f0M5471c.f3983c = iM5841m;
                        z11 = true;
                    }
                    if (abstractC1023f0M5471c == null) {
                        if (RecyclerView.f3846G0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i10 + ") fetching from shared pool");
                        }
                        abstractC1023f0M5471c = m5701i().m5668h(iMo5475g);
                        if (abstractC1023f0M5471c != null) {
                            abstractC1023f0M5471c.m5423E();
                            if (RecyclerView.f3849J0) {
                                m5710r(abstractC1023f0M5471c);
                            }
                        }
                    }
                    if (abstractC1023f0M5471c == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != Long.MAX_VALUE && !this.f4060g.m5674n(iMo5475g, nanoTime, j10)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        abstractC1023f0M5471c = recyclerView.f3907m.m5471c(recyclerView, iMo5475g);
                        if (RecyclerView.f3851L0 && (recyclerViewM5224b0 = RecyclerView.m5224b0(abstractC1023f0M5471c.f3981a)) != null) {
                            abstractC1023f0M5471c.f3982b = new WeakReference<>(recyclerViewM5224b0);
                        }
                        this.f4060g.m5667g(iMo5475g, RecyclerView.this.getNanoTime() - nanoTime);
                        if (RecyclerView.f3846G0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
                abstractC1023f0 = abstractC1023f0M5471c;
                z12 = z11;
                if (z12 && !RecyclerView.this.f3902j0.m5395e() && abstractC1023f0.m5448q(8192)) {
                    abstractC1023f0.m5425G(0, 8192);
                    if (RecyclerView.this.f3902j0.f3963k) {
                        int iM5510e = AbstractC1031n.m5510e(abstractC1023f0) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.m5302b1(abstractC1023f0, recyclerView2.f3874O.m5529t(recyclerView2.f3902j0, abstractC1023f0, iM5510e, abstractC1023f0.m5447p()));
                    }
                }
                if (RecyclerView.this.f3902j0.m5395e() || !abstractC1023f0.m5451t()) {
                    if (abstractC1023f0.m5451t() || abstractC1023f0.m5419A() || abstractC1023f0.m5452u()) {
                        if (!RecyclerView.f3845F0 && abstractC1023f0.m5454w()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + abstractC1023f0 + RecyclerView.this.m5289V());
                        }
                        zM5687M = m5687M(abstractC1023f0, RecyclerView.this.f3891e.m5841m(i10), i10, j10);
                    }
                    layoutParams = abstractC1023f0.f3981a.getLayoutParams();
                    if (layoutParams == null) {
                        c1035r = (C1035r) RecyclerView.this.generateDefaultLayoutParams();
                        abstractC1023f0.f3981a.setLayoutParams(c1035r);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        c1035r = (C1035r) layoutParams;
                    } else {
                        c1035r = (C1035r) RecyclerView.this.generateLayoutParams(layoutParams);
                        abstractC1023f0.f3981a.setLayoutParams(c1035r);
                    }
                    c1035r.f4043a = abstractC1023f0;
                    c1035r.f4046d = !z12 && zM5687M;
                    return abstractC1023f0;
                }
                abstractC1023f0.f3987g = i10;
                zM5687M = false;
                layoutParams = abstractC1023f0.f3981a.getLayoutParams();
                if (layoutParams == null) {
                    c1035r = (C1035r) RecyclerView.this.generateDefaultLayoutParams();
                    abstractC1023f0.f3981a.setLayoutParams(c1035r);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    c1035r = (C1035r) RecyclerView.this.generateLayoutParams(layoutParams);
                    abstractC1023f0.f3981a.setLayoutParams(c1035r);
                } else {
                    c1035r = (C1035r) layoutParams;
                }
                c1035r.f4043a = abstractC1023f0;
                c1035r.f4046d = !z12 && zM5687M;
                return abstractC1023f0;
            }
            abstractC1023f0M5471c = null;
            z11 = false;
            if (abstractC1023f0M5471c == null) {
                if (m5691Q(abstractC1023f0M5471c)) {
                    if (!z10) {
                        abstractC1023f0M5471c.m5433b(4);
                        if (abstractC1023f0M5471c.m5455x()) {
                            RecyclerView.this.removeDetachedView(abstractC1023f0M5471c.f3981a, false);
                            abstractC1023f0M5471c.m5430L();
                        } else if (abstractC1023f0M5471c.m5431M()) {
                            abstractC1023f0M5471c.m5436e();
                        }
                        m5682H(abstractC1023f0M5471c);
                    }
                    abstractC1023f0M5471c = null;
                } else {
                    z11 = true;
                }
            }
            if (abstractC1023f0M5471c == null) {
                iM5841m = RecyclerView.this.f3891e.m5841m(i10);
                if (iM5841m >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM5841m + ").state:" + RecyclerView.this.f3902j0.m5392b() + RecyclerView.this.m5289V());
            }
            abstractC1023f0 = abstractC1023f0M5471c;
            z12 = z11;
            if (z12) {
                abstractC1023f0.m5425G(0, 8192);
                if (RecyclerView.this.f3902j0.f3963k) {
                    int iM5510e2 = AbstractC1031n.m5510e(abstractC1023f0) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.m5302b1(abstractC1023f0, recyclerView3.f3874O.m5529t(recyclerView3.f3902j0, abstractC1023f0, iM5510e2, abstractC1023f0.m5447p()));
                }
            }
            if (RecyclerView.this.f3902j0.m5395e()) {
                if (abstractC1023f0.m5451t()) {
                }
                if (!RecyclerView.f3845F0) {
                }
                zM5687M = m5687M(abstractC1023f0, RecyclerView.this.f3891e.m5841m(i10), i10, j10);
            } else {
                if (abstractC1023f0.m5451t()) {
                }
                if (!RecyclerView.f3845F0) {
                }
                zM5687M = m5687M(abstractC1023f0, RecyclerView.this.f3891e.m5841m(i10), i10, j10);
            }
            layoutParams = abstractC1023f0.f3981a.getLayoutParams();
            if (layoutParams == null) {
                c1035r = (C1035r) RecyclerView.this.generateDefaultLayoutParams();
                abstractC1023f0.f3981a.setLayoutParams(c1035r);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                c1035r = (C1035r) RecyclerView.this.generateLayoutParams(layoutParams);
                abstractC1023f0.f3981a.setLayoutParams(c1035r);
            } else {
                c1035r = (C1035r) layoutParams;
            }
            c1035r.f4043a = abstractC1023f0;
            c1035r.f4046d = !z12 && zM5687M;
            return abstractC1023f0;
        }

        /* JADX INFO: renamed from: O */
        public void m5689O(AbstractC1023f0 abstractC1023f0) {
            if (abstractC1023f0.f3995o) {
                this.f4055b.remove(abstractC1023f0);
            } else {
                this.f4054a.remove(abstractC1023f0);
            }
            abstractC1023f0.f3994n = null;
            abstractC1023f0.f3995o = false;
            abstractC1023f0.m5436e();
        }

        /* JADX INFO: renamed from: P */
        public void m5690P() {
            AbstractC1034q abstractC1034q = RecyclerView.this.f3909n;
            this.f4059f = this.f4058e + (abstractC1034q != null ? abstractC1034q.f4031m : 0);
            for (int size = this.f4056c.size() - 1; size >= 0 && this.f4056c.size() > this.f4059f; size--) {
                m5680F(size);
            }
        }

        /* JADX INFO: renamed from: Q */
        public boolean m5691Q(AbstractC1023f0 abstractC1023f0) {
            if (abstractC1023f0.m5454w()) {
                if (!RecyclerView.f3845F0 || RecyclerView.this.f3902j0.m5395e()) {
                    return RecyclerView.this.f3902j0.m5395e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.m5289V());
            }
            int i10 = abstractC1023f0.f3983c;
            if (i10 >= 0 && i10 < RecyclerView.this.f3907m.mo5473e()) {
                if (RecyclerView.this.f3902j0.m5395e() || RecyclerView.this.f3907m.mo5475g(abstractC1023f0.f3983c) == abstractC1023f0.m5444m()) {
                    return !RecyclerView.this.f3907m.m5477i() || abstractC1023f0.m5443l() == RecyclerView.this.f3907m.mo5474f(abstractC1023f0.f3983c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1023f0 + RecyclerView.this.m5289V());
        }

        /* JADX INFO: renamed from: R */
        public void m5692R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f4056c.size() - 1; size >= 0; size--) {
                AbstractC1023f0 abstractC1023f0 = this.f4056c.get(size);
                if (abstractC1023f0 != null && (i12 = abstractC1023f0.f3983c) >= i10 && i12 < i13) {
                    abstractC1023f0.m5433b(2);
                    m5680F(size);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m5693a(@NonNull AbstractC1023f0 abstractC1023f0, boolean z10) {
            RecyclerView.m5235u(abstractC1023f0);
            View view = abstractC1023f0.f3981a;
            C1065p c1065p = RecyclerView.this.f3916q0;
            if (c1065p != null) {
                C0582a c0582aM6034n = c1065p.m6034n();
                C0625o0.m3040m0(view, c0582aM6034n instanceof C1065p.a ? ((C1065p.a) c0582aM6034n).m6036n(view) : null);
            }
            if (z10) {
                m5699g(abstractC1023f0);
            }
            abstractC1023f0.f3999s = null;
            abstractC1023f0.f3998r = null;
            m5701i().m5671k(abstractC1023f0);
        }

        /* JADX INFO: renamed from: b */
        public final void m5694b(AbstractC1023f0 abstractC1023f0) {
            if (RecyclerView.this.m5243C0()) {
                View view = abstractC1023f0.f3981a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                C1065p c1065p = RecyclerView.this.f3916q0;
                if (c1065p == null) {
                    return;
                }
                C0582a c0582aM6034n = c1065p.m6034n();
                if (c0582aM6034n instanceof C1065p.a) {
                    ((C1065p.a) c0582aM6034n).m6037o(view);
                }
                C0625o0.m3040m0(view, c0582aM6034n);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m5695c() {
            this.f4054a.clear();
            m5679E();
        }

        /* JADX INFO: renamed from: d */
        public void m5696d() {
            int size = this.f4056c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4056c.get(i10).m5434c();
            }
            int size2 = this.f4054a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f4054a.get(i11).m5434c();
            }
            ArrayList<AbstractC1023f0> arrayList = this.f4055b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f4055b.get(i12).m5434c();
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m5697e() {
            this.f4054a.clear();
            ArrayList<AbstractC1023f0> arrayList = this.f4055b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* JADX INFO: renamed from: f */
        public int m5698f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f3902j0.m5392b()) {
                return !RecyclerView.this.f3902j0.m5395e() ? i10 : RecyclerView.this.f3891e.m5841m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f3902j0.m5392b() + RecyclerView.this.m5289V());
        }

        /* JADX INFO: renamed from: g */
        public void m5699g(@NonNull AbstractC1023f0 abstractC1023f0) {
            InterfaceC1042y interfaceC1042y = RecyclerView.this.f3911o;
            if (interfaceC1042y != null) {
                interfaceC1042y.m5719a(abstractC1023f0);
            }
            int size = RecyclerView.this.f3913p.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.f3913p.get(i10).m5719a(abstractC1023f0);
            }
            AbstractC1025h abstractC1025h = RecyclerView.this.f3907m;
            if (abstractC1025h != null) {
                abstractC1025h.m5493y(abstractC1023f0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3902j0 != null) {
                recyclerView.f3895g.m6085q(abstractC1023f0);
            }
            if (RecyclerView.f3846G0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC1023f0);
            }
        }

        /* JADX INFO: renamed from: h */
        public AbstractC1023f0 m5700h(int i10) {
            int size;
            int iM5841m;
            ArrayList<AbstractC1023f0> arrayList = this.f4055b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC1023f0 abstractC1023f0 = this.f4055b.get(i11);
                    if (!abstractC1023f0.m5431M() && abstractC1023f0.m5445n() == i10) {
                        abstractC1023f0.m5433b(32);
                        return abstractC1023f0;
                    }
                }
                if (RecyclerView.this.f3907m.m5477i() && (iM5841m = RecyclerView.this.f3891e.m5841m(i10)) > 0 && iM5841m < RecyclerView.this.f3907m.mo5473e()) {
                    long jMo5474f = RecyclerView.this.f3907m.mo5474f(iM5841m);
                    for (int i12 = 0; i12 < size; i12++) {
                        AbstractC1023f0 abstractC1023f1 = this.f4055b.get(i12);
                        if (!abstractC1023f1.m5431M() && abstractC1023f1.m5443l() == jMo5474f) {
                            abstractC1023f1.m5433b(32);
                            return abstractC1023f1;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public C1040w m5701i() {
            if (this.f4060g == null) {
                this.f4060g = new C1040w();
                m5713u();
            }
            return this.f4060g;
        }

        /* JADX INFO: renamed from: j */
        public int m5702j() {
            return this.f4054a.size();
        }

        @NonNull
        /* JADX INFO: renamed from: k */
        public List<AbstractC1023f0> m5703k() {
            return this.f4057d;
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:20:0x0061 */
        /* JADX INFO: renamed from: l */
        public AbstractC1023f0 m5704l(long j10, int i10, boolean z10) {
            for (int size = this.f4054a.size() - 1; size >= 0; size--) {
                AbstractC1023f0 abstractC1023f0 = this.f4054a.get(size);
                if (abstractC1023f0.m5443l() == j10 && !abstractC1023f0.m5431M()) {
                    if (i10 == abstractC1023f0.m5444m()) {
                        abstractC1023f0.m5433b(32);
                        if (abstractC1023f0.m5454w() && !RecyclerView.this.f3902j0.m5395e()) {
                            abstractC1023f0.m5425G(2, 14);
                        }
                        return abstractC1023f0;
                    }
                    if (!z10) {
                        this.f4054a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC1023f0.f3981a, false);
                        m5678D(abstractC1023f0.f3981a);
                    }
                }
            }
            int size2 = this.f4056c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC1023f0 abstractC1023f1 = this.f4056c.get(size2);
                if (abstractC1023f1.m5443l() == j10 && !abstractC1023f1.m5450s()) {
                    if (i10 == abstractC1023f1.m5444m()) {
                        if (!z10) {
                            this.f4056c.remove(size2);
                        }
                        return abstractC1023f1;
                    }
                    if (!z10) {
                        m5680F(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public AbstractC1023f0 m5705m(int i10, boolean z10) {
            View viewM5879e;
            int size = this.f4054a.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC1023f0 abstractC1023f0 = this.f4054a.get(i11);
                if (!abstractC1023f0.m5431M() && abstractC1023f0.m5445n() == i10 && !abstractC1023f0.m5452u() && (RecyclerView.this.f3902j0.f3960h || !abstractC1023f0.m5454w())) {
                    abstractC1023f0.m5433b(32);
                    return abstractC1023f0;
                }
            }
            if (!z10 && (viewM5879e = RecyclerView.this.f3893f.m5879e(i10)) != null) {
                AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(viewM5879e);
                RecyclerView.this.f3893f.m5893s(viewM5879e);
                int iM5887m = RecyclerView.this.f3893f.m5887m(viewM5879e);
                if (iM5887m != -1) {
                    RecyclerView.this.f3893f.m5878d(iM5887m);
                    m5683I(viewM5879e);
                    abstractC1023f0M5232n0.m5433b(8224);
                    return abstractC1023f0M5232n0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC1023f0M5232n0 + RecyclerView.this.m5289V());
            }
            int size2 = this.f4056c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC1023f0 abstractC1023f1 = this.f4056c.get(i12);
                if (!abstractC1023f1.m5452u() && abstractC1023f1.m5445n() == i10 && !abstractC1023f1.m5450s()) {
                    if (!z10) {
                        this.f4056c.remove(i12);
                    }
                    if (RecyclerView.f3846G0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + abstractC1023f1);
                    }
                    return abstractC1023f1;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: n */
        public View m5706n(int i10) {
            return this.f4054a.get(i10).f3981a;
        }

        @NonNull
        /* JADX INFO: renamed from: o */
        public View m5707o(int i10) {
            return m5708p(i10, false);
        }

        /* JADX INFO: renamed from: p */
        public View m5708p(int i10, boolean z10) {
            return m5688N(i10, z10, Long.MAX_VALUE).f3981a;
        }

        /* JADX INFO: renamed from: q */
        public final void m5709q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5709q((ViewGroup) childAt, true);
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

        /* JADX INFO: renamed from: r */
        public final void m5710r(AbstractC1023f0 abstractC1023f0) {
            View view = abstractC1023f0.f3981a;
            if (view instanceof ViewGroup) {
                m5709q((ViewGroup) view, false);
            }
        }

        /* JADX INFO: renamed from: s */
        public void m5711s() {
            int size = this.f4056c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1035r c1035r = (C1035r) this.f4056c.get(i10).f3981a.getLayoutParams();
                if (c1035r != null) {
                    c1035r.f4045c = true;
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public void m5712t() {
            int size = this.f4056c.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC1023f0 abstractC1023f0 = this.f4056c.get(i10);
                if (abstractC1023f0 != null) {
                    abstractC1023f0.m5433b(6);
                    abstractC1023f0.m5432a(null);
                }
            }
            AbstractC1025h abstractC1025h = RecyclerView.this.f3907m;
            if (abstractC1025h == null || !abstractC1025h.m5477i()) {
                m5679E();
            }
        }

        /* JADX INFO: renamed from: u */
        public final void m5713u() {
            if (this.f4060g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f3907m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f4060g.m5662b(RecyclerView.this.f3907m);
            }
        }

        /* JADX INFO: renamed from: v */
        public void m5714v(int i10, int i11) {
            int size = this.f4056c.size();
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC1023f0 abstractC1023f0 = this.f4056c.get(i12);
                if (abstractC1023f0 != null && abstractC1023f0.f3983c >= i10) {
                    if (RecyclerView.f3846G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + abstractC1023f0 + " now at position " + (abstractC1023f0.f3983c + i11));
                    }
                    abstractC1023f0.m5420B(i11, false);
                }
            }
        }

        /* JADX INFO: renamed from: w */
        public void m5715w(int i10, int i11) {
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
            int size = this.f4056c.size();
            for (int i16 = 0; i16 < size; i16++) {
                AbstractC1023f0 abstractC1023f0 = this.f4056c.get(i16);
                if (abstractC1023f0 != null && (i15 = abstractC1023f0.f3983c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        abstractC1023f0.m5420B(i11 - i10, false);
                    } else {
                        abstractC1023f0.m5420B(i12, false);
                    }
                    if (RecyclerView.f3846G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + abstractC1023f0);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: x */
        public void m5716x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f4056c.size() - 1; size >= 0; size--) {
                AbstractC1023f0 abstractC1023f0 = this.f4056c.get(size);
                if (abstractC1023f0 != null) {
                    int i13 = abstractC1023f0.f3983c;
                    if (i13 >= i12) {
                        if (RecyclerView.f3846G0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC1023f0 + " now at position " + (abstractC1023f0.f3983c - i11));
                        }
                        abstractC1023f0.m5420B(-i11, z10);
                    } else if (i13 >= i10) {
                        abstractC1023f0.m5433b(8);
                        m5680F(size);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: y */
        public void m5717y(AbstractC1025h<?> abstractC1025h, AbstractC1025h<?> abstractC1025h2, boolean z10) {
            m5695c();
            m5677C(abstractC1025h, true);
            m5701i().m5670j(abstractC1025h, abstractC1025h2, z10);
            m5713u();
        }

        /* JADX INFO: renamed from: z */
        public void m5718z() {
            m5713u();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public interface InterfaceC1042y {
        /* JADX INFO: renamed from: a */
        void m5719a(@NonNull AbstractC1023f0 abstractC1023f0);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public class C1043z extends AbstractC1027j {
        public C1043z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: a */
        public void mo5503a() {
            RecyclerView.this.m5339r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3902j0.f3959g = true;
            recyclerView.m5298Z0(true);
            if (RecyclerView.this.f3891e.m5844p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: c */
        public void mo5505c(int i10, int i11, Object obj) {
            RecyclerView.this.m5339r(null);
            if (RecyclerView.this.f3891e.m5846r(i10, i11, obj)) {
                m5720g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: d */
        public void mo5506d(int i10, int i11) {
            RecyclerView.this.m5339r(null);
            if (RecyclerView.this.f3891e.m5847s(i10, i11)) {
                m5720g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: e */
        public void mo5507e(int i10, int i11, int i12) {
            RecyclerView.this.m5339r(null);
            if (RecyclerView.this.f3891e.m5848t(i10, i11, i12)) {
                m5720g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1027j
        /* JADX INFO: renamed from: f */
        public void mo5508f(int i10, int i11) {
            RecyclerView.this.m5339r(null);
            if (RecyclerView.this.f3891e.m5849u(i10, i11)) {
                m5720g();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m5720g() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3923u && recyclerView.f3921t) {
                C0625o0.m3024e0(recyclerView, recyclerView.f3899i);
            } else {
                recyclerView.f3859C = true;
                recyclerView.requestLayout();
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        f3852M0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3853N0 = new InterpolatorC1016c();
        f3854O0 = new C1017c0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: G1 */
    private boolean m5223G1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f3870K;
        if (edgeEffect == null || C4427e.m22274b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            C4427e.m22276d(this.f3870K, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f3872M;
        if (edgeEffect2 != null && C4427e.m22274b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            C4427e.m22276d(this.f3872M, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f3871L;
        if (edgeEffect3 != null && C4427e.m22274b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            C4427e.m22276d(this.f3871L, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f3873N;
        if (edgeEffect4 == null || C4427e.m22274b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        C4427e.m22276d(this.f3873N, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public static RecyclerView m5224b0(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewM5224b0 = m5224b0(viewGroup.getChildAt(i10));
            if (recyclerViewM5224b0 != null) {
                return recyclerViewM5224b0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    private int m5229f1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f3871L;
        float f11 = 0.0f;
        if (edgeEffect == null || C4427e.m22274b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f3873N;
            if (edgeEffect2 != null && C4427e.m22274b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f3873N.onRelease();
                } else {
                    float fM22276d = C4427e.m22276d(this.f3873N, height, 1.0f - width);
                    if (C4427e.m22274b(this.f3873N) == 0.0f) {
                        this.f3873N.onRelease();
                    }
                    f11 = fM22276d;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f3871L.onRelease();
            } else {
                float f12 = -C4427e.m22276d(this.f3871L, -height, width);
                if (C4427e.m22274b(this.f3871L) == 0.0f) {
                    this.f3871L.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private C0636u getScrollingChildHelper() {
        if (this.f3920s0 == null) {
            this.f3920s0 = new C0636u(this);
        }
        return this.f3920s0;
    }

    /* JADX INFO: renamed from: n0 */
    public static AbstractC1023f0 m5232n0(View view) {
        if (view == null) {
            return null;
        }
        return ((C1035r) view.getLayoutParams()).f4043a;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m5233p0(View view, Rect rect) {
        C1035r c1035r = (C1035r) view.getLayoutParams();
        Rect rect2 = c1035r.f4044b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1035r).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1035r).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1035r).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin);
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f3845F0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f3846G0 = z10;
    }

    /* JADX INFO: renamed from: t0 */
    private float m5234t0(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f3883a * 0.015f));
        float f10 = f3848I0;
        return (float) (((double) (this.f3883a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    /* JADX INFO: renamed from: u */
    public static void m5235u(@NonNull AbstractC1023f0 abstractC1023f0) {
        WeakReference<RecyclerView> weakReference = abstractC1023f0.f3982b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC1023f0.f3981a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC1023f0.f3982b = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m5236A() {
        if (!this.f3927w || this.f3865F) {
            Trace.beginSection("RV FullInvalidate");
            m5256H();
            Trace.endSection();
            return;
        }
        if (this.f3891e.m5844p()) {
            if (!this.f3891e.m5843o(4) || this.f3891e.m5843o(11)) {
                if (this.f3891e.m5844p()) {
                    Trace.beginSection("RV FullInvalidate");
                    m5256H();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m5247D1();
            m5280Q0();
            this.f3891e.m5851w();
            if (!this.f3931y) {
                if (m5353w0()) {
                    m5256H();
                } else {
                    this.f3891e.m5837i();
                }
            }
            m5258H1(true);
            m5282R0();
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m5237A0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C1058i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C12010b.f42554a), resources.getDimensionPixelSize(C12010b.f42556c), resources.getDimensionPixelOffset(C12010b.f42555b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m5289V());
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m5238A1(int i10, int i11, Interpolator interpolator, int i12) {
        m5241B1(i10, i11, interpolator, i12, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m5239B(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM5340r0 = m5340r0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strM5340r0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1034q.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f3852M0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM5340r0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC1034q) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM5340r0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM5340r0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM5340r0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM5340r0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM5340r0, e16);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m5240B0() {
        this.f3873N = null;
        this.f3871L = null;
        this.f3872M = null;
        this.f3870K = null;
    }

    /* JADX INFO: renamed from: B1 */
    public void m5241B1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3933z) {
            return;
        }
        if (!abstractC1034q.mo5191p()) {
            i10 = 0;
        }
        if (!this.f3909n.mo5193q()) {
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
            m5250E1(i13, 1);
        }
        this.f3896g0.m5407e(i10, i11, i12, interpolator);
    }

    /* JADX INFO: renamed from: C */
    public void m5242C(int i10, int i11) {
        setMeasuredDimension(AbstractC1034q.m5545s(i10, getPaddingLeft() + getPaddingRight(), C0625o0.m2980B(this)), AbstractC1034q.m5545s(i11, getPaddingTop() + getPaddingBottom(), C0625o0.m2978A(this)));
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m5243C0() {
        AccessibilityManager accessibilityManager = this.f3861D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* JADX INFO: renamed from: C1 */
    public void m5244C1(int i10) {
        if (this.f3933z) {
            return;
        }
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1034q.mo5163N1(this, this.f3902j0, i10);
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5245D(int i10, int i11) {
        m5299a0(this.f3918r0);
        int[] iArr = this.f3918r0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m5246D0() {
        return this.f3867H > 0;
    }

    /* JADX INFO: renamed from: D1 */
    public void m5247D1() {
        int i10 = this.f3929x + 1;
        this.f3929x = i10;
        if (i10 != 1 || this.f3933z) {
            return;
        }
        this.f3931y = false;
    }

    /* JADX INFO: renamed from: E */
    public void m5248E(View view) {
        AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(view);
        m5276O0(view);
        AbstractC1025h abstractC1025h = this.f3907m;
        if (abstractC1025h != null && abstractC1023f0M5232n0 != null) {
            abstractC1025h.m5491w(abstractC1023f0M5232n0);
        }
        List<InterfaceC1036s> list = this.f3863E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3863E.get(size).mo5654b(view);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m5249E0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || m5293X(view2) == null) {
            return false;
        }
        if (view == null || m5293X(view) == null) {
            return true;
        }
        this.f3901j.set(0, 0, view.getWidth(), view.getHeight());
        this.f3903k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3901j);
        offsetDescendantRectToMyCoords(view2, this.f3903k);
        byte b = -1;
        int i12 = this.f3909n.m5594d0() == 1 ? -1 : 1;
        Rect rect = this.f3901j;
        int i13 = rect.left;
        Rect rect2 = this.f3903k;
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
            b = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b = 0;
            }
        }
        if (i10 == 1) {
            return b < 0 || (b == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b > 0 || (b == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + m5289V());
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m5250E1(int i10, int i11) {
        return getScrollingChildHelper().m3195p(i10, i11);
    }

    /* JADX INFO: renamed from: F */
    public void m5251F(View view) {
        AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(view);
        m5278P0(view);
        AbstractC1025h abstractC1025h = this.f3907m;
        if (abstractC1025h != null && abstractC1023f0M5232n0 != null) {
            abstractC1025h.m5492x(abstractC1023f0M5232n0);
        }
        List<InterfaceC1036s> list = this.f3863E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3863E.get(size).mo5653a(view);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m5252F0(int i10) {
        if (this.f3909n == null) {
            return;
        }
        setScrollState(2);
        this.f3909n.mo5149C1(i10);
        awakenScrollBars();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F1 */
    public final void m5253F1(int i10) {
        boolean zMo5191p = this.f3909n.mo5191p();
        int i11 = zMo5191p;
        if (this.f3909n.mo5193q()) {
            i11 = (zMo5191p ? 1 : 0) | 2;
        }
        m5250E1(i11, i10);
    }

    /* JADX INFO: renamed from: G */
    public final void m5254G() {
        int i10 = this.f3857B;
        this.f3857B = 0;
        if (i10 == 0 || !m5243C0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        C13003b.m48327b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: G0 */
    public void m5255G0() {
        int iM5884j = this.f3893f.m5884j();
        for (int i10 = 0; i10 < iM5884j; i10++) {
            ((C1035r) this.f3893f.m5883i(i10).getLayoutParams()).f4045c = true;
        }
        this.f3887c.m5711s();
    }

    /* JADX INFO: renamed from: H */
    public void m5256H() {
        if (this.f3907m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f3909n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f3902j0.f3962j = false;
        boolean z10 = this.f3932y0 && !(this.f3934z0 == getWidth() && this.f3856A0 == getHeight());
        this.f3934z0 = 0;
        this.f3856A0 = 0;
        this.f3932y0 = false;
        if (this.f3902j0.f3957e == 1) {
            m5259I();
            this.f3909n.m5554E1(this);
            m5262J();
        } else if (this.f3891e.m5845q() || z10 || this.f3909n.m5627s0() != getWidth() || this.f3909n.m5592b0() != getHeight()) {
            this.f3909n.m5554E1(this);
            m5262J();
        } else {
            this.f3909n.m5554E1(this);
        }
        m5265K();
    }

    /* JADX INFO: renamed from: H0 */
    public void m5257H0() {
        int iM5884j = this.f3893f.m5884j();
        for (int i10 = 0; i10 < iM5884j; i10++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i10));
            if (abstractC1023f0M5232n0 != null && !abstractC1023f0M5232n0.m5429K()) {
                abstractC1023f0M5232n0.m5433b(6);
            }
        }
        m5255G0();
        this.f3887c.m5712t();
    }

    /* JADX INFO: renamed from: H1 */
    public void m5258H1(boolean z10) {
        if (this.f3929x < 1) {
            if (f3845F0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + m5289V());
            }
            this.f3929x = 1;
        }
        if (!z10 && !this.f3933z) {
            this.f3931y = false;
        }
        if (this.f3929x == 1) {
            if (z10 && this.f3931y && !this.f3933z && this.f3909n != null && this.f3907m != null) {
                m5256H();
            }
            if (!this.f3933z) {
                this.f3931y = false;
            }
        }
        this.f3929x--;
    }

    /* JADX INFO: renamed from: I */
    public final void m5259I() {
        this.f3902j0.m5391a(1);
        m5291W(this.f3902j0);
        this.f3902j0.f3962j = false;
        m5247D1();
        this.f3895g.m6074f();
        m5280Q0();
        m5296Y0();
        m5335p1();
        C1015b0 c1015b0 = this.f3902j0;
        c1015b0.f3961i = c1015b0.f3963k && this.f3910n0;
        this.f3910n0 = false;
        this.f3908m0 = false;
        c1015b0.f3960h = c1015b0.f3964l;
        c1015b0.f3958f = this.f3907m.mo5473e();
        m5299a0(this.f3918r0);
        if (this.f3902j0.f3963k) {
            int iM5881g = this.f3893f.m5881g();
            for (int i10 = 0; i10 < iM5881g; i10++) {
                AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5880f(i10));
                if (!abstractC1023f0M5232n0.m5429K() && (!abstractC1023f0M5232n0.m5452u() || this.f3907m.m5477i())) {
                    this.f3895g.m6073e(abstractC1023f0M5232n0, this.f3874O.m5529t(this.f3902j0, abstractC1023f0M5232n0, AbstractC1031n.m5510e(abstractC1023f0M5232n0), abstractC1023f0M5232n0.m5447p()));
                    if (this.f3902j0.f3961i && abstractC1023f0M5232n0.m5457z() && !abstractC1023f0M5232n0.m5454w() && !abstractC1023f0M5232n0.m5429K() && !abstractC1023f0M5232n0.m5452u()) {
                        this.f3895g.m6071c(m5321k0(abstractC1023f0M5232n0), abstractC1023f0M5232n0);
                    }
                }
            }
        }
        if (this.f3902j0.f3964l) {
            m5338q1();
            C1015b0 c1015b1 = this.f3902j0;
            boolean z10 = c1015b1.f3959g;
            c1015b1.f3959g = false;
            this.f3909n.mo5103c1(this.f3887c, c1015b1);
            this.f3902j0.f3959g = z10;
            for (int i11 = 0; i11 < this.f3893f.m5881g(); i11++) {
                AbstractC1023f0 abstractC1023f0M5232n1 = m5232n0(this.f3893f.m5880f(i11));
                if (!abstractC1023f0M5232n1.m5429K() && !this.f3895g.m6077i(abstractC1023f0M5232n1)) {
                    int iM5510e = AbstractC1031n.m5510e(abstractC1023f0M5232n1);
                    boolean zM5448q = abstractC1023f0M5232n1.m5448q(8192);
                    if (!zM5448q) {
                        iM5510e |= 4096;
                    }
                    AbstractC1031n.c cVarM5529t = this.f3874O.m5529t(this.f3902j0, abstractC1023f0M5232n1, iM5510e, abstractC1023f0M5232n1.m5447p());
                    if (zM5448q) {
                        m5302b1(abstractC1023f0M5232n1, cVarM5529t);
                    } else {
                        this.f3895g.m6069a(abstractC1023f0M5232n1, cVarM5529t);
                    }
                }
            }
            m5349v();
        } else {
            m5349v();
        }
        m5282R0();
        m5258H1(false);
        this.f3902j0.f3957e = 2;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m5260I0(int i10, int i11, MotionEvent motionEvent, int i12) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3933z) {
            return;
        }
        int[] iArr = this.f3926v0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zMo5191p = abstractC1034q.mo5191p();
        boolean zMo5193q = this.f3909n.mo5193q();
        int i13 = zMo5193q ? (zMo5191p ? 1 : 0) | 2 : zMo5191p ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iM5308e1 = i10 - m5308e1(i10, height);
        int iM5229f1 = i11 - m5229f1(i11, width);
        m5250E1(i13, i12);
        if (m5268L(zMo5191p ? iM5308e1 : 0, zMo5193q ? iM5229f1 : 0, this.f3926v0, this.f3922t0, i12)) {
            int[] iArr2 = this.f3926v0;
            iM5308e1 -= iArr2[0];
            iM5229f1 -= iArr2[1];
        }
        m5341r1(zMo5191p ? iM5308e1 : 0, zMo5193q ? iM5229f1 : 0, motionEvent, i12);
        RunnableC1059j runnableC1059j = this.f3898h0;
        if (runnableC1059j != null && (iM5308e1 != 0 || iM5229f1 != 0)) {
            runnableC1059j.m5974f(this, iM5308e1, iM5229f1);
        }
        m5261I1(i12);
    }

    /* JADX INFO: renamed from: I1 */
    public void m5261I1(int i10) {
        getScrollingChildHelper().m3197r(i10);
    }

    /* JADX INFO: renamed from: J */
    public final void m5262J() {
        m5247D1();
        m5280Q0();
        this.f3902j0.m5391a(6);
        this.f3891e.m5838j();
        this.f3902j0.f3958f = this.f3907m.mo5473e();
        this.f3902j0.f3956d = 0;
        if (this.f3889d != null && this.f3907m.m5470b()) {
            Parcelable parcelable = this.f3889d.f3935c;
            if (parcelable != null) {
                this.f3909n.mo5183h1(parcelable);
            }
            this.f3889d = null;
        }
        C1015b0 c1015b0 = this.f3902j0;
        c1015b0.f3960h = false;
        this.f3909n.mo5103c1(this.f3887c, c1015b0);
        C1015b0 c1015b1 = this.f3902j0;
        c1015b1.f3959g = false;
        c1015b1.f3963k = c1015b1.f3963k && this.f3874O != null;
        c1015b1.f3957e = 4;
        m5282R0();
        m5258H1(false);
    }

    /* JADX INFO: renamed from: J0 */
    public void m5263J0(int i10) {
        int iM5881g = this.f3893f.m5881g();
        for (int i11 = 0; i11 < iM5881g; i11++) {
            this.f3893f.m5880f(i11).offsetLeftAndRight(i10);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m5264J1() {
        setScrollState(0);
        m5267K1();
    }

    /* JADX INFO: renamed from: K */
    public final void m5265K() {
        RecyclerView recyclerView;
        this.f3902j0.m5391a(4);
        m5247D1();
        m5280Q0();
        C1015b0 c1015b0 = this.f3902j0;
        c1015b0.f3957e = 1;
        if (c1015b0.f3963k) {
            for (int iM5881g = this.f3893f.m5881g() - 1; iM5881g >= 0; iM5881g--) {
                AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5880f(iM5881g));
                if (!abstractC1023f0M5232n0.m5429K()) {
                    long jM5321k0 = m5321k0(abstractC1023f0M5232n0);
                    AbstractC1031n.c cVarM5528s = this.f3874O.m5528s(this.f3902j0, abstractC1023f0M5232n0);
                    AbstractC1023f0 abstractC1023f0M6075g = this.f3895g.m6075g(jM5321k0);
                    if (abstractC1023f0M6075g == null || abstractC1023f0M6075g.m5429K()) {
                        this.f3895g.m6072d(abstractC1023f0M5232n0, cVarM5528s);
                    } else {
                        boolean zM6076h = this.f3895g.m6076h(abstractC1023f0M6075g);
                        boolean zM6076h2 = this.f3895g.m6076h(abstractC1023f0M5232n0);
                        if (zM6076h && abstractC1023f0M6075g == abstractC1023f0M5232n0) {
                            this.f3895g.m6072d(abstractC1023f0M5232n0, cVarM5528s);
                        } else {
                            AbstractC1031n.c cVarM6082n = this.f3895g.m6082n(abstractC1023f0M6075g);
                            this.f3895g.m6072d(abstractC1023f0M5232n0, cVarM5528s);
                            AbstractC1031n.c cVarM6081m = this.f3895g.m6081m(abstractC1023f0M5232n0);
                            if (cVarM6082n == null) {
                                m5347u0(jM5321k0, abstractC1023f0M5232n0, abstractC1023f0M6075g);
                            } else {
                                m5334p(abstractC1023f0M6075g, abstractC1023f0M5232n0, cVarM6082n, cVarM6081m, zM6076h, zM6076h2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f3895g.m6083o(recyclerView.f3860C0);
        } else {
            recyclerView = this;
        }
        recyclerView.f3909n.m5624q1(recyclerView.f3887c);
        C1015b0 c1015b1 = recyclerView.f3902j0;
        c1015b1.f3955c = c1015b1.f3958f;
        recyclerView.f3865F = false;
        recyclerView.f3866G = false;
        c1015b1.f3963k = false;
        c1015b1.f3964l = false;
        recyclerView.f3909n.f4026h = false;
        ArrayList<AbstractC1023f0> arrayList = recyclerView.f3887c.f4055b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1034q abstractC1034q = recyclerView.f3909n;
        if (abstractC1034q.f4032n) {
            abstractC1034q.f4031m = 0;
            abstractC1034q.f4032n = false;
            recyclerView.f3887c.m5690P();
        }
        recyclerView.f3909n.mo5105d1(recyclerView.f3902j0);
        m5282R0();
        m5258H1(false);
        recyclerView.f3895g.m6074f();
        int[] iArr = recyclerView.f3918r0;
        if (m5245D(iArr[0], iArr[1])) {
            m5275O(0, 0);
        }
        m5304c1();
        m5330n1();
    }

    /* JADX INFO: renamed from: K0 */
    public void m5266K0(int i10) {
        int iM5881g = this.f3893f.m5881g();
        for (int i11 = 0; i11 < iM5881g; i11++) {
            this.f3893f.m5880f(i11).offsetTopAndBottom(i10);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final void m5267K1() {
        this.f3896g0.m5408f();
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            abstractC1034q.m5576P1();
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m5268L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().m3183d(i10, i11, iArr, iArr2, i12);
    }

    /* JADX INFO: renamed from: L0 */
    public void m5269L0(int i10, int i11) {
        int iM5884j = this.f3893f.m5884j();
        for (int i12 = 0; i12 < iM5884j; i12++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i12));
            if (abstractC1023f0M5232n0 != null && !abstractC1023f0M5232n0.m5429K() && abstractC1023f0M5232n0.f3983c >= i10) {
                if (f3846G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + abstractC1023f0M5232n0 + " now at position " + (abstractC1023f0M5232n0.f3983c + i11));
                }
                abstractC1023f0M5232n0.m5420B(i11, false);
                this.f3902j0.f3959g = true;
            }
        }
        this.f3887c.m5714v(i10, i11);
        requestLayout();
    }

    /* JADX INFO: renamed from: L1 */
    public void m5270L1(int i10, int i11, Object obj) {
        int i12;
        int iM5884j = this.f3893f.m5884j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iM5884j; i14++) {
            View viewM5883i = this.f3893f.m5883i(i14);
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(viewM5883i);
            if (abstractC1023f0M5232n0 != null && !abstractC1023f0M5232n0.m5429K() && (i12 = abstractC1023f0M5232n0.f3983c) >= i10 && i12 < i13) {
                abstractC1023f0M5232n0.m5433b(2);
                abstractC1023f0M5232n0.m5432a(obj);
                ((C1035r) viewM5883i.getLayoutParams()).f4045c = true;
            }
        }
        this.f3887c.m5692R(i10, i11);
    }

    /* JADX INFO: renamed from: M */
    public final void m5271M(int i10, int i11, int i12, int i13, int[] iArr, int i14, @NonNull int[] iArr2) {
        getScrollingChildHelper().m3184e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* JADX INFO: renamed from: M0 */
    public void m5272M0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iM5884j = this.f3893f.m5884j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iM5884j; i16++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i16));
            if (abstractC1023f0M5232n0 != null && (i15 = abstractC1023f0M5232n0.f3983c) >= i13 && i15 <= i12) {
                if (f3846G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + abstractC1023f0M5232n0);
                }
                if (abstractC1023f0M5232n0.f3983c == i10) {
                    abstractC1023f0M5232n0.m5420B(i11 - i10, false);
                } else {
                    abstractC1023f0M5232n0.m5420B(i14, false);
                }
                this.f3902j0.f3959g = true;
            }
        }
        this.f3887c.m5715w(i10, i11);
        requestLayout();
    }

    /* JADX INFO: renamed from: N */
    public void m5273N(int i10) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            abstractC1034q.mo5609j1(i10);
        }
        m5288U0(i10);
        AbstractC1039v abstractC1039v = this.f3904k0;
        if (abstractC1039v != null) {
            abstractC1039v.mo5659a(this, i10);
        }
        List<AbstractC1039v> list = this.f3906l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3906l0.get(size).mo5659a(this, i10);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m5274N0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iM5884j = this.f3893f.m5884j();
        for (int i13 = 0; i13 < iM5884j; i13++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i13));
            if (abstractC1023f0M5232n0 != null && !abstractC1023f0M5232n0.m5429K()) {
                int i14 = abstractC1023f0M5232n0.f3983c;
                if (i14 >= i12) {
                    if (f3846G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + abstractC1023f0M5232n0 + " now at position " + (abstractC1023f0M5232n0.f3983c - i11));
                    }
                    abstractC1023f0M5232n0.m5420B(-i11, z10);
                    this.f3902j0.f3959g = true;
                } else if (i14 >= i10) {
                    if (f3846G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + abstractC1023f0M5232n0 + " now REMOVED");
                    }
                    abstractC1023f0M5232n0.m5440i(i10 - 1, -i11, z10);
                    this.f3902j0.f3959g = true;
                }
            }
        }
        this.f3887c.m5716x(i10, i11, z10);
        requestLayout();
    }

    /* JADX INFO: renamed from: O */
    public void m5275O(int i10, int i11) {
        this.f3868I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        m5290V0(i10, i11);
        AbstractC1039v abstractC1039v = this.f3904k0;
        if (abstractC1039v != null) {
            abstractC1039v.mo5660b(this, i10, i11);
        }
        List<AbstractC1039v> list = this.f3906l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3906l0.get(size).mo5660b(this, i10, i11);
            }
        }
        this.f3868I--;
    }

    /* JADX INFO: renamed from: O0 */
    public void m5276O0(@NonNull View view) {
    }

    /* JADX INFO: renamed from: P */
    public void m5277P() {
        int i10;
        for (int size = this.f3928w0.size() - 1; size >= 0; size--) {
            AbstractC1023f0 abstractC1023f0 = this.f3928w0.get(size);
            if (abstractC1023f0.f3981a.getParent() == this && !abstractC1023f0.m5429K() && (i10 = abstractC1023f0.f3997q) != -1) {
                abstractC1023f0.f3981a.setImportantForAccessibility(i10);
                abstractC1023f0.f3997q = -1;
            }
        }
        this.f3928w0.clear();
    }

    /* JADX INFO: renamed from: P0 */
    public void m5278P0(@NonNull View view) {
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5279Q(MotionEvent motionEvent) {
        InterfaceC1038u interfaceC1038u = this.f3919s;
        if (interfaceC1038u == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m5297Z(motionEvent);
        }
        interfaceC1038u.mo5656a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f3919s = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m5280Q0() {
        this.f3867H++;
    }

    /* JADX INFO: renamed from: R */
    public void m5281R() {
        if (this.f3873N != null) {
            return;
        }
        EdgeEffect edgeEffectMo5398a = this.f3869J.mo5398a(this, 3);
        this.f3873N = edgeEffectMo5398a;
        if (this.f3897h) {
            edgeEffectMo5398a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo5398a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m5282R0() {
        m5284S0(true);
    }

    /* JADX INFO: renamed from: S */
    public void m5283S() {
        if (this.f3870K != null) {
            return;
        }
        EdgeEffect edgeEffectMo5398a = this.f3869J.mo5398a(this, 0);
        this.f3870K = edgeEffectMo5398a;
        if (this.f3897h) {
            edgeEffectMo5398a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo5398a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m5284S0(boolean z10) {
        int i10 = this.f3867H - 1;
        this.f3867H = i10;
        if (i10 < 1) {
            if (f3845F0 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + m5289V());
            }
            this.f3867H = 0;
            if (z10) {
                m5254G();
                m5277P();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m5285T() {
        if (this.f3872M != null) {
            return;
        }
        EdgeEffect edgeEffectMo5398a = this.f3869J.mo5398a(this, 2);
        this.f3872M = edgeEffectMo5398a;
        if (this.f3897h) {
            edgeEffectMo5398a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo5398a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m5286T0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3876Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f3876Q = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f3880U = x10;
            this.f3878S = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f3881V = y10;
            this.f3879T = y10;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m5287U() {
        if (this.f3871L != null) {
            return;
        }
        EdgeEffect edgeEffectMo5398a = this.f3869J.mo5398a(this, 1);
        this.f3871L = edgeEffectMo5398a;
        if (this.f3897h) {
            edgeEffectMo5398a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo5398a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m5288U0(int i10) {
    }

    /* JADX INFO: renamed from: V */
    public String m5289V() {
        return " " + super.toString() + ", adapter:" + this.f3907m + ", layout:" + this.f3909n + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: V0 */
    public void m5290V0(int i10, int i11) {
    }

    /* JADX INFO: renamed from: W */
    public final void m5291W(C1015b0 c1015b0) {
        if (getScrollState() != 2) {
            c1015b0.f3968p = 0;
            c1015b0.f3969q = 0;
        } else {
            OverScroller overScroller = this.f3896g0.f3974c;
            c1015b0.f3968p = overScroller.getFinalX() - overScroller.getCurrX();
            c1015b0.f3969q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m5292W0() {
        if (this.f3914p0 || !this.f3921t) {
            return;
        }
        C0625o0.m3024e0(this, this.f3930x0);
        this.f3914p0 = true;
    }

    /* JADX INFO: renamed from: X */
    public View m5293X(@NonNull View view) {
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

    /* JADX INFO: renamed from: X0 */
    public final boolean m5294X0() {
        return this.f3874O != null && this.f3909n.mo5082Q1();
    }

    /* JADX INFO: renamed from: Y */
    public AbstractC1023f0 m5295Y(@NonNull View view) {
        View viewM5293X = m5293X(view);
        if (viewM5293X == null) {
            return null;
        }
        return m5327m0(viewM5293X);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m5296Y0() {
        boolean z10;
        if (this.f3865F) {
            this.f3891e.m5853y();
            if (this.f3866G) {
                this.f3909n.mo5094X0(this);
            }
        }
        if (m5294X0()) {
            this.f3891e.m5851w();
        } else {
            this.f3891e.m5838j();
        }
        boolean z11 = this.f3908m0 || this.f3910n0;
        this.f3902j0.f3963k = this.f3927w && this.f3874O != null && ((z10 = this.f3865F) || z11 || this.f3909n.f4026h) && (!z10 || this.f3907m.m5477i());
        C1015b0 c1015b0 = this.f3902j0;
        c1015b0.f3964l = c1015b0.f3963k && z11 && !this.f3865F && m5294X0();
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m5297Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3917r.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC1038u interfaceC1038u = this.f3917r.get(i10);
            if (interfaceC1038u.mo5657b(this, motionEvent) && action != 3) {
                this.f3919s = interfaceC1038u;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m5298Z0(boolean z10) {
        this.f3866G = z10 | this.f3866G;
        this.f3865F = true;
        m5257H0();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5299a0(int[] iArr) {
        int iM5881g = this.f3893f.m5881g();
        if (iM5881g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        for (int i12 = 0; i12 < iM5881g; i12++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5880f(i12));
            if (!abstractC1023f0M5232n0.m5429K()) {
                int iM5445n = abstractC1023f0M5232n0.m5445n();
                if (iM5445n < i10) {
                    i10 = iM5445n;
                }
                if (iM5445n > i11) {
                    i11 = iM5445n;
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
    /* JADX INFO: renamed from: a1 */
    public final void m5300a1(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 >= 0.0f) {
            if (f11 > 0.0f) {
                m5285T();
                C4427e.m22276d(this.f3872M, f11 / getWidth(), f12 / getHeight());
            } else {
                z10 = false;
            }
            if (f13 < 0.0f) {
                m5287U();
                C4427e.m22276d(this.f3871L, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > 0.0f) {
                m5281R();
                C4427e.m22276d(this.f3873N, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z11 = z10;
            }
            if (z11 && f11 == 0.0f && f13 == 0.0f) {
                return;
            }
            postInvalidateOnAnimation();
        }
        m5283S();
        C4427e.m22276d(this.f3870K, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z10 = true;
        if (f13 < 0.0f) {
            m5287U();
            C4427e.m22276d(this.f3871L, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > 0.0f) {
            m5281R();
            C4427e.m22276d(this.f3873N, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z11 = z10;
        }
        if (z11) {
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null || !abstractC1034q.m5566K0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5301b(int i10, int i11) {
        if (i10 < 0) {
            m5283S();
            if (this.f3870K.isFinished()) {
                this.f3870K.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            m5285T();
            if (this.f3872M.isFinished()) {
                this.f3872M.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            m5287U();
            if (this.f3871L.isFinished()) {
                this.f3871L.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            m5281R();
            if (this.f3873N.isFinished()) {
                this.f3873N.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: b1 */
    public void m5302b1(AbstractC1023f0 abstractC1023f0, AbstractC1031n.c cVar) {
        abstractC1023f0.m5425G(0, 8192);
        if (this.f3902j0.f3961i && abstractC1023f0.m5457z() && !abstractC1023f0.m5454w() && !abstractC1023f0.m5429K()) {
            this.f3895g.m6071c(m5321k0(abstractC1023f0), abstractC1023f0);
        }
        this.f3895g.m6073e(abstractC1023f0, cVar);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:17:0x002b */
    /* JADX INFO: renamed from: c0 */
    public final View m5303c0() {
        AbstractC1023f0 abstractC1023f0M5305d0;
        C1015b0 c1015b0 = this.f3902j0;
        int i10 = c1015b0.f3965m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iM5392b = c1015b0.m5392b();
        for (int i11 = i10; i11 < iM5392b; i11++) {
            AbstractC1023f0 abstractC1023f0M5305d1 = m5305d0(i11);
            if (abstractC1023f0M5305d1 == null) {
                break;
            }
            if (abstractC1023f0M5305d1.f3981a.hasFocusable()) {
                return abstractC1023f0M5305d1.f3981a;
            }
        }
        int iMin = Math.min(iM5392b, i10);
        do {
            iMin--;
            if (iMin < 0 || (abstractC1023f0M5305d0 = m5305d0(iMin)) == null) {
                return null;
            }
        } while (!abstractC1023f0M5305d0.f3981a.hasFocusable());
        return abstractC1023f0M5305d0.f3981a;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m5304c1() {
        View viewFindViewById;
        if (!this.f3894f0 || this.f3907m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f3893f.m5888n(getFocusedChild())) {
                return;
            }
        }
        View viewM5303c0 = null;
        AbstractC1023f0 abstractC1023f0M5307e0 = (this.f3902j0.f3966n == -1 || !this.f3907m.m5477i()) ? null : m5307e0(this.f3902j0.f3966n);
        if (abstractC1023f0M5307e0 != null && !this.f3893f.m5888n(abstractC1023f0M5307e0.f3981a) && abstractC1023f0M5307e0.f3981a.hasFocusable()) {
            viewM5303c0 = abstractC1023f0M5307e0.f3981a;
        } else if (this.f3893f.m5881g() > 0) {
            viewM5303c0 = m5303c0();
        }
        if (viewM5303c0 != null) {
            int i10 = this.f3902j0.f3967o;
            if (i10 != -1 && (viewFindViewById = viewM5303c0.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewM5303c0 = viewFindViewById;
            }
            viewM5303c0.requestFocus();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1035r) && this.f3909n.mo5123r((C1035r) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null && abstractC1034q.mo5191p()) {
            return this.f3909n.mo5200v(this.f3902j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null && abstractC1034q.mo5191p()) {
            return this.f3909n.mo5130w(this.f3902j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null && abstractC1034q.mo5191p()) {
            return this.f3909n.mo5131x(this.f3902j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null && abstractC1034q.mo5193q()) {
            return this.f3909n.mo5204y(this.f3902j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null && abstractC1034q.mo5193q()) {
            return this.f3909n.mo5132z(this.f3902j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null && abstractC1034q.mo5193q()) {
            return this.f3909n.mo5072A(this.f3902j0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public AbstractC1023f0 m5305d0(int i10) {
        AbstractC1023f0 abstractC1023f0 = null;
        if (this.f3865F) {
            return null;
        }
        int iM5884j = this.f3893f.m5884j();
        for (int i11 = 0; i11 < iM5884j; i11++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i11));
            if (abstractC1023f0M5232n0 != null && !abstractC1023f0M5232n0.m5454w() && m5318j0(abstractC1023f0M5232n0) == i10) {
                if (!this.f3893f.m5888n(abstractC1023f0M5232n0.f3981a)) {
                    return abstractC1023f0M5232n0;
                }
                abstractC1023f0 = abstractC1023f0M5232n0;
            }
        }
        return abstractC1023f0;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m5306d1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f3870K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f3870K.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f3871L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f3871L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3872M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f3872M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3873N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f3873N.isFinished();
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
        AbstractC1034q layoutManager = getLayoutManager();
        int iMo5473e = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.mo5193q()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    m5238A1(0, measuredHeight, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                } else {
                    m5238A1(0, -measuredHeight, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zMo5146A0 = layoutManager.mo5146A0();
                if (keyCode == 122) {
                    if (zMo5146A0) {
                        iMo5473e = getAdapter().mo5473e();
                    }
                } else if (!zMo5146A0) {
                    iMo5473e = getAdapter().mo5473e();
                }
                m5244C1(iMo5473e);
                return true;
            }
        } else if (layoutManager.mo5191p()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    m5238A1(measuredWidth, 0, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                } else {
                    m5238A1(-measuredWidth, 0, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zMo5146A1 = layoutManager.mo5146A0();
                if (keyCode2 == 122) {
                    if (zMo5146A1) {
                        iMo5473e = getAdapter().mo5473e();
                    }
                } else if (!zMo5146A1) {
                    iMo5473e = getAdapter().mo5473e();
                }
                m5244C1(iMo5473e);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().m3180a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().m3181b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3182c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().m3185f(i10, i11, i12, i13, iArr);
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
        int size = this.f3915q.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f3915q.get(i10).mo5541i(canvas, this, this.f3902j0);
        }
        EdgeEffect edgeEffect = this.f3870K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f3897h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f3870K;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f3871L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f3897h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3871L;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f3872M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3897h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f3872M;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f3873N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3897h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f3873N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f3874O == null || this.f3915q.size() <= 0 || !this.f3874O.mo5525p()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX INFO: renamed from: e0 */
    public AbstractC1023f0 m5307e0(long j10) {
        AbstractC1025h abstractC1025h = this.f3907m;
        AbstractC1023f0 abstractC1023f0 = null;
        if (abstractC1025h != null && abstractC1025h.m5477i()) {
            int iM5884j = this.f3893f.m5884j();
            for (int i10 = 0; i10 < iM5884j; i10++) {
                AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i10));
                if (abstractC1023f0M5232n0 != null && !abstractC1023f0M5232n0.m5454w() && abstractC1023f0M5232n0.m5443l() == j10) {
                    if (!this.f3893f.m5888n(abstractC1023f0M5232n0.f3981a)) {
                        return abstractC1023f0M5232n0;
                    }
                    abstractC1023f0 = abstractC1023f0M5232n0;
                }
            }
        }
        return abstractC1023f0;
    }

    /* JADX INFO: renamed from: e1 */
    public final int m5308e1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f3870K;
        float f11 = 0.0f;
        if (edgeEffect == null || C4427e.m22274b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f3872M;
            if (edgeEffect2 != null && C4427e.m22274b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f3872M.onRelease();
                } else {
                    float fM22276d = C4427e.m22276d(this.f3872M, width, height);
                    if (C4427e.m22274b(this.f3872M) == 0.0f) {
                        this.f3872M.onRelease();
                    }
                    f11 = fM22276d;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f3870K.onRelease();
            } else {
                float f12 = -C4427e.m22276d(this.f3870K, -width, 1.0f - height);
                if (C4427e.m22274b(this.f3870K) == 0.0f) {
                    this.f3870K.onRelease();
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
    /* JADX INFO: renamed from: f0 */
    public AbstractC1023f0 m5309f0(int i10, boolean z10) {
        int iM5884j = this.f3893f.m5884j();
        AbstractC1023f0 abstractC1023f0 = null;
        for (int i11 = 0; i11 < iM5884j; i11++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i11));
            if (abstractC1023f0M5232n0 != null && !abstractC1023f0M5232n0.m5454w()) {
                if (z10) {
                    if (abstractC1023f0M5232n0.f3983c != i10) {
                        continue;
                    } else {
                        if (this.f3893f.m5888n(abstractC1023f0M5232n0.f3981a)) {
                            return abstractC1023f0M5232n0;
                        }
                        abstractC1023f0 = abstractC1023f0M5232n0;
                    }
                } else if (abstractC1023f0M5232n0.m5445n() != i10) {
                    continue;
                } else {
                    if (this.f3893f.m5888n(abstractC1023f0M5232n0.f3981a)) {
                        return abstractC1023f0M5232n0;
                    }
                    abstractC1023f0 = abstractC1023f0M5232n0;
                }
            }
        }
        return abstractC1023f0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewMo5080O0;
        boolean z10;
        View viewM5585V0 = this.f3909n.m5585V0(view, i10);
        if (viewM5585V0 != null) {
            return viewM5585V0;
        }
        boolean z11 = (this.f3907m == null || this.f3909n == null || m5246D0() || this.f3933z) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f3909n.mo5193q()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f3909n.mo5191p()) {
                z10 = focusFinder.findNextFocus(this, view, (this.f3909n.m5594d0() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z10) {
                m5236A();
                if (m5293X(view) == null) {
                    return null;
                }
                m5247D1();
                this.f3909n.mo5080O0(view, i10, this.f3887c, this.f3902j0);
                m5258H1(false);
            }
            viewMo5080O0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                m5236A();
                if (m5293X(view) == null) {
                    return null;
                }
                m5247D1();
                viewMo5080O0 = this.f3909n.mo5080O0(view, i10, this.f3887c, this.f3902j0);
                m5258H1(false);
            } else {
                viewMo5080O0 = viewFindNextFocus;
            }
        }
        if (viewMo5080O0 == null || viewMo5080O0.hasFocusable()) {
            return m5249E0(view, viewMo5080O0, i10) ? viewMo5080O0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        m5328m1(viewMo5080O0, null);
        return view;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m5310g0(int i10, int i11) {
        return m5312h0(i10, i11, this.f3886b0, this.f3888c0);
    }

    /* JADX INFO: renamed from: g1 */
    public void m5311g1() {
        AbstractC1031n abstractC1031n = this.f3874O;
        if (abstractC1031n != null) {
            abstractC1031n.mo5520k();
        }
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            abstractC1034q.m5622p1(this.f3887c);
            this.f3909n.m5624q1(this.f3887c);
        }
        this.f3887c.m5695c();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            return abstractC1034q.mo5077I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5289V());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            return abstractC1034q.mo5078J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5289V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1025h getAdapter() {
        return this.f3907m;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1034q abstractC1034q = this.f3909n;
        return abstractC1034q != null ? abstractC1034q.m5568L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3897h;
    }

    public C1065p getCompatAccessibilityDelegate() {
        return this.f3916q0;
    }

    @NonNull
    public C1030m getEdgeEffectFactory() {
        return this.f3869J;
    }

    public AbstractC1031n getItemAnimator() {
        return this.f3874O;
    }

    public int getItemDecorationCount() {
        return this.f3915q.size();
    }

    public AbstractC1034q getLayoutManager() {
        return this.f3909n;
    }

    public int getMaxFlingVelocity() {
        return this.f3888c0;
    }

    public int getMinFlingVelocity() {
        return this.f3886b0;
    }

    public long getNanoTime() {
        if (f3851L0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1037t getOnFlingListener() {
        return this.f3884a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3894f0;
    }

    @NonNull
    public C1040w getRecycledViewPool() {
        return this.f3887c.m5701i();
    }

    public int getScrollState() {
        return this.f3875P;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX INFO: renamed from: h0 */
    public final boolean m5312h0(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f3933z) {
            return false;
        }
        boolean zMo5191p = abstractC1034q.mo5191p();
        boolean zMo5193q = this.f3909n.mo5193q();
        if (!zMo5191p || Math.abs(i10) < i12) {
            i10 = 0;
        }
        if (!zMo5193q || Math.abs(i11) < i12) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.f3870K;
            if (edgeEffect == null || C4427e.m22274b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f3872M;
                if (edgeEffect2 == null || C4427e.m22274b(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (m5354w1(this.f3872M, i10, getWidth())) {
                    this.f3872M.onAbsorb(i10);
                    i10 = 0;
                }
            } else {
                int i15 = -i10;
                if (m5354w1(this.f3870K, i15, getWidth())) {
                    this.f3870K.onAbsorb(i15);
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
            EdgeEffect edgeEffect3 = this.f3871L;
            if (edgeEffect3 == null || C4427e.m22274b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f3873N;
                if (edgeEffect4 == null || C4427e.m22274b(edgeEffect4) == 0.0f) {
                    i14 = i11;
                    i11 = 0;
                } else if (m5354w1(this.f3873N, i11, getHeight())) {
                    this.f3873N.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i16 = -i11;
                if (m5354w1(this.f3871L, i16, getHeight())) {
                    this.f3871L.onAbsorb(i16);
                    i11 = 0;
                }
            }
            i14 = 0;
        }
        if (iMax != 0 || i11 != 0) {
            int i17 = -i13;
            iMax = Math.max(i17, Math.min(iMax, i13));
            i11 = Math.max(i17, Math.min(i11, i13));
            m5253F1(1);
            this.f3896g0.m5404b(iMax, i11);
        }
        if (i10 == 0 && i14 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i14;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zMo5191p || zMo5193q;
            dispatchNestedFling(f10, f11, z10);
            AbstractC1037t abstractC1037t = this.f3884a0;
            if (abstractC1037t != null && abstractC1037t.mo5655a(i10, i14)) {
                return true;
            }
            if (z10) {
                m5253F1(1);
                int i18 = -i13;
                this.f3896g0.m5404b(Math.max(i18, Math.min(i10, i13)), Math.max(i18, Math.min(i14, i13)));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m5313h1(View view) {
        m5247D1();
        boolean zM5892r = this.f3893f.m5892r(view);
        if (zM5892r) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(view);
            this.f3887c.m5689O(abstractC1023f0M5232n0);
            this.f3887c.m5682H(abstractC1023f0M5232n0);
            if (f3846G0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        m5258H1(!zM5892r);
        return zM5892r;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m3189j();
    }

    /* JADX INFO: renamed from: i */
    public final void m5314i(AbstractC1023f0 abstractC1023f0) {
        View view = abstractC1023f0.f3981a;
        boolean z10 = view.getParent() == this;
        this.f3887c.m5689O(m5327m0(view));
        if (abstractC1023f0.m5456y()) {
            this.f3893f.m5877c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f3893f.m5885k(view);
        } else {
            this.f3893f.m5876b(view, true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m5315i0(int i10, int i11) {
        return m5312h0(i10, i11, 0, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: i1 */
    public void m5316i1(@NonNull AbstractC1033p abstractC1033p) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            abstractC1034q.mo5188l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3915q.remove(abstractC1033p);
        if (this.f3915q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m5255G0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f3921t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3933z;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m3191l();
    }

    /* JADX INFO: renamed from: j */
    public void m5317j(@NonNull AbstractC1033p abstractC1033p) {
        m5320k(abstractC1033p, -1);
    }

    /* JADX INFO: renamed from: j0 */
    public int m5318j0(AbstractC1023f0 abstractC1023f0) {
        if (abstractC1023f0.m5448q(524) || !abstractC1023f0.m5451t()) {
            return -1;
        }
        return this.f3891e.m5833e(abstractC1023f0.f3983c);
    }

    /* JADX INFO: renamed from: j1 */
    public void m5319j1(@NonNull InterfaceC1038u interfaceC1038u) {
        this.f3917r.remove(interfaceC1038u);
        if (this.f3919s == interfaceC1038u) {
            this.f3919s = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5320k(@NonNull AbstractC1033p abstractC1033p, int i10) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            abstractC1034q.mo5188l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3915q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f3915q.add(abstractC1033p);
        } else {
            this.f3915q.add(i10, abstractC1033p);
        }
        m5255G0();
        requestLayout();
    }

    /* JADX INFO: renamed from: k0 */
    public long m5321k0(AbstractC1023f0 abstractC1023f0) {
        return this.f3907m.m5477i() ? abstractC1023f0.m5443l() : abstractC1023f0.f3983c;
    }

    /* JADX INFO: renamed from: k1 */
    public void m5322k1(@NonNull AbstractC1039v abstractC1039v) {
        List<AbstractC1039v> list = this.f3906l0;
        if (list != null) {
            list.remove(abstractC1039v);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m5323l(@NonNull InterfaceC1036s interfaceC1036s) {
        if (this.f3863E == null) {
            this.f3863E = new ArrayList();
        }
        this.f3863E.add(interfaceC1036s);
    }

    /* JADX INFO: renamed from: l0 */
    public int m5324l0(@NonNull View view) {
        AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(view);
        if (abstractC1023f0M5232n0 != null) {
            return abstractC1023f0M5232n0.m5445n();
        }
        return -1;
    }

    /* JADX INFO: renamed from: l1 */
    public void m5325l1() {
        AbstractC1023f0 abstractC1023f0;
        int iM5881g = this.f3893f.m5881g();
        for (int i10 = 0; i10 < iM5881g; i10++) {
            View viewM5880f = this.f3893f.m5880f(i10);
            AbstractC1023f0 abstractC1023f0M5327m0 = m5327m0(viewM5880f);
            if (abstractC1023f0M5327m0 != null && (abstractC1023f0 = abstractC1023f0M5327m0.f3989i) != null) {
                View view = abstractC1023f0.f3981a;
                int left = viewM5880f.getLeft();
                int top = viewM5880f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m5326m(@NonNull InterfaceC1038u interfaceC1038u) {
        this.f3917r.add(interfaceC1038u);
    }

    /* JADX INFO: renamed from: m0 */
    public AbstractC1023f0 m5327m0(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m5232n0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m5328m1(@NonNull View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3901j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1035r) {
            C1035r c1035r = (C1035r) layoutParams;
            if (!c1035r.f4045c) {
                Rect rect = c1035r.f4044b;
                Rect rect2 = this.f3901j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3901j);
            offsetRectIntoDescendantCoords(view, this.f3901j);
        }
        this.f3909n.mo5637x1(this, view, this.f3901j, !this.f3927w, view2 == null);
    }

    /* JADX INFO: renamed from: n */
    public void m5329n(@NonNull AbstractC1039v abstractC1039v) {
        if (this.f3906l0 == null) {
            this.f3906l0 = new ArrayList();
        }
        this.f3906l0.add(abstractC1039v);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m5330n1() {
        C1015b0 c1015b0 = this.f3902j0;
        c1015b0.f3966n = -1L;
        c1015b0.f3965m = -1;
        c1015b0.f3967o = -1;
    }

    /* JADX INFO: renamed from: o */
    public void m5331o(@NonNull AbstractC1023f0 abstractC1023f0, AbstractC1031n.c cVar, @NonNull AbstractC1031n.c cVar2) {
        abstractC1023f0.m5426H(false);
        if (this.f3874O.mo5511a(abstractC1023f0, cVar, cVar2)) {
            m5292W0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m5332o0(@NonNull View view, @NonNull Rect rect) {
        m5233p0(view, rect);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m5333o1() {
        VelocityTracker velocityTracker = this.f3877R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m5261I1(0);
        m5306d1();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f3867H = 0;
        this.f3921t = true;
        this.f3927w = this.f3927w && !isLayoutRequested();
        this.f3887c.m5718z();
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            abstractC1034q.m5552E(this);
        }
        this.f3914p0 = false;
        if (f3851L0) {
            ThreadLocal<RunnableC1059j> threadLocal = RunnableC1059j.f4280e;
            RunnableC1059j runnableC1059j = threadLocal.get();
            this.f3898h0 = runnableC1059j;
            if (runnableC1059j == null) {
                this.f3898h0 = new RunnableC1059j();
                Display displayM3053t = C0625o0.m3053t(this);
                if (isInEditMode() || displayM3053t == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayM3053t.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1059j runnableC1059j2 = this.f3898h0;
                runnableC1059j2.f4284c = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1059j2);
            }
            this.f3898h0.m5970a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC1059j runnableC1059j;
        super.onDetachedFromWindow();
        AbstractC1031n abstractC1031n = this.f3874O;
        if (abstractC1031n != null) {
            abstractC1031n.mo5520k();
        }
        m5264J1();
        this.f3921t = false;
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            abstractC1034q.m5555F(this, this.f3887c);
        }
        this.f3928w0.clear();
        removeCallbacks(this.f3930x0);
        this.f3895g.m6078j();
        this.f3887c.m5675A();
        C10427a.m40136b(this);
        if (!f3851L0 || (runnableC1059j = this.f3898h0) == null) {
            return;
        }
        runnableC1059j.m5978j(this);
        this.f3898h0 = null;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3915q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3915q.get(i10).mo5539g(canvas, this, this.f3902j0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float axisValue;
        RecyclerView recyclerView;
        if (this.f3909n != null && !this.f3933z && motionEvent.getAction() == 8) {
            float f10 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f11 = this.f3909n.mo5193q() ? -motionEvent.getAxisValue(9) : 0.0f;
                z10 = false;
                axisValue = this.f3909n.mo5191p() ? motionEvent.getAxisValue(10) : 0.0f;
                f10 = f11;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.f3909n.mo5193q()) {
                    float f12 = -axisValue;
                    axisValue = 0.0f;
                    f10 = f12;
                } else if (!this.f3909n.mo5191p()) {
                    axisValue = 0.0f;
                }
                z10 = this.f3858B0;
            } else {
                i10 = 0;
                z10 = false;
                axisValue = 0.0f;
            }
            int i11 = (int) (f10 * this.f3892e0);
            int i12 = (int) (axisValue * this.f3890d0);
            if (z10) {
                OverScroller overScroller = this.f3896g0.f3974c;
                recyclerView = this;
                recyclerView.m5241B1(i12 + (overScroller.getFinalX() - overScroller.getCurrX()), i11 + (overScroller.getFinalY() - overScroller.getCurrY()), null, EditorInfoCompat.IME_FLAG_FORCE_ASCII, true);
            } else {
                recyclerView = this;
                m5260I0(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                recyclerView.f3864E0.m2904g(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f3933z) {
            return false;
        }
        this.f3919s = null;
        if (m5297Z(motionEvent)) {
            m5345t();
            return true;
        }
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            return false;
        }
        boolean zMo5191p = abstractC1034q.mo5191p();
        boolean zMo5193q = this.f3909n.mo5193q();
        if (this.f3877R == null) {
            this.f3877R = VelocityTracker.obtain();
        }
        this.f3877R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3855A) {
                this.f3855A = false;
            }
            this.f3876Q = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f3880U = x10;
            this.f3878S = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f3881V = y10;
            this.f3879T = y10;
            if (m5223G1(motionEvent) || this.f3875P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m5261I1(1);
            }
            int[] iArr = this.f3924u0;
            iArr[1] = 0;
            iArr[0] = 0;
            m5253F1(0);
        } else if (actionMasked == 1) {
            this.f3877R.clear();
            m5261I1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f3876Q);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3876Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f3875P != 1) {
                int i10 = x11 - this.f3878S;
                int i11 = y11 - this.f3879T;
                if (!zMo5191p || Math.abs(i10) <= this.f3882W) {
                    z10 = false;
                } else {
                    this.f3880U = x11;
                    z10 = true;
                }
                if (zMo5193q && Math.abs(i11) > this.f3882W) {
                    this.f3881V = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m5345t();
        } else if (actionMasked == 5) {
            this.f3876Q = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3880U = x12;
            this.f3878S = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3881V = y12;
            this.f3879T = y12;
        } else if (actionMasked == 6) {
            m5286T0(motionEvent);
        }
        return this.f3875P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        m5256H();
        Trace.endSection();
        this.f3927w = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            m5242C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (abstractC1034q.mo5201w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3909n.m5597e1(this.f3887c, this.f3902j0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f3932y0 = z10;
            if (z10 || this.f3907m == null) {
                return;
            }
            if (this.f3902j0.f3957e == 1) {
                m5259I();
            }
            this.f3909n.m5557F1(i10, i11);
            this.f3902j0.f3962j = true;
            m5262J();
            this.f3909n.m5563I1(i10, i11);
            if (this.f3909n.mo5159L1()) {
                this.f3909n.m5557F1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f3902j0.f3962j = true;
                m5262J();
                this.f3909n.m5563I1(i10, i11);
            }
            this.f3934z0 = getMeasuredWidth();
            this.f3856A0 = getMeasuredHeight();
            return;
        }
        if (this.f3923u) {
            this.f3909n.m5597e1(this.f3887c, this.f3902j0, i10, i11);
            return;
        }
        if (this.f3859C) {
            m5247D1();
            m5280Q0();
            m5296Y0();
            m5282R0();
            C1015b0 c1015b0 = this.f3902j0;
            if (c1015b0.f3964l) {
                c1015b0.f3960h = true;
            } else {
                this.f3891e.m5838j();
                this.f3902j0.f3960h = false;
            }
            this.f3859C = false;
            m5258H1(false);
        } else if (this.f3902j0.f3964l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC1025h abstractC1025h = this.f3907m;
        if (abstractC1025h != null) {
            this.f3902j0.f3958f = abstractC1025h.mo5473e();
        } else {
            this.f3902j0.f3958f = 0;
        }
        m5247D1();
        this.f3909n.m5597e1(this.f3887c, this.f3902j0, i10, i11);
        m5258H1(false);
        this.f3902j0.f3960h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (m5246D0()) {
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
        this.f3889d = savedState;
        super.onRestoreInstanceState(savedState.m3321a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f3889d;
        if (savedState2 != null) {
            savedState.m5364f(savedState2);
            return savedState;
        }
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            savedState.f3935c = abstractC1034q.mo5185i1();
            return savedState;
        }
        savedState.f3935c = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        m5240B0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f3933z || this.f3855A) {
            return false;
        }
        if (m5279Q(motionEvent)) {
            m5345t();
            return true;
        }
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            return false;
        }
        boolean zMo5191p = abstractC1034q.mo5191p();
        boolean zMo5193q = this.f3909n.mo5193q();
        if (this.f3877R == null) {
            this.f3877R = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f3924u0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f3924u0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f3877R.addMovement(motionEventObtain);
                this.f3877R.computeCurrentVelocity(1000, this.f3888c0);
                float f10 = zMo5191p ? -this.f3877R.getXVelocity(this.f3876Q) : 0.0f;
                float f11 = zMo5193q ? -this.f3877R.getYVelocity(this.f3876Q) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !m5310g0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                m5333o1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3876Q);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3876Q + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f3880U - x10;
                int iMax2 = this.f3881V - y10;
                if (this.f3875P != 1) {
                    if (zMo5191p) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.f3882W) : Math.min(0, iMax + this.f3882W);
                        if (iMax != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (zMo5193q) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f3882W) : Math.min(0, iMax2 + this.f3882W);
                        if (iMax2 != 0) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        setScrollState(1);
                    }
                }
                if (this.f3875P == 1) {
                    int[] iArr3 = this.f3926v0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iM5308e1 = iMax - m5308e1(iMax, motionEvent.getY());
                    int iM5229f1 = iMax2 - m5229f1(iMax2, motionEvent.getX());
                    if (m5268L(zMo5191p ? iM5308e1 : 0, zMo5193q ? iM5229f1 : 0, this.f3926v0, this.f3922t0, 0)) {
                        int[] iArr4 = this.f3926v0;
                        iM5308e1 -= iArr4[0];
                        iM5229f1 -= iArr4[1];
                        int[] iArr5 = this.f3924u0;
                        int i10 = iArr5[0];
                        int[] iArr6 = this.f3922t0;
                        iArr5[0] = i10 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f3922t0;
                    this.f3880U = x10 - iArr7[0];
                    this.f3881V = y10 - iArr7[1];
                    if (m5341r1(zMo5191p ? iM5308e1 : 0, zMo5193q ? iM5229f1 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC1059j runnableC1059j = this.f3898h0;
                    if (runnableC1059j != null && (iM5308e1 != 0 || iM5229f1 != 0)) {
                        runnableC1059j.m5974f(this, iM5308e1, iM5229f1);
                    }
                }
            } else if (actionMasked == 3) {
                m5345t();
            } else if (actionMasked == 5) {
                this.f3876Q = motionEvent.getPointerId(actionIndex);
                int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f3880U = x11;
                this.f3878S = x11;
                int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f3881V = y11;
                this.f3879T = y11;
            } else if (actionMasked == 6) {
                m5286T0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.f3876Q = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        this.f3880U = x12;
        this.f3878S = x12;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        this.f3881V = y12;
        this.f3879T = y12;
        m5253F1(0);
        this.f3877R.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m5334p(@NonNull AbstractC1023f0 abstractC1023f0, @NonNull AbstractC1023f0 abstractC1023f1, @NonNull AbstractC1031n.c cVar, @NonNull AbstractC1031n.c cVar2, boolean z10, boolean z11) {
        abstractC1023f0.m5426H(false);
        if (z10) {
            m5314i(abstractC1023f0);
        }
        if (abstractC1023f0 != abstractC1023f1) {
            if (z11) {
                m5314i(abstractC1023f1);
            }
            abstractC1023f0.f3988h = abstractC1023f1;
            m5314i(abstractC1023f0);
            this.f3887c.m5689O(abstractC1023f0);
            abstractC1023f1.m5426H(false);
            abstractC1023f1.f3989i = abstractC1023f0;
        }
        if (this.f3874O.mo5512b(abstractC1023f0, abstractC1023f1, cVar, cVar2)) {
            m5292W0();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m5335p1() {
        int iM5441j;
        View focusedChild = (this.f3894f0 && hasFocus() && this.f3907m != null) ? getFocusedChild() : null;
        AbstractC1023f0 abstractC1023f0M5295Y = focusedChild != null ? m5295Y(focusedChild) : null;
        if (abstractC1023f0M5295Y == null) {
            m5330n1();
            return;
        }
        this.f3902j0.f3966n = this.f3907m.m5477i() ? abstractC1023f0M5295Y.m5443l() : -1L;
        C1015b0 c1015b0 = this.f3902j0;
        if (this.f3865F) {
            iM5441j = -1;
        } else {
            iM5441j = abstractC1023f0M5295Y.m5454w() ? abstractC1023f0M5295Y.f3984d : abstractC1023f0M5295Y.m5441j();
        }
        c1015b0.f3965m = iM5441j;
        this.f3902j0.f3967o = m5337q0(abstractC1023f0M5295Y.f3981a);
    }

    /* JADX INFO: renamed from: q */
    public void m5336q(@NonNull AbstractC1023f0 abstractC1023f0, @NonNull AbstractC1031n.c cVar, AbstractC1031n.c cVar2) {
        m5314i(abstractC1023f0);
        abstractC1023f0.m5426H(false);
        if (this.f3874O.mo5513c(abstractC1023f0, cVar, cVar2)) {
            m5292W0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final int m5337q0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    /* JADX INFO: renamed from: q1 */
    public void m5338q1() {
        int iM5884j = this.f3893f.m5884j();
        for (int i10 = 0; i10 < iM5884j; i10++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i10));
            if (f3845F0 && abstractC1023f0M5232n0.f3983c == -1 && !abstractC1023f0M5232n0.m5454w()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + m5289V());
            }
            if (!abstractC1023f0M5232n0.m5429K()) {
                abstractC1023f0M5232n0.m5424F();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m5339r(String str) {
        if (m5246D0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m5289V());
        }
        if (this.f3868I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m5289V()));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final String m5340r0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m5341r1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        m5236A();
        if (this.f3907m != null) {
            int[] iArr = this.f3926v0;
            iArr[0] = 0;
            iArr[1] = 0;
            m5344s1(i10, i11, iArr);
            int[] iArr2 = this.f3926v0;
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
        if (!this.f3915q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3926v0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m5271M(i13, i14, i15, i16, this.f3922t0, i12, iArr3);
        int[] iArr4 = this.f3926v0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f3880U;
        int[] iArr5 = this.f3922t0;
        int i24 = iArr5[0];
        this.f3880U = i23 - i24;
        int i25 = this.f3881V;
        int i26 = iArr5[1];
        this.f3881V = i25 - i26;
        int[] iArr6 = this.f3924u0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0632s.m3175a(motionEvent, InputDeviceCompat.SOURCE_MOUSE)) {
                m5300a1(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && C0632s.m3175a(motionEvent, 4194304)) {
                    m5306d1();
                }
            }
            m5352w(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            m5275O(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(view);
        if (abstractC1023f0M5232n0 != null) {
            if (abstractC1023f0M5232n0.m5456y()) {
                abstractC1023f0M5232n0.m5437f();
            } else if (!abstractC1023f0M5232n0.m5429K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC1023f0M5232n0 + m5289V());
            }
        } else if (f3845F0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + m5289V());
        }
        view.clearAnimation();
        m5251F(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3909n.m5602g1(this, this.f3902j0, view, view2) && view2 != null) {
            m5328m1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f3909n.m5635w1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f3917r.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3917r.get(i10).mo5658c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3929x != 0 || this.f3933z) {
            this.f3931y = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m5342s(AbstractC1023f0 abstractC1023f0) {
        AbstractC1031n abstractC1031n = this.f3874O;
        return abstractC1031n == null || abstractC1031n.mo5516g(abstractC1023f0, abstractC1023f0.m5447p());
    }

    /* JADX INFO: renamed from: s0 */
    public Rect m5343s0(View view) {
        C1035r c1035r = (C1035r) view.getLayoutParams();
        if (!c1035r.f4045c) {
            return c1035r.f4044b;
        }
        if (this.f3902j0.m5395e() && (c1035r.m5650c() || c1035r.m5652e())) {
            return c1035r.f4044b;
        }
        Rect rect = c1035r.f4044b;
        rect.set(0, 0, 0, 0);
        int size = this.f3915q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3901j.set(0, 0, 0, 0);
            this.f3915q.get(i10).mo5537e(this.f3901j, view, this, this.f3902j0);
            int i11 = rect.left;
            Rect rect2 = this.f3901j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1035r.f4045c = false;
        return rect;
    }

    /* JADX INFO: renamed from: s1 */
    public void m5344s1(int i10, int i11, int[] iArr) {
        m5247D1();
        m5280Q0();
        Trace.beginSection("RV Scroll");
        m5291W(this.f3902j0);
        int iMo5073B1 = i10 != 0 ? this.f3909n.mo5073B1(i10, this.f3887c, this.f3902j0) : 0;
        int iMo5074D1 = i11 != 0 ? this.f3909n.mo5074D1(i11, this.f3887c, this.f3902j0) : 0;
        Trace.endSection();
        m5325l1();
        m5282R0();
        m5258H1(false);
        if (iArr != null) {
            iArr[0] = iMo5073B1;
            iArr[1] = iMo5074D1;
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3933z) {
            return;
        }
        boolean zMo5191p = abstractC1034q.mo5191p();
        boolean zMo5193q = this.f3909n.mo5193q();
        if (zMo5191p || zMo5193q) {
            if (!zMo5191p) {
                i10 = 0;
            }
            if (!zMo5193q) {
                i11 = 0;
            }
            m5341r1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m5357x1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1065p c1065p) {
        this.f3916q0 = c1065p;
        C0625o0.m3040m0(this, c1065p);
    }

    public void setAdapter(AbstractC1025h abstractC1025h) {
        setLayoutFrozen(false);
        m5348u1(abstractC1025h, false, true);
        m5298Z0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1029l interfaceC1029l) {
        if (interfaceC1029l == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f3897h) {
            m5240B0();
        }
        this.f3897h = z10;
        super.setClipToPadding(z10);
        if (this.f3927w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull C1030m c1030m) {
        C12637g.m47075g(c1030m);
        this.f3869J = c1030m;
        m5240B0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f3923u = z10;
    }

    public void setItemAnimator(AbstractC1031n abstractC1031n) {
        AbstractC1031n abstractC1031n2 = this.f3874O;
        if (abstractC1031n2 != null) {
            abstractC1031n2.mo5520k();
            this.f3874O.m5531v(null);
        }
        this.f3874O = abstractC1031n;
        if (abstractC1031n != null) {
            abstractC1031n.m5531v(this.f3912o0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f3887c.m5686L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(AbstractC1034q abstractC1034q) {
        if (abstractC1034q == this.f3909n) {
            return;
        }
        m5264J1();
        if (this.f3909n != null) {
            AbstractC1031n abstractC1031n = this.f3874O;
            if (abstractC1031n != null) {
                abstractC1031n.mo5520k();
            }
            this.f3909n.m5622p1(this.f3887c);
            this.f3909n.m5624q1(this.f3887c);
            this.f3887c.m5695c();
            if (this.f3921t) {
                this.f3909n.m5555F(this, this.f3887c);
            }
            this.f3909n.m5565J1(null);
            this.f3909n = null;
        } else {
            this.f3887c.m5695c();
        }
        this.f3893f.m5889o();
        this.f3909n = abstractC1034q;
        if (abstractC1034q != null) {
            if (abstractC1034q.f4020b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC1034q + " is already attached to a RecyclerView:" + abstractC1034q.f4020b.m5289V());
            }
            abstractC1034q.m5565J1(this);
            if (this.f3921t) {
                this.f3909n.m5552E(this);
            }
        }
        this.f3887c.m5690P();
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
        getScrollingChildHelper().m3192m(z10);
    }

    public void setOnFlingListener(AbstractC1037t abstractC1037t) {
        this.f3884a0 = abstractC1037t;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1039v abstractC1039v) {
        this.f3904k0 = abstractC1039v;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f3894f0 = z10;
    }

    public void setRecycledViewPool(C1040w c1040w) {
        this.f3887c.m5684J(c1040w);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1042y interfaceC1042y) {
        this.f3911o = interfaceC1042y;
    }

    public void setScrollState(int i10) {
        if (i10 == this.f3875P) {
            return;
        }
        if (f3846G0) {
            Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.f3875P, new Exception());
        }
        this.f3875P = i10;
        if (i10 != 2) {
            m5267K1();
        }
        m5273N(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f3882W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f3882W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1019d0 abstractC1019d0) {
        this.f3887c.m5685K(abstractC1019d0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().m3194o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m3196q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f3933z) {
            m5339r("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f3933z = true;
                this.f3855A = true;
                m5264J1();
                return;
            }
            this.f3933z = false;
            if (this.f3931y && this.f3909n != null && this.f3907m != null) {
                requestLayout();
            }
            this.f3931y = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5345t() {
        m5333o1();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: t1 */
    public void m5346t1(int i10) {
        if (this.f3933z) {
            return;
        }
        m5264J1();
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1034q.mo5149C1(i10);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m5347u0(long j10, AbstractC1023f0 abstractC1023f0, AbstractC1023f0 abstractC1023f1) {
        int iM5881g = this.f3893f.m5881g();
        for (int i10 = 0; i10 < iM5881g; i10++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5880f(i10));
            if (abstractC1023f0M5232n0 != abstractC1023f0 && m5321k0(abstractC1023f0M5232n0) == j10) {
                AbstractC1025h abstractC1025h = this.f3907m;
                if (abstractC1025h == null || !abstractC1025h.m5477i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC1023f0M5232n0 + " \n View Holder 2:" + abstractC1023f0 + m5289V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC1023f0M5232n0 + " \n View Holder 2:" + abstractC1023f0 + m5289V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1023f1 + " cannot be found but it is necessary for " + abstractC1023f0 + m5289V());
    }

    /* JADX INFO: renamed from: u1 */
    public final void m5348u1(AbstractC1025h<?> abstractC1025h, boolean z10, boolean z11) {
        AbstractC1025h abstractC1025h2 = this.f3907m;
        if (abstractC1025h2 != null) {
            abstractC1025h2.m5468B(this.f3885b);
            this.f3907m.m5489u(this);
        }
        if (!z10 || z11) {
            m5311g1();
        }
        this.f3891e.m5853y();
        AbstractC1025h<?> abstractC1025h3 = this.f3907m;
        this.f3907m = abstractC1025h;
        if (abstractC1025h != null) {
            abstractC1025h.m5494z(this.f3885b);
            abstractC1025h.m5485q(this);
        }
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            abstractC1034q.mo5564J0(abstractC1025h3, this.f3907m);
        }
        this.f3887c.m5717y(abstractC1025h3, this.f3907m, z10);
        this.f3902j0.f3959g = true;
    }

    /* JADX INFO: renamed from: v */
    public void m5349v() {
        int iM5884j = this.f3893f.m5884j();
        for (int i10 = 0; i10 < iM5884j; i10++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5883i(i10));
            if (!abstractC1023f0M5232n0.m5429K()) {
                abstractC1023f0M5232n0.m5434c();
            }
        }
        this.f3887c.m5696d();
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m5350v0() {
        return !this.f3927w || this.f3865F || this.f3891e.m5844p();
    }

    /* JADX INFO: renamed from: v1 */
    public boolean m5351v1(AbstractC1023f0 abstractC1023f0, int i10) {
        if (!m5246D0()) {
            abstractC1023f0.f3981a.setImportantForAccessibility(i10);
            return true;
        }
        abstractC1023f0.f3997q = i10;
        this.f3928w0.add(abstractC1023f0);
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m5352w(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f3870K;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f3870K.onRelease();
            zIsFinished = this.f3870K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3872M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f3872M.onRelease();
            zIsFinished |= this.f3872M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3871L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f3871L.onRelease();
            zIsFinished |= this.f3871L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3873N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f3873N.onRelease();
            zIsFinished |= this.f3873N.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m5353w0() {
        int iM5881g = this.f3893f.m5881g();
        for (int i10 = 0; i10 < iM5881g; i10++) {
            AbstractC1023f0 abstractC1023f0M5232n0 = m5232n0(this.f3893f.m5880f(i10));
            if (abstractC1023f0M5232n0 != null && !abstractC1023f0M5232n0.m5429K() && abstractC1023f0M5232n0.m5457z()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w1 */
    public final boolean m5354w1(@NonNull EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return m5234t0(-i10) < C4427e.m22274b(edgeEffect) * ((float) i11);
    }

    /* JADX INFO: renamed from: x */
    public int m5355x(int i10) {
        return m5358y(i10, this.f3870K, this.f3872M, getWidth());
    }

    /* JADX INFO: renamed from: x0 */
    public void m5356x0() {
        this.f3891e = new C1050a(new C1024g());
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m5357x1(AccessibilityEvent accessibilityEvent) {
        if (!m5246D0()) {
            return false;
        }
        int iM48326a = accessibilityEvent != null ? C13003b.m48326a(accessibilityEvent) : 0;
        this.f3857B |= iM48326a != 0 ? iM48326a : 0;
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final int m5358y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && C4427e.m22274b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * C4427e.m22276d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || C4427e.m22274b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * C4427e.m22276d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: y0 */
    public final void m5359y0() {
        if (C0625o0.m3063y(this) == 0) {
            C0625o0.m3064y0(this, 8);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m5360y1(int i10, int i11) {
        m5363z1(i10, i11, null);
    }

    /* JADX INFO: renamed from: z */
    public int m5361z(int i10) {
        return m5358y(i10, this.f3871L, this.f3873N, getHeight());
    }

    /* JADX INFO: renamed from: z0 */
    public final void m5362z0() {
        this.f3893f = new C1054e(new C1022f());
    }

    /* JADX INFO: renamed from: z1 */
    public void m5363z1(int i10, int i11, Interpolator interpolator) {
        m5238A1(i10, i11, interpolator, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12009a.f42553a);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1011a();

        /* JADX INFO: renamed from: c */
        public Parcelable f3935c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public class C1011a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3935c = parcel.readParcelable(classLoader == null ? AbstractC1034q.class.getClassLoader() : classLoader);
        }

        /* JADX INFO: renamed from: f */
        public void m5364f(SavedState savedState) {
            this.f3935c = savedState.f3935c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3935c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3885b = new C1043z();
        this.f3887c = new C1041x();
        this.f3895g = new C1070u();
        this.f3899i = new RunnableC1012a();
        this.f3901j = new Rect();
        this.f3903k = new Rect();
        this.f3905l = new RectF();
        this.f3913p = new ArrayList();
        this.f3915q = new ArrayList<>();
        this.f3917r = new ArrayList<>();
        this.f3929x = 0;
        this.f3865F = false;
        this.f3866G = false;
        this.f3867H = 0;
        this.f3868I = 0;
        this.f3869J = f3854O0;
        this.f3874O = new C1055f();
        this.f3875P = 0;
        this.f3876Q = -1;
        this.f3890d0 = Float.MIN_VALUE;
        this.f3892e0 = Float.MIN_VALUE;
        this.f3894f0 = true;
        this.f3896g0 = new RunnableC1021e0();
        this.f3900i0 = f3851L0 ? new RunnableC1059j.b() : null;
        this.f3902j0 = new C1015b0();
        this.f3908m0 = false;
        this.f3910n0 = false;
        this.f3912o0 = new C1032o();
        this.f3914p0 = false;
        this.f3918r0 = new int[2];
        this.f3922t0 = new int[2];
        this.f3924u0 = new int[2];
        this.f3926v0 = new int[2];
        this.f3928w0 = new ArrayList();
        this.f3930x0 = new RunnableC1014b();
        this.f3934z0 = 0;
        this.f3856A0 = 0;
        this.f3860C0 = new C1018d();
        C1020e c1020e = new C1020e();
        this.f3862D0 = c1020e;
        this.f3864E0 = new C0603h(getContext(), c1020e);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3882W = viewConfiguration.getScaledTouchSlop();
        this.f3890d0 = C0631r0.m3164e(viewConfiguration, context);
        this.f3892e0 = C0631r0.m3167h(viewConfiguration, context);
        this.f3886b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3888c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3883a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3874O.m5531v(this.f3912o0);
        m5356x0();
        m5362z0();
        m5359y0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f3861D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1065p(this));
        int[] iArr = C12011c.f42557a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C0625o0.m3036k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(C12011c.f42566j);
        if (typedArrayObtainStyledAttributes.getInt(C12011c.f42560d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3897h = typedArrayObtainStyledAttributes.getBoolean(C12011c.f42559c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(C12011c.f42561e, false);
        this.f3925v = z10;
        if (z10) {
            m5237A0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C12011c.f42564h), typedArrayObtainStyledAttributes.getDrawable(C12011c.f42565i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C12011c.f42562f), typedArrayObtainStyledAttributes.getDrawable(C12011c.f42563g));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f3858B0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        m5239B(context, string, attributeSet, i10, 0);
        int[] iArr2 = f3847H0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        C0625o0.m3036k0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        C10427a.m40138d(this, true);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static class C1035r extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC1023f0 f4043a;

        /* JADX INFO: renamed from: b */
        public final Rect f4044b;

        /* JADX INFO: renamed from: c */
        public boolean f4045c;

        /* JADX INFO: renamed from: d */
        public boolean f4046d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1035r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4044b = new Rect();
            this.f4045c = true;
            this.f4046d = false;
        }

        /* JADX INFO: renamed from: a */
        public int m5648a() {
            return this.f4043a.m5442k();
        }

        /* JADX INFO: renamed from: b */
        public int m5649b() {
            return this.f4043a.m5445n();
        }

        /* JADX INFO: renamed from: c */
        public boolean m5650c() {
            return this.f4043a.m5457z();
        }

        /* JADX INFO: renamed from: d */
        public boolean m5651d() {
            return this.f4043a.m5454w();
        }

        /* JADX INFO: renamed from: e */
        public boolean m5652e() {
            return this.f4043a.m5452u();
        }

        public C1035r(int i10, int i11) {
            super(i10, i11);
            this.f4044b = new Rect();
            this.f4045c = true;
            this.f4046d = false;
        }

        public C1035r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4044b = new Rect();
            this.f4045c = true;
            this.f4046d = false;
        }

        public C1035r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4044b = new Rect();
            this.f4045c = true;
            this.f4046d = false;
        }

        public C1035r(C1035r c1035r) {
            super((ViewGroup.LayoutParams) c1035r);
            this.f4044b = new Rect();
            this.f4045c = true;
            this.f4046d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1034q abstractC1034q = this.f3909n;
        if (abstractC1034q != null) {
            return abstractC1034q.mo5079K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5289V());
    }
}
