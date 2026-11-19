package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8063a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f8065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f8066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f8067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ViewGroup f8068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f8069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final t f8070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final kd.a f8071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q f8074m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8081t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8082u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8083v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<r<B>> f8084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Behavior f8085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f8086y;
    public static final TimeInterpolator A = kc.a.b;
    public static final TimeInterpolator B = kc.a.f21325a;
    public static final TimeInterpolator C = kc.a.f21327d;
    public static final boolean E = false;
    public static final int[] F = {jc.b.V};
    public static final String G = BaseTransientBottomBar.class.getSimpleName();

    @NonNull
    public static final Handler D = new Handler(Looper.getMainLooper(), new h());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8075n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f8076o = new i();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public com.google.android.material.snackbar.a.b f8087z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public final s f8088l = new s(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f8088l.a(view);
        }

        public final void U(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8088l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f8088l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8089a;

        public a(int i10) {
            this.f8089a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f8089a);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f8070i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f8070i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f8070i.setScaleY(fFloatValue);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f8071j.a(BaseTransientBottomBar.this.f8064c - BaseTransientBottomBar.this.f8063a, BaseTransientBottomBar.this.f8063a);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8093a;
        public final /* synthetic */ int b;

        public e(int i10) {
            this.b = i10;
            this.f8093a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.E) {
                o0.X(BaseTransientBottomBar.this.f8070i, iIntValue - this.f8093a);
            } else {
                BaseTransientBottomBar.this.f8070i.setTranslationY(iIntValue);
            }
            this.f8093a = iIntValue;
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8095a;

        public f(int i10) {
            this.f8095a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f8095a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f8071j.b(0, BaseTransientBottomBar.this.b);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8096a = 0;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.E) {
                o0.X(BaseTransientBottomBar.this.f8070i, iIntValue - this.f8096a);
            } else {
                BaseTransientBottomBar.this.f8070i.setTranslationY(iIntValue);
            }
            this.f8096a = iIntValue;
        }
    }

    public class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).a0();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).L(message.arg1);
            return true;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f8070i == null || baseTransientBottomBar.f8069h == null) {
                return;
            }
            int iHeight = (bd.t.a(BaseTransientBottomBar.this.f8069h).height() - BaseTransientBottomBar.this.J()) + ((int) BaseTransientBottomBar.this.f8070i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f8081t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f8082u = baseTransientBottomBar2.f8081t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f8070i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f8082u = baseTransientBottomBar3.f8081t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f8081t - iHeight;
            BaseTransientBottomBar.this.f8070i.requestLayout();
        }
    }

    public class j implements y {
        public j() {
        }

        @Override // androidx.core.view.y
        @NonNull
        public WindowInsetsCompat J(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f8077p = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f8078q = windowInsetsCompat.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f8079r = windowInsetsCompat.getSystemWindowInsetRight();
            BaseTransientBottomBar.this.g0();
            return windowInsetsCompat;
        }
    }

    public class k extends androidx.core.view.a {
        public k() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull y2.p pVar) {
            super.g(view, pVar);
            pVar.a(1048576);
            pVar.q0(true);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.A();
            return true;
        }
    }

    public class l implements com.google.android.material.snackbar.a.b {
        public l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a(int i10) {
            Handler handler = BaseTransientBottomBar.D;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void show() {
            Handler handler = BaseTransientBottomBar.D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.R(3);
        }
    }

    public class n implements SwipeDismissBehavior.c {
        public n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@NonNull View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.B(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.f8087z);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.a.c().j(BaseTransientBottomBar.this.f8087z);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar = BaseTransientBottomBar.this.f8070i;
            if (tVar == null) {
                return;
            }
            if (tVar.getParent() != null) {
                BaseTransientBottomBar.this.f8070i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f8070i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.c0();
            } else {
                BaseTransientBottomBar.this.e0();
            }
        }
    }

    public class p extends AnimatorListenerAdapter {
        public p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }
    }

    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<BaseTransientBottomBar> f8105a;

        @NonNull
        public final WeakReference<View> b;

        public q(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.f8105a = new WeakReference<>(baseTransientBottomBar);
            this.b = new WeakReference<>(view);
        }

        public static q a(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (o0.Q(view)) {
                bd.r.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        public View b() {
            return this.b.get();
        }

        public void c() {
            if (this.b.get() != null) {
                this.b.get().removeOnAttachStateChangeListener(this);
                bd.r.j(this.b.get(), this);
            }
            this.b.clear();
            this.f8105a.clear();
        }

        public final boolean d() {
            if (this.f8105a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !this.f8105a.get().f8075n) {
                return;
            }
            this.f8105a.get().T();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            bd.r.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            bd.r.j(view, this);
        }
    }

    public static abstract class r<B> {
        public void a(B b, int i10) {
        }

        public void b(B b) {
        }
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.google.android.material.snackbar.a.b f8106a;

        public s(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof t;
        }

        public void b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.c().j(this.f8106a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.c().k(this.f8106a);
            }
        }

        public void c(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8106a = baseTransientBottomBar.f8087z;
        }
    }

    public static class t extends FrameLayout {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final View.OnTouchListener f8107l = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BaseTransientBottomBar<?> f8108a;
        public id.k b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f8110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f8111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8113g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ColorStateList f8114h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f8115i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Rect f8116j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f8117k;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public t(@NonNull Context context, AttributeSet attributeSet) {
            super(od.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, jc.k.L5);
            if (typedArrayObtainStyledAttributes.hasValue(jc.k.S5)) {
                o0.u0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.S5, 0));
            }
            this.f8109c = typedArrayObtainStyledAttributes.getInt(jc.k.O5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(jc.k.U5) || typedArrayObtainStyledAttributes.hasValue(jc.k.V5)) {
                this.b = id.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f8110d = typedArrayObtainStyledAttributes.getFloat(jc.k.P5, 1.0f);
            setBackgroundTintList(fd.c.a(context2, typedArrayObtainStyledAttributes, jc.k.Q5));
            setBackgroundTintMode(bd.r.i(typedArrayObtainStyledAttributes.getInt(jc.k.R5, -1), PorterDuff.Mode.SRC_IN));
            this.f8111e = typedArrayObtainStyledAttributes.getFloat(jc.k.N5, 1.0f);
            this.f8112f = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.M5, -1);
            this.f8113g = typedArrayObtainStyledAttributes.getDimensionPixelSize(jc.k.T5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f8107l);
            setFocusable(true);
            if (getBackground() == null) {
                o0.q0(this, d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8108a = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.f8117k = true;
            viewGroup.addView(this);
            this.f8117k = false;
        }

        @NonNull
        public final Drawable d() {
            int iK = vc.a.k(this, jc.b.f20300o, jc.b.f20295j, getBackgroundOverlayColorAlpha());
            id.k kVar = this.b;
            Drawable drawableZ = kVar != null ? BaseTransientBottomBar.z(iK, kVar) : BaseTransientBottomBar.y(iK, getResources());
            if (this.f8114h == null) {
                return q2.a.r(drawableZ);
            }
            Drawable drawableR = q2.a.r(drawableZ);
            q2.a.o(drawableR, this.f8114h);
            return drawableR;
        }

        public final void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f8116j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f8111e;
        }

        public int getAnimationMode() {
            return this.f8109c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f8110d;
        }

        public int getMaxInlineActionWidth() {
            return this.f8113g;
        }

        public int getMaxWidth() {
            return this.f8112f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8108a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
            o0.j0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8108a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8108a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f8112f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f8112f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        public void setAnimationMode(int i10) {
            this.f8109c = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f8114h != null) {
                drawable = q2.a.r(drawable.mutate());
                q2.a.o(drawable, this.f8114h);
                q2.a.p(drawable, this.f8115i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f8114h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = q2.a.r(getBackground().mutate());
                q2.a.o(drawableR, colorStateList);
                q2.a.p(drawableR, this.f8115i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f8115i = mode;
            if (getBackground() != null) {
                Drawable drawableR = q2.a.r(getBackground().mutate());
                q2.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f8117k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8108a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.g0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f8107l);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull kd.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f8068g = viewGroup;
        this.f8071j = aVar;
        this.f8069h = context;
        bd.o.a(context);
        t tVar = (t) LayoutInflater.from(context).inflate(H(), viewGroup, false);
        this.f8070i = tVar;
        tVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(tVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(tVar.getMaxInlineActionWidth());
        }
        tVar.addView(view);
        o0.o0(tVar, 1);
        o0.w0(tVar, 1);
        o0.v0(tVar, true);
        o0.A0(tVar, new j());
        o0.m0(tVar, new k());
        this.f8086y = (AccessibilityManager) context.getSystemService("accessibility");
        this.f8064c = dd.h.f(context, jc.b.F, 250);
        this.f8063a = dd.h.f(context, jc.b.F, 150);
        this.b = dd.h.f(context, jc.b.G, 75);
        this.f8065d = dd.h.g(context, jc.b.P, B);
        this.f8067f = dd.h.g(context, jc.b.P, C);
        this.f8066e = dd.h.g(context, jc.b.P, A);
    }

    @NonNull
    public static GradientDrawable y(int i10, @NonNull Resources resources) {
        float dimension = resources.getDimension(jc.d.f20335h0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    @NonNull
    public static id.g z(int i10, @NonNull id.k kVar) {
        id.g gVar = new id.g(kVar);
        gVar.a0(ColorStateList.valueOf(i10));
        return gVar;
    }

    public void A() {
        B(3);
    }

    public void B(int i10) {
        com.google.android.material.snackbar.a.c().b(this.f8087z, i10);
    }

    public final ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8065d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public View D() {
        q qVar = this.f8074m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int E() {
        return this.f8072k;
    }

    @NonNull
    public SwipeDismissBehavior<? extends View> F() {
        return new Behavior();
    }

    public final ValueAnimator G(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8067f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    public int H() {
        return K() ? jc.h.f20415t : jc.h.b;
    }

    public final int I() {
        int height = this.f8070i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f8070i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final int J() {
        int[] iArr = new int[2];
        this.f8070i.getLocationInWindow(iArr);
        return iArr[1] + this.f8070i.getHeight();
    }

    public boolean K() {
        TypedArray typedArrayObtainStyledAttributes = this.f8069h.obtainStyledAttributes(F);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void L(int i10) {
        if (X() && this.f8070i.getVisibility() == 0) {
            w(i10);
        } else {
            R(i10);
        }
    }

    public boolean M() {
        return com.google.android.material.snackbar.a.c().e(this.f8087z);
    }

    public final boolean N() {
        ViewGroup.LayoutParams layoutParams = this.f8070i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void O() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f8070i.getRootWindowInsets()) == null) {
            return;
        }
        this.f8081t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        g0();
    }

    public void P() {
        if (M()) {
            D.post(new m());
        }
    }

    public void Q() {
        if (this.f8083v) {
            b0();
            this.f8083v = false;
        }
    }

    public void R(int i10) {
        com.google.android.material.snackbar.a.c().h(this.f8087z);
        List<r<B>> list = this.f8084w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f8084w.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f8070i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f8070i);
        }
    }

    public void S() {
        com.google.android.material.snackbar.a.c().i(this.f8087z);
        List<r<B>> list = this.f8084w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f8084w.get(size).b(this);
            }
        }
    }

    public final void T() {
        this.f8080s = x();
        g0();
    }

    @NonNull
    public B U(View view) {
        q qVar = this.f8074m;
        if (qVar != null) {
            qVar.c();
        }
        this.f8074m = view == null ? null : q.a(this, view);
        return this;
    }

    @NonNull
    public B V(int i10) {
        this.f8072k = i10;
        return this;
    }

    public final void W(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorF = this.f8085x;
        if (swipeDismissBehaviorF == null) {
            swipeDismissBehaviorF = F();
        }
        if (swipeDismissBehaviorF instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorF).U(this);
        }
        swipeDismissBehaviorF.P(new n());
        fVar.o(swipeDismissBehaviorF);
        if (D() == null) {
            fVar.f1539g = 80;
        }
    }

    public boolean X() {
        AccessibilityManager accessibilityManager = this.f8086y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean Y() {
        return this.f8081t > 0 && !this.f8073l && N();
    }

    public void Z() {
        com.google.android.material.snackbar.a.c().m(E(), this.f8087z);
    }

    public final void a0() {
        if (this.f8070i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f8070i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                W((CoordinatorLayout.f) layoutParams);
            }
            this.f8070i.c(this.f8068g);
            T();
            this.f8070i.setVisibility(4);
        }
        if (o0.R(this.f8070i)) {
            b0();
        } else {
            this.f8083v = true;
        }
    }

    public final void b0() {
        if (X()) {
            v();
            return;
        }
        if (this.f8070i.getParent() != null) {
            this.f8070i.setVisibility(0);
        }
        S();
    }

    public final void c0() {
        ValueAnimator valueAnimatorC = C(0.0f, 1.0f);
        ValueAnimator valueAnimatorG = G(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorG);
        animatorSet.setDuration(this.f8063a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    public final void d0(int i10) {
        ValueAnimator valueAnimatorC = C(1.0f, 0.0f);
        valueAnimatorC.setDuration(this.b);
        valueAnimatorC.addListener(new a(i10));
        valueAnimatorC.start();
    }

    public final void e0() {
        int I = I();
        if (E) {
            o0.X(this.f8070i, I);
        } else {
            this.f8070i.setTranslationY(I);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(I, 0);
        valueAnimator.setInterpolator(this.f8066e);
        valueAnimator.setDuration(this.f8064c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(I));
        valueAnimator.start();
    }

    public final void f0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, I());
        valueAnimator.setInterpolator(this.f8066e);
        valueAnimator.setDuration(this.f8064c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public final void g0() {
        ViewGroup.LayoutParams layoutParams = this.f8070i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(G, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f8070i.f8116j == null) {
            Log.w(G, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f8070i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f8070i.f8116j.bottom + (D() != null ? this.f8080s : this.f8077p);
        int i11 = this.f8070i.f8116j.left + this.f8078q;
        int i12 = this.f8070i.f8116j.right + this.f8079r;
        int i13 = this.f8070i.f8116j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f8070i.requestLayout();
        }
        if ((z10 || this.f8082u != this.f8081t) && Build.VERSION.SDK_INT >= 29 && Y()) {
            this.f8070i.removeCallbacks(this.f8076o);
            this.f8070i.post(this.f8076o);
        }
    }

    @NonNull
    public B u(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f8084w == null) {
            this.f8084w = new ArrayList();
        }
        this.f8084w.add(rVar);
        return this;
    }

    public void v() {
        this.f8070i.post(new o());
    }

    public final void w(int i10) {
        if (this.f8070i.getAnimationMode() == 1) {
            d0(i10);
        } else {
            f0(i10);
        }
    }

    public final int x() {
        if (D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        D().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f8068g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f8068g.getHeight()) - i10;
    }
}
