package dd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import e.BackEventCompat;

/* JADX INFO: loaded from: classes2.dex */
public class e extends dd.a<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f12175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12176h;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.b.setTranslationY(0.0f);
            e.this.k(0.0f);
        }
    }

    public e(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f12175g = resources.getDimension(jc.d.f20334h);
        this.f12176h = resources.getDimension(jc.d.f20336i);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f12168e);
        animatorG.start();
    }

    public final Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v8 = this.b;
        if (v8 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v8;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new h4.b());
        return animatorSet;
    }

    public void h(@NonNull BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.TRANSLATION_Y, this.b.getHeight() * this.b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new h4.b());
        objectAnimatorOfFloat.setDuration(kc.a.c(this.f12166c, this.f12167d, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void i(@NonNull BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(kc.a.c(this.f12166c, this.f12167d, backEventCompat.getProgress()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(@NonNull BackEventCompat backEventCompat) {
        super.d(backEventCompat);
    }

    public void k(float f10) {
        float fA = a(f10);
        float width = this.b.getWidth();
        float height = this.b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f12175g / width;
        float f12 = this.f12176h / height;
        float fA2 = 1.0f - kc.a.a(0.0f, f11, fA);
        float fA3 = 1.0f - kc.a.a(0.0f, f12, fA);
        this.b.setScaleX(fA2);
        this.b.setPivotY(height);
        this.b.setScaleY(fA3);
        V v8 = this.b;
        if (v8 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v8;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA3 != 0.0f ? fA2 / fA3 : 1.0f);
            }
        }
    }

    public void l(@NonNull BackEventCompat backEventCompat) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        k(backEventCompat.getProgress());
    }
}
