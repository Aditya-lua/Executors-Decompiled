package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f3927a = new ArrayList<>();
    public b b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f3928c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animator.AnimatorListener f3929d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            if (jVar.f3928c == animator) {
                jVar.f3928c = null;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f3931a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f3931a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f3929d);
        this.f3927a.add(bVar);
    }
}
