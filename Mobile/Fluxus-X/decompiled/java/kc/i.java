package kc;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21336a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f21337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21339e;

    public i(long j10, long j11) {
        this.f21337c = null;
        this.f21338d = 0;
        this.f21339e = 1;
        this.f21336a = j10;
        this.b = j11;
    }

    @NonNull
    public static i b(@NonNull ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f21338d = valueAnimator.getRepeatCount();
        iVar.f21339e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public static TimeInterpolator f(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f21326c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f21327d : interpolator;
    }

    public void a(@NonNull Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f21336a;
    }

    public long d() {
        return this.b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f21337c;
        return timeInterpolator != null ? timeInterpolator : a.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f21338d;
    }

    public int h() {
        return this.f21339e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j10, long j11, @NonNull TimeInterpolator timeInterpolator) {
        this.f21338d = 0;
        this.f21339e = 1;
        this.f21336a = j10;
        this.b = j11;
        this.f21337c = timeInterpolator;
    }
}
