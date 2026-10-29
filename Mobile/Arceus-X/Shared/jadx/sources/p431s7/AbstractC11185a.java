package p431s7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: s7.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11185a extends ValueAnimator {

    /* JADX INFO: renamed from: a */
    public final Set<ValueAnimator.AnimatorUpdateListener> f39455a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public final Set<Animator.AnimatorListener> f39456b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c */
    public final Set<Animator.AnimatorPauseListener> f39457c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public void mo42129a() {
        Iterator<Animator.AnimatorListener> it = this.f39456b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f39456b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f39457c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39455a.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public void m42130b(boolean z10) {
        Iterator<Animator.AnimatorListener> it = this.f39456b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z10);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m42131c() {
        Iterator<Animator.AnimatorPauseListener> it = this.f39457c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m42132e() {
        Iterator<Animator.AnimatorListener> it = this.f39456b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m42133f() {
        Iterator<Animator.AnimatorPauseListener> it = this.f39457c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX INFO: renamed from: h */
    public void m42134h(boolean z10) {
        Iterator<Animator.AnimatorListener> it = this.f39456b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z10);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m42135i() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f39455a.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f39456b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f39455a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f39456b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f39457c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39455a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setDuration(J)Landroid/animation/Animator; */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
