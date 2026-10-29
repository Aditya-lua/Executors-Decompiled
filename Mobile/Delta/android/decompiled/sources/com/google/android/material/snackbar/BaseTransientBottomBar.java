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
    public final int f8145a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f8147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f8148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f8149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ViewGroup f8150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f8151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final t f8152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final id.a f8153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q f8156m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8165v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<r<B>> f8166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Behavior f8167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f8168y;
    public static final TimeInterpolator A = ic.a.b;
    public static final TimeInterpolator B = ic.a.f20471a;
    public static final TimeInterpolator C = ic.a.f20473d;
    public static final boolean E = false;
    public static final int[] F = {hc.b.V};
    public static final String G = BaseTransientBottomBar.class.getSimpleName();

    @NonNull
    public static final Handler D = new Handler(Looper.getMainLooper(), new h());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8157n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f8158o = new i();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public com.google.android.material.snackbar.a.b f8169z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public final s f8170l = new s(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f8170l.a(view);
        }

        public final void U(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8170l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f8170l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8171a;

        public a(int i10) {
            this.f8171a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f8171a);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f8152i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f8152i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f8152i.setScaleY(fFloatValue);
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
            BaseTransientBottomBar.this.f8153j.a(BaseTransientBottomBar.this.f8146c - BaseTransientBottomBar.this.f8145a, BaseTransientBottomBar.this.f8145a);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8175a;
        public final /* synthetic */ int b;

        public e(int i10) {
            this.b = i10;
            this.f8175a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.E) {
                o0.X(BaseTransientBottomBar.this.f8152i, iIntValue - this.f8175a);
            } else {
                BaseTransientBottomBar.this.f8152i.setTranslationY(iIntValue);
            }
            this.f8175a = iIntValue;
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8177a;

        public f(int i10) {
            this.f8177a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f8177a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f8153j.b(0, BaseTransientBottomBar.this.b);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8178a = 0;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.E) {
                o0.X(BaseTransientBottomBar.this.f8152i, iIntValue - this.f8178a);
            } else {
                BaseTransientBottomBar.this.f8152i.setTranslationY(iIntValue);
            }
            this.f8178a = iIntValue;
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
            if (baseTransientBottomBar.f8152i == null || baseTransientBottomBar.f8151h == null) {
                return;
            }
            int iHeight = (zc.t.a(BaseTransientBottomBar.this.f8151h).height() - BaseTransientBottomBar.this.J()) + ((int) BaseTransientBottomBar.this.f8152i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f8163t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f8164u = baseTransientBottomBar2.f8163t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f8152i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f8164u = baseTransientBottomBar3.f8163t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f8163t - iHeight;
            BaseTransientBottomBar.this.f8152i.requestLayout();
        }
    }

    public class j implements y {
        public j() {
        }

        @Override // androidx.core.view.y
        @NonNull
        public WindowInsetsCompat K(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f8159p = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f8160q = windowInsetsCompat.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f8161r = windowInsetsCompat.getSystemWindowInsetRight();
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
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.f8169z);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.a.c().j(BaseTransientBottomBar.this.f8169z);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar = BaseTransientBottomBar.this.f8152i;
            if (tVar == null) {
                return;
            }
            if (tVar.getParent() != null) {
                BaseTransientBottomBar.this.f8152i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f8152i.getAnimationMode() == 1) {
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
        public final WeakReference<BaseTransientBottomBar> f8187a;

        @NonNull
        public final WeakReference<View> b;

        public q(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.f8187a = new WeakReference<>(baseTransientBottomBar);
            this.b = new WeakReference<>(view);
        }

        public static q a(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (o0.Q(view)) {
                zc.r.b(view, qVar);
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
                zc.r.j(this.b.get(), this);
            }
            this.b.clear();
            this.f8187a.clear();
        }

        public final boolean d() {
            if (this.f8187a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !this.f8187a.get().f8157n) {
                return;
            }
            this.f8187a.get().T();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            zc.r.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            zc.r.j(view, this);
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
        public com.google.android.material.snackbar.a.b f8188a;

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
                    com.google.android.material.snackbar.a.c().j(this.f8188a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.c().k(this.f8188a);
            }
        }

        public void c(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8188a = baseTransientBottomBar.f8169z;
        }
    }

    public static class t extends FrameLayout {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final View.OnTouchListener f8189l = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BaseTransientBottomBar<?> f8190a;
        public gd.k b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f8192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f8193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8195g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ColorStateList f8196h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f8197i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Rect f8198j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f8199k;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public t(@NonNull Context context, AttributeSet attributeSet) {
            super(ld.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, hc.k.L5);
            int i10 = hc.k.S5;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                o0.u0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f8191c = typedArrayObtainStyledAttributes.getInt(hc.k.O5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(hc.k.U5) || typedArrayObtainStyledAttributes.hasValue(hc.k.V5)) {
                this.b = gd.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f8192d = typedArrayObtainStyledAttributes.getFloat(hc.k.P5, 1.0f);
            setBackgroundTintList(dd.c.a(context2, typedArrayObtainStyledAttributes, hc.k.Q5));
            setBackgroundTintMode(zc.r.i(typedArrayObtainStyledAttributes.getInt(hc.k.R5, -1), PorterDuff.Mode.SRC_IN));
            this.f8193e = typedArrayObtainStyledAttributes.getFloat(hc.k.N5, 1.0f);
            this.f8194f = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.M5, -1);
            this.f8195g = typedArrayObtainStyledAttributes.getDimensionPixelSize(hc.k.T5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f8189l);
            setFocusable(true);
            if (getBackground() == null) {
                o0.q0(this, d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8190a = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.f8199k = true;
            viewGroup.addView(this);
            this.f8199k = false;
        }

        @NonNull
        public final Drawable d() {
            int iK = tc.a.k(this, hc.b.f18790o, hc.b.f18785j, getBackgroundOverlayColorAlpha());
            gd.k kVar = this.b;
            Drawable drawableZ = kVar != null ? BaseTransientBottomBar.z(iK, kVar) : BaseTransientBottomBar.y(iK, getResources());
            if (this.f8196h == null) {
                return q2.a.r(drawableZ);
            }
            Drawable drawableR = q2.a.r(drawableZ);
            q2.a.o(drawableR, this.f8196h);
            return drawableR;
        }

        public final void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f8198j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f8193e;
        }

        public int getAnimationMode() {
            return this.f8191c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f8192d;
        }

        public int getMaxInlineActionWidth() {
            return this.f8195g;
        }

        public int getMaxWidth() {
            return this.f8194f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8190a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
            o0.j0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8190a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8190a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f8194f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f8194f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        public void setAnimationMode(int i10) {
            this.f8191c = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f8196h != null) {
                drawable = q2.a.r(drawable.mutate());
                q2.a.o(drawable, this.f8196h);
                q2.a.p(drawable, this.f8197i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f8196h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = q2.a.r(getBackground().mutate());
                q2.a.o(drawableR, colorStateList);
                q2.a.p(drawableR, this.f8197i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f8197i = mode;
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
            if (this.f8199k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8190a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.g0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f8189l);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull id.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f8150g = viewGroup;
        this.f8153j = aVar;
        this.f8151h = context;
        zc.o.a(context);
        t tVar = (t) LayoutInflater.from(context).inflate(H(), viewGroup, false);
        this.f8152i = tVar;
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
        this.f8168y = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = hc.b.F;
        this.f8146c = bd.h.f(context, i10, 250);
        this.f8145a = bd.h.f(context, i10, 150);
        this.b = bd.h.f(context, hc.b.G, 75);
        int i11 = hc.b.P;
        this.f8147d = bd.h.g(context, i11, B);
        this.f8149f = bd.h.g(context, i11, C);
        this.f8148e = bd.h.g(context, i11, A);
    }

    @NonNull
    public static GradientDrawable y(int i10, @NonNull Resources resources) {
        float dimension = resources.getDimension(hc.d.f18825h0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    @NonNull
    public static gd.g z(int i10, @NonNull gd.k kVar) {
        gd.g gVar = new gd.g(kVar);
        gVar.a0(ColorStateList.valueOf(i10));
        return gVar;
    }

    public void A() {
        B(3);
    }

    public void B(int i10) {
        com.google.android.material.snackbar.a.c().b(this.f8169z, i10);
    }

    public final ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8147d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public View D() {
        q qVar = this.f8156m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int E() {
        return this.f8154k;
    }

    @NonNull
    public SwipeDismissBehavior<? extends View> F() {
        return new Behavior();
    }

    public final ValueAnimator G(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8149f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    public int H() {
        return K() ? hc.h.f18905t : hc.h.b;
    }

    public final int I() {
        int height = this.f8152i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f8152i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final int J() {
        int[] iArr = new int[2];
        this.f8152i.getLocationInWindow(iArr);
        return iArr[1] + this.f8152i.getHeight();
    }

    public boolean K() {
        TypedArray typedArrayObtainStyledAttributes = this.f8151h.obtainStyledAttributes(F);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void L(int i10) {
        if (X() && this.f8152i.getVisibility() == 0) {
            w(i10);
        } else {
            R(i10);
        }
    }

    public boolean M() {
        return com.google.android.material.snackbar.a.c().e(this.f8169z);
    }

    public final boolean N() {
        ViewGroup.LayoutParams layoutParams = this.f8152i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void O() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f8152i.getRootWindowInsets()) == null) {
            return;
        }
        this.f8163t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        g0();
    }

    public void P() {
        if (M()) {
            D.post(new m());
        }
    }

    public void Q() {
        if (this.f8165v) {
            b0();
            this.f8165v = false;
        }
    }

    public void R(int i10) {
        com.google.android.material.snackbar.a.c().h(this.f8169z);
        List<r<B>> list = this.f8166w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f8166w.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f8152i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f8152i);
        }
    }

    public void S() {
        com.google.android.material.snackbar.a.c().i(this.f8169z);
        List<r<B>> list = this.f8166w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f8166w.get(size).b(this);
            }
        }
    }

    public final void T() {
        this.f8162s = x();
        g0();
    }

    @NonNull
    public B U(View view) {
        q qVar = this.f8156m;
        if (qVar != null) {
            qVar.c();
        }
        this.f8156m = view == null ? null : q.a(this, view);
        return this;
    }

    @NonNull
    public B V(int i10) {
        this.f8154k = i10;
        return this;
    }

    public final void W(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorF = this.f8167x;
        if (swipeDismissBehaviorF == null) {
            swipeDismissBehaviorF = F();
        }
        if (swipeDismissBehaviorF instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorF).U(this);
        }
        swipeDismissBehaviorF.P(new n());
        fVar.o(swipeDismissBehaviorF);
        if (D() == null) {
            fVar.f1733g = 80;
        }
    }

    public boolean X() {
        AccessibilityManager accessibilityManager = this.f8168y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean Y() {
        return this.f8163t > 0 && !this.f8155l && N();
    }

    public void Z() {
        com.google.android.material.snackbar.a.c().m(E(), this.f8169z);
    }

    public final void a0() {
        if (this.f8152i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f8152i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                W((CoordinatorLayout.f) layoutParams);
            }
            this.f8152i.c(this.f8150g);
            T();
            this.f8152i.setVisibility(4);
        }
        if (o0.R(this.f8152i)) {
            b0();
        } else {
            this.f8165v = true;
        }
    }

    public final void b0() {
        if (X()) {
            v();
            return;
        }
        if (this.f8152i.getParent() != null) {
            this.f8152i.setVisibility(0);
        }
        S();
    }

    public final void c0() {
        ValueAnimator valueAnimatorC = C(0.0f, 1.0f);
        ValueAnimator valueAnimatorG = G(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorG);
        animatorSet.setDuration(this.f8145a);
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
            o0.X(this.f8152i, I);
        } else {
            this.f8152i.setTranslationY(I);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(I, 0);
        valueAnimator.setInterpolator(this.f8148e);
        valueAnimator.setDuration(this.f8146c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(I));
        valueAnimator.start();
    }

    public final void f0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, I());
        valueAnimator.setInterpolator(this.f8148e);
        valueAnimator.setDuration(this.f8146c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public final void g0() {
        ViewGroup.LayoutParams layoutParams = this.f8152i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(G, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f8152i.f8198j == null) {
            Log.w(G, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f8152i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f8152i.f8198j.bottom + (D() != null ? this.f8162s : this.f8159p);
        int i11 = this.f8152i.f8198j.left + this.f8160q;
        int i12 = this.f8152i.f8198j.right + this.f8161r;
        int i13 = this.f8152i.f8198j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f8152i.requestLayout();
        }
        if ((z10 || this.f8164u != this.f8163t) && Build.VERSION.SDK_INT >= 29 && Y()) {
            this.f8152i.removeCallbacks(this.f8158o);
            this.f8152i.post(this.f8158o);
        }
    }

    @NonNull
    public B u(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f8166w == null) {
            this.f8166w = new ArrayList();
        }
        this.f8166w.add(rVar);
        return this;
    }

    public void v() {
        this.f8152i.post(new o());
    }

    public final void w(int i10) {
        if (this.f8152i.getAnimationMode() == 1) {
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
        this.f8150g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f8150g.getHeight()) - i10;
    }
}
