package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.k;
import androidx.core.view.o0;
import e.BackEventCompat;

/* JADX INFO: loaded from: classes2.dex */
public class g extends bd.a<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4102i;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4103a;
        public final /* synthetic */ int b;

        public a(boolean z10, int i10) {
            this.f4103a = z10;
            this.b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.b.setTranslationX(0.0f);
            g.this.k(0.0f, this.f4103a, this.b);
        }
    }

    public g(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f4100g = resources.getDimension(hc.d.f18830k);
        this.f4101h = resources.getDimension(hc.d.f18828j);
        this.f4102i = resources.getDimension(hc.d.f18832l);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v5 = this.b;
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f4090e);
        animatorSet.start();
    }

    public final boolean g(int i10, int i11) {
        return (k.b(i10, o0.z(this.b)) & i11) == i11;
    }

    public void h(@NonNull BackEventCompat backEventCompat, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = backEventCompat.getSwipeEdge() == 0;
        boolean zG = g(i10, 3);
        float width = (this.b.getWidth() * this.b.getScaleX()) + i(zG);
        V v5 = this.b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v5, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new g4.b());
        objectAnimatorOfFloat.setDuration(ic.a.c(this.f4088c, this.f4089d, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public final int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void j(@NonNull BackEventCompat backEventCompat) {
        super.d(backEventCompat);
    }

    public void k(float f10, boolean z10, int i10) {
        float fA = a(f10);
        boolean zG = g(i10, 3);
        boolean z11 = z10 == zG;
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f4100g / f11;
            float f14 = this.f4101h / f11;
            float f15 = this.f4102i / f12;
            V v5 = this.b;
            if (zG) {
                f11 = 0.0f;
            }
            v5.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fA2 = ic.a.a(0.0f, f14, fA);
            float f16 = fA2 + 1.0f;
            this.b.setScaleX(f16);
            float fA3 = 1.0f - ic.a.a(0.0f, f15, fA);
            this.b.setScaleY(fA3);
            V v10 = this.b;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(zG ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fA2 : 1.0f;
                    float f18 = fA3 != 0.0f ? (f16 / fA3) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }

    public void l(@NonNull BackEventCompat backEventCompat, int i10) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        k(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i10);
    }
}
