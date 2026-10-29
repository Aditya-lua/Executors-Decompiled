package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e extends o0 {

    public static class a extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f27091a;
        public boolean b = false;

        public a(View view) {
            this.f27091a = view;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            this.f27091a.setTag(l.f27129e, null);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            this.f27091a.setTag(l.f27129e, Float.valueOf(this.f27091a.getVisibility() == 0 ? i0.b(this.f27091a) : 0.0f));
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void i(@NonNull q qVar, boolean z10) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i0.e(this.f27091a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f27091a.hasOverlappingRendering() && this.f27091a.getLayerType() == 0) {
                this.b = true;
                this.f27091a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (this.b) {
                this.f27091a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            i0.e(this.f27091a, 1.0f);
            i0.a(this.f27091a);
        }
    }

    public e(int i10) {
        H0(i10);
    }

    public static float J0(d0 d0Var, float f10) {
        Float f11;
        return (d0Var == null || (f11 = (Float) d0Var.f27089a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // o5.o0
    public Animator D0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2) {
        i0.c(view);
        return I0(view, J0(d0Var, 0.0f), 1.0f);
    }

    @Override // o5.o0
    public Animator F0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2) {
        i0.c(view);
        Animator animatorI0 = I0(view, J0(d0Var, 1.0f), 0.0f);
        if (animatorI0 == null) {
            i0.e(view, J0(d0Var2, 1.0f));
        }
        return animatorI0;
    }

    public final Animator I0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        i0.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, i0.b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        N().c(aVar);
        return objectAnimatorOfFloat;
    }

    @Override // o5.q
    public boolean Y() {
        return true;
    }

    @Override // o5.o0, o5.q
    public void o(@NonNull d0 d0Var) {
        super.o(d0Var);
        Float fValueOf = (Float) d0Var.b.getTag(l.f27129e);
        if (fValueOf == null) {
            fValueOf = d0Var.b.getVisibility() == 0 ? Float.valueOf(i0.b(d0Var.b)) : Float.valueOf(0.0f);
        }
        d0Var.f27089a.put("android:fade:transitionAlpha", fValueOf);
    }

    public e() {
    }
}
