package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f0 {
    public static Animator a(@NonNull View view, @NonNull d0 d0Var, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, @NonNull q qVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) d0Var.b.getTag(l.f27695f);
        if (iArr != null) {
            f10 = (iArr[0] - i10) + translationX;
            f11 = (iArr[1] - i11) + translationY;
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f12 && f11 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f13));
        a aVar = new a(view, d0Var.b, translationX, translationY);
        qVar.c(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static class a extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f27662a;
        public final View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f27663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f27664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f27665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f27666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f27667g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f27668h;

        public a(View view, View view2, float f10, float f11) {
            this.b = view;
            this.f27662a = view2;
            this.f27666f = f10;
            this.f27667g = f11;
            int i10 = l.f27695f;
            int[] iArr = (int[]) view2.getTag(i10);
            this.f27663c = iArr;
            if (iArr != null) {
                view2.setTag(i10, null);
            }
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
            this.f27668h = true;
            this.b.setTranslationX(this.f27666f);
            this.b.setTranslationY(this.f27667g);
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            this.b.setTranslationX(this.f27664d);
            this.b.setTranslationY(this.f27665e);
        }

        public final void c() {
            if (this.f27663c == null) {
                this.f27663c = new int[2];
            }
            this.b.getLocationOnScreen(this.f27663c);
            this.f27662a.setTag(l.f27695f, this.f27663c);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            c();
            this.f27664d = this.b.getTranslationX();
            this.f27665e = this.b.getTranslationY();
            this.b.setTranslationX(this.f27666f);
            this.b.setTranslationY(this.f27667g);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
            l(qVar, false);
        }

        @Override // o5.q.h
        public void l(@NonNull q qVar, boolean z10) {
            if (this.f27668h) {
                return;
            }
            this.f27662a.setTag(l.f27695f, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27668h = true;
            this.b.setTranslationX(this.f27666f);
            this.b.setTranslationY(this.f27667g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            this.b.setTranslationX(this.f27666f);
            this.b.setTranslationY(this.f27667g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
