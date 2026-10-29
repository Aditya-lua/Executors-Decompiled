package cd;

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
import androidx.core.view.C0614k;
import androidx.core.view.C0625o0;
import p088e.BackEventCompat;
import p144g4.C6003b;
import p194ic.C6740d;
import p216jc.C7137a;

/* JADX INFO: renamed from: cd.g */
/* JADX INFO: loaded from: classes2.dex */
public class C1626g extends AbstractC1620a<View> {

    /* JADX INFO: renamed from: g */
    public final float f6320g;

    /* JADX INFO: renamed from: h */
    public final float f6321h;

    /* JADX INFO: renamed from: i */
    public final float f6322i;

    /* JADX INFO: renamed from: cd.g$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f6323a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6324b;

        public a(boolean z10, int i10) {
            this.f6323a = z10;
            this.f6324b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1626g.this.f6305b.setTranslationX(0.0f);
            C1626g.this.m8216k(0.0f, this.f6323a, this.f6324b);
        }
    }

    public C1626g(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f6320g = resources.getDimension(C6740d.f25976k);
        this.f6321h = resources.getDimension(C6740d.f25974j);
        this.f6322i = resources.getDimension(C6740d.f25978l);
    }

    /* JADX INFO: renamed from: f */
    public void m8211f() {
        if (super.m8188b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f6305b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f6305b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v5 = this.f6305b;
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f6308e);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8212g(int i10, int i11) {
        return (C0614k.m2930b(i10, C0625o0.m3065z(this.f6305b)) & i11) == i11;
    }

    /* JADX INFO: renamed from: h */
    public void m8213h(@NonNull BackEventCompat backEventCompat, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = backEventCompat.getSwipeEdge() == 0;
        boolean zM8212g = m8212g(i10, 3);
        float width = (this.f6305b.getWidth() * this.f6305b.getScaleX()) + m8214i(zM8212g);
        V v5 = this.f6305b;
        Property property = View.TRANSLATION_X;
        if (zM8212g) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v5, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C6003b());
        objectAnimatorOfFloat.setDuration(C7137a.m29921c(this.f6306c, this.f6307d, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: i */
    public final int m8214i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f6305b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    /* JADX INFO: renamed from: j */
    public void m8215j(@NonNull BackEventCompat backEventCompat) {
        super.m8190d(backEventCompat);
    }

    /* JADX INFO: renamed from: k */
    public void m8216k(float f10, boolean z10, int i10) {
        float fM8187a = m8187a(f10);
        boolean zM8212g = m8212g(i10, 3);
        boolean z11 = z10 == zM8212g;
        int width = this.f6305b.getWidth();
        int height = this.f6305b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f6320g / f11;
            float f14 = this.f6321h / f11;
            float f15 = this.f6322i / f12;
            V v5 = this.f6305b;
            if (zM8212g) {
                f11 = 0.0f;
            }
            v5.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fM29919a = C7137a.m29919a(0.0f, f14, fM8187a);
            float f16 = fM29919a + 1.0f;
            this.f6305b.setScaleX(f16);
            float fM29919a2 = 1.0f - C7137a.m29919a(0.0f, f15, fM8187a);
            this.f6305b.setScaleY(fM29919a2);
            V v10 = this.f6305b;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(zM8212g ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fM29919a : 1.0f;
                    float f18 = fM29919a2 != 0.0f ? (f16 / fM29919a2) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m8217l(@NonNull BackEventCompat backEventCompat, int i10) {
        if (super.m8191e(backEventCompat) == null) {
            return;
        }
        m8216k(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i10);
    }
}
