package p216jc;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: jc.i */
/* JADX INFO: loaded from: classes2.dex */
public class C7145i {

    /* JADX INFO: renamed from: a */
    public long f27799a;

    /* JADX INFO: renamed from: b */
    public long f27800b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f27801c;

    /* JADX INFO: renamed from: d */
    public int f27802d;

    /* JADX INFO: renamed from: e */
    public int f27803e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7145i(long j10, long j11) {
        this.f27801c = null;
        this.f27802d = 0;
        this.f27803e = 1;
        this.f27799a = j10;
        this.f27800b = j11;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C7145i m29940b(@NonNull ValueAnimator valueAnimator) {
        C7145i c7145i = new C7145i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m29941f(valueAnimator));
        c7145i.f27802d = valueAnimator.getRepeatCount();
        c7145i.f27803e = valueAnimator.getRepeatMode();
        return c7145i;
    }

    /* JADX INFO: renamed from: f */
    public static TimeInterpolator m29941f(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C7137a.f27785b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C7137a.f27786c;
        }
        return interpolator instanceof DecelerateInterpolator ? C7137a.f27787d : interpolator;
    }

    /* JADX INFO: renamed from: a */
    public void m29942a(@NonNull Animator animator) {
        animator.setStartDelay(m29943c());
        animator.setDuration(m29944d());
        animator.setInterpolator(m29945e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m29946g());
            valueAnimator.setRepeatMode(m29947h());
        }
    }

    /* JADX INFO: renamed from: c */
    public long m29943c() {
        return this.f27799a;
    }

    /* JADX INFO: renamed from: d */
    public long m29944d() {
        return this.f27800b;
    }

    /* JADX INFO: renamed from: e */
    public TimeInterpolator m29945e() {
        TimeInterpolator timeInterpolator = this.f27801c;
        return timeInterpolator != null ? timeInterpolator : C7137a.f27785b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7145i)) {
            return false;
        }
        C7145i c7145i = (C7145i) obj;
        if (m29943c() == c7145i.m29943c() && m29944d() == c7145i.m29944d() && m29946g() == c7145i.m29946g() && m29947h() == c7145i.m29947h()) {
            return m29945e().getClass().equals(c7145i.m29945e().getClass());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public int m29946g() {
        return this.f27802d;
    }

    /* JADX INFO: renamed from: h */
    public int m29947h() {
        return this.f27803e;
    }

    public int hashCode() {
        return (((((((((int) (m29943c() ^ (m29943c() >>> 32))) * 31) + ((int) (m29944d() ^ (m29944d() >>> 32)))) * 31) + m29945e().getClass().hashCode()) * 31) + m29946g()) * 31) + m29947h();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m29943c() + " duration: " + m29944d() + " interpolator: " + m29945e().getClass() + " repeatCount: " + m29946g() + " repeatMode: " + m29947h() + "}\n";
    }

    public C7145i(long j10, long j11, @NonNull TimeInterpolator timeInterpolator) {
        this.f27802d = 0;
        this.f27803e = 1;
        this.f27799a = j10;
        this.f27800b = j11;
        this.f27801c = timeInterpolator;
    }
}
