package p5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class c extends q {
    public static final String[] Q = {"android:clipBounds:clip"};
    public static final Rect R = new Rect();

    public static class a extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f28816a;
        public final Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f28817c;

        public a(View view, Rect rect, Rect rect2) {
            this.f28817c = view;
            this.f28816a = rect;
            this.b = rect2;
        }

        @Override // p5.q.h
        public void b(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void c(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void f(@NonNull q qVar) {
            Rect clipBounds = this.f28817c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = c.R;
            }
            this.f28817c.setTag(l.b, clipBounds);
            this.f28817c.setClipBounds(this.b);
        }

        @Override // p5.q.h
        public void h(@NonNull q qVar) {
            this.f28817c.setClipBounds((Rect) this.f28817c.getTag(l.b));
            this.f28817c.setTag(l.b, null);
        }

        @Override // p5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                this.f28817c.setClipBounds(this.f28816a);
            } else {
                this.f28817c.setClipBounds(this.b);
            }
        }
    }

    public final void F0(d0 d0Var, boolean z10) {
        View view = d0Var.b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z10 ? (Rect) view.getTag(l.b) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != R ? clipBounds : null;
        d0Var.f28825a.put("android:clipBounds:clip", rect);
        if (rect == null) {
            d0Var.f28825a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // p5.q
    @NonNull
    public String[] Y() {
        return Q;
    }

    @Override // p5.q
    public boolean c0() {
        return true;
    }

    @Override // p5.q
    public void l(@NonNull d0 d0Var) {
        F0(d0Var, false);
    }

    @Override // p5.q
    public void q(@NonNull d0 d0Var) {
        F0(d0Var, true);
    }

    @Override // p5.q
    public Animator u(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null || !d0Var.f28825a.containsKey("android:clipBounds:clip") || !d0Var2.f28825a.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) d0Var.f28825a.get("android:clipBounds:clip");
        Rect rect2 = (Rect) d0Var2.f28825a.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) d0Var.f28825a.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) d0Var2.f28825a.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        d0Var2.b.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(d0Var2.b, (Property<View, V>) i0.f28857c, (TypeEvaluator) new m(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        a aVar = new a(d0Var2.b, rect, rect2);
        objectAnimatorOfObject.addListener(aVar);
        c(aVar);
        return objectAnimatorOfObject;
    }
}
