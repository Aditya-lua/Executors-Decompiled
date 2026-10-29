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
import androidx.core.view.b0;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static int a(c cVar, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? cVar.O() : cVar.P();
        }
        return z10 ? cVar.y() : cVar.C();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    @SuppressLint({"ResourceType"})
    public static a b(@NonNull Context context, @NonNull c cVar, boolean z10, boolean z11) {
        Animator animatorLoadAnimator;
        int iJ = cVar.J();
        int iA = a(cVar, z10, z11);
        cVar.N1(0, 0, 0, 0);
        ViewGroup viewGroup = cVar.J;
        if (viewGroup != null) {
            int i10 = d4.b.f14429c;
            if (viewGroup.getTag(i10) != null) {
                cVar.J.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = cVar.J;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationG0 = cVar.G0(iJ, z10, iA);
        if (animationG0 != null) {
            return new a(animationG0);
        }
        Animator animatorH0 = cVar.H0(iJ, z10, iA);
        if (animatorH0 != null) {
            return new a(animatorH0);
        }
        if (iA == 0 && iJ != 0) {
            iA = d(context, iJ, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (zEquals) {
                            throw e11;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    public static int c(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(@NonNull Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? d4.a.f14426e : d4.a.f14427f;
        }
        if (i10 == 8194) {
            return z10 ? d4.a.f14423a : d4.a.b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? d4.a.f14424c : d4.a.f14425d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f2659a;
        public final AnimatorSet b;

        public a(Animation animation) {
            this.f2659a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f2659a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f2660a;
        public final View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2663e;

        public b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f2663e = true;
            this.f2660a = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation) {
            this.f2663e = true;
            if (this.f2661c) {
                return !this.f2662d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2661c = true;
                b0.a(this.f2660a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2661c || !this.f2663e) {
                this.f2660a.endViewTransition(this.b);
                this.f2662d = true;
            } else {
                this.f2663e = false;
                this.f2660a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation, float f10) {
            this.f2663e = true;
            if (this.f2661c) {
                return !this.f2662d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2661c = true;
                b0.a(this.f2660a, this);
            }
            return true;
        }
    }
}
