package ad;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: ad.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0138j {

    /* JADX INFO: renamed from: a */
    public final ArrayList<b> f474a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public b f475b = null;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f476c = null;

    /* JADX INFO: renamed from: d */
    public final Animator.AnimatorListener f477d = new a();

    /* JADX INFO: renamed from: ad.j$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0138j c0138j = C0138j.this;
            if (c0138j.f476c == animator) {
                c0138j.f476c = null;
            }
        }
    }

    /* JADX INFO: renamed from: ad.j$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int[] f479a;

        /* JADX INFO: renamed from: b */
        public final ValueAnimator f480b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f479a = iArr;
            this.f480b = valueAnimator;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m402a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f477d);
        this.f474a.add(bVar);
    }
}
