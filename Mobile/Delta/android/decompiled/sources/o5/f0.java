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
        int[] iArr = (int[]) d0Var.b.getTag(l.f27130f);
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
        public final View f27097a;
        public final View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f27098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f27099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f27100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f27101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f27102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f27103h;

        public a(View view, View view2, float f10, float f11) {
            this.b = view;
            this.f27097a = view2;
            this.f27101f = f10;
            this.f27102g = f11;
            int i10 = l.f27130f;
            int[] iArr = (int[]) view2.getTag(i10);
            this.f27098c = iArr;
            if (iArr != null) {
                view2.setTag(i10, null);
            }
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
            this.f27103h = true;
            this.b.setTranslationX(this.f27101f);
            this.b.setTranslationY(this.f27102g);
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            this.b.setTranslationX(this.f27099d);
            this.b.setTranslationY(this.f27100e);
        }

        public final void c() {
            if (this.f27098c == null) {
                this.f27098c = new int[2];
            }
            this.b.getLocationOnScreen(this.f27098c);
            this.f27097a.setTag(l.f27130f, this.f27098c);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            c();
            this.f27099d = this.b.getTranslationX();
            this.f27100e = this.b.getTranslationY();
            this.b.setTranslationX(this.f27101f);
            this.b.setTranslationY(this.f27102g);
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
            if (this.f27103h) {
                return;
            }
            this.f27097a.setTag(l.f27130f, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27103h = true;
            this.b.setTranslationX(this.f27101f);
            this.b.setTranslationY(this.f27102g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            this.b.setTranslationX(this.f27101f);
            this.b.setTranslationY(this.f27102g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
