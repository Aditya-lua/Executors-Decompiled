package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0586b0;
import p067d4.C4434a;
import p067d4.C4435b;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public class C0930d {
    /* JADX INFO: renamed from: a */
    public static int m4731a(ComponentCallbacksC0929c componentCallbacksC0929c, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? componentCallbacksC0929c.m4623O() : componentCallbacksC0929c.m4626P();
        }
        return z10 ? componentCallbacksC0929c.m4718y() : componentCallbacksC0929c.m4589C();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: b */
    public static a m4732b(@NonNull Context context, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c, boolean z10, boolean z11) {
        Animator animatorLoadAnimator;
        int iM4610J = componentCallbacksC0929c.m4610J();
        int iM4731a = m4731a(componentCallbacksC0929c, z10, z11);
        componentCallbacksC0929c.m4622N1(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC0929c.f3417J;
        if (viewGroup != null) {
            int i10 = C4435b.f18439c;
            if (viewGroup.getTag(i10) != null) {
                componentCallbacksC0929c.f3417J.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = componentCallbacksC0929c.f3417J;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationM4602G0 = componentCallbacksC0929c.m4602G0(iM4610J, z10, iM4731a);
        if (animationM4602G0 != null) {
            return new a(animationM4602G0);
        }
        Animator animatorM4605H0 = componentCallbacksC0929c.m4605H0(iM4610J, z10, iM4731a);
        if (animatorM4605H0 != null) {
            return new a(animatorM4605H0);
        }
        if (iM4731a == 0 && iM4610J != 0) {
            iM4731a = m4734d(context, iM4610J, z10);
        }
        if (iM4731a != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM4731a));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iM4731a);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM4731a);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (zEquals) {
                            throw e11;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM4731a);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM4731a);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m4733c(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: d */
    public static int m4734d(@NonNull Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? C4434a.f18435e : C4434a.f18436f;
        }
        if (i10 == 8194) {
            return z10 ? C4434a.f18431a : C4434a.f18432b;
        }
        if (i10 == 8197) {
            return z10 ? m4733c(context, R.attr.activityCloseEnterAnimation) : m4733c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? C4434a.f18433c : C4434a.f18434d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? m4733c(context, R.attr.activityOpenEnterAnimation) : m4733c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Animation f3502a;

        /* JADX INFO: renamed from: b */
        public final AnimatorSet f3503b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(Animation animation) {
            this.f3502a = animation;
            this.f3503b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f3502a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3503b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$b */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f3504a;

        /* JADX INFO: renamed from: b */
        public final View f3505b;

        /* JADX INFO: renamed from: c */
        public boolean f3506c;

        /* JADX INFO: renamed from: d */
        public boolean f3507d;

        /* JADX INFO: renamed from: e */
        public boolean f3508e;

        public b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f3508e = true;
            this.f3504a = viewGroup;
            this.f3505b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation) {
            this.f3508e = true;
            if (this.f3506c) {
                return !this.f3507d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f3506c = true;
                ViewTreeObserverOnPreDrawListenerC0586b0.m2815a(this.f3504a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3506c || !this.f3508e) {
                this.f3504a.endViewTransition(this.f3505b);
                this.f3507d = true;
            } else {
                this.f3508e = false;
                this.f3504a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation, float f10) {
            this.f3508e = true;
            if (this.f3506c) {
                return !this.f3507d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f3506c = true;
                ViewTreeObserverOnPreDrawListenerC0586b0.m2815a(this.f3504a, this);
            }
            return true;
        }
    }
}
