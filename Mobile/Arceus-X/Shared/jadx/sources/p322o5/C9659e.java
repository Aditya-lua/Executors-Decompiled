package p322o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.e */
/* JADX INFO: loaded from: classes.dex */
public class C9659e extends AbstractC9680o0 {

    /* JADX INFO: renamed from: o5.e$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final View f35047a;

        /* JADX INFO: renamed from: b */
        public boolean f35048b = false;

        public a(View view) {
            this.f35047a = view;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
            this.f35047a.setTag(C9673l.f35098e, null);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
            this.f35047a.setTag(C9673l.f35098e, Float.valueOf(this.f35047a.getVisibility() == 0 ? C9668i0.m38190b(this.f35047a) : 0.0f));
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: i */
        public void mo38170i(@NonNull AbstractC9683q abstractC9683q, boolean z10) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C9668i0.m38193e(this.f35047a, 1.0f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f35047a.hasOverlappingRendering() && this.f35047a.getLayerType() == 0) {
                this.f35048b = true;
                this.f35047a.setLayerType(2, null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (this.f35048b) {
                this.f35047a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            C9668i0.m38193e(this.f35047a, 1.0f);
            C9668i0.m38189a(this.f35047a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9659e(int i10) {
        m38234H0(i10);
    }

    /* JADX INFO: renamed from: J0 */
    public static float m38166J0(C9658d0 c9658d0, float f10) {
        Float f11;
        return (c9658d0 == null || (f11 = (Float) c9658d0.f35044a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // p322o5.AbstractC9680o0
    /* JADX INFO: renamed from: D0 */
    public Animator mo38167D0(@NonNull ViewGroup viewGroup, @NonNull View view, C9658d0 c9658d0, C9658d0 c9658d1) {
        C9668i0.m38191c(view);
        return m38169I0(view, m38166J0(c9658d0, 0.0f), 1.0f);
    }

    @Override // p322o5.AbstractC9680o0
    /* JADX INFO: renamed from: F0 */
    public Animator mo38168F0(@NonNull ViewGroup viewGroup, @NonNull View view, C9658d0 c9658d0, C9658d0 c9658d1) {
        C9668i0.m38191c(view);
        Animator animatorM38169I0 = m38169I0(view, m38166J0(c9658d0, 1.0f), 0.0f);
        if (animatorM38169I0 == null) {
            C9668i0.m38193e(view, m38166J0(c9658d1, 1.0f));
        }
        return animatorM38169I0;
    }

    /* JADX INFO: renamed from: I0 */
    public final Animator m38169I0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        C9668i0.m38193e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C9668i0.f35087b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        m38261N().mo38129c(aVar);
        return objectAnimatorOfFloat;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: Y */
    public boolean mo38091Y() {
        return true;
    }

    @Override // p322o5.AbstractC9680o0, p322o5.AbstractC9683q
    /* JADX INFO: renamed from: o */
    public void mo38093o(@NonNull C9658d0 c9658d0) {
        super.mo38093o(c9658d0);
        Float fValueOf = (Float) c9658d0.f35045b.getTag(C9673l.f35098e);
        if (fValueOf == null) {
            fValueOf = c9658d0.f35045b.getVisibility() == 0 ? Float.valueOf(C9668i0.m38190b(c9658d0.f35045b)) : Float.valueOf(0.0f);
        }
        c9658d0.f35044a.put("android:fade:transitionAlpha", fValueOf);
    }

    public C9659e() {
    }
}
