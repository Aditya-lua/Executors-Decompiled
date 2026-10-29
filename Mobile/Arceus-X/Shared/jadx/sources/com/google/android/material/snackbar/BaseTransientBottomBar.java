package com.google.android.material.snackbar;

import ad.C0143o;
import ad.C0146r;
import ad.C0148t;
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
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import cd.C1627h;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import md.C8485a;
import p101ed.C5050c;
import p168hd.C6363g;
import p168hd.C6367k;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6744h;
import p194ic.C6747k;
import p216jc.C7137a;
import p217jd.InterfaceC7148a;
import p368q2.C10425a;
import p463uc.C11840a;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a */
    public final int f10453a;

    /* JADX INFO: renamed from: b */
    public final int f10454b;

    /* JADX INFO: renamed from: c */
    public final int f10455c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f10456d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f10457e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f10458f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ViewGroup f10459g;

    /* JADX INFO: renamed from: h */
    public final Context f10460h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final C2848t f10461i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final InterfaceC7148a f10462j;

    /* JADX INFO: renamed from: k */
    public int f10463k;

    /* JADX INFO: renamed from: l */
    public boolean f10464l;

    /* JADX INFO: renamed from: m */
    public ViewOnAttachStateChangeListenerC2845q f10465m;

    /* JADX INFO: renamed from: p */
    public int f10468p;

    /* JADX INFO: renamed from: q */
    public int f10469q;

    /* JADX INFO: renamed from: r */
    public int f10470r;

    /* JADX INFO: renamed from: s */
    public int f10471s;

    /* JADX INFO: renamed from: t */
    public int f10472t;

    /* JADX INFO: renamed from: u */
    public int f10473u;

    /* JADX INFO: renamed from: v */
    public boolean f10474v;

    /* JADX INFO: renamed from: w */
    public List<AbstractC2846r<B>> f10475w;

    /* JADX INFO: renamed from: x */
    public Behavior f10476x;

    /* JADX INFO: renamed from: y */
    public final AccessibilityManager f10477y;

    /* JADX INFO: renamed from: A */
    public static final TimeInterpolator f10446A = C7137a.f27785b;

    /* JADX INFO: renamed from: B */
    public static final TimeInterpolator f10447B = C7137a.f27784a;

    /* JADX INFO: renamed from: C */
    public static final TimeInterpolator f10448C = C7137a.f27787d;

    /* JADX INFO: renamed from: E */
    public static final boolean f10450E = false;

    /* JADX INFO: renamed from: F */
    public static final int[] f10451F = {C6738b.f25880V};

    /* JADX INFO: renamed from: G */
    public static final String f10452G = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: D */
    @NonNull
    public static final Handler f10449D = new Handler(Looper.getMainLooper(), new C2836h());

    /* JADX INFO: renamed from: n */
    public boolean f10466n = false;

    /* JADX INFO: renamed from: o */
    public final Runnable f10467o = new RunnableC2837i();

    /* JADX INFO: renamed from: z */
    @NonNull
    public C2850a.b f10478z = new C2840l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: l */
        @NonNull
        public final C2847s f10479l = new C2847s(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* JADX INFO: renamed from: J */
        public boolean mo12008J(View view) {
            return this.f10479l.m13038a(view);
        }

        /* JADX INFO: renamed from: U */
        public final void m13030U(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10479l.m13040c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: o */
        public boolean mo2615o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f10479l.m13039b(coordinatorLayout, view, motionEvent);
            return super.mo2615o(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C2829a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f10480a;

        public C2829a(int i10) {
            this.f10480a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m13009R(this.f10480a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class C2830b implements ValueAnimator.AnimatorUpdateListener {
        public C2830b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f10461i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C2831c implements ValueAnimator.AnimatorUpdateListener {
        public C2831c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f10461i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f10461i.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public class C2832d extends AnimatorListenerAdapter {
        public C2832d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m13010S();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f10462j.mo13056a(BaseTransientBottomBar.this.f10455c - BaseTransientBottomBar.this.f10453a, BaseTransientBottomBar.this.f10453a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public class C2833e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f10485a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f10486b;

        public C2833e(int i10) {
            this.f10486b = i10;
            this.f10485a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f10450E) {
                C0625o0.m3012X(BaseTransientBottomBar.this.f10461i, iIntValue - this.f10485a);
            } else {
                BaseTransientBottomBar.this.f10461i.setTranslationY(iIntValue);
            }
            this.f10485a = iIntValue;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public class C2834f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f10488a;

        public C2834f(int i10) {
            this.f10488a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m13009R(this.f10488a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f10462j.mo13057b(0, BaseTransientBottomBar.this.f10454b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    public class C2835g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f10490a = 0;

        public C2835g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f10450E) {
                C0625o0.m3012X(BaseTransientBottomBar.this.f10461i, iIntValue - this.f10490a);
            } else {
                BaseTransientBottomBar.this.f10461i.setTranslationY(iIntValue);
            }
            this.f10490a = iIntValue;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    public class C2836h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).m13018a0();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).m13003L(message.arg1);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    public class RunnableC2837i implements Runnable {
        public RunnableC2837i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f10461i == null || baseTransientBottomBar.f10460h == null) {
                return;
            }
            int iHeight = (C0148t.m463a(BaseTransientBottomBar.this.f10460h).height() - BaseTransientBottomBar.this.m13001J()) + ((int) BaseTransientBottomBar.this.f10461i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f10472t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f10473u = baseTransientBottomBar2.f10472t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f10461i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f10452G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f10473u = baseTransientBottomBar3.f10472t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f10472t - iHeight;
            BaseTransientBottomBar.this.f10461i.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    public class C2838j implements InterfaceC0644y {
        public C2838j() {
        }

        @Override // androidx.core.view.InterfaceC0644y
        @NonNull
        /* JADX INFO: renamed from: K */
        public WindowInsetsCompat mo460K(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f10468p = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f10469q = windowInsetsCompat.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f10470r = windowInsetsCompat.getSystemWindowInsetRight();
            BaseTransientBottomBar.this.m13024g0();
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    public class C2839k extends C0582a {
        public C2839k() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            c13017p.m48387a(1048576);
            c13017p.m48417q0(true);
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: j */
        public boolean mo2802j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.mo2802j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.mo12992A();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    public class C2840l implements C2850a.b {
        public C2840l() {
        }

        @Override // com.google.android.material.snackbar.C2850a.b
        /* JADX INFO: renamed from: a */
        public void mo13031a(int i10) {
            Handler handler = BaseTransientBottomBar.f10449D;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C2850a.b
        public void show() {
            Handler handler = BaseTransientBottomBar.f10449D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    public class RunnableC2841m implements Runnable {
        public RunnableC2841m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m13009R(3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    public class C2842n implements SwipeDismissBehavior.InterfaceC2738c {
        public C2842n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC2738c
        /* JADX INFO: renamed from: a */
        public void mo12024a(@NonNull View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.m12993B(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC2738c
        /* JADX INFO: renamed from: b */
        public void mo12025b(int i10) {
            if (i10 == 0) {
                C2850a.m13060c().m13070k(BaseTransientBottomBar.this.f10478z);
            } else if (i10 == 1 || i10 == 2) {
                C2850a.m13060c().m13069j(BaseTransientBottomBar.this.f10478z);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    public class RunnableC2843o implements Runnable {
        public RunnableC2843o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2848t c2848t = BaseTransientBottomBar.this.f10461i;
            if (c2848t == null) {
                return;
            }
            if (c2848t.getParent() != null) {
                BaseTransientBottomBar.this.f10461i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f10461i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m13020c0();
            } else {
                BaseTransientBottomBar.this.m13022e0();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    public class C2844p extends AnimatorListenerAdapter {
        public C2844p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m13010S();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    public static class ViewOnAttachStateChangeListenerC2845q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<BaseTransientBottomBar> f10500a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final WeakReference<View> f10501b;

        public ViewOnAttachStateChangeListenerC2845q(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.f10500a = new WeakReference<>(baseTransientBottomBar);
            this.f10501b = new WeakReference<>(view);
        }

        /* JADX INFO: renamed from: a */
        public static ViewOnAttachStateChangeListenerC2845q m13032a(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            ViewOnAttachStateChangeListenerC2845q viewOnAttachStateChangeListenerC2845q = new ViewOnAttachStateChangeListenerC2845q(baseTransientBottomBar, view);
            if (C0625o0.m3005Q(view)) {
                C0146r.m447b(view, viewOnAttachStateChangeListenerC2845q);
            }
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2845q);
            return viewOnAttachStateChangeListenerC2845q;
        }

        /* JADX INFO: renamed from: b */
        public View m13033b() {
            return this.f10501b.get();
        }

        /* JADX INFO: renamed from: c */
        public void m13034c() {
            if (this.f10501b.get() != null) {
                this.f10501b.get().removeOnAttachStateChangeListener(this);
                C0146r.m455j(this.f10501b.get(), this);
            }
            this.f10501b.clear();
            this.f10500a.clear();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m13035d() {
            if (this.f10500a.get() != null) {
                return false;
            }
            m13034c();
            return true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (m13035d() || !this.f10500a.get().f10466n) {
                return;
            }
            this.f10500a.get().m13011T();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (m13035d()) {
                return;
            }
            C0146r.m447b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (m13035d()) {
                return;
            }
            C0146r.m455j(view, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static abstract class AbstractC2846r<B> {
        /* JADX INFO: renamed from: a */
        public void mo13036a(B b, int i10) {
        }

        /* JADX INFO: renamed from: b */
        public void mo13037b(B b) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static class C2847s {

        /* JADX INFO: renamed from: a */
        public C2850a.b f10502a;

        public C2847s(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m12012Q(0.1f);
            swipeDismissBehavior.m12010O(0.6f);
            swipeDismissBehavior.m12013R(0);
        }

        /* JADX INFO: renamed from: a */
        public boolean m13038a(View view) {
            return view instanceof C2848t;
        }

        /* JADX INFO: renamed from: b */
        public void m13039b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.m2558B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C2850a.m13060c().m13069j(this.f10502a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C2850a.m13060c().m13070k(this.f10502a);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m13040c(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10502a = baseTransientBottomBar.f10478z;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    public static class C2848t extends FrameLayout {

        /* JADX INFO: renamed from: l */
        public static final View.OnTouchListener f10503l = new a();

        /* JADX INFO: renamed from: a */
        public BaseTransientBottomBar<?> f10504a;

        /* JADX INFO: renamed from: b */
        public C6367k f10505b;

        /* JADX INFO: renamed from: c */
        public int f10506c;

        /* JADX INFO: renamed from: d */
        public final float f10507d;

        /* JADX INFO: renamed from: e */
        public final float f10508e;

        /* JADX INFO: renamed from: f */
        public final int f10509f;

        /* JADX INFO: renamed from: g */
        public final int f10510g;

        /* JADX INFO: renamed from: h */
        public ColorStateList f10511h;

        /* JADX INFO: renamed from: i */
        public PorterDuff.Mode f10512i;

        /* JADX INFO: renamed from: j */
        public Rect f10513j;

        /* JADX INFO: renamed from: k */
        public boolean f10514k;

        /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t$a */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public C2848t(@NonNull Context context, AttributeSet attributeSet) {
            super(C8485a.m34268c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C6747k.f26240L5);
            int i10 = C6747k.f26303S5;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                C0625o0.m3056u0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f10506c = typedArrayObtainStyledAttributes.getInt(C6747k.f26267O5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(C6747k.f26321U5) || typedArrayObtainStyledAttributes.hasValue(C6747k.f26330V5)) {
                this.f10505b = C6367k.m27766e(context2, attributeSet, 0, 0).m27806m();
            }
            this.f10507d = typedArrayObtainStyledAttributes.getFloat(C6747k.f26276P5, 1.0f);
            setBackgroundTintList(C5050c.m23736a(context2, typedArrayObtainStyledAttributes, C6747k.f26285Q5));
            setBackgroundTintMode(C0146r.m454i(typedArrayObtainStyledAttributes.getInt(C6747k.f26294R5, -1), PorterDuff.Mode.SRC_IN));
            this.f10508e = typedArrayObtainStyledAttributes.getFloat(C6747k.f26258N5, 1.0f);
            this.f10509f = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26249M5, -1);
            this.f10510g = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26312T5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f10503l);
            setFocusable(true);
            if (getBackground() == null) {
                C0625o0.m3048q0(this, m13044d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10504a = baseTransientBottomBar;
        }

        /* JADX INFO: renamed from: c */
        public void m13043c(ViewGroup viewGroup) {
            this.f10514k = true;
            viewGroup.addView(this);
            this.f10514k = false;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public final Drawable m13044d() {
            int iM44235k = C11840a.m44235k(this, C6738b.f25908o, C6738b.f25903j, getBackgroundOverlayColorAlpha());
            C6367k c6367k = this.f10505b;
            Drawable drawableM12991z = c6367k != null ? BaseTransientBottomBar.m12991z(iM44235k, c6367k) : BaseTransientBottomBar.m12990y(iM44235k, getResources());
            if (this.f10511h == null) {
                return C10425a.m40121r(drawableM12991z);
            }
            Drawable drawableM40121r = C10425a.m40121r(drawableM12991z);
            C10425a.m40118o(drawableM40121r, this.f10511h);
            return drawableM40121r;
        }

        /* JADX INFO: renamed from: e */
        public final void m13045e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f10513j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f10508e;
        }

        public int getAnimationMode() {
            return this.f10506c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f10507d;
        }

        public int getMaxInlineActionWidth() {
            return this.f10510g;
        }

        public int getMaxWidth() {
            return this.f10509f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10504a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m13006O();
            }
            C0625o0.m3034j0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10504a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m13007P();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10504a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m13008Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f10509f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f10509f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        public void setAnimationMode(int i10) {
            this.f10506c = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f10511h != null) {
                drawable = C10425a.m40121r(drawable.mutate());
                C10425a.m40118o(drawable, this.f10511h);
                C10425a.m40119p(drawable, this.f10512i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f10511h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableM40121r = C10425a.m40121r(getBackground().mutate());
                C10425a.m40118o(drawableM40121r, colorStateList);
                C10425a.m40119p(drawableM40121r, this.f10512i);
                if (drawableM40121r != getBackground()) {
                    super.setBackgroundDrawable(drawableM40121r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f10512i = mode;
            if (getBackground() != null) {
                Drawable drawableM40121r = C10425a.m40121r(getBackground().mutate());
                C10425a.m40119p(drawableM40121r, mode);
                if (drawableM40121r != getBackground()) {
                    super.setBackgroundDrawable(drawableM40121r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f10514k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            m13045e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10504a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m13024g0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f10503l);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull InterfaceC7148a interfaceC7148a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC7148a == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f10459g = viewGroup;
        this.f10462j = interfaceC7148a;
        this.f10460h = context;
        C0143o.m428a(context);
        C2848t c2848t = (C2848t) LayoutInflater.from(context).inflate(m12999H(), viewGroup, false);
        this.f10461i = c2848t;
        c2848t.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.m13058c(c2848t.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(c2848t.getMaxInlineActionWidth());
        }
        c2848t.addView(view);
        C0625o0.m3044o0(c2848t, 1);
        C0625o0.m3060w0(c2848t, 1);
        C0625o0.m3058v0(c2848t, true);
        C0625o0.m2979A0(c2848t, new C2838j());
        C0625o0.m3040m0(c2848t, new C2839k());
        this.f10477y = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = C6738b.f25864F;
        this.f10455c = C1627h.m8223f(context, i10, 250);
        this.f10453a = C1627h.m8223f(context, i10, 150);
        this.f10454b = C1627h.m8223f(context, C6738b.f25865G, 75);
        int i11 = C6738b.f25874P;
        this.f10456d = C1627h.m8224g(context, i11, f10447B);
        this.f10458f = C1627h.m8224g(context, i11, f10448C);
        this.f10457e = C1627h.m8224g(context, i11, f10446A);
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public static GradientDrawable m12990y(int i10, @NonNull Resources resources) {
        float dimension = resources.getDimension(C6740d.f25971h0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    @NonNull
    /* JADX INFO: renamed from: z */
    public static C6363g m12991z(int i10, @NonNull C6367k c6367k) {
        C6363g c6363g = new C6363g(c6367k);
        c6363g.m27719a0(ColorStateList.valueOf(i10));
        return c6363g;
    }

    /* JADX INFO: renamed from: A */
    public void mo12992A() {
        m12993B(3);
    }

    /* JADX INFO: renamed from: B */
    public void m12993B(int i10) {
        C2850a.m13060c().m13062b(this.f10478z, i10);
    }

    /* JADX INFO: renamed from: C */
    public final ValueAnimator m12994C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f10456d);
        valueAnimatorOfFloat.addUpdateListener(new C2830b());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: D */
    public View m12995D() {
        ViewOnAttachStateChangeListenerC2845q viewOnAttachStateChangeListenerC2845q = this.f10465m;
        if (viewOnAttachStateChangeListenerC2845q == null) {
            return null;
        }
        return viewOnAttachStateChangeListenerC2845q.m13033b();
    }

    /* JADX INFO: renamed from: E */
    public int mo12996E() {
        return this.f10463k;
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public SwipeDismissBehavior<? extends View> m12997F() {
        return new Behavior();
    }

    /* JADX INFO: renamed from: G */
    public final ValueAnimator m12998G(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f10458f);
        valueAnimatorOfFloat.addUpdateListener(new C2831c());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: H */
    public int m12999H() {
        return m13002K() ? C6744h.f26078t : C6744h.f26060b;
    }

    /* JADX INFO: renamed from: I */
    public final int m13000I() {
        int height = this.f10461i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f10461i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: renamed from: J */
    public final int m13001J() {
        int[] iArr = new int[2];
        this.f10461i.getLocationInWindow(iArr);
        return iArr[1] + this.f10461i.getHeight();
    }

    /* JADX INFO: renamed from: K */
    public boolean m13002K() {
        TypedArray typedArrayObtainStyledAttributes = this.f10460h.obtainStyledAttributes(f10451F);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* JADX INFO: renamed from: L */
    public final void m13003L(int i10) {
        if (m13015X() && this.f10461i.getVisibility() == 0) {
            m13027w(i10);
        } else {
            m13009R(i10);
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean m13004M() {
        return C2850a.m13060c().m13064e(this.f10478z);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m13005N() {
        ViewGroup.LayoutParams layoutParams = this.f10461i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0527f) && (((CoordinatorLayout.C0527f) layoutParams).m2632f() instanceof SwipeDismissBehavior);
    }

    /* JADX INFO: renamed from: O */
    public void m13006O() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f10461i.getRootWindowInsets()) == null) {
            return;
        }
        this.f10472t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        m13024g0();
    }

    /* JADX INFO: renamed from: P */
    public void m13007P() {
        if (m13004M()) {
            f10449D.post(new RunnableC2841m());
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m13008Q() {
        if (this.f10474v) {
            m13019b0();
            this.f10474v = false;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m13009R(int i10) {
        C2850a.m13060c().m13067h(this.f10478z);
        List<AbstractC2846r<B>> list = this.f10475w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f10475w.get(size).mo13036a(this, i10);
            }
        }
        ViewParent parent = this.f10461i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f10461i);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m13010S() {
        C2850a.m13060c().m13068i(this.f10478z);
        List<AbstractC2846r<B>> list = this.f10475w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f10475w.get(size).mo13037b(this);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m13011T() {
        this.f10471s = m13028x();
        m13024g0();
    }

    @NonNull
    /* JADX INFO: renamed from: U */
    public B m13012U(View view) {
        ViewOnAttachStateChangeListenerC2845q viewOnAttachStateChangeListenerC2845q = this.f10465m;
        if (viewOnAttachStateChangeListenerC2845q != null) {
            viewOnAttachStateChangeListenerC2845q.m13034c();
        }
        this.f10465m = view == null ? null : ViewOnAttachStateChangeListenerC2845q.m13032a(this, view);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: V */
    public B m13013V(int i10) {
        this.f10463k = i10;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public final void m13014W(CoordinatorLayout.C0527f c0527f) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorM12997F = this.f10476x;
        if (swipeDismissBehaviorM12997F == null) {
            swipeDismissBehaviorM12997F = m12997F();
        }
        if (swipeDismissBehaviorM12997F instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorM12997F).m13030U(this);
        }
        swipeDismissBehaviorM12997F.m12011P(new C2842n());
        c0527f.m2641o(swipeDismissBehaviorM12997F);
        if (m12995D() == null) {
            c0527f.f2252g = 80;
        }
    }

    /* JADX INFO: renamed from: X */
    public boolean m13015X() {
        AccessibilityManager accessibilityManager = this.f10477y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m13016Y() {
        return this.f10472t > 0 && !this.f10464l && m13005N();
    }

    /* JADX INFO: renamed from: Z */
    public void mo13017Z() {
        C2850a.m13060c().m13072m(mo12996E(), this.f10478z);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m13018a0() {
        if (this.f10461i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f10461i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0527f) {
                m13014W((CoordinatorLayout.C0527f) layoutParams);
            }
            this.f10461i.m13043c(this.f10459g);
            m13011T();
            this.f10461i.setVisibility(4);
        }
        if (C0625o0.m3006R(this.f10461i)) {
            m13019b0();
        } else {
            this.f10474v = true;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m13019b0() {
        if (m13015X()) {
            m13026v();
            return;
        }
        if (this.f10461i.getParent() != null) {
            this.f10461i.setVisibility(0);
        }
        m13010S();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m13020c0() {
        ValueAnimator valueAnimatorM12994C = m12994C(0.0f, 1.0f);
        ValueAnimator valueAnimatorM12998G = m12998G(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorM12994C, valueAnimatorM12998G);
        animatorSet.setDuration(this.f10453a);
        animatorSet.addListener(new C2844p());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m13021d0(int i10) {
        ValueAnimator valueAnimatorM12994C = m12994C(1.0f, 0.0f);
        valueAnimatorM12994C.setDuration(this.f10454b);
        valueAnimatorM12994C.addListener(new C2829a(i10));
        valueAnimatorM12994C.start();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m13022e0() {
        int iM13000I = m13000I();
        if (f10450E) {
            C0625o0.m3012X(this.f10461i, iM13000I);
        } else {
            this.f10461i.setTranslationY(iM13000I);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iM13000I, 0);
        valueAnimator.setInterpolator(this.f10457e);
        valueAnimator.setDuration(this.f10455c);
        valueAnimator.addListener(new C2832d());
        valueAnimator.addUpdateListener(new C2833e(iM13000I));
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m13023f0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m13000I());
        valueAnimator.setInterpolator(this.f10457e);
        valueAnimator.setDuration(this.f10455c);
        valueAnimator.addListener(new C2834f(i10));
        valueAnimator.addUpdateListener(new C2835g());
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m13024g0() {
        ViewGroup.LayoutParams layoutParams = this.f10461i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f10452G, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f10461i.f10513j == null) {
            Log.w(f10452G, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f10461i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f10461i.f10513j.bottom + (m12995D() != null ? this.f10471s : this.f10468p);
        int i11 = this.f10461i.f10513j.left + this.f10469q;
        int i12 = this.f10461i.f10513j.right + this.f10470r;
        int i13 = this.f10461i.f10513j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f10461i.requestLayout();
        }
        if ((z10 || this.f10473u != this.f10472t) && Build.VERSION.SDK_INT >= 29 && m13016Y()) {
            this.f10461i.removeCallbacks(this.f10467o);
            this.f10461i.post(this.f10467o);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public B m13025u(AbstractC2846r<B> abstractC2846r) {
        if (abstractC2846r == null) {
            return this;
        }
        if (this.f10475w == null) {
            this.f10475w = new ArrayList();
        }
        this.f10475w.add(abstractC2846r);
        return this;
    }

    /* JADX INFO: renamed from: v */
    public void m13026v() {
        this.f10461i.post(new RunnableC2843o());
    }

    /* JADX INFO: renamed from: w */
    public final void m13027w(int i10) {
        if (this.f10461i.getAnimationMode() == 1) {
            m13021d0(i10);
        } else {
            m13023f0(i10);
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m13028x() {
        if (m12995D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        m12995D().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f10459g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f10459g.getHeight()) - i10;
    }
}
