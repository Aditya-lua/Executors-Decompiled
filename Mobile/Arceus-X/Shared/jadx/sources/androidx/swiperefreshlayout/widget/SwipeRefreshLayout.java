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
import androidx.core.view.C0625o0;
import androidx.core.view.C0636u;
import androidx.core.view.C0642x;
import androidx.core.view.InterfaceC0634t;
import androidx.core.view.InterfaceC0638v;
import androidx.core.view.InterfaceC0640w;
import p261l2.C7975b;
import p286m5.C8424a;
import p286m5.C8425b;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0640w, InterfaceC0638v, InterfaceC0634t {

    /* JADX INFO: renamed from: P */
    public static final String f4401P = "SwipeRefreshLayout";

    /* JADX INFO: renamed from: Q */
    public static final int[] f4402Q = {R.attr.enabled};

    /* JADX INFO: renamed from: A */
    public int f4403A;

    /* JADX INFO: renamed from: B */
    public int f4404B;

    /* JADX INFO: renamed from: C */
    public C8425b f4405C;

    /* JADX INFO: renamed from: D */
    public Animation f4406D;

    /* JADX INFO: renamed from: E */
    public Animation f4407E;

    /* JADX INFO: renamed from: F */
    public Animation f4408F;

    /* JADX INFO: renamed from: G */
    public Animation f4409G;

    /* JADX INFO: renamed from: H */
    public Animation f4410H;

    /* JADX INFO: renamed from: I */
    public boolean f4411I;

    /* JADX INFO: renamed from: J */
    public int f4412J;

    /* JADX INFO: renamed from: K */
    public boolean f4413K;

    /* JADX INFO: renamed from: L */
    public boolean f4414L;

    /* JADX INFO: renamed from: M */
    public Animation.AnimationListener f4415M;

    /* JADX INFO: renamed from: N */
    public final Animation f4416N;

    /* JADX INFO: renamed from: O */
    public final Animation f4417O;

    /* JADX INFO: renamed from: a */
    public View f4418a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1088j f4419b;

    /* JADX INFO: renamed from: c */
    public boolean f4420c;

    /* JADX INFO: renamed from: d */
    public int f4421d;

    /* JADX INFO: renamed from: e */
    public float f4422e;

    /* JADX INFO: renamed from: f */
    public float f4423f;

    /* JADX INFO: renamed from: g */
    public final C0642x f4424g;

    /* JADX INFO: renamed from: h */
    public final C0636u f4425h;

    /* JADX INFO: renamed from: i */
    public final int[] f4426i;

    /* JADX INFO: renamed from: j */
    public final int[] f4427j;

    /* JADX INFO: renamed from: k */
    public final int[] f4428k;

    /* JADX INFO: renamed from: l */
    public boolean f4429l;

    /* JADX INFO: renamed from: m */
    public int f4430m;

    /* JADX INFO: renamed from: n */
    public int f4431n;

    /* JADX INFO: renamed from: o */
    public float f4432o;

    /* JADX INFO: renamed from: p */
    public float f4433p;

    /* JADX INFO: renamed from: q */
    public boolean f4434q;

    /* JADX INFO: renamed from: r */
    public int f4435r;

    /* JADX INFO: renamed from: s */
    public boolean f4436s;

    /* JADX INFO: renamed from: t */
    public boolean f4437t;

    /* JADX INFO: renamed from: u */
    public final DecelerateInterpolator f4438u;

    /* JADX INFO: renamed from: v */
    public C8424a f4439v;

    /* JADX INFO: renamed from: w */
    public int f4440w;

    /* JADX INFO: renamed from: x */
    public int f4441x;

    /* JADX INFO: renamed from: y */
    public float f4442y;

    /* JADX INFO: renamed from: z */
    public int f4443z;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class AnimationAnimationListenerC1079a implements Animation.AnimationListener {
        public AnimationAnimationListenerC1079a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC1088j interfaceC1088j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f4420c) {
                swipeRefreshLayout.m6163s();
                return;
            }
            swipeRefreshLayout.f4405C.setAlpha(255);
            SwipeRefreshLayout.this.f4405C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f4411I && (interfaceC1088j = swipeRefreshLayout2.f4419b) != null) {
                interfaceC1088j.mo6173e();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f4431n = swipeRefreshLayout3.f4439v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C1080b extends Animation {
        public C1080b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C1081c extends Animation {
        public C1081c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C1082d extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4448a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4449b;

        public C1082d(int i10, int i11) {
            this.f4448a = i10;
            this.f4449b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            C8425b c8425b = SwipeRefreshLayout.this.f4405C;
            int i10 = this.f4448a;
            c8425b.setAlpha((int) (i10 + ((this.f4449b - i10) * f10)));
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class AnimationAnimationListenerC1083e implements Animation.AnimationListener {
        public AnimationAnimationListenerC1083e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4436s) {
                return;
            }
            swipeRefreshLayout.m6170z(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C1084f extends Animation {
        public C1084f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f4413K ? swipeRefreshLayout.f4403A - Math.abs(swipeRefreshLayout.f4443z) : swipeRefreshLayout.f4403A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f4441x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - swipeRefreshLayout2.f4439v.getTop());
            SwipeRefreshLayout.this.f4405C.m34143e(1.0f - f10);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public class C1085g extends Animation {
        public C1085g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.m6162q(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public class C1086h extends Animation {
        public C1086h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f4442y;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.m6162q(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface InterfaceC1087i {
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface InterfaceC1088j {
        /* JADX INFO: renamed from: e */
        void mo6173e();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4420c = false;
        this.f4422e = -1.0f;
        this.f4426i = new int[2];
        this.f4427j = new int[2];
        this.f4428k = new int[2];
        this.f4435r = -1;
        this.f4440w = -1;
        this.f4415M = new AnimationAnimationListenerC1079a();
        this.f4416N = new C1084f();
        this.f4417O = new C1085g();
        this.f4421d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4430m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f4438u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4412J = (int) (displayMetrics.density * 40.0f);
        m6156e();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f4403A = i10;
        this.f4422e = i10;
        this.f4424g = new C0642x(this);
        this.f4425h = new C0636u(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f4412J;
        this.f4431n = i11;
        this.f4443z = i11;
        m6162q(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4402Q);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: r */
    private void m6150r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4435r) {
            this.f4435r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f4439v.getBackground().setAlpha(i10);
        this.f4405C.setAlpha(i10);
    }

    /* JADX INFO: renamed from: A */
    public final void m6151A(int i10, Animation.AnimationListener animationListener) {
        this.f4441x = i10;
        this.f4442y = this.f4439v.getScaleX();
        C1086h c1086h = new C1086h();
        this.f4410H = c1086h;
        c1086h.setDuration(150L);
        if (animationListener != null) {
            this.f4439v.m34137b(animationListener);
        }
        this.f4439v.clearAnimation();
        this.f4439v.startAnimation(this.f4410H);
    }

    /* JADX INFO: renamed from: B */
    public final void m6152B(Animation.AnimationListener animationListener) {
        this.f4439v.setVisibility(0);
        this.f4405C.setAlpha(255);
        C1080b c1080b = new C1080b();
        this.f4406D = c1080b;
        c1080b.setDuration(this.f4430m);
        if (animationListener != null) {
            this.f4439v.m34137b(animationListener);
        }
        this.f4439v.clearAnimation();
        this.f4439v.startAnimation(this.f4406D);
    }

    /* JADX INFO: renamed from: b */
    public final void m6153b(int i10, Animation.AnimationListener animationListener) {
        this.f4441x = i10;
        this.f4416N.reset();
        this.f4416N.setDuration(200L);
        this.f4416N.setInterpolator(this.f4438u);
        if (animationListener != null) {
            this.f4439v.m34137b(animationListener);
        }
        this.f4439v.clearAnimation();
        this.f4439v.startAnimation(this.f4416N);
    }

    /* JADX INFO: renamed from: c */
    public final void m6154c(int i10, Animation.AnimationListener animationListener) {
        if (this.f4436s) {
            m6151A(i10, animationListener);
            return;
        }
        this.f4441x = i10;
        this.f4417O.reset();
        this.f4417O.setDuration(200L);
        this.f4417O.setInterpolator(this.f4438u);
        if (animationListener != null) {
            this.f4439v.m34137b(animationListener);
        }
        this.f4439v.clearAnimation();
        this.f4439v.startAnimation(this.f4417O);
    }

    /* JADX INFO: renamed from: d */
    public boolean m6155d() {
        View view = this.f4418a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        m6165u(true, true);
        return true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f4425h.m3180a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f4425h.m3181b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f4425h.m3182c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f4425h.m3185f(i10, i11, i12, i13, iArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m6156e() {
        this.f4439v = new C8424a(getContext());
        C8425b c8425b = new C8425b(getContext());
        this.f4405C = c8425b;
        c8425b.m34150l(1);
        this.f4439v.setImageDrawable(this.f4405C);
        this.f4439v.setVisibility(8);
        addView(this.f4439v);
    }

    /* JADX INFO: renamed from: f */
    public void m6157f(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f4425h.m3184e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6158g() {
        if (this.f4418a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f4439v)) {
                    this.f4418a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f4440w;
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
        return this.f4424g.m3219a();
    }

    public int getProgressCircleDiameter() {
        return this.f4412J;
    }

    public int getProgressViewEndOffset() {
        return this.f4403A;
    }

    public int getProgressViewStartOffset() {
        return this.f4443z;
    }

    /* JADX INFO: renamed from: h */
    public final void m6159h(float f10) {
        if (f10 > this.f4422e) {
            m6164t(true, true);
            return;
        }
        this.f4420c = false;
        this.f4405C.m34148j(0.0f, 0.0f);
        m6154c(this.f4431n, !this.f4436s ? new AnimationAnimationListenerC1083e() : null);
        this.f4405C.m34142d(false);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f4425h.m3189j();
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: i */
    public void mo1727i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f4425h.m3191l();
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: j */
    public void mo1728j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: k */
    public void mo1729k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6160l(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC0640w
    /* JADX INFO: renamed from: m */
    public void mo1731m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        m6157f(i10, i11, i12, i13, this.f4427j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f4427j[1] : i16;
        if (i17 >= 0 || m6155d()) {
            return;
        }
        float fAbs = this.f4423f + Math.abs(i17);
        this.f4423f = fAbs;
        m6161p(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: n */
    public void mo1732n(View view, int i10, int i11, int i12, int i13, int i14) {
        mo1731m(view, i10, i11, i12, i13, i14, this.f4428k);
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: o */
    public boolean mo1733o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6163s();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m6158g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4437t && actionMasked == 0) {
            this.f4437t = false;
        }
        if (!isEnabled() || this.f4437t || m6155d() || this.f4420c || this.f4429l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f4443z - this.f4439v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f4435r = pointerId;
            this.f4434q = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f4433p = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f4434q = false;
            this.f4435r = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f4435r;
            if (i10 == -1) {
                Log.e(f4401P, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            m6167w(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f4434q = false;
            this.f4435r = -1;
        } else if (actionMasked == 6) {
            m6150r(motionEvent);
        }
        return this.f4434q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4418a == null) {
            m6158g();
        }
        View view = this.f4418a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4439v.getMeasuredWidth();
        int measuredHeight2 = this.f4439v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f4431n;
        this.f4439v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f4418a == null) {
            m6158g();
        }
        View view = this.f4418a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4439v.measure(View.MeasureSpec.makeMeasureSpec(this.f4412J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4412J, 1073741824));
        this.f4440w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f4439v) {
                this.f4440w = i12;
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
            float f10 = this.f4423f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f4423f = 0.0f;
                } else {
                    this.f4423f = f10 - f11;
                    iArr[1] = i11;
                }
                m6161p(this.f4423f);
            }
        }
        if (this.f4413K && i11 > 0 && this.f4423f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f4439v.setVisibility(8);
        }
        int[] iArr2 = this.f4426i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mo1731m(view, i10, i11, i12, i13, 0, this.f4428k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f4424g.m3220b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f4423f = 0.0f;
        this.f4429l = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f4444a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f4420c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f4437t || this.f4420c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f4424g.m3222d(view);
        this.f4429l = false;
        float f10 = this.f4423f;
        if (f10 > 0.0f) {
            m6159h(f10);
            this.f4423f = 0.0f;
        } else {
            post(new Runnable() { // from class: m5.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31082a.m6163s();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4437t && actionMasked == 0) {
            this.f4437t = false;
        }
        if (!isEnabled() || this.f4437t || m6155d() || this.f4420c || this.f4429l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4435r = motionEvent.getPointerId(0);
            this.f4434q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4435r);
                if (iFindPointerIndex < 0) {
                    Log.e(f4401P, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f4434q) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f4432o) * 0.5f;
                    this.f4434q = false;
                    m6159h(y10);
                }
                this.f4435r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f4435r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f4401P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                m6167w(y11);
                if (this.f4434q) {
                    float f10 = (y11 - this.f4432o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m6161p(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f4401P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f4435r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m6150r(motionEvent);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m6161p(float f10) {
        this.f4405C.m34142d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f4422e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f4422e;
        int i10 = this.f4404B;
        if (i10 <= 0) {
            i10 = this.f4413K ? this.f4403A - this.f4443z : this.f4403A;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f4443z + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f4439v.getVisibility() != 0) {
            this.f4439v.setVisibility(0);
        }
        if (!this.f4436s) {
            this.f4439v.setScaleX(1.0f);
            this.f4439v.setScaleY(1.0f);
        }
        if (this.f4436s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f4422e));
        }
        if (f10 < this.f4422e) {
            if (this.f4405C.getAlpha() > 76 && !m6160l(this.f4408F)) {
                m6169y();
            }
        } else if (this.f4405C.getAlpha() < 255 && !m6160l(this.f4409G)) {
            m6168x();
        }
        this.f4405C.m34148j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f4405C.m34143e(Math.min(1.0f, fMax));
        this.f4405C.m34145g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f4431n);
    }

    /* JADX INFO: renamed from: q */
    public void m6162q(float f10) {
        int i10 = this.f4441x;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f4443z - i10) * f10))) - this.f4439v.getTop());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view;
        if (!this.f4414L || (view = this.f4418a) == null || C0625o0.m3007S(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m6163s() {
        this.f4439v.clearAnimation();
        this.f4405C.stop();
        this.f4439v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4436s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4443z - this.f4431n);
        }
        this.f4431n = this.f4439v.getTop();
    }

    public void setAnimationProgress(float f10) {
        this.f4439v.setScaleX(f10);
        this.f4439v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m6158g();
        this.f4405C.m34144f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = C7975b.m33005c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f4422e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        m6163s();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f4414L = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f4425h.m3192m(z10);
    }

    public void setOnChildScrollUpCallback(InterfaceC1087i interfaceC1087i) {
    }

    public void setOnRefreshListener(InterfaceC1088j interfaceC1088j) {
        this.f4419b = interfaceC1088j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f4439v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(C7975b.m33005c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        m6165u(z10, false);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f4412J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f4412J = (int) (displayMetrics.density * 40.0f);
            }
            this.f4439v.setImageDrawable(null);
            this.f4405C.m34150l(i10);
            this.f4439v.setImageDrawable(this.f4405C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f4404B = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f4439v.bringToFront();
        C0625o0.m3012X(this.f4439v, i10);
        this.f4431n = this.f4439v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f4425h.m3194o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f4425h.m3196q();
    }

    /* JADX INFO: renamed from: t */
    public final void m6164t(boolean z10, boolean z11) {
        if (this.f4420c != z10) {
            this.f4411I = z11;
            m6158g();
            this.f4420c = z10;
            if (z10) {
                m6153b(this.f4431n, this.f4415M);
            } else {
                m6170z(this.f4415M);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m6165u(boolean z10, boolean z11) {
        if (!z10 || this.f4420c == z10) {
            m6164t(z10, false);
            return;
        }
        this.f4420c = z10;
        setTargetOffsetTopAndBottom((!this.f4413K ? this.f4403A + this.f4443z : this.f4403A) - this.f4431n);
        this.f4411I = z11;
        m6152B(this.f4415M);
    }

    /* JADX INFO: renamed from: v */
    public final Animation m6166v(int i10, int i11) {
        C1082d c1082d = new C1082d(i10, i11);
        c1082d.setDuration(300L);
        this.f4439v.m34137b(null);
        this.f4439v.clearAnimation();
        this.f4439v.startAnimation(c1082d);
        return c1082d;
    }

    /* JADX INFO: renamed from: w */
    public final void m6167w(float f10) {
        float f11 = this.f4433p;
        float f12 = f10 - f11;
        int i10 = this.f4421d;
        if (f12 <= i10 || this.f4434q) {
            return;
        }
        this.f4432o = f11 + i10;
        this.f4434q = true;
        this.f4405C.setAlpha(76);
    }

    /* JADX INFO: renamed from: x */
    public final void m6168x() {
        this.f4409G = m6166v(this.f4405C.getAlpha(), 255);
    }

    /* JADX INFO: renamed from: y */
    public final void m6169y() {
        this.f4408F = m6166v(this.f4405C.getAlpha(), 76);
    }

    /* JADX INFO: renamed from: z */
    public void m6170z(Animation.AnimationListener animationListener) {
        C1081c c1081c = new C1081c();
        this.f4407E = c1081c;
        c1081c.setDuration(150L);
        this.f4439v.m34137b(animationListener);
        this.f4439v.clearAnimation();
        this.f4439v.startAnimation(this.f4407E);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1078a();

        /* JADX INFO: renamed from: a */
        public final boolean f4444a;

        /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        public class C1078a implements Parcelable.Creator<SavedState> {
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
        public SavedState(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f4444a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f4444a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4444a = parcel.readByte() != 0;
        }
    }
}
