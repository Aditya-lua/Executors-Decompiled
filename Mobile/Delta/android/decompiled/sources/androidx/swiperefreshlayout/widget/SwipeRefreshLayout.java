package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.o0;
import androidx.core.view.t;
import androidx.core.view.u;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.x;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements w, v, t {
    public static final String P = "SwipeRefreshLayout";
    public static final int[] Q = {R.attr.enabled};
    public int A;
    public int B;
    public m5.b C;
    public Animation D;
    public Animation E;
    public Animation F;
    public Animation G;
    public Animation H;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;
    public Animation.AnimationListener M;
    public final Animation N;
    public final Animation O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f3198a;
    public j b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f3203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f3204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f3205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f3206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f3207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3215s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3216t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DecelerateInterpolator f3217u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m5.a f3218v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f3221y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3222z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3199c) {
                swipeRefreshLayout.s();
                return;
            }
            swipeRefreshLayout.C.setAlpha(255);
            SwipeRefreshLayout.this.C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.I && (jVar = swipeRefreshLayout2.b) != null) {
                jVar.e();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f3210n = swipeRefreshLayout3.f3218v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    public class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f3227a;
        public final /* synthetic */ int b;

        public d(int i10, int i11) {
            this.f3227a = i10;
            this.b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            m5.b bVar = SwipeRefreshLayout.this.C;
            int i10 = this.f3227a;
            bVar.setAlpha((int) (i10 + ((this.b - i10) * f10)));
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f3215s) {
                return;
            }
            swipeRefreshLayout.z(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.K ? swipeRefreshLayout.A - Math.abs(swipeRefreshLayout.f3222z) : swipeRefreshLayout.A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f3220x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - swipeRefreshLayout2.f3218v.getTop());
            SwipeRefreshLayout.this.C.e(1.0f - f10);
        }
    }

    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.q(f10);
        }
    }

    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f3221y;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.q(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void e();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3199c = false;
        this.f3201e = -1.0f;
        this.f3205i = new int[2];
        this.f3206j = new int[2];
        this.f3207k = new int[2];
        this.f3214r = -1;
        this.f3219w = -1;
        this.M = new a();
        this.N = new f();
        this.O = new g();
        this.f3200d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3209m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f3217u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        e();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.A = i10;
        this.f3201e = i10;
        this.f3203g = new x(this);
        this.f3204h = new u(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.J;
        this.f3210n = i11;
        this.f3222z = i11;
        q(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3214r) {
            this.f3214r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f3218v.getBackground().setAlpha(i10);
        this.C.setAlpha(i10);
    }

    public final void A(int i10, Animation.AnimationListener animationListener) {
        this.f3220x = i10;
        this.f3221y = this.f3218v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f3218v.b(animationListener);
        }
        this.f3218v.clearAnimation();
        this.f3218v.startAnimation(this.H);
    }

    public final void B(Animation.AnimationListener animationListener) {
        this.f3218v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(this.f3209m);
        if (animationListener != null) {
            this.f3218v.b(animationListener);
        }
        this.f3218v.clearAnimation();
        this.f3218v.startAnimation(this.D);
    }

    public final void b(int i10, Animation.AnimationListener animationListener) {
        this.f3220x = i10;
        this.N.reset();
        this.N.setDuration(200L);
        this.N.setInterpolator(this.f3217u);
        if (animationListener != null) {
            this.f3218v.b(animationListener);
        }
        this.f3218v.clearAnimation();
        this.f3218v.startAnimation(this.N);
    }

    public final void c(int i10, Animation.AnimationListener animationListener) {
        if (this.f3215s) {
            A(i10, animationListener);
            return;
        }
        this.f3220x = i10;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.f3217u);
        if (animationListener != null) {
            this.f3218v.b(animationListener);
        }
        this.f3218v.clearAnimation();
        this.f3218v.startAnimation(this.O);
    }

    public boolean d() {
        View view = this.f3198a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        u(true, true);
        return true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f3204h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f3204h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f3204h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3204h.f(i10, i11, i12, i13, iArr);
    }

    public final void e() {
        this.f3218v = new m5.a(getContext());
        m5.b bVar = new m5.b(getContext());
        this.C = bVar;
        bVar.l(1);
        this.f3218v.setImageDrawable(this.C);
        this.f3218v.setVisibility(8);
        addView(this.f3218v);
    }

    public void f(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f3204h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    public final void g() {
        if (this.f3198a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f3218v)) {
                    this.f3198a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f3219w;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3203g.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.f3222z;
    }

    public final void h(float f10) {
        if (f10 > this.f3201e) {
            t(true, true);
            return;
        }
        this.f3199c = false;
        this.C.j(0.0f, 0.0f);
        c(this.f3210n, !this.f3215s ? new e() : null);
        this.C.d(false);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f3204h.j();
    }

    @Override // androidx.core.view.v
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3204h.l();
    }

    @Override // androidx.core.view.v
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.v
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public final boolean l(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // androidx.core.view.w
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        f(i10, i11, i12, i13, this.f3206j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f3206j[1] : i16;
        if (i17 >= 0 || d()) {
            return;
        }
        float fAbs = this.f3202f + Math.abs(i17);
        this.f3202f = fAbs;
        p(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.v
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f3207k);
    }

    @Override // androidx.core.view.v
    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3216t && actionMasked == 0) {
            this.f3216t = false;
        }
        if (!isEnabled() || this.f3216t || d() || this.f3199c || this.f3208l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f3222z - this.f3218v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f3214r = pointerId;
            this.f3213q = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f3212p = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f3213q = false;
            this.f3214r = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f3214r;
            if (i10 == -1) {
                Log.e(P, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            w(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f3213q = false;
            this.f3214r = -1;
        } else if (actionMasked == 6) {
            r(motionEvent);
        }
        return this.f3213q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f3198a == null) {
            g();
        }
        View view = this.f3198a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f3218v.getMeasuredWidth();
        int measuredHeight2 = this.f3218v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f3210n;
        this.f3218v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3198a == null) {
            g();
        }
        View view = this.f3198a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f3218v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
        this.f3219w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f3218v) {
                this.f3219w = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f3202f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f3202f = 0.0f;
                } else {
                    this.f3202f = f10 - f11;
                    iArr[1] = i11;
                }
                p(this.f3202f);
            }
        }
        if (this.K && i11 > 0 && this.f3202f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f3218v.setVisibility(8);
        }
        int[] iArr2 = this.f3205i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f3207k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f3203g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f3202f = 0.0f;
        this.f3208l = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f3223a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f3199c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f3216t || this.f3199c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f3203g.d(view);
        this.f3208l = false;
        float f10 = this.f3202f;
        if (f10 > 0.0f) {
            h(f10);
            this.f3202f = 0.0f;
        } else {
            post(new Runnable() { // from class: m5.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24611a.s();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3216t && actionMasked == 0) {
            this.f3216t = false;
        }
        if (!isEnabled() || this.f3216t || d() || this.f3199c || this.f3208l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f3214r = motionEvent.getPointerId(0);
            this.f3213q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3214r);
                if (iFindPointerIndex < 0) {
                    Log.e(P, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f3213q) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f3211o) * 0.5f;
                    this.f3213q = false;
                    h(y10);
                }
                this.f3214r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f3214r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                w(y11);
                if (this.f3213q) {
                    float f10 = (y11 - this.f3211o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    p(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f3214r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    r(motionEvent);
                }
            }
        }
        return true;
    }

    public final void p(float f10) {
        this.C.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f3201e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f3201e;
        int i10 = this.B;
        if (i10 <= 0) {
            i10 = this.K ? this.A - this.f3222z : this.A;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f3222z + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f3218v.getVisibility() != 0) {
            this.f3218v.setVisibility(0);
        }
        if (!this.f3215s) {
            this.f3218v.setScaleX(1.0f);
            this.f3218v.setScaleY(1.0f);
        }
        if (this.f3215s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f3201e));
        }
        if (f10 < this.f3201e) {
            if (this.C.getAlpha() > 76 && !l(this.F)) {
                y();
            }
        } else if (this.C.getAlpha() < 255 && !l(this.G)) {
            x();
        }
        this.C.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.C.e(Math.min(1.0f, fMax));
        this.C.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f3210n);
    }

    public void q(float f10) {
        int i10 = this.f3220x;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f3222z - i10) * f10))) - this.f3218v.getTop());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view;
        if (!this.L || (view = this.f3198a) == null || o0.S(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void s() {
        this.f3218v.clearAnimation();
        this.C.stop();
        this.f3218v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f3215s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f3222z - this.f3210n);
        }
        this.f3210n = this.f3218v.getTop();
    }

    public void setAnimationProgress(float f10) {
        this.f3218v.setScaleX(f10);
        this.f3218v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        g();
        this.C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = l2.b.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f3201e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        s();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.L = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f3204h.m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f3218v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(l2.b.c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        u(z10, false);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.J = (int) (displayMetrics.density * 40.0f);
            }
            this.f3218v.setImageDrawable(null);
            this.C.l(i10);
            this.f3218v.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.B = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f3218v.bringToFront();
        o0.X(this.f3218v, i10);
        this.f3210n = this.f3218v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f3204h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f3204h.q();
    }

    public final void t(boolean z10, boolean z11) {
        if (this.f3199c != z10) {
            this.I = z11;
            g();
            this.f3199c = z10;
            if (z10) {
                b(this.f3210n, this.M);
            } else {
                z(this.M);
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        if (!z10 || this.f3199c == z10) {
            t(z10, false);
            return;
        }
        this.f3199c = z10;
        setTargetOffsetTopAndBottom((!this.K ? this.A + this.f3222z : this.A) - this.f3210n);
        this.I = z11;
        B(this.M);
    }

    public final Animation v(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f3218v.b(null);
        this.f3218v.clearAnimation();
        this.f3218v.startAnimation(dVar);
        return dVar;
    }

    public final void w(float f10) {
        float f11 = this.f3212p;
        float f12 = f10 - f11;
        int i10 = this.f3200d;
        if (f12 <= i10 || this.f3213q) {
            return;
        }
        this.f3211o = f11 + i10;
        this.f3213q = true;
        this.C.setAlpha(76);
    }

    public final void x() {
        this.G = v(this.C.getAlpha(), 255);
    }

    public final void y() {
        this.F = v(this.C.getAlpha(), 76);
    }

    public void z(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.E = cVar;
        cVar.setDuration(150L);
        this.f3218v.b(animationListener);
        this.f3218v.clearAnimation();
        this.f3218v.startAnimation(this.E);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3223a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f3223a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f3223a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3223a = parcel.readByte() != 0;
        }
    }
}
