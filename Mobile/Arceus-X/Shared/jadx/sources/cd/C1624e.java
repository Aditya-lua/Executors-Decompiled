package cd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p088e.BackEventCompat;
import p144g4.C6003b;
import p194ic.C6740d;
import p216jc.C7137a;

/* JADX INFO: renamed from: cd.e */
/* JADX INFO: loaded from: classes2.dex */
public class C1624e extends AbstractC1620a<View> {

    /* JADX INFO: renamed from: g */
    public final float f6317g;

    /* JADX INFO: renamed from: h */
    public final float f6318h;

    /* JADX INFO: renamed from: cd.e$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1624e.this.f6305b.setTranslationY(0.0f);
            C1624e.this.m8209k(0.0f);
        }
    }

    public C1624e(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f6317g = resources.getDimension(C6740d.f25970h);
        this.f6318h = resources.getDimension(C6740d.f25972i);
    }

    /* JADX INFO: renamed from: f */
    public void m8204f() {
        if (super.m8188b() == null) {
            return;
        }
        Animator animatorM8205g = m8205g();
        animatorM8205g.setDuration(this.f6308e);
        animatorM8205g.start();
    }

    /* JADX INFO: renamed from: g */
    public final Animator m8205g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f6305b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f6305b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v5 = this.f6305b;
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C6003b());
        return animatorSet;
    }

    /* JADX INFO: renamed from: h */
    public void m8206h(@NonNull BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6305b, (Property<V, Float>) View.TRANSLATION_Y, this.f6305b.getHeight() * this.f6305b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new C6003b());
        objectAnimatorOfFloat.setDuration(C7137a.m29921c(this.f6306c, this.f6307d, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: i */
    public void m8207i(@NonNull BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        Animator animatorM8205g = m8205g();
        animatorM8205g.setDuration(C7137a.m29921c(this.f6306c, this.f6307d, backEventCompat.getProgress()));
        if (animatorListener != null) {
            animatorM8205g.addListener(animatorListener);
        }
        animatorM8205g.start();
    }

    /* JADX INFO: renamed from: j */
    public void m8208j(@NonNull BackEventCompat backEventCompat) {
        super.m8190d(backEventCompat);
    }

    /* JADX INFO: renamed from: k */
    public void m8209k(float f10) {
        float fM8187a = m8187a(f10);
        float width = this.f6305b.getWidth();
        float height = this.f6305b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f6317g / width;
        float f12 = this.f6318h / height;
        float fM29919a = 1.0f - C7137a.m29919a(0.0f, f11, fM8187a);
        float fM29919a2 = 1.0f - C7137a.m29919a(0.0f, f12, fM8187a);
        this.f6305b.setScaleX(fM29919a);
        this.f6305b.setPivotY(height);
        this.f6305b.setScaleY(fM29919a2);
        V v5 = this.f6305b;
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fM29919a2 != 0.0f ? fM29919a / fM29919a2 : 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m8210l(@NonNull BackEventCompat backEventCompat) {
        if (super.m8191e(backEventCompat) == null) {
            return;
        }
        m8209k(backEventCompat.getProgress());
    }
}
