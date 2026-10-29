package p322o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C9662f0 {
    /* JADX INFO: renamed from: a */
    public static Animator m38171a(@NonNull View view, @NonNull C9658d0 c9658d0, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, @NonNull AbstractC9683q abstractC9683q) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c9658d0.f35045b.getTag(C9673l.f35099f);
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
        a aVar = new a(view, c9658d0.f35045b, translationX, translationY);
        abstractC9683q.mo38129c(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: o5.f0$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final View f35056a;

        /* JADX INFO: renamed from: b */
        public final View f35057b;

        /* JADX INFO: renamed from: c */
        public int[] f35058c;

        /* JADX INFO: renamed from: d */
        public float f35059d;

        /* JADX INFO: renamed from: e */
        public float f35060e;

        /* JADX INFO: renamed from: f */
        public final float f35061f;

        /* JADX INFO: renamed from: g */
        public final float f35062g;

        /* JADX INFO: renamed from: h */
        public boolean f35063h;

        public a(View view, View view2, float f10, float f11) {
            this.f35057b = view;
            this.f35056a = view2;
            this.f35061f = f10;
            this.f35062g = f11;
            int i10 = C9673l.f35099f;
            int[] iArr = (int[]) view2.getTag(i10);
            this.f35058c = iArr;
            if (iArr != null) {
                view2.setTag(i10, null);
            }
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
            this.f35063h = true;
            this.f35057b.setTranslationX(this.f35061f);
            this.f35057b.setTranslationY(this.f35062g);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
            this.f35057b.setTranslationX(this.f35059d);
            this.f35057b.setTranslationY(this.f35060e);
        }

        /* JADX INFO: renamed from: c */
        public final void m38172c() {
            if (this.f35058c == null) {
                this.f35058c = new int[2];
            }
            this.f35057b.getLocationOnScreen(this.f35058c);
            this.f35056a.setTag(C9673l.f35099f, this.f35058c);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
            m38172c();
            this.f35059d = this.f35057b.getTranslationX();
            this.f35060e = this.f35057b.getTranslationY();
            this.f35057b.setTranslationX(this.f35061f);
            this.f35057b.setTranslationY(this.f35062g);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            mo38173l(abstractC9683q, false);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: l */
        public void mo38173l(@NonNull AbstractC9683q abstractC9683q, boolean z10) {
            if (this.f35063h) {
                return;
            }
            this.f35056a.setTag(C9673l.f35099f, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35063h = true;
            this.f35057b.setTranslationX(this.f35061f);
            this.f35057b.setTranslationY(this.f35062g);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            this.f35057b.setTranslationX(this.f35061f);
            this.f35057b.setTranslationY(this.f35062g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
