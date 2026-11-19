package f4;

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

/* JADX INFO: loaded from: classes.dex */
public class w {
    public static int a(q qVar, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? qVar.N() : qVar.O();
        }
        return z10 ? qVar.x() : qVar.B();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    @SuppressLint({"ResourceType"})
    public static a b(@NonNull Context context, @NonNull q qVar, boolean z10, boolean z11) {
        Animator animatorLoadAnimator;
        int I = qVar.I();
        int iA = a(qVar, z10, z11);
        qVar.N1(0, 0, 0, 0);
        ViewGroup viewGroup = qVar.J;
        if (viewGroup != null && viewGroup.getTag(e4.b.f13178c) != null) {
            qVar.J.setTag(e4.b.f13178c, null);
        }
        ViewGroup viewGroup2 = qVar.J;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationG0 = qVar.G0(I, z10, iA);
        if (animationG0 != null) {
            return new a(animationG0);
        }
        Animator animatorH0 = qVar.H0(I, z10, iA);
        if (animatorH0 != null) {
            return new a(animatorH0);
        }
        if (iA == 0 && I != 0) {
            iA = d(context, I, z10);
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
            return z10 ? e4.a.f13175e : e4.a.f13176f;
        }
        if (i10 == 8194) {
            return z10 ? e4.a.f13172a : e4.a.b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? e4.a.f13173c : e4.a.f13174d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f15603a;
        public final AnimatorSet b;

        public a(Animation animation) {
            this.f15603a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f15603a = null;
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
        public final ViewGroup f15604a;
        public final View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15607e;

        public b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f15607e = true;
            this.f15604a = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation) {
            this.f15607e = true;
            if (this.f15605c) {
                return !this.f15606d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f15605c = true;
                androidx.core.view.b0.a(this.f15604a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15605c || !this.f15607e) {
                this.f15604a.endViewTransition(this.b);
                this.f15606d = true;
            } else {
                this.f15607e = false;
                this.f15604a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation, float f10) {
            this.f15607e = true;
            if (this.f15605c) {
                return !this.f15606d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f15605c = true;
                androidx.core.view.b0.a(this.f15604a, this);
            }
            return true;
        }
    }
}
