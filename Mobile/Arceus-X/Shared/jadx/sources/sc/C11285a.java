package sc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: sc.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C11285a {

    /* JADX INFO: renamed from: sc.a$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11288d f39619a;

        public a(InterfaceC11288d interfaceC11288d) {
            this.f39619a = interfaceC11288d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f39619a.mo42365b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f39619a.mo42364a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: sc.d */
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: a */
    public static Animator m42362a(@NonNull InterfaceC11288d interfaceC11288d, float f10, float f11, float f12) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC11288d, (Property<InterfaceC11288d, V>) InterfaceC11288d.c.f39623a, (TypeEvaluator) InterfaceC11288d.b.f39621b, (Object[]) new InterfaceC11288d.e[]{new InterfaceC11288d.e(f10, f11, f12)});
        InterfaceC11288d.e revealInfo = interfaceC11288d.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC11288d, (int) f10, (int) f11, revealInfo.f39627c, f12);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static Animator.AnimatorListener m42363b(@NonNull InterfaceC11288d interfaceC11288d) {
        return new a(interfaceC11288d);
    }
}
