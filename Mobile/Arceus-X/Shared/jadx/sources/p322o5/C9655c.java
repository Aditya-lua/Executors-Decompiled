package p322o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.c */
/* JADX INFO: loaded from: classes.dex */
public class C9655c extends AbstractC9683q {

    /* JADX INFO: renamed from: Q */
    public static final String[] f35027Q = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: R */
    public static final Rect f35028R = new Rect();

    /* JADX INFO: renamed from: o5.c$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final Rect f35029a;

        /* JADX INFO: renamed from: b */
        public final Rect f35030b;

        /* JADX INFO: renamed from: c */
        public final View f35031c;

        public a(View view, Rect rect, Rect rect2) {
            this.f35031c = view;
            this.f35029a = rect;
            this.f35030b = rect2;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
            View view = this.f35031c;
            int i10 = C9673l.f35095b;
            this.f35031c.setClipBounds((Rect) view.getTag(i10));
            this.f35031c.setTag(i10, null);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
            Rect clipBounds = this.f35031c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = C9655c.f35028R;
            }
            this.f35031c.setTag(C9673l.f35095b, clipBounds);
            this.f35031c.setClipBounds(this.f35030b);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                this.f35031c.setClipBounds(this.f35029a);
            } else {
                this.f35031c.setClipBounds(this.f35030b);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m38149B0(C9658d0 c9658d0, boolean z10) {
        View view = c9658d0.f35045b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z10 ? (Rect) view.getTag(C9673l.f35095b) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != f35028R ? clipBounds : null;
        c9658d0.f35044a.put("android:clipBounds:clip", rect);
        if (rect == null) {
            c9658d0.f35044a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: V */
    public String[] mo38090V() {
        return f35027Q;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: Y */
    public boolean mo38091Y() {
        return true;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: j */
    public void mo38092j(@NonNull C9658d0 c9658d0) {
        m38149B0(c9658d0, false);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: o */
    public void mo38093o(@NonNull C9658d0 c9658d0) {
        m38149B0(c9658d0, true);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: s */
    public Animator mo38094s(@NonNull ViewGroup viewGroup, C9658d0 c9658d0, C9658d0 c9658d1) {
        if (c9658d0 == null || c9658d1 == null || !c9658d0.f35044a.containsKey("android:clipBounds:clip") || !c9658d1.f35044a.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) c9658d0.f35044a.get("android:clipBounds:clip");
        Rect rect2 = (Rect) c9658d1.f35044a.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) c9658d0.f35044a.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) c9658d1.f35044a.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        c9658d1.f35045b.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c9658d1.f35045b, (Property<View, V>) C9668i0.f35088c, (TypeEvaluator) new C9675m(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        a aVar = new a(c9658d1.f35045b, rect, rect2);
        objectAnimatorOfObject.addListener(aVar);
        mo38129c(aVar);
        return objectAnimatorOfObject;
    }
}
