package n5;

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
public class d extends ViewGroup implements w, v, t {
    public static final String P = "d";
    public static final int[] Q = {R.attr.enabled};
    public int A;
    public int B;
    public n5.b C;
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
    public View f25378a;
    public j b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f25382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f25383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f25384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f25385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f25386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f25387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f25391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f25392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25396t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DecelerateInterpolator f25397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n5.a f25398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f25399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f25400x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f25401y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f25402z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            d dVar = d.this;
            if (!dVar.f25379c) {
                dVar.s();
                return;
            }
            dVar.C.setAlpha(255);
            d.this.C.start();
            d dVar2 = d.this;
            if (dVar2.I && (jVar = dVar2.b) != null) {
                jVar.e();
            }
            d dVar3 = d.this;
            dVar3.f25390n = dVar3.f25398v.getTop();
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
            d.this.setAnimationProgress(f10);
        }
    }

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            d.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: renamed from: n5.d$d, reason: collision with other inner class name */
    public class C0494d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f25406a;
        public final /* synthetic */ int b;

        public C0494d(int i10, int i11) {
            this.f25406a = i10;
            this.b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            n5.b bVar = d.this.C;
            int i10 = this.f25406a;
            bVar.setAlpha((int) (i10 + ((this.b - i10) * f10)));
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d dVar = d.this;
            if (dVar.f25395s) {
                return;
            }
            dVar.z(null);
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
            d dVar = d.this;
            int iAbs = !dVar.K ? dVar.A - Math.abs(dVar.f25402z) : dVar.A;
            d dVar2 = d.this;
            int i10 = dVar2.f25400x;
            d.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - dVar2.f25398v.getTop());
            d.this.C.e(1.0f - f10);
        }
    }

    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            d.this.q(f10);
        }
    }

    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            d dVar = d.this;
            float f11 = dVar.f25401y;
            dVar.setAnimationProgress(f11 + ((-f11) * f10));
            d.this.q(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void e();
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25379c = false;
        this.f25381e = -1.0f;
        this.f25385i = new int[2];
        this.f25386j = new int[2];
        this.f25387k = new int[2];
        this.f25394r = -1;
        this.f25399w = -1;
        this.M = new a();
        this.N = new f();
        this.O = new g();
        this.f25380d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f25389m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f25397u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        e();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.A = i10;
        this.f25381e = i10;
        this.f25383g = new x(this);
        this.f25384h = new u(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.J;
        this.f25390n = i11;
        this.f25402z = i11;
        q(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f25394r) {
            this.f25394r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f25398v.getBackground().setAlpha(i10);
        this.C.setAlpha(i10);
    }

    public final void A(int i10, Animation.AnimationListener animationListener) {
        this.f25400x = i10;
        this.f25401y = this.f25398v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f25398v.b(animationListener);
        }
        this.f25398v.clearAnimation();
        this.f25398v.startAnimation(this.H);
    }

    public final void B(Animation.AnimationListener animationListener) {
        this.f25398v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(this.f25389m);
        if (animationListener != null) {
            this.f25398v.b(animationListener);
        }
        this.f25398v.clearAnimation();
        this.f25398v.startAnimation(this.D);
    }

    public final void b(int i10, Animation.AnimationListener animationListener) {
        this.f25400x = i10;
        this.N.reset();
        this.N.setDuration(200L);
        this.N.setInterpolator(this.f25397u);
        if (animationListener != null) {
            this.f25398v.b(animationListener);
        }
        this.f25398v.clearAnimation();
        this.f25398v.startAnimation(this.N);
    }

    public final void c(int i10, Animation.AnimationListener animationListener) {
        if (this.f25395s) {
            A(i10, animationListener);
            return;
        }
        this.f25400x = i10;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.f25397u);
        if (animationListener != null) {
            this.f25398v.b(animationListener);
        }
        this.f25398v.clearAnimation();
        this.f25398v.startAnimation(this.O);
    }

    public boolean d() {
        View view = this.f25378a;
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
        return this.f25384h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f25384h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f25384h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f25384h.f(i10, i11, i12, i13, iArr);
    }

    public final void e() {
        this.f25398v = new n5.a(getContext());
        n5.b bVar = new n5.b(getContext());
        this.C = bVar;
        bVar.l(1);
        this.f25398v.setImageDrawable(this.C);
        this.f25398v.setVisibility(8);
        addView(this.f25398v);
    }

    public void f(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f25384h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    public final void g() {
        if (this.f25378a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f25398v)) {
                    this.f25378a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f25399w;
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
        return this.f25383g.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.f25402z;
    }

    public final void h(float f10) {
        if (f10 > this.f25381e) {
            t(true, true);
            return;
        }
        this.f25379c = false;
        this.C.j(0.0f, 0.0f);
        c(this.f25390n, !this.f25395s ? new e() : null);
        this.C.d(false);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f25384h.j();
    }

    @Override // androidx.core.view.v
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f25384h.l();
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
        f(i10, i11, i12, i13, this.f25386j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f25386j[1] : i16;
        if (i17 >= 0 || d()) {
            return;
        }
        float fAbs = this.f25382f + Math.abs(i17);
        this.f25382f = fAbs;
        p(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.v
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f25387k);
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
        if (this.f25396t && actionMasked == 0) {
            this.f25396t = false;
        }
        if (!isEnabled() || this.f25396t || d() || this.f25379c || this.f25388l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f25402z - this.f25398v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f25394r = pointerId;
            this.f25393q = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f25392p = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f25393q = false;
            this.f25394r = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f25394r;
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
            this.f25393q = false;
            this.f25394r = -1;
        } else if (actionMasked == 6) {
            r(motionEvent);
        }
        return this.f25393q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f25378a == null) {
            g();
        }
        View view = this.f25378a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f25398v.getMeasuredWidth();
        int measuredHeight2 = this.f25398v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f25390n;
        this.f25398v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f25378a == null) {
            g();
        }
        View view = this.f25378a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f25398v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
        this.f25399w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f25398v) {
                this.f25399w = i12;
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
            float f10 = this.f25382f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f25382f = 0.0f;
                } else {
                    this.f25382f = f10 - f11;
                    iArr[1] = i11;
                }
                p(this.f25382f);
            }
        }
        if (this.K && i11 > 0 && this.f25382f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f25398v.setVisibility(8);
        }
        int[] iArr2 = this.f25385i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f25387k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f25383g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f25382f = 0.0f;
        this.f25388l = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f25412a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f25379c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f25396t || this.f25379c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f25383g.d(view);
        this.f25388l = false;
        float f10 = this.f25382f;
        if (f10 > 0.0f) {
            h(f10);
            this.f25382f = 0.0f;
        } else {
            post(new Runnable() { // from class: n5.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25377a.s();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f25396t && actionMasked == 0) {
            this.f25396t = false;
        }
        if (!isEnabled() || this.f25396t || d() || this.f25379c || this.f25388l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f25394r = motionEvent.getPointerId(0);
            this.f25393q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f25394r);
                if (iFindPointerIndex < 0) {
                    Log.e(P, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f25393q) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f25391o) * 0.5f;
                    this.f25393q = false;
                    h(y10);
                }
                this.f25394r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f25394r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                w(y11);
                if (this.f25393q) {
                    float f10 = (y11 - this.f25391o) * 0.5f;
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
                    this.f25394r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    r(motionEvent);
                }
            }
        }
        return true;
    }

    public final void p(float f10) {
        this.C.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f25381e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f25381e;
        int i10 = this.B;
        if (i10 <= 0) {
            i10 = this.K ? this.A - this.f25402z : this.A;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f25402z + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f25398v.getVisibility() != 0) {
            this.f25398v.setVisibility(0);
        }
        if (!this.f25395s) {
            this.f25398v.setScaleX(1.0f);
            this.f25398v.setScaleY(1.0f);
        }
        if (this.f25395s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f25381e));
        }
        if (f10 < this.f25381e) {
            if (this.C.getAlpha() > 76 && !l(this.F)) {
                y();
            }
        } else if (this.C.getAlpha() < 255 && !l(this.G)) {
            x();
        }
        this.C.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.C.e(Math.min(1.0f, fMax));
        this.C.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f25390n);
    }

    public void q(float f10) {
        int i10 = this.f25400x;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f25402z - i10) * f10))) - this.f25398v.getTop());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view;
        if (!this.L || (view = this.f25378a) == null || o0.S(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void s() {
        this.f25398v.clearAnimation();
        this.C.stop();
        this.f25398v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f25395s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f25402z - this.f25390n);
        }
        this.f25390n = this.f25398v.getTop();
    }

    public void setAnimationProgress(float f10) {
        this.f25398v.setScaleX(f10);
        this.f25398v.setScaleY(f10);
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
        this.f25381e = i10;
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
        this.f25384h.m(z10);
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
        this.f25398v.setBackgroundColor(i10);
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
            this.f25398v.setImageDrawable(null);
            this.C.l(i10);
            this.f25398v.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.B = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f25398v.bringToFront();
        o0.X(this.f25398v, i10);
        this.f25390n = this.f25398v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f25384h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f25384h.q();
    }

    public final void t(boolean z10, boolean z11) {
        if (this.f25379c != z10) {
            this.I = z11;
            g();
            this.f25379c = z10;
            if (z10) {
                b(this.f25390n, this.M);
            } else {
                z(this.M);
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        if (!z10 || this.f25379c == z10) {
            t(z10, false);
            return;
        }
        this.f25379c = z10;
        setTargetOffsetTopAndBottom((!this.K ? this.A + this.f25402z : this.A) - this.f25390n);
        this.I = z11;
        B(this.M);
    }

    public final Animation v(int i10, int i11) {
        C0494d c0494d = new C0494d(i10, i11);
        c0494d.setDuration(300L);
        this.f25398v.b(null);
        this.f25398v.clearAnimation();
        this.f25398v.startAnimation(c0494d);
        return c0494d;
    }

    public final void w(float f10) {
        float f11 = this.f25392p;
        float f12 = f10 - f11;
        int i10 = this.f25380d;
        if (f12 <= i10 || this.f25393q) {
            return;
        }
        this.f25391o = f11 + i10;
        this.f25393q = true;
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
        this.f25398v.b(animationListener);
        this.f25398v.clearAnimation();
        this.f25398v.startAnimation(this.E);
    }

    public static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f25412a;

        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f25412a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f25412a ? (byte) 1 : (byte) 0);
        }

        public k(Parcel parcel) {
            super(parcel);
            this.f25412a = parcel.readByte() != 0;
        }
    }
}
