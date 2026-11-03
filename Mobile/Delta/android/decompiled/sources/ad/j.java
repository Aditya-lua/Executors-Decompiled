package ad;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f370a = new ArrayList<>();
    public b b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f371c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animator.AnimatorListener f372d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            if (jVar.f371c == animator) {
                jVar.f371c = null;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f374a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f374a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f372d);
        this.f370a.add(bVar);
    }
}
