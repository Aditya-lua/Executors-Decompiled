package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.C0582a;
import androidx.core.view.C0598f0;
import androidx.core.view.C0603h;
import androidx.core.view.C0625o0;
import androidx.core.view.C0632s;
import androidx.core.view.C0636u;
import androidx.core.view.C0642x;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.InterfaceC0601g0;
import androidx.core.view.InterfaceC0606i;
import androidx.core.view.InterfaceC0634t;
import androidx.core.view.InterfaceC0640w;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import p066d3.C4427e;
import p206j2.C7019a;
import p564y2.C13017p;
import p564y2.C13019r;

/* JADX WARN: Classes with same name are omitted, all sources:
  classes.dex
  classes4.dex
 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0640w, InterfaceC0634t, InterfaceC0601g0 {

    /* JADX INFO: renamed from: E */
    public static final float f2503E = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: F */
    public static final C0652a f2504F = new C0652a();

    /* JADX INFO: renamed from: G */
    public static final int[] f2505G = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public float f2506A;

    /* JADX INFO: renamed from: B */
    public InterfaceC0656e f2507B;

    /* JADX INFO: renamed from: C */
    public final C0655d f2508C;

    /* JADX INFO: renamed from: D */
    public C0603h f2509D;

    /* JADX INFO: renamed from: a */
    public final float f2510a;

    /* JADX INFO: renamed from: b */
    public long f2511b;

    /* JADX INFO: renamed from: c */
    public final Rect f2512c;

    /* JADX INFO: renamed from: d */
    public OverScroller f2513d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f2514e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f2515f;

    /* JADX INFO: renamed from: g */
    public C0598f0 f2516g;

    /* JADX INFO: renamed from: h */
    public int f2517h;

    /* JADX INFO: renamed from: i */
    public boolean f2518i;

    /* JADX INFO: renamed from: j */
    public boolean f2519j;

    /* JADX INFO: renamed from: k */
    public View f2520k;

    /* JADX INFO: renamed from: l */
    public boolean f2521l;

    /* JADX INFO: renamed from: m */
    public VelocityTracker f2522m;

    /* JADX INFO: renamed from: n */
    public boolean f2523n;

    /* JADX INFO: renamed from: o */
    public boolean f2524o;

    /* JADX INFO: renamed from: p */
    public int f2525p;

    /* JADX INFO: renamed from: q */
    public int f2526q;

    /* JADX INFO: renamed from: r */
    public int f2527r;

    /* JADX INFO: renamed from: s */
    public int f2528s;

    /* JADX INFO: renamed from: t */
    public final int[] f2529t;

    /* JADX INFO: renamed from: u */
    public final int[] f2530u;

    /* JADX INFO: renamed from: v */
    public int f2531v;

    /* JADX INFO: renamed from: w */
    public int f2532w;

    /* JADX INFO: renamed from: x */
    public SavedState f2533x;

    /* JADX INFO: renamed from: y */
    public final C0642x f2534y;

    /* JADX INFO: renamed from: z */
    public final C0636u f2535z;

    /* JADX INFO: loaded from: classes4.dex */
    public interface OnScrollChangeListener {
        void onScrollChange(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      classes.dex
      classes4.dex
     */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0651a();

        /* JADX INFO: renamed from: a */
        public int f2536a;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        public class C0651a implements Parcelable.Creator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2536a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2536a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2536a = parcel.readInt();
        }

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$SavedState$1 */
        /* JADX INFO: loaded from: classes4.dex */
        static class C06501 implements Parcelable.Creator<SavedState> {
            C06501() {
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel in2) {
                return new SavedState(in2);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0652a extends C0582a {
        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: f */
        public void mo2798f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2798f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C13019r.m48459a(accessibilityEvent, nestedScrollView.getScrollX());
            C13019r.m48460b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, C13017p c13017p) {
            int scrollRange;
            super.mo2799g(view, c13017p);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c13017p.m48408l0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c13017p.m48362G0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c13017p.m48388b(C13017p.a.f46076r);
                c13017p.m48388b(C13017p.a.f46043C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c13017p.m48388b(C13017p.a.f46075q);
                c13017p.m48388b(C13017p.a.f46045E);
            }
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: j */
        public boolean mo2802j(View view, int i10, Bundle bundle) {
            if (super.mo2802j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m3262X(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m3262X(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C0653b {
        /* JADX INFO: renamed from: a */
        public static boolean m3286a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c */
    public static final class C0654c {
        /* JADX INFO: renamed from: a */
        public static void m3287a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$d */
    public class C0655d implements InterfaceC0606i {
        public C0655d() {
        }

        @Override // androidx.core.view.InterfaceC0606i
        /* JADX INFO: renamed from: a */
        public boolean mo2906a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            mo2908c();
            NestedScrollView.this.m3279v((int) f10);
            return true;
        }

        @Override // androidx.core.view.InterfaceC0606i
        /* JADX INFO: renamed from: b */
        public float mo2907b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC0606i
        /* JADX INFO: renamed from: c */
        public void mo2908c() {
            NestedScrollView.this.f2513d.abortAnimation();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$e */
    public interface InterfaceC0656e {
        /* JADX INFO: renamed from: a */
        void mo3288a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7019a.f27474c);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m3237F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m3237F((View) parent, view2);
    }

    /* JADX INFO: renamed from: f */
    private static int m3239f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private C0598f0 getScrollFeedbackProvider() {
        if (this.f2516g == null) {
            this.f2516g = C0598f0.m2892a(this);
        }
        return this.f2516g;
    }

    /* JADX INFO: renamed from: A */
    public final void m3240A() {
        VelocityTracker velocityTracker = this.f2522m;
        if (velocityTracker == null) {
            this.f2522m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m3241B() {
        this.f2513d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2525p = viewConfiguration.getScaledTouchSlop();
        this.f2526q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2527r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: C */
    public final void m3242C() {
        if (this.f2522m == null) {
            this.f2522m = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3243D(int i10, int i11) {
        this.f2517h = i10;
        this.f2528s = i11;
        m3263Y(2, 0);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m3244E(View view) {
        return !m3245G(view, 0, getHeight());
    }

    /* JADX INFO: renamed from: G */
    public final boolean m3245G(View view, int i10, int i11) {
        view.getDrawingRect(this.f2512c);
        offsetDescendantRectToMyCoords(view, this.f2512c);
        return this.f2512c.bottom + i10 >= getScrollY() && this.f2512c.top - i10 <= getScrollY() + i11;
    }

    /* JADX INFO: renamed from: H */
    public final void m3246H(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2535z.m3184e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    /* JADX INFO: renamed from: I */
    public final void m3247I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2528s) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2517h = (int) motionEvent.getY(i10);
            this.f2528s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2522m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m3248J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int i18;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i19 = i12 + i10;
        int i20 = !z15 ? 0 : i16;
        int i21 = i13 + i11;
        int i22 = !z16 ? 0 : i17;
        int i23 = -i20;
        int i24 = i20 + i14;
        int i25 = -i22;
        int i26 = i22 + i15;
        if (i19 > i24) {
            i19 = i24;
            z11 = true;
        } else if (i19 < i23) {
            z11 = true;
            i19 = i23;
        } else {
            z11 = false;
        }
        if (i21 > i26) {
            i21 = i26;
            z12 = true;
        } else if (i21 < i25) {
            z12 = true;
            i21 = i25;
        } else {
            z12 = false;
        }
        if (!z12 || m3282y(1)) {
            i18 = i19;
        } else {
            int i27 = i19;
            this.f2513d.springBack(i27, i21, 0, 0, 0, getScrollRange());
            i18 = i27;
        }
        onOverScrolled(i18, i21, z11, z12);
        return z11 || z12;
    }

    /* JADX INFO: renamed from: K */
    public boolean m3249K(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f2512c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2512c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2512c.top = getScrollY() - height;
            Rect rect2 = this.f2512c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2512c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return m3253O(i10, i11, i12);
    }

    /* JADX INFO: renamed from: L */
    public final void m3250L() {
        VelocityTracker velocityTracker = this.f2522m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2522m = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX INFO: renamed from: M */
    public final int m3251M(int i10, float f10) {
        float fM22276d;
        int iRound;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (C4427e.m22274b(this.f2514e) == 0.0f) {
            if (C4427e.m22274b(this.f2515f) != 0.0f) {
                fM22276d = C4427e.m22276d(this.f2515f, height, 1.0f - width);
                if (C4427e.m22274b(this.f2515f) == 0.0f) {
                    this.f2515f.onRelease();
                }
            }
            iRound = Math.round(f11 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fM22276d = -C4427e.m22276d(this.f2514e, -height, width);
        if (C4427e.m22274b(this.f2514e) == 0.0f) {
            this.f2514e.onRelease();
        }
        f11 = fM22276d;
        iRound = Math.round(f11 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    /* JADX INFO: renamed from: N */
    public final void m3252N(boolean z10) {
        if (z10) {
            m3263Y(2, 1);
        } else {
            m3266a0(1);
        }
        this.f2532w = getScrollY();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m3253O(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View viewM3278u = m3278u(z11, i11, i12);
        if (viewM3278u == null) {
            viewM3278u = this;
        }
        if (i11 < scrollY || i12 > i13) {
            m3254P(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (viewM3278u != findFocus()) {
            viewM3278u.requestFocus(i10);
        }
        return z10;
    }

    /* JADX INFO: renamed from: P */
    public final int m3254P(int i10, int i11, int i12, boolean z10) {
        return m3255Q(i10, -1, null, i11, i12, z10);
    }

    /* JADX INFO: renamed from: Q */
    public int m3255Q(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            m3263Y(2, i13);
        }
        boolean z11 = false;
        if (m3272l(0, i10, this.f2530u, this.f2529t, i13)) {
            int i16 = i10 - this.f2530u[1];
            i15 = this.f2529t[1];
            i14 = i16;
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = m3268d() && !z10;
        int i17 = i14;
        boolean z13 = m3248J(0, i14, 0, scrollY, 0, scrollRange, 0, 0, true) && !m3282y(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().m2894c(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        int[] iArr = this.f2530u;
        iArr[1] = 0;
        m3273p(0, scrollY2, 0, i17 - scrollY2, this.f2529t, i13, iArr);
        int i18 = i15 + this.f2529t[1];
        int i19 = i17 - this.f2530u[1];
        int i20 = scrollY + i19;
        if (i20 < 0) {
            if (z12) {
                C4427e.m22276d(this.f2514e, (-i19) / getHeight(), i12 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().m2893b(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
                }
                if (!this.f2515f.isFinished()) {
                    this.f2515f.onRelease();
                }
            }
        } else if (i20 > scrollRange && z12) {
            C4427e.m22276d(this.f2515f, i19 / getHeight(), 1.0f - (i12 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().m2893b(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
            }
            if (!this.f2514e.isFinished()) {
                this.f2514e.onRelease();
            }
        }
        if (this.f2514e.isFinished() && this.f2515f.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i13 == 0 && (velocityTracker = this.f2522m) != null) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            m3266a0(i13);
            this.f2514e.onRelease();
            this.f2515f.onRelease();
        }
        return i18;
    }

    /* JADX INFO: renamed from: R */
    public final void m3256R(View view) {
        view.getDrawingRect(this.f2512c);
        offsetDescendantRectToMyCoords(view, this.f2512c);
        int iM3270g = m3270g(this.f2512c);
        if (iM3270g != 0) {
            scrollBy(0, iM3270g);
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m3257S(Rect rect, boolean z10) {
        int iM3270g = m3270g(rect);
        boolean z11 = iM3270g != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iM3270g);
                return z11;
            }
            m3259U(0, iM3270g);
        }
        return z11;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m3258T(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return m3281x(-i10) < C4427e.m22274b(edgeEffect) * ((float) getHeight());
    }

    /* JADX INFO: renamed from: U */
    public final void m3259U(int i10, int i11) {
        m3260V(i10, i11, 250, false);
    }

    /* JADX INFO: renamed from: V */
    public final void m3260V(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2511b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2513d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            m3252N(z10);
        } else {
            if (!this.f2513d.isFinished()) {
                m3265a();
            }
            scrollBy(i10, i11);
        }
        this.f2511b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: W */
    public void m3261W(int i10, int i11, int i12, boolean z10) {
        m3260V(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* JADX INFO: renamed from: X */
    public void m3262X(int i10, int i11, boolean z10) {
        m3261W(i10, i11, 250, z10);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m3263Y(int i10, int i11) {
        return this.f2535z.m3195p(i10, i11);
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m3264Z(MotionEvent motionEvent) {
        boolean z10;
        if (C4427e.m22274b(this.f2514e) != 0.0f) {
            C4427e.m22276d(this.f2514e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (C4427e.m22274b(this.f2515f) == 0.0f) {
            return z10;
        }
        C4427e.m22276d(this.f2515f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m3265a() {
        this.f2513d.abortAnimation();
        m3266a0(1);
    }

    /* JADX INFO: renamed from: a0 */
    public void m3266a0(int i10) {
        this.f2535z.m3197r(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX INFO: renamed from: c */
    public boolean m3267c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m3245G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3254P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f2512c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f2512c);
            m3254P(m3270g(this.f2512c), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && m3244E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f2513d.isFinished()) {
            return;
        }
        this.f2513d.computeScrollOffset();
        int currY = this.f2513d.getCurrY();
        int iM3271h = m3271h(currY - this.f2532w);
        this.f2532w = currY;
        int[] iArr = this.f2530u;
        iArr[1] = 0;
        m3272l(0, iM3271h, iArr, null, 1);
        int i10 = iM3271h - this.f2530u[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            C0654c.m3287a(this, Math.abs(this.f2513d.getCurrVelocity()));
        }
        if (i10 != 0) {
            int scrollY = getScrollY();
            m3248J(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f2530u;
            iArr2[1] = 0;
            m3273p(0, scrollY2, 0, i11, this.f2529t, 1, iArr2);
            i10 = i11 - this.f2530u[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i10 < 0) {
                    if (this.f2514e.isFinished()) {
                        this.f2514e.onAbsorb((int) this.f2513d.getCurrVelocity());
                    }
                } else if (this.f2515f.isFinished()) {
                    this.f2515f.onAbsorb((int) this.f2513d.getCurrVelocity());
                }
            }
            m3265a();
        }
        if (this.f2513d.isFinished()) {
            m3266a0(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3268d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m3277t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2535z.m3180a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2535z.m3181b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return m3272l(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2535z.m3185f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f2514e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C0653b.m3286a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C0653b.m3286a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f2514e.setSize(width, height);
            if (this.f2514e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f2515f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (C0653b.m3286a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (C0653b.m3286a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f2515f.setSize(width2, height2);
        if (this.f2515f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3269e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public int m3270g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2534y.m3219a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2506A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2506A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2506A;
    }

    /* JADX INFO: renamed from: h */
    public int m3271h(int i10) {
        int height = getHeight();
        if (i10 > 0 && C4427e.m22274b(this.f2514e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * C4427e.m22276d(this.f2514e, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f2514e.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || C4427e.m22274b(this.f2515f) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round((f10 / 4.0f) * C4427e.m22276d(this.f2515f, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            this.f2515f.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m3282y(0);
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: i */
    public void mo1727i(View view, View view2, int i10, int i11) {
        this.f2534y.m3221c(view, view2, i10, i11);
        m3263Y(2, i11);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f2535z.m3191l();
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: j */
    public void mo1728j(View view, int i10) {
        this.f2534y.m3223e(view, i10);
        m3266a0(i10);
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: k */
    public void mo1729k(View view, int i10, int i11, int[] iArr, int i12) {
        m3272l(i10, i11, iArr, null, i12);
    }

    /* JADX INFO: renamed from: l */
    public boolean m3272l(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f2535z.m3183d(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.InterfaceC0640w
    /* JADX INFO: renamed from: m */
    public void mo1731m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m3246H(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: n */
    public void mo1732n(View view, int i10, int i11, int i12, int i13, int i14) {
        m3246H(i13, i14, null);
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: o */
    public boolean mo1733o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2519j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f2521l) {
            if (C0632s.m3175a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i10 = 9;
                width = (int) motionEvent.getX();
            } else if (C0632s.m3175a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m3255Q(-((int) (axisValue * getVerticalScrollFactorCompat())), i10, motionEvent, width, 1, C0632s.m3175a(motionEvent, InputDeviceCompat.SOURCE_MOUSE));
                if (i10 == 0) {
                    return true;
                }
                this.f2509D.m2904g(motionEvent, i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f2521l) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            if (m3283z((int) motionEvent.getX(), y10)) {
                this.f2517h = y10;
                this.f2528s = motionEvent.getPointerId(0);
                m3240A();
                this.f2522m.addMovement(motionEvent);
                this.f2513d.computeScrollOffset();
                if (!m3264Z(motionEvent) && this.f2513d.isFinished()) {
                    z10 = false;
                }
                this.f2521l = z10;
                m3263Y(2, 0);
            } else {
                if (!m3264Z(motionEvent) && this.f2513d.isFinished()) {
                    z10 = false;
                }
                this.f2521l = z10;
                m3250L();
            }
        } else if (i10 == 1) {
            this.f2521l = false;
            this.f2528s = -1;
            m3250L();
            if (this.f2513d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m3266a0(0);
        } else if (i10 == 2) {
            int i11 = this.f2528s;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f2517h) > this.f2525p && (2 & getNestedScrollAxes()) == 0) {
                        this.f2521l = true;
                        this.f2517h = y11;
                        m3242C();
                        this.f2522m.addMovement(motionEvent);
                        this.f2531v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f2521l = false;
            this.f2528s = -1;
            m3250L();
            if (this.f2513d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m3266a0(0);
        } else if (i10 == 6) {
            m3247I(motionEvent);
        }
        return this.f2521l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f2518i = false;
        View view = this.f2520k;
        if (view != null && m3237F(view, this)) {
            m3256R(this.f2520k);
        }
        this.f2520k = null;
        if (!this.f2519j) {
            if (this.f2533x != null) {
                scrollTo(getScrollX(), this.f2533x.f2536a);
                this.f2533x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM3239f = m3239f(scrollY, paddingTop, measuredHeight);
            if (iM3239f != scrollY) {
                scrollTo(getScrollX(), iM3239f);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2519j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2523n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        m3279v((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo1729k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m3246H(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        mo1727i(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || m3244E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2533x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2536a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        InterfaceC0656e interfaceC0656e = this.f2507B;
        if (interfaceC0656e != null) {
            interfaceC0656e.mo3288a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m3245G(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f2512c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f2512c);
        m3274q(m3270g(this.f2512c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo1733o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo1728j(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        m3242C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2531v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f2531v);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f2521l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.f2513d.isFinished()) {
                m3265a();
            }
            m3243D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2528s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2528s + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i10 = this.f2517h - y10;
                    int iM3251M = i10 - m3251M(i10, motionEvent.getX(iFindPointerIndex));
                    if (!this.f2521l && Math.abs(iM3251M) > this.f2525p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2521l = true;
                        iM3251M = iM3251M > 0 ? iM3251M - this.f2525p : iM3251M + this.f2525p;
                    }
                    int i11 = iM3251M;
                    if (this.f2521l) {
                        nestedScrollView = this;
                        int iM3255Q = nestedScrollView.m3255Q(i11, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        nestedScrollView.f2517h = y10 - iM3255Q;
                        nestedScrollView.f2531v += iM3255Q;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2521l && getChildCount() > 0 && this.f2513d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m3276s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2517h = (int) motionEvent.getY(actionIndex);
                this.f2528s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m3247I(motionEvent);
                this.f2517h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2528s));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.f2522m;
            velocityTracker.computeCurrentVelocity(1000, nestedScrollView.f2527r);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.f2528s);
            if (Math.abs(yVelocity) >= nestedScrollView.f2526q) {
                if (!m3275r(yVelocity)) {
                    int i12 = -yVelocity;
                    float f10 = i12;
                    if (!dispatchNestedPreFling(0.0f, f10)) {
                        dispatchNestedFling(0.0f, f10, true);
                        m3279v(i12);
                    }
                }
            } else if (nestedScrollView.f2513d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m3276s();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f2522m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m3273p(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f2535z.m3184e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* JADX INFO: renamed from: q */
    public final void m3274q(int i10) {
        if (i10 != 0) {
            if (this.f2524o) {
                m3259U(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3275r(int i10) {
        if (C4427e.m22274b(this.f2514e) != 0.0f) {
            if (m3258T(this.f2514e, i10)) {
                this.f2514e.onAbsorb(i10);
                return true;
            }
            m3279v(-i10);
            return true;
        }
        if (C4427e.m22274b(this.f2515f) == 0.0f) {
            return false;
        }
        int i11 = -i10;
        if (m3258T(this.f2515f, i11)) {
            this.f2515f.onAbsorb(i11);
            return true;
        }
        m3279v(i11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2518i) {
            this.f2520k = view2;
        } else {
            m3256R(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3257S(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            m3250L();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2518i = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final void m3276s() {
        this.f2528s = -1;
        this.f2521l = false;
        m3250L();
        m3266a0(0);
        this.f2514e.onRelease();
        this.f2515f.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM3239f = m3239f(i10, width, width2);
            int iM3239f2 = m3239f(i11, height, height2);
            if (iM3239f == getScrollX() && iM3239f2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM3239f, iM3239f2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2523n) {
            this.f2523n = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f2535z.m3192m(z10);
    }

    public void setOnScrollChangeListener(InterfaceC0656e interfaceC0656e) {
        this.f2507B = interfaceC0656e;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2524o = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return m3263Y(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m3266a0(0);
    }

    /* JADX INFO: renamed from: t */
    public boolean m3277t(KeyEvent keyEvent) {
        this.f2512c.setEmpty();
        if (!m3269e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? m3280w(33) : m3267c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? m3280w(130) : m3267c(130);
            }
            if (keyCode == 62) {
                m3249K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return m3280w(33);
            }
            if (keyCode == 93) {
                return m3280w(130);
            }
            if (keyCode == 122) {
                m3249K(33);
                return false;
            }
            if (keyCode == 123) {
                m3249K(130);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX INFO: renamed from: u */
    public final View m3278u(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (z13) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: v */
    public void m3279v(int i10) {
        if (getChildCount() > 0) {
            this.f2513d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE, 0, 0);
            m3252N(true);
            if (Build.VERSION.SDK_INT >= 35) {
                C0654c.m3287a(this, Math.abs(this.f2513d.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m3280w(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2512c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2512c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2512c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2512c;
        return m3253O(i10, rect3.top, rect3.bottom);
    }

    /* JADX INFO: renamed from: x */
    public final float m3281x(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f2510a * 0.015f));
        float f10 = f2503E;
        return (float) (((double) (this.f2510a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    /* JADX INFO: renamed from: y */
    public boolean m3282y(int i10) {
        return this.f2535z.m3190k(i10);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m3283z(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2512c = new Rect();
        this.f2518i = true;
        this.f2519j = false;
        this.f2520k = null;
        this.f2521l = false;
        this.f2524o = true;
        this.f2528s = -1;
        this.f2529t = new int[2];
        this.f2530u = new int[2];
        C0655d c0655d = new C0655d();
        this.f2508C = c0655d;
        this.f2509D = new C0603h(getContext(), c0655d);
        this.f2514e = C4427e.m22273a(context, attributeSet);
        this.f2515f = C4427e.m22273a(context, attributeSet);
        this.f2510a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m3241B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2505G, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f2534y = new C0642x(this);
        this.f2535z = new C0636u(this);
        setNestedScrollingEnabled(true);
        C0625o0.m3040m0(this, f2504F);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View host, int action, Bundle arguments) {
            if (super.performAccessibilityAction(host, action, arguments)) {
                return true;
            }
            NestedScrollView nsvHost = (NestedScrollView) host;
            if (!nsvHost.isEnabled()) {
                return false;
            }
            switch (action) {
                case 4096:
                    int viewportHeight = (nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop();
                    int targetScrollY = Math.min(nsvHost.getScrollY() + viewportHeight, nsvHost.getScrollRange());
                    if (targetScrollY == nsvHost.getScrollY()) {
                        return false;
                    }
                    nsvHost.smoothScrollTo(0, targetScrollY);
                    return true;
                case 8192:
                    int viewportHeight2 = (nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop();
                    int targetScrollY2 = Math.max(nsvHost.getScrollY() - viewportHeight2, 0);
                    if (targetScrollY2 == nsvHost.getScrollY()) {
                        return false;
                    }
                    nsvHost.smoothScrollTo(0, targetScrollY2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(host, info);
            NestedScrollView nsvHost = (NestedScrollView) host;
            info.setClassName(ScrollView.class.getName());
            if (nsvHost.isEnabled() && (scrollRange = nsvHost.getScrollRange()) > 0) {
                info.setScrollable(true);
                if (nsvHost.getScrollY() > 0) {
                    info.addAction(8192);
                }
                if (nsvHost.getScrollY() < scrollRange) {
                    info.addAction(4096);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(host, event);
            NestedScrollView nsvHost = (NestedScrollView) host;
            event.setClassName(ScrollView.class.getName());
            boolean scrollable = nsvHost.getScrollRange() > 0;
            event.setScrollable(scrollable);
            event.setScrollX(nsvHost.getScrollX());
            event.setScrollY(nsvHost.getScrollY());
            AccessibilityRecordCompat.setMaxScrollX(event, nsvHost.getScrollX());
            AccessibilityRecordCompat.setMaxScrollY(event, nsvHost.getScrollRange());
        }
    }
}
