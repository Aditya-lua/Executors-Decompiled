package com.google.android.material.bottomsheet;

import ad.C0146r;
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
import androidx.core.view.C0625o0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.customview.view.AbsSavedState;
import cd.C1624e;
import cd.InterfaceC1621b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mc.C8484a;
import p088e.BackEventCompat;
import p101ed.C5050c;
import p168hd.C6363g;
import p168hd.C6367k;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6745i;
import p194ic.C6746j;
import p194ic.C6747k;
import p400r3.C10782c;
import p426s2.C11162a;
import p564y2.C13017p;
import p564y2.InterfaceC13020s;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0524c<V> implements InterfaceC1621b {

    /* JADX INFO: renamed from: i0 */
    public static final int f9697i0 = C6746j.f26115g;

    /* JADX INFO: renamed from: A */
    public boolean f9698A;

    /* JADX INFO: renamed from: B */
    public final BottomSheetBehavior<V>.C2757h f9699B;

    /* JADX INFO: renamed from: C */
    public ValueAnimator f9700C;

    /* JADX INFO: renamed from: D */
    public int f9701D;

    /* JADX INFO: renamed from: E */
    public int f9702E;

    /* JADX INFO: renamed from: F */
    public int f9703F;

    /* JADX INFO: renamed from: G */
    public float f9704G;

    /* JADX INFO: renamed from: H */
    public int f9705H;

    /* JADX INFO: renamed from: I */
    public float f9706I;

    /* JADX INFO: renamed from: J */
    public boolean f9707J;

    /* JADX INFO: renamed from: K */
    public boolean f9708K;

    /* JADX INFO: renamed from: L */
    public boolean f9709L;

    /* JADX INFO: renamed from: M */
    public int f9710M;

    /* JADX INFO: renamed from: N */
    public int f9711N;

    /* JADX INFO: renamed from: O */
    public C10782c f9712O;

    /* JADX INFO: renamed from: P */
    public boolean f9713P;

    /* JADX INFO: renamed from: Q */
    public int f9714Q;

    /* JADX INFO: renamed from: R */
    public boolean f9715R;

    /* JADX INFO: renamed from: S */
    public float f9716S;

    /* JADX INFO: renamed from: T */
    public int f9717T;

    /* JADX INFO: renamed from: U */
    public int f9718U;

    /* JADX INFO: renamed from: V */
    public int f9719V;

    /* JADX INFO: renamed from: W */
    public WeakReference<V> f9720W;

    /* JADX INFO: renamed from: X */
    public WeakReference<View> f9721X;

    /* JADX INFO: renamed from: Y */
    public WeakReference<View> f9722Y;

    /* JADX INFO: renamed from: Z */
    @NonNull
    public final ArrayList<AbstractC2756g> f9723Z;

    /* JADX INFO: renamed from: a */
    public int f9724a;

    /* JADX INFO: renamed from: a0 */
    public VelocityTracker f9725a0;

    /* JADX INFO: renamed from: b */
    public boolean f9726b;

    /* JADX INFO: renamed from: b0 */
    public C1624e f9727b0;

    /* JADX INFO: renamed from: c */
    public boolean f9728c;

    /* JADX INFO: renamed from: c0 */
    public int f9729c0;

    /* JADX INFO: renamed from: d */
    public float f9730d;

    /* JADX INFO: renamed from: d0 */
    public int f9731d0;

    /* JADX INFO: renamed from: e */
    public int f9732e;

    /* JADX INFO: renamed from: e0 */
    public boolean f9733e0;

    /* JADX INFO: renamed from: f */
    public int f9734f;

    /* JADX INFO: renamed from: f0 */
    public Map<View, Integer> f9735f0;

    /* JADX INFO: renamed from: g */
    public boolean f9736g;

    /* JADX INFO: renamed from: g0 */
    public final SparseIntArray f9737g0;

    /* JADX INFO: renamed from: h */
    public int f9738h;

    /* JADX INFO: renamed from: h0 */
    public final C10782c.c f9739h0;

    /* JADX INFO: renamed from: i */
    public int f9740i;

    /* JADX INFO: renamed from: j */
    public C6363g f9741j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f9742k;

    /* JADX INFO: renamed from: l */
    public int f9743l;

    /* JADX INFO: renamed from: m */
    public int f9744m;

    /* JADX INFO: renamed from: n */
    public int f9745n;

    /* JADX INFO: renamed from: o */
    public boolean f9746o;

    /* JADX INFO: renamed from: p */
    public boolean f9747p;

    /* JADX INFO: renamed from: q */
    public boolean f9748q;

    /* JADX INFO: renamed from: r */
    public boolean f9749r;

    /* JADX INFO: renamed from: s */
    public boolean f9750s;

    /* JADX INFO: renamed from: t */
    public boolean f9751t;

    /* JADX INFO: renamed from: u */
    public boolean f9752u;

    /* JADX INFO: renamed from: v */
    public boolean f9753v;

    /* JADX INFO: renamed from: w */
    public int f9754w;

    /* JADX INFO: renamed from: x */
    public int f9755x;

    /* JADX INFO: renamed from: y */
    public boolean f9756y;

    /* JADX INFO: renamed from: z */
    public C6367k f9757z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC2750a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f9763a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f9764b;

        public RunnableC2750a(View view, int i10) {
            this.f9763a = view;
            this.f9764b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m12140g1(this.f9763a, this.f9764b, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C2751b extends AnimatorListenerAdapter {
        public C2751b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.m12126Y0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.f9720W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.f9720W.get().requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C2752c implements ValueAnimator.AnimatorUpdateListener {
        public C2752c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f9741j != null) {
                BottomSheetBehavior.this.f9741j.m27720b0(fFloatValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C2753d implements C0146r.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f9768a;

        public C2753d(boolean z10) {
            this.f9768a = z10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // ad.C0146r.c
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo461a(View view, WindowInsetsCompat windowInsetsCompat, C0146r.d dVar) {
            boolean z10;
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures());
            BottomSheetBehavior.this.f9755x = insets.top;
            boolean zM453h = C0146r.m453h(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f9747p) {
                BottomSheetBehavior.this.f9754w = windowInsetsCompat.getSystemWindowInsetBottom();
                paddingBottom = dVar.f513d + BottomSheetBehavior.this.f9754w;
            }
            if (BottomSheetBehavior.this.f9748q) {
                paddingLeft = (zM453h ? dVar.f512c : dVar.f510a) + insets.left;
            }
            if (BottomSheetBehavior.this.f9749r) {
                paddingRight = (zM453h ? dVar.f510a : dVar.f512c) + insets.right;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f9751t) {
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
            if (BottomSheetBehavior.this.f9752u) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = insets.right;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
            }
            if (BottomSheetBehavior.this.f9753v) {
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
            if (this.f9768a) {
                BottomSheetBehavior.this.f9745n = insets2.bottom;
            }
            if (!BottomSheetBehavior.this.f9747p && !this.f9768a) {
                return windowInsetsCompat;
            }
            BottomSheetBehavior.this.m12150l1(false);
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class C2754e extends C10782c.c {

        /* JADX INFO: renamed from: a */
        public long f9770a;

        public C2754e() {
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: a */
        public int mo12015a(@NonNull View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: b */
        public int mo12016b(@NonNull View view, int i10, int i11) {
            return C11162a.m42060c(i10, BottomSheetBehavior.this.m12156s0(), mo12167e(view));
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: e */
        public int mo12167e(@NonNull View view) {
            return BottomSheetBehavior.this.m12145j0() ? BottomSheetBehavior.this.f9719V : BottomSheetBehavior.this.f9705H;
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: j */
        public void mo12019j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f9709L) {
                BottomSheetBehavior.this.m12126Y0(1);
            }
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: k */
        public void mo12020k(@NonNull View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.m12153o0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: l */
        public void mo12021l(@NonNull View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f9707J && bottomSheetBehavior.m12134d1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f9732e) || m12168n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.f9726b || Math.abs(view.getTop() - BottomSheetBehavior.this.m12156s0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f9703F)) {
                        i10 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f9726b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.f9703F;
                        if (top < i11) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f9705H)) {
                                i10 = 3;
                            } else if (BottomSheetBehavior.this.m12136e1()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.f9705H) || BottomSheetBehavior.this.m12136e1()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f9702E) < Math.abs(top - BottomSheetBehavior.this.f9705H)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (BottomSheetBehavior.this.f9726b) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f9703F) >= Math.abs(top2 - BottomSheetBehavior.this.f9705H) || BottomSheetBehavior.this.m12136e1()) {
                        i10 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f9726b) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f9770a;
                if (BottomSheetBehavior.this.m12136e1()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.m12130b1(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.f9719V)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f9703F) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.m12140g1(view, i10, bottomSheetBehavior4.m12138f1());
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: m */
        public boolean mo12022m(@NonNull View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f9710M;
            if (i11 == 1 || bottomSheetBehavior.f9733e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f9729c0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f9722Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f9770a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f9720W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        /* JADX INFO: renamed from: n */
        public final boolean m12168n(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f9719V + bottomSheetBehavior.m12156s0()) / 2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class C2755f implements InterfaceC13020s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f9772a;

        public C2755f(int i10) {
            this.f9772a = i10;
        }

        @Override // p564y2.InterfaceC13020s
        /* JADX INFO: renamed from: a */
        public boolean mo6223a(@NonNull View view, InterfaceC13020s.a aVar) {
            BottomSheetBehavior.this.m12125X0(this.f9772a);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public static abstract class AbstractC2756g {
        /* JADX INFO: renamed from: a */
        public void mo12169a(@NonNull View view) {
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo12170b(@NonNull View view, float f10);

        /* JADX INFO: renamed from: c */
        public abstract void mo12171c(@NonNull View view, int i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomSheetBehavior() {
        this.f9724a = 0;
        this.f9726b = true;
        this.f9728c = false;
        this.f9743l = -1;
        this.f9744m = -1;
        this.f9699B = new C2757h(this, null);
        this.f9704G = 0.5f;
        this.f9706I = -1.0f;
        this.f9709L = true;
        this.f9710M = 4;
        this.f9711N = 4;
        this.f9716S = 0.1f;
        this.f9723Z = new ArrayList<>();
        this.f9731d0 = -1;
        this.f9737g0 = new SparseIntArray();
        this.f9739h0 = new C2754e();
    }

    /* JADX INFO: renamed from: H0 */
    private void m12082H0() {
        this.f9729c0 = -1;
        this.f9731d0 = -1;
        VelocityTracker velocityTracker = this.f9725a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9725a0 = null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: q0 */
    public static <V extends View> BottomSheetBehavior<V> m12102q0(@NonNull V v5) {
        ViewGroup.LayoutParams layoutParams = v5.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0527f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.AbstractC0524c abstractC0524cM2632f = ((CoordinatorLayout.C0527f) layoutParams).m2632f();
        if (abstractC0524cM2632f instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC0524cM2632f;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m12103A0() {
        return this.f9746o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: B */
    public void mo2598B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2598B(coordinatorLayout, v5, savedState.m3321a());
        m12110I0(savedState);
        int i10 = savedState.f9758c;
        if (i10 == 1 || i10 == 2) {
            this.f9710M = 4;
            this.f9711N = 4;
        } else {
            this.f9710M = i10;
            this.f9711N = i10;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m12104B0() {
        return this.f9707J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    @NonNull
    /* JADX INFO: renamed from: C */
    public Parcelable mo2599C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
        return new SavedState(super.mo2599C(coordinatorLayout, v5), (BottomSheetBehavior<?>) this);
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m12105C0() {
        return true;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m12106D0(V v5) {
        ViewParent parent = v5.getParent();
        return parent != null && parent.isLayoutRequested() && C0625o0.m3005Q(v5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: E */
    public boolean mo2601E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
        this.f9714Q = 0;
        this.f9715R = false;
        return (i10 & 2) != 0;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m12107E0() {
        return true;
    }

    /* JADX INFO: renamed from: F0 */
    public void m12108F0(@NonNull AbstractC2756g abstractC2756g) {
        this.f9723Z.remove(abstractC2756g);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: G */
    public void mo2603G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10) {
        WeakReference<View> weakReference;
        int i11 = 3;
        if (v5.getTop() == m12156s0()) {
            m12126Y0(3);
            return;
        }
        if (!m12107E0() || ((weakReference = this.f9722Y) != null && view == weakReference.get() && this.f9715R)) {
            if (this.f9714Q > 0) {
                if (!this.f9726b && v5.getTop() > this.f9703F) {
                    i11 = 6;
                }
            } else if (this.f9707J && m12134d1(v5, m12161x0())) {
                i11 = 5;
            } else if (this.f9714Q == 0) {
                int top = v5.getTop();
                if (!this.f9726b) {
                    int i12 = this.f9703F;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.f9705H)) {
                            if (m12136e1()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.f9705H)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.f9702E) >= Math.abs(top - this.f9705H)) {
                    i11 = 4;
                }
            } else {
                if (!this.f9726b) {
                    int top2 = v5.getTop();
                    if (Math.abs(top2 - this.f9703F) < Math.abs(top2 - this.f9705H)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            m12140g1(v5, i11, false);
            this.f9715R = false;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m12109G0(View view, C13017p.a aVar, int i10) {
        C0625o0.m3032i0(view, aVar, null, m12149l0(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: H */
    public boolean mo2604H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9710M == 1 && actionMasked == 0) {
            return true;
        }
        if (m12132c1()) {
            this.f9712O.m41101z(motionEvent);
        }
        if (actionMasked == 0) {
            m12082H0();
        }
        if (this.f9725a0 == null) {
            this.f9725a0 = VelocityTracker.obtain();
        }
        this.f9725a0.addMovement(motionEvent);
        if (m12132c1() && actionMasked == 2 && !this.f9713P && Math.abs(this.f9731d0 - motionEvent.getY()) > this.f9712O.m41096u()) {
            this.f9712O.m41079b(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f9713P;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m12110I0(@NonNull SavedState savedState) {
        int i10 = this.f9724a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f9734f = savedState.f9759d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f9726b = savedState.f9760e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f9707J = savedState.f9761f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f9708K = savedState.f9762g;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m12111J0(V v5, Runnable runnable) {
        if (m12106D0(v5)) {
            v5.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m12112K0(boolean z10) {
        this.f9709L = z10;
    }

    /* JADX INFO: renamed from: L0 */
    public void m12113L0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f9701D = i10;
        m12146j1(this.f9710M, true);
    }

    /* JADX INFO: renamed from: M0 */
    public void m12114M0(boolean z10) {
        if (this.f9726b == z10) {
            return;
        }
        this.f9726b = z10;
        if (this.f9720W != null) {
            m12133d0();
        }
        m12126Y0((this.f9726b && this.f9710M == 6) ? 3 : this.f9710M);
        m12146j1(this.f9710M, true);
        m12142h1();
    }

    /* JADX INFO: renamed from: N0 */
    public void m12115N0(boolean z10) {
        this.f9746o = z10;
    }

    /* JADX INFO: renamed from: O0 */
    public void m12116O0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f9704G = f10;
        if (this.f9720W != null) {
            m12137f0();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m12117P0(boolean z10) {
        if (this.f9707J != z10) {
            this.f9707J = z10;
            if (!z10 && this.f9710M == 5) {
                m12125X0(4);
            }
            m12142h1();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m12118Q0(int i10) {
        this.f9744m = i10;
    }

    /* JADX INFO: renamed from: R0 */
    public void m12119R0(int i10) {
        this.f9743l = i10;
    }

    /* JADX INFO: renamed from: S0 */
    public void m12120S0(int i10) {
        m12121T0(i10, false);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m12121T0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f9736g) {
                return;
            } else {
                this.f9736g = true;
            }
        } else {
            if (!this.f9736g && this.f9734f == i10) {
                return;
            }
            this.f9736g = false;
            this.f9734f = Math.max(0, i10);
        }
        m12150l1(z10);
    }

    /* JADX INFO: renamed from: U0 */
    public void m12122U0(int i10) {
        this.f9724a = i10;
    }

    /* JADX INFO: renamed from: V0 */
    public void m12123V0(int i10) {
        this.f9732e = i10;
    }

    /* JADX INFO: renamed from: W0 */
    public void m12124W0(boolean z10) {
        this.f9708K = z10;
    }

    /* JADX INFO: renamed from: X0 */
    public void m12125X0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f9707J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f9726b && m12160w0(i10) <= this.f9702E) ? 3 : i10;
        WeakReference<V> weakReference = this.f9720W;
        if (weakReference == null || weakReference.get() == null) {
            m12126Y0(i10);
        } else {
            V v5 = this.f9720W.get();
            m12111J0(v5, new RunnableC2750a(v5, i11));
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m12126Y0(int i10) {
        V v5;
        if (this.f9710M == i10) {
            return;
        }
        this.f9710M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f9707J && i10 == 5)) {
            this.f9711N = i10;
        }
        WeakReference<V> weakReference = this.f9720W;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            m12148k1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            m12148k1(false);
        }
        m12146j1(i10, true);
        for (int i11 = 0; i11 < this.f9723Z.size(); i11++) {
            this.f9723Z.get(i11).mo12171c(v5, i10);
        }
        m12142h1();
    }

    /* JADX INFO: renamed from: Z0 */
    public void m12127Z0(boolean z10) {
        this.f9728c = z10;
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: a */
    public void mo8192a(@NonNull BackEventCompat backEventCompat) {
        C1624e c1624e = this.f9727b0;
        if (c1624e == null) {
            return;
        }
        c1624e.m8210l(backEventCompat);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m12128a1(@NonNull View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || m12103A0() || this.f9736g) ? false : true;
        if (this.f9747p || this.f9748q || this.f9749r || this.f9751t || this.f9752u || this.f9753v || z10) {
            C0146r.m448c(view, new C2753d(z10));
        }
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: b */
    public void mo8193b() {
        C1624e c1624e = this.f9727b0;
        if (c1624e == null) {
            return;
        }
        c1624e.m8204f();
    }

    /* JADX INFO: renamed from: b0 */
    public final int m12129b0(View view, int i10, int i11) {
        return C0625o0.m3019c(view, view.getResources().getString(i10), m12149l0(i11));
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m12130b1(long j10, float f10) {
        return false;
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: c */
    public void mo8194c(@NonNull BackEventCompat backEventCompat) {
        C1624e c1624e = this.f9727b0;
        if (c1624e == null) {
            return;
        }
        c1624e.m8208j(backEventCompat);
    }

    /* JADX INFO: renamed from: c0 */
    public void m12131c0(@NonNull AbstractC2756g abstractC2756g) {
        if (this.f9723Z.contains(abstractC2756g)) {
            return;
        }
        this.f9723Z.add(abstractC2756g);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m12132c1() {
        if (this.f9712O != null) {
            return this.f9709L || this.f9710M == 1;
        }
        return false;
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: d */
    public void mo8195d() {
        C1624e c1624e = this.f9727b0;
        if (c1624e == null) {
            return;
        }
        BackEventCompat backEventCompatM8189c = c1624e.m8189c();
        if (backEventCompatM8189c == null || Build.VERSION.SDK_INT < 34) {
            m12125X0(this.f9707J ? 5 : 4);
        } else if (this.f9707J) {
            this.f9727b0.m8206h(backEventCompatM8189c, new C2751b());
        } else {
            this.f9727b0.m8207i(backEventCompatM8189c, null);
            m12125X0(4);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m12133d0() {
        int iM12141h0 = m12141h0();
        if (this.f9726b) {
            this.f9705H = Math.max(this.f9719V - iM12141h0, this.f9702E);
        } else {
            this.f9705H = this.f9719V - iM12141h0;
        }
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m12134d1(@NonNull View view, float f10) {
        if (this.f9708K) {
            return true;
        }
        if (m12105C0() && view.getTop() >= this.f9705H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f9716S)) - ((float) this.f9705H)) / ((float) m12141h0()) > 0.5f;
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final float m12135e0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m12136e1() {
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m12137f0() {
        this.f9703F = (int) (this.f9719V * (1.0f - this.f9704G));
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m12138f1() {
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final float m12139g0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f9741j == null || (weakReference = this.f9720W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v5 = this.f9720W.get();
        if (!m12162y0() || (rootWindowInsets = v5.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(m12135e0(this.f9741j.m27703J(), rootWindowInsets.getRoundedCorner(0)), m12135e0(this.f9741j.m27704K(), rootWindowInsets.getRoundedCorner(1)));
    }

    /* JADX INFO: renamed from: g1 */
    public final void m12140g1(View view, int i10, boolean z10) {
        int iM12160w0 = m12160w0(i10);
        C10782c c10782c = this.f9712O;
        if (c10782c == null || (!z10 ? c10782c.m41076H(view, view.getLeft(), iM12160w0) : c10782c.m41074F(view.getLeft(), iM12160w0))) {
            m12126Y0(i10);
            return;
        }
        m12126Y0(2);
        m12146j1(i10, true);
        this.f9699B.m12174c(i10);
    }

    /* JADX INFO: renamed from: h0 */
    public final int m12141h0() {
        int i10;
        if (this.f9736g) {
            return Math.min(Math.max(this.f9738h, this.f9719V - ((this.f9718U * 9) / 16)), this.f9717T) + this.f9754w;
        }
        return (this.f9746o || this.f9747p || (i10 = this.f9745n) <= 0) ? this.f9734f + this.f9754w : Math.max(this.f9734f, i10 + this.f9740i);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m12142h1() {
        WeakReference<V> weakReference = this.f9720W;
        if (weakReference != null) {
            m12144i1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f9721X;
        if (weakReference2 != null) {
            m12144i1(weakReference2.get(), 1);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final float m12143i0(int i10) {
        float f10;
        float fM12156s0;
        int i11 = this.f9705H;
        if (i10 > i11 || i11 == m12156s0()) {
            int i12 = this.f9705H;
            f10 = i12 - i10;
            fM12156s0 = this.f9719V - i12;
        } else {
            int i13 = this.f9705H;
            f10 = i13 - i10;
            fM12156s0 = i13 - m12156s0();
        }
        return f10 / fM12156s0;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m12144i1(View view, int i10) {
        if (view == null) {
            return;
        }
        m12147k0(view, i10);
        if (!this.f9726b && this.f9710M != 6) {
            this.f9737g0.put(i10, m12129b0(view, C6745i.f26082a, 6));
        }
        if (this.f9707J && m12105C0() && this.f9710M != 5) {
            m12109G0(view, C13017p.a.f46083y, 5);
        }
        int i11 = this.f9710M;
        if (i11 == 3) {
            m12109G0(view, C13017p.a.f46082x, this.f9726b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            m12109G0(view, C13017p.a.f46081w, this.f9726b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            m12109G0(view, C13017p.a.f46082x, 4);
            m12109G0(view, C13017p.a.f46081w, 3);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m12145j0() {
        return m12104B0() && m12105C0();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m12146j1(int i10, boolean z10) {
        boolean zM12163z0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f9698A == (zM12163z0 = m12163z0()) || this.f9741j == null) {
            return;
        }
        this.f9698A = zM12163z0;
        if (!z10 || (valueAnimator = this.f9700C) == null) {
            ValueAnimator valueAnimator2 = this.f9700C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f9700C.cancel();
            }
            this.f9741j.m27720b0(this.f9698A ? m12139g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f9700C.reverse();
        } else {
            this.f9700C.setFloatValues(this.f9741j.m27750y(), zM12163z0 ? m12139g0() : 1.0f);
            this.f9700C.start();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: k */
    public void mo2611k(@NonNull CoordinatorLayout.C0527f c0527f) {
        super.mo2611k(c0527f);
        this.f9720W = null;
        this.f9712O = null;
        this.f9727b0 = null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m12147k0(View view, int i10) {
        if (view == null) {
            return;
        }
        C0625o0.m3028g0(view, 524288);
        C0625o0.m3028g0(view, 262144);
        C0625o0.m3028g0(view, 1048576);
        int i11 = this.f9737g0.get(i10, -1);
        if (i11 != -1) {
            C0625o0.m3028g0(view, i11);
            this.f9737g0.delete(i10);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m12148k1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f9720W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f9735f0 != null) {
                    return;
                } else {
                    this.f9735f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f9720W.get()) {
                    if (z10) {
                        this.f9735f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f9728c) {
                            C0625o0.m3060w0(childAt, 4);
                        }
                    } else if (this.f9728c && (map = this.f9735f0) != null && map.containsKey(childAt)) {
                        C0625o0.m3060w0(childAt, this.f9735f0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f9735f0 = null;
            } else if (this.f9728c) {
                this.f9720W.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final InterfaceC13020s m12149l0(int i10) {
        return new C2755f(i10);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m12150l1(boolean z10) {
        V v5;
        if (this.f9720W != null) {
            m12133d0();
            if (this.f9710M != 4 || (v5 = this.f9720W.get()) == null) {
                return;
            }
            if (z10) {
                m12125X0(4);
            } else {
                v5.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m12151m0(@NonNull Context context) {
        if (this.f9757z == null) {
            return;
        }
        C6363g c6363g = new C6363g(this.f9757z);
        this.f9741j = c6363g;
        c6363g.m27710Q(context);
        ColorStateList colorStateList = this.f9742k;
        if (colorStateList != null) {
            this.f9741j.m27719a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f9741j.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: n */
    public void mo2614n() {
        super.mo2614n();
        this.f9720W = null;
        this.f9712O = null;
        this.f9727b0 = null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m12152n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m12139g0(), 1.0f);
        this.f9700C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f9700C.addUpdateListener(new C2752c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: o */
    public boolean mo2615o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        int i10;
        C10782c c10782c;
        if (!v5.isShown() || !this.f9709L) {
            this.f9713P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m12082H0();
        }
        if (this.f9725a0 == null) {
            this.f9725a0 = VelocityTracker.obtain();
        }
        this.f9725a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f9731d0 = (int) motionEvent.getY();
            if (this.f9710M != 2) {
                WeakReference<View> weakReference = this.f9722Y;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m2558B(view, x10, this.f9731d0)) {
                    this.f9729c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f9733e0 = true;
                }
            }
            this.f9713P = this.f9729c0 == -1 && !coordinatorLayout.m2558B(v5, x10, this.f9731d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9733e0 = false;
            this.f9729c0 = -1;
            if (this.f9713P) {
                this.f9713P = false;
                return false;
            }
        }
        if (!this.f9713P && (c10782c = this.f9712O) != null && c10782c.m41075G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f9722Y;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f9713P || this.f9710M == 1 || coordinatorLayout.m2558B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f9712O == null || (i10 = this.f9731d0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f9712O.m41096u())) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m12153o0(int i10) {
        V v5 = this.f9720W.get();
        if (v5 == null || this.f9723Z.isEmpty()) {
            return;
        }
        float fM12143i0 = m12143i0(i10);
        for (int i11 = 0; i11 < this.f9723Z.size(); i11++) {
            this.f9723Z.get(i11).mo12170b(v5, fM12143i0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: p */
    public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        if (C0625o0.m3059w(coordinatorLayout) && !C0625o0.m3059w(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.f9720W == null) {
            this.f9738h = coordinatorLayout.getResources().getDimensionPixelSize(C6740d.f25956a);
            m12128a1(v5);
            C0625o0.m2993H0(v5, new C8484a(v5));
            this.f9720W = new WeakReference<>(v5);
            this.f9727b0 = new C1624e(v5);
            C6363g c6363g = this.f9741j;
            if (c6363g != null) {
                C0625o0.m3048q0(v5, c6363g);
                C6363g c6363g2 = this.f9741j;
                float fM3055u = this.f9706I;
                if (fM3055u == -1.0f) {
                    fM3055u = C0625o0.m3055u(v5);
                }
                c6363g2.m27718Z(fM3055u);
            } else {
                ColorStateList colorStateList = this.f9742k;
                if (colorStateList != null) {
                    C0625o0.m3050r0(v5, colorStateList);
                }
            }
            m12142h1();
            if (C0625o0.m3061x(v5) == 0) {
                C0625o0.m3060w0(v5, 1);
            }
        }
        if (this.f9712O == null) {
            this.f9712O = C10782c.m41068m(coordinatorLayout, this.f9739h0);
        }
        int top = v5.getTop();
        coordinatorLayout.m2565I(v5, i10);
        this.f9718U = coordinatorLayout.getWidth();
        this.f9719V = coordinatorLayout.getHeight();
        int height = v5.getHeight();
        this.f9717T = height;
        int iMin = this.f9719V;
        int i11 = iMin - height;
        int i12 = this.f9755x;
        if (i11 < i12) {
            if (this.f9750s) {
                int i13 = this.f9744m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f9717T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f9744m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f9717T = iMin2;
            }
        }
        this.f9702E = Math.max(0, this.f9719V - this.f9717T);
        m12137f0();
        m12133d0();
        int i15 = this.f9710M;
        if (i15 == 3) {
            C0625o0.m3012X(v5, m12156s0());
        } else if (i15 == 6) {
            C0625o0.m3012X(v5, this.f9703F);
        } else if (this.f9707J && i15 == 5) {
            C0625o0.m3012X(v5, this.f9719V);
        } else if (i15 == 4) {
            C0625o0.m3012X(v5, this.f9705H);
        } else if (i15 == 1 || i15 == 2) {
            C0625o0.m3012X(v5, top - v5.getTop());
        }
        m12146j1(this.f9710M, false);
        this.f9722Y = new WeakReference<>(m12154p0(v5));
        for (int i16 = 0; i16 < this.f9723Z.size(); i16++) {
            this.f9723Z.get(i16).mo12169a(v5);
        }
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public View m12154p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (C0625o0.m3007S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewM12154p0 = m12154p0(viewGroup.getChildAt(i10));
                if (viewM12154p0 != null) {
                    return viewM12154p0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: q */
    public boolean mo2617q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        v5.measure(m12155r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f9743l, marginLayoutParams.width), m12155r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f9744m, marginLayoutParams.height));
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final int m12155r0(int i10, int i11, int i12, int i13) {
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
        return View.MeasureSpec.makeMeasureSpec(i12, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: s */
    public boolean mo2619s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11) {
        WeakReference<View> weakReference;
        return m12107E0() && (weakReference = this.f9722Y) != null && view == weakReference.get() && (this.f9710M != 3 || super.mo2619s(coordinatorLayout, v5, view, f10, f11));
    }

    /* JADX INFO: renamed from: s0 */
    public int m12156s0() {
        if (this.f9726b) {
            return this.f9702E;
        }
        return Math.max(this.f9701D, this.f9750s ? 0 : this.f9755x);
    }

    /* JADX INFO: renamed from: t0 */
    public C6363g m12157t0() {
        return this.f9741j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: u */
    public void mo2621u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f9722Y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!m12107E0() || view == view2) {
            int top = v5.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < m12156s0()) {
                    int iM12156s0 = top - m12156s0();
                    iArr[1] = iM12156s0;
                    C0625o0.m3012X(v5, -iM12156s0);
                    m12126Y0(3);
                } else {
                    if (!this.f9709L) {
                        return;
                    }
                    iArr[1] = i11;
                    C0625o0.m3012X(v5, -i11);
                    m12126Y0(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.f9705H && !m12145j0()) {
                    int i14 = top - this.f9705H;
                    iArr[1] = i14;
                    C0625o0.m3012X(v5, -i14);
                    m12126Y0(4);
                } else {
                    if (!this.f9709L) {
                        return;
                    }
                    iArr[1] = i11;
                    C0625o0.m3012X(v5, -i11);
                    m12126Y0(1);
                }
            }
            m12153o0(v5.getTop());
            this.f9714Q = i11;
            this.f9715R = true;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public int m12158u0() {
        if (this.f9736g) {
            return -1;
        }
        return this.f9734f;
    }

    /* JADX INFO: renamed from: v0 */
    public int m12159v0() {
        return this.f9710M;
    }

    /* JADX INFO: renamed from: w0 */
    public final int m12160w0(int i10) {
        if (i10 == 3) {
            return m12156s0();
        }
        if (i10 == 4) {
            return this.f9705H;
        }
        if (i10 == 5) {
            return this.f9719V;
        }
        if (i10 == 6) {
            return this.f9703F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: x */
    public void mo2624x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
    }

    /* JADX INFO: renamed from: x0 */
    public final float m12161x0() {
        VelocityTracker velocityTracker = this.f9725a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f9730d);
        return this.f9725a0.getYVelocity(this.f9729c0);
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m12162y0() {
        WeakReference<V> weakReference = this.f9720W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.f9720W.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m12163z0() {
        if (this.f9710M == 3) {
            return this.f9756y || m12162y0();
        }
        return false;
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    public class C2757h {

        /* JADX INFO: renamed from: a */
        public int f9774a;

        /* JADX INFO: renamed from: b */
        public boolean f9775b;

        /* JADX INFO: renamed from: c */
        public final Runnable f9776c;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2757h.this.f9775b = false;
                C10782c c10782c = BottomSheetBehavior.this.f9712O;
                if (c10782c != null && c10782c.m41088k(true)) {
                    C2757h c2757h = C2757h.this;
                    c2757h.m12174c(c2757h.f9774a);
                    return;
                }
                C2757h c2757h2 = C2757h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f9710M == 2) {
                    bottomSheetBehavior.m12126Y0(c2757h2.f9774a);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C2757h() {
            this.f9776c = new a();
        }

        /* JADX INFO: renamed from: c */
        public void m12174c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f9720W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f9774a = i10;
            if (this.f9775b) {
                return;
            }
            C0625o0.m3024e0(BottomSheetBehavior.this.f9720W.get(), this.f9776c);
            this.f9775b = true;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.google.android.material.bottomsheet.BottomSheetBehavior) A[MD:(com.google.android.material.bottomsheet.BottomSheetBehavior):void (m)] (LINE:3) call: com.google.android.material.bottomsheet.BottomSheetBehavior.h.<init>(com.google.android.material.bottomsheet.BottomSheetBehavior):void type: THIS */
        public /* synthetic */ C2757h(BottomSheetBehavior bottomSheetBehavior, RunnableC2750a runnableC2750a) {
            this();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2749a();

        /* JADX INFO: renamed from: c */
        public final int f9758c;

        /* JADX INFO: renamed from: d */
        public int f9759d;

        /* JADX INFO: renamed from: e */
        public boolean f9760e;

        /* JADX INFO: renamed from: f */
        public boolean f9761f;

        /* JADX INFO: renamed from: g */
        public boolean f9762g;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        public class C2749a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9758c = parcel.readInt();
            this.f9759d = parcel.readInt();
            this.f9760e = parcel.readInt() == 1;
            this.f9761f = parcel.readInt() == 1;
            this.f9762g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9758c);
            parcel.writeInt(this.f9759d);
            parcel.writeInt(this.f9760e ? 1 : 0);
            parcel.writeInt(this.f9761f ? 1 : 0);
            parcel.writeInt(this.f9762g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f9758c = bottomSheetBehavior.f9710M;
            this.f9759d = bottomSheetBehavior.f9734f;
            this.f9760e = bottomSheetBehavior.f9726b;
            this.f9761f = bottomSheetBehavior.f9707J;
            this.f9762g = bottomSheetBehavior.f9708K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f9724a = 0;
        this.f9726b = true;
        this.f9728c = false;
        this.f9743l = -1;
        this.f9744m = -1;
        this.f9699B = new C2757h(this, null);
        this.f9704G = 0.5f;
        this.f9706I = -1.0f;
        this.f9709L = true;
        this.f9710M = 4;
        this.f9711N = 4;
        this.f9716S = 0.1f;
        this.f9723Z = new ArrayList<>();
        this.f9731d0 = -1;
        this.f9737g0 = new SparseIntArray();
        this.f9739h0 = new C2754e();
        this.f9740i = context.getResources().getDimensionPixelSize(C6740d.f25961c0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26216J);
        int i11 = C6747k.f26252N;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f9742k = C5050c.m23736a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6747k.f26418f0)) {
            this.f9757z = C6367k.m27766e(context, attributeSet, C6738b.f25889c, f9697i0).m27806m();
        }
        m12151m0(context);
        m12152n0();
        this.f9706I = typedArrayObtainStyledAttributes.getDimension(C6747k.f26243M, -1.0f);
        int i12 = C6747k.f26225K;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            m12119R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = C6747k.f26234L;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            m12118Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = C6747k.f26306T;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            m12120S0(i10);
        } else {
            m12120S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        m12117P0(typedArrayObtainStyledAttributes.getBoolean(C6747k.f26297S, false));
        m12115N0(typedArrayObtainStyledAttributes.getBoolean(C6747k.f26342X, false));
        m12114M0(typedArrayObtainStyledAttributes.getBoolean(C6747k.f26279Q, true));
        m12124W0(typedArrayObtainStyledAttributes.getBoolean(C6747k.f26333W, false));
        m12112K0(typedArrayObtainStyledAttributes.getBoolean(C6747k.f26261O, true));
        m12122U0(typedArrayObtainStyledAttributes.getInt(C6747k.f26315U, 0));
        m12116O0(typedArrayObtainStyledAttributes.getFloat(C6747k.f26288R, 0.5f));
        int i15 = C6747k.f26270P;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            m12113L0(typedValuePeekValue2.data);
        } else {
            m12113L0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        m12123V0(typedArrayObtainStyledAttributes.getInt(C6747k.f26324V, 500));
        this.f9747p = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26380b0, false);
        this.f9748q = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26390c0, false);
        this.f9749r = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26400d0, false);
        this.f9750s = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26409e0, true);
        this.f9751t = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26351Y, false);
        this.f9752u = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26360Z, false);
        this.f9753v = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26370a0, false);
        this.f9756y = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26427g0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f9730d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
