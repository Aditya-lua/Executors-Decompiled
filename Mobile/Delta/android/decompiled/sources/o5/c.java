package o5;

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
        public final Rect f27080a;
        public final Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f27081c;

        public a(View view, Rect rect, Rect rect2) {
            this.f27081c = view;
            this.f27080a = rect;
            this.b = rect2;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            View view = this.f27081c;
            int i10 = l.b;
            this.f27081c.setClipBounds((Rect) view.getTag(i10));
            this.f27081c.setTag(i10, null);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            Rect clipBounds = this.f27081c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = c.R;
            }
            this.f27081c.setTag(l.b, clipBounds);
            this.f27081c.setClipBounds(this.b);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                this.f27081c.setClipBounds(this.f27080a);
            } else {
                this.f27081c.setClipBounds(this.b);
            }
        }
    }

    public final void B0(d0 d0Var, boolean z10) {
        View view = d0Var.b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z10 ? (Rect) view.getTag(l.b) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != R ? clipBounds : null;
        d0Var.f27089a.put("android:clipBounds:clip", rect);
        if (rect == null) {
            d0Var.f27089a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // o5.q
    @NonNull
    public String[] V() {
        return Q;
    }

    @Override // o5.q
    public boolean Y() {
        return true;
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        B0(d0Var, false);
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        B0(d0Var, true);
    }

    @Override // o5.q
    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null || !d0Var.f27089a.containsKey("android:clipBounds:clip") || !d0Var2.f27089a.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) d0Var.f27089a.get("android:clipBounds:clip");
        Rect rect2 = (Rect) d0Var2.f27089a.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) d0Var.f27089a.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) d0Var2.f27089a.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        d0Var2.b.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(d0Var2.b, (Property<View, V>) i0.f27121c, (TypeEvaluator) new m(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        a aVar = new a(d0Var2.b, rect, rect2);
        objectAnimatorOfObject.addListener(aVar);
        c(aVar);
        return objectAnimatorOfObject;
    }
}
