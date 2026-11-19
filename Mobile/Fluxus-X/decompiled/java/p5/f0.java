package p5;

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
        int[] iArr = (int[]) d0Var.b.getTag(l.f28866f);
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
        public final View f28833a;
        public final View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f28834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f28835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f28836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f28837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f28838g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f28839h;

        public a(View view, View view2, float f10, float f11) {
            this.b = view;
            this.f28833a = view2;
            this.f28837f = f10;
            this.f28838g = f11;
            int[] iArr = (int[]) view2.getTag(l.f28866f);
            this.f28834c = iArr;
            if (iArr != null) {
                view2.setTag(l.f28866f, null);
            }
        }

        public final void a() {
            if (this.f28834c == null) {
                this.f28834c = new int[2];
            }
            this.b.getLocationOnScreen(this.f28834c);
            this.f28833a.setTag(l.f28866f, this.f28834c);
        }

        @Override // p5.q.h
        public void b(@NonNull q qVar) {
            g(qVar, false);
        }

        @Override // p5.q.h
        public void c(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void f(@NonNull q qVar) {
            a();
            this.f28835d = this.b.getTranslationX();
            this.f28836e = this.b.getTranslationY();
            this.b.setTranslationX(this.f28837f);
            this.b.setTranslationY(this.f28838g);
        }

        @Override // p5.q.h
        public void g(@NonNull q qVar, boolean z10) {
            if (this.f28839h) {
                return;
            }
            this.f28833a.setTag(l.f28866f, null);
        }

        @Override // p5.q.h
        public void h(@NonNull q qVar) {
            this.b.setTranslationX(this.f28835d);
            this.b.setTranslationY(this.f28836e);
        }

        @Override // p5.q.h
        public void k(@NonNull q qVar) {
            this.f28839h = true;
            this.b.setTranslationX(this.f28837f);
            this.b.setTranslationY(this.f28838g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f28839h = true;
            this.b.setTranslationX(this.f28837f);
            this.b.setTranslationY(this.f28838g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            this.b.setTranslationX(this.f28837f);
            this.b.setTranslationY(this.f28838g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
